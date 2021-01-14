import com.example.grpc.Number;
import com.example.grpc.NumberServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.Arrays;

public class SDNumberClient {
    public static void main(String[] args) throws IOException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new NumberService())
                .build();

        server.start();

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();
        NumberServiceGrpc.NumberServiceStub numberClient = NumberServiceGrpc.newStub(channel);

        StreamObserver<Number.SDNumberRequest> requestStreamObserver = numberClient.getSDNumber(new StreamObserver<Number.SDNumberResponse>() {
            @Override
            public void onNext(Number.SDNumberResponse sdNumberResponse) {
                double result = sdNumberResponse.getResult();
                System.out.println(result);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        });

        Arrays.asList(5.0, 3.0, 8.0).forEach(number -> {
            requestStreamObserver.onNext(Number.SDNumberRequest.newBuilder()
                    .setNum(number)
                    .build());
        });

        requestStreamObserver.onCompleted();
    }
}

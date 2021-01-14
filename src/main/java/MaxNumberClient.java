import com.example.grpc.Number;
import com.example.grpc.NumberServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.Arrays;

public class MaxNumberClient {
    public static void main(String[] args) throws IOException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new NumberService())
                .build();

        server.start();

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        NumberServiceGrpc.NumberServiceStub numberClient = NumberServiceGrpc.newStub(channel);

        StreamObserver<Number.MaxNumberRequest> streamObserver = numberClient.getMaxNumber(new StreamObserver<Number.MaxNumberResponse>() {
            @Override
            public void onNext(Number.MaxNumberResponse maxNumberResponse) {
                int result = maxNumberResponse.getResult();
                System.out.println(result);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        });

        Arrays.asList(56, 36, 83, 33).forEach(number -> {
            streamObserver.onNext(Number.MaxNumberRequest.newBuilder()
            .setNum(number)
                    .build());
        });

        streamObserver.onCompleted();
    }
}

import com.example.grpc.Number;
import com.example.grpc.NumberServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class SetOfNumbersClient {
    public static void main(String[] args) throws IOException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new NumberService())
                .build();

        server.start();

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        NumberServiceGrpc.NumberServiceBlockingStub numberClient = NumberServiceGrpc.newBlockingStub(channel);

        Number.SetOfNumbersRequest setOfNumbersRequest = Number.SetOfNumbersRequest.newBuilder()
                .setNum(132)
                .build();

        numberClient.setOfNumbers(setOfNumbersRequest).forEachRemaining(setOfNumbersResponse -> {
            System.out.println(setOfNumbersResponse.getResult());
        });
    }
}

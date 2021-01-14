import com.example.grpc.Number;
import com.example.grpc.NumberServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class NumberService extends NumberServiceGrpc.NumberServiceImplBase {
    @Override
    public void getNumber(Number.NumberRequest request, StreamObserver<Number.NumberResponse> responseObserver) {
        int num = request.getNum();
        double result = Math.sqrt(num);

        Number.NumberResponse response = Number.NumberResponse.newBuilder()
                .setResult(result)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setOfNumbers(Number.SetOfNumbersRequest request, StreamObserver<Number.SetOfNumbersResponse> responseObserver) {
        int num = request.getNum();

        for (int i = 2; i <= num; i++) {
            for (int j = 2; j <= i; j++) {
                if (num % j == 0) {
                    Number.SetOfNumbersResponse response = Number.SetOfNumbersResponse.newBuilder()
                            .setResult(j)
                            .build();
                    responseObserver.onNext(response);
                    num = num / j;
                }
            }
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Number.SDNumberRequest> getSDNumber(StreamObserver<Number.SDNumberResponse> responseObserver) {
        return new StreamObserver<Number.SDNumberRequest>() {
            List<Double> numbers = new ArrayList<>();
            double sum;
            double average;
            double standardDeviation;

            @Override
            public void onNext(Number.SDNumberRequest sdNumberRequest) {
                numbers.add(sdNumberRequest.getNum());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                for (double number: numbers) {
                    sum = sum + number;
                }

                average = sum / numbers.size();

                sum = 0;

                for (double number: numbers) {
                    sum += Math.pow((number - average), 2);
                }

                average = sum / (numbers.size() - 1);
                standardDeviation = Math.sqrt(average);

                responseObserver.onNext(Number.SDNumberResponse.newBuilder().setResult(standardDeviation).build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<Number.MaxNumberRequest> getMaxNumber(StreamObserver<Number.MaxNumberResponse> responseObserver) {
        return new StreamObserver<Number.MaxNumberRequest>() {
            int number = 0;
            @Override
            public void onNext(Number.MaxNumberRequest maxNumberRequest) {
                int result = maxNumberRequest.getNum();
                if (result > number) {
                    number = result;

                    Number.MaxNumberResponse maxNumberResponse = Number.MaxNumberResponse.newBuilder()
                            .setResult(result)
                            .build();
                    responseObserver.onNext(maxNumberResponse);
                }
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}

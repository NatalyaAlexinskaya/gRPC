package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.0)",
    comments = "Source: number.proto")
public final class NumberServiceGrpc {

  private NumberServiceGrpc() {}

  public static final String SERVICE_NAME = "NumberService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Number.NumberRequest,
      com.example.grpc.Number.NumberResponse> getGetNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNumber",
      requestType = com.example.grpc.Number.NumberRequest.class,
      responseType = com.example.grpc.Number.NumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Number.NumberRequest,
      com.example.grpc.Number.NumberResponse> getGetNumberMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Number.NumberRequest, com.example.grpc.Number.NumberResponse> getGetNumberMethod;
    if ((getGetNumberMethod = NumberServiceGrpc.getGetNumberMethod) == null) {
      synchronized (NumberServiceGrpc.class) {
        if ((getGetNumberMethod = NumberServiceGrpc.getGetNumberMethod) == null) {
          NumberServiceGrpc.getGetNumberMethod = getGetNumberMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Number.NumberRequest, com.example.grpc.Number.NumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Number.NumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Number.NumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NumberServiceMethodDescriptorSupplier("GetNumber"))
              .build();
        }
      }
    }
    return getGetNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Number.SetOfNumbersRequest,
      com.example.grpc.Number.SetOfNumbersResponse> getSetOfNumbersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetOfNumbers",
      requestType = com.example.grpc.Number.SetOfNumbersRequest.class,
      responseType = com.example.grpc.Number.SetOfNumbersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.Number.SetOfNumbersRequest,
      com.example.grpc.Number.SetOfNumbersResponse> getSetOfNumbersMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Number.SetOfNumbersRequest, com.example.grpc.Number.SetOfNumbersResponse> getSetOfNumbersMethod;
    if ((getSetOfNumbersMethod = NumberServiceGrpc.getSetOfNumbersMethod) == null) {
      synchronized (NumberServiceGrpc.class) {
        if ((getSetOfNumbersMethod = NumberServiceGrpc.getSetOfNumbersMethod) == null) {
          NumberServiceGrpc.getSetOfNumbersMethod = getSetOfNumbersMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Number.SetOfNumbersRequest, com.example.grpc.Number.SetOfNumbersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetOfNumbers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Number.SetOfNumbersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Number.SetOfNumbersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NumberServiceMethodDescriptorSupplier("SetOfNumbers"))
              .build();
        }
      }
    }
    return getSetOfNumbersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Number.SDNumberRequest,
      com.example.grpc.Number.SDNumberResponse> getGetSDNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSDNumber",
      requestType = com.example.grpc.Number.SDNumberRequest.class,
      responseType = com.example.grpc.Number.SDNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.Number.SDNumberRequest,
      com.example.grpc.Number.SDNumberResponse> getGetSDNumberMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Number.SDNumberRequest, com.example.grpc.Number.SDNumberResponse> getGetSDNumberMethod;
    if ((getGetSDNumberMethod = NumberServiceGrpc.getGetSDNumberMethod) == null) {
      synchronized (NumberServiceGrpc.class) {
        if ((getGetSDNumberMethod = NumberServiceGrpc.getGetSDNumberMethod) == null) {
          NumberServiceGrpc.getGetSDNumberMethod = getGetSDNumberMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Number.SDNumberRequest, com.example.grpc.Number.SDNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSDNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Number.SDNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Number.SDNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NumberServiceMethodDescriptorSupplier("GetSDNumber"))
              .build();
        }
      }
    }
    return getGetSDNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Number.MaxNumberRequest,
      com.example.grpc.Number.MaxNumberResponse> getGetMaxNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMaxNumber",
      requestType = com.example.grpc.Number.MaxNumberRequest.class,
      responseType = com.example.grpc.Number.MaxNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.Number.MaxNumberRequest,
      com.example.grpc.Number.MaxNumberResponse> getGetMaxNumberMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Number.MaxNumberRequest, com.example.grpc.Number.MaxNumberResponse> getGetMaxNumberMethod;
    if ((getGetMaxNumberMethod = NumberServiceGrpc.getGetMaxNumberMethod) == null) {
      synchronized (NumberServiceGrpc.class) {
        if ((getGetMaxNumberMethod = NumberServiceGrpc.getGetMaxNumberMethod) == null) {
          NumberServiceGrpc.getGetMaxNumberMethod = getGetMaxNumberMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.Number.MaxNumberRequest, com.example.grpc.Number.MaxNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMaxNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Number.MaxNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Number.MaxNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NumberServiceMethodDescriptorSupplier("GetMaxNumber"))
              .build();
        }
      }
    }
    return getGetMaxNumberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NumberServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NumberServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NumberServiceStub>() {
        @java.lang.Override
        public NumberServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NumberServiceStub(channel, callOptions);
        }
      };
    return NumberServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NumberServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NumberServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NumberServiceBlockingStub>() {
        @java.lang.Override
        public NumberServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NumberServiceBlockingStub(channel, callOptions);
        }
      };
    return NumberServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NumberServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NumberServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NumberServiceFutureStub>() {
        @java.lang.Override
        public NumberServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NumberServiceFutureStub(channel, callOptions);
        }
      };
    return NumberServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class NumberServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getNumber(com.example.grpc.Number.NumberRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.Number.NumberResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNumberMethod(), responseObserver);
    }

    /**
     */
    public void setOfNumbers(com.example.grpc.Number.SetOfNumbersRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.Number.SetOfNumbersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetOfNumbersMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.Number.SDNumberRequest> getSDNumber(
        io.grpc.stub.StreamObserver<com.example.grpc.Number.SDNumberResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetSDNumberMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.Number.MaxNumberRequest> getMaxNumber(
        io.grpc.stub.StreamObserver<com.example.grpc.Number.MaxNumberResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetMaxNumberMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.Number.NumberRequest,
                com.example.grpc.Number.NumberResponse>(
                  this, METHODID_GET_NUMBER)))
          .addMethod(
            getSetOfNumbersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.example.grpc.Number.SetOfNumbersRequest,
                com.example.grpc.Number.SetOfNumbersResponse>(
                  this, METHODID_SET_OF_NUMBERS)))
          .addMethod(
            getGetSDNumberMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.example.grpc.Number.SDNumberRequest,
                com.example.grpc.Number.SDNumberResponse>(
                  this, METHODID_GET_SDNUMBER)))
          .addMethod(
            getGetMaxNumberMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.example.grpc.Number.MaxNumberRequest,
                com.example.grpc.Number.MaxNumberResponse>(
                  this, METHODID_GET_MAX_NUMBER)))
          .build();
    }
  }

  /**
   */
  public static final class NumberServiceStub extends io.grpc.stub.AbstractAsyncStub<NumberServiceStub> {
    private NumberServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumberServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NumberServiceStub(channel, callOptions);
    }

    /**
     */
    public void getNumber(com.example.grpc.Number.NumberRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.Number.NumberResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setOfNumbers(com.example.grpc.Number.SetOfNumbersRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.Number.SetOfNumbersResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSetOfNumbersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.Number.SDNumberRequest> getSDNumber(
        io.grpc.stub.StreamObserver<com.example.grpc.Number.SDNumberResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetSDNumberMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.Number.MaxNumberRequest> getMaxNumber(
        io.grpc.stub.StreamObserver<com.example.grpc.Number.MaxNumberResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetMaxNumberMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class NumberServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NumberServiceBlockingStub> {
    private NumberServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumberServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NumberServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.Number.NumberResponse getNumber(com.example.grpc.Number.NumberRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.grpc.Number.SetOfNumbersResponse> setOfNumbers(
        com.example.grpc.Number.SetOfNumbersRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSetOfNumbersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NumberServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NumberServiceFutureStub> {
    private NumberServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumberServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NumberServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Number.NumberResponse> getNumber(
        com.example.grpc.Number.NumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNumberMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NUMBER = 0;
  private static final int METHODID_SET_OF_NUMBERS = 1;
  private static final int METHODID_GET_SDNUMBER = 2;
  private static final int METHODID_GET_MAX_NUMBER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NumberServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NumberServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NUMBER:
          serviceImpl.getNumber((com.example.grpc.Number.NumberRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Number.NumberResponse>) responseObserver);
          break;
        case METHODID_SET_OF_NUMBERS:
          serviceImpl.setOfNumbers((com.example.grpc.Number.SetOfNumbersRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Number.SetOfNumbersResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SDNUMBER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getSDNumber(
              (io.grpc.stub.StreamObserver<com.example.grpc.Number.SDNumberResponse>) responseObserver);
        case METHODID_GET_MAX_NUMBER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getMaxNumber(
              (io.grpc.stub.StreamObserver<com.example.grpc.Number.MaxNumberResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NumberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NumberServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.Number.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NumberService");
    }
  }

  private static final class NumberServiceFileDescriptorSupplier
      extends NumberServiceBaseDescriptorSupplier {
    NumberServiceFileDescriptorSupplier() {}
  }

  private static final class NumberServiceMethodDescriptorSupplier
      extends NumberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NumberServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NumberServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NumberServiceFileDescriptorSupplier())
              .addMethod(getGetNumberMethod())
              .addMethod(getSetOfNumbersMethod())
              .addMethod(getGetSDNumberMethod())
              .addMethod(getGetMaxNumberMethod())
              .build();
        }
      }
    }
    return result;
  }
}

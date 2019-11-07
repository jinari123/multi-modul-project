package com.temp.rpc.service;

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
    value = "by gRPC proto compiler (version 1.24.1)",
    comments = "Source: service/promotionService.proto")
public final class PromotionRouteGrpc {

  private PromotionRouteGrpc() {}

  public static final String SERVICE_NAME = "proto.service.PromotionRoute";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.temp.rpc.form.IdxFormOuterClass.IdxForm,
      com.temp.rpc.entity.PromotionEntity.Promotion> getGetPromotionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPromotion",
      requestType = com.temp.rpc.form.IdxFormOuterClass.IdxForm.class,
      responseType = com.temp.rpc.entity.PromotionEntity.Promotion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.temp.rpc.form.IdxFormOuterClass.IdxForm,
      com.temp.rpc.entity.PromotionEntity.Promotion> getGetPromotionMethod() {
    io.grpc.MethodDescriptor<com.temp.rpc.form.IdxFormOuterClass.IdxForm, com.temp.rpc.entity.PromotionEntity.Promotion> getGetPromotionMethod;
    if ((getGetPromotionMethod = PromotionRouteGrpc.getGetPromotionMethod) == null) {
      synchronized (PromotionRouteGrpc.class) {
        if ((getGetPromotionMethod = PromotionRouteGrpc.getGetPromotionMethod) == null) {
          PromotionRouteGrpc.getGetPromotionMethod = getGetPromotionMethod =
              io.grpc.MethodDescriptor.<com.temp.rpc.form.IdxFormOuterClass.IdxForm, com.temp.rpc.entity.PromotionEntity.Promotion>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPromotion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.temp.rpc.form.IdxFormOuterClass.IdxForm.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.temp.rpc.entity.PromotionEntity.Promotion.getDefaultInstance()))
              .setSchemaDescriptor(new PromotionRouteMethodDescriptorSupplier("getPromotion"))
              .build();
        }
      }
    }
    return getGetPromotionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.temp.rpc.form.IdxFormOuterClass.IdxForm,
      com.temp.rpc.entity.PromotionEntity.Promotion> getGetPromotionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPromotions",
      requestType = com.temp.rpc.form.IdxFormOuterClass.IdxForm.class,
      responseType = com.temp.rpc.entity.PromotionEntity.Promotion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.temp.rpc.form.IdxFormOuterClass.IdxForm,
      com.temp.rpc.entity.PromotionEntity.Promotion> getGetPromotionsMethod() {
    io.grpc.MethodDescriptor<com.temp.rpc.form.IdxFormOuterClass.IdxForm, com.temp.rpc.entity.PromotionEntity.Promotion> getGetPromotionsMethod;
    if ((getGetPromotionsMethod = PromotionRouteGrpc.getGetPromotionsMethod) == null) {
      synchronized (PromotionRouteGrpc.class) {
        if ((getGetPromotionsMethod = PromotionRouteGrpc.getGetPromotionsMethod) == null) {
          PromotionRouteGrpc.getGetPromotionsMethod = getGetPromotionsMethod =
              io.grpc.MethodDescriptor.<com.temp.rpc.form.IdxFormOuterClass.IdxForm, com.temp.rpc.entity.PromotionEntity.Promotion>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPromotions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.temp.rpc.form.IdxFormOuterClass.IdxForm.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.temp.rpc.entity.PromotionEntity.Promotion.getDefaultInstance()))
              .setSchemaDescriptor(new PromotionRouteMethodDescriptorSupplier("getPromotions"))
              .build();
        }
      }
    }
    return getGetPromotionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PromotionRouteStub newStub(io.grpc.Channel channel) {
    return new PromotionRouteStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PromotionRouteBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PromotionRouteBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PromotionRouteFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PromotionRouteFutureStub(channel);
  }

  /**
   */
  public static abstract class PromotionRouteImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPromotion(com.temp.rpc.form.IdxFormOuterClass.IdxForm request,
        io.grpc.stub.StreamObserver<com.temp.rpc.entity.PromotionEntity.Promotion> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPromotionMethod(), responseObserver);
    }

    /**
     */
    public void getPromotions(com.temp.rpc.form.IdxFormOuterClass.IdxForm request,
        io.grpc.stub.StreamObserver<com.temp.rpc.entity.PromotionEntity.Promotion> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPromotionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPromotionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.temp.rpc.form.IdxFormOuterClass.IdxForm,
                com.temp.rpc.entity.PromotionEntity.Promotion>(
                  this, METHODID_GET_PROMOTION)))
          .addMethod(
            getGetPromotionsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.temp.rpc.form.IdxFormOuterClass.IdxForm,
                com.temp.rpc.entity.PromotionEntity.Promotion>(
                  this, METHODID_GET_PROMOTIONS)))
          .build();
    }
  }

  /**
   */
  public static final class PromotionRouteStub extends io.grpc.stub.AbstractStub<PromotionRouteStub> {
    private PromotionRouteStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PromotionRouteStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PromotionRouteStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PromotionRouteStub(channel, callOptions);
    }

    /**
     */
    public void getPromotion(com.temp.rpc.form.IdxFormOuterClass.IdxForm request,
        io.grpc.stub.StreamObserver<com.temp.rpc.entity.PromotionEntity.Promotion> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPromotionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPromotions(com.temp.rpc.form.IdxFormOuterClass.IdxForm request,
        io.grpc.stub.StreamObserver<com.temp.rpc.entity.PromotionEntity.Promotion> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetPromotionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PromotionRouteBlockingStub extends io.grpc.stub.AbstractStub<PromotionRouteBlockingStub> {
    private PromotionRouteBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PromotionRouteBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PromotionRouteBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PromotionRouteBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.temp.rpc.entity.PromotionEntity.Promotion getPromotion(com.temp.rpc.form.IdxFormOuterClass.IdxForm request) {
      return blockingUnaryCall(
          getChannel(), getGetPromotionMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.temp.rpc.entity.PromotionEntity.Promotion> getPromotions(
        com.temp.rpc.form.IdxFormOuterClass.IdxForm request) {
      return blockingServerStreamingCall(
          getChannel(), getGetPromotionsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PromotionRouteFutureStub extends io.grpc.stub.AbstractStub<PromotionRouteFutureStub> {
    private PromotionRouteFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PromotionRouteFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PromotionRouteFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PromotionRouteFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.temp.rpc.entity.PromotionEntity.Promotion> getPromotion(
        com.temp.rpc.form.IdxFormOuterClass.IdxForm request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPromotionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROMOTION = 0;
  private static final int METHODID_GET_PROMOTIONS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PromotionRouteImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PromotionRouteImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROMOTION:
          serviceImpl.getPromotion((com.temp.rpc.form.IdxFormOuterClass.IdxForm) request,
              (io.grpc.stub.StreamObserver<com.temp.rpc.entity.PromotionEntity.Promotion>) responseObserver);
          break;
        case METHODID_GET_PROMOTIONS:
          serviceImpl.getPromotions((com.temp.rpc.form.IdxFormOuterClass.IdxForm) request,
              (io.grpc.stub.StreamObserver<com.temp.rpc.entity.PromotionEntity.Promotion>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PromotionRouteBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PromotionRouteBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.temp.rpc.service.PromotionService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PromotionRoute");
    }
  }

  private static final class PromotionRouteFileDescriptorSupplier
      extends PromotionRouteBaseDescriptorSupplier {
    PromotionRouteFileDescriptorSupplier() {}
  }

  private static final class PromotionRouteMethodDescriptorSupplier
      extends PromotionRouteBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PromotionRouteMethodDescriptorSupplier(String methodName) {
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
      synchronized (PromotionRouteGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PromotionRouteFileDescriptorSupplier())
              .addMethod(getGetPromotionMethod())
              .addMethod(getGetPromotionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service/promotionService.proto

package com.temp.rpc.service;

public final class PromotionService {
  private PromotionService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036service/promotionService.proto\022\rproto." +
      "service\032\026entity/promotion.proto\032\022form/id" +
      "xForm.proto2\223\001\n\016PromotionRoute\022>\n\014getPro" +
      "motion\022\023.proto.form.IdxForm\032\027.proto.enti" +
      "ty.Promotion\"\000\022A\n\rgetPromotions\022\023.proto." +
      "form.IdxForm\032\027.proto.entity.Promotion\"\0000" +
      "\001B\026\n\024com.temp.rpc.serviceb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.temp.rpc.entity.PromotionEntity.getDescriptor(),
          com.temp.rpc.form.IdxFormOuterClass.getDescriptor(),
        });
    com.temp.rpc.entity.PromotionEntity.getDescriptor();
    com.temp.rpc.form.IdxFormOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

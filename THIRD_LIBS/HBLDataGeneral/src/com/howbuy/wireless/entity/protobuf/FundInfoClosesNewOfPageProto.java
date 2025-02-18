// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fundInfoClosesNewOfPage.proto

package com.howbuy.wireless.entity.protobuf;

public final class FundInfoClosesNewOfPageProto {
  private FundInfoClosesNewOfPageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class FundInfoClosesNewOfPage extends
      com.google.protobuf.GeneratedMessage {
    // Use FundInfoClosesNewOfPage.newBuilder() to construct.
    private FundInfoClosesNewOfPage() {
      initFields();
    }
    private FundInfoClosesNewOfPage(boolean noInit) {}
    
    private static final FundInfoClosesNewOfPage defaultInstance;
    public static FundInfoClosesNewOfPage getDefaultInstance() {
      return defaultInstance;
    }
    
    public FundInfoClosesNewOfPage getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.internal_static_FundInfoClosesNewOfPage_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.internal_static_FundInfoClosesNewOfPage_fieldAccessorTable;
    }
    
    // optional .common.Common common = 1;
    public static final int COMMON_FIELD_NUMBER = 1;
    private boolean hasCommon;
    private com.howbuy.wireless.entity.protobuf.CommonProtos.Common common_;
    public boolean hasCommon() { return hasCommon; }
    public com.howbuy.wireless.entity.protobuf.CommonProtos.Common getCommon() { return common_; }
    
    // repeated .ClosesNewOfPage closesNewOfPage = 2;
    public static final int CLOSESNEWOFPAGE_FIELD_NUMBER = 2;
    private java.util.List<com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.ClosesNewOfPage> closesNewOfPage_ =
      java.util.Collections.emptyList();
    public java.util.List<com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.ClosesNewOfPage> getClosesNewOfPageList() {
      return closesNewOfPage_;
    }
    public int getClosesNewOfPageCount() { return closesNewOfPage_.size(); }
    public com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.ClosesNewOfPage getClosesNewOfPage(int index) {
      return closesNewOfPage_.get(index);
    }
    
    // optional int32 sumPage = 3;
    public static final int SUMPAGE_FIELD_NUMBER = 3;
    private boolean hasSumPage;
    private int sumPage_ = 0;
    public boolean hasSumPage() { return hasSumPage; }
    public int getSumPage() { return sumPage_; }
    
    private void initFields() {
      common_ = com.howbuy.wireless.entity.protobuf.CommonProtos.Common.getDefaultInstance();
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasCommon()) {
        output.writeMessage(1, getCommon());
      }
      for (com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.ClosesNewOfPage element : getClosesNewOfPageList()) {
        output.writeMessage(2, element);
      }
      if (hasSumPage()) {
        output.writeInt32(3, getSumPage());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasCommon()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getCommon());
      }
      for (com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.ClosesNewOfPage element : getClosesNewOfPageList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, element);
      }
      if (hasSumPage()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, getSumPage());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage result;
      
      // Construct using com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage();
        return builder;
      }
      
      protected com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage.getDescriptor();
      }
      
      public com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage getDefaultInstanceForType() {
        return com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.closesNewOfPage_ != java.util.Collections.EMPTY_LIST) {
          result.closesNewOfPage_ =
            java.util.Collections.unmodifiableList(result.closesNewOfPage_);
        }
        com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage) {
          return mergeFrom((com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage other) {
        if (other == com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage.getDefaultInstance()) return this;
        if (other.hasCommon()) {
          mergeCommon(other.getCommon());
        }
        if (!other.closesNewOfPage_.isEmpty()) {
          if (result.closesNewOfPage_.isEmpty()) {
            result.closesNewOfPage_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.ClosesNewOfPage>();
          }
          result.closesNewOfPage_.addAll(other.closesNewOfPage_);
        }
        if (other.hasSumPage()) {
          setSumPage(other.getSumPage());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              com.howbuy.wireless.entity.protobuf.CommonProtos.Common.Builder subBuilder = com.howbuy.wireless.entity.protobuf.CommonProtos.Common.newBuilder();
              if (hasCommon()) {
                subBuilder.mergeFrom(getCommon());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setCommon(subBuilder.buildPartial());
              break;
            }
            case 18: {
              com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.ClosesNewOfPage.Builder subBuilder = com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.ClosesNewOfPage.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addClosesNewOfPage(subBuilder.buildPartial());
              break;
            }
            case 24: {
              setSumPage(input.readInt32());
              break;
            }
          }
        }
      }
      
      
      // optional .common.Common common = 1;
      public boolean hasCommon() {
        return result.hasCommon();
      }
      public com.howbuy.wireless.entity.protobuf.CommonProtos.Common getCommon() {
        return result.getCommon();
      }
      public Builder setCommon(com.howbuy.wireless.entity.protobuf.CommonProtos.Common value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasCommon = true;
        result.common_ = value;
        return this;
      }
      public Builder setCommon(com.howbuy.wireless.entity.protobuf.CommonProtos.Common.Builder builderForValue) {
        result.hasCommon = true;
        result.common_ = builderForValue.build();
        return this;
      }
      public Builder mergeCommon(com.howbuy.wireless.entity.protobuf.CommonProtos.Common value) {
        if (result.hasCommon() &&
            result.common_ != com.howbuy.wireless.entity.protobuf.CommonProtos.Common.getDefaultInstance()) {
          result.common_ =
            com.howbuy.wireless.entity.protobuf.CommonProtos.Common.newBuilder(result.common_).mergeFrom(value).buildPartial();
        } else {
          result.common_ = value;
        }
        result.hasCommon = true;
        return this;
      }
      public Builder clearCommon() {
        result.hasCommon = false;
        result.common_ = com.howbuy.wireless.entity.protobuf.CommonProtos.Common.getDefaultInstance();
        return this;
      }
      
      // repeated .ClosesNewOfPage closesNewOfPage = 2;
      public java.util.List<com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.ClosesNewOfPage> getClosesNewOfPageList() {
        return java.util.Collections.unmodifiableList(result.closesNewOfPage_);
      }
      public int getClosesNewOfPageCount() {
        return result.getClosesNewOfPageCount();
      }
      public com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.ClosesNewOfPage getClosesNewOfPage(int index) {
        return result.getClosesNewOfPage(index);
      }
      public Builder setClosesNewOfPage(int index, com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.ClosesNewOfPage value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.closesNewOfPage_.set(index, value);
        return this;
      }
      public Builder setClosesNewOfPage(int index, com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.ClosesNewOfPage.Builder builderForValue) {
        result.closesNewOfPage_.set(index, builderForValue.build());
        return this;
      }
      public Builder addClosesNewOfPage(com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.ClosesNewOfPage value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.closesNewOfPage_.isEmpty()) {
          result.closesNewOfPage_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.ClosesNewOfPage>();
        }
        result.closesNewOfPage_.add(value);
        return this;
      }
      public Builder addClosesNewOfPage(com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.ClosesNewOfPage.Builder builderForValue) {
        if (result.closesNewOfPage_.isEmpty()) {
          result.closesNewOfPage_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.ClosesNewOfPage>();
        }
        result.closesNewOfPage_.add(builderForValue.build());
        return this;
      }
      public Builder addAllClosesNewOfPage(
          java.lang.Iterable<? extends com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.ClosesNewOfPage> values) {
        if (result.closesNewOfPage_.isEmpty()) {
          result.closesNewOfPage_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.ClosesNewOfPage>();
        }
        super.addAll(values, result.closesNewOfPage_);
        return this;
      }
      public Builder clearClosesNewOfPage() {
        result.closesNewOfPage_ = java.util.Collections.emptyList();
        return this;
      }
      
      // optional int32 sumPage = 3;
      public boolean hasSumPage() {
        return result.hasSumPage();
      }
      public int getSumPage() {
        return result.getSumPage();
      }
      public Builder setSumPage(int value) {
        result.hasSumPage = true;
        result.sumPage_ = value;
        return this;
      }
      public Builder clearSumPage() {
        result.hasSumPage = false;
        result.sumPage_ = 0;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:FundInfoClosesNewOfPage)
    }
    
    static {
      defaultInstance = new FundInfoClosesNewOfPage(true);
      com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:FundInfoClosesNewOfPage)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_FundInfoClosesNewOfPage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_FundInfoClosesNewOfPage_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035fundInfoClosesNewOfPage.proto\032\025closesN" +
      "ewOfPage.proto\032\014common.proto\"u\n\027FundInfo" +
      "ClosesNewOfPage\022\036\n\006common\030\001 \001(\0132\016.common" +
      ".Common\022)\n\017closesNewOfPage\030\002 \003(\0132\020.Close" +
      "sNewOfPage\022\017\n\007sumPage\030\003 \001(\005BC\n#com.howbu" +
      "y.wireless.entity.protobufB\034FundInfoClos" +
      "esNewOfPageProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_FundInfoClosesNewOfPage_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_FundInfoClosesNewOfPage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_FundInfoClosesNewOfPage_descriptor,
              new java.lang.String[] { "Common", "ClosesNewOfPage", "SumPage", },
              com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage.class,
              com.howbuy.wireless.entity.protobuf.FundInfoClosesNewOfPageProto.FundInfoClosesNewOfPage.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.howbuy.wireless.entity.protobuf.ClosesNewOfPageProtos.getDescriptor(),
          com.howbuy.wireless.entity.protobuf.CommonProtos.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}

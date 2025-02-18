// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fundManagerInfo.proto

package com.howbuy.wireless.entity.protobuf;

public final class FundManagerInfoProtos {
  private FundManagerInfoProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class FundManagerInfo extends
      com.google.protobuf.GeneratedMessage {
    // Use FundManagerInfo.newBuilder() to construct.
    private FundManagerInfo() {
      initFields();
    }
    private FundManagerInfo(boolean noInit) {}
    
    private static final FundManagerInfo defaultInstance;
    public static FundManagerInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public FundManagerInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.internal_static_FundManagerInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.internal_static_FundManagerInfo_fieldAccessorTable;
    }
    
    // optional string rydm = 1;
    public static final int RYDM_FIELD_NUMBER = 1;
    private boolean hasRydm;
    private java.lang.String rydm_ = "";
    public boolean hasRydm() { return hasRydm; }
    public java.lang.String getRydm() { return rydm_; }
    
    // optional string xmpy = 2;
    public static final int XMPY_FIELD_NUMBER = 2;
    private boolean hasXmpy;
    private java.lang.String xmpy_ = "";
    public boolean hasXmpy() { return hasXmpy; }
    public java.lang.String getXmpy() { return xmpy_; }
    
    // optional string status = 3;
    public static final int STATUS_FIELD_NUMBER = 3;
    private boolean hasStatus;
    private java.lang.String status_ = "";
    public boolean hasStatus() { return hasStatus; }
    public java.lang.String getStatus() { return status_; }
    
    // optional string ryxm = 4;
    public static final int RYXM_FIELD_NUMBER = 4;
    private boolean hasRyxm;
    private java.lang.String ryxm_ = "";
    public boolean hasRyxm() { return hasRyxm; }
    public java.lang.String getRyxm() { return ryxm_; }
    
    // optional string type = 5;
    public static final int TYPE_FIELD_NUMBER = 5;
    private boolean hasType;
    private java.lang.String type_ = "";
    public boolean hasType() { return hasType; }
    public java.lang.String getType() { return type_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasRydm()) {
        output.writeString(1, getRydm());
      }
      if (hasXmpy()) {
        output.writeString(2, getXmpy());
      }
      if (hasStatus()) {
        output.writeString(3, getStatus());
      }
      if (hasRyxm()) {
        output.writeString(4, getRyxm());
      }
      if (hasType()) {
        output.writeString(5, getType());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasRydm()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getRydm());
      }
      if (hasXmpy()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getXmpy());
      }
      if (hasStatus()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getStatus());
      }
      if (hasRyxm()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(4, getRyxm());
      }
      if (hasType()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(5, getType());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo parseDelimitedFrom(
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
    public static com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo result;
      
      // Construct using com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo();
        return builder;
      }
      
      protected com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo.getDescriptor();
      }
      
      public com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo getDefaultInstanceForType() {
        return com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo) {
          return mergeFrom((com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo other) {
        if (other == com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo.getDefaultInstance()) return this;
        if (other.hasRydm()) {
          setRydm(other.getRydm());
        }
        if (other.hasXmpy()) {
          setXmpy(other.getXmpy());
        }
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasRyxm()) {
          setRyxm(other.getRyxm());
        }
        if (other.hasType()) {
          setType(other.getType());
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
              setRydm(input.readString());
              break;
            }
            case 18: {
              setXmpy(input.readString());
              break;
            }
            case 26: {
              setStatus(input.readString());
              break;
            }
            case 34: {
              setRyxm(input.readString());
              break;
            }
            case 42: {
              setType(input.readString());
              break;
            }
          }
        }
      }
      
      
      // optional string rydm = 1;
      public boolean hasRydm() {
        return result.hasRydm();
      }
      public java.lang.String getRydm() {
        return result.getRydm();
      }
      public Builder setRydm(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasRydm = true;
        result.rydm_ = value;
        return this;
      }
      public Builder clearRydm() {
        result.hasRydm = false;
        result.rydm_ = getDefaultInstance().getRydm();
        return this;
      }
      
      // optional string xmpy = 2;
      public boolean hasXmpy() {
        return result.hasXmpy();
      }
      public java.lang.String getXmpy() {
        return result.getXmpy();
      }
      public Builder setXmpy(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasXmpy = true;
        result.xmpy_ = value;
        return this;
      }
      public Builder clearXmpy() {
        result.hasXmpy = false;
        result.xmpy_ = getDefaultInstance().getXmpy();
        return this;
      }
      
      // optional string status = 3;
      public boolean hasStatus() {
        return result.hasStatus();
      }
      public java.lang.String getStatus() {
        return result.getStatus();
      }
      public Builder setStatus(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasStatus = true;
        result.status_ = value;
        return this;
      }
      public Builder clearStatus() {
        result.hasStatus = false;
        result.status_ = getDefaultInstance().getStatus();
        return this;
      }
      
      // optional string ryxm = 4;
      public boolean hasRyxm() {
        return result.hasRyxm();
      }
      public java.lang.String getRyxm() {
        return result.getRyxm();
      }
      public Builder setRyxm(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasRyxm = true;
        result.ryxm_ = value;
        return this;
      }
      public Builder clearRyxm() {
        result.hasRyxm = false;
        result.ryxm_ = getDefaultInstance().getRyxm();
        return this;
      }
      
      // optional string type = 5;
      public boolean hasType() {
        return result.hasType();
      }
      public java.lang.String getType() {
        return result.getType();
      }
      public Builder setType(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasType = true;
        result.type_ = value;
        return this;
      }
      public Builder clearType() {
        result.hasType = false;
        result.type_ = getDefaultInstance().getType();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:FundManagerInfo)
    }
    
    static {
      defaultInstance = new FundManagerInfo(true);
      com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:FundManagerInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_FundManagerInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_FundManagerInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025fundManagerInfo.proto\"Y\n\017FundManagerIn" +
      "fo\022\014\n\004rydm\030\001 \001(\t\022\014\n\004xmpy\030\002 \001(\t\022\016\n\006status" +
      "\030\003 \001(\t\022\014\n\004ryxm\030\004 \001(\t\022\014\n\004type\030\005 \001(\tB<\n#co" +
      "m.howbuy.wireless.entity.protobufB\025FundM" +
      "anagerInfoProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_FundManagerInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_FundManagerInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_FundManagerInfo_descriptor,
              new java.lang.String[] { "Rydm", "Xmpy", "Status", "Ryxm", "Type", },
              com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo.class,
              com.howbuy.wireless.entity.protobuf.FundManagerInfoProtos.FundManagerInfo.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}

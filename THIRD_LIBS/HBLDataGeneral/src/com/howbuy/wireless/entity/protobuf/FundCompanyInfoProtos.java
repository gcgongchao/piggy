// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fundCompanyInfo.proto

package com.howbuy.wireless.entity.protobuf;

public final class FundCompanyInfoProtos {
  private FundCompanyInfoProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class FundCompanyInfo extends
      com.google.protobuf.GeneratedMessage {
    // Use FundCompanyInfo.newBuilder() to construct.
    private FundCompanyInfo() {
      initFields();
    }
    private FundCompanyInfo(boolean noInit) {}
    
    private static final FundCompanyInfo defaultInstance;
    public static FundCompanyInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public FundCompanyInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.internal_static_FundCompanyInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.internal_static_FundCompanyInfo_fieldAccessorTable;
    }
    
    // optional string jgdm = 1;
    public static final int JGDM_FIELD_NUMBER = 1;
    private boolean hasJgdm;
    private java.lang.String jgdm_ = "";
    public boolean hasJgdm() { return hasJgdm; }
    public java.lang.String getJgdm() { return jgdm_; }
    
    // optional string jgpy = 2;
    public static final int JGPY_FIELD_NUMBER = 2;
    private boolean hasJgpy;
    private java.lang.String jgpy_ = "";
    public boolean hasJgpy() { return hasJgpy; }
    public java.lang.String getJgpy() { return jgpy_; }
    
    // optional string status = 3;
    public static final int STATUS_FIELD_NUMBER = 3;
    private boolean hasStatus;
    private java.lang.String status_ = "";
    public boolean hasStatus() { return hasStatus; }
    public java.lang.String getStatus() { return status_; }
    
    // optional string jgjc = 4;
    public static final int JGJC_FIELD_NUMBER = 4;
    private boolean hasJgjc;
    private java.lang.String jgjc_ = "";
    public boolean hasJgjc() { return hasJgjc; }
    public java.lang.String getJgjc() { return jgjc_; }
    
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
      if (hasJgdm()) {
        output.writeString(1, getJgdm());
      }
      if (hasJgpy()) {
        output.writeString(2, getJgpy());
      }
      if (hasStatus()) {
        output.writeString(3, getStatus());
      }
      if (hasJgjc()) {
        output.writeString(4, getJgjc());
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
      if (hasJgdm()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getJgdm());
      }
      if (hasJgpy()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getJgpy());
      }
      if (hasStatus()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getStatus());
      }
      if (hasJgjc()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(4, getJgjc());
      }
      if (hasType()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(5, getType());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo parseDelimitedFrom(
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
    public static com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo result;
      
      // Construct using com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo();
        return builder;
      }
      
      protected com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo.getDescriptor();
      }
      
      public com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo getDefaultInstanceForType() {
        return com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo) {
          return mergeFrom((com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo other) {
        if (other == com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo.getDefaultInstance()) return this;
        if (other.hasJgdm()) {
          setJgdm(other.getJgdm());
        }
        if (other.hasJgpy()) {
          setJgpy(other.getJgpy());
        }
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasJgjc()) {
          setJgjc(other.getJgjc());
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
              setJgdm(input.readString());
              break;
            }
            case 18: {
              setJgpy(input.readString());
              break;
            }
            case 26: {
              setStatus(input.readString());
              break;
            }
            case 34: {
              setJgjc(input.readString());
              break;
            }
            case 42: {
              setType(input.readString());
              break;
            }
          }
        }
      }
      
      
      // optional string jgdm = 1;
      public boolean hasJgdm() {
        return result.hasJgdm();
      }
      public java.lang.String getJgdm() {
        return result.getJgdm();
      }
      public Builder setJgdm(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasJgdm = true;
        result.jgdm_ = value;
        return this;
      }
      public Builder clearJgdm() {
        result.hasJgdm = false;
        result.jgdm_ = getDefaultInstance().getJgdm();
        return this;
      }
      
      // optional string jgpy = 2;
      public boolean hasJgpy() {
        return result.hasJgpy();
      }
      public java.lang.String getJgpy() {
        return result.getJgpy();
      }
      public Builder setJgpy(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasJgpy = true;
        result.jgpy_ = value;
        return this;
      }
      public Builder clearJgpy() {
        result.hasJgpy = false;
        result.jgpy_ = getDefaultInstance().getJgpy();
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
      
      // optional string jgjc = 4;
      public boolean hasJgjc() {
        return result.hasJgjc();
      }
      public java.lang.String getJgjc() {
        return result.getJgjc();
      }
      public Builder setJgjc(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasJgjc = true;
        result.jgjc_ = value;
        return this;
      }
      public Builder clearJgjc() {
        result.hasJgjc = false;
        result.jgjc_ = getDefaultInstance().getJgjc();
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
      
      // @@protoc_insertion_point(builder_scope:FundCompanyInfo)
    }
    
    static {
      defaultInstance = new FundCompanyInfo(true);
      com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:FundCompanyInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_FundCompanyInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_FundCompanyInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025fundCompanyInfo.proto\"Y\n\017FundCompanyIn" +
      "fo\022\014\n\004jgdm\030\001 \001(\t\022\014\n\004jgpy\030\002 \001(\t\022\016\n\006status" +
      "\030\003 \001(\t\022\014\n\004jgjc\030\004 \001(\t\022\014\n\004type\030\005 \001(\tB<\n#co" +
      "m.howbuy.wireless.entity.protobufB\025FundC" +
      "ompanyInfoProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_FundCompanyInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_FundCompanyInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_FundCompanyInfo_descriptor,
              new java.lang.String[] { "Jgdm", "Jgpy", "Status", "Jgjc", "Type", },
              com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo.class,
              com.howbuy.wireless.entity.protobuf.FundCompanyInfoProtos.FundCompanyInfo.Builder.class);
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

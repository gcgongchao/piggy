// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: advertList.proto

package com.howbuy.wireless.entity.protobuf;

public final class AdvertListProtos {
  private AdvertListProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class AdvertList extends
      com.google.protobuf.GeneratedMessage {
    // Use AdvertList.newBuilder() to construct.
    private AdvertList() {
      initFields();
    }
    private AdvertList(boolean noInit) {}
    
    private static final AdvertList defaultInstance;
    public static AdvertList getDefaultInstance() {
      return defaultInstance;
    }
    
    public AdvertList getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.howbuy.wireless.entity.protobuf.AdvertListProtos.internal_static_AdvertList_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.howbuy.wireless.entity.protobuf.AdvertListProtos.internal_static_AdvertList_fieldAccessorTable;
    }
    
    // optional .common.Common common = 1;
    public static final int COMMON_FIELD_NUMBER = 1;
    private boolean hasCommon;
    private com.howbuy.wireless.entity.protobuf.CommonProtos.Common common_;
    public boolean hasCommon() { return hasCommon; }
    public com.howbuy.wireless.entity.protobuf.CommonProtos.Common getCommon() { return common_; }
    
    // required sint32 totalNum = 2;
    public static final int TOTALNUM_FIELD_NUMBER = 2;
    private boolean hasTotalNum;
    private int totalNum_ = 0;
    public boolean hasTotalNum() { return hasTotalNum; }
    public int getTotalNum() { return totalNum_; }
    
    // repeated .ICAdvert icAdverts = 3;
    public static final int ICADVERTS_FIELD_NUMBER = 3;
    private java.util.List<com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert> icAdverts_ =
      java.util.Collections.emptyList();
    public java.util.List<com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert> getIcAdvertsList() {
      return icAdverts_;
    }
    public int getIcAdvertsCount() { return icAdverts_.size(); }
    public com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert getIcAdverts(int index) {
      return icAdverts_.get(index);
    }
    
    private void initFields() {
      common_ = com.howbuy.wireless.entity.protobuf.CommonProtos.Common.getDefaultInstance();
    }
    public final boolean isInitialized() {
      if (!hasTotalNum) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasCommon()) {
        output.writeMessage(1, getCommon());
      }
      if (hasTotalNum()) {
        output.writeSInt32(2, getTotalNum());
      }
      for (com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert element : getIcAdvertsList()) {
        output.writeMessage(3, element);
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
      if (hasTotalNum()) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(2, getTotalNum());
      }
      for (com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert element : getIcAdvertsList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, element);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList parseDelimitedFrom(
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
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList result;
      
      // Construct using com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList();
        return builder;
      }
      
      protected com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList.getDescriptor();
      }
      
      public com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList getDefaultInstanceForType() {
        return com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.icAdverts_ != java.util.Collections.EMPTY_LIST) {
          result.icAdverts_ =
            java.util.Collections.unmodifiableList(result.icAdverts_);
        }
        com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList) {
          return mergeFrom((com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList other) {
        if (other == com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList.getDefaultInstance()) return this;
        if (other.hasCommon()) {
          mergeCommon(other.getCommon());
        }
        if (other.hasTotalNum()) {
          setTotalNum(other.getTotalNum());
        }
        if (!other.icAdverts_.isEmpty()) {
          if (result.icAdverts_.isEmpty()) {
            result.icAdverts_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert>();
          }
          result.icAdverts_.addAll(other.icAdverts_);
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
            case 16: {
              setTotalNum(input.readSInt32());
              break;
            }
            case 26: {
              com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert.Builder subBuilder = com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addIcAdverts(subBuilder.buildPartial());
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
      
      // required sint32 totalNum = 2;
      public boolean hasTotalNum() {
        return result.hasTotalNum();
      }
      public int getTotalNum() {
        return result.getTotalNum();
      }
      public Builder setTotalNum(int value) {
        result.hasTotalNum = true;
        result.totalNum_ = value;
        return this;
      }
      public Builder clearTotalNum() {
        result.hasTotalNum = false;
        result.totalNum_ = 0;
        return this;
      }
      
      // repeated .ICAdvert icAdverts = 3;
      public java.util.List<com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert> getIcAdvertsList() {
        return java.util.Collections.unmodifiableList(result.icAdverts_);
      }
      public int getIcAdvertsCount() {
        return result.getIcAdvertsCount();
      }
      public com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert getIcAdverts(int index) {
        return result.getIcAdverts(index);
      }
      public Builder setIcAdverts(int index, com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.icAdverts_.set(index, value);
        return this;
      }
      public Builder setIcAdverts(int index, com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert.Builder builderForValue) {
        result.icAdverts_.set(index, builderForValue.build());
        return this;
      }
      public Builder addIcAdverts(com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.icAdverts_.isEmpty()) {
          result.icAdverts_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert>();
        }
        result.icAdverts_.add(value);
        return this;
      }
      public Builder addIcAdverts(com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert.Builder builderForValue) {
        if (result.icAdverts_.isEmpty()) {
          result.icAdverts_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert>();
        }
        result.icAdverts_.add(builderForValue.build());
        return this;
      }
      public Builder addAllIcAdverts(
          java.lang.Iterable<? extends com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert> values) {
        if (result.icAdverts_.isEmpty()) {
          result.icAdverts_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert>();
        }
        super.addAll(values, result.icAdverts_);
        return this;
      }
      public Builder clearIcAdverts() {
        result.icAdverts_ = java.util.Collections.emptyList();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:AdvertList)
    }
    
    static {
      defaultInstance = new AdvertList(true);
      com.howbuy.wireless.entity.protobuf.AdvertListProtos.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:AdvertList)
  }
  
  public static final class ICAdvert extends
      com.google.protobuf.GeneratedMessage{
    // Use ICAdvert.newBuilder() to construct.
    private ICAdvert() {
      initFields();
    }
    private ICAdvert(boolean noInit) {}
    
    private static final ICAdvert defaultInstance;
    public static ICAdvert getDefaultInstance() {
      return defaultInstance;
    }
    
    public ICAdvert getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.howbuy.wireless.entity.protobuf.AdvertListProtos.internal_static_ICAdvert_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.howbuy.wireless.entity.protobuf.AdvertListProtos.internal_static_ICAdvert_fieldAccessorTable;
    }
    
    // optional string advID = 1;
    public static final int ADVID_FIELD_NUMBER = 1;
    private boolean hasAdvID;
    private java.lang.String advID_ = "";
    public boolean hasAdvID() { return hasAdvID; }
    public java.lang.String getAdvID() { return advID_; }
    
    // optional string advTitle = 2;
    public static final int ADVTITLE_FIELD_NUMBER = 2;
    private boolean hasAdvTitle;
    private java.lang.String advTitle_ = "";
    public boolean hasAdvTitle() { return hasAdvTitle; }
    public java.lang.String getAdvTitle() { return advTitle_; }
    
    // optional string advImageUrl = 3;
    public static final int ADVIMAGEURL_FIELD_NUMBER = 3;
    private boolean hasAdvImageUrl;
    private java.lang.String advImageUrl_ = "";
    public boolean hasAdvImageUrl() { return hasAdvImageUrl; }
    public java.lang.String getAdvImageUrl() { return advImageUrl_; }
    
    // optional string advEventCode = 4;
    public static final int ADVEVENTCODE_FIELD_NUMBER = 4;
    private boolean hasAdvEventCode;
    private java.lang.String advEventCode_ = "";
    public boolean hasAdvEventCode() { return hasAdvEventCode; }
    public java.lang.String getAdvEventCode() { return advEventCode_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasAdvID()) {
        output.writeString(1, getAdvID());
      }
      if (hasAdvTitle()) {
        output.writeString(2, getAdvTitle());
      }
      if (hasAdvImageUrl()) {
        output.writeString(3, getAdvImageUrl());
      }
      if (hasAdvEventCode()) {
        output.writeString(4, getAdvEventCode());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasAdvID()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getAdvID());
      }
      if (hasAdvTitle()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getAdvTitle());
      }
      if (hasAdvImageUrl()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getAdvImageUrl());
      }
      if (hasAdvEventCode()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(4, getAdvEventCode());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert parseDelimitedFrom(
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
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert result;
      
      // Construct using com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert();
        return builder;
      }
      
      protected com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert.getDescriptor();
      }
      
      public com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert getDefaultInstanceForType() {
        return com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert) {
          return mergeFrom((com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert other) {
        if (other == com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert.getDefaultInstance()) return this;
        if (other.hasAdvID()) {
          setAdvID(other.getAdvID());
        }
        if (other.hasAdvTitle()) {
          setAdvTitle(other.getAdvTitle());
        }
        if (other.hasAdvImageUrl()) {
          setAdvImageUrl(other.getAdvImageUrl());
        }
        if (other.hasAdvEventCode()) {
          setAdvEventCode(other.getAdvEventCode());
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
              setAdvID(input.readString());
              break;
            }
            case 18: {
              setAdvTitle(input.readString());
              break;
            }
            case 26: {
              setAdvImageUrl(input.readString());
              break;
            }
            case 34: {
              setAdvEventCode(input.readString());
              break;
            }
          }
        }
      }
      
      
      // optional string advID = 1;
      public boolean hasAdvID() {
        return result.hasAdvID();
      }
      public java.lang.String getAdvID() {
        return result.getAdvID();
      }
      public Builder setAdvID(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasAdvID = true;
        result.advID_ = value;
        return this;
      }
      public Builder clearAdvID() {
        result.hasAdvID = false;
        result.advID_ = getDefaultInstance().getAdvID();
        return this;
      }
      
      // optional string advTitle = 2;
      public boolean hasAdvTitle() {
        return result.hasAdvTitle();
      }
      public java.lang.String getAdvTitle() {
        return result.getAdvTitle();
      }
      public Builder setAdvTitle(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasAdvTitle = true;
        result.advTitle_ = value;
        return this;
      }
      public Builder clearAdvTitle() {
        result.hasAdvTitle = false;
        result.advTitle_ = getDefaultInstance().getAdvTitle();
        return this;
      }
      
      // optional string advImageUrl = 3;
      public boolean hasAdvImageUrl() {
        return result.hasAdvImageUrl();
      }
      public java.lang.String getAdvImageUrl() {
        return result.getAdvImageUrl();
      }
      public Builder setAdvImageUrl(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasAdvImageUrl = true;
        result.advImageUrl_ = value;
        return this;
      }
      public Builder clearAdvImageUrl() {
        result.hasAdvImageUrl = false;
        result.advImageUrl_ = getDefaultInstance().getAdvImageUrl();
        return this;
      }
      
      // optional string advEventCode = 4;
      public boolean hasAdvEventCode() {
        return result.hasAdvEventCode();
      }
      public java.lang.String getAdvEventCode() {
        return result.getAdvEventCode();
      }
      public Builder setAdvEventCode(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasAdvEventCode = true;
        result.advEventCode_ = value;
        return this;
      }
      public Builder clearAdvEventCode() {
        result.hasAdvEventCode = false;
        result.advEventCode_ = getDefaultInstance().getAdvEventCode();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:ICAdvert)
    }
    
    static {
      defaultInstance = new ICAdvert(true);
      com.howbuy.wireless.entity.protobuf.AdvertListProtos.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:ICAdvert)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_AdvertList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_AdvertList_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_ICAdvert_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ICAdvert_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020advertList.proto\032\014common.proto\"\\\n\nAdve" +
      "rtList\022\036\n\006common\030\001 \001(\0132\016.common.Common\022\020" +
      "\n\010totalNum\030\002 \002(\021\022\034\n\ticAdverts\030\003 \003(\0132\t.IC" +
      "Advert\"V\n\010ICAdvert\022\r\n\005advID\030\001 \001(\t\022\020\n\010adv" +
      "Title\030\002 \001(\t\022\023\n\013advImageUrl\030\003 \001(\t\022\024\n\014advE" +
      "ventCode\030\004 \001(\tB7\n#com.howbuy.wireless.en" +
      "tity.protobufB\020AdvertListProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_AdvertList_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_AdvertList_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_AdvertList_descriptor,
              new java.lang.String[] { "Common", "TotalNum", "IcAdverts", },
              com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList.class,
              com.howbuy.wireless.entity.protobuf.AdvertListProtos.AdvertList.Builder.class);
          internal_static_ICAdvert_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_ICAdvert_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_ICAdvert_descriptor,
              new java.lang.String[] { "AdvID", "AdvTitle", "AdvImageUrl", "AdvEventCode", },
              com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert.class,
              com.howbuy.wireless.entity.protobuf.AdvertListProtos.ICAdvert.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.howbuy.wireless.entity.protobuf.CommonProtos.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}

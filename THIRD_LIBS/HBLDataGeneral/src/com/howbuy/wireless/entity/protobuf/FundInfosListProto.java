// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fundInfosList.proto

package com.howbuy.wireless.entity.protobuf;

public final class FundInfosListProto {
  private FundInfosListProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class FundInfosList extends
      com.google.protobuf.GeneratedMessage {
    // Use FundInfosList.newBuilder() to construct.
    private FundInfosList() {
      initFields();
    }
    private FundInfosList(boolean noInit) {}
    
    private static final FundInfosList defaultInstance;
    public static FundInfosList getDefaultInstance() {
      return defaultInstance;
    }
    
    public FundInfosList getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.howbuy.wireless.entity.protobuf.FundInfosListProto.internal_static_FundInfosList_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.howbuy.wireless.entity.protobuf.FundInfosListProto.internal_static_FundInfosList_fieldAccessorTable;
    }
    
    // optional .common.Common common = 1;
    public static final int COMMON_FIELD_NUMBER = 1;
    private boolean hasCommon;
    private com.howbuy.wireless.entity.protobuf.CommonProtos.Common common_;
    public boolean hasCommon() { return hasCommon; }
    public com.howbuy.wireless.entity.protobuf.CommonProtos.Common getCommon() { return common_; }
    
    // repeated .Opens opens = 2;
    public static final int OPENS_FIELD_NUMBER = 2;
    private java.util.List<com.howbuy.wireless.entity.protobuf.OpensProtos.Opens> opens_ =
      java.util.Collections.emptyList();
    public java.util.List<com.howbuy.wireless.entity.protobuf.OpensProtos.Opens> getOpensList() {
      return opens_;
    }
    public int getOpensCount() { return opens_.size(); }
    public com.howbuy.wireless.entity.protobuf.OpensProtos.Opens getOpens(int index) {
      return opens_.get(index);
    }
    
    // repeated .Moneys moneys = 3;
    public static final int MONEYS_FIELD_NUMBER = 3;
    private java.util.List<com.howbuy.wireless.entity.protobuf.MoneysProtos.Moneys> moneys_ =
      java.util.Collections.emptyList();
    public java.util.List<com.howbuy.wireless.entity.protobuf.MoneysProtos.Moneys> getMoneysList() {
      return moneys_;
    }
    public int getMoneysCount() { return moneys_.size(); }
    public com.howbuy.wireless.entity.protobuf.MoneysProtos.Moneys getMoneys(int index) {
      return moneys_.get(index);
    }
    
    // repeated .ClosesNew closesNew = 4;
    public static final int CLOSESNEW_FIELD_NUMBER = 4;
    private java.util.List<com.howbuy.wireless.entity.protobuf.ClosesNewProtos.ClosesNew> closesNew_ =
      java.util.Collections.emptyList();
    public java.util.List<com.howbuy.wireless.entity.protobuf.ClosesNewProtos.ClosesNew> getClosesNewList() {
      return closesNew_;
    }
    public int getClosesNewCount() { return closesNew_.size(); }
    public com.howbuy.wireless.entity.protobuf.ClosesNewProtos.ClosesNew getClosesNew(int index) {
      return closesNew_.get(index);
    }
    
    // repeated .Simus simus = 5;
    public static final int SIMUS_FIELD_NUMBER = 5;
    private java.util.List<com.howbuy.wireless.entity.protobuf.SimusProtos.Simus> simus_ =
      java.util.Collections.emptyList();
    public java.util.List<com.howbuy.wireless.entity.protobuf.SimusProtos.Simus> getSimusList() {
      return simus_;
    }
    public int getSimusCount() { return simus_.size(); }
    public com.howbuy.wireless.entity.protobuf.SimusProtos.Simus getSimus(int index) {
      return simus_.get(index);
    }
    
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
      for (com.howbuy.wireless.entity.protobuf.OpensProtos.Opens element : getOpensList()) {
        output.writeMessage(2, element);
      }
      for (com.howbuy.wireless.entity.protobuf.MoneysProtos.Moneys element : getMoneysList()) {
        output.writeMessage(3, element);
      }
      for (com.howbuy.wireless.entity.protobuf.ClosesNewProtos.ClosesNew element : getClosesNewList()) {
        output.writeMessage(4, element);
      }
      for (com.howbuy.wireless.entity.protobuf.SimusProtos.Simus element : getSimusList()) {
        output.writeMessage(5, element);
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
      for (com.howbuy.wireless.entity.protobuf.OpensProtos.Opens element : getOpensList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, element);
      }
      for (com.howbuy.wireless.entity.protobuf.MoneysProtos.Moneys element : getMoneysList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, element);
      }
      for (com.howbuy.wireless.entity.protobuf.ClosesNewProtos.ClosesNew element : getClosesNewList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, element);
      }
      for (com.howbuy.wireless.entity.protobuf.SimusProtos.Simus element : getSimusList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, element);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList parseDelimitedFrom(
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
    public static com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList result;
      
      // Construct using com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList();
        return builder;
      }
      
      protected com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList.getDescriptor();
      }
      
      public com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList getDefaultInstanceForType() {
        return com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.opens_ != java.util.Collections.EMPTY_LIST) {
          result.opens_ =
            java.util.Collections.unmodifiableList(result.opens_);
        }
        if (result.moneys_ != java.util.Collections.EMPTY_LIST) {
          result.moneys_ =
            java.util.Collections.unmodifiableList(result.moneys_);
        }
        if (result.closesNew_ != java.util.Collections.EMPTY_LIST) {
          result.closesNew_ =
            java.util.Collections.unmodifiableList(result.closesNew_);
        }
        if (result.simus_ != java.util.Collections.EMPTY_LIST) {
          result.simus_ =
            java.util.Collections.unmodifiableList(result.simus_);
        }
        com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList) {
          return mergeFrom((com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList other) {
        if (other == com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList.getDefaultInstance()) return this;
        if (other.hasCommon()) {
          mergeCommon(other.getCommon());
        }
        if (!other.opens_.isEmpty()) {
          if (result.opens_.isEmpty()) {
            result.opens_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.OpensProtos.Opens>();
          }
          result.opens_.addAll(other.opens_);
        }
        if (!other.moneys_.isEmpty()) {
          if (result.moneys_.isEmpty()) {
            result.moneys_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.MoneysProtos.Moneys>();
          }
          result.moneys_.addAll(other.moneys_);
        }
        if (!other.closesNew_.isEmpty()) {
          if (result.closesNew_.isEmpty()) {
            result.closesNew_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.ClosesNewProtos.ClosesNew>();
          }
          result.closesNew_.addAll(other.closesNew_);
        }
        if (!other.simus_.isEmpty()) {
          if (result.simus_.isEmpty()) {
            result.simus_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.SimusProtos.Simus>();
          }
          result.simus_.addAll(other.simus_);
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
              com.howbuy.wireless.entity.protobuf.OpensProtos.Opens.Builder subBuilder = com.howbuy.wireless.entity.protobuf.OpensProtos.Opens.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addOpens(subBuilder.buildPartial());
              break;
            }
            case 26: {
              com.howbuy.wireless.entity.protobuf.MoneysProtos.Moneys.Builder subBuilder = com.howbuy.wireless.entity.protobuf.MoneysProtos.Moneys.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addMoneys(subBuilder.buildPartial());
              break;
            }
            case 34: {
              com.howbuy.wireless.entity.protobuf.ClosesNewProtos.ClosesNew.Builder subBuilder = com.howbuy.wireless.entity.protobuf.ClosesNewProtos.ClosesNew.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addClosesNew(subBuilder.buildPartial());
              break;
            }
            case 42: {
              com.howbuy.wireless.entity.protobuf.SimusProtos.Simus.Builder subBuilder = com.howbuy.wireless.entity.protobuf.SimusProtos.Simus.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addSimus(subBuilder.buildPartial());
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
      
      // repeated .Opens opens = 2;
      public java.util.List<com.howbuy.wireless.entity.protobuf.OpensProtos.Opens> getOpensList() {
        return java.util.Collections.unmodifiableList(result.opens_);
      }
      public int getOpensCount() {
        return result.getOpensCount();
      }
      public com.howbuy.wireless.entity.protobuf.OpensProtos.Opens getOpens(int index) {
        return result.getOpens(index);
      }
      public Builder setOpens(int index, com.howbuy.wireless.entity.protobuf.OpensProtos.Opens value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.opens_.set(index, value);
        return this;
      }
      public Builder setOpens(int index, com.howbuy.wireless.entity.protobuf.OpensProtos.Opens.Builder builderForValue) {
        result.opens_.set(index, builderForValue.build());
        return this;
      }
      public Builder addOpens(com.howbuy.wireless.entity.protobuf.OpensProtos.Opens value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.opens_.isEmpty()) {
          result.opens_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.OpensProtos.Opens>();
        }
        result.opens_.add(value);
        return this;
      }
      public Builder addOpens(com.howbuy.wireless.entity.protobuf.OpensProtos.Opens.Builder builderForValue) {
        if (result.opens_.isEmpty()) {
          result.opens_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.OpensProtos.Opens>();
        }
        result.opens_.add(builderForValue.build());
        return this;
      }
      public Builder addAllOpens(
          java.lang.Iterable<? extends com.howbuy.wireless.entity.protobuf.OpensProtos.Opens> values) {
        if (result.opens_.isEmpty()) {
          result.opens_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.OpensProtos.Opens>();
        }
        super.addAll(values, result.opens_);
        return this;
      }
      public Builder clearOpens() {
        result.opens_ = java.util.Collections.emptyList();
        return this;
      }
      
      // repeated .Moneys moneys = 3;
      public java.util.List<com.howbuy.wireless.entity.protobuf.MoneysProtos.Moneys> getMoneysList() {
        return java.util.Collections.unmodifiableList(result.moneys_);
      }
      public int getMoneysCount() {
        return result.getMoneysCount();
      }
      public com.howbuy.wireless.entity.protobuf.MoneysProtos.Moneys getMoneys(int index) {
        return result.getMoneys(index);
      }
      public Builder setMoneys(int index, com.howbuy.wireless.entity.protobuf.MoneysProtos.Moneys value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.moneys_.set(index, value);
        return this;
      }
      public Builder setMoneys(int index, com.howbuy.wireless.entity.protobuf.MoneysProtos.Moneys.Builder builderForValue) {
        result.moneys_.set(index, builderForValue.build());
        return this;
      }
      public Builder addMoneys(com.howbuy.wireless.entity.protobuf.MoneysProtos.Moneys value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.moneys_.isEmpty()) {
          result.moneys_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.MoneysProtos.Moneys>();
        }
        result.moneys_.add(value);
        return this;
      }
      public Builder addMoneys(com.howbuy.wireless.entity.protobuf.MoneysProtos.Moneys.Builder builderForValue) {
        if (result.moneys_.isEmpty()) {
          result.moneys_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.MoneysProtos.Moneys>();
        }
        result.moneys_.add(builderForValue.build());
        return this;
      }
      public Builder addAllMoneys(
          java.lang.Iterable<? extends com.howbuy.wireless.entity.protobuf.MoneysProtos.Moneys> values) {
        if (result.moneys_.isEmpty()) {
          result.moneys_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.MoneysProtos.Moneys>();
        }
        super.addAll(values, result.moneys_);
        return this;
      }
      public Builder clearMoneys() {
        result.moneys_ = java.util.Collections.emptyList();
        return this;
      }
      
      // repeated .ClosesNew closesNew = 4;
      public java.util.List<com.howbuy.wireless.entity.protobuf.ClosesNewProtos.ClosesNew> getClosesNewList() {
        return java.util.Collections.unmodifiableList(result.closesNew_);
      }
      public int getClosesNewCount() {
        return result.getClosesNewCount();
      }
      public com.howbuy.wireless.entity.protobuf.ClosesNewProtos.ClosesNew getClosesNew(int index) {
        return result.getClosesNew(index);
      }
      public Builder setClosesNew(int index, com.howbuy.wireless.entity.protobuf.ClosesNewProtos.ClosesNew value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.closesNew_.set(index, value);
        return this;
      }
      public Builder setClosesNew(int index, com.howbuy.wireless.entity.protobuf.ClosesNewProtos.ClosesNew.Builder builderForValue) {
        result.closesNew_.set(index, builderForValue.build());
        return this;
      }
      public Builder addClosesNew(com.howbuy.wireless.entity.protobuf.ClosesNewProtos.ClosesNew value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.closesNew_.isEmpty()) {
          result.closesNew_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.ClosesNewProtos.ClosesNew>();
        }
        result.closesNew_.add(value);
        return this;
      }
      public Builder addClosesNew(com.howbuy.wireless.entity.protobuf.ClosesNewProtos.ClosesNew.Builder builderForValue) {
        if (result.closesNew_.isEmpty()) {
          result.closesNew_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.ClosesNewProtos.ClosesNew>();
        }
        result.closesNew_.add(builderForValue.build());
        return this;
      }
      public Builder addAllClosesNew(
          java.lang.Iterable<? extends com.howbuy.wireless.entity.protobuf.ClosesNewProtos.ClosesNew> values) {
        if (result.closesNew_.isEmpty()) {
          result.closesNew_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.ClosesNewProtos.ClosesNew>();
        }
        super.addAll(values, result.closesNew_);
        return this;
      }
      public Builder clearClosesNew() {
        result.closesNew_ = java.util.Collections.emptyList();
        return this;
      }
      
      // repeated .Simus simus = 5;
      public java.util.List<com.howbuy.wireless.entity.protobuf.SimusProtos.Simus> getSimusList() {
        return java.util.Collections.unmodifiableList(result.simus_);
      }
      public int getSimusCount() {
        return result.getSimusCount();
      }
      public com.howbuy.wireless.entity.protobuf.SimusProtos.Simus getSimus(int index) {
        return result.getSimus(index);
      }
      public Builder setSimus(int index, com.howbuy.wireless.entity.protobuf.SimusProtos.Simus value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.simus_.set(index, value);
        return this;
      }
      public Builder setSimus(int index, com.howbuy.wireless.entity.protobuf.SimusProtos.Simus.Builder builderForValue) {
        result.simus_.set(index, builderForValue.build());
        return this;
      }
      public Builder addSimus(com.howbuy.wireless.entity.protobuf.SimusProtos.Simus value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.simus_.isEmpty()) {
          result.simus_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.SimusProtos.Simus>();
        }
        result.simus_.add(value);
        return this;
      }
      public Builder addSimus(com.howbuy.wireless.entity.protobuf.SimusProtos.Simus.Builder builderForValue) {
        if (result.simus_.isEmpty()) {
          result.simus_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.SimusProtos.Simus>();
        }
        result.simus_.add(builderForValue.build());
        return this;
      }
      public Builder addAllSimus(
          java.lang.Iterable<? extends com.howbuy.wireless.entity.protobuf.SimusProtos.Simus> values) {
        if (result.simus_.isEmpty()) {
          result.simus_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.SimusProtos.Simus>();
        }
        super.addAll(values, result.simus_);
        return this;
      }
      public Builder clearSimus() {
        result.simus_ = java.util.Collections.emptyList();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:FundInfosList)
    }
    
    static {
      defaultInstance = new FundInfosList(true);
      com.howbuy.wireless.entity.protobuf.FundInfosListProto.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:FundInfosList)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_FundInfosList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_FundInfosList_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023fundInfosList.proto\032\014common.proto\032\013ope" +
      "ns.proto\032\014moneys.proto\032\017closesNew.proto\032" +
      "\013simus.proto\"\225\001\n\rFundInfosList\022\036\n\006common" +
      "\030\001 \001(\0132\016.common.Common\022\025\n\005opens\030\002 \003(\0132\006." +
      "Opens\022\027\n\006moneys\030\003 \003(\0132\007.Moneys\022\035\n\tcloses" +
      "New\030\004 \003(\0132\n.ClosesNew\022\025\n\005simus\030\005 \003(\0132\006.S" +
      "imusB9\n#com.howbuy.wireless.entity.proto" +
      "bufB\022FundInfosListProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_FundInfosList_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_FundInfosList_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_FundInfosList_descriptor,
              new java.lang.String[] { "Common", "Opens", "Moneys", "ClosesNew", "Simus", },
              com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList.class,
              com.howbuy.wireless.entity.protobuf.FundInfosListProto.FundInfosList.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.howbuy.wireless.entity.protobuf.CommonProtos.getDescriptor(),
          com.howbuy.wireless.entity.protobuf.OpensProtos.getDescriptor(),
          com.howbuy.wireless.entity.protobuf.MoneysProtos.getDescriptor(),
          com.howbuy.wireless.entity.protobuf.ClosesNewProtos.getDescriptor(),
          com.howbuy.wireless.entity.protobuf.SimusProtos.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}

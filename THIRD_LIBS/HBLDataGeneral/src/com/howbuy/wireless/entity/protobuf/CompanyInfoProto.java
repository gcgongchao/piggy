// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: companyInfo.proto

package com.howbuy.wireless.entity.protobuf;

public final class CompanyInfoProto {
  private CompanyInfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CompanyInfo extends
      com.google.protobuf.GeneratedMessage {
    // Use CompanyInfo.newBuilder() to construct.
    private CompanyInfo() {
      initFields();
    }
    private CompanyInfo(boolean noInit) {}
    
    private static final CompanyInfo defaultInstance;
    public static CompanyInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public CompanyInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.howbuy.wireless.entity.protobuf.CompanyInfoProto.internal_static_CompanyInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.howbuy.wireless.entity.protobuf.CompanyInfoProto.internal_static_CompanyInfo_fieldAccessorTable;
    }
    
    // optional .common.Common common = 1;
    public static final int COMMON_FIELD_NUMBER = 1;
    private boolean hasCommon;
    private com.howbuy.wireless.entity.protobuf.CommonProtos.Common common_;
    public boolean hasCommon() { return hasCommon; }
    public com.howbuy.wireless.entity.protobuf.CommonProtos.Common getCommon() { return common_; }
    
    // optional string jgmc = 2;
    public static final int JGMC_FIELD_NUMBER = 2;
    private boolean hasJgmc;
    private java.lang.String jgmc_ = "";
    public boolean hasJgmc() { return hasJgmc; }
    public java.lang.String getJgmc() { return jgmc_; }
    
    // optional string zzxs = 3;
    public static final int ZZXS_FIELD_NUMBER = 3;
    private boolean hasZzxs;
    private java.lang.String zzxs_ = "";
    public boolean hasZzxs() { return hasZzxs; }
    public java.lang.String getZzxs() { return zzxs_; }
    
    // optional double zczb = 4;
    public static final int ZCZB_FIELD_NUMBER = 4;
    private boolean hasZczb;
    private double zczb_ = 0D;
    public boolean hasZczb() { return hasZczb; }
    public double getZczb() { return zczb_; }
    
    // optional string clrq = 5;
    public static final int CLRQ_FIELD_NUMBER = 5;
    private boolean hasClrq;
    private java.lang.String clrq_ = "";
    public boolean hasClrq() { return hasClrq; }
    public java.lang.String getClrq() { return clrq_; }
    
    // optional string clnx = 6;
    public static final int CLNX_FIELD_NUMBER = 6;
    private boolean hasClnx;
    private java.lang.String clnx_ = "";
    public boolean hasClnx() { return hasClnx; }
    public java.lang.String getClnx() { return clnx_; }
    
    // optional sint32 jjsl = 7;
    public static final int JJSL_FIELD_NUMBER = 7;
    private boolean hasJjsl;
    private int jjsl_ = 0;
    public boolean hasJjsl() { return hasJjsl; }
    public int getJjsl() { return jjsl_; }
    
    // optional sint32 jlsl = 8;
    public static final int JLSL_FIELD_NUMBER = 8;
    private boolean hasJlsl;
    private int jlsl_ = 0;
    public boolean hasJlsl() { return hasJlsl; }
    public int getJlsl() { return jlsl_; }
    
    // optional string gsyg = 9;
    public static final int GSYG_FIELD_NUMBER = 9;
    private boolean hasGsyg;
    private java.lang.String gsyg_ = "";
    public boolean hasGsyg() { return hasGsyg; }
    public java.lang.String getGsyg() { return gsyg_; }
    
    // repeated .FundInfo fundInfo = 10;
    public static final int FUNDINFO_FIELD_NUMBER = 10;
    private java.util.List<com.howbuy.wireless.entity.protobuf.FundInfoProtos.FundInfo> fundInfo_ =
      java.util.Collections.emptyList();
    public java.util.List<com.howbuy.wireless.entity.protobuf.FundInfoProtos.FundInfo> getFundInfoList() {
      return fundInfo_;
    }
    public int getFundInfoCount() { return fundInfo_.size(); }
    public com.howbuy.wireless.entity.protobuf.FundInfoProtos.FundInfo getFundInfo(int index) {
      return fundInfo_.get(index);
    }
    
    // repeated .Opinion opinion = 11;
    public static final int OPINION_FIELD_NUMBER = 11;
    private java.util.List<com.howbuy.wireless.entity.protobuf.OpinionProtos.Opinion> opinion_ =
      java.util.Collections.emptyList();
    public java.util.List<com.howbuy.wireless.entity.protobuf.OpinionProtos.Opinion> getOpinionList() {
      return opinion_;
    }
    public int getOpinionCount() { return opinion_.size(); }
    public com.howbuy.wireless.entity.protobuf.OpinionProtos.Opinion getOpinion(int index) {
      return opinion_.get(index);
    }
    
    // optional string zgm = 12;
    public static final int ZGM_FIELD_NUMBER = 12;
    private boolean hasZgm;
    private java.lang.String zgm_ = "";
    public boolean hasZgm() { return hasZgm; }
    public java.lang.String getZgm() { return zgm_; }
    
    // optional string zjl = 13;
    public static final int ZJL_FIELD_NUMBER = 13;
    private boolean hasZjl;
    private java.lang.String zjl_ = "";
    public boolean hasZjl() { return hasZjl; }
    public java.lang.String getZjl() { return zjl_; }
    
    // optional string gsdm = 14;
    public static final int GSDM_FIELD_NUMBER = 14;
    private boolean hasGsdm;
    private java.lang.String gsdm_ = "";
    public boolean hasGsdm() { return hasGsdm; }
    public java.lang.String getGsdm() { return gsdm_; }
    
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
      if (hasJgmc()) {
        output.writeString(2, getJgmc());
      }
      if (hasZzxs()) {
        output.writeString(3, getZzxs());
      }
      if (hasZczb()) {
        output.writeDouble(4, getZczb());
      }
      if (hasClrq()) {
        output.writeString(5, getClrq());
      }
      if (hasClnx()) {
        output.writeString(6, getClnx());
      }
      if (hasJjsl()) {
        output.writeSInt32(7, getJjsl());
      }
      if (hasJlsl()) {
        output.writeSInt32(8, getJlsl());
      }
      if (hasGsyg()) {
        output.writeString(9, getGsyg());
      }
      for (com.howbuy.wireless.entity.protobuf.FundInfoProtos.FundInfo element : getFundInfoList()) {
        output.writeMessage(10, element);
      }
      for (com.howbuy.wireless.entity.protobuf.OpinionProtos.Opinion element : getOpinionList()) {
        output.writeMessage(11, element);
      }
      if (hasZgm()) {
        output.writeString(12, getZgm());
      }
      if (hasZjl()) {
        output.writeString(13, getZjl());
      }
      if (hasGsdm()) {
        output.writeString(14, getGsdm());
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
      if (hasJgmc()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getJgmc());
      }
      if (hasZzxs()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getZzxs());
      }
      if (hasZczb()) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, getZczb());
      }
      if (hasClrq()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(5, getClrq());
      }
      if (hasClnx()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(6, getClnx());
      }
      if (hasJjsl()) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(7, getJjsl());
      }
      if (hasJlsl()) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(8, getJlsl());
      }
      if (hasGsyg()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(9, getGsyg());
      }
      for (com.howbuy.wireless.entity.protobuf.FundInfoProtos.FundInfo element : getFundInfoList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, element);
      }
      for (com.howbuy.wireless.entity.protobuf.OpinionProtos.Opinion element : getOpinionList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, element);
      }
      if (hasZgm()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(12, getZgm());
      }
      if (hasZjl()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(13, getZjl());
      }
      if (hasGsdm()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(14, getGsdm());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo parseDelimitedFrom(
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
    public static com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo result;
      
      // Construct using com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo();
        return builder;
      }
      
      protected com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo.getDescriptor();
      }
      
      public com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo getDefaultInstanceForType() {
        return com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.fundInfo_ != java.util.Collections.EMPTY_LIST) {
          result.fundInfo_ =
            java.util.Collections.unmodifiableList(result.fundInfo_);
        }
        if (result.opinion_ != java.util.Collections.EMPTY_LIST) {
          result.opinion_ =
            java.util.Collections.unmodifiableList(result.opinion_);
        }
        com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo) {
          return mergeFrom((com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo other) {
        if (other == com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo.getDefaultInstance()) return this;
        if (other.hasCommon()) {
          mergeCommon(other.getCommon());
        }
        if (other.hasJgmc()) {
          setJgmc(other.getJgmc());
        }
        if (other.hasZzxs()) {
          setZzxs(other.getZzxs());
        }
        if (other.hasZczb()) {
          setZczb(other.getZczb());
        }
        if (other.hasClrq()) {
          setClrq(other.getClrq());
        }
        if (other.hasClnx()) {
          setClnx(other.getClnx());
        }
        if (other.hasJjsl()) {
          setJjsl(other.getJjsl());
        }
        if (other.hasJlsl()) {
          setJlsl(other.getJlsl());
        }
        if (other.hasGsyg()) {
          setGsyg(other.getGsyg());
        }
        if (!other.fundInfo_.isEmpty()) {
          if (result.fundInfo_.isEmpty()) {
            result.fundInfo_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.FundInfoProtos.FundInfo>();
          }
          result.fundInfo_.addAll(other.fundInfo_);
        }
        if (!other.opinion_.isEmpty()) {
          if (result.opinion_.isEmpty()) {
            result.opinion_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.OpinionProtos.Opinion>();
          }
          result.opinion_.addAll(other.opinion_);
        }
        if (other.hasZgm()) {
          setZgm(other.getZgm());
        }
        if (other.hasZjl()) {
          setZjl(other.getZjl());
        }
        if (other.hasGsdm()) {
          setGsdm(other.getGsdm());
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
              setJgmc(input.readString());
              break;
            }
            case 26: {
              setZzxs(input.readString());
              break;
            }
            case 33: {
              setZczb(input.readDouble());
              break;
            }
            case 42: {
              setClrq(input.readString());
              break;
            }
            case 50: {
              setClnx(input.readString());
              break;
            }
            case 56: {
              setJjsl(input.readSInt32());
              break;
            }
            case 64: {
              setJlsl(input.readSInt32());
              break;
            }
            case 74: {
              setGsyg(input.readString());
              break;
            }
            case 82: {
              com.howbuy.wireless.entity.protobuf.FundInfoProtos.FundInfo.Builder subBuilder = com.howbuy.wireless.entity.protobuf.FundInfoProtos.FundInfo.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addFundInfo(subBuilder.buildPartial());
              break;
            }
            case 90: {
              com.howbuy.wireless.entity.protobuf.OpinionProtos.Opinion.Builder subBuilder = com.howbuy.wireless.entity.protobuf.OpinionProtos.Opinion.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addOpinion(subBuilder.buildPartial());
              break;
            }
            case 98: {
              setZgm(input.readString());
              break;
            }
            case 106: {
              setZjl(input.readString());
              break;
            }
            case 114: {
              setGsdm(input.readString());
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
      
      // optional string jgmc = 2;
      public boolean hasJgmc() {
        return result.hasJgmc();
      }
      public java.lang.String getJgmc() {
        return result.getJgmc();
      }
      public Builder setJgmc(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasJgmc = true;
        result.jgmc_ = value;
        return this;
      }
      public Builder clearJgmc() {
        result.hasJgmc = false;
        result.jgmc_ = getDefaultInstance().getJgmc();
        return this;
      }
      
      // optional string zzxs = 3;
      public boolean hasZzxs() {
        return result.hasZzxs();
      }
      public java.lang.String getZzxs() {
        return result.getZzxs();
      }
      public Builder setZzxs(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasZzxs = true;
        result.zzxs_ = value;
        return this;
      }
      public Builder clearZzxs() {
        result.hasZzxs = false;
        result.zzxs_ = getDefaultInstance().getZzxs();
        return this;
      }
      
      // optional double zczb = 4;
      public boolean hasZczb() {
        return result.hasZczb();
      }
      public double getZczb() {
        return result.getZczb();
      }
      public Builder setZczb(double value) {
        result.hasZczb = true;
        result.zczb_ = value;
        return this;
      }
      public Builder clearZczb() {
        result.hasZczb = false;
        result.zczb_ = 0D;
        return this;
      }
      
      // optional string clrq = 5;
      public boolean hasClrq() {
        return result.hasClrq();
      }
      public java.lang.String getClrq() {
        return result.getClrq();
      }
      public Builder setClrq(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasClrq = true;
        result.clrq_ = value;
        return this;
      }
      public Builder clearClrq() {
        result.hasClrq = false;
        result.clrq_ = getDefaultInstance().getClrq();
        return this;
      }
      
      // optional string clnx = 6;
      public boolean hasClnx() {
        return result.hasClnx();
      }
      public java.lang.String getClnx() {
        return result.getClnx();
      }
      public Builder setClnx(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasClnx = true;
        result.clnx_ = value;
        return this;
      }
      public Builder clearClnx() {
        result.hasClnx = false;
        result.clnx_ = getDefaultInstance().getClnx();
        return this;
      }
      
      // optional sint32 jjsl = 7;
      public boolean hasJjsl() {
        return result.hasJjsl();
      }
      public int getJjsl() {
        return result.getJjsl();
      }
      public Builder setJjsl(int value) {
        result.hasJjsl = true;
        result.jjsl_ = value;
        return this;
      }
      public Builder clearJjsl() {
        result.hasJjsl = false;
        result.jjsl_ = 0;
        return this;
      }
      
      // optional sint32 jlsl = 8;
      public boolean hasJlsl() {
        return result.hasJlsl();
      }
      public int getJlsl() {
        return result.getJlsl();
      }
      public Builder setJlsl(int value) {
        result.hasJlsl = true;
        result.jlsl_ = value;
        return this;
      }
      public Builder clearJlsl() {
        result.hasJlsl = false;
        result.jlsl_ = 0;
        return this;
      }
      
      // optional string gsyg = 9;
      public boolean hasGsyg() {
        return result.hasGsyg();
      }
      public java.lang.String getGsyg() {
        return result.getGsyg();
      }
      public Builder setGsyg(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasGsyg = true;
        result.gsyg_ = value;
        return this;
      }
      public Builder clearGsyg() {
        result.hasGsyg = false;
        result.gsyg_ = getDefaultInstance().getGsyg();
        return this;
      }
      
      // repeated .FundInfo fundInfo = 10;
      public java.util.List<com.howbuy.wireless.entity.protobuf.FundInfoProtos.FundInfo> getFundInfoList() {
        return java.util.Collections.unmodifiableList(result.fundInfo_);
      }
      public int getFundInfoCount() {
        return result.getFundInfoCount();
      }
      public com.howbuy.wireless.entity.protobuf.FundInfoProtos.FundInfo getFundInfo(int index) {
        return result.getFundInfo(index);
      }
      public Builder setFundInfo(int index, com.howbuy.wireless.entity.protobuf.FundInfoProtos.FundInfo value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.fundInfo_.set(index, value);
        return this;
      }
      public Builder setFundInfo(int index, com.howbuy.wireless.entity.protobuf.FundInfoProtos.FundInfo.Builder builderForValue) {
        result.fundInfo_.set(index, builderForValue.build());
        return this;
      }
      public Builder addFundInfo(com.howbuy.wireless.entity.protobuf.FundInfoProtos.FundInfo value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.fundInfo_.isEmpty()) {
          result.fundInfo_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.FundInfoProtos.FundInfo>();
        }
        result.fundInfo_.add(value);
        return this;
      }
      public Builder addFundInfo(com.howbuy.wireless.entity.protobuf.FundInfoProtos.FundInfo.Builder builderForValue) {
        if (result.fundInfo_.isEmpty()) {
          result.fundInfo_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.FundInfoProtos.FundInfo>();
        }
        result.fundInfo_.add(builderForValue.build());
        return this;
      }
      public Builder addAllFundInfo(
          java.lang.Iterable<? extends com.howbuy.wireless.entity.protobuf.FundInfoProtos.FundInfo> values) {
        if (result.fundInfo_.isEmpty()) {
          result.fundInfo_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.FundInfoProtos.FundInfo>();
        }
        super.addAll(values, result.fundInfo_);
        return this;
      }
      public Builder clearFundInfo() {
        result.fundInfo_ = java.util.Collections.emptyList();
        return this;
      }
      
      // repeated .Opinion opinion = 11;
      public java.util.List<com.howbuy.wireless.entity.protobuf.OpinionProtos.Opinion> getOpinionList() {
        return java.util.Collections.unmodifiableList(result.opinion_);
      }
      public int getOpinionCount() {
        return result.getOpinionCount();
      }
      public com.howbuy.wireless.entity.protobuf.OpinionProtos.Opinion getOpinion(int index) {
        return result.getOpinion(index);
      }
      public Builder setOpinion(int index, com.howbuy.wireless.entity.protobuf.OpinionProtos.Opinion value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.opinion_.set(index, value);
        return this;
      }
      public Builder setOpinion(int index, com.howbuy.wireless.entity.protobuf.OpinionProtos.Opinion.Builder builderForValue) {
        result.opinion_.set(index, builderForValue.build());
        return this;
      }
      public Builder addOpinion(com.howbuy.wireless.entity.protobuf.OpinionProtos.Opinion value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.opinion_.isEmpty()) {
          result.opinion_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.OpinionProtos.Opinion>();
        }
        result.opinion_.add(value);
        return this;
      }
      public Builder addOpinion(com.howbuy.wireless.entity.protobuf.OpinionProtos.Opinion.Builder builderForValue) {
        if (result.opinion_.isEmpty()) {
          result.opinion_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.OpinionProtos.Opinion>();
        }
        result.opinion_.add(builderForValue.build());
        return this;
      }
      public Builder addAllOpinion(
          java.lang.Iterable<? extends com.howbuy.wireless.entity.protobuf.OpinionProtos.Opinion> values) {
        if (result.opinion_.isEmpty()) {
          result.opinion_ = new java.util.ArrayList<com.howbuy.wireless.entity.protobuf.OpinionProtos.Opinion>();
        }
        super.addAll(values, result.opinion_);
        return this;
      }
      public Builder clearOpinion() {
        result.opinion_ = java.util.Collections.emptyList();
        return this;
      }
      
      // optional string zgm = 12;
      public boolean hasZgm() {
        return result.hasZgm();
      }
      public java.lang.String getZgm() {
        return result.getZgm();
      }
      public Builder setZgm(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasZgm = true;
        result.zgm_ = value;
        return this;
      }
      public Builder clearZgm() {
        result.hasZgm = false;
        result.zgm_ = getDefaultInstance().getZgm();
        return this;
      }
      
      // optional string zjl = 13;
      public boolean hasZjl() {
        return result.hasZjl();
      }
      public java.lang.String getZjl() {
        return result.getZjl();
      }
      public Builder setZjl(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasZjl = true;
        result.zjl_ = value;
        return this;
      }
      public Builder clearZjl() {
        result.hasZjl = false;
        result.zjl_ = getDefaultInstance().getZjl();
        return this;
      }
      
      // optional string gsdm = 14;
      public boolean hasGsdm() {
        return result.hasGsdm();
      }
      public java.lang.String getGsdm() {
        return result.getGsdm();
      }
      public Builder setGsdm(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasGsdm = true;
        result.gsdm_ = value;
        return this;
      }
      public Builder clearGsdm() {
        result.hasGsdm = false;
        result.gsdm_ = getDefaultInstance().getGsdm();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:CompanyInfo)
    }
    
    static {
      defaultInstance = new CompanyInfo(true);
      com.howbuy.wireless.entity.protobuf.CompanyInfoProto.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:CompanyInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_CompanyInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_CompanyInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021companyInfo.proto\032\ropinion.proto\032\016fund" +
      "Info.proto\032\014common.proto\"\375\001\n\013CompanyInfo" +
      "\022\036\n\006common\030\001 \001(\0132\016.common.Common\022\014\n\004jgmc" +
      "\030\002 \001(\t\022\014\n\004zzxs\030\003 \001(\t\022\014\n\004zczb\030\004 \001(\001\022\014\n\004cl" +
      "rq\030\005 \001(\t\022\014\n\004clnx\030\006 \001(\t\022\014\n\004jjsl\030\007 \001(\021\022\014\n\004" +
      "jlsl\030\010 \001(\021\022\014\n\004gsyg\030\t \001(\t\022\033\n\010fundInfo\030\n \003" +
      "(\0132\t.FundInfo\022\031\n\007opinion\030\013 \003(\0132\010.Opinion" +
      "\022\013\n\003zgm\030\014 \001(\t\022\013\n\003zjl\030\r \001(\t\022\014\n\004gsdm\030\016 \001(\t" +
      "B7\n#com.howbuy.wireless.entity.protobufB" +
      "\020CompanyInfoProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_CompanyInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_CompanyInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_CompanyInfo_descriptor,
              new java.lang.String[] { "Common", "Jgmc", "Zzxs", "Zczb", "Clrq", "Clnx", "Jjsl", "Jlsl", "Gsyg", "FundInfo", "Opinion", "Zgm", "Zjl", "Gsdm", },
              com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo.class,
              com.howbuy.wireless.entity.protobuf.CompanyInfoProto.CompanyInfo.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.howbuy.wireless.entity.protobuf.OpinionProtos.getDescriptor(),
          com.howbuy.wireless.entity.protobuf.FundInfoProtos.getDescriptor(),
          com.howbuy.wireless.entity.protobuf.CommonProtos.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}

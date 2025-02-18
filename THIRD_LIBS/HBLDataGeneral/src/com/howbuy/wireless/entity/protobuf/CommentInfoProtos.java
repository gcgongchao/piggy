// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: commentInfo.proto

package com.howbuy.wireless.entity.protobuf;

public final class CommentInfoProtos {
  private CommentInfoProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class CommentInfo extends
      com.google.protobuf.GeneratedMessage {
    // Use CommentInfo.newBuilder() to construct.
    private CommentInfo() {
      initFields();
    }
    private CommentInfo(boolean noInit) {}
    
    private static final CommentInfo defaultInstance;
    public static CommentInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public CommentInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.howbuy.wireless.entity.protobuf.CommentInfoProtos.internal_static_CommentInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.howbuy.wireless.entity.protobuf.CommentInfoProtos.internal_static_CommentInfo_fieldAccessorTable;
    }
    
    // optional string commentId = 1;
    public static final int COMMENTID_FIELD_NUMBER = 1;
    private boolean hasCommentId;
    private java.lang.String commentId_ = "";
    public boolean hasCommentId() { return hasCommentId; }
    public java.lang.String getCommentId() { return commentId_; }
    
    // optional string userName = 2;
    public static final int USERNAME_FIELD_NUMBER = 2;
    private boolean hasUserName;
    private java.lang.String userName_ = "";
    public boolean hasUserName() { return hasUserName; }
    public java.lang.String getUserName() { return userName_; }
    
    // optional string comments = 3;
    public static final int COMMENTS_FIELD_NUMBER = 3;
    private boolean hasComments;
    private java.lang.String comments_ = "";
    public boolean hasComments() { return hasComments; }
    public java.lang.String getComments() { return comments_; }
    
    // optional string postTime = 4;
    public static final int POSTTIME_FIELD_NUMBER = 4;
    private boolean hasPostTime;
    private java.lang.String postTime_ = "";
    public boolean hasPostTime() { return hasPostTime; }
    public java.lang.String getPostTime() { return postTime_; }
    
    // optional string refUserName = 5;
    public static final int REFUSERNAME_FIELD_NUMBER = 5;
    private boolean hasRefUserName;
    private java.lang.String refUserName_ = "";
    public boolean hasRefUserName() { return hasRefUserName; }
    public java.lang.String getRefUserName() { return refUserName_; }
    
    // optional string refComments = 6;
    public static final int REFCOMMENTS_FIELD_NUMBER = 6;
    private boolean hasRefComments;
    private java.lang.String refComments_ = "";
    public boolean hasRefComments() { return hasRefComments; }
    public java.lang.String getRefComments() { return refComments_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasCommentId()) {
        output.writeString(1, getCommentId());
      }
      if (hasUserName()) {
        output.writeString(2, getUserName());
      }
      if (hasComments()) {
        output.writeString(3, getComments());
      }
      if (hasPostTime()) {
        output.writeString(4, getPostTime());
      }
      if (hasRefUserName()) {
        output.writeString(5, getRefUserName());
      }
      if (hasRefComments()) {
        output.writeString(6, getRefComments());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasCommentId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getCommentId());
      }
      if (hasUserName()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getUserName());
      }
      if (hasComments()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getComments());
      }
      if (hasPostTime()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(4, getPostTime());
      }
      if (hasRefUserName()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(5, getRefUserName());
      }
      if (hasRefComments()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(6, getRefComments());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo parseDelimitedFrom(
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
    public static com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo result;
      
      // Construct using com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo();
        return builder;
      }
      
      protected com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo.getDescriptor();
      }
      
      public com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo getDefaultInstanceForType() {
        return com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo) {
          return mergeFrom((com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo other) {
        if (other == com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo.getDefaultInstance()) return this;
        if (other.hasCommentId()) {
          setCommentId(other.getCommentId());
        }
        if (other.hasUserName()) {
          setUserName(other.getUserName());
        }
        if (other.hasComments()) {
          setComments(other.getComments());
        }
        if (other.hasPostTime()) {
          setPostTime(other.getPostTime());
        }
        if (other.hasRefUserName()) {
          setRefUserName(other.getRefUserName());
        }
        if (other.hasRefComments()) {
          setRefComments(other.getRefComments());
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
              setCommentId(input.readString());
              break;
            }
            case 18: {
              setUserName(input.readString());
              break;
            }
            case 26: {
              setComments(input.readString());
              break;
            }
            case 34: {
              setPostTime(input.readString());
              break;
            }
            case 42: {
              setRefUserName(input.readString());
              break;
            }
            case 50: {
              setRefComments(input.readString());
              break;
            }
          }
        }
      }
      
      
      // optional string commentId = 1;
      public boolean hasCommentId() {
        return result.hasCommentId();
      }
      public java.lang.String getCommentId() {
        return result.getCommentId();
      }
      public Builder setCommentId(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasCommentId = true;
        result.commentId_ = value;
        return this;
      }
      public Builder clearCommentId() {
        result.hasCommentId = false;
        result.commentId_ = getDefaultInstance().getCommentId();
        return this;
      }
      
      // optional string userName = 2;
      public boolean hasUserName() {
        return result.hasUserName();
      }
      public java.lang.String getUserName() {
        return result.getUserName();
      }
      public Builder setUserName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasUserName = true;
        result.userName_ = value;
        return this;
      }
      public Builder clearUserName() {
        result.hasUserName = false;
        result.userName_ = getDefaultInstance().getUserName();
        return this;
      }
      
      // optional string comments = 3;
      public boolean hasComments() {
        return result.hasComments();
      }
      public java.lang.String getComments() {
        return result.getComments();
      }
      public Builder setComments(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasComments = true;
        result.comments_ = value;
        return this;
      }
      public Builder clearComments() {
        result.hasComments = false;
        result.comments_ = getDefaultInstance().getComments();
        return this;
      }
      
      // optional string postTime = 4;
      public boolean hasPostTime() {
        return result.hasPostTime();
      }
      public java.lang.String getPostTime() {
        return result.getPostTime();
      }
      public Builder setPostTime(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasPostTime = true;
        result.postTime_ = value;
        return this;
      }
      public Builder clearPostTime() {
        result.hasPostTime = false;
        result.postTime_ = getDefaultInstance().getPostTime();
        return this;
      }
      
      // optional string refUserName = 5;
      public boolean hasRefUserName() {
        return result.hasRefUserName();
      }
      public java.lang.String getRefUserName() {
        return result.getRefUserName();
      }
      public Builder setRefUserName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasRefUserName = true;
        result.refUserName_ = value;
        return this;
      }
      public Builder clearRefUserName() {
        result.hasRefUserName = false;
        result.refUserName_ = getDefaultInstance().getRefUserName();
        return this;
      }
      
      // optional string refComments = 6;
      public boolean hasRefComments() {
        return result.hasRefComments();
      }
      public java.lang.String getRefComments() {
        return result.getRefComments();
      }
      public Builder setRefComments(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasRefComments = true;
        result.refComments_ = value;
        return this;
      }
      public Builder clearRefComments() {
        result.hasRefComments = false;
        result.refComments_ = getDefaultInstance().getRefComments();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:CommentInfo)
    }
    
    static {
      defaultInstance = new CommentInfo(true);
      com.howbuy.wireless.entity.protobuf.CommentInfoProtos.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:CommentInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_CommentInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_CommentInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021commentInfo.proto\"\200\001\n\013CommentInfo\022\021\n\tc" +
      "ommentId\030\001 \001(\t\022\020\n\010userName\030\002 \001(\t\022\020\n\010comm" +
      "ents\030\003 \001(\t\022\020\n\010postTime\030\004 \001(\t\022\023\n\013refUserN" +
      "ame\030\005 \001(\t\022\023\n\013refComments\030\006 \001(\tB8\n#com.ho" +
      "wbuy.wireless.entity.protobufB\021CommentIn" +
      "foProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_CommentInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_CommentInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_CommentInfo_descriptor,
              new java.lang.String[] { "CommentId", "UserName", "Comments", "PostTime", "RefUserName", "RefComments", },
              com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo.class,
              com.howbuy.wireless.entity.protobuf.CommentInfoProtos.CommentInfo.Builder.class);
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

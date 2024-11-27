// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package org.xproce.lab;

/**
 * Protobuf type {@code org.xproce.lab.Video}
 */
public  final class Video extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.xproce.lab.Video)
    VideoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Video.newBuilder() to construct.
  private Video(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Video() {
    id_ = "";
    title_ = "";
    description_ = "";
    url_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Video();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Video(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            title_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            url_ = s;
            break;
          }
          case 40: {

            durationSeconds_ = input.readInt32();
            break;
          }
          case 50: {
            org.xproce.lab.Creator.Builder subBuilder = null;
            if (creator_ != null) {
              subBuilder = creator_.toBuilder();
            }
            creator_ = input.readMessage(org.xproce.lab.Creator.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(creator_);
              creator_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.xproce.lab.Schema.internal_static_org_xproce_lab_Video_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.xproce.lab.Schema.internal_static_org_xproce_lab_Video_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.xproce.lab.Video.class, org.xproce.lab.Video.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object title_;
  /**
   * <code>string title = 2;</code>
   * @return The title.
   */
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 3;</code>
   * @return The description.
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URL_FIELD_NUMBER = 4;
  private volatile java.lang.Object url_;
  /**
   * <code>string url = 4;</code>
   * @return The url.
   */
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <code>string url = 4;</code>
   * @return The bytes for url.
   */
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DURATION_SECONDS_FIELD_NUMBER = 5;
  private int durationSeconds_;
  /**
   * <code>int32 duration_seconds = 5;</code>
   * @return The durationSeconds.
   */
  public int getDurationSeconds() {
    return durationSeconds_;
  }

  public static final int CREATOR_FIELD_NUMBER = 6;
  private org.xproce.lab.Creator creator_;
  /**
   * <code>.org.xproce.lab.Creator creator = 6;</code>
   * @return Whether the creator field is set.
   */
  public boolean hasCreator() {
    return creator_ != null;
  }
  /**
   * <code>.org.xproce.lab.Creator creator = 6;</code>
   * @return The creator.
   */
  public org.xproce.lab.Creator getCreator() {
    return creator_ == null ? org.xproce.lab.Creator.getDefaultInstance() : creator_;
  }
  /**
   * <code>.org.xproce.lab.Creator creator = 6;</code>
   */
  public org.xproce.lab.CreatorOrBuilder getCreatorOrBuilder() {
    return getCreator();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!getTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    if (!getUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, url_);
    }
    if (durationSeconds_ != 0) {
      output.writeInt32(5, durationSeconds_);
    }
    if (creator_ != null) {
      output.writeMessage(6, getCreator());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!getTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    if (!getUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, url_);
    }
    if (durationSeconds_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, durationSeconds_);
    }
    if (creator_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getCreator());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.xproce.lab.Video)) {
      return super.equals(obj);
    }
    org.xproce.lab.Video other = (org.xproce.lab.Video) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!getUrl()
        .equals(other.getUrl())) return false;
    if (getDurationSeconds()
        != other.getDurationSeconds()) return false;
    if (hasCreator() != other.hasCreator()) return false;
    if (hasCreator()) {
      if (!getCreator()
          .equals(other.getCreator())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (37 * hash) + DURATION_SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + getDurationSeconds();
    if (hasCreator()) {
      hash = (37 * hash) + CREATOR_FIELD_NUMBER;
      hash = (53 * hash) + getCreator().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.xproce.lab.Video parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.xproce.lab.Video parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.xproce.lab.Video parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.xproce.lab.Video parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.xproce.lab.Video parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.xproce.lab.Video parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.xproce.lab.Video parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.xproce.lab.Video parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.xproce.lab.Video parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.xproce.lab.Video parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.xproce.lab.Video parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.xproce.lab.Video parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.xproce.lab.Video prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.xproce.lab.Video}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.xproce.lab.Video)
      org.xproce.lab.VideoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.xproce.lab.Schema.internal_static_org_xproce_lab_Video_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.xproce.lab.Schema.internal_static_org_xproce_lab_Video_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.xproce.lab.Video.class, org.xproce.lab.Video.Builder.class);
    }

    // Construct using org.xproce.lab.Video.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      title_ = "";

      description_ = "";

      url_ = "";

      durationSeconds_ = 0;

      if (creatorBuilder_ == null) {
        creator_ = null;
      } else {
        creator_ = null;
        creatorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.xproce.lab.Schema.internal_static_org_xproce_lab_Video_descriptor;
    }

    @java.lang.Override
    public org.xproce.lab.Video getDefaultInstanceForType() {
      return org.xproce.lab.Video.getDefaultInstance();
    }

    @java.lang.Override
    public org.xproce.lab.Video build() {
      org.xproce.lab.Video result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.xproce.lab.Video buildPartial() {
      org.xproce.lab.Video result = new org.xproce.lab.Video(this);
      result.id_ = id_;
      result.title_ = title_;
      result.description_ = description_;
      result.url_ = url_;
      result.durationSeconds_ = durationSeconds_;
      if (creatorBuilder_ == null) {
        result.creator_ = creator_;
      } else {
        result.creator_ = creatorBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.xproce.lab.Video) {
        return mergeFrom((org.xproce.lab.Video)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.xproce.lab.Video other) {
      if (other == org.xproce.lab.Video.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        onChanged();
      }
      if (other.getDurationSeconds() != 0) {
        setDurationSeconds(other.getDurationSeconds());
      }
      if (other.hasCreator()) {
        mergeCreator(other.getCreator());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.xproce.lab.Video parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.xproce.lab.Video) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 2;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      title_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 3;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 3;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 3;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <code>string url = 4;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string url = 4;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string url = 4;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string url = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string url = 4;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      url_ = value;
      onChanged();
      return this;
    }

    private int durationSeconds_ ;
    /**
     * <code>int32 duration_seconds = 5;</code>
     * @return The durationSeconds.
     */
    public int getDurationSeconds() {
      return durationSeconds_;
    }
    /**
     * <code>int32 duration_seconds = 5;</code>
     * @param value The durationSeconds to set.
     * @return This builder for chaining.
     */
    public Builder setDurationSeconds(int value) {
      
      durationSeconds_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 duration_seconds = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDurationSeconds() {
      
      durationSeconds_ = 0;
      onChanged();
      return this;
    }

    private org.xproce.lab.Creator creator_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.xproce.lab.Creator, org.xproce.lab.Creator.Builder, org.xproce.lab.CreatorOrBuilder> creatorBuilder_;
    /**
     * <code>.org.xproce.lab.Creator creator = 6;</code>
     * @return Whether the creator field is set.
     */
    public boolean hasCreator() {
      return creatorBuilder_ != null || creator_ != null;
    }
    /**
     * <code>.org.xproce.lab.Creator creator = 6;</code>
     * @return The creator.
     */
    public org.xproce.lab.Creator getCreator() {
      if (creatorBuilder_ == null) {
        return creator_ == null ? org.xproce.lab.Creator.getDefaultInstance() : creator_;
      } else {
        return creatorBuilder_.getMessage();
      }
    }
    /**
     * <code>.org.xproce.lab.Creator creator = 6;</code>
     */
    public Builder setCreator(org.xproce.lab.Creator value) {
      if (creatorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        creator_ = value;
        onChanged();
      } else {
        creatorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.org.xproce.lab.Creator creator = 6;</code>
     */
    public Builder setCreator(
        org.xproce.lab.Creator.Builder builderForValue) {
      if (creatorBuilder_ == null) {
        creator_ = builderForValue.build();
        onChanged();
      } else {
        creatorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.org.xproce.lab.Creator creator = 6;</code>
     */
    public Builder mergeCreator(org.xproce.lab.Creator value) {
      if (creatorBuilder_ == null) {
        if (creator_ != null) {
          creator_ =
            org.xproce.lab.Creator.newBuilder(creator_).mergeFrom(value).buildPartial();
        } else {
          creator_ = value;
        }
        onChanged();
      } else {
        creatorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.org.xproce.lab.Creator creator = 6;</code>
     */
    public Builder clearCreator() {
      if (creatorBuilder_ == null) {
        creator_ = null;
        onChanged();
      } else {
        creator_ = null;
        creatorBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.org.xproce.lab.Creator creator = 6;</code>
     */
    public org.xproce.lab.Creator.Builder getCreatorBuilder() {
      
      onChanged();
      return getCreatorFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.xproce.lab.Creator creator = 6;</code>
     */
    public org.xproce.lab.CreatorOrBuilder getCreatorOrBuilder() {
      if (creatorBuilder_ != null) {
        return creatorBuilder_.getMessageOrBuilder();
      } else {
        return creator_ == null ?
            org.xproce.lab.Creator.getDefaultInstance() : creator_;
      }
    }
    /**
     * <code>.org.xproce.lab.Creator creator = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.xproce.lab.Creator, org.xproce.lab.Creator.Builder, org.xproce.lab.CreatorOrBuilder> 
        getCreatorFieldBuilder() {
      if (creatorBuilder_ == null) {
        creatorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.xproce.lab.Creator, org.xproce.lab.Creator.Builder, org.xproce.lab.CreatorOrBuilder>(
                getCreator(),
                getParentForChildren(),
                isClean());
        creator_ = null;
      }
      return creatorBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.xproce.lab.Video)
  }

  // @@protoc_insertion_point(class_scope:org.xproce.lab.Video)
  private static final org.xproce.lab.Video DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.xproce.lab.Video();
  }

  public static org.xproce.lab.Video getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Video>
      PARSER = new com.google.protobuf.AbstractParser<Video>() {
    @java.lang.Override
    public Video parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Video(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Video> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Video> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.xproce.lab.Video getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


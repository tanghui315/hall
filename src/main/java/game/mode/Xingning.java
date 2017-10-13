// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: xingning.proto

package game.mode;

public final class Xingning {
    private Xingning() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface XingningMahjongIntoResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:XingningMahjongIntoResponse)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * 基础分
         * </pre>
         * <p>
         * <code>uint32 baseScore = 1;</code>
         */
        int getBaseScore();

        /**
         * <pre>
         * 游戏局数
         * </pre>
         * <p>
         * <code>uint32 gameTimes = 2;</code>
         */
        int getGameTimes();

        /**
         * <pre>
         * 游戏规则  低位到高位到顺序（鸡胡，门清，天地和，幺九，全番，十三幺，对对胡，十八罗汉，七小对，清一色，混一色，海底捞，杠爆全包，庄硬，无鬼加倍）
         * </pre>
         * <p>
         * <code>uint32 gameRules = 3;</code>
         */
        int getGameRules();

        /**
         * <pre>
         * 1.红中做鬼，2.无鬼，3.翻鬼
         * </pre>
         * <p>
         * <code>uint32 ghost = 4;</code>
         */
        int getGhost();

        /**
         * <pre>
         * 马数
         * </pre>
         * <p>
         * <code>uint32 maCount = 5;</code>
         */
        int getMaCount();

        /**
         * <pre>
         * 人数
         * </pre>
         * <p>
         * <code>uint32 count = 6;</code>
         */
        int getCount();
    }

    /**
     * <pre>
     * 进入房间返回 ROOM_INFO
     * </pre>
     * <p>
     * Protobuf type {@code XingningMahjongIntoResponse}
     */
    public static final class XingningMahjongIntoResponse extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:XingningMahjongIntoResponse)
            XingningMahjongIntoResponseOrBuilder {
        // Use XingningMahjongIntoResponse.newBuilder() to construct.
        private XingningMahjongIntoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private XingningMahjongIntoResponse() {
            baseScore_ = 0;
            gameTimes_ = 0;
            gameRules_ = 0;
            ghost_ = 0;
            maCount_ = 0;
            count_ = 0;
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private XingningMahjongIntoResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            baseScore_ = input.readUInt32();
                            break;
                        }
                        case 16: {

                            gameTimes_ = input.readUInt32();
                            break;
                        }
                        case 24: {

                            gameRules_ = input.readUInt32();
                            break;
                        }
                        case 32: {

                            ghost_ = input.readUInt32();
                            break;
                        }
                        case 40: {

                            maCount_ = input.readUInt32();
                            break;
                        }
                        case 48: {

                            count_ = input.readUInt32();
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
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return game.mode.Xingning.internal_static_XingningMahjongIntoResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return game.mode.Xingning.internal_static_XingningMahjongIntoResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            game.mode.Xingning.XingningMahjongIntoResponse.class, game.mode.Xingning.XingningMahjongIntoResponse.Builder.class);
        }

        public static final int BASESCORE_FIELD_NUMBER = 1;
        private int baseScore_;

        /**
         * <pre>
         * 基础分
         * </pre>
         * <p>
         * <code>uint32 baseScore = 1;</code>
         */
        public int getBaseScore() {
            return baseScore_;
        }

        public static final int GAMETIMES_FIELD_NUMBER = 2;
        private int gameTimes_;

        /**
         * <pre>
         * 游戏局数
         * </pre>
         * <p>
         * <code>uint32 gameTimes = 2;</code>
         */
        public int getGameTimes() {
            return gameTimes_;
        }

        public static final int GAMERULES_FIELD_NUMBER = 3;
        private int gameRules_;

        /**
         * <pre>
         * 游戏规则  低位到高位到顺序（鸡胡，门清，天地和，幺九，全番，十三幺，对对胡，十八罗汉，七小对，清一色，混一色，海底捞，杠爆全包，庄硬，无鬼加倍）
         * </pre>
         * <p>
         * <code>uint32 gameRules = 3;</code>
         */
        public int getGameRules() {
            return gameRules_;
        }

        public static final int GHOST_FIELD_NUMBER = 4;
        private int ghost_;

        /**
         * <pre>
         * 1.红中做鬼，2.无鬼，3.翻鬼
         * </pre>
         * <p>
         * <code>uint32 ghost = 4;</code>
         */
        public int getGhost() {
            return ghost_;
        }

        public static final int MACOUNT_FIELD_NUMBER = 5;
        private int maCount_;

        /**
         * <pre>
         * 马数
         * </pre>
         * <p>
         * <code>uint32 maCount = 5;</code>
         */
        public int getMaCount() {
            return maCount_;
        }

        public static final int COUNT_FIELD_NUMBER = 6;
        private int count_;

        /**
         * <pre>
         * 人数
         * </pre>
         * <p>
         * <code>uint32 count = 6;</code>
         */
        public int getCount() {
            return count_;
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (baseScore_ != 0) {
                output.writeUInt32(1, baseScore_);
            }
            if (gameTimes_ != 0) {
                output.writeUInt32(2, gameTimes_);
            }
            if (gameRules_ != 0) {
                output.writeUInt32(3, gameRules_);
            }
            if (ghost_ != 0) {
                output.writeUInt32(4, ghost_);
            }
            if (maCount_ != 0) {
                output.writeUInt32(5, maCount_);
            }
            if (count_ != 0) {
                output.writeUInt32(6, count_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (baseScore_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(1, baseScore_);
            }
            if (gameTimes_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(2, gameTimes_);
            }
            if (gameRules_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(3, gameRules_);
            }
            if (ghost_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(4, ghost_);
            }
            if (maCount_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(5, maCount_);
            }
            if (count_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(6, count_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof game.mode.Xingning.XingningMahjongIntoResponse)) {
                return super.equals(obj);
            }
            game.mode.Xingning.XingningMahjongIntoResponse other = (game.mode.Xingning.XingningMahjongIntoResponse) obj;

            boolean result = true;
            result = result && (getBaseScore()
                    == other.getBaseScore());
            result = result && (getGameTimes()
                    == other.getGameTimes());
            result = result && (getGameRules()
                    == other.getGameRules());
            result = result && (getGhost()
                    == other.getGhost());
            result = result && (getMaCount()
                    == other.getMaCount());
            result = result && (getCount()
                    == other.getCount());
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + BASESCORE_FIELD_NUMBER;
            hash = (53 * hash) + getBaseScore();
            hash = (37 * hash) + GAMETIMES_FIELD_NUMBER;
            hash = (53 * hash) + getGameTimes();
            hash = (37 * hash) + GAMERULES_FIELD_NUMBER;
            hash = (53 * hash) + getGameRules();
            hash = (37 * hash) + GHOST_FIELD_NUMBER;
            hash = (53 * hash) + getGhost();
            hash = (37 * hash) + MACOUNT_FIELD_NUMBER;
            hash = (53 * hash) + getMaCount();
            hash = (37 * hash) + COUNT_FIELD_NUMBER;
            hash = (53 * hash) + getCount();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static game.mode.Xingning.XingningMahjongIntoResponse parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static game.mode.Xingning.XingningMahjongIntoResponse parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static game.mode.Xingning.XingningMahjongIntoResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static game.mode.Xingning.XingningMahjongIntoResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static game.mode.Xingning.XingningMahjongIntoResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static game.mode.Xingning.XingningMahjongIntoResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static game.mode.Xingning.XingningMahjongIntoResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static game.mode.Xingning.XingningMahjongIntoResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static game.mode.Xingning.XingningMahjongIntoResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static game.mode.Xingning.XingningMahjongIntoResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static game.mode.Xingning.XingningMahjongIntoResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static game.mode.Xingning.XingningMahjongIntoResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(game.mode.Xingning.XingningMahjongIntoResponse prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

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
         * <pre>
         * 进入房间返回 ROOM_INFO
         * </pre>
         * <p>
         * Protobuf type {@code XingningMahjongIntoResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:XingningMahjongIntoResponse)
                game.mode.Xingning.XingningMahjongIntoResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return game.mode.Xingning.internal_static_XingningMahjongIntoResponse_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return game.mode.Xingning.internal_static_XingningMahjongIntoResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                game.mode.Xingning.XingningMahjongIntoResponse.class, game.mode.Xingning.XingningMahjongIntoResponse.Builder.class);
            }

            // Construct using game.mode.Xingning.XingningMahjongIntoResponse.newBuilder()
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

            public Builder clear() {
                super.clear();
                baseScore_ = 0;

                gameTimes_ = 0;

                gameRules_ = 0;

                ghost_ = 0;

                maCount_ = 0;

                count_ = 0;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return game.mode.Xingning.internal_static_XingningMahjongIntoResponse_descriptor;
            }

            public game.mode.Xingning.XingningMahjongIntoResponse getDefaultInstanceForType() {
                return game.mode.Xingning.XingningMahjongIntoResponse.getDefaultInstance();
            }

            public game.mode.Xingning.XingningMahjongIntoResponse build() {
                game.mode.Xingning.XingningMahjongIntoResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public game.mode.Xingning.XingningMahjongIntoResponse buildPartial() {
                game.mode.Xingning.XingningMahjongIntoResponse result = new game.mode.Xingning.XingningMahjongIntoResponse(this);
                result.baseScore_ = baseScore_;
                result.gameTimes_ = gameTimes_;
                result.gameRules_ = gameRules_;
                result.ghost_ = ghost_;
                result.maCount_ = maCount_;
                result.count_ = count_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof game.mode.Xingning.XingningMahjongIntoResponse) {
                    return mergeFrom((game.mode.Xingning.XingningMahjongIntoResponse) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(game.mode.Xingning.XingningMahjongIntoResponse other) {
                if (other == game.mode.Xingning.XingningMahjongIntoResponse.getDefaultInstance()) return this;
                if (other.getBaseScore() != 0) {
                    setBaseScore(other.getBaseScore());
                }
                if (other.getGameTimes() != 0) {
                    setGameTimes(other.getGameTimes());
                }
                if (other.getGameRules() != 0) {
                    setGameRules(other.getGameRules());
                }
                if (other.getGhost() != 0) {
                    setGhost(other.getGhost());
                }
                if (other.getMaCount() != 0) {
                    setMaCount(other.getMaCount());
                }
                if (other.getCount() != 0) {
                    setCount(other.getCount());
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                game.mode.Xingning.XingningMahjongIntoResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (game.mode.Xingning.XingningMahjongIntoResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int baseScore_;

            /**
             * <pre>
             * 基础分
             * </pre>
             * <p>
             * <code>uint32 baseScore = 1;</code>
             */
            public int getBaseScore() {
                return baseScore_;
            }

            /**
             * <pre>
             * 基础分
             * </pre>
             * <p>
             * <code>uint32 baseScore = 1;</code>
             */
            public Builder setBaseScore(int value) {

                baseScore_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 基础分
             * </pre>
             * <p>
             * <code>uint32 baseScore = 1;</code>
             */
            public Builder clearBaseScore() {

                baseScore_ = 0;
                onChanged();
                return this;
            }

            private int gameTimes_;

            /**
             * <pre>
             * 游戏局数
             * </pre>
             * <p>
             * <code>uint32 gameTimes = 2;</code>
             */
            public int getGameTimes() {
                return gameTimes_;
            }

            /**
             * <pre>
             * 游戏局数
             * </pre>
             * <p>
             * <code>uint32 gameTimes = 2;</code>
             */
            public Builder setGameTimes(int value) {

                gameTimes_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 游戏局数
             * </pre>
             * <p>
             * <code>uint32 gameTimes = 2;</code>
             */
            public Builder clearGameTimes() {

                gameTimes_ = 0;
                onChanged();
                return this;
            }

            private int gameRules_;

            /**
             * <pre>
             * 游戏规则  低位到高位到顺序（鸡胡，门清，天地和，幺九，全番，十三幺，对对胡，十八罗汉，七小对，清一色，混一色，海底捞，杠爆全包，庄硬，无鬼加倍）
             * </pre>
             * <p>
             * <code>uint32 gameRules = 3;</code>
             */
            public int getGameRules() {
                return gameRules_;
            }

            /**
             * <pre>
             * 游戏规则  低位到高位到顺序（鸡胡，门清，天地和，幺九，全番，十三幺，对对胡，十八罗汉，七小对，清一色，混一色，海底捞，杠爆全包，庄硬，无鬼加倍）
             * </pre>
             * <p>
             * <code>uint32 gameRules = 3;</code>
             */
            public Builder setGameRules(int value) {

                gameRules_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 游戏规则  低位到高位到顺序（鸡胡，门清，天地和，幺九，全番，十三幺，对对胡，十八罗汉，七小对，清一色，混一色，海底捞，杠爆全包，庄硬，无鬼加倍）
             * </pre>
             * <p>
             * <code>uint32 gameRules = 3;</code>
             */
            public Builder clearGameRules() {

                gameRules_ = 0;
                onChanged();
                return this;
            }

            private int ghost_;

            /**
             * <pre>
             * 1.红中做鬼，2.无鬼，3.翻鬼
             * </pre>
             * <p>
             * <code>uint32 ghost = 4;</code>
             */
            public int getGhost() {
                return ghost_;
            }

            /**
             * <pre>
             * 1.红中做鬼，2.无鬼，3.翻鬼
             * </pre>
             * <p>
             * <code>uint32 ghost = 4;</code>
             */
            public Builder setGhost(int value) {

                ghost_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 1.红中做鬼，2.无鬼，3.翻鬼
             * </pre>
             * <p>
             * <code>uint32 ghost = 4;</code>
             */
            public Builder clearGhost() {

                ghost_ = 0;
                onChanged();
                return this;
            }

            private int maCount_;

            /**
             * <pre>
             * 马数
             * </pre>
             * <p>
             * <code>uint32 maCount = 5;</code>
             */
            public int getMaCount() {
                return maCount_;
            }

            /**
             * <pre>
             * 马数
             * </pre>
             * <p>
             * <code>uint32 maCount = 5;</code>
             */
            public Builder setMaCount(int value) {

                maCount_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 马数
             * </pre>
             * <p>
             * <code>uint32 maCount = 5;</code>
             */
            public Builder clearMaCount() {

                maCount_ = 0;
                onChanged();
                return this;
            }

            private int count_;

            /**
             * <pre>
             * 人数
             * </pre>
             * <p>
             * <code>uint32 count = 6;</code>
             */
            public int getCount() {
                return count_;
            }

            /**
             * <pre>
             * 人数
             * </pre>
             * <p>
             * <code>uint32 count = 6;</code>
             */
            public Builder setCount(int value) {

                count_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 人数
             * </pre>
             * <p>
             * <code>uint32 count = 6;</code>
             */
            public Builder clearCount() {

                count_ = 0;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:XingningMahjongIntoResponse)
        }

        // @@protoc_insertion_point(class_scope:XingningMahjongIntoResponse)
        private static final game.mode.Xingning.XingningMahjongIntoResponse DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new game.mode.Xingning.XingningMahjongIntoResponse();
        }

        public static game.mode.Xingning.XingningMahjongIntoResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<XingningMahjongIntoResponse>
                PARSER = new com.google.protobuf.AbstractParser<XingningMahjongIntoResponse>() {
            public XingningMahjongIntoResponse parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new XingningMahjongIntoResponse(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<XingningMahjongIntoResponse> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<XingningMahjongIntoResponse> getParserForType() {
            return PARSER;
        }

        public game.mode.Xingning.XingningMahjongIntoResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_XingningMahjongIntoResponse_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_XingningMahjongIntoResponse_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\016xingning.proto\"\205\001\n\033XingningMahjongInto" +
                        "Response\022\021\n\tbaseScore\030\001 \001(\r\022\021\n\tgameTimes" +
                        "\030\002 \001(\r\022\021\n\tgameRules\030\003 \001(\r\022\r\n\005ghost\030\004 \001(\r" +
                        "\022\017\n\007maCount\030\005 \001(\r\022\r\n\005count\030\006 \001(\rB\013\n\tgame" +
      ".modeb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_XingningMahjongIntoResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_XingningMahjongIntoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_XingningMahjongIntoResponse_descriptor,
        new java.lang.String[] { "BaseScore", "GameTimes", "GameRules", "Ghost", "MaCount", "Count", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

package com.baidu.carlife.protobuf;

import com.google.protobuf.c;
import com.google.protobuf.d;
import com.google.protobuf.e0;
import com.google.protobuf.f0;
import com.google.protobuf.i0;
import com.google.protobuf.j0;
import com.google.protobuf.l;
import com.google.protobuf.l1;
import com.google.protobuf.m1;
import com.google.protobuf.p;
import com.google.protobuf.s1;
import com.google.protobuf.t0;
import com.google.protobuf.y;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class CarlifeMediaInfoListProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeMediaInfoListProto$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[i0.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public static final class CarlifeMediaInfoList extends j0 implements CarlifeMediaInfoListOrBuilder {
        public static final int CNT_FIELD_NUMBER = 1;
        private static final CarlifeMediaInfoList DEFAULT_INSTANCE;
        public static final int MEDIAINFO_FIELD_NUMBER = 2;
        private static volatile s1 PARSER;
        private int bitField0_;
        private int cnt_;
        private byte memoizedIsInitialized = 2;
        private t0 mediaInfo_ = j0.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeMediaInfoListOrBuilder {
            private Builder() {
                super(CarlifeMediaInfoList.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllMediaInfo(Iterable<? extends CarlifeMediaInfoProto.CarlifeMediaInfo> iterable) {
                copyOnWrite();
                ((CarlifeMediaInfoList) this.instance).addAllMediaInfo(iterable);
                return this;
            }

            public Builder addMediaInfo(int i7, CarlifeMediaInfoProto.CarlifeMediaInfo.Builder builder) {
                copyOnWrite();
                ((CarlifeMediaInfoList) this.instance).addMediaInfo(i7, (CarlifeMediaInfoProto.CarlifeMediaInfo) builder.m16build());
                return this;
            }

            public Builder addMediaInfo(int i7, CarlifeMediaInfoProto.CarlifeMediaInfo carlifeMediaInfo) {
                copyOnWrite();
                ((CarlifeMediaInfoList) this.instance).addMediaInfo(i7, carlifeMediaInfo);
                return this;
            }

            public Builder addMediaInfo(CarlifeMediaInfoProto.CarlifeMediaInfo.Builder builder) {
                copyOnWrite();
                ((CarlifeMediaInfoList) this.instance).addMediaInfo((CarlifeMediaInfoProto.CarlifeMediaInfo) builder.m16build());
                return this;
            }

            public Builder addMediaInfo(CarlifeMediaInfoProto.CarlifeMediaInfo carlifeMediaInfo) {
                copyOnWrite();
                ((CarlifeMediaInfoList) this.instance).addMediaInfo(carlifeMediaInfo);
                return this;
            }

            public Builder clearCnt() {
                copyOnWrite();
                ((CarlifeMediaInfoList) this.instance).clearCnt();
                return this;
            }

            public Builder clearMediaInfo() {
                copyOnWrite();
                ((CarlifeMediaInfoList) this.instance).clearMediaInfo();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoListProto.CarlifeMediaInfoListOrBuilder
            public int getCnt() {
                return ((CarlifeMediaInfoList) this.instance).getCnt();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoListProto.CarlifeMediaInfoListOrBuilder
            public CarlifeMediaInfoProto.CarlifeMediaInfo getMediaInfo(int i7) {
                return ((CarlifeMediaInfoList) this.instance).getMediaInfo(i7);
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoListProto.CarlifeMediaInfoListOrBuilder
            public int getMediaInfoCount() {
                return ((CarlifeMediaInfoList) this.instance).getMediaInfoCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoListProto.CarlifeMediaInfoListOrBuilder
            public List<CarlifeMediaInfoProto.CarlifeMediaInfo> getMediaInfoList() {
                return Collections.unmodifiableList(((CarlifeMediaInfoList) this.instance).getMediaInfoList());
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoListProto.CarlifeMediaInfoListOrBuilder
            public boolean hasCnt() {
                return ((CarlifeMediaInfoList) this.instance).hasCnt();
            }

            public Builder removeMediaInfo(int i7) {
                copyOnWrite();
                ((CarlifeMediaInfoList) this.instance).removeMediaInfo(i7);
                return this;
            }

            public Builder setCnt(int i7) {
                copyOnWrite();
                ((CarlifeMediaInfoList) this.instance).setCnt(i7);
                return this;
            }

            public Builder setMediaInfo(int i7, CarlifeMediaInfoProto.CarlifeMediaInfo.Builder builder) {
                copyOnWrite();
                ((CarlifeMediaInfoList) this.instance).setMediaInfo(i7, (CarlifeMediaInfoProto.CarlifeMediaInfo) builder.m16build());
                return this;
            }

            public Builder setMediaInfo(int i7, CarlifeMediaInfoProto.CarlifeMediaInfo carlifeMediaInfo) {
                copyOnWrite();
                ((CarlifeMediaInfoList) this.instance).setMediaInfo(i7, carlifeMediaInfo);
                return this;
            }
        }

        static {
            CarlifeMediaInfoList carlifeMediaInfoList = new CarlifeMediaInfoList();
            DEFAULT_INSTANCE = carlifeMediaInfoList;
            j0.registerDefaultInstance(CarlifeMediaInfoList.class, carlifeMediaInfoList);
        }

        private CarlifeMediaInfoList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMediaInfo(Iterable<? extends CarlifeMediaInfoProto.CarlifeMediaInfo> iterable) {
            ensureMediaInfoIsMutable();
            c.addAll((Iterable) iterable, (List) this.mediaInfo_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMediaInfo(int i7, CarlifeMediaInfoProto.CarlifeMediaInfo carlifeMediaInfo) {
            carlifeMediaInfo.getClass();
            ensureMediaInfoIsMutable();
            this.mediaInfo_.add(i7, carlifeMediaInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMediaInfo(CarlifeMediaInfoProto.CarlifeMediaInfo carlifeMediaInfo) {
            carlifeMediaInfo.getClass();
            ensureMediaInfoIsMutable();
            this.mediaInfo_.add(carlifeMediaInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCnt() {
            this.bitField0_ &= -2;
            this.cnt_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediaInfo() {
            this.mediaInfo_ = j0.emptyProtobufList();
        }

        private void ensureMediaInfoIsMutable() {
            t0 t0Var = this.mediaInfo_;
            if (((d) t0Var).f2729a) {
                return;
            }
            this.mediaInfo_ = j0.mutableCopy(t0Var);
        }

        public static CarlifeMediaInfoList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeMediaInfoList carlifeMediaInfoList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeMediaInfoList);
        }

        public static CarlifeMediaInfoList parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeMediaInfoList) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeMediaInfoList parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeMediaInfoList) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeMediaInfoList parseFrom(l lVar) {
            return (CarlifeMediaInfoList) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeMediaInfoList parseFrom(l lVar, y yVar) {
            return (CarlifeMediaInfoList) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeMediaInfoList parseFrom(p pVar) {
            return (CarlifeMediaInfoList) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeMediaInfoList parseFrom(p pVar, y yVar) {
            return (CarlifeMediaInfoList) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeMediaInfoList parseFrom(InputStream inputStream) {
            return (CarlifeMediaInfoList) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeMediaInfoList parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeMediaInfoList) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeMediaInfoList parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeMediaInfoList) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeMediaInfoList parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeMediaInfoList) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeMediaInfoList parseFrom(byte[] bArr) {
            return (CarlifeMediaInfoList) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeMediaInfoList parseFrom(byte[] bArr, y yVar) {
            return (CarlifeMediaInfoList) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMediaInfo(int i7) {
            ensureMediaInfoIsMutable();
            this.mediaInfo_.remove(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCnt(int i7) {
            this.bitField0_ |= 1;
            this.cnt_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediaInfo(int i7, CarlifeMediaInfoProto.CarlifeMediaInfo carlifeMediaInfo) {
            carlifeMediaInfo.getClass();
            ensureMediaInfoIsMutable();
            this.mediaInfo_.set(i7, carlifeMediaInfo);
        }

        @Override // com.google.protobuf.j0
        public final Object dynamicMethod(i0 i0Var, Object obj, Object obj2) {
            s1 f0Var;
            AnonymousClass1 anonymousClass1 = null;
            switch (i0Var.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                case 2:
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᔄ\u0000\u0002Л", new Object[]{"bitField0_", "cnt_", "mediaInfo_", CarlifeMediaInfoProto.CarlifeMediaInfo.class});
                case 3:
                    return new CarlifeMediaInfoList();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeMediaInfoList.class) {
                        try {
                            f0Var = PARSER;
                            if (f0Var == null) {
                                f0Var = new f0();
                                PARSER = f0Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return f0Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoListProto.CarlifeMediaInfoListOrBuilder
        public int getCnt() {
            return this.cnt_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoListProto.CarlifeMediaInfoListOrBuilder
        public CarlifeMediaInfoProto.CarlifeMediaInfo getMediaInfo(int i7) {
            return (CarlifeMediaInfoProto.CarlifeMediaInfo) this.mediaInfo_.get(i7);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoListProto.CarlifeMediaInfoListOrBuilder
        public int getMediaInfoCount() {
            return this.mediaInfo_.size();
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoListProto.CarlifeMediaInfoListOrBuilder
        public List<CarlifeMediaInfoProto.CarlifeMediaInfo> getMediaInfoList() {
            return this.mediaInfo_;
        }

        public CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder getMediaInfoOrBuilder(int i7) {
            return (CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder) this.mediaInfo_.get(i7);
        }

        public List<? extends CarlifeMediaInfoProto.CarlifeMediaInfoOrBuilder> getMediaInfoOrBuilderList() {
            return this.mediaInfo_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaInfoListProto.CarlifeMediaInfoListOrBuilder
        public boolean hasCnt() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeMediaInfoListOrBuilder extends m1 {
        int getCnt();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        CarlifeMediaInfoProto.CarlifeMediaInfo getMediaInfo(int i7);

        int getMediaInfoCount();

        List<CarlifeMediaInfoProto.CarlifeMediaInfo> getMediaInfoList();

        boolean hasCnt();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeMediaInfoListProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

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
public final class CarlifeSubscribeMobileCarLifeInfoListProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeSubscribeMobileCarLifeInfoListProto$1, reason: invalid class name */
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
    public static final class CarlifeSubscribeMobileCarLifeInfoList extends j0 implements CarlifeSubscribeMobileCarLifeInfoListOrBuilder {
        public static final int CNT_FIELD_NUMBER = 1;
        private static final CarlifeSubscribeMobileCarLifeInfoList DEFAULT_INSTANCE;
        private static volatile s1 PARSER = null;
        public static final int SUBSCRIBEMOBILECARLIFEINFO_FIELD_NUMBER = 2;
        private int bitField0_;
        private int cnt_;
        private byte memoizedIsInitialized = 2;
        private t0 subscribemobileCarLifeInfo_ = j0.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeSubscribeMobileCarLifeInfoListOrBuilder {
            private Builder() {
                super(CarlifeSubscribeMobileCarLifeInfoList.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllSubscribemobileCarLifeInfo(Iterable<? extends CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo> iterable) {
                copyOnWrite();
                ((CarlifeSubscribeMobileCarLifeInfoList) this.instance).addAllSubscribemobileCarLifeInfo(iterable);
                return this;
            }

            public Builder addSubscribemobileCarLifeInfo(int i7, CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo.Builder builder) {
                copyOnWrite();
                ((CarlifeSubscribeMobileCarLifeInfoList) this.instance).addSubscribemobileCarLifeInfo(i7, (CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo) builder.m16build());
                return this;
            }

            public Builder addSubscribemobileCarLifeInfo(int i7, CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo carlifeSubscribeMobileCarLifeInfo) {
                copyOnWrite();
                ((CarlifeSubscribeMobileCarLifeInfoList) this.instance).addSubscribemobileCarLifeInfo(i7, carlifeSubscribeMobileCarLifeInfo);
                return this;
            }

            public Builder addSubscribemobileCarLifeInfo(CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo.Builder builder) {
                copyOnWrite();
                ((CarlifeSubscribeMobileCarLifeInfoList) this.instance).addSubscribemobileCarLifeInfo((CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo) builder.m16build());
                return this;
            }

            public Builder addSubscribemobileCarLifeInfo(CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo carlifeSubscribeMobileCarLifeInfo) {
                copyOnWrite();
                ((CarlifeSubscribeMobileCarLifeInfoList) this.instance).addSubscribemobileCarLifeInfo(carlifeSubscribeMobileCarLifeInfo);
                return this;
            }

            public Builder clearCnt() {
                copyOnWrite();
                ((CarlifeSubscribeMobileCarLifeInfoList) this.instance).clearCnt();
                return this;
            }

            public Builder clearSubscribemobileCarLifeInfo() {
                copyOnWrite();
                ((CarlifeSubscribeMobileCarLifeInfoList) this.instance).clearSubscribemobileCarLifeInfo();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoListOrBuilder
            public int getCnt() {
                return ((CarlifeSubscribeMobileCarLifeInfoList) this.instance).getCnt();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoListOrBuilder
            public CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo getSubscribemobileCarLifeInfo(int i7) {
                return ((CarlifeSubscribeMobileCarLifeInfoList) this.instance).getSubscribemobileCarLifeInfo(i7);
            }

            @Override // com.baidu.carlife.protobuf.CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoListOrBuilder
            public int getSubscribemobileCarLifeInfoCount() {
                return ((CarlifeSubscribeMobileCarLifeInfoList) this.instance).getSubscribemobileCarLifeInfoCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoListOrBuilder
            public List<CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo> getSubscribemobileCarLifeInfoList() {
                return Collections.unmodifiableList(((CarlifeSubscribeMobileCarLifeInfoList) this.instance).getSubscribemobileCarLifeInfoList());
            }

            @Override // com.baidu.carlife.protobuf.CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoListOrBuilder
            public boolean hasCnt() {
                return ((CarlifeSubscribeMobileCarLifeInfoList) this.instance).hasCnt();
            }

            public Builder removeSubscribemobileCarLifeInfo(int i7) {
                copyOnWrite();
                ((CarlifeSubscribeMobileCarLifeInfoList) this.instance).removeSubscribemobileCarLifeInfo(i7);
                return this;
            }

            public Builder setCnt(int i7) {
                copyOnWrite();
                ((CarlifeSubscribeMobileCarLifeInfoList) this.instance).setCnt(i7);
                return this;
            }

            public Builder setSubscribemobileCarLifeInfo(int i7, CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo.Builder builder) {
                copyOnWrite();
                ((CarlifeSubscribeMobileCarLifeInfoList) this.instance).setSubscribemobileCarLifeInfo(i7, (CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo) builder.m16build());
                return this;
            }

            public Builder setSubscribemobileCarLifeInfo(int i7, CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo carlifeSubscribeMobileCarLifeInfo) {
                copyOnWrite();
                ((CarlifeSubscribeMobileCarLifeInfoList) this.instance).setSubscribemobileCarLifeInfo(i7, carlifeSubscribeMobileCarLifeInfo);
                return this;
            }
        }

        static {
            CarlifeSubscribeMobileCarLifeInfoList carlifeSubscribeMobileCarLifeInfoList = new CarlifeSubscribeMobileCarLifeInfoList();
            DEFAULT_INSTANCE = carlifeSubscribeMobileCarLifeInfoList;
            j0.registerDefaultInstance(CarlifeSubscribeMobileCarLifeInfoList.class, carlifeSubscribeMobileCarLifeInfoList);
        }

        private CarlifeSubscribeMobileCarLifeInfoList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSubscribemobileCarLifeInfo(Iterable<? extends CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo> iterable) {
            ensureSubscribemobileCarLifeInfoIsMutable();
            c.addAll((Iterable) iterable, (List) this.subscribemobileCarLifeInfo_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSubscribemobileCarLifeInfo(int i7, CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo carlifeSubscribeMobileCarLifeInfo) {
            carlifeSubscribeMobileCarLifeInfo.getClass();
            ensureSubscribemobileCarLifeInfoIsMutable();
            this.subscribemobileCarLifeInfo_.add(i7, carlifeSubscribeMobileCarLifeInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSubscribemobileCarLifeInfo(CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo carlifeSubscribeMobileCarLifeInfo) {
            carlifeSubscribeMobileCarLifeInfo.getClass();
            ensureSubscribemobileCarLifeInfoIsMutable();
            this.subscribemobileCarLifeInfo_.add(carlifeSubscribeMobileCarLifeInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCnt() {
            this.bitField0_ &= -2;
            this.cnt_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubscribemobileCarLifeInfo() {
            this.subscribemobileCarLifeInfo_ = j0.emptyProtobufList();
        }

        private void ensureSubscribemobileCarLifeInfoIsMutable() {
            t0 t0Var = this.subscribemobileCarLifeInfo_;
            if (((d) t0Var).f2729a) {
                return;
            }
            this.subscribemobileCarLifeInfo_ = j0.mutableCopy(t0Var);
        }

        public static CarlifeSubscribeMobileCarLifeInfoList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeSubscribeMobileCarLifeInfoList carlifeSubscribeMobileCarLifeInfoList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeSubscribeMobileCarLifeInfoList);
        }

        public static CarlifeSubscribeMobileCarLifeInfoList parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeSubscribeMobileCarLifeInfoList) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeSubscribeMobileCarLifeInfoList parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeSubscribeMobileCarLifeInfoList) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeSubscribeMobileCarLifeInfoList parseFrom(l lVar) {
            return (CarlifeSubscribeMobileCarLifeInfoList) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeSubscribeMobileCarLifeInfoList parseFrom(l lVar, y yVar) {
            return (CarlifeSubscribeMobileCarLifeInfoList) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeSubscribeMobileCarLifeInfoList parseFrom(p pVar) {
            return (CarlifeSubscribeMobileCarLifeInfoList) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeSubscribeMobileCarLifeInfoList parseFrom(p pVar, y yVar) {
            return (CarlifeSubscribeMobileCarLifeInfoList) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeSubscribeMobileCarLifeInfoList parseFrom(InputStream inputStream) {
            return (CarlifeSubscribeMobileCarLifeInfoList) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeSubscribeMobileCarLifeInfoList parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeSubscribeMobileCarLifeInfoList) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeSubscribeMobileCarLifeInfoList parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeSubscribeMobileCarLifeInfoList) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeSubscribeMobileCarLifeInfoList parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeSubscribeMobileCarLifeInfoList) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeSubscribeMobileCarLifeInfoList parseFrom(byte[] bArr) {
            return (CarlifeSubscribeMobileCarLifeInfoList) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeSubscribeMobileCarLifeInfoList parseFrom(byte[] bArr, y yVar) {
            return (CarlifeSubscribeMobileCarLifeInfoList) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSubscribemobileCarLifeInfo(int i7) {
            ensureSubscribemobileCarLifeInfoIsMutable();
            this.subscribemobileCarLifeInfo_.remove(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCnt(int i7) {
            this.bitField0_ |= 1;
            this.cnt_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubscribemobileCarLifeInfo(int i7, CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo carlifeSubscribeMobileCarLifeInfo) {
            carlifeSubscribeMobileCarLifeInfo.getClass();
            ensureSubscribemobileCarLifeInfoIsMutable();
            this.subscribemobileCarLifeInfo_.set(i7, carlifeSubscribeMobileCarLifeInfo);
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᔄ\u0000\u0002Л", new Object[]{"bitField0_", "cnt_", "subscribemobileCarLifeInfo_", CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo.class});
                case 3:
                    return new CarlifeSubscribeMobileCarLifeInfoList();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeSubscribeMobileCarLifeInfoList.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoListOrBuilder
        public int getCnt() {
            return this.cnt_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoListOrBuilder
        public CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo getSubscribemobileCarLifeInfo(int i7) {
            return (CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo) this.subscribemobileCarLifeInfo_.get(i7);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoListOrBuilder
        public int getSubscribemobileCarLifeInfoCount() {
            return this.subscribemobileCarLifeInfo_.size();
        }

        @Override // com.baidu.carlife.protobuf.CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoListOrBuilder
        public List<CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo> getSubscribemobileCarLifeInfoList() {
            return this.subscribemobileCarLifeInfo_;
        }

        public CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfoOrBuilder getSubscribemobileCarLifeInfoOrBuilder(int i7) {
            return (CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfoOrBuilder) this.subscribemobileCarLifeInfo_.get(i7);
        }

        public List<? extends CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfoOrBuilder> getSubscribemobileCarLifeInfoOrBuilderList() {
            return this.subscribemobileCarLifeInfo_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoListOrBuilder
        public boolean hasCnt() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeSubscribeMobileCarLifeInfoListOrBuilder extends m1 {
        int getCnt();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo getSubscribemobileCarLifeInfo(int i7);

        int getSubscribemobileCarLifeInfoCount();

        List<CarlifeSubscribeMobileCarLifeInfoProto.CarlifeSubscribeMobileCarLifeInfo> getSubscribemobileCarLifeInfoList();

        boolean hasCnt();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeSubscribeMobileCarLifeInfoListProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

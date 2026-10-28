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
public final class CarlifeVehicleInfoListProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto$1, reason: invalid class name */
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
    public static final class CarlifeVehicleInfoList extends j0 implements CarlifeVehicleInfoListOrBuilder {
        public static final int CNT_FIELD_NUMBER = 1;
        private static final CarlifeVehicleInfoList DEFAULT_INSTANCE;
        private static volatile s1 PARSER = null;
        public static final int VEHICLEINFO_FIELD_NUMBER = 2;
        private int bitField0_;
        private int cnt_;
        private byte memoizedIsInitialized = 2;
        private t0 vehicleInfo_ = j0.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeVehicleInfoListOrBuilder {
            private Builder() {
                super(CarlifeVehicleInfoList.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllVehicleInfo(Iterable<? extends CarlifeVehicleInfoProto.CarlifeVehicleInfo> iterable) {
                copyOnWrite();
                ((CarlifeVehicleInfoList) this.instance).addAllVehicleInfo(iterable);
                return this;
            }

            public Builder addVehicleInfo(int i7, CarlifeVehicleInfoProto.CarlifeVehicleInfo.Builder builder) {
                copyOnWrite();
                ((CarlifeVehicleInfoList) this.instance).addVehicleInfo(i7, (CarlifeVehicleInfoProto.CarlifeVehicleInfo) builder.m16build());
                return this;
            }

            public Builder addVehicleInfo(int i7, CarlifeVehicleInfoProto.CarlifeVehicleInfo carlifeVehicleInfo) {
                copyOnWrite();
                ((CarlifeVehicleInfoList) this.instance).addVehicleInfo(i7, carlifeVehicleInfo);
                return this;
            }

            public Builder addVehicleInfo(CarlifeVehicleInfoProto.CarlifeVehicleInfo.Builder builder) {
                copyOnWrite();
                ((CarlifeVehicleInfoList) this.instance).addVehicleInfo((CarlifeVehicleInfoProto.CarlifeVehicleInfo) builder.m16build());
                return this;
            }

            public Builder addVehicleInfo(CarlifeVehicleInfoProto.CarlifeVehicleInfo carlifeVehicleInfo) {
                copyOnWrite();
                ((CarlifeVehicleInfoList) this.instance).addVehicleInfo(carlifeVehicleInfo);
                return this;
            }

            public Builder clearCnt() {
                copyOnWrite();
                ((CarlifeVehicleInfoList) this.instance).clearCnt();
                return this;
            }

            public Builder clearVehicleInfo() {
                copyOnWrite();
                ((CarlifeVehicleInfoList) this.instance).clearVehicleInfo();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoListOrBuilder
            public int getCnt() {
                return ((CarlifeVehicleInfoList) this.instance).getCnt();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoListOrBuilder
            public CarlifeVehicleInfoProto.CarlifeVehicleInfo getVehicleInfo(int i7) {
                return ((CarlifeVehicleInfoList) this.instance).getVehicleInfo(i7);
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoListOrBuilder
            public int getVehicleInfoCount() {
                return ((CarlifeVehicleInfoList) this.instance).getVehicleInfoCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoListOrBuilder
            public List<CarlifeVehicleInfoProto.CarlifeVehicleInfo> getVehicleInfoList() {
                return Collections.unmodifiableList(((CarlifeVehicleInfoList) this.instance).getVehicleInfoList());
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoListOrBuilder
            public boolean hasCnt() {
                return ((CarlifeVehicleInfoList) this.instance).hasCnt();
            }

            public Builder removeVehicleInfo(int i7) {
                copyOnWrite();
                ((CarlifeVehicleInfoList) this.instance).removeVehicleInfo(i7);
                return this;
            }

            public Builder setCnt(int i7) {
                copyOnWrite();
                ((CarlifeVehicleInfoList) this.instance).setCnt(i7);
                return this;
            }

            public Builder setVehicleInfo(int i7, CarlifeVehicleInfoProto.CarlifeVehicleInfo.Builder builder) {
                copyOnWrite();
                ((CarlifeVehicleInfoList) this.instance).setVehicleInfo(i7, (CarlifeVehicleInfoProto.CarlifeVehicleInfo) builder.m16build());
                return this;
            }

            public Builder setVehicleInfo(int i7, CarlifeVehicleInfoProto.CarlifeVehicleInfo carlifeVehicleInfo) {
                copyOnWrite();
                ((CarlifeVehicleInfoList) this.instance).setVehicleInfo(i7, carlifeVehicleInfo);
                return this;
            }
        }

        static {
            CarlifeVehicleInfoList carlifeVehicleInfoList = new CarlifeVehicleInfoList();
            DEFAULT_INSTANCE = carlifeVehicleInfoList;
            j0.registerDefaultInstance(CarlifeVehicleInfoList.class, carlifeVehicleInfoList);
        }

        private CarlifeVehicleInfoList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllVehicleInfo(Iterable<? extends CarlifeVehicleInfoProto.CarlifeVehicleInfo> iterable) {
            ensureVehicleInfoIsMutable();
            c.addAll((Iterable) iterable, (List) this.vehicleInfo_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVehicleInfo(int i7, CarlifeVehicleInfoProto.CarlifeVehicleInfo carlifeVehicleInfo) {
            carlifeVehicleInfo.getClass();
            ensureVehicleInfoIsMutable();
            this.vehicleInfo_.add(i7, carlifeVehicleInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVehicleInfo(CarlifeVehicleInfoProto.CarlifeVehicleInfo carlifeVehicleInfo) {
            carlifeVehicleInfo.getClass();
            ensureVehicleInfoIsMutable();
            this.vehicleInfo_.add(carlifeVehicleInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCnt() {
            this.bitField0_ &= -2;
            this.cnt_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVehicleInfo() {
            this.vehicleInfo_ = j0.emptyProtobufList();
        }

        private void ensureVehicleInfoIsMutable() {
            t0 t0Var = this.vehicleInfo_;
            if (((d) t0Var).f2729a) {
                return;
            }
            this.vehicleInfo_ = j0.mutableCopy(t0Var);
        }

        public static CarlifeVehicleInfoList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeVehicleInfoList carlifeVehicleInfoList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeVehicleInfoList);
        }

        public static CarlifeVehicleInfoList parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeVehicleInfoList) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeVehicleInfoList parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeVehicleInfoList) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeVehicleInfoList parseFrom(l lVar) {
            return (CarlifeVehicleInfoList) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeVehicleInfoList parseFrom(l lVar, y yVar) {
            return (CarlifeVehicleInfoList) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeVehicleInfoList parseFrom(p pVar) {
            return (CarlifeVehicleInfoList) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeVehicleInfoList parseFrom(p pVar, y yVar) {
            return (CarlifeVehicleInfoList) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeVehicleInfoList parseFrom(InputStream inputStream) {
            return (CarlifeVehicleInfoList) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeVehicleInfoList parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeVehicleInfoList) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeVehicleInfoList parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeVehicleInfoList) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeVehicleInfoList parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeVehicleInfoList) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeVehicleInfoList parseFrom(byte[] bArr) {
            return (CarlifeVehicleInfoList) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeVehicleInfoList parseFrom(byte[] bArr, y yVar) {
            return (CarlifeVehicleInfoList) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeVehicleInfo(int i7) {
            ensureVehicleInfoIsMutable();
            this.vehicleInfo_.remove(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCnt(int i7) {
            this.bitField0_ |= 1;
            this.cnt_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVehicleInfo(int i7, CarlifeVehicleInfoProto.CarlifeVehicleInfo carlifeVehicleInfo) {
            carlifeVehicleInfo.getClass();
            ensureVehicleInfoIsMutable();
            this.vehicleInfo_.set(i7, carlifeVehicleInfo);
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᔄ\u0000\u0002Л", new Object[]{"bitField0_", "cnt_", "vehicleInfo_", CarlifeVehicleInfoProto.CarlifeVehicleInfo.class});
                case 3:
                    return new CarlifeVehicleInfoList();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeVehicleInfoList.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoListOrBuilder
        public int getCnt() {
            return this.cnt_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoListOrBuilder
        public CarlifeVehicleInfoProto.CarlifeVehicleInfo getVehicleInfo(int i7) {
            return (CarlifeVehicleInfoProto.CarlifeVehicleInfo) this.vehicleInfo_.get(i7);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoListOrBuilder
        public int getVehicleInfoCount() {
            return this.vehicleInfo_.size();
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoListOrBuilder
        public List<CarlifeVehicleInfoProto.CarlifeVehicleInfo> getVehicleInfoList() {
            return this.vehicleInfo_;
        }

        public CarlifeVehicleInfoProto.CarlifeVehicleInfoOrBuilder getVehicleInfoOrBuilder(int i7) {
            return (CarlifeVehicleInfoProto.CarlifeVehicleInfoOrBuilder) this.vehicleInfo_.get(i7);
        }

        public List<? extends CarlifeVehicleInfoProto.CarlifeVehicleInfoOrBuilder> getVehicleInfoOrBuilderList() {
            return this.vehicleInfo_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto.CarlifeVehicleInfoListOrBuilder
        public boolean hasCnt() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeVehicleInfoListOrBuilder extends m1 {
        int getCnt();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        CarlifeVehicleInfoProto.CarlifeVehicleInfo getVehicleInfo(int i7);

        int getVehicleInfoCount();

        List<CarlifeVehicleInfoProto.CarlifeVehicleInfo> getVehicleInfoList();

        boolean hasCnt();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeVehicleInfoListProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

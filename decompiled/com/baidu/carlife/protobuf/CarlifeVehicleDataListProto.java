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
public final class CarlifeVehicleDataListProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeVehicleDataListProto$1, reason: invalid class name */
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
    public static final class CarlifeVehicleDataList extends j0 implements CarlifeVehicleDataListOrBuilder {
        private static final CarlifeVehicleDataList DEFAULT_INSTANCE;
        private static volatile s1 PARSER = null;
        public static final int SUPPORT_FIELD_NUMBER = 1;
        public static final int TOKEN_STRING_FIELD_NUMBER = 2;
        public static final int VEHICLEDATA_FIELD_NUMBER = 3;
        private int bitField0_;
        private boolean support_;
        private byte memoizedIsInitialized = 2;
        private String tokenString_ = "";
        private t0 vehicleData_ = j0.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeVehicleDataListOrBuilder {
            private Builder() {
                super(CarlifeVehicleDataList.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllVehicleData(Iterable<? extends CarlifeVehicleDataProto.CarlifeVehicleData> iterable) {
                copyOnWrite();
                ((CarlifeVehicleDataList) this.instance).addAllVehicleData(iterable);
                return this;
            }

            public Builder addVehicleData(int i7, CarlifeVehicleDataProto.CarlifeVehicleData.Builder builder) {
                copyOnWrite();
                ((CarlifeVehicleDataList) this.instance).addVehicleData(i7, (CarlifeVehicleDataProto.CarlifeVehicleData) builder.m16build());
                return this;
            }

            public Builder addVehicleData(int i7, CarlifeVehicleDataProto.CarlifeVehicleData carlifeVehicleData) {
                copyOnWrite();
                ((CarlifeVehicleDataList) this.instance).addVehicleData(i7, carlifeVehicleData);
                return this;
            }

            public Builder addVehicleData(CarlifeVehicleDataProto.CarlifeVehicleData.Builder builder) {
                copyOnWrite();
                ((CarlifeVehicleDataList) this.instance).addVehicleData((CarlifeVehicleDataProto.CarlifeVehicleData) builder.m16build());
                return this;
            }

            public Builder addVehicleData(CarlifeVehicleDataProto.CarlifeVehicleData carlifeVehicleData) {
                copyOnWrite();
                ((CarlifeVehicleDataList) this.instance).addVehicleData(carlifeVehicleData);
                return this;
            }

            public Builder clearSupport() {
                copyOnWrite();
                ((CarlifeVehicleDataList) this.instance).clearSupport();
                return this;
            }

            public Builder clearTokenString() {
                copyOnWrite();
                ((CarlifeVehicleDataList) this.instance).clearTokenString();
                return this;
            }

            public Builder clearVehicleData() {
                copyOnWrite();
                ((CarlifeVehicleDataList) this.instance).clearVehicleData();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataListProto.CarlifeVehicleDataListOrBuilder
            public boolean getSupport() {
                return ((CarlifeVehicleDataList) this.instance).getSupport();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataListProto.CarlifeVehicleDataListOrBuilder
            public String getTokenString() {
                return ((CarlifeVehicleDataList) this.instance).getTokenString();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataListProto.CarlifeVehicleDataListOrBuilder
            public l getTokenStringBytes() {
                return ((CarlifeVehicleDataList) this.instance).getTokenStringBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataListProto.CarlifeVehicleDataListOrBuilder
            public CarlifeVehicleDataProto.CarlifeVehicleData getVehicleData(int i7) {
                return ((CarlifeVehicleDataList) this.instance).getVehicleData(i7);
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataListProto.CarlifeVehicleDataListOrBuilder
            public int getVehicleDataCount() {
                return ((CarlifeVehicleDataList) this.instance).getVehicleDataCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataListProto.CarlifeVehicleDataListOrBuilder
            public List<CarlifeVehicleDataProto.CarlifeVehicleData> getVehicleDataList() {
                return Collections.unmodifiableList(((CarlifeVehicleDataList) this.instance).getVehicleDataList());
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataListProto.CarlifeVehicleDataListOrBuilder
            public boolean hasSupport() {
                return ((CarlifeVehicleDataList) this.instance).hasSupport();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataListProto.CarlifeVehicleDataListOrBuilder
            public boolean hasTokenString() {
                return ((CarlifeVehicleDataList) this.instance).hasTokenString();
            }

            public Builder removeVehicleData(int i7) {
                copyOnWrite();
                ((CarlifeVehicleDataList) this.instance).removeVehicleData(i7);
                return this;
            }

            public Builder setSupport(boolean z10) {
                copyOnWrite();
                ((CarlifeVehicleDataList) this.instance).setSupport(z10);
                return this;
            }

            public Builder setTokenString(String str) {
                copyOnWrite();
                ((CarlifeVehicleDataList) this.instance).setTokenString(str);
                return this;
            }

            public Builder setTokenStringBytes(l lVar) {
                copyOnWrite();
                ((CarlifeVehicleDataList) this.instance).setTokenStringBytes(lVar);
                return this;
            }

            public Builder setVehicleData(int i7, CarlifeVehicleDataProto.CarlifeVehicleData.Builder builder) {
                copyOnWrite();
                ((CarlifeVehicleDataList) this.instance).setVehicleData(i7, (CarlifeVehicleDataProto.CarlifeVehicleData) builder.m16build());
                return this;
            }

            public Builder setVehicleData(int i7, CarlifeVehicleDataProto.CarlifeVehicleData carlifeVehicleData) {
                copyOnWrite();
                ((CarlifeVehicleDataList) this.instance).setVehicleData(i7, carlifeVehicleData);
                return this;
            }
        }

        static {
            CarlifeVehicleDataList carlifeVehicleDataList = new CarlifeVehicleDataList();
            DEFAULT_INSTANCE = carlifeVehicleDataList;
            j0.registerDefaultInstance(CarlifeVehicleDataList.class, carlifeVehicleDataList);
        }

        private CarlifeVehicleDataList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllVehicleData(Iterable<? extends CarlifeVehicleDataProto.CarlifeVehicleData> iterable) {
            ensureVehicleDataIsMutable();
            c.addAll((Iterable) iterable, (List) this.vehicleData_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVehicleData(int i7, CarlifeVehicleDataProto.CarlifeVehicleData carlifeVehicleData) {
            carlifeVehicleData.getClass();
            ensureVehicleDataIsMutable();
            this.vehicleData_.add(i7, carlifeVehicleData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVehicleData(CarlifeVehicleDataProto.CarlifeVehicleData carlifeVehicleData) {
            carlifeVehicleData.getClass();
            ensureVehicleDataIsMutable();
            this.vehicleData_.add(carlifeVehicleData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSupport() {
            this.bitField0_ &= -2;
            this.support_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTokenString() {
            this.bitField0_ &= -3;
            this.tokenString_ = getDefaultInstance().getTokenString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVehicleData() {
            this.vehicleData_ = j0.emptyProtobufList();
        }

        private void ensureVehicleDataIsMutable() {
            t0 t0Var = this.vehicleData_;
            if (((d) t0Var).f2729a) {
                return;
            }
            this.vehicleData_ = j0.mutableCopy(t0Var);
        }

        public static CarlifeVehicleDataList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeVehicleDataList carlifeVehicleDataList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeVehicleDataList);
        }

        public static CarlifeVehicleDataList parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeVehicleDataList) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeVehicleDataList parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeVehicleDataList) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeVehicleDataList parseFrom(l lVar) {
            return (CarlifeVehicleDataList) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeVehicleDataList parseFrom(l lVar, y yVar) {
            return (CarlifeVehicleDataList) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeVehicleDataList parseFrom(p pVar) {
            return (CarlifeVehicleDataList) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeVehicleDataList parseFrom(p pVar, y yVar) {
            return (CarlifeVehicleDataList) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeVehicleDataList parseFrom(InputStream inputStream) {
            return (CarlifeVehicleDataList) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeVehicleDataList parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeVehicleDataList) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeVehicleDataList parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeVehicleDataList) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeVehicleDataList parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeVehicleDataList) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeVehicleDataList parseFrom(byte[] bArr) {
            return (CarlifeVehicleDataList) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeVehicleDataList parseFrom(byte[] bArr, y yVar) {
            return (CarlifeVehicleDataList) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeVehicleData(int i7) {
            ensureVehicleDataIsMutable();
            this.vehicleData_.remove(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSupport(boolean z10) {
            this.bitField0_ |= 1;
            this.support_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTokenString(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.tokenString_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTokenStringBytes(l lVar) {
            this.tokenString_ = lVar.u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVehicleData(int i7, CarlifeVehicleDataProto.CarlifeVehicleData carlifeVehicleData) {
            carlifeVehicleData.getClass();
            ensureVehicleDataIsMutable();
            this.vehicleData_.set(i7, carlifeVehicleData);
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ᔇ\u0000\u0002ဈ\u0001\u0003Л", new Object[]{"bitField0_", "support_", "tokenString_", "vehicleData_", CarlifeVehicleDataProto.CarlifeVehicleData.class});
                case 3:
                    return new CarlifeVehicleDataList();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeVehicleDataList.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataListProto.CarlifeVehicleDataListOrBuilder
        public boolean getSupport() {
            return this.support_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataListProto.CarlifeVehicleDataListOrBuilder
        public String getTokenString() {
            return this.tokenString_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataListProto.CarlifeVehicleDataListOrBuilder
        public l getTokenStringBytes() {
            return l.m(this.tokenString_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataListProto.CarlifeVehicleDataListOrBuilder
        public CarlifeVehicleDataProto.CarlifeVehicleData getVehicleData(int i7) {
            return (CarlifeVehicleDataProto.CarlifeVehicleData) this.vehicleData_.get(i7);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataListProto.CarlifeVehicleDataListOrBuilder
        public int getVehicleDataCount() {
            return this.vehicleData_.size();
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataListProto.CarlifeVehicleDataListOrBuilder
        public List<CarlifeVehicleDataProto.CarlifeVehicleData> getVehicleDataList() {
            return this.vehicleData_;
        }

        public CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder getVehicleDataOrBuilder(int i7) {
            return (CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder) this.vehicleData_.get(i7);
        }

        public List<? extends CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder> getVehicleDataOrBuilderList() {
            return this.vehicleData_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataListProto.CarlifeVehicleDataListOrBuilder
        public boolean hasSupport() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataListProto.CarlifeVehicleDataListOrBuilder
        public boolean hasTokenString() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeVehicleDataListOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        boolean getSupport();

        String getTokenString();

        l getTokenStringBytes();

        CarlifeVehicleDataProto.CarlifeVehicleData getVehicleData(int i7);

        int getVehicleDataCount();

        List<CarlifeVehicleDataProto.CarlifeVehicleData> getVehicleDataList();

        boolean hasSupport();

        boolean hasTokenString();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeVehicleDataListProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

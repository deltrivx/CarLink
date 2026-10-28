package com.baidu.carlife.protobuf;

import com.google.protobuf.e0;
import com.google.protobuf.f0;
import com.google.protobuf.i0;
import com.google.protobuf.j0;
import com.google.protobuf.l;
import com.google.protobuf.l1;
import com.google.protobuf.m1;
import com.google.protobuf.p;
import com.google.protobuf.s1;
import com.google.protobuf.y;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class CarlifeBTStartPairReqProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeBTStartPairReqProto$1, reason: invalid class name */
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
    public static final class CarlifeBTStartPairReq extends j0 implements CarlifeBTStartPairReqOrBuilder {
        public static final int ADDRESS_FIELD_NUMBER = 2;
        private static final CarlifeBTStartPairReq DEFAULT_INSTANCE;
        public static final int OSTYPE_FIELD_NUMBER = 1;
        private static volatile s1 PARSER;
        private int bitField0_;
        private int ostype_;
        private byte memoizedIsInitialized = 2;
        private String address_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeBTStartPairReqOrBuilder {
            private Builder() {
                super(CarlifeBTStartPairReq.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAddress() {
                copyOnWrite();
                ((CarlifeBTStartPairReq) this.instance).clearAddress();
                return this;
            }

            public Builder clearOstype() {
                copyOnWrite();
                ((CarlifeBTStartPairReq) this.instance).clearOstype();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReqOrBuilder
            public String getAddress() {
                return ((CarlifeBTStartPairReq) this.instance).getAddress();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReqOrBuilder
            public l getAddressBytes() {
                return ((CarlifeBTStartPairReq) this.instance).getAddressBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReqOrBuilder
            public int getOstype() {
                return ((CarlifeBTStartPairReq) this.instance).getOstype();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReqOrBuilder
            public boolean hasAddress() {
                return ((CarlifeBTStartPairReq) this.instance).hasAddress();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReqOrBuilder
            public boolean hasOstype() {
                return ((CarlifeBTStartPairReq) this.instance).hasOstype();
            }

            public Builder setAddress(String str) {
                copyOnWrite();
                ((CarlifeBTStartPairReq) this.instance).setAddress(str);
                return this;
            }

            public Builder setAddressBytes(l lVar) {
                copyOnWrite();
                ((CarlifeBTStartPairReq) this.instance).setAddressBytes(lVar);
                return this;
            }

            public Builder setOstype(int i7) {
                copyOnWrite();
                ((CarlifeBTStartPairReq) this.instance).setOstype(i7);
                return this;
            }
        }

        static {
            CarlifeBTStartPairReq carlifeBTStartPairReq = new CarlifeBTStartPairReq();
            DEFAULT_INSTANCE = carlifeBTStartPairReq;
            j0.registerDefaultInstance(CarlifeBTStartPairReq.class, carlifeBTStartPairReq);
        }

        private CarlifeBTStartPairReq() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddress() {
            this.bitField0_ &= -3;
            this.address_ = getDefaultInstance().getAddress();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOstype() {
            this.bitField0_ &= -2;
            this.ostype_ = 0;
        }

        public static CarlifeBTStartPairReq getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeBTStartPairReq carlifeBTStartPairReq) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeBTStartPairReq);
        }

        public static CarlifeBTStartPairReq parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeBTStartPairReq) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeBTStartPairReq parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeBTStartPairReq) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeBTStartPairReq parseFrom(l lVar) {
            return (CarlifeBTStartPairReq) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeBTStartPairReq parseFrom(l lVar, y yVar) {
            return (CarlifeBTStartPairReq) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeBTStartPairReq parseFrom(p pVar) {
            return (CarlifeBTStartPairReq) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeBTStartPairReq parseFrom(p pVar, y yVar) {
            return (CarlifeBTStartPairReq) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeBTStartPairReq parseFrom(InputStream inputStream) {
            return (CarlifeBTStartPairReq) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeBTStartPairReq parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeBTStartPairReq) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeBTStartPairReq parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeBTStartPairReq) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeBTStartPairReq parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeBTStartPairReq) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeBTStartPairReq parseFrom(byte[] bArr) {
            return (CarlifeBTStartPairReq) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeBTStartPairReq parseFrom(byte[] bArr, y yVar) {
            return (CarlifeBTStartPairReq) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddress(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.address_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddressBytes(l lVar) {
            this.address_ = lVar.u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOstype(int i7) {
            this.bitField0_ |= 1;
            this.ostype_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔄ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "ostype_", "address_"});
                case 3:
                    return new CarlifeBTStartPairReq();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeBTStartPairReq.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReqOrBuilder
        public String getAddress() {
            return this.address_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReqOrBuilder
        public l getAddressBytes() {
            return l.m(this.address_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReqOrBuilder
        public int getOstype() {
            return this.ostype_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReqOrBuilder
        public boolean hasAddress() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTStartPairReqProto.CarlifeBTStartPairReqOrBuilder
        public boolean hasOstype() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeBTStartPairReqOrBuilder extends m1 {
        String getAddress();

        l getAddressBytes();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getOstype();

        boolean hasAddress();

        boolean hasOstype();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeBTStartPairReqProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

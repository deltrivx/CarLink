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
public final class CarlifeActiveRequestProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeActiveRequestProto$1, reason: invalid class name */
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
    public static final class CarlifeActiveRequest extends j0 implements CarlifeActiveRequestOrBuilder {
        private static final CarlifeActiveRequest DEFAULT_INSTANCE;
        public static final int ISACTIVE_FIELD_NUMBER = 2;
        public static final int MAC_FIELD_NUMBER = 1;
        private static volatile s1 PARSER = null;
        public static final int RANDOMVALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private int isActive_;
        private int randomValue_;
        private byte memoizedIsInitialized = 2;
        private String mac_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeActiveRequestOrBuilder {
            private Builder() {
                super(CarlifeActiveRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIsActive() {
                copyOnWrite();
                ((CarlifeActiveRequest) this.instance).clearIsActive();
                return this;
            }

            public Builder clearMac() {
                copyOnWrite();
                ((CarlifeActiveRequest) this.instance).clearMac();
                return this;
            }

            public Builder clearRandomValue() {
                copyOnWrite();
                ((CarlifeActiveRequest) this.instance).clearRandomValue();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeActiveRequestProto.CarlifeActiveRequestOrBuilder
            public int getIsActive() {
                return ((CarlifeActiveRequest) this.instance).getIsActive();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeActiveRequestProto.CarlifeActiveRequestOrBuilder
            public String getMac() {
                return ((CarlifeActiveRequest) this.instance).getMac();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeActiveRequestProto.CarlifeActiveRequestOrBuilder
            public l getMacBytes() {
                return ((CarlifeActiveRequest) this.instance).getMacBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeActiveRequestProto.CarlifeActiveRequestOrBuilder
            public int getRandomValue() {
                return ((CarlifeActiveRequest) this.instance).getRandomValue();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeActiveRequestProto.CarlifeActiveRequestOrBuilder
            public boolean hasIsActive() {
                return ((CarlifeActiveRequest) this.instance).hasIsActive();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeActiveRequestProto.CarlifeActiveRequestOrBuilder
            public boolean hasMac() {
                return ((CarlifeActiveRequest) this.instance).hasMac();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeActiveRequestProto.CarlifeActiveRequestOrBuilder
            public boolean hasRandomValue() {
                return ((CarlifeActiveRequest) this.instance).hasRandomValue();
            }

            public Builder setIsActive(int i7) {
                copyOnWrite();
                ((CarlifeActiveRequest) this.instance).setIsActive(i7);
                return this;
            }

            public Builder setMac(String str) {
                copyOnWrite();
                ((CarlifeActiveRequest) this.instance).setMac(str);
                return this;
            }

            public Builder setMacBytes(l lVar) {
                copyOnWrite();
                ((CarlifeActiveRequest) this.instance).setMacBytes(lVar);
                return this;
            }

            public Builder setRandomValue(int i7) {
                copyOnWrite();
                ((CarlifeActiveRequest) this.instance).setRandomValue(i7);
                return this;
            }
        }

        static {
            CarlifeActiveRequest carlifeActiveRequest = new CarlifeActiveRequest();
            DEFAULT_INSTANCE = carlifeActiveRequest;
            j0.registerDefaultInstance(CarlifeActiveRequest.class, carlifeActiveRequest);
        }

        private CarlifeActiveRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsActive() {
            this.bitField0_ &= -3;
            this.isActive_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMac() {
            this.bitField0_ &= -2;
            this.mac_ = getDefaultInstance().getMac();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRandomValue() {
            this.bitField0_ &= -5;
            this.randomValue_ = 0;
        }

        public static CarlifeActiveRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeActiveRequest carlifeActiveRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeActiveRequest);
        }

        public static CarlifeActiveRequest parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeActiveRequest) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeActiveRequest parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeActiveRequest) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeActiveRequest parseFrom(l lVar) {
            return (CarlifeActiveRequest) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeActiveRequest parseFrom(l lVar, y yVar) {
            return (CarlifeActiveRequest) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeActiveRequest parseFrom(p pVar) {
            return (CarlifeActiveRequest) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeActiveRequest parseFrom(p pVar, y yVar) {
            return (CarlifeActiveRequest) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeActiveRequest parseFrom(InputStream inputStream) {
            return (CarlifeActiveRequest) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeActiveRequest parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeActiveRequest) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeActiveRequest parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeActiveRequest) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeActiveRequest parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeActiveRequest) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeActiveRequest parseFrom(byte[] bArr) {
            return (CarlifeActiveRequest) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeActiveRequest parseFrom(byte[] bArr, y yVar) {
            return (CarlifeActiveRequest) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsActive(int i7) {
            this.bitField0_ |= 2;
            this.isActive_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMac(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.mac_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMacBytes(l lVar) {
            this.mac_ = lVar.u();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRandomValue(int i7) {
            this.bitField0_ |= 4;
            this.randomValue_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002", new Object[]{"bitField0_", "mac_", "isActive_", "randomValue_"});
                case 3:
                    return new CarlifeActiveRequest();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeActiveRequest.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeActiveRequestProto.CarlifeActiveRequestOrBuilder
        public int getIsActive() {
            return this.isActive_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeActiveRequestProto.CarlifeActiveRequestOrBuilder
        public String getMac() {
            return this.mac_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeActiveRequestProto.CarlifeActiveRequestOrBuilder
        public l getMacBytes() {
            return l.m(this.mac_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeActiveRequestProto.CarlifeActiveRequestOrBuilder
        public int getRandomValue() {
            return this.randomValue_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeActiveRequestProto.CarlifeActiveRequestOrBuilder
        public boolean hasIsActive() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeActiveRequestProto.CarlifeActiveRequestOrBuilder
        public boolean hasMac() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeActiveRequestProto.CarlifeActiveRequestOrBuilder
        public boolean hasRandomValue() {
            return (this.bitField0_ & 4) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeActiveRequestOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getIsActive();

        String getMac();

        l getMacBytes();

        int getRandomValue();

        boolean hasIsActive();

        boolean hasMac();

        boolean hasRandomValue();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeActiveRequestProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

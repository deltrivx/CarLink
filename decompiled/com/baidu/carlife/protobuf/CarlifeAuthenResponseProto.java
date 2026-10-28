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
public final class CarlifeAuthenResponseProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeAuthenResponseProto$1, reason: invalid class name */
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
    public static final class CarlifeAuthenResponse extends j0 implements CarlifeAuthenResponseOrBuilder {
        private static final CarlifeAuthenResponse DEFAULT_INSTANCE;
        public static final int ENCRYPTVALUE_FIELD_NUMBER = 1;
        private static volatile s1 PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String encryptValue_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeAuthenResponseOrBuilder {
            private Builder() {
                super(CarlifeAuthenResponse.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearEncryptValue() {
                copyOnWrite();
                ((CarlifeAuthenResponse) this.instance).clearEncryptValue();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponseOrBuilder
            public String getEncryptValue() {
                return ((CarlifeAuthenResponse) this.instance).getEncryptValue();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponseOrBuilder
            public l getEncryptValueBytes() {
                return ((CarlifeAuthenResponse) this.instance).getEncryptValueBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponseOrBuilder
            public boolean hasEncryptValue() {
                return ((CarlifeAuthenResponse) this.instance).hasEncryptValue();
            }

            public Builder setEncryptValue(String str) {
                copyOnWrite();
                ((CarlifeAuthenResponse) this.instance).setEncryptValue(str);
                return this;
            }

            public Builder setEncryptValueBytes(l lVar) {
                copyOnWrite();
                ((CarlifeAuthenResponse) this.instance).setEncryptValueBytes(lVar);
                return this;
            }
        }

        static {
            CarlifeAuthenResponse carlifeAuthenResponse = new CarlifeAuthenResponse();
            DEFAULT_INSTANCE = carlifeAuthenResponse;
            j0.registerDefaultInstance(CarlifeAuthenResponse.class, carlifeAuthenResponse);
        }

        private CarlifeAuthenResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEncryptValue() {
            this.bitField0_ &= -2;
            this.encryptValue_ = getDefaultInstance().getEncryptValue();
        }

        public static CarlifeAuthenResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeAuthenResponse carlifeAuthenResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeAuthenResponse);
        }

        public static CarlifeAuthenResponse parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeAuthenResponse) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeAuthenResponse parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeAuthenResponse) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeAuthenResponse parseFrom(l lVar) {
            return (CarlifeAuthenResponse) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeAuthenResponse parseFrom(l lVar, y yVar) {
            return (CarlifeAuthenResponse) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeAuthenResponse parseFrom(p pVar) {
            return (CarlifeAuthenResponse) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeAuthenResponse parseFrom(p pVar, y yVar) {
            return (CarlifeAuthenResponse) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeAuthenResponse parseFrom(InputStream inputStream) {
            return (CarlifeAuthenResponse) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeAuthenResponse parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeAuthenResponse) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeAuthenResponse parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeAuthenResponse) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeAuthenResponse parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeAuthenResponse) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeAuthenResponse parseFrom(byte[] bArr) {
            return (CarlifeAuthenResponse) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeAuthenResponse parseFrom(byte[] bArr, y yVar) {
            return (CarlifeAuthenResponse) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEncryptValue(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.encryptValue_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEncryptValueBytes(l lVar) {
            this.encryptValue_ = lVar.u();
            this.bitField0_ |= 1;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"bitField0_", "encryptValue_"});
                case 3:
                    return new CarlifeAuthenResponse();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeAuthenResponse.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponseOrBuilder
        public String getEncryptValue() {
            return this.encryptValue_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponseOrBuilder
        public l getEncryptValueBytes() {
            return l.m(this.encryptValue_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeAuthenResponseProto.CarlifeAuthenResponseOrBuilder
        public boolean hasEncryptValue() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeAuthenResponseOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        String getEncryptValue();

        l getEncryptValueBytes();

        boolean hasEncryptValue();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeAuthenResponseProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

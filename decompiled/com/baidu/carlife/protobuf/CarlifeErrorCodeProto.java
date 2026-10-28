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
public final class CarlifeErrorCodeProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeErrorCodeProto$1, reason: invalid class name */
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
    public static final class CarlifeErrorCode extends j0 implements CarlifeErrorCodeOrBuilder {
        private static final CarlifeErrorCode DEFAULT_INSTANCE;
        public static final int ERRORCODE_FIELD_NUMBER = 1;
        private static volatile s1 PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String errorCode_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeErrorCodeOrBuilder {
            private Builder() {
                super(CarlifeErrorCode.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearErrorCode() {
                copyOnWrite();
                ((CarlifeErrorCode) this.instance).clearErrorCode();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeErrorCodeProto.CarlifeErrorCodeOrBuilder
            public String getErrorCode() {
                return ((CarlifeErrorCode) this.instance).getErrorCode();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeErrorCodeProto.CarlifeErrorCodeOrBuilder
            public l getErrorCodeBytes() {
                return ((CarlifeErrorCode) this.instance).getErrorCodeBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeErrorCodeProto.CarlifeErrorCodeOrBuilder
            public boolean hasErrorCode() {
                return ((CarlifeErrorCode) this.instance).hasErrorCode();
            }

            public Builder setErrorCode(String str) {
                copyOnWrite();
                ((CarlifeErrorCode) this.instance).setErrorCode(str);
                return this;
            }

            public Builder setErrorCodeBytes(l lVar) {
                copyOnWrite();
                ((CarlifeErrorCode) this.instance).setErrorCodeBytes(lVar);
                return this;
            }
        }

        static {
            CarlifeErrorCode carlifeErrorCode = new CarlifeErrorCode();
            DEFAULT_INSTANCE = carlifeErrorCode;
            j0.registerDefaultInstance(CarlifeErrorCode.class, carlifeErrorCode);
        }

        private CarlifeErrorCode() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorCode() {
            this.bitField0_ &= -2;
            this.errorCode_ = getDefaultInstance().getErrorCode();
        }

        public static CarlifeErrorCode getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeErrorCode carlifeErrorCode) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeErrorCode);
        }

        public static CarlifeErrorCode parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeErrorCode) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeErrorCode parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeErrorCode) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeErrorCode parseFrom(l lVar) {
            return (CarlifeErrorCode) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeErrorCode parseFrom(l lVar, y yVar) {
            return (CarlifeErrorCode) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeErrorCode parseFrom(p pVar) {
            return (CarlifeErrorCode) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeErrorCode parseFrom(p pVar, y yVar) {
            return (CarlifeErrorCode) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeErrorCode parseFrom(InputStream inputStream) {
            return (CarlifeErrorCode) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeErrorCode parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeErrorCode) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeErrorCode parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeErrorCode) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeErrorCode parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeErrorCode) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeErrorCode parseFrom(byte[] bArr) {
            return (CarlifeErrorCode) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeErrorCode parseFrom(byte[] bArr, y yVar) {
            return (CarlifeErrorCode) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCode(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.errorCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorCodeBytes(l lVar) {
            this.errorCode_ = lVar.u();
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"bitField0_", "errorCode_"});
                case 3:
                    return new CarlifeErrorCode();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeErrorCode.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeErrorCodeProto.CarlifeErrorCodeOrBuilder
        public String getErrorCode() {
            return this.errorCode_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeErrorCodeProto.CarlifeErrorCodeOrBuilder
        public l getErrorCodeBytes() {
            return l.m(this.errorCode_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeErrorCodeProto.CarlifeErrorCodeOrBuilder
        public boolean hasErrorCode() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeErrorCodeOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        String getErrorCode();

        l getErrorCodeBytes();

        boolean hasErrorCode();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeErrorCodeProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

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
public final class CarlifeProtocolVersionProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeProtocolVersionProto$1, reason: invalid class name */
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
    public static final class CarlifeProtocolVersion extends j0 implements CarlifeProtocolVersionOrBuilder {
        private static final CarlifeProtocolVersion DEFAULT_INSTANCE;
        public static final int MAJORVERSION_FIELD_NUMBER = 1;
        public static final int MINORVERSION_FIELD_NUMBER = 2;
        private static volatile s1 PARSER;
        private int bitField0_;
        private int majorVersion_;
        private byte memoizedIsInitialized = 2;
        private int minorVersion_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeProtocolVersionOrBuilder {
            private Builder() {
                super(CarlifeProtocolVersion.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearMajorVersion() {
                copyOnWrite();
                ((CarlifeProtocolVersion) this.instance).clearMajorVersion();
                return this;
            }

            public Builder clearMinorVersion() {
                copyOnWrite();
                ((CarlifeProtocolVersion) this.instance).clearMinorVersion();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeProtocolVersionProto.CarlifeProtocolVersionOrBuilder
            public int getMajorVersion() {
                return ((CarlifeProtocolVersion) this.instance).getMajorVersion();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeProtocolVersionProto.CarlifeProtocolVersionOrBuilder
            public int getMinorVersion() {
                return ((CarlifeProtocolVersion) this.instance).getMinorVersion();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeProtocolVersionProto.CarlifeProtocolVersionOrBuilder
            public boolean hasMajorVersion() {
                return ((CarlifeProtocolVersion) this.instance).hasMajorVersion();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeProtocolVersionProto.CarlifeProtocolVersionOrBuilder
            public boolean hasMinorVersion() {
                return ((CarlifeProtocolVersion) this.instance).hasMinorVersion();
            }

            public Builder setMajorVersion(int i7) {
                copyOnWrite();
                ((CarlifeProtocolVersion) this.instance).setMajorVersion(i7);
                return this;
            }

            public Builder setMinorVersion(int i7) {
                copyOnWrite();
                ((CarlifeProtocolVersion) this.instance).setMinorVersion(i7);
                return this;
            }
        }

        static {
            CarlifeProtocolVersion carlifeProtocolVersion = new CarlifeProtocolVersion();
            DEFAULT_INSTANCE = carlifeProtocolVersion;
            j0.registerDefaultInstance(CarlifeProtocolVersion.class, carlifeProtocolVersion);
        }

        private CarlifeProtocolVersion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMajorVersion() {
            this.bitField0_ &= -2;
            this.majorVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMinorVersion() {
            this.bitField0_ &= -3;
            this.minorVersion_ = 0;
        }

        public static CarlifeProtocolVersion getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeProtocolVersion carlifeProtocolVersion) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeProtocolVersion);
        }

        public static CarlifeProtocolVersion parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeProtocolVersion) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeProtocolVersion parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeProtocolVersion) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeProtocolVersion parseFrom(l lVar) {
            return (CarlifeProtocolVersion) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeProtocolVersion parseFrom(l lVar, y yVar) {
            return (CarlifeProtocolVersion) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeProtocolVersion parseFrom(p pVar) {
            return (CarlifeProtocolVersion) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeProtocolVersion parseFrom(p pVar, y yVar) {
            return (CarlifeProtocolVersion) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeProtocolVersion parseFrom(InputStream inputStream) {
            return (CarlifeProtocolVersion) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeProtocolVersion parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeProtocolVersion) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeProtocolVersion parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeProtocolVersion) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeProtocolVersion parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeProtocolVersion) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeProtocolVersion parseFrom(byte[] bArr) {
            return (CarlifeProtocolVersion) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeProtocolVersion parseFrom(byte[] bArr, y yVar) {
            return (CarlifeProtocolVersion) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMajorVersion(int i7) {
            this.bitField0_ |= 1;
            this.majorVersion_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinorVersion(int i7) {
            this.bitField0_ |= 2;
            this.minorVersion_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"bitField0_", "majorVersion_", "minorVersion_"});
                case 3:
                    return new CarlifeProtocolVersion();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeProtocolVersion.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeProtocolVersionProto.CarlifeProtocolVersionOrBuilder
        public int getMajorVersion() {
            return this.majorVersion_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeProtocolVersionProto.CarlifeProtocolVersionOrBuilder
        public int getMinorVersion() {
            return this.minorVersion_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeProtocolVersionProto.CarlifeProtocolVersionOrBuilder
        public boolean hasMajorVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeProtocolVersionProto.CarlifeProtocolVersionOrBuilder
        public boolean hasMinorVersion() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeProtocolVersionOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getMajorVersion();

        int getMinorVersion();

        boolean hasMajorVersion();

        boolean hasMinorVersion();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeProtocolVersionProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

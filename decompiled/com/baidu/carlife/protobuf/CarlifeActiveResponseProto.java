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
public final class CarlifeActiveResponseProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeActiveResponseProto$1, reason: invalid class name */
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
    public static final class CarlifeActiveResponse extends j0 implements CarlifeActiveResponseOrBuilder {
        private static final CarlifeActiveResponse DEFAULT_INSTANCE;
        private static volatile s1 PARSER = null;
        public static final int STATUE_FIELD_NUMBER = 1;
        public static final int TOKEN_FIELD_NUMBER = 2;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String statue_ = "";
        private String token_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeActiveResponseOrBuilder {
            private Builder() {
                super(CarlifeActiveResponse.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearStatue() {
                copyOnWrite();
                ((CarlifeActiveResponse) this.instance).clearStatue();
                return this;
            }

            public Builder clearToken() {
                copyOnWrite();
                ((CarlifeActiveResponse) this.instance).clearToken();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeActiveResponseProto.CarlifeActiveResponseOrBuilder
            public String getStatue() {
                return ((CarlifeActiveResponse) this.instance).getStatue();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeActiveResponseProto.CarlifeActiveResponseOrBuilder
            public l getStatueBytes() {
                return ((CarlifeActiveResponse) this.instance).getStatueBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeActiveResponseProto.CarlifeActiveResponseOrBuilder
            public String getToken() {
                return ((CarlifeActiveResponse) this.instance).getToken();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeActiveResponseProto.CarlifeActiveResponseOrBuilder
            public l getTokenBytes() {
                return ((CarlifeActiveResponse) this.instance).getTokenBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeActiveResponseProto.CarlifeActiveResponseOrBuilder
            public boolean hasStatue() {
                return ((CarlifeActiveResponse) this.instance).hasStatue();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeActiveResponseProto.CarlifeActiveResponseOrBuilder
            public boolean hasToken() {
                return ((CarlifeActiveResponse) this.instance).hasToken();
            }

            public Builder setStatue(String str) {
                copyOnWrite();
                ((CarlifeActiveResponse) this.instance).setStatue(str);
                return this;
            }

            public Builder setStatueBytes(l lVar) {
                copyOnWrite();
                ((CarlifeActiveResponse) this.instance).setStatueBytes(lVar);
                return this;
            }

            public Builder setToken(String str) {
                copyOnWrite();
                ((CarlifeActiveResponse) this.instance).setToken(str);
                return this;
            }

            public Builder setTokenBytes(l lVar) {
                copyOnWrite();
                ((CarlifeActiveResponse) this.instance).setTokenBytes(lVar);
                return this;
            }
        }

        static {
            CarlifeActiveResponse carlifeActiveResponse = new CarlifeActiveResponse();
            DEFAULT_INSTANCE = carlifeActiveResponse;
            j0.registerDefaultInstance(CarlifeActiveResponse.class, carlifeActiveResponse);
        }

        private CarlifeActiveResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatue() {
            this.bitField0_ &= -2;
            this.statue_ = getDefaultInstance().getStatue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToken() {
            this.bitField0_ &= -3;
            this.token_ = getDefaultInstance().getToken();
        }

        public static CarlifeActiveResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeActiveResponse carlifeActiveResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeActiveResponse);
        }

        public static CarlifeActiveResponse parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeActiveResponse) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeActiveResponse parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeActiveResponse) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeActiveResponse parseFrom(l lVar) {
            return (CarlifeActiveResponse) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeActiveResponse parseFrom(l lVar, y yVar) {
            return (CarlifeActiveResponse) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeActiveResponse parseFrom(p pVar) {
            return (CarlifeActiveResponse) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeActiveResponse parseFrom(p pVar, y yVar) {
            return (CarlifeActiveResponse) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeActiveResponse parseFrom(InputStream inputStream) {
            return (CarlifeActiveResponse) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeActiveResponse parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeActiveResponse) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeActiveResponse parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeActiveResponse) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeActiveResponse parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeActiveResponse) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeActiveResponse parseFrom(byte[] bArr) {
            return (CarlifeActiveResponse) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeActiveResponse parseFrom(byte[] bArr, y yVar) {
            return (CarlifeActiveResponse) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatue(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.statue_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatueBytes(l lVar) {
            this.statue_ = lVar.u();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToken(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.token_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTokenBytes(l lVar) {
            this.token_ = lVar.u();
            this.bitField0_ |= 2;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "statue_", "token_"});
                case 3:
                    return new CarlifeActiveResponse();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeActiveResponse.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeActiveResponseProto.CarlifeActiveResponseOrBuilder
        public String getStatue() {
            return this.statue_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeActiveResponseProto.CarlifeActiveResponseOrBuilder
        public l getStatueBytes() {
            return l.m(this.statue_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeActiveResponseProto.CarlifeActiveResponseOrBuilder
        public String getToken() {
            return this.token_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeActiveResponseProto.CarlifeActiveResponseOrBuilder
        public l getTokenBytes() {
            return l.m(this.token_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeActiveResponseProto.CarlifeActiveResponseOrBuilder
        public boolean hasStatue() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeActiveResponseProto.CarlifeActiveResponseOrBuilder
        public boolean hasToken() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeActiveResponseOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        String getStatue();

        l getStatueBytes();

        String getToken();

        l getTokenBytes();

        boolean hasStatue();

        boolean hasToken();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeActiveResponseProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

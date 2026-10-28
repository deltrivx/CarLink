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
public final class CarlifeBTHfpStatusRequestProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeBTHfpStatusRequestProto$1, reason: invalid class name */
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
    public static final class CarlifeBTHfpStatusRequest extends j0 implements CarlifeBTHfpStatusRequestOrBuilder {
        private static final CarlifeBTHfpStatusRequest DEFAULT_INSTANCE;
        private static volatile s1 PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int type_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeBTHfpStatusRequestOrBuilder {
            private Builder() {
                super(CarlifeBTHfpStatusRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearType() {
                copyOnWrite();
                ((CarlifeBTHfpStatusRequest) this.instance).clearType();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpStatusRequestProto.CarlifeBTHfpStatusRequestOrBuilder
            public int getType() {
                return ((CarlifeBTHfpStatusRequest) this.instance).getType();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpStatusRequestProto.CarlifeBTHfpStatusRequestOrBuilder
            public boolean hasType() {
                return ((CarlifeBTHfpStatusRequest) this.instance).hasType();
            }

            public Builder setType(int i7) {
                copyOnWrite();
                ((CarlifeBTHfpStatusRequest) this.instance).setType(i7);
                return this;
            }
        }

        static {
            CarlifeBTHfpStatusRequest carlifeBTHfpStatusRequest = new CarlifeBTHfpStatusRequest();
            DEFAULT_INSTANCE = carlifeBTHfpStatusRequest;
            j0.registerDefaultInstance(CarlifeBTHfpStatusRequest.class, carlifeBTHfpStatusRequest);
        }

        private CarlifeBTHfpStatusRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static CarlifeBTHfpStatusRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeBTHfpStatusRequest carlifeBTHfpStatusRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeBTHfpStatusRequest);
        }

        public static CarlifeBTHfpStatusRequest parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeBTHfpStatusRequest) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeBTHfpStatusRequest parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeBTHfpStatusRequest) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeBTHfpStatusRequest parseFrom(l lVar) {
            return (CarlifeBTHfpStatusRequest) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeBTHfpStatusRequest parseFrom(l lVar, y yVar) {
            return (CarlifeBTHfpStatusRequest) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeBTHfpStatusRequest parseFrom(p pVar) {
            return (CarlifeBTHfpStatusRequest) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeBTHfpStatusRequest parseFrom(p pVar, y yVar) {
            return (CarlifeBTHfpStatusRequest) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeBTHfpStatusRequest parseFrom(InputStream inputStream) {
            return (CarlifeBTHfpStatusRequest) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeBTHfpStatusRequest parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeBTHfpStatusRequest) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeBTHfpStatusRequest parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeBTHfpStatusRequest) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeBTHfpStatusRequest parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeBTHfpStatusRequest) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeBTHfpStatusRequest parseFrom(byte[] bArr) {
            return (CarlifeBTHfpStatusRequest) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeBTHfpStatusRequest parseFrom(byte[] bArr, y yVar) {
            return (CarlifeBTHfpStatusRequest) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i7) {
            this.bitField0_ |= 1;
            this.type_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{"bitField0_", "type_"});
                case 3:
                    return new CarlifeBTHfpStatusRequest();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeBTHfpStatusRequest.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpStatusRequestProto.CarlifeBTHfpStatusRequestOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpStatusRequestProto.CarlifeBTHfpStatusRequestOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeBTHfpStatusRequestOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getType();

        boolean hasType();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeBTHfpStatusRequestProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

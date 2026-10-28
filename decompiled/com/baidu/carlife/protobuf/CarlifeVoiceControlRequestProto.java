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
public final class CarlifeVoiceControlRequestProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeVoiceControlRequestProto$1, reason: invalid class name */
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
    public static final class CarlifeVoiceControlRequest extends j0 implements CarlifeVoiceControlRequestOrBuilder {
        public static final int COMMAND_FIELD_NUMBER = 1;
        private static final CarlifeVoiceControlRequest DEFAULT_INSTANCE;
        public static final int OPT_FIELD_NUMBER = 2;
        private static volatile s1 PARSER;
        private int bitField0_;
        private int command_;
        private byte memoizedIsInitialized = 2;
        private int opt_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeVoiceControlRequestOrBuilder {
            private Builder() {
                super(CarlifeVoiceControlRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCommand() {
                copyOnWrite();
                ((CarlifeVoiceControlRequest) this.instance).clearCommand();
                return this;
            }

            public Builder clearOpt() {
                copyOnWrite();
                ((CarlifeVoiceControlRequest) this.instance).clearOpt();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVoiceControlRequestProto.CarlifeVoiceControlRequestOrBuilder
            public int getCommand() {
                return ((CarlifeVoiceControlRequest) this.instance).getCommand();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVoiceControlRequestProto.CarlifeVoiceControlRequestOrBuilder
            public int getOpt() {
                return ((CarlifeVoiceControlRequest) this.instance).getOpt();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVoiceControlRequestProto.CarlifeVoiceControlRequestOrBuilder
            public boolean hasCommand() {
                return ((CarlifeVoiceControlRequest) this.instance).hasCommand();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVoiceControlRequestProto.CarlifeVoiceControlRequestOrBuilder
            public boolean hasOpt() {
                return ((CarlifeVoiceControlRequest) this.instance).hasOpt();
            }

            public Builder setCommand(int i7) {
                copyOnWrite();
                ((CarlifeVoiceControlRequest) this.instance).setCommand(i7);
                return this;
            }

            public Builder setOpt(int i7) {
                copyOnWrite();
                ((CarlifeVoiceControlRequest) this.instance).setOpt(i7);
                return this;
            }
        }

        static {
            CarlifeVoiceControlRequest carlifeVoiceControlRequest = new CarlifeVoiceControlRequest();
            DEFAULT_INSTANCE = carlifeVoiceControlRequest;
            j0.registerDefaultInstance(CarlifeVoiceControlRequest.class, carlifeVoiceControlRequest);
        }

        private CarlifeVoiceControlRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCommand() {
            this.bitField0_ &= -2;
            this.command_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpt() {
            this.bitField0_ &= -3;
            this.opt_ = 0;
        }

        public static CarlifeVoiceControlRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeVoiceControlRequest carlifeVoiceControlRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeVoiceControlRequest);
        }

        public static CarlifeVoiceControlRequest parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeVoiceControlRequest) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeVoiceControlRequest parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeVoiceControlRequest) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeVoiceControlRequest parseFrom(l lVar) {
            return (CarlifeVoiceControlRequest) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeVoiceControlRequest parseFrom(l lVar, y yVar) {
            return (CarlifeVoiceControlRequest) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeVoiceControlRequest parseFrom(p pVar) {
            return (CarlifeVoiceControlRequest) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeVoiceControlRequest parseFrom(p pVar, y yVar) {
            return (CarlifeVoiceControlRequest) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeVoiceControlRequest parseFrom(InputStream inputStream) {
            return (CarlifeVoiceControlRequest) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeVoiceControlRequest parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeVoiceControlRequest) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeVoiceControlRequest parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeVoiceControlRequest) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeVoiceControlRequest parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeVoiceControlRequest) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeVoiceControlRequest parseFrom(byte[] bArr) {
            return (CarlifeVoiceControlRequest) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeVoiceControlRequest parseFrom(byte[] bArr, y yVar) {
            return (CarlifeVoiceControlRequest) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCommand(int i7) {
            this.bitField0_ |= 1;
            this.command_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpt(int i7) {
            this.bitField0_ |= 2;
            this.opt_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔄ\u0000\u0002င\u0001", new Object[]{"bitField0_", "command_", "opt_"});
                case 3:
                    return new CarlifeVoiceControlRequest();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeVoiceControlRequest.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeVoiceControlRequestProto.CarlifeVoiceControlRequestOrBuilder
        public int getCommand() {
            return this.command_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVoiceControlRequestProto.CarlifeVoiceControlRequestOrBuilder
        public int getOpt() {
            return this.opt_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVoiceControlRequestProto.CarlifeVoiceControlRequestOrBuilder
        public boolean hasCommand() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVoiceControlRequestProto.CarlifeVoiceControlRequestOrBuilder
        public boolean hasOpt() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeVoiceControlRequestOrBuilder extends m1 {
        int getCommand();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getOpt();

        boolean hasCommand();

        boolean hasOpt();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeVoiceControlRequestProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

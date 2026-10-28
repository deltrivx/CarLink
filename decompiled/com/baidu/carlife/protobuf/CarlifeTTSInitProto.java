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
public final class CarlifeTTSInitProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeTTSInitProto$1, reason: invalid class name */
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
    public static final class CarlifeTTSInit extends j0 implements CarlifeTTSInitOrBuilder {
        public static final int CHANNELCONFIG_FIELD_NUMBER = 2;
        private static final CarlifeTTSInit DEFAULT_INSTANCE;
        private static volatile s1 PARSER = null;
        public static final int SAMPLEFORMAT_FIELD_NUMBER = 3;
        public static final int SAMPLERATE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int channelConfig_;
        private byte memoizedIsInitialized = 2;
        private int sampleFormat_;
        private int sampleRate_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeTTSInitOrBuilder {
            private Builder() {
                super(CarlifeTTSInit.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearChannelConfig() {
                copyOnWrite();
                ((CarlifeTTSInit) this.instance).clearChannelConfig();
                return this;
            }

            public Builder clearSampleFormat() {
                copyOnWrite();
                ((CarlifeTTSInit) this.instance).clearSampleFormat();
                return this;
            }

            public Builder clearSampleRate() {
                copyOnWrite();
                ((CarlifeTTSInit) this.instance).clearSampleRate();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInitOrBuilder
            public int getChannelConfig() {
                return ((CarlifeTTSInit) this.instance).getChannelConfig();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInitOrBuilder
            public int getSampleFormat() {
                return ((CarlifeTTSInit) this.instance).getSampleFormat();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInitOrBuilder
            public int getSampleRate() {
                return ((CarlifeTTSInit) this.instance).getSampleRate();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInitOrBuilder
            public boolean hasChannelConfig() {
                return ((CarlifeTTSInit) this.instance).hasChannelConfig();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInitOrBuilder
            public boolean hasSampleFormat() {
                return ((CarlifeTTSInit) this.instance).hasSampleFormat();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInitOrBuilder
            public boolean hasSampleRate() {
                return ((CarlifeTTSInit) this.instance).hasSampleRate();
            }

            public Builder setChannelConfig(int i7) {
                copyOnWrite();
                ((CarlifeTTSInit) this.instance).setChannelConfig(i7);
                return this;
            }

            public Builder setSampleFormat(int i7) {
                copyOnWrite();
                ((CarlifeTTSInit) this.instance).setSampleFormat(i7);
                return this;
            }

            public Builder setSampleRate(int i7) {
                copyOnWrite();
                ((CarlifeTTSInit) this.instance).setSampleRate(i7);
                return this;
            }
        }

        static {
            CarlifeTTSInit carlifeTTSInit = new CarlifeTTSInit();
            DEFAULT_INSTANCE = carlifeTTSInit;
            j0.registerDefaultInstance(CarlifeTTSInit.class, carlifeTTSInit);
        }

        private CarlifeTTSInit() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChannelConfig() {
            this.bitField0_ &= -3;
            this.channelConfig_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSampleFormat() {
            this.bitField0_ &= -5;
            this.sampleFormat_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSampleRate() {
            this.bitField0_ &= -2;
            this.sampleRate_ = 0;
        }

        public static CarlifeTTSInit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeTTSInit carlifeTTSInit) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeTTSInit);
        }

        public static CarlifeTTSInit parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeTTSInit) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeTTSInit parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeTTSInit) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeTTSInit parseFrom(l lVar) {
            return (CarlifeTTSInit) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeTTSInit parseFrom(l lVar, y yVar) {
            return (CarlifeTTSInit) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeTTSInit parseFrom(p pVar) {
            return (CarlifeTTSInit) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeTTSInit parseFrom(p pVar, y yVar) {
            return (CarlifeTTSInit) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeTTSInit parseFrom(InputStream inputStream) {
            return (CarlifeTTSInit) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeTTSInit parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeTTSInit) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeTTSInit parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeTTSInit) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeTTSInit parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeTTSInit) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeTTSInit parseFrom(byte[] bArr) {
            return (CarlifeTTSInit) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeTTSInit parseFrom(byte[] bArr, y yVar) {
            return (CarlifeTTSInit) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChannelConfig(int i7) {
            this.bitField0_ |= 2;
            this.channelConfig_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSampleFormat(int i7) {
            this.bitField0_ |= 4;
            this.sampleFormat_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSampleRate(int i7) {
            this.bitField0_ |= 1;
            this.sampleRate_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002", new Object[]{"bitField0_", "sampleRate_", "channelConfig_", "sampleFormat_"});
                case 3:
                    return new CarlifeTTSInit();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeTTSInit.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInitOrBuilder
        public int getChannelConfig() {
            return this.channelConfig_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInitOrBuilder
        public int getSampleFormat() {
            return this.sampleFormat_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInitOrBuilder
        public int getSampleRate() {
            return this.sampleRate_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInitOrBuilder
        public boolean hasChannelConfig() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInitOrBuilder
        public boolean hasSampleFormat() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInitOrBuilder
        public boolean hasSampleRate() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeTTSInitOrBuilder extends m1 {
        int getChannelConfig();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getSampleFormat();

        int getSampleRate();

        boolean hasChannelConfig();

        boolean hasSampleFormat();

        boolean hasSampleRate();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeTTSInitProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

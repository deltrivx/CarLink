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
public final class CarlifeAccelerationProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeAccelerationProto$1, reason: invalid class name */
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
    public static final class CarlifeAcceleration extends j0 implements CarlifeAccelerationOrBuilder {
        public static final int ACCX_FIELD_NUMBER = 1;
        public static final int ACCY_FIELD_NUMBER = 2;
        public static final int ACCZ_FIELD_NUMBER = 3;
        private static final CarlifeAcceleration DEFAULT_INSTANCE;
        private static volatile s1 PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 4;
        private double accX_;
        private double accY_;
        private double accZ_;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private long timeStamp_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeAccelerationOrBuilder {
            private Builder() {
                super(CarlifeAcceleration.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAccX() {
                copyOnWrite();
                ((CarlifeAcceleration) this.instance).clearAccX();
                return this;
            }

            public Builder clearAccY() {
                copyOnWrite();
                ((CarlifeAcceleration) this.instance).clearAccY();
                return this;
            }

            public Builder clearAccZ() {
                copyOnWrite();
                ((CarlifeAcceleration) this.instance).clearAccZ();
                return this;
            }

            public Builder clearTimeStamp() {
                copyOnWrite();
                ((CarlifeAcceleration) this.instance).clearTimeStamp();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAccelerationOrBuilder
            public double getAccX() {
                return ((CarlifeAcceleration) this.instance).getAccX();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAccelerationOrBuilder
            public double getAccY() {
                return ((CarlifeAcceleration) this.instance).getAccY();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAccelerationOrBuilder
            public double getAccZ() {
                return ((CarlifeAcceleration) this.instance).getAccZ();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAccelerationOrBuilder
            public long getTimeStamp() {
                return ((CarlifeAcceleration) this.instance).getTimeStamp();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAccelerationOrBuilder
            public boolean hasAccX() {
                return ((CarlifeAcceleration) this.instance).hasAccX();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAccelerationOrBuilder
            public boolean hasAccY() {
                return ((CarlifeAcceleration) this.instance).hasAccY();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAccelerationOrBuilder
            public boolean hasAccZ() {
                return ((CarlifeAcceleration) this.instance).hasAccZ();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAccelerationOrBuilder
            public boolean hasTimeStamp() {
                return ((CarlifeAcceleration) this.instance).hasTimeStamp();
            }

            public Builder setAccX(double d10) {
                copyOnWrite();
                ((CarlifeAcceleration) this.instance).setAccX(d10);
                return this;
            }

            public Builder setAccY(double d10) {
                copyOnWrite();
                ((CarlifeAcceleration) this.instance).setAccY(d10);
                return this;
            }

            public Builder setAccZ(double d10) {
                copyOnWrite();
                ((CarlifeAcceleration) this.instance).setAccZ(d10);
                return this;
            }

            public Builder setTimeStamp(long j5) {
                copyOnWrite();
                ((CarlifeAcceleration) this.instance).setTimeStamp(j5);
                return this;
            }
        }

        static {
            CarlifeAcceleration carlifeAcceleration = new CarlifeAcceleration();
            DEFAULT_INSTANCE = carlifeAcceleration;
            j0.registerDefaultInstance(CarlifeAcceleration.class, carlifeAcceleration);
        }

        private CarlifeAcceleration() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccX() {
            this.bitField0_ &= -2;
            this.accX_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccY() {
            this.bitField0_ &= -3;
            this.accY_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccZ() {
            this.bitField0_ &= -5;
            this.accZ_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeStamp() {
            this.bitField0_ &= -9;
            this.timeStamp_ = 0L;
        }

        public static CarlifeAcceleration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeAcceleration carlifeAcceleration) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeAcceleration);
        }

        public static CarlifeAcceleration parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeAcceleration) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeAcceleration parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeAcceleration) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeAcceleration parseFrom(l lVar) {
            return (CarlifeAcceleration) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeAcceleration parseFrom(l lVar, y yVar) {
            return (CarlifeAcceleration) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeAcceleration parseFrom(p pVar) {
            return (CarlifeAcceleration) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeAcceleration parseFrom(p pVar, y yVar) {
            return (CarlifeAcceleration) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeAcceleration parseFrom(InputStream inputStream) {
            return (CarlifeAcceleration) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeAcceleration parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeAcceleration) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeAcceleration parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeAcceleration) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeAcceleration parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeAcceleration) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeAcceleration parseFrom(byte[] bArr) {
            return (CarlifeAcceleration) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeAcceleration parseFrom(byte[] bArr, y yVar) {
            return (CarlifeAcceleration) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccX(double d10) {
            this.bitField0_ |= 1;
            this.accX_ = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccY(double d10) {
            this.bitField0_ |= 2;
            this.accY_ = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccZ(double d10) {
            this.bitField0_ |= 4;
            this.accZ_ = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeStamp(long j5) {
            this.bitField0_ |= 8;
            this.timeStamp_ = j5;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᔀ\u0000\u0002ᔀ\u0001\u0003ᔀ\u0002\u0004ဃ\u0003", new Object[]{"bitField0_", "accX_", "accY_", "accZ_", "timeStamp_"});
                case 3:
                    return new CarlifeAcceleration();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeAcceleration.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAccelerationOrBuilder
        public double getAccX() {
            return this.accX_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAccelerationOrBuilder
        public double getAccY() {
            return this.accY_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAccelerationOrBuilder
        public double getAccZ() {
            return this.accZ_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAccelerationOrBuilder
        public long getTimeStamp() {
            return this.timeStamp_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAccelerationOrBuilder
        public boolean hasAccX() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAccelerationOrBuilder
        public boolean hasAccY() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAccelerationOrBuilder
        public boolean hasAccZ() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeAccelerationProto.CarlifeAccelerationOrBuilder
        public boolean hasTimeStamp() {
            return (this.bitField0_ & 8) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeAccelerationOrBuilder extends m1 {
        double getAccX();

        double getAccY();

        double getAccZ();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        long getTimeStamp();

        boolean hasAccX();

        boolean hasAccY();

        boolean hasAccZ();

        boolean hasTimeStamp();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeAccelerationProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

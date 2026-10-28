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
public final class CarlifeCarSpeedProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeCarSpeedProto$1, reason: invalid class name */
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
    public static final class CarlifeCarSpeed extends j0 implements CarlifeCarSpeedOrBuilder {
        private static final CarlifeCarSpeed DEFAULT_INSTANCE;
        private static volatile s1 PARSER = null;
        public static final int SPEED_FIELD_NUMBER = 1;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int speed_;
        private long timeStamp_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeCarSpeedOrBuilder {
            private Builder() {
                super(CarlifeCarSpeed.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearSpeed() {
                copyOnWrite();
                ((CarlifeCarSpeed) this.instance).clearSpeed();
                return this;
            }

            public Builder clearTimeStamp() {
                copyOnWrite();
                ((CarlifeCarSpeed) this.instance).clearTimeStamp();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeedOrBuilder
            public int getSpeed() {
                return ((CarlifeCarSpeed) this.instance).getSpeed();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeedOrBuilder
            public long getTimeStamp() {
                return ((CarlifeCarSpeed) this.instance).getTimeStamp();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeedOrBuilder
            public boolean hasSpeed() {
                return ((CarlifeCarSpeed) this.instance).hasSpeed();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeedOrBuilder
            public boolean hasTimeStamp() {
                return ((CarlifeCarSpeed) this.instance).hasTimeStamp();
            }

            public Builder setSpeed(int i7) {
                copyOnWrite();
                ((CarlifeCarSpeed) this.instance).setSpeed(i7);
                return this;
            }

            public Builder setTimeStamp(long j5) {
                copyOnWrite();
                ((CarlifeCarSpeed) this.instance).setTimeStamp(j5);
                return this;
            }
        }

        static {
            CarlifeCarSpeed carlifeCarSpeed = new CarlifeCarSpeed();
            DEFAULT_INSTANCE = carlifeCarSpeed;
            j0.registerDefaultInstance(CarlifeCarSpeed.class, carlifeCarSpeed);
        }

        private CarlifeCarSpeed() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpeed() {
            this.bitField0_ &= -2;
            this.speed_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeStamp() {
            this.bitField0_ &= -3;
            this.timeStamp_ = 0L;
        }

        public static CarlifeCarSpeed getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeCarSpeed carlifeCarSpeed) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeCarSpeed);
        }

        public static CarlifeCarSpeed parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeCarSpeed) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeCarSpeed parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeCarSpeed) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeCarSpeed parseFrom(l lVar) {
            return (CarlifeCarSpeed) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeCarSpeed parseFrom(l lVar, y yVar) {
            return (CarlifeCarSpeed) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeCarSpeed parseFrom(p pVar) {
            return (CarlifeCarSpeed) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeCarSpeed parseFrom(p pVar, y yVar) {
            return (CarlifeCarSpeed) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeCarSpeed parseFrom(InputStream inputStream) {
            return (CarlifeCarSpeed) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeCarSpeed parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeCarSpeed) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeCarSpeed parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeCarSpeed) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeCarSpeed parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeCarSpeed) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeCarSpeed parseFrom(byte[] bArr) {
            return (CarlifeCarSpeed) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeCarSpeed parseFrom(byte[] bArr, y yVar) {
            return (CarlifeCarSpeed) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpeed(int i7) {
            this.bitField0_ |= 1;
            this.speed_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeStamp(long j5) {
            this.bitField0_ |= 2;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔄ\u0000\u0002ဃ\u0001", new Object[]{"bitField0_", "speed_", "timeStamp_"});
                case 3:
                    return new CarlifeCarSpeed();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeCarSpeed.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeedOrBuilder
        public int getSpeed() {
            return this.speed_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeedOrBuilder
        public long getTimeStamp() {
            return this.timeStamp_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeedOrBuilder
        public boolean hasSpeed() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarSpeedProto.CarlifeCarSpeedOrBuilder
        public boolean hasTimeStamp() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeCarSpeedOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getSpeed();

        long getTimeStamp();

        boolean hasSpeed();

        boolean hasTimeStamp();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeCarSpeedProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

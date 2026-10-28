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
public final class CarlifeGyroscopeProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeGyroscopeProto$1, reason: invalid class name */
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
    public static final class CarlifeGyroscope extends j0 implements CarlifeGyroscopeOrBuilder {
        private static final CarlifeGyroscope DEFAULT_INSTANCE;
        public static final int GYROTYPE_FIELD_NUMBER = 1;
        public static final int GYROX_FIELD_NUMBER = 2;
        public static final int GYROY_FIELD_NUMBER = 3;
        public static final int GYROZ_FIELD_NUMBER = 4;
        private static volatile s1 PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 5;
        private int bitField0_;
        private int gyroType_;
        private double gyroX_;
        private double gyroZ_;
        private double gyroy_;
        private byte memoizedIsInitialized = 2;
        private long timeStamp_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeGyroscopeOrBuilder {
            private Builder() {
                super(CarlifeGyroscope.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearGyroType() {
                copyOnWrite();
                ((CarlifeGyroscope) this.instance).clearGyroType();
                return this;
            }

            public Builder clearGyroX() {
                copyOnWrite();
                ((CarlifeGyroscope) this.instance).clearGyroX();
                return this;
            }

            public Builder clearGyroZ() {
                copyOnWrite();
                ((CarlifeGyroscope) this.instance).clearGyroZ();
                return this;
            }

            public Builder clearGyroy() {
                copyOnWrite();
                ((CarlifeGyroscope) this.instance).clearGyroy();
                return this;
            }

            public Builder clearTimeStamp() {
                copyOnWrite();
                ((CarlifeGyroscope) this.instance).clearTimeStamp();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
            public int getGyroType() {
                return ((CarlifeGyroscope) this.instance).getGyroType();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
            public double getGyroX() {
                return ((CarlifeGyroscope) this.instance).getGyroX();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
            public double getGyroZ() {
                return ((CarlifeGyroscope) this.instance).getGyroZ();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
            public double getGyroy() {
                return ((CarlifeGyroscope) this.instance).getGyroy();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
            public long getTimeStamp() {
                return ((CarlifeGyroscope) this.instance).getTimeStamp();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
            public boolean hasGyroType() {
                return ((CarlifeGyroscope) this.instance).hasGyroType();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
            public boolean hasGyroX() {
                return ((CarlifeGyroscope) this.instance).hasGyroX();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
            public boolean hasGyroZ() {
                return ((CarlifeGyroscope) this.instance).hasGyroZ();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
            public boolean hasGyroy() {
                return ((CarlifeGyroscope) this.instance).hasGyroy();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
            public boolean hasTimeStamp() {
                return ((CarlifeGyroscope) this.instance).hasTimeStamp();
            }

            public Builder setGyroType(int i7) {
                copyOnWrite();
                ((CarlifeGyroscope) this.instance).setGyroType(i7);
                return this;
            }

            public Builder setGyroX(double d10) {
                copyOnWrite();
                ((CarlifeGyroscope) this.instance).setGyroX(d10);
                return this;
            }

            public Builder setGyroZ(double d10) {
                copyOnWrite();
                ((CarlifeGyroscope) this.instance).setGyroZ(d10);
                return this;
            }

            public Builder setGyroy(double d10) {
                copyOnWrite();
                ((CarlifeGyroscope) this.instance).setGyroy(d10);
                return this;
            }

            public Builder setTimeStamp(long j5) {
                copyOnWrite();
                ((CarlifeGyroscope) this.instance).setTimeStamp(j5);
                return this;
            }
        }

        static {
            CarlifeGyroscope carlifeGyroscope = new CarlifeGyroscope();
            DEFAULT_INSTANCE = carlifeGyroscope;
            j0.registerDefaultInstance(CarlifeGyroscope.class, carlifeGyroscope);
        }

        private CarlifeGyroscope() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGyroType() {
            this.bitField0_ &= -2;
            this.gyroType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGyroX() {
            this.bitField0_ &= -3;
            this.gyroX_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGyroZ() {
            this.bitField0_ &= -9;
            this.gyroZ_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGyroy() {
            this.bitField0_ &= -5;
            this.gyroy_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeStamp() {
            this.bitField0_ &= -17;
            this.timeStamp_ = 0L;
        }

        public static CarlifeGyroscope getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeGyroscope carlifeGyroscope) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeGyroscope);
        }

        public static CarlifeGyroscope parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeGyroscope) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeGyroscope parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeGyroscope) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeGyroscope parseFrom(l lVar) {
            return (CarlifeGyroscope) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeGyroscope parseFrom(l lVar, y yVar) {
            return (CarlifeGyroscope) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeGyroscope parseFrom(p pVar) {
            return (CarlifeGyroscope) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeGyroscope parseFrom(p pVar, y yVar) {
            return (CarlifeGyroscope) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeGyroscope parseFrom(InputStream inputStream) {
            return (CarlifeGyroscope) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeGyroscope parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeGyroscope) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeGyroscope parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeGyroscope) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeGyroscope parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeGyroscope) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeGyroscope parseFrom(byte[] bArr) {
            return (CarlifeGyroscope) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeGyroscope parseFrom(byte[] bArr, y yVar) {
            return (CarlifeGyroscope) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGyroType(int i7) {
            this.bitField0_ |= 1;
            this.gyroType_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGyroX(double d10) {
            this.bitField0_ |= 2;
            this.gyroX_ = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGyroZ(double d10) {
            this.bitField0_ |= 8;
            this.gyroZ_ = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGyroy(double d10) {
            this.bitField0_ |= 4;
            this.gyroy_ = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeStamp(long j5) {
            this.bitField0_ |= 16;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔀ\u0001\u0003ᔀ\u0002\u0004ᔀ\u0003\u0005ဃ\u0004", new Object[]{"bitField0_", "gyroType_", "gyroX_", "gyroy_", "gyroZ_", "timeStamp_"});
                case 3:
                    return new CarlifeGyroscope();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeGyroscope.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
        public int getGyroType() {
            return this.gyroType_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
        public double getGyroX() {
            return this.gyroX_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
        public double getGyroZ() {
            return this.gyroZ_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
        public double getGyroy() {
            return this.gyroy_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
        public long getTimeStamp() {
            return this.timeStamp_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
        public boolean hasGyroType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
        public boolean hasGyroX() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
        public boolean hasGyroZ() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
        public boolean hasGyroy() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeGyroscopeProto.CarlifeGyroscopeOrBuilder
        public boolean hasTimeStamp() {
            return (this.bitField0_ & 16) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeGyroscopeOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getGyroType();

        double getGyroX();

        double getGyroZ();

        double getGyroy();

        long getTimeStamp();

        boolean hasGyroType();

        boolean hasGyroX();

        boolean hasGyroZ();

        boolean hasGyroy();

        boolean hasTimeStamp();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeGyroscopeProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

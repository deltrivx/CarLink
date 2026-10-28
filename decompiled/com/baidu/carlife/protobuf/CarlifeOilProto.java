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
public final class CarlifeOilProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeOilProto$1, reason: invalid class name */
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
    public static final class CarlifeOil extends j0 implements CarlifeOilOrBuilder {
        private static final CarlifeOil DEFAULT_INSTANCE;
        public static final int LEVEL_FIELD_NUMBER = 1;
        public static final int LOWFULEWARNING_FIELD_NUMBER = 3;
        private static volatile s1 PARSER = null;
        public static final int RANGE_FIELD_NUMBER = 2;
        private int bitField0_;
        private int level_;
        private boolean lowFuleWarning_;
        private byte memoizedIsInitialized = 2;
        private int range_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeOilOrBuilder {
            private Builder() {
                super(CarlifeOil.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearLevel() {
                copyOnWrite();
                ((CarlifeOil) this.instance).clearLevel();
                return this;
            }

            public Builder clearLowFuleWarning() {
                copyOnWrite();
                ((CarlifeOil) this.instance).clearLowFuleWarning();
                return this;
            }

            public Builder clearRange() {
                copyOnWrite();
                ((CarlifeOil) this.instance).clearRange();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeOilProto.CarlifeOilOrBuilder
            public int getLevel() {
                return ((CarlifeOil) this.instance).getLevel();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeOilProto.CarlifeOilOrBuilder
            public boolean getLowFuleWarning() {
                return ((CarlifeOil) this.instance).getLowFuleWarning();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeOilProto.CarlifeOilOrBuilder
            public int getRange() {
                return ((CarlifeOil) this.instance).getRange();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeOilProto.CarlifeOilOrBuilder
            public boolean hasLevel() {
                return ((CarlifeOil) this.instance).hasLevel();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeOilProto.CarlifeOilOrBuilder
            public boolean hasLowFuleWarning() {
                return ((CarlifeOil) this.instance).hasLowFuleWarning();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeOilProto.CarlifeOilOrBuilder
            public boolean hasRange() {
                return ((CarlifeOil) this.instance).hasRange();
            }

            public Builder setLevel(int i7) {
                copyOnWrite();
                ((CarlifeOil) this.instance).setLevel(i7);
                return this;
            }

            public Builder setLowFuleWarning(boolean z10) {
                copyOnWrite();
                ((CarlifeOil) this.instance).setLowFuleWarning(z10);
                return this;
            }

            public Builder setRange(int i7) {
                copyOnWrite();
                ((CarlifeOil) this.instance).setRange(i7);
                return this;
            }
        }

        static {
            CarlifeOil carlifeOil = new CarlifeOil();
            DEFAULT_INSTANCE = carlifeOil;
            j0.registerDefaultInstance(CarlifeOil.class, carlifeOil);
        }

        private CarlifeOil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLevel() {
            this.bitField0_ &= -2;
            this.level_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLowFuleWarning() {
            this.bitField0_ &= -5;
            this.lowFuleWarning_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRange() {
            this.bitField0_ &= -3;
            this.range_ = 0;
        }

        public static CarlifeOil getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeOil carlifeOil) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeOil);
        }

        public static CarlifeOil parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeOil) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeOil parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeOil) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeOil parseFrom(l lVar) {
            return (CarlifeOil) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeOil parseFrom(l lVar, y yVar) {
            return (CarlifeOil) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeOil parseFrom(p pVar) {
            return (CarlifeOil) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeOil parseFrom(p pVar, y yVar) {
            return (CarlifeOil) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeOil parseFrom(InputStream inputStream) {
            return (CarlifeOil) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeOil parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeOil) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeOil parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeOil) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeOil parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeOil) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeOil parseFrom(byte[] bArr) {
            return (CarlifeOil) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeOil parseFrom(byte[] bArr, y yVar) {
            return (CarlifeOil) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevel(int i7) {
            this.bitField0_ |= 1;
            this.level_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLowFuleWarning(boolean z10) {
            this.bitField0_ |= 4;
            this.lowFuleWarning_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRange(int i7) {
            this.bitField0_ |= 2;
            this.range_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "level_", "range_", "lowFuleWarning_"});
                case 3:
                    return new CarlifeOil();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeOil.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeOilProto.CarlifeOilOrBuilder
        public int getLevel() {
            return this.level_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeOilProto.CarlifeOilOrBuilder
        public boolean getLowFuleWarning() {
            return this.lowFuleWarning_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeOilProto.CarlifeOilOrBuilder
        public int getRange() {
            return this.range_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeOilProto.CarlifeOilOrBuilder
        public boolean hasLevel() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeOilProto.CarlifeOilOrBuilder
        public boolean hasLowFuleWarning() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeOilProto.CarlifeOilOrBuilder
        public boolean hasRange() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeOilOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getLevel();

        boolean getLowFuleWarning();

        int getRange();

        boolean hasLevel();

        boolean hasLowFuleWarning();

        boolean hasRange();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeOilProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

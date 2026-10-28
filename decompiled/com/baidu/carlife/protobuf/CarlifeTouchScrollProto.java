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
public final class CarlifeTouchScrollProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeTouchScrollProto$1, reason: invalid class name */
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
    public static final class CarlifeTouchScroll extends j0 implements CarlifeTouchScrollOrBuilder {
        private static final CarlifeTouchScroll DEFAULT_INSTANCE;
        public static final int DISTANCEX_FIELD_NUMBER = 5;
        public static final int DISTANCEY_FIELD_NUMBER = 6;
        private static volatile s1 PARSER = null;
        public static final int X1_FIELD_NUMBER = 1;
        public static final int X2_FIELD_NUMBER = 3;
        public static final int Y1_FIELD_NUMBER = 2;
        public static final int Y2_FIELD_NUMBER = 4;
        private int bitField0_;
        private float distanceX_;
        private float distanceY_;
        private byte memoizedIsInitialized = 2;
        private int x1_;
        private int x2_;
        private int y1_;
        private int y2_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeTouchScrollOrBuilder {
            private Builder() {
                super(CarlifeTouchScroll.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDistanceX() {
                copyOnWrite();
                ((CarlifeTouchScroll) this.instance).clearDistanceX();
                return this;
            }

            public Builder clearDistanceY() {
                copyOnWrite();
                ((CarlifeTouchScroll) this.instance).clearDistanceY();
                return this;
            }

            public Builder clearX1() {
                copyOnWrite();
                ((CarlifeTouchScroll) this.instance).clearX1();
                return this;
            }

            public Builder clearX2() {
                copyOnWrite();
                ((CarlifeTouchScroll) this.instance).clearX2();
                return this;
            }

            public Builder clearY1() {
                copyOnWrite();
                ((CarlifeTouchScroll) this.instance).clearY1();
                return this;
            }

            public Builder clearY2() {
                copyOnWrite();
                ((CarlifeTouchScroll) this.instance).clearY2();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
            public float getDistanceX() {
                return ((CarlifeTouchScroll) this.instance).getDistanceX();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
            public float getDistanceY() {
                return ((CarlifeTouchScroll) this.instance).getDistanceY();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
            public int getX1() {
                return ((CarlifeTouchScroll) this.instance).getX1();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
            public int getX2() {
                return ((CarlifeTouchScroll) this.instance).getX2();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
            public int getY1() {
                return ((CarlifeTouchScroll) this.instance).getY1();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
            public int getY2() {
                return ((CarlifeTouchScroll) this.instance).getY2();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
            public boolean hasDistanceX() {
                return ((CarlifeTouchScroll) this.instance).hasDistanceX();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
            public boolean hasDistanceY() {
                return ((CarlifeTouchScroll) this.instance).hasDistanceY();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
            public boolean hasX1() {
                return ((CarlifeTouchScroll) this.instance).hasX1();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
            public boolean hasX2() {
                return ((CarlifeTouchScroll) this.instance).hasX2();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
            public boolean hasY1() {
                return ((CarlifeTouchScroll) this.instance).hasY1();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
            public boolean hasY2() {
                return ((CarlifeTouchScroll) this.instance).hasY2();
            }

            public Builder setDistanceX(float f10) {
                copyOnWrite();
                ((CarlifeTouchScroll) this.instance).setDistanceX(f10);
                return this;
            }

            public Builder setDistanceY(float f10) {
                copyOnWrite();
                ((CarlifeTouchScroll) this.instance).setDistanceY(f10);
                return this;
            }

            public Builder setX1(int i7) {
                copyOnWrite();
                ((CarlifeTouchScroll) this.instance).setX1(i7);
                return this;
            }

            public Builder setX2(int i7) {
                copyOnWrite();
                ((CarlifeTouchScroll) this.instance).setX2(i7);
                return this;
            }

            public Builder setY1(int i7) {
                copyOnWrite();
                ((CarlifeTouchScroll) this.instance).setY1(i7);
                return this;
            }

            public Builder setY2(int i7) {
                copyOnWrite();
                ((CarlifeTouchScroll) this.instance).setY2(i7);
                return this;
            }
        }

        static {
            CarlifeTouchScroll carlifeTouchScroll = new CarlifeTouchScroll();
            DEFAULT_INSTANCE = carlifeTouchScroll;
            j0.registerDefaultInstance(CarlifeTouchScroll.class, carlifeTouchScroll);
        }

        private CarlifeTouchScroll() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDistanceX() {
            this.bitField0_ &= -17;
            this.distanceX_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDistanceY() {
            this.bitField0_ &= -33;
            this.distanceY_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearX1() {
            this.bitField0_ &= -2;
            this.x1_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearX2() {
            this.bitField0_ &= -5;
            this.x2_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearY1() {
            this.bitField0_ &= -3;
            this.y1_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearY2() {
            this.bitField0_ &= -9;
            this.y2_ = 0;
        }

        public static CarlifeTouchScroll getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeTouchScroll carlifeTouchScroll) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeTouchScroll);
        }

        public static CarlifeTouchScroll parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeTouchScroll) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeTouchScroll parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeTouchScroll) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeTouchScroll parseFrom(l lVar) {
            return (CarlifeTouchScroll) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeTouchScroll parseFrom(l lVar, y yVar) {
            return (CarlifeTouchScroll) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeTouchScroll parseFrom(p pVar) {
            return (CarlifeTouchScroll) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeTouchScroll parseFrom(p pVar, y yVar) {
            return (CarlifeTouchScroll) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeTouchScroll parseFrom(InputStream inputStream) {
            return (CarlifeTouchScroll) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeTouchScroll parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeTouchScroll) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeTouchScroll parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeTouchScroll) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeTouchScroll parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeTouchScroll) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeTouchScroll parseFrom(byte[] bArr) {
            return (CarlifeTouchScroll) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeTouchScroll parseFrom(byte[] bArr, y yVar) {
            return (CarlifeTouchScroll) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDistanceX(float f10) {
            this.bitField0_ |= 16;
            this.distanceX_ = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDistanceY(float f10) {
            this.bitField0_ |= 32;
            this.distanceY_ = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setX1(int i7) {
            this.bitField0_ |= 1;
            this.x1_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setX2(int i7) {
            this.bitField0_ |= 4;
            this.x2_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setY1(int i7) {
            this.bitField0_ |= 2;
            this.y1_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setY2(int i7) {
            this.bitField0_ |= 8;
            this.y2_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005ᔁ\u0004\u0006ᔁ\u0005", new Object[]{"bitField0_", "x1_", "y1_", "x2_", "y2_", "distanceX_", "distanceY_"});
                case 3:
                    return new CarlifeTouchScroll();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeTouchScroll.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
        public float getDistanceX() {
            return this.distanceX_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
        public float getDistanceY() {
            return this.distanceY_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
        public int getX1() {
            return this.x1_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
        public int getX2() {
            return this.x2_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
        public int getY1() {
            return this.y1_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
        public int getY2() {
            return this.y2_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
        public boolean hasDistanceX() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
        public boolean hasDistanceY() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
        public boolean hasX1() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
        public boolean hasX2() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
        public boolean hasY1() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchScrollProto.CarlifeTouchScrollOrBuilder
        public boolean hasY2() {
            return (this.bitField0_ & 8) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeTouchScrollOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        float getDistanceX();

        float getDistanceY();

        int getX1();

        int getX2();

        int getY1();

        int getY2();

        boolean hasDistanceX();

        boolean hasDistanceY();

        boolean hasX1();

        boolean hasX2();

        boolean hasY1();

        boolean hasY2();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeTouchScrollProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

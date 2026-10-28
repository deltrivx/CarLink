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
public final class CarlifeTouchFlingProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeTouchFlingProto$1, reason: invalid class name */
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
    public static final class CarlifeTouchFling extends j0 implements CarlifeTouchFlingOrBuilder {
        private static final CarlifeTouchFling DEFAULT_INSTANCE;
        private static volatile s1 PARSER = null;
        public static final int VELOCITYX_FIELD_NUMBER = 5;
        public static final int VELOCITYY_FIELD_NUMBER = 6;
        public static final int X1_FIELD_NUMBER = 1;
        public static final int X2_FIELD_NUMBER = 3;
        public static final int Y1_FIELD_NUMBER = 2;
        public static final int Y2_FIELD_NUMBER = 4;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private float velocityX_;
        private float velocityY_;
        private int x1_;
        private int x2_;
        private int y1_;
        private int y2_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeTouchFlingOrBuilder {
            private Builder() {
                super(CarlifeTouchFling.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearVelocityX() {
                copyOnWrite();
                ((CarlifeTouchFling) this.instance).clearVelocityX();
                return this;
            }

            public Builder clearVelocityY() {
                copyOnWrite();
                ((CarlifeTouchFling) this.instance).clearVelocityY();
                return this;
            }

            public Builder clearX1() {
                copyOnWrite();
                ((CarlifeTouchFling) this.instance).clearX1();
                return this;
            }

            public Builder clearX2() {
                copyOnWrite();
                ((CarlifeTouchFling) this.instance).clearX2();
                return this;
            }

            public Builder clearY1() {
                copyOnWrite();
                ((CarlifeTouchFling) this.instance).clearY1();
                return this;
            }

            public Builder clearY2() {
                copyOnWrite();
                ((CarlifeTouchFling) this.instance).clearY2();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
            public float getVelocityX() {
                return ((CarlifeTouchFling) this.instance).getVelocityX();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
            public float getVelocityY() {
                return ((CarlifeTouchFling) this.instance).getVelocityY();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
            public int getX1() {
                return ((CarlifeTouchFling) this.instance).getX1();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
            public int getX2() {
                return ((CarlifeTouchFling) this.instance).getX2();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
            public int getY1() {
                return ((CarlifeTouchFling) this.instance).getY1();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
            public int getY2() {
                return ((CarlifeTouchFling) this.instance).getY2();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
            public boolean hasVelocityX() {
                return ((CarlifeTouchFling) this.instance).hasVelocityX();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
            public boolean hasVelocityY() {
                return ((CarlifeTouchFling) this.instance).hasVelocityY();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
            public boolean hasX1() {
                return ((CarlifeTouchFling) this.instance).hasX1();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
            public boolean hasX2() {
                return ((CarlifeTouchFling) this.instance).hasX2();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
            public boolean hasY1() {
                return ((CarlifeTouchFling) this.instance).hasY1();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
            public boolean hasY2() {
                return ((CarlifeTouchFling) this.instance).hasY2();
            }

            public Builder setVelocityX(float f10) {
                copyOnWrite();
                ((CarlifeTouchFling) this.instance).setVelocityX(f10);
                return this;
            }

            public Builder setVelocityY(float f10) {
                copyOnWrite();
                ((CarlifeTouchFling) this.instance).setVelocityY(f10);
                return this;
            }

            public Builder setX1(int i7) {
                copyOnWrite();
                ((CarlifeTouchFling) this.instance).setX1(i7);
                return this;
            }

            public Builder setX2(int i7) {
                copyOnWrite();
                ((CarlifeTouchFling) this.instance).setX2(i7);
                return this;
            }

            public Builder setY1(int i7) {
                copyOnWrite();
                ((CarlifeTouchFling) this.instance).setY1(i7);
                return this;
            }

            public Builder setY2(int i7) {
                copyOnWrite();
                ((CarlifeTouchFling) this.instance).setY2(i7);
                return this;
            }
        }

        static {
            CarlifeTouchFling carlifeTouchFling = new CarlifeTouchFling();
            DEFAULT_INSTANCE = carlifeTouchFling;
            j0.registerDefaultInstance(CarlifeTouchFling.class, carlifeTouchFling);
        }

        private CarlifeTouchFling() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVelocityX() {
            this.bitField0_ &= -17;
            this.velocityX_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVelocityY() {
            this.bitField0_ &= -33;
            this.velocityY_ = 0.0f;
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

        public static CarlifeTouchFling getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeTouchFling carlifeTouchFling) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeTouchFling);
        }

        public static CarlifeTouchFling parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeTouchFling) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeTouchFling parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeTouchFling) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeTouchFling parseFrom(l lVar) {
            return (CarlifeTouchFling) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeTouchFling parseFrom(l lVar, y yVar) {
            return (CarlifeTouchFling) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeTouchFling parseFrom(p pVar) {
            return (CarlifeTouchFling) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeTouchFling parseFrom(p pVar, y yVar) {
            return (CarlifeTouchFling) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeTouchFling parseFrom(InputStream inputStream) {
            return (CarlifeTouchFling) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeTouchFling parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeTouchFling) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeTouchFling parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeTouchFling) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeTouchFling parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeTouchFling) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeTouchFling parseFrom(byte[] bArr) {
            return (CarlifeTouchFling) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeTouchFling parseFrom(byte[] bArr, y yVar) {
            return (CarlifeTouchFling) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVelocityX(float f10) {
            this.bitField0_ |= 16;
            this.velocityX_ = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVelocityY(float f10) {
            this.bitField0_ |= 32;
            this.velocityY_ = f10;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005ᔁ\u0004\u0006ᔁ\u0005", new Object[]{"bitField0_", "x1_", "y1_", "x2_", "y2_", "velocityX_", "velocityY_"});
                case 3:
                    return new CarlifeTouchFling();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeTouchFling.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
        public float getVelocityX() {
            return this.velocityX_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
        public float getVelocityY() {
            return this.velocityY_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
        public int getX1() {
            return this.x1_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
        public int getX2() {
            return this.x2_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
        public int getY1() {
            return this.y1_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
        public int getY2() {
            return this.y2_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
        public boolean hasVelocityX() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
        public boolean hasVelocityY() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
        public boolean hasX1() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
        public boolean hasX2() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
        public boolean hasY1() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchFlingProto.CarlifeTouchFlingOrBuilder
        public boolean hasY2() {
            return (this.bitField0_ & 8) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeTouchFlingOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        float getVelocityX();

        float getVelocityY();

        int getX1();

        int getX2();

        int getY1();

        int getY2();

        boolean hasVelocityX();

        boolean hasVelocityY();

        boolean hasX1();

        boolean hasX2();

        boolean hasY1();

        boolean hasY2();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeTouchFlingProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

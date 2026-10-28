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
public final class CarlifeTouchSinglePointProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeTouchSinglePointProto$1, reason: invalid class name */
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
    public static final class CarlifeTouchSinglePoint extends j0 implements CarlifeTouchSinglePointOrBuilder {
        private static final CarlifeTouchSinglePoint DEFAULT_INSTANCE;
        private static volatile s1 PARSER = null;
        public static final int POINTERX_FIELD_NUMBER = 3;
        public static final int POINTERY_FIELD_NUMBER = 4;
        public static final int X_FIELD_NUMBER = 1;
        public static final int Y_FIELD_NUMBER = 2;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int pointerx_;
        private int pointery_;
        private int x_;
        private int y_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeTouchSinglePointOrBuilder {
            private Builder() {
                super(CarlifeTouchSinglePoint.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearPointerx() {
                copyOnWrite();
                ((CarlifeTouchSinglePoint) this.instance).clearPointerx();
                return this;
            }

            public Builder clearPointery() {
                copyOnWrite();
                ((CarlifeTouchSinglePoint) this.instance).clearPointery();
                return this;
            }

            public Builder clearX() {
                copyOnWrite();
                ((CarlifeTouchSinglePoint) this.instance).clearX();
                return this;
            }

            public Builder clearY() {
                copyOnWrite();
                ((CarlifeTouchSinglePoint) this.instance).clearY();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePointOrBuilder
            public int getPointerx() {
                return ((CarlifeTouchSinglePoint) this.instance).getPointerx();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePointOrBuilder
            public int getPointery() {
                return ((CarlifeTouchSinglePoint) this.instance).getPointery();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePointOrBuilder
            public int getX() {
                return ((CarlifeTouchSinglePoint) this.instance).getX();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePointOrBuilder
            public int getY() {
                return ((CarlifeTouchSinglePoint) this.instance).getY();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePointOrBuilder
            public boolean hasPointerx() {
                return ((CarlifeTouchSinglePoint) this.instance).hasPointerx();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePointOrBuilder
            public boolean hasPointery() {
                return ((CarlifeTouchSinglePoint) this.instance).hasPointery();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePointOrBuilder
            public boolean hasX() {
                return ((CarlifeTouchSinglePoint) this.instance).hasX();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePointOrBuilder
            public boolean hasY() {
                return ((CarlifeTouchSinglePoint) this.instance).hasY();
            }

            public Builder setPointerx(int i7) {
                copyOnWrite();
                ((CarlifeTouchSinglePoint) this.instance).setPointerx(i7);
                return this;
            }

            public Builder setPointery(int i7) {
                copyOnWrite();
                ((CarlifeTouchSinglePoint) this.instance).setPointery(i7);
                return this;
            }

            public Builder setX(int i7) {
                copyOnWrite();
                ((CarlifeTouchSinglePoint) this.instance).setX(i7);
                return this;
            }

            public Builder setY(int i7) {
                copyOnWrite();
                ((CarlifeTouchSinglePoint) this.instance).setY(i7);
                return this;
            }
        }

        static {
            CarlifeTouchSinglePoint carlifeTouchSinglePoint = new CarlifeTouchSinglePoint();
            DEFAULT_INSTANCE = carlifeTouchSinglePoint;
            j0.registerDefaultInstance(CarlifeTouchSinglePoint.class, carlifeTouchSinglePoint);
        }

        private CarlifeTouchSinglePoint() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPointerx() {
            this.bitField0_ &= -5;
            this.pointerx_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPointery() {
            this.bitField0_ &= -9;
            this.pointery_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearX() {
            this.bitField0_ &= -2;
            this.x_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearY() {
            this.bitField0_ &= -3;
            this.y_ = 0;
        }

        public static CarlifeTouchSinglePoint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeTouchSinglePoint carlifeTouchSinglePoint) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeTouchSinglePoint);
        }

        public static CarlifeTouchSinglePoint parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeTouchSinglePoint) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeTouchSinglePoint parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeTouchSinglePoint) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeTouchSinglePoint parseFrom(l lVar) {
            return (CarlifeTouchSinglePoint) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeTouchSinglePoint parseFrom(l lVar, y yVar) {
            return (CarlifeTouchSinglePoint) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeTouchSinglePoint parseFrom(p pVar) {
            return (CarlifeTouchSinglePoint) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeTouchSinglePoint parseFrom(p pVar, y yVar) {
            return (CarlifeTouchSinglePoint) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeTouchSinglePoint parseFrom(InputStream inputStream) {
            return (CarlifeTouchSinglePoint) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeTouchSinglePoint parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeTouchSinglePoint) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeTouchSinglePoint parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeTouchSinglePoint) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeTouchSinglePoint parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeTouchSinglePoint) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeTouchSinglePoint parseFrom(byte[] bArr) {
            return (CarlifeTouchSinglePoint) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeTouchSinglePoint parseFrom(byte[] bArr, y yVar) {
            return (CarlifeTouchSinglePoint) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPointerx(int i7) {
            this.bitField0_ |= 4;
            this.pointerx_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPointery(int i7) {
            this.bitField0_ |= 8;
            this.pointery_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setX(int i7) {
            this.bitField0_ |= 1;
            this.x_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setY(int i7) {
            this.bitField0_ |= 2;
            this.y_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"bitField0_", "x_", "y_", "pointerx_", "pointery_"});
                case 3:
                    return new CarlifeTouchSinglePoint();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeTouchSinglePoint.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePointOrBuilder
        public int getPointerx() {
            return this.pointerx_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePointOrBuilder
        public int getPointery() {
            return this.pointery_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePointOrBuilder
        public int getX() {
            return this.x_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePointOrBuilder
        public int getY() {
            return this.y_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePointOrBuilder
        public boolean hasPointerx() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePointOrBuilder
        public boolean hasPointery() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePointOrBuilder
        public boolean hasX() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchSinglePointProto.CarlifeTouchSinglePointOrBuilder
        public boolean hasY() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeTouchSinglePointOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getPointerx();

        int getPointery();

        int getX();

        int getY();

        boolean hasPointerx();

        boolean hasPointery();

        boolean hasX();

        boolean hasY();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeTouchSinglePointProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

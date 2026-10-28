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
public final class CarlifeTouchActionProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeTouchActionProto$1, reason: invalid class name */
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
    public static final class CarlifeTouchAction extends j0 implements CarlifeTouchActionOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 1;
        private static final CarlifeTouchAction DEFAULT_INSTANCE;
        private static volatile s1 PARSER = null;
        public static final int POINTERX_FIELD_NUMBER = 4;
        public static final int POINTERY_FIELD_NUMBER = 5;
        public static final int X_FIELD_NUMBER = 2;
        public static final int Y_FIELD_NUMBER = 3;
        private int action_;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int pointerx_;
        private int pointery_;
        private int x_;
        private int y_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeTouchActionOrBuilder {
            private Builder() {
                super(CarlifeTouchAction.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAction() {
                copyOnWrite();
                ((CarlifeTouchAction) this.instance).clearAction();
                return this;
            }

            public Builder clearPointerx() {
                copyOnWrite();
                ((CarlifeTouchAction) this.instance).clearPointerx();
                return this;
            }

            public Builder clearPointery() {
                copyOnWrite();
                ((CarlifeTouchAction) this.instance).clearPointery();
                return this;
            }

            public Builder clearX() {
                copyOnWrite();
                ((CarlifeTouchAction) this.instance).clearX();
                return this;
            }

            public Builder clearY() {
                copyOnWrite();
                ((CarlifeTouchAction) this.instance).clearY();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
            public int getAction() {
                return ((CarlifeTouchAction) this.instance).getAction();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
            public int getPointerx() {
                return ((CarlifeTouchAction) this.instance).getPointerx();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
            public int getPointery() {
                return ((CarlifeTouchAction) this.instance).getPointery();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
            public int getX() {
                return ((CarlifeTouchAction) this.instance).getX();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
            public int getY() {
                return ((CarlifeTouchAction) this.instance).getY();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
            public boolean hasAction() {
                return ((CarlifeTouchAction) this.instance).hasAction();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
            public boolean hasPointerx() {
                return ((CarlifeTouchAction) this.instance).hasPointerx();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
            public boolean hasPointery() {
                return ((CarlifeTouchAction) this.instance).hasPointery();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
            public boolean hasX() {
                return ((CarlifeTouchAction) this.instance).hasX();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
            public boolean hasY() {
                return ((CarlifeTouchAction) this.instance).hasY();
            }

            public Builder setAction(int i7) {
                copyOnWrite();
                ((CarlifeTouchAction) this.instance).setAction(i7);
                return this;
            }

            public Builder setPointerx(int i7) {
                copyOnWrite();
                ((CarlifeTouchAction) this.instance).setPointerx(i7);
                return this;
            }

            public Builder setPointery(int i7) {
                copyOnWrite();
                ((CarlifeTouchAction) this.instance).setPointery(i7);
                return this;
            }

            public Builder setX(int i7) {
                copyOnWrite();
                ((CarlifeTouchAction) this.instance).setX(i7);
                return this;
            }

            public Builder setY(int i7) {
                copyOnWrite();
                ((CarlifeTouchAction) this.instance).setY(i7);
                return this;
            }
        }

        static {
            CarlifeTouchAction carlifeTouchAction = new CarlifeTouchAction();
            DEFAULT_INSTANCE = carlifeTouchAction;
            j0.registerDefaultInstance(CarlifeTouchAction.class, carlifeTouchAction);
        }

        private CarlifeTouchAction() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.bitField0_ &= -2;
            this.action_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPointerx() {
            this.bitField0_ &= -9;
            this.pointerx_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPointery() {
            this.bitField0_ &= -17;
            this.pointery_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearX() {
            this.bitField0_ &= -3;
            this.x_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearY() {
            this.bitField0_ &= -5;
            this.y_ = 0;
        }

        public static CarlifeTouchAction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeTouchAction carlifeTouchAction) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeTouchAction);
        }

        public static CarlifeTouchAction parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeTouchAction) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeTouchAction parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeTouchAction) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeTouchAction parseFrom(l lVar) {
            return (CarlifeTouchAction) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeTouchAction parseFrom(l lVar, y yVar) {
            return (CarlifeTouchAction) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeTouchAction parseFrom(p pVar) {
            return (CarlifeTouchAction) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeTouchAction parseFrom(p pVar, y yVar) {
            return (CarlifeTouchAction) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeTouchAction parseFrom(InputStream inputStream) {
            return (CarlifeTouchAction) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeTouchAction parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeTouchAction) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeTouchAction parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeTouchAction) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeTouchAction parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeTouchAction) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeTouchAction parseFrom(byte[] bArr) {
            return (CarlifeTouchAction) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeTouchAction parseFrom(byte[] bArr, y yVar) {
            return (CarlifeTouchAction) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(int i7) {
            this.bitField0_ |= 1;
            this.action_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPointerx(int i7) {
            this.bitField0_ |= 8;
            this.pointerx_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPointery(int i7) {
            this.bitField0_ |= 16;
            this.pointery_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setX(int i7) {
            this.bitField0_ |= 2;
            this.x_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setY(int i7) {
            this.bitField0_ |= 4;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"bitField0_", "action_", "x_", "y_", "pointerx_", "pointery_"});
                case 3:
                    return new CarlifeTouchAction();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeTouchAction.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
        public int getAction() {
            return this.action_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
        public int getPointerx() {
            return this.pointerx_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
        public int getPointery() {
            return this.pointery_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
        public int getX() {
            return this.x_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
        public int getY() {
            return this.y_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
        public boolean hasAction() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
        public boolean hasPointerx() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
        public boolean hasPointery() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
        public boolean hasX() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchActionProto.CarlifeTouchActionOrBuilder
        public boolean hasY() {
            return (this.bitField0_ & 4) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeTouchActionOrBuilder extends m1 {
        int getAction();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getPointerx();

        int getPointery();

        int getX();

        int getY();

        boolean hasAction();

        boolean hasPointerx();

        boolean hasPointery();

        boolean hasX();

        boolean hasY();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeTouchActionProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

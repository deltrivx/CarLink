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
public final class CarlifeVideoEncoderInfoProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto$1, reason: invalid class name */
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
    public static final class CarlifeVideoEncoderInfo extends j0 implements CarlifeVideoEncoderInfoOrBuilder {
        private static final CarlifeVideoEncoderInfo DEFAULT_INSTANCE;
        public static final int FRAMERATE_FIELD_NUMBER = 3;
        public static final int HEIGHT_FIELD_NUMBER = 2;
        private static volatile s1 PARSER = null;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private int bitField0_;
        private int frameRate_;
        private int height_;
        private byte memoizedIsInitialized = 2;
        private int width_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeVideoEncoderInfoOrBuilder {
            private Builder() {
                super(CarlifeVideoEncoderInfo.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearFrameRate() {
                copyOnWrite();
                ((CarlifeVideoEncoderInfo) this.instance).clearFrameRate();
                return this;
            }

            public Builder clearHeight() {
                copyOnWrite();
                ((CarlifeVideoEncoderInfo) this.instance).clearHeight();
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                ((CarlifeVideoEncoderInfo) this.instance).clearWidth();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfoOrBuilder
            public int getFrameRate() {
                return ((CarlifeVideoEncoderInfo) this.instance).getFrameRate();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfoOrBuilder
            public int getHeight() {
                return ((CarlifeVideoEncoderInfo) this.instance).getHeight();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfoOrBuilder
            public int getWidth() {
                return ((CarlifeVideoEncoderInfo) this.instance).getWidth();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfoOrBuilder
            public boolean hasFrameRate() {
                return ((CarlifeVideoEncoderInfo) this.instance).hasFrameRate();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfoOrBuilder
            public boolean hasHeight() {
                return ((CarlifeVideoEncoderInfo) this.instance).hasHeight();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfoOrBuilder
            public boolean hasWidth() {
                return ((CarlifeVideoEncoderInfo) this.instance).hasWidth();
            }

            public Builder setFrameRate(int i7) {
                copyOnWrite();
                ((CarlifeVideoEncoderInfo) this.instance).setFrameRate(i7);
                return this;
            }

            public Builder setHeight(int i7) {
                copyOnWrite();
                ((CarlifeVideoEncoderInfo) this.instance).setHeight(i7);
                return this;
            }

            public Builder setWidth(int i7) {
                copyOnWrite();
                ((CarlifeVideoEncoderInfo) this.instance).setWidth(i7);
                return this;
            }
        }

        static {
            CarlifeVideoEncoderInfo carlifeVideoEncoderInfo = new CarlifeVideoEncoderInfo();
            DEFAULT_INSTANCE = carlifeVideoEncoderInfo;
            j0.registerDefaultInstance(CarlifeVideoEncoderInfo.class, carlifeVideoEncoderInfo);
        }

        private CarlifeVideoEncoderInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrameRate() {
            this.bitField0_ &= -5;
            this.frameRate_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeight() {
            this.bitField0_ &= -3;
            this.height_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidth() {
            this.bitField0_ &= -2;
            this.width_ = 0;
        }

        public static CarlifeVideoEncoderInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeVideoEncoderInfo carlifeVideoEncoderInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeVideoEncoderInfo);
        }

        public static CarlifeVideoEncoderInfo parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeVideoEncoderInfo) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeVideoEncoderInfo parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeVideoEncoderInfo) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeVideoEncoderInfo parseFrom(l lVar) {
            return (CarlifeVideoEncoderInfo) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeVideoEncoderInfo parseFrom(l lVar, y yVar) {
            return (CarlifeVideoEncoderInfo) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeVideoEncoderInfo parseFrom(p pVar) {
            return (CarlifeVideoEncoderInfo) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeVideoEncoderInfo parseFrom(p pVar, y yVar) {
            return (CarlifeVideoEncoderInfo) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeVideoEncoderInfo parseFrom(InputStream inputStream) {
            return (CarlifeVideoEncoderInfo) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeVideoEncoderInfo parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeVideoEncoderInfo) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeVideoEncoderInfo parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeVideoEncoderInfo) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeVideoEncoderInfo parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeVideoEncoderInfo) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeVideoEncoderInfo parseFrom(byte[] bArr) {
            return (CarlifeVideoEncoderInfo) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeVideoEncoderInfo parseFrom(byte[] bArr, y yVar) {
            return (CarlifeVideoEncoderInfo) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameRate(int i7) {
            this.bitField0_ |= 4;
            this.frameRate_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(int i7) {
            this.bitField0_ |= 2;
            this.height_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(int i7) {
            this.bitField0_ |= 1;
            this.width_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002", new Object[]{"bitField0_", "width_", "height_", "frameRate_"});
                case 3:
                    return new CarlifeVideoEncoderInfo();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeVideoEncoderInfo.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfoOrBuilder
        public int getFrameRate() {
            return this.frameRate_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfoOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfoOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfoOrBuilder
        public boolean hasFrameRate() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfoOrBuilder
        public boolean hasHeight() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfoOrBuilder
        public boolean hasWidth() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeVideoEncoderInfoOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getFrameRate();

        int getHeight();

        int getWidth();

        boolean hasFrameRate();

        boolean hasHeight();

        boolean hasWidth();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeVideoEncoderInfoProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

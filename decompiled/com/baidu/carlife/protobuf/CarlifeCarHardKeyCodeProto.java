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
public final class CarlifeCarHardKeyCodeProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeCarHardKeyCodeProto$1, reason: invalid class name */
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
    public static final class CarlifeCarHardKeyCode extends j0 implements CarlifeCarHardKeyCodeOrBuilder {
        private static final CarlifeCarHardKeyCode DEFAULT_INSTANCE;
        public static final int KEYCODE_FIELD_NUMBER = 1;
        private static volatile s1 PARSER;
        private int bitField0_;
        private int keycode_;
        private byte memoizedIsInitialized = 2;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeCarHardKeyCodeOrBuilder {
            private Builder() {
                super(CarlifeCarHardKeyCode.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearKeycode() {
                copyOnWrite();
                ((CarlifeCarHardKeyCode) this.instance).clearKeycode();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarHardKeyCodeProto.CarlifeCarHardKeyCodeOrBuilder
            public int getKeycode() {
                return ((CarlifeCarHardKeyCode) this.instance).getKeycode();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarHardKeyCodeProto.CarlifeCarHardKeyCodeOrBuilder
            public boolean hasKeycode() {
                return ((CarlifeCarHardKeyCode) this.instance).hasKeycode();
            }

            public Builder setKeycode(int i7) {
                copyOnWrite();
                ((CarlifeCarHardKeyCode) this.instance).setKeycode(i7);
                return this;
            }
        }

        static {
            CarlifeCarHardKeyCode carlifeCarHardKeyCode = new CarlifeCarHardKeyCode();
            DEFAULT_INSTANCE = carlifeCarHardKeyCode;
            j0.registerDefaultInstance(CarlifeCarHardKeyCode.class, carlifeCarHardKeyCode);
        }

        private CarlifeCarHardKeyCode() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeycode() {
            this.bitField0_ &= -2;
            this.keycode_ = 0;
        }

        public static CarlifeCarHardKeyCode getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeCarHardKeyCode carlifeCarHardKeyCode) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeCarHardKeyCode);
        }

        public static CarlifeCarHardKeyCode parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeCarHardKeyCode) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeCarHardKeyCode parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeCarHardKeyCode) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeCarHardKeyCode parseFrom(l lVar) {
            return (CarlifeCarHardKeyCode) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeCarHardKeyCode parseFrom(l lVar, y yVar) {
            return (CarlifeCarHardKeyCode) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeCarHardKeyCode parseFrom(p pVar) {
            return (CarlifeCarHardKeyCode) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeCarHardKeyCode parseFrom(p pVar, y yVar) {
            return (CarlifeCarHardKeyCode) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeCarHardKeyCode parseFrom(InputStream inputStream) {
            return (CarlifeCarHardKeyCode) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeCarHardKeyCode parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeCarHardKeyCode) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeCarHardKeyCode parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeCarHardKeyCode) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeCarHardKeyCode parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeCarHardKeyCode) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeCarHardKeyCode parseFrom(byte[] bArr) {
            return (CarlifeCarHardKeyCode) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeCarHardKeyCode parseFrom(byte[] bArr, y yVar) {
            return (CarlifeCarHardKeyCode) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeycode(int i7) {
            this.bitField0_ |= 1;
            this.keycode_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{"bitField0_", "keycode_"});
                case 3:
                    return new CarlifeCarHardKeyCode();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeCarHardKeyCode.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeCarHardKeyCodeProto.CarlifeCarHardKeyCodeOrBuilder
        public int getKeycode() {
            return this.keycode_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarHardKeyCodeProto.CarlifeCarHardKeyCodeOrBuilder
        public boolean hasKeycode() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeCarHardKeyCodeOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getKeycode();

        boolean hasKeycode();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeCarHardKeyCodeProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

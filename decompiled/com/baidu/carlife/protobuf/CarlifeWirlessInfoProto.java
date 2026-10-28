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
public final class CarlifeWirlessInfoProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeWirlessInfoProto$1, reason: invalid class name */
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
    public static final class CarlifeWirlessInfo extends j0 implements CarlifeWirlessInfoOrBuilder {
        private static final CarlifeWirlessInfo DEFAULT_INSTANCE;
        private static volatile s1 PARSER = null;
        public static final int WIFIFREQUENCY_FIELD_NUMBER = 2;
        public static final int WIRLESSTYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int wifiFrequency_;
        private int wirlessType_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeWirlessInfoOrBuilder {
            private Builder() {
                super(CarlifeWirlessInfo.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearWifiFrequency() {
                copyOnWrite();
                ((CarlifeWirlessInfo) this.instance).clearWifiFrequency();
                return this;
            }

            public Builder clearWirlessType() {
                copyOnWrite();
                ((CarlifeWirlessInfo) this.instance).clearWirlessType();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeWirlessInfoProto.CarlifeWirlessInfoOrBuilder
            public int getWifiFrequency() {
                return ((CarlifeWirlessInfo) this.instance).getWifiFrequency();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeWirlessInfoProto.CarlifeWirlessInfoOrBuilder
            public int getWirlessType() {
                return ((CarlifeWirlessInfo) this.instance).getWirlessType();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeWirlessInfoProto.CarlifeWirlessInfoOrBuilder
            public boolean hasWifiFrequency() {
                return ((CarlifeWirlessInfo) this.instance).hasWifiFrequency();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeWirlessInfoProto.CarlifeWirlessInfoOrBuilder
            public boolean hasWirlessType() {
                return ((CarlifeWirlessInfo) this.instance).hasWirlessType();
            }

            public Builder setWifiFrequency(int i7) {
                copyOnWrite();
                ((CarlifeWirlessInfo) this.instance).setWifiFrequency(i7);
                return this;
            }

            public Builder setWirlessType(int i7) {
                copyOnWrite();
                ((CarlifeWirlessInfo) this.instance).setWirlessType(i7);
                return this;
            }
        }

        static {
            CarlifeWirlessInfo carlifeWirlessInfo = new CarlifeWirlessInfo();
            DEFAULT_INSTANCE = carlifeWirlessInfo;
            j0.registerDefaultInstance(CarlifeWirlessInfo.class, carlifeWirlessInfo);
        }

        private CarlifeWirlessInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWifiFrequency() {
            this.bitField0_ &= -3;
            this.wifiFrequency_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWirlessType() {
            this.bitField0_ &= -2;
            this.wirlessType_ = 0;
        }

        public static CarlifeWirlessInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeWirlessInfo carlifeWirlessInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeWirlessInfo);
        }

        public static CarlifeWirlessInfo parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeWirlessInfo) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeWirlessInfo parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeWirlessInfo) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeWirlessInfo parseFrom(l lVar) {
            return (CarlifeWirlessInfo) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeWirlessInfo parseFrom(l lVar, y yVar) {
            return (CarlifeWirlessInfo) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeWirlessInfo parseFrom(p pVar) {
            return (CarlifeWirlessInfo) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeWirlessInfo parseFrom(p pVar, y yVar) {
            return (CarlifeWirlessInfo) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeWirlessInfo parseFrom(InputStream inputStream) {
            return (CarlifeWirlessInfo) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeWirlessInfo parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeWirlessInfo) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeWirlessInfo parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeWirlessInfo) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeWirlessInfo parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeWirlessInfo) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeWirlessInfo parseFrom(byte[] bArr) {
            return (CarlifeWirlessInfo) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeWirlessInfo parseFrom(byte[] bArr, y yVar) {
            return (CarlifeWirlessInfo) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifiFrequency(int i7) {
            this.bitField0_ |= 2;
            this.wifiFrequency_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWirlessType(int i7) {
            this.bitField0_ |= 1;
            this.wirlessType_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"bitField0_", "wirlessType_", "wifiFrequency_"});
                case 3:
                    return new CarlifeWirlessInfo();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeWirlessInfo.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeWirlessInfoProto.CarlifeWirlessInfoOrBuilder
        public int getWifiFrequency() {
            return this.wifiFrequency_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeWirlessInfoProto.CarlifeWirlessInfoOrBuilder
        public int getWirlessType() {
            return this.wirlessType_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeWirlessInfoProto.CarlifeWirlessInfoOrBuilder
        public boolean hasWifiFrequency() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeWirlessInfoProto.CarlifeWirlessInfoOrBuilder
        public boolean hasWirlessType() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeWirlessInfoOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getWifiFrequency();

        int getWirlessType();

        boolean hasWifiFrequency();

        boolean hasWirlessType();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeWirlessInfoProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

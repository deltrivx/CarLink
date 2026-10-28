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
public final class CarlifeVehicleInfoProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeVehicleInfoProto$1, reason: invalid class name */
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
    public static final class CarlifeVehicleInfo extends j0 implements CarlifeVehicleInfoOrBuilder {
        private static final CarlifeVehicleInfo DEFAULT_INSTANCE;
        public static final int FREQUENCY_FIELD_NUMBER = 3;
        public static final int MODULEID_FIELD_NUMBER = 1;
        private static volatile s1 PARSER = null;
        public static final int SUPPORTFLAG_FIELD_NUMBER = 2;
        private int bitField0_;
        private int frequency_;
        private byte memoizedIsInitialized = 2;
        private int moduleID_;
        private int supportFlag_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeVehicleInfoOrBuilder {
            private Builder() {
                super(CarlifeVehicleInfo.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearFrequency() {
                copyOnWrite();
                ((CarlifeVehicleInfo) this.instance).clearFrequency();
                return this;
            }

            public Builder clearModuleID() {
                copyOnWrite();
                ((CarlifeVehicleInfo) this.instance).clearModuleID();
                return this;
            }

            public Builder clearSupportFlag() {
                copyOnWrite();
                ((CarlifeVehicleInfo) this.instance).clearSupportFlag();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfoOrBuilder
            public int getFrequency() {
                return ((CarlifeVehicleInfo) this.instance).getFrequency();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfoOrBuilder
            public int getModuleID() {
                return ((CarlifeVehicleInfo) this.instance).getModuleID();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfoOrBuilder
            public int getSupportFlag() {
                return ((CarlifeVehicleInfo) this.instance).getSupportFlag();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfoOrBuilder
            public boolean hasFrequency() {
                return ((CarlifeVehicleInfo) this.instance).hasFrequency();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfoOrBuilder
            public boolean hasModuleID() {
                return ((CarlifeVehicleInfo) this.instance).hasModuleID();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfoOrBuilder
            public boolean hasSupportFlag() {
                return ((CarlifeVehicleInfo) this.instance).hasSupportFlag();
            }

            public Builder setFrequency(int i7) {
                copyOnWrite();
                ((CarlifeVehicleInfo) this.instance).setFrequency(i7);
                return this;
            }

            public Builder setModuleID(int i7) {
                copyOnWrite();
                ((CarlifeVehicleInfo) this.instance).setModuleID(i7);
                return this;
            }

            public Builder setSupportFlag(int i7) {
                copyOnWrite();
                ((CarlifeVehicleInfo) this.instance).setSupportFlag(i7);
                return this;
            }
        }

        static {
            CarlifeVehicleInfo carlifeVehicleInfo = new CarlifeVehicleInfo();
            DEFAULT_INSTANCE = carlifeVehicleInfo;
            j0.registerDefaultInstance(CarlifeVehicleInfo.class, carlifeVehicleInfo);
        }

        private CarlifeVehicleInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrequency() {
            this.bitField0_ &= -5;
            this.frequency_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModuleID() {
            this.bitField0_ &= -2;
            this.moduleID_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSupportFlag() {
            this.bitField0_ &= -3;
            this.supportFlag_ = 0;
        }

        public static CarlifeVehicleInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeVehicleInfo carlifeVehicleInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeVehicleInfo);
        }

        public static CarlifeVehicleInfo parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeVehicleInfo) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeVehicleInfo parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeVehicleInfo) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeVehicleInfo parseFrom(l lVar) {
            return (CarlifeVehicleInfo) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeVehicleInfo parseFrom(l lVar, y yVar) {
            return (CarlifeVehicleInfo) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeVehicleInfo parseFrom(p pVar) {
            return (CarlifeVehicleInfo) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeVehicleInfo parseFrom(p pVar, y yVar) {
            return (CarlifeVehicleInfo) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeVehicleInfo parseFrom(InputStream inputStream) {
            return (CarlifeVehicleInfo) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeVehicleInfo parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeVehicleInfo) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeVehicleInfo parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeVehicleInfo) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeVehicleInfo parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeVehicleInfo) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeVehicleInfo parseFrom(byte[] bArr) {
            return (CarlifeVehicleInfo) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeVehicleInfo parseFrom(byte[] bArr, y yVar) {
            return (CarlifeVehicleInfo) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrequency(int i7) {
            this.bitField0_ |= 4;
            this.frequency_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModuleID(int i7) {
            this.bitField0_ |= 1;
            this.moduleID_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSupportFlag(int i7) {
            this.bitField0_ |= 2;
            this.supportFlag_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔄ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"bitField0_", "moduleID_", "supportFlag_", "frequency_"});
                case 3:
                    return new CarlifeVehicleInfo();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeVehicleInfo.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfoOrBuilder
        public int getFrequency() {
            return this.frequency_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfoOrBuilder
        public int getModuleID() {
            return this.moduleID_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfoOrBuilder
        public int getSupportFlag() {
            return this.supportFlag_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfoOrBuilder
        public boolean hasFrequency() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfoOrBuilder
        public boolean hasModuleID() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleInfoProto.CarlifeVehicleInfoOrBuilder
        public boolean hasSupportFlag() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeVehicleInfoOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getFrequency();

        int getModuleID();

        int getSupportFlag();

        boolean hasFrequency();

        boolean hasModuleID();

        boolean hasSupportFlag();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeVehicleInfoProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

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
public final class CarlifeWirlessTargetProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeWirlessTargetProto$1, reason: invalid class name */
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
    public static final class CarlifeWirlessTarget extends j0 implements CarlifeWirlessTargetOrBuilder {
        private static final CarlifeWirlessTarget DEFAULT_INSTANCE;
        public static final int P2PNETINFO_FIELD_NUMBER = 4;
        private static volatile s1 PARSER = null;
        public static final int SCANRECORD_FIELD_NUMBER = 3;
        public static final int TARGETINFO_FIELD_NUMBER = 2;
        public static final int WIFIDEVICENAME_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String wifiDeviceName_ = "";
        private String targetInfo_ = "";
        private l scanRecord_ = l.f2785b;
        private String p2PNetInfo_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeWirlessTargetOrBuilder {
            private Builder() {
                super(CarlifeWirlessTarget.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearP2PNetInfo() {
                copyOnWrite();
                ((CarlifeWirlessTarget) this.instance).clearP2PNetInfo();
                return this;
            }

            public Builder clearScanRecord() {
                copyOnWrite();
                ((CarlifeWirlessTarget) this.instance).clearScanRecord();
                return this;
            }

            public Builder clearTargetInfo() {
                copyOnWrite();
                ((CarlifeWirlessTarget) this.instance).clearTargetInfo();
                return this;
            }

            public Builder clearWifiDeviceName() {
                copyOnWrite();
                ((CarlifeWirlessTarget) this.instance).clearWifiDeviceName();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
            public String getP2PNetInfo() {
                return ((CarlifeWirlessTarget) this.instance).getP2PNetInfo();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
            public l getP2PNetInfoBytes() {
                return ((CarlifeWirlessTarget) this.instance).getP2PNetInfoBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
            public l getScanRecord() {
                return ((CarlifeWirlessTarget) this.instance).getScanRecord();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
            public String getTargetInfo() {
                return ((CarlifeWirlessTarget) this.instance).getTargetInfo();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
            public l getTargetInfoBytes() {
                return ((CarlifeWirlessTarget) this.instance).getTargetInfoBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
            public String getWifiDeviceName() {
                return ((CarlifeWirlessTarget) this.instance).getWifiDeviceName();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
            public l getWifiDeviceNameBytes() {
                return ((CarlifeWirlessTarget) this.instance).getWifiDeviceNameBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
            public boolean hasP2PNetInfo() {
                return ((CarlifeWirlessTarget) this.instance).hasP2PNetInfo();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
            public boolean hasScanRecord() {
                return ((CarlifeWirlessTarget) this.instance).hasScanRecord();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
            public boolean hasTargetInfo() {
                return ((CarlifeWirlessTarget) this.instance).hasTargetInfo();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
            public boolean hasWifiDeviceName() {
                return ((CarlifeWirlessTarget) this.instance).hasWifiDeviceName();
            }

            public Builder setP2PNetInfo(String str) {
                copyOnWrite();
                ((CarlifeWirlessTarget) this.instance).setP2PNetInfo(str);
                return this;
            }

            public Builder setP2PNetInfoBytes(l lVar) {
                copyOnWrite();
                ((CarlifeWirlessTarget) this.instance).setP2PNetInfoBytes(lVar);
                return this;
            }

            public Builder setScanRecord(l lVar) {
                copyOnWrite();
                ((CarlifeWirlessTarget) this.instance).setScanRecord(lVar);
                return this;
            }

            public Builder setTargetInfo(String str) {
                copyOnWrite();
                ((CarlifeWirlessTarget) this.instance).setTargetInfo(str);
                return this;
            }

            public Builder setTargetInfoBytes(l lVar) {
                copyOnWrite();
                ((CarlifeWirlessTarget) this.instance).setTargetInfoBytes(lVar);
                return this;
            }

            public Builder setWifiDeviceName(String str) {
                copyOnWrite();
                ((CarlifeWirlessTarget) this.instance).setWifiDeviceName(str);
                return this;
            }

            public Builder setWifiDeviceNameBytes(l lVar) {
                copyOnWrite();
                ((CarlifeWirlessTarget) this.instance).setWifiDeviceNameBytes(lVar);
                return this;
            }
        }

        static {
            CarlifeWirlessTarget carlifeWirlessTarget = new CarlifeWirlessTarget();
            DEFAULT_INSTANCE = carlifeWirlessTarget;
            j0.registerDefaultInstance(CarlifeWirlessTarget.class, carlifeWirlessTarget);
        }

        private CarlifeWirlessTarget() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearP2PNetInfo() {
            this.bitField0_ &= -9;
            this.p2PNetInfo_ = getDefaultInstance().getP2PNetInfo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScanRecord() {
            this.bitField0_ &= -5;
            this.scanRecord_ = getDefaultInstance().getScanRecord();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTargetInfo() {
            this.bitField0_ &= -3;
            this.targetInfo_ = getDefaultInstance().getTargetInfo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWifiDeviceName() {
            this.bitField0_ &= -2;
            this.wifiDeviceName_ = getDefaultInstance().getWifiDeviceName();
        }

        public static CarlifeWirlessTarget getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeWirlessTarget carlifeWirlessTarget) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeWirlessTarget);
        }

        public static CarlifeWirlessTarget parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeWirlessTarget) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeWirlessTarget parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeWirlessTarget) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeWirlessTarget parseFrom(l lVar) {
            return (CarlifeWirlessTarget) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeWirlessTarget parseFrom(l lVar, y yVar) {
            return (CarlifeWirlessTarget) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeWirlessTarget parseFrom(p pVar) {
            return (CarlifeWirlessTarget) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeWirlessTarget parseFrom(p pVar, y yVar) {
            return (CarlifeWirlessTarget) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeWirlessTarget parseFrom(InputStream inputStream) {
            return (CarlifeWirlessTarget) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeWirlessTarget parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeWirlessTarget) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeWirlessTarget parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeWirlessTarget) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeWirlessTarget parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeWirlessTarget) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeWirlessTarget parseFrom(byte[] bArr) {
            return (CarlifeWirlessTarget) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeWirlessTarget parseFrom(byte[] bArr, y yVar) {
            return (CarlifeWirlessTarget) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setP2PNetInfo(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.p2PNetInfo_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setP2PNetInfoBytes(l lVar) {
            this.p2PNetInfo_ = lVar.u();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScanRecord(l lVar) {
            lVar.getClass();
            this.bitField0_ |= 4;
            this.scanRecord_ = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTargetInfo(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.targetInfo_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTargetInfoBytes(l lVar) {
            this.targetInfo_ = lVar.u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifiDeviceName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.wifiDeviceName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifiDeviceNameBytes(l lVar) {
            this.wifiDeviceName_ = lVar.u();
            this.bitField0_ |= 1;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ည\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "wifiDeviceName_", "targetInfo_", "scanRecord_", "p2PNetInfo_"});
                case 3:
                    return new CarlifeWirlessTarget();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeWirlessTarget.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
        public String getP2PNetInfo() {
            return this.p2PNetInfo_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
        public l getP2PNetInfoBytes() {
            return l.m(this.p2PNetInfo_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
        public l getScanRecord() {
            return this.scanRecord_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
        public String getTargetInfo() {
            return this.targetInfo_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
        public l getTargetInfoBytes() {
            return l.m(this.targetInfo_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
        public String getWifiDeviceName() {
            return this.wifiDeviceName_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
        public l getWifiDeviceNameBytes() {
            return l.m(this.wifiDeviceName_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
        public boolean hasP2PNetInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
        public boolean hasScanRecord() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
        public boolean hasTargetInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeWirlessTargetProto.CarlifeWirlessTargetOrBuilder
        public boolean hasWifiDeviceName() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeWirlessTargetOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        String getP2PNetInfo();

        l getP2PNetInfoBytes();

        l getScanRecord();

        String getTargetInfo();

        l getTargetInfoBytes();

        String getWifiDeviceName();

        l getWifiDeviceNameBytes();

        boolean hasP2PNetInfo();

        boolean hasScanRecord();

        boolean hasTargetInfo();

        boolean hasWifiDeviceName();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeWirlessTargetProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

package com.baidu.carlife.protobuf;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
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
public final class CarlifeDeviceInfoProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeDeviceInfoProto$1, reason: invalid class name */
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
    public static final class CarlifeDeviceInfo extends j0 implements CarlifeDeviceInfoOrBuilder {
        public static final int BOARD_FIELD_NUMBER = 2;
        public static final int BOOTLOADER_FIELD_NUMBER = 3;
        public static final int BRAND_FIELD_NUMBER = 4;
        public static final int BTADDRESS_FIELD_NUMBER = 23;
        public static final int CARLIFEVERSION_FIELD_NUMBER = 24;
        public static final int CID_FIELD_NUMBER = 12;
        public static final int CODENAME_FIELD_NUMBER = 17;
        public static final int CPU_ABI2_FIELD_NUMBER = 6;
        public static final int CPU_ABI_FIELD_NUMBER = 5;
        private static final CarlifeDeviceInfo DEFAULT_INSTANCE;
        public static final int DEVICE_FIELD_NUMBER = 7;
        public static final int DISPLAY_FIELD_NUMBER = 8;
        public static final int FINGERPRINT_FIELD_NUMBER = 9;
        public static final int HARDWARE_FIELD_NUMBER = 10;
        public static final int HOST_FIELD_NUMBER = 11;
        public static final int INCREMENTAL_FIELD_NUMBER = 18;
        public static final int MANUFACTURER_FIELD_NUMBER = 13;
        public static final int MODEL_FIELD_NUMBER = 14;
        public static final int OS_FIELD_NUMBER = 1;
        private static volatile s1 PARSER = null;
        public static final int PRODUCT_FIELD_NUMBER = 15;
        public static final int RELEASE_FIELD_NUMBER = 19;
        public static final int SDK_FIELD_NUMBER = 20;
        public static final int SDK_INT_FIELD_NUMBER = 21;
        public static final int SERIAL_FIELD_NUMBER = 16;
        public static final int TOKEN_FIELD_NUMBER = 22;
        private int bitField0_;
        private int sdkInt_;
        private String os_ = "";
        private String board_ = "";
        private String bootloader_ = "";
        private String brand_ = "";
        private String cpuAbi_ = "";
        private String cpuAbi2_ = "";
        private String device_ = "";
        private String display_ = "";
        private String fingerprint_ = "";
        private String hardware_ = "";
        private String host_ = "";
        private String cid_ = "";
        private String manufacturer_ = "";
        private String model_ = "";
        private String product_ = "";
        private String serial_ = "";
        private String codename_ = "";
        private String incremental_ = "";
        private String release_ = "";
        private String sdk_ = "";
        private String token_ = "";
        private String btaddress_ = "";
        private String carlifeversion_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeDeviceInfoOrBuilder {
            private Builder() {
                super(CarlifeDeviceInfo.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBoard() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearBoard();
                return this;
            }

            public Builder clearBootloader() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearBootloader();
                return this;
            }

            public Builder clearBrand() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearBrand();
                return this;
            }

            public Builder clearBtaddress() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearBtaddress();
                return this;
            }

            public Builder clearCarlifeversion() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearCarlifeversion();
                return this;
            }

            public Builder clearCid() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearCid();
                return this;
            }

            public Builder clearCodename() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearCodename();
                return this;
            }

            public Builder clearCpuAbi() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearCpuAbi();
                return this;
            }

            public Builder clearCpuAbi2() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearCpuAbi2();
                return this;
            }

            public Builder clearDevice() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearDevice();
                return this;
            }

            public Builder clearDisplay() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearDisplay();
                return this;
            }

            public Builder clearFingerprint() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearFingerprint();
                return this;
            }

            public Builder clearHardware() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearHardware();
                return this;
            }

            public Builder clearHost() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearHost();
                return this;
            }

            public Builder clearIncremental() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearIncremental();
                return this;
            }

            public Builder clearManufacturer() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearManufacturer();
                return this;
            }

            public Builder clearModel() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearModel();
                return this;
            }

            public Builder clearOs() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearOs();
                return this;
            }

            public Builder clearProduct() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearProduct();
                return this;
            }

            public Builder clearRelease() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearRelease();
                return this;
            }

            public Builder clearSdk() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearSdk();
                return this;
            }

            public Builder clearSdkInt() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearSdkInt();
                return this;
            }

            public Builder clearSerial() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearSerial();
                return this;
            }

            public Builder clearToken() {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).clearToken();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getBoard() {
                return ((CarlifeDeviceInfo) this.instance).getBoard();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getBoardBytes() {
                return ((CarlifeDeviceInfo) this.instance).getBoardBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getBootloader() {
                return ((CarlifeDeviceInfo) this.instance).getBootloader();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getBootloaderBytes() {
                return ((CarlifeDeviceInfo) this.instance).getBootloaderBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getBrand() {
                return ((CarlifeDeviceInfo) this.instance).getBrand();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getBrandBytes() {
                return ((CarlifeDeviceInfo) this.instance).getBrandBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getBtaddress() {
                return ((CarlifeDeviceInfo) this.instance).getBtaddress();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getBtaddressBytes() {
                return ((CarlifeDeviceInfo) this.instance).getBtaddressBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getCarlifeversion() {
                return ((CarlifeDeviceInfo) this.instance).getCarlifeversion();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getCarlifeversionBytes() {
                return ((CarlifeDeviceInfo) this.instance).getCarlifeversionBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getCid() {
                return ((CarlifeDeviceInfo) this.instance).getCid();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getCidBytes() {
                return ((CarlifeDeviceInfo) this.instance).getCidBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getCodename() {
                return ((CarlifeDeviceInfo) this.instance).getCodename();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getCodenameBytes() {
                return ((CarlifeDeviceInfo) this.instance).getCodenameBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getCpuAbi() {
                return ((CarlifeDeviceInfo) this.instance).getCpuAbi();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getCpuAbi2() {
                return ((CarlifeDeviceInfo) this.instance).getCpuAbi2();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getCpuAbi2Bytes() {
                return ((CarlifeDeviceInfo) this.instance).getCpuAbi2Bytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getCpuAbiBytes() {
                return ((CarlifeDeviceInfo) this.instance).getCpuAbiBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getDevice() {
                return ((CarlifeDeviceInfo) this.instance).getDevice();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getDeviceBytes() {
                return ((CarlifeDeviceInfo) this.instance).getDeviceBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getDisplay() {
                return ((CarlifeDeviceInfo) this.instance).getDisplay();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getDisplayBytes() {
                return ((CarlifeDeviceInfo) this.instance).getDisplayBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getFingerprint() {
                return ((CarlifeDeviceInfo) this.instance).getFingerprint();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getFingerprintBytes() {
                return ((CarlifeDeviceInfo) this.instance).getFingerprintBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getHardware() {
                return ((CarlifeDeviceInfo) this.instance).getHardware();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getHardwareBytes() {
                return ((CarlifeDeviceInfo) this.instance).getHardwareBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getHost() {
                return ((CarlifeDeviceInfo) this.instance).getHost();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getHostBytes() {
                return ((CarlifeDeviceInfo) this.instance).getHostBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getIncremental() {
                return ((CarlifeDeviceInfo) this.instance).getIncremental();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getIncrementalBytes() {
                return ((CarlifeDeviceInfo) this.instance).getIncrementalBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getManufacturer() {
                return ((CarlifeDeviceInfo) this.instance).getManufacturer();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getManufacturerBytes() {
                return ((CarlifeDeviceInfo) this.instance).getManufacturerBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getModel() {
                return ((CarlifeDeviceInfo) this.instance).getModel();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getModelBytes() {
                return ((CarlifeDeviceInfo) this.instance).getModelBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getOs() {
                return ((CarlifeDeviceInfo) this.instance).getOs();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getOsBytes() {
                return ((CarlifeDeviceInfo) this.instance).getOsBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getProduct() {
                return ((CarlifeDeviceInfo) this.instance).getProduct();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getProductBytes() {
                return ((CarlifeDeviceInfo) this.instance).getProductBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getRelease() {
                return ((CarlifeDeviceInfo) this.instance).getRelease();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getReleaseBytes() {
                return ((CarlifeDeviceInfo) this.instance).getReleaseBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getSdk() {
                return ((CarlifeDeviceInfo) this.instance).getSdk();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getSdkBytes() {
                return ((CarlifeDeviceInfo) this.instance).getSdkBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public int getSdkInt() {
                return ((CarlifeDeviceInfo) this.instance).getSdkInt();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getSerial() {
                return ((CarlifeDeviceInfo) this.instance).getSerial();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getSerialBytes() {
                return ((CarlifeDeviceInfo) this.instance).getSerialBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public String getToken() {
                return ((CarlifeDeviceInfo) this.instance).getToken();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public l getTokenBytes() {
                return ((CarlifeDeviceInfo) this.instance).getTokenBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasBoard() {
                return ((CarlifeDeviceInfo) this.instance).hasBoard();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasBootloader() {
                return ((CarlifeDeviceInfo) this.instance).hasBootloader();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasBrand() {
                return ((CarlifeDeviceInfo) this.instance).hasBrand();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasBtaddress() {
                return ((CarlifeDeviceInfo) this.instance).hasBtaddress();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasCarlifeversion() {
                return ((CarlifeDeviceInfo) this.instance).hasCarlifeversion();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasCid() {
                return ((CarlifeDeviceInfo) this.instance).hasCid();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasCodename() {
                return ((CarlifeDeviceInfo) this.instance).hasCodename();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasCpuAbi() {
                return ((CarlifeDeviceInfo) this.instance).hasCpuAbi();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasCpuAbi2() {
                return ((CarlifeDeviceInfo) this.instance).hasCpuAbi2();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasDevice() {
                return ((CarlifeDeviceInfo) this.instance).hasDevice();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasDisplay() {
                return ((CarlifeDeviceInfo) this.instance).hasDisplay();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasFingerprint() {
                return ((CarlifeDeviceInfo) this.instance).hasFingerprint();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasHardware() {
                return ((CarlifeDeviceInfo) this.instance).hasHardware();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasHost() {
                return ((CarlifeDeviceInfo) this.instance).hasHost();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasIncremental() {
                return ((CarlifeDeviceInfo) this.instance).hasIncremental();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasManufacturer() {
                return ((CarlifeDeviceInfo) this.instance).hasManufacturer();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasModel() {
                return ((CarlifeDeviceInfo) this.instance).hasModel();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasOs() {
                return ((CarlifeDeviceInfo) this.instance).hasOs();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasProduct() {
                return ((CarlifeDeviceInfo) this.instance).hasProduct();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasRelease() {
                return ((CarlifeDeviceInfo) this.instance).hasRelease();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasSdk() {
                return ((CarlifeDeviceInfo) this.instance).hasSdk();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasSdkInt() {
                return ((CarlifeDeviceInfo) this.instance).hasSdkInt();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasSerial() {
                return ((CarlifeDeviceInfo) this.instance).hasSerial();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
            public boolean hasToken() {
                return ((CarlifeDeviceInfo) this.instance).hasToken();
            }

            public Builder setBoard(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setBoard(str);
                return this;
            }

            public Builder setBoardBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setBoardBytes(lVar);
                return this;
            }

            public Builder setBootloader(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setBootloader(str);
                return this;
            }

            public Builder setBootloaderBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setBootloaderBytes(lVar);
                return this;
            }

            public Builder setBrand(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setBrand(str);
                return this;
            }

            public Builder setBrandBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setBrandBytes(lVar);
                return this;
            }

            public Builder setBtaddress(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setBtaddress(str);
                return this;
            }

            public Builder setBtaddressBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setBtaddressBytes(lVar);
                return this;
            }

            public Builder setCarlifeversion(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setCarlifeversion(str);
                return this;
            }

            public Builder setCarlifeversionBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setCarlifeversionBytes(lVar);
                return this;
            }

            public Builder setCid(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setCid(str);
                return this;
            }

            public Builder setCidBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setCidBytes(lVar);
                return this;
            }

            public Builder setCodename(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setCodename(str);
                return this;
            }

            public Builder setCodenameBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setCodenameBytes(lVar);
                return this;
            }

            public Builder setCpuAbi(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setCpuAbi(str);
                return this;
            }

            public Builder setCpuAbi2(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setCpuAbi2(str);
                return this;
            }

            public Builder setCpuAbi2Bytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setCpuAbi2Bytes(lVar);
                return this;
            }

            public Builder setCpuAbiBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setCpuAbiBytes(lVar);
                return this;
            }

            public Builder setDevice(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setDevice(str);
                return this;
            }

            public Builder setDeviceBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setDeviceBytes(lVar);
                return this;
            }

            public Builder setDisplay(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setDisplay(str);
                return this;
            }

            public Builder setDisplayBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setDisplayBytes(lVar);
                return this;
            }

            public Builder setFingerprint(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setFingerprint(str);
                return this;
            }

            public Builder setFingerprintBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setFingerprintBytes(lVar);
                return this;
            }

            public Builder setHardware(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setHardware(str);
                return this;
            }

            public Builder setHardwareBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setHardwareBytes(lVar);
                return this;
            }

            public Builder setHost(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setHost(str);
                return this;
            }

            public Builder setHostBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setHostBytes(lVar);
                return this;
            }

            public Builder setIncremental(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setIncremental(str);
                return this;
            }

            public Builder setIncrementalBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setIncrementalBytes(lVar);
                return this;
            }

            public Builder setManufacturer(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setManufacturer(str);
                return this;
            }

            public Builder setManufacturerBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setManufacturerBytes(lVar);
                return this;
            }

            public Builder setModel(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setModel(str);
                return this;
            }

            public Builder setModelBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setModelBytes(lVar);
                return this;
            }

            public Builder setOs(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setOs(str);
                return this;
            }

            public Builder setOsBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setOsBytes(lVar);
                return this;
            }

            public Builder setProduct(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setProduct(str);
                return this;
            }

            public Builder setProductBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setProductBytes(lVar);
                return this;
            }

            public Builder setRelease(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setRelease(str);
                return this;
            }

            public Builder setReleaseBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setReleaseBytes(lVar);
                return this;
            }

            public Builder setSdk(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setSdk(str);
                return this;
            }

            public Builder setSdkBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setSdkBytes(lVar);
                return this;
            }

            public Builder setSdkInt(int i7) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setSdkInt(i7);
                return this;
            }

            public Builder setSerial(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setSerial(str);
                return this;
            }

            public Builder setSerialBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setSerialBytes(lVar);
                return this;
            }

            public Builder setToken(String str) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setToken(str);
                return this;
            }

            public Builder setTokenBytes(l lVar) {
                copyOnWrite();
                ((CarlifeDeviceInfo) this.instance).setTokenBytes(lVar);
                return this;
            }
        }

        static {
            CarlifeDeviceInfo carlifeDeviceInfo = new CarlifeDeviceInfo();
            DEFAULT_INSTANCE = carlifeDeviceInfo;
            j0.registerDefaultInstance(CarlifeDeviceInfo.class, carlifeDeviceInfo);
        }

        private CarlifeDeviceInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoard() {
            this.bitField0_ &= -3;
            this.board_ = getDefaultInstance().getBoard();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBootloader() {
            this.bitField0_ &= -5;
            this.bootloader_ = getDefaultInstance().getBootloader();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBrand() {
            this.bitField0_ &= -9;
            this.brand_ = getDefaultInstance().getBrand();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBtaddress() {
            this.bitField0_ &= -4194305;
            this.btaddress_ = getDefaultInstance().getBtaddress();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCarlifeversion() {
            this.bitField0_ &= -8388609;
            this.carlifeversion_ = getDefaultInstance().getCarlifeversion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCid() {
            this.bitField0_ &= -2049;
            this.cid_ = getDefaultInstance().getCid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCodename() {
            this.bitField0_ &= -65537;
            this.codename_ = getDefaultInstance().getCodename();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCpuAbi() {
            this.bitField0_ &= -17;
            this.cpuAbi_ = getDefaultInstance().getCpuAbi();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCpuAbi2() {
            this.bitField0_ &= -33;
            this.cpuAbi2_ = getDefaultInstance().getCpuAbi2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDevice() {
            this.bitField0_ &= -65;
            this.device_ = getDefaultInstance().getDevice();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisplay() {
            this.bitField0_ &= -129;
            this.display_ = getDefaultInstance().getDisplay();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFingerprint() {
            this.bitField0_ &= -257;
            this.fingerprint_ = getDefaultInstance().getFingerprint();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHardware() {
            this.bitField0_ &= -513;
            this.hardware_ = getDefaultInstance().getHardware();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHost() {
            this.bitField0_ &= -1025;
            this.host_ = getDefaultInstance().getHost();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIncremental() {
            this.bitField0_ &= -131073;
            this.incremental_ = getDefaultInstance().getIncremental();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearManufacturer() {
            this.bitField0_ &= -4097;
            this.manufacturer_ = getDefaultInstance().getManufacturer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModel() {
            this.bitField0_ &= -8193;
            this.model_ = getDefaultInstance().getModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOs() {
            this.bitField0_ &= -2;
            this.os_ = getDefaultInstance().getOs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProduct() {
            this.bitField0_ &= -16385;
            this.product_ = getDefaultInstance().getProduct();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRelease() {
            this.bitField0_ &= -262145;
            this.release_ = getDefaultInstance().getRelease();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSdk() {
            this.bitField0_ &= -524289;
            this.sdk_ = getDefaultInstance().getSdk();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSdkInt() {
            this.bitField0_ &= -1048577;
            this.sdkInt_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSerial() {
            this.bitField0_ &= -32769;
            this.serial_ = getDefaultInstance().getSerial();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearToken() {
            this.bitField0_ &= -2097153;
            this.token_ = getDefaultInstance().getToken();
        }

        public static CarlifeDeviceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeDeviceInfo carlifeDeviceInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeDeviceInfo);
        }

        public static CarlifeDeviceInfo parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeDeviceInfo) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeDeviceInfo parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeDeviceInfo) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeDeviceInfo parseFrom(l lVar) {
            return (CarlifeDeviceInfo) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeDeviceInfo parseFrom(l lVar, y yVar) {
            return (CarlifeDeviceInfo) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeDeviceInfo parseFrom(p pVar) {
            return (CarlifeDeviceInfo) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeDeviceInfo parseFrom(p pVar, y yVar) {
            return (CarlifeDeviceInfo) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeDeviceInfo parseFrom(InputStream inputStream) {
            return (CarlifeDeviceInfo) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeDeviceInfo parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeDeviceInfo) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeDeviceInfo parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeDeviceInfo) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeDeviceInfo parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeDeviceInfo) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeDeviceInfo parseFrom(byte[] bArr) {
            return (CarlifeDeviceInfo) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeDeviceInfo parseFrom(byte[] bArr, y yVar) {
            return (CarlifeDeviceInfo) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoard(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.board_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoardBytes(l lVar) {
            this.board_ = lVar.u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBootloader(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.bootloader_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBootloaderBytes(l lVar) {
            this.bootloader_ = lVar.u();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrand(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.brand_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBrandBytes(l lVar) {
            this.brand_ = lVar.u();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBtaddress(String str) {
            str.getClass();
            this.bitField0_ |= 4194304;
            this.btaddress_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBtaddressBytes(l lVar) {
            this.btaddress_ = lVar.u();
            this.bitField0_ |= 4194304;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCarlifeversion(String str) {
            str.getClass();
            this.bitField0_ |= 8388608;
            this.carlifeversion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCarlifeversionBytes(l lVar) {
            this.carlifeversion_ = lVar.u();
            this.bitField0_ |= 8388608;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCid(String str) {
            str.getClass();
            this.bitField0_ |= 2048;
            this.cid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCidBytes(l lVar) {
            this.cid_ = lVar.u();
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodename(String str) {
            str.getClass();
            this.bitField0_ |= 65536;
            this.codename_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodenameBytes(l lVar) {
            this.codename_ = lVar.u();
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCpuAbi(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.cpuAbi_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCpuAbi2(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.cpuAbi2_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCpuAbi2Bytes(l lVar) {
            this.cpuAbi2_ = lVar.u();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCpuAbiBytes(l lVar) {
            this.cpuAbi_ = lVar.u();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDevice(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.device_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceBytes(l lVar) {
            this.device_ = lVar.u();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisplay(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.display_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisplayBytes(l lVar) {
            this.display_ = lVar.u();
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFingerprint(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.fingerprint_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFingerprintBytes(l lVar) {
            this.fingerprint_ = lVar.u();
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHardware(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.hardware_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHardwareBytes(l lVar) {
            this.hardware_ = lVar.u();
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHost(String str) {
            str.getClass();
            this.bitField0_ |= 1024;
            this.host_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHostBytes(l lVar) {
            this.host_ = lVar.u();
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIncremental(String str) {
            str.getClass();
            this.bitField0_ |= 131072;
            this.incremental_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIncrementalBytes(l lVar) {
            this.incremental_ = lVar.u();
            this.bitField0_ |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setManufacturer(String str) {
            str.getClass();
            this.bitField0_ |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
            this.manufacturer_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setManufacturerBytes(l lVar) {
            this.manufacturer_ = lVar.u();
            this.bitField0_ |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModel(String str) {
            str.getClass();
            this.bitField0_ |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
            this.model_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModelBytes(l lVar) {
            this.model_ = lVar.u();
            this.bitField0_ |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOs(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.os_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsBytes(l lVar) {
            this.os_ = lVar.u();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProduct(String str) {
            str.getClass();
            this.bitField0_ |= 16384;
            this.product_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProductBytes(l lVar) {
            this.product_ = lVar.u();
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRelease(String str) {
            str.getClass();
            this.bitField0_ |= 262144;
            this.release_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReleaseBytes(l lVar) {
            this.release_ = lVar.u();
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdk(String str) {
            str.getClass();
            this.bitField0_ |= 524288;
            this.sdk_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdkBytes(l lVar) {
            this.sdk_ = lVar.u();
            this.bitField0_ |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSdkInt(int i7) {
            this.bitField0_ |= 1048576;
            this.sdkInt_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSerial(String str) {
            str.getClass();
            this.bitField0_ |= 32768;
            this.serial_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSerialBytes(l lVar) {
            this.serial_ = lVar.u();
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setToken(String str) {
            str.getClass();
            this.bitField0_ |= 2097152;
            this.token_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTokenBytes(l lVar) {
            this.token_ = lVar.u();
            this.bitField0_ |= 2097152;
        }

        @Override // com.google.protobuf.j0
        public final Object dynamicMethod(i0 i0Var, Object obj, Object obj2) {
            s1 f0Var;
            AnonymousClass1 anonymousClass1 = null;
            switch (i0Var.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0018\u0000\u0001\u0001\u0018\u0018\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fဈ\u000e\u0010ဈ\u000f\u0011ဈ\u0010\u0012ဈ\u0011\u0013ဈ\u0012\u0014ဈ\u0013\u0015င\u0014\u0016ဈ\u0015\u0017ဈ\u0016\u0018ဈ\u0017", new Object[]{"bitField0_", "os_", "board_", "bootloader_", "brand_", "cpuAbi_", "cpuAbi2_", "device_", "display_", "fingerprint_", "hardware_", "host_", "cid_", "manufacturer_", "model_", "product_", "serial_", "codename_", "incremental_", "release_", "sdk_", "sdkInt_", "token_", "btaddress_", "carlifeversion_"});
                case 3:
                    return new CarlifeDeviceInfo();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeDeviceInfo.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getBoard() {
            return this.board_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getBoardBytes() {
            return l.m(this.board_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getBootloader() {
            return this.bootloader_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getBootloaderBytes() {
            return l.m(this.bootloader_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getBrand() {
            return this.brand_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getBrandBytes() {
            return l.m(this.brand_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getBtaddress() {
            return this.btaddress_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getBtaddressBytes() {
            return l.m(this.btaddress_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getCarlifeversion() {
            return this.carlifeversion_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getCarlifeversionBytes() {
            return l.m(this.carlifeversion_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getCid() {
            return this.cid_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getCidBytes() {
            return l.m(this.cid_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getCodename() {
            return this.codename_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getCodenameBytes() {
            return l.m(this.codename_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getCpuAbi() {
            return this.cpuAbi_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getCpuAbi2() {
            return this.cpuAbi2_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getCpuAbi2Bytes() {
            return l.m(this.cpuAbi2_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getCpuAbiBytes() {
            return l.m(this.cpuAbi_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getDevice() {
            return this.device_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getDeviceBytes() {
            return l.m(this.device_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getDisplay() {
            return this.display_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getDisplayBytes() {
            return l.m(this.display_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getFingerprint() {
            return this.fingerprint_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getFingerprintBytes() {
            return l.m(this.fingerprint_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getHardware() {
            return this.hardware_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getHardwareBytes() {
            return l.m(this.hardware_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getHost() {
            return this.host_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getHostBytes() {
            return l.m(this.host_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getIncremental() {
            return this.incremental_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getIncrementalBytes() {
            return l.m(this.incremental_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getManufacturer() {
            return this.manufacturer_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getManufacturerBytes() {
            return l.m(this.manufacturer_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getModel() {
            return this.model_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getModelBytes() {
            return l.m(this.model_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getOs() {
            return this.os_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getOsBytes() {
            return l.m(this.os_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getProduct() {
            return this.product_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getProductBytes() {
            return l.m(this.product_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getRelease() {
            return this.release_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getReleaseBytes() {
            return l.m(this.release_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getSdk() {
            return this.sdk_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getSdkBytes() {
            return l.m(this.sdk_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public int getSdkInt() {
            return this.sdkInt_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getSerial() {
            return this.serial_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getSerialBytes() {
            return l.m(this.serial_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public String getToken() {
            return this.token_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public l getTokenBytes() {
            return l.m(this.token_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasBoard() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasBootloader() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasBrand() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasBtaddress() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasCarlifeversion() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasCid() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasCodename() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasCpuAbi() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasCpuAbi2() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasDevice() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasDisplay() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasFingerprint() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasHardware() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasHost() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasIncremental() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasManufacturer() {
            return (this.bitField0_ & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasModel() {
            return (this.bitField0_ & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasOs() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasProduct() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasRelease() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasSdk() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasSdkInt() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasSerial() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeDeviceInfoProto.CarlifeDeviceInfoOrBuilder
        public boolean hasToken() {
            return (this.bitField0_ & 2097152) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeDeviceInfoOrBuilder extends m1 {
        String getBoard();

        l getBoardBytes();

        String getBootloader();

        l getBootloaderBytes();

        String getBrand();

        l getBrandBytes();

        String getBtaddress();

        l getBtaddressBytes();

        String getCarlifeversion();

        l getCarlifeversionBytes();

        String getCid();

        l getCidBytes();

        String getCodename();

        l getCodenameBytes();

        String getCpuAbi();

        String getCpuAbi2();

        l getCpuAbi2Bytes();

        l getCpuAbiBytes();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        String getDevice();

        l getDeviceBytes();

        String getDisplay();

        l getDisplayBytes();

        String getFingerprint();

        l getFingerprintBytes();

        String getHardware();

        l getHardwareBytes();

        String getHost();

        l getHostBytes();

        String getIncremental();

        l getIncrementalBytes();

        String getManufacturer();

        l getManufacturerBytes();

        String getModel();

        l getModelBytes();

        String getOs();

        l getOsBytes();

        String getProduct();

        l getProductBytes();

        String getRelease();

        l getReleaseBytes();

        String getSdk();

        l getSdkBytes();

        int getSdkInt();

        String getSerial();

        l getSerialBytes();

        String getToken();

        l getTokenBytes();

        boolean hasBoard();

        boolean hasBootloader();

        boolean hasBrand();

        boolean hasBtaddress();

        boolean hasCarlifeversion();

        boolean hasCid();

        boolean hasCodename();

        boolean hasCpuAbi();

        boolean hasCpuAbi2();

        boolean hasDevice();

        boolean hasDisplay();

        boolean hasFingerprint();

        boolean hasHardware();

        boolean hasHost();

        boolean hasIncremental();

        boolean hasManufacturer();

        boolean hasModel();

        boolean hasOs();

        boolean hasProduct();

        boolean hasRelease();

        boolean hasSdk();

        boolean hasSdkInt();

        boolean hasSerial();

        boolean hasToken();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeDeviceInfoProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

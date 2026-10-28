package com.baidu.carlife.protobuf;

import com.google.protobuf.c;
import com.google.protobuf.d;
import com.google.protobuf.e0;
import com.google.protobuf.f0;
import com.google.protobuf.i0;
import com.google.protobuf.j0;
import com.google.protobuf.l;
import com.google.protobuf.l1;
import com.google.protobuf.m1;
import com.google.protobuf.p;
import com.google.protobuf.s1;
import com.google.protobuf.t0;
import com.google.protobuf.y;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class CarlifeTouchEventAllDeviceProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeTouchEventAllDeviceProto$1, reason: invalid class name */
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
    public static final class CarlifeTouchEventAllDevice extends j0 implements CarlifeTouchEventAllDeviceOrBuilder {
        public static final int CNT_FIELD_NUMBER = 2;
        private static final CarlifeTouchEventAllDevice DEFAULT_INSTANCE;
        public static final int DEVICES_FIELD_NUMBER = 3;
        private static volatile s1 PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 1;
        private int bitField0_;
        private int cnt_;
        private int version_;
        private byte memoizedIsInitialized = 2;
        private t0 devices_ = j0.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeTouchEventAllDeviceOrBuilder {
            private Builder() {
                super(CarlifeTouchEventAllDevice.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllDevices(Iterable<? extends CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice> iterable) {
                copyOnWrite();
                ((CarlifeTouchEventAllDevice) this.instance).addAllDevices(iterable);
                return this;
            }

            public Builder addDevices(int i7, CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice.Builder builder) {
                copyOnWrite();
                ((CarlifeTouchEventAllDevice) this.instance).addDevices(i7, (CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice) builder.m16build());
                return this;
            }

            public Builder addDevices(int i7, CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice carlifeTouchEventDevice) {
                copyOnWrite();
                ((CarlifeTouchEventAllDevice) this.instance).addDevices(i7, carlifeTouchEventDevice);
                return this;
            }

            public Builder addDevices(CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice.Builder builder) {
                copyOnWrite();
                ((CarlifeTouchEventAllDevice) this.instance).addDevices((CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice) builder.m16build());
                return this;
            }

            public Builder addDevices(CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice carlifeTouchEventDevice) {
                copyOnWrite();
                ((CarlifeTouchEventAllDevice) this.instance).addDevices(carlifeTouchEventDevice);
                return this;
            }

            public Builder clearCnt() {
                copyOnWrite();
                ((CarlifeTouchEventAllDevice) this.instance).clearCnt();
                return this;
            }

            public Builder clearDevices() {
                copyOnWrite();
                ((CarlifeTouchEventAllDevice) this.instance).clearDevices();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((CarlifeTouchEventAllDevice) this.instance).clearVersion();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventAllDeviceProto.CarlifeTouchEventAllDeviceOrBuilder
            public int getCnt() {
                return ((CarlifeTouchEventAllDevice) this.instance).getCnt();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventAllDeviceProto.CarlifeTouchEventAllDeviceOrBuilder
            public CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice getDevices(int i7) {
                return ((CarlifeTouchEventAllDevice) this.instance).getDevices(i7);
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventAllDeviceProto.CarlifeTouchEventAllDeviceOrBuilder
            public int getDevicesCount() {
                return ((CarlifeTouchEventAllDevice) this.instance).getDevicesCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventAllDeviceProto.CarlifeTouchEventAllDeviceOrBuilder
            public List<CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice> getDevicesList() {
                return Collections.unmodifiableList(((CarlifeTouchEventAllDevice) this.instance).getDevicesList());
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventAllDeviceProto.CarlifeTouchEventAllDeviceOrBuilder
            public int getVersion() {
                return ((CarlifeTouchEventAllDevice) this.instance).getVersion();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventAllDeviceProto.CarlifeTouchEventAllDeviceOrBuilder
            public boolean hasCnt() {
                return ((CarlifeTouchEventAllDevice) this.instance).hasCnt();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventAllDeviceProto.CarlifeTouchEventAllDeviceOrBuilder
            public boolean hasVersion() {
                return ((CarlifeTouchEventAllDevice) this.instance).hasVersion();
            }

            public Builder removeDevices(int i7) {
                copyOnWrite();
                ((CarlifeTouchEventAllDevice) this.instance).removeDevices(i7);
                return this;
            }

            public Builder setCnt(int i7) {
                copyOnWrite();
                ((CarlifeTouchEventAllDevice) this.instance).setCnt(i7);
                return this;
            }

            public Builder setDevices(int i7, CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice.Builder builder) {
                copyOnWrite();
                ((CarlifeTouchEventAllDevice) this.instance).setDevices(i7, (CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice) builder.m16build());
                return this;
            }

            public Builder setDevices(int i7, CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice carlifeTouchEventDevice) {
                copyOnWrite();
                ((CarlifeTouchEventAllDevice) this.instance).setDevices(i7, carlifeTouchEventDevice);
                return this;
            }

            public Builder setVersion(int i7) {
                copyOnWrite();
                ((CarlifeTouchEventAllDevice) this.instance).setVersion(i7);
                return this;
            }
        }

        static {
            CarlifeTouchEventAllDevice carlifeTouchEventAllDevice = new CarlifeTouchEventAllDevice();
            DEFAULT_INSTANCE = carlifeTouchEventAllDevice;
            j0.registerDefaultInstance(CarlifeTouchEventAllDevice.class, carlifeTouchEventAllDevice);
        }

        private CarlifeTouchEventAllDevice() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDevices(Iterable<? extends CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice> iterable) {
            ensureDevicesIsMutable();
            c.addAll((Iterable) iterable, (List) this.devices_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDevices(int i7, CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice carlifeTouchEventDevice) {
            carlifeTouchEventDevice.getClass();
            ensureDevicesIsMutable();
            this.devices_.add(i7, carlifeTouchEventDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDevices(CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice carlifeTouchEventDevice) {
            carlifeTouchEventDevice.getClass();
            ensureDevicesIsMutable();
            this.devices_.add(carlifeTouchEventDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCnt() {
            this.bitField0_ &= -3;
            this.cnt_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDevices() {
            this.devices_ = j0.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.bitField0_ &= -2;
            this.version_ = 0;
        }

        private void ensureDevicesIsMutable() {
            t0 t0Var = this.devices_;
            if (((d) t0Var).f2729a) {
                return;
            }
            this.devices_ = j0.mutableCopy(t0Var);
        }

        public static CarlifeTouchEventAllDevice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeTouchEventAllDevice carlifeTouchEventAllDevice) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeTouchEventAllDevice);
        }

        public static CarlifeTouchEventAllDevice parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeTouchEventAllDevice) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeTouchEventAllDevice parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeTouchEventAllDevice) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeTouchEventAllDevice parseFrom(l lVar) {
            return (CarlifeTouchEventAllDevice) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeTouchEventAllDevice parseFrom(l lVar, y yVar) {
            return (CarlifeTouchEventAllDevice) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeTouchEventAllDevice parseFrom(p pVar) {
            return (CarlifeTouchEventAllDevice) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeTouchEventAllDevice parseFrom(p pVar, y yVar) {
            return (CarlifeTouchEventAllDevice) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeTouchEventAllDevice parseFrom(InputStream inputStream) {
            return (CarlifeTouchEventAllDevice) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeTouchEventAllDevice parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeTouchEventAllDevice) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeTouchEventAllDevice parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeTouchEventAllDevice) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeTouchEventAllDevice parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeTouchEventAllDevice) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeTouchEventAllDevice parseFrom(byte[] bArr) {
            return (CarlifeTouchEventAllDevice) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeTouchEventAllDevice parseFrom(byte[] bArr, y yVar) {
            return (CarlifeTouchEventAllDevice) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDevices(int i7) {
            ensureDevicesIsMutable();
            this.devices_.remove(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCnt(int i7) {
            this.bitField0_ |= 2;
            this.cnt_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDevices(int i7, CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice carlifeTouchEventDevice) {
            carlifeTouchEventDevice.getClass();
            ensureDevicesIsMutable();
            this.devices_.set(i7, carlifeTouchEventDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i7) {
            this.bitField0_ |= 1;
            this.version_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003Л", new Object[]{"bitField0_", "version_", "cnt_", "devices_", CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice.class});
                case 3:
                    return new CarlifeTouchEventAllDevice();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeTouchEventAllDevice.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventAllDeviceProto.CarlifeTouchEventAllDeviceOrBuilder
        public int getCnt() {
            return this.cnt_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventAllDeviceProto.CarlifeTouchEventAllDeviceOrBuilder
        public CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice getDevices(int i7) {
            return (CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice) this.devices_.get(i7);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventAllDeviceProto.CarlifeTouchEventAllDeviceOrBuilder
        public int getDevicesCount() {
            return this.devices_.size();
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventAllDeviceProto.CarlifeTouchEventAllDeviceOrBuilder
        public List<CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice> getDevicesList() {
            return this.devices_;
        }

        public CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder getDevicesOrBuilder(int i7) {
            return (CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder) this.devices_.get(i7);
        }

        public List<? extends CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder> getDevicesOrBuilderList() {
            return this.devices_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventAllDeviceProto.CarlifeTouchEventAllDeviceOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventAllDeviceProto.CarlifeTouchEventAllDeviceOrBuilder
        public boolean hasCnt() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventAllDeviceProto.CarlifeTouchEventAllDeviceOrBuilder
        public boolean hasVersion() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeTouchEventAllDeviceOrBuilder extends m1 {
        int getCnt();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice getDevices(int i7);

        int getDevicesCount();

        List<CarlifeTouchEventDeviceProto.CarlifeTouchEventDevice> getDevicesList();

        int getVersion();

        boolean hasCnt();

        boolean hasVersion();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeTouchEventAllDeviceProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

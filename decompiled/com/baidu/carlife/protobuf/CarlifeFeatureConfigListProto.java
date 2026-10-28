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
public final class CarlifeFeatureConfigListProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto$1, reason: invalid class name */
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
    public static final class CarlifeFeatureConfigList extends j0 implements CarlifeFeatureConfigListOrBuilder {
        public static final int CNT_FIELD_NUMBER = 1;
        private static final CarlifeFeatureConfigList DEFAULT_INSTANCE;
        public static final int FEATURECONFIG_FIELD_NUMBER = 2;
        public static final int HUBTAUDIOSUPPORT_FIELD_NUMBER = 3;
        public static final int HUBTMAC_FIELD_NUMBER = 5;
        public static final int HUBTNAME_FIELD_NUMBER = 4;
        private static volatile s1 PARSER;
        private int bitField0_;
        private int cnt_;
        private boolean huBtAudioSupport_;
        private byte memoizedIsInitialized = 2;
        private t0 featureConfig_ = j0.emptyProtobufList();
        private String huBtName_ = "";
        private String huBtMAC_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeFeatureConfigListOrBuilder {
            private Builder() {
                super(CarlifeFeatureConfigList.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllFeatureConfig(Iterable<? extends CarlifeFeatureConfigProto.CarlifeFeatureConfig> iterable) {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).addAllFeatureConfig(iterable);
                return this;
            }

            public Builder addFeatureConfig(int i7, CarlifeFeatureConfigProto.CarlifeFeatureConfig.Builder builder) {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).addFeatureConfig(i7, (CarlifeFeatureConfigProto.CarlifeFeatureConfig) builder.m16build());
                return this;
            }

            public Builder addFeatureConfig(int i7, CarlifeFeatureConfigProto.CarlifeFeatureConfig carlifeFeatureConfig) {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).addFeatureConfig(i7, carlifeFeatureConfig);
                return this;
            }

            public Builder addFeatureConfig(CarlifeFeatureConfigProto.CarlifeFeatureConfig.Builder builder) {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).addFeatureConfig((CarlifeFeatureConfigProto.CarlifeFeatureConfig) builder.m16build());
                return this;
            }

            public Builder addFeatureConfig(CarlifeFeatureConfigProto.CarlifeFeatureConfig carlifeFeatureConfig) {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).addFeatureConfig(carlifeFeatureConfig);
                return this;
            }

            public Builder clearCnt() {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).clearCnt();
                return this;
            }

            public Builder clearFeatureConfig() {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).clearFeatureConfig();
                return this;
            }

            public Builder clearHuBtAudioSupport() {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).clearHuBtAudioSupport();
                return this;
            }

            public Builder clearHuBtMAC() {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).clearHuBtMAC();
                return this;
            }

            public Builder clearHuBtName() {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).clearHuBtName();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
            public int getCnt() {
                return ((CarlifeFeatureConfigList) this.instance).getCnt();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
            public CarlifeFeatureConfigProto.CarlifeFeatureConfig getFeatureConfig(int i7) {
                return ((CarlifeFeatureConfigList) this.instance).getFeatureConfig(i7);
            }

            @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
            public int getFeatureConfigCount() {
                return ((CarlifeFeatureConfigList) this.instance).getFeatureConfigCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
            public List<CarlifeFeatureConfigProto.CarlifeFeatureConfig> getFeatureConfigList() {
                return Collections.unmodifiableList(((CarlifeFeatureConfigList) this.instance).getFeatureConfigList());
            }

            @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
            public boolean getHuBtAudioSupport() {
                return ((CarlifeFeatureConfigList) this.instance).getHuBtAudioSupport();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
            public String getHuBtMAC() {
                return ((CarlifeFeatureConfigList) this.instance).getHuBtMAC();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
            public l getHuBtMACBytes() {
                return ((CarlifeFeatureConfigList) this.instance).getHuBtMACBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
            public String getHuBtName() {
                return ((CarlifeFeatureConfigList) this.instance).getHuBtName();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
            public l getHuBtNameBytes() {
                return ((CarlifeFeatureConfigList) this.instance).getHuBtNameBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
            public boolean hasCnt() {
                return ((CarlifeFeatureConfigList) this.instance).hasCnt();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
            public boolean hasHuBtAudioSupport() {
                return ((CarlifeFeatureConfigList) this.instance).hasHuBtAudioSupport();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
            public boolean hasHuBtMAC() {
                return ((CarlifeFeatureConfigList) this.instance).hasHuBtMAC();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
            public boolean hasHuBtName() {
                return ((CarlifeFeatureConfigList) this.instance).hasHuBtName();
            }

            public Builder removeFeatureConfig(int i7) {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).removeFeatureConfig(i7);
                return this;
            }

            public Builder setCnt(int i7) {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).setCnt(i7);
                return this;
            }

            public Builder setFeatureConfig(int i7, CarlifeFeatureConfigProto.CarlifeFeatureConfig.Builder builder) {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).setFeatureConfig(i7, (CarlifeFeatureConfigProto.CarlifeFeatureConfig) builder.m16build());
                return this;
            }

            public Builder setFeatureConfig(int i7, CarlifeFeatureConfigProto.CarlifeFeatureConfig carlifeFeatureConfig) {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).setFeatureConfig(i7, carlifeFeatureConfig);
                return this;
            }

            public Builder setHuBtAudioSupport(boolean z10) {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).setHuBtAudioSupport(z10);
                return this;
            }

            public Builder setHuBtMAC(String str) {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).setHuBtMAC(str);
                return this;
            }

            public Builder setHuBtMACBytes(l lVar) {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).setHuBtMACBytes(lVar);
                return this;
            }

            public Builder setHuBtName(String str) {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).setHuBtName(str);
                return this;
            }

            public Builder setHuBtNameBytes(l lVar) {
                copyOnWrite();
                ((CarlifeFeatureConfigList) this.instance).setHuBtNameBytes(lVar);
                return this;
            }
        }

        static {
            CarlifeFeatureConfigList carlifeFeatureConfigList = new CarlifeFeatureConfigList();
            DEFAULT_INSTANCE = carlifeFeatureConfigList;
            j0.registerDefaultInstance(CarlifeFeatureConfigList.class, carlifeFeatureConfigList);
        }

        private CarlifeFeatureConfigList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFeatureConfig(Iterable<? extends CarlifeFeatureConfigProto.CarlifeFeatureConfig> iterable) {
            ensureFeatureConfigIsMutable();
            c.addAll((Iterable) iterable, (List) this.featureConfig_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFeatureConfig(int i7, CarlifeFeatureConfigProto.CarlifeFeatureConfig carlifeFeatureConfig) {
            carlifeFeatureConfig.getClass();
            ensureFeatureConfigIsMutable();
            this.featureConfig_.add(i7, carlifeFeatureConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFeatureConfig(CarlifeFeatureConfigProto.CarlifeFeatureConfig carlifeFeatureConfig) {
            carlifeFeatureConfig.getClass();
            ensureFeatureConfigIsMutable();
            this.featureConfig_.add(carlifeFeatureConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCnt() {
            this.bitField0_ &= -2;
            this.cnt_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatureConfig() {
            this.featureConfig_ = j0.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHuBtAudioSupport() {
            this.bitField0_ &= -3;
            this.huBtAudioSupport_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHuBtMAC() {
            this.bitField0_ &= -9;
            this.huBtMAC_ = getDefaultInstance().getHuBtMAC();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHuBtName() {
            this.bitField0_ &= -5;
            this.huBtName_ = getDefaultInstance().getHuBtName();
        }

        private void ensureFeatureConfigIsMutable() {
            t0 t0Var = this.featureConfig_;
            if (((d) t0Var).f2729a) {
                return;
            }
            this.featureConfig_ = j0.mutableCopy(t0Var);
        }

        public static CarlifeFeatureConfigList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeFeatureConfigList carlifeFeatureConfigList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeFeatureConfigList);
        }

        public static CarlifeFeatureConfigList parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeFeatureConfigList) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeFeatureConfigList parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeFeatureConfigList) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeFeatureConfigList parseFrom(l lVar) {
            return (CarlifeFeatureConfigList) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeFeatureConfigList parseFrom(l lVar, y yVar) {
            return (CarlifeFeatureConfigList) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeFeatureConfigList parseFrom(p pVar) {
            return (CarlifeFeatureConfigList) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeFeatureConfigList parseFrom(p pVar, y yVar) {
            return (CarlifeFeatureConfigList) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeFeatureConfigList parseFrom(InputStream inputStream) {
            return (CarlifeFeatureConfigList) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeFeatureConfigList parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeFeatureConfigList) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeFeatureConfigList parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeFeatureConfigList) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeFeatureConfigList parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeFeatureConfigList) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeFeatureConfigList parseFrom(byte[] bArr) {
            return (CarlifeFeatureConfigList) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeFeatureConfigList parseFrom(byte[] bArr, y yVar) {
            return (CarlifeFeatureConfigList) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeFeatureConfig(int i7) {
            ensureFeatureConfigIsMutable();
            this.featureConfig_.remove(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCnt(int i7) {
            this.bitField0_ |= 1;
            this.cnt_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatureConfig(int i7, CarlifeFeatureConfigProto.CarlifeFeatureConfig carlifeFeatureConfig) {
            carlifeFeatureConfig.getClass();
            ensureFeatureConfigIsMutable();
            this.featureConfig_.set(i7, carlifeFeatureConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHuBtAudioSupport(boolean z10) {
            this.bitField0_ |= 2;
            this.huBtAudioSupport_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHuBtMAC(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.huBtMAC_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHuBtMACBytes(l lVar) {
            this.huBtMAC_ = lVar.u();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHuBtName(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.huBtName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHuBtNameBytes(l lVar) {
            this.huBtName_ = lVar.u();
            this.bitField0_ |= 4;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001ᔄ\u0000\u0002Л\u0003ဇ\u0001\u0004ဈ\u0002\u0005ဈ\u0003", new Object[]{"bitField0_", "cnt_", "featureConfig_", CarlifeFeatureConfigProto.CarlifeFeatureConfig.class, "huBtAudioSupport_", "huBtName_", "huBtMAC_"});
                case 3:
                    return new CarlifeFeatureConfigList();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeFeatureConfigList.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
        public int getCnt() {
            return this.cnt_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
        public CarlifeFeatureConfigProto.CarlifeFeatureConfig getFeatureConfig(int i7) {
            return (CarlifeFeatureConfigProto.CarlifeFeatureConfig) this.featureConfig_.get(i7);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
        public int getFeatureConfigCount() {
            return this.featureConfig_.size();
        }

        @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
        public List<CarlifeFeatureConfigProto.CarlifeFeatureConfig> getFeatureConfigList() {
            return this.featureConfig_;
        }

        public CarlifeFeatureConfigProto.CarlifeFeatureConfigOrBuilder getFeatureConfigOrBuilder(int i7) {
            return (CarlifeFeatureConfigProto.CarlifeFeatureConfigOrBuilder) this.featureConfig_.get(i7);
        }

        public List<? extends CarlifeFeatureConfigProto.CarlifeFeatureConfigOrBuilder> getFeatureConfigOrBuilderList() {
            return this.featureConfig_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
        public boolean getHuBtAudioSupport() {
            return this.huBtAudioSupport_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
        public String getHuBtMAC() {
            return this.huBtMAC_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
        public l getHuBtMACBytes() {
            return l.m(this.huBtMAC_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
        public String getHuBtName() {
            return this.huBtName_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
        public l getHuBtNameBytes() {
            return l.m(this.huBtName_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
        public boolean hasCnt() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
        public boolean hasHuBtAudioSupport() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
        public boolean hasHuBtMAC() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto.CarlifeFeatureConfigListOrBuilder
        public boolean hasHuBtName() {
            return (this.bitField0_ & 4) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeFeatureConfigListOrBuilder extends m1 {
        int getCnt();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        CarlifeFeatureConfigProto.CarlifeFeatureConfig getFeatureConfig(int i7);

        int getFeatureConfigCount();

        List<CarlifeFeatureConfigProto.CarlifeFeatureConfig> getFeatureConfigList();

        boolean getHuBtAudioSupport();

        String getHuBtMAC();

        l getHuBtMACBytes();

        String getHuBtName();

        l getHuBtNameBytes();

        boolean hasCnt();

        boolean hasHuBtAudioSupport();

        boolean hasHuBtMAC();

        boolean hasHuBtName();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeFeatureConfigListProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

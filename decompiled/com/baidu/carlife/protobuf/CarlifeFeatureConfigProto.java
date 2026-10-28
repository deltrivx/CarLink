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
public final class CarlifeFeatureConfigProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeFeatureConfigProto$1, reason: invalid class name */
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
    public static final class CarlifeFeatureConfig extends j0 implements CarlifeFeatureConfigOrBuilder {
        private static final CarlifeFeatureConfig DEFAULT_INSTANCE;
        public static final int KEY_FIELD_NUMBER = 1;
        private static volatile s1 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private int value_;
        private byte memoizedIsInitialized = 2;
        private String key_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeFeatureConfigOrBuilder {
            private Builder() {
                super(CarlifeFeatureConfig.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearKey() {
                copyOnWrite();
                ((CarlifeFeatureConfig) this.instance).clearKey();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((CarlifeFeatureConfig) this.instance).clearValue();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigProto.CarlifeFeatureConfigOrBuilder
            public String getKey() {
                return ((CarlifeFeatureConfig) this.instance).getKey();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigProto.CarlifeFeatureConfigOrBuilder
            public l getKeyBytes() {
                return ((CarlifeFeatureConfig) this.instance).getKeyBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigProto.CarlifeFeatureConfigOrBuilder
            public int getValue() {
                return ((CarlifeFeatureConfig) this.instance).getValue();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigProto.CarlifeFeatureConfigOrBuilder
            public boolean hasKey() {
                return ((CarlifeFeatureConfig) this.instance).hasKey();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigProto.CarlifeFeatureConfigOrBuilder
            public boolean hasValue() {
                return ((CarlifeFeatureConfig) this.instance).hasValue();
            }

            public Builder setKey(String str) {
                copyOnWrite();
                ((CarlifeFeatureConfig) this.instance).setKey(str);
                return this;
            }

            public Builder setKeyBytes(l lVar) {
                copyOnWrite();
                ((CarlifeFeatureConfig) this.instance).setKeyBytes(lVar);
                return this;
            }

            public Builder setValue(int i7) {
                copyOnWrite();
                ((CarlifeFeatureConfig) this.instance).setValue(i7);
                return this;
            }
        }

        static {
            CarlifeFeatureConfig carlifeFeatureConfig = new CarlifeFeatureConfig();
            DEFAULT_INSTANCE = carlifeFeatureConfig;
            j0.registerDefaultInstance(CarlifeFeatureConfig.class, carlifeFeatureConfig);
        }

        private CarlifeFeatureConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKey() {
            this.bitField0_ &= -2;
            this.key_ = getDefaultInstance().getKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.bitField0_ &= -3;
            this.value_ = 0;
        }

        public static CarlifeFeatureConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeFeatureConfig carlifeFeatureConfig) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeFeatureConfig);
        }

        public static CarlifeFeatureConfig parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeFeatureConfig) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeFeatureConfig parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeFeatureConfig) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeFeatureConfig parseFrom(l lVar) {
            return (CarlifeFeatureConfig) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeFeatureConfig parseFrom(l lVar, y yVar) {
            return (CarlifeFeatureConfig) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeFeatureConfig parseFrom(p pVar) {
            return (CarlifeFeatureConfig) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeFeatureConfig parseFrom(p pVar, y yVar) {
            return (CarlifeFeatureConfig) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeFeatureConfig parseFrom(InputStream inputStream) {
            return (CarlifeFeatureConfig) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeFeatureConfig parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeFeatureConfig) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeFeatureConfig parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeFeatureConfig) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeFeatureConfig parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeFeatureConfig) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeFeatureConfig parseFrom(byte[] bArr) {
            return (CarlifeFeatureConfig) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeFeatureConfig parseFrom(byte[] bArr, y yVar) {
            return (CarlifeFeatureConfig) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKey(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.key_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyBytes(l lVar) {
            this.key_ = lVar.u();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(int i7) {
            this.bitField0_ |= 2;
            this.value_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔄ\u0001", new Object[]{"bitField0_", "key_", "value_"});
                case 3:
                    return new CarlifeFeatureConfig();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeFeatureConfig.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigProto.CarlifeFeatureConfigOrBuilder
        public String getKey() {
            return this.key_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigProto.CarlifeFeatureConfigOrBuilder
        public l getKeyBytes() {
            return l.m(this.key_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigProto.CarlifeFeatureConfigOrBuilder
        public int getValue() {
            return this.value_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigProto.CarlifeFeatureConfigOrBuilder
        public boolean hasKey() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeFeatureConfigProto.CarlifeFeatureConfigOrBuilder
        public boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeFeatureConfigOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        String getKey();

        l getKeyBytes();

        int getValue();

        boolean hasKey();

        boolean hasValue();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeFeatureConfigProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

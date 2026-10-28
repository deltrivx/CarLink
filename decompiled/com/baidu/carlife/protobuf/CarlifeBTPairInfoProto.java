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
public final class CarlifeBTPairInfoProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeBTPairInfoProto$1, reason: invalid class name */
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
    public static final class CarlifeBTPairInfo extends j0 implements CarlifeBTPairInfoOrBuilder {
        public static final int ADDRESS_FIELD_NUMBER = 1;
        private static final CarlifeBTPairInfo DEFAULT_INSTANCE;
        public static final int HASH_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 6;
        private static volatile s1 PARSER = null;
        public static final int PASSKEY_FIELD_NUMBER = 2;
        public static final int RANDOMIZER_FIELD_NUMBER = 4;
        public static final int STATUS_FIELD_NUMBER = 7;
        public static final int UUID_FIELD_NUMBER = 5;
        private int bitField0_;
        private int status_;
        private byte memoizedIsInitialized = 2;
        private String address_ = "";
        private String passKey_ = "";
        private String hash_ = "";
        private String randomizer_ = "";
        private String uuid_ = "";
        private String name_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeBTPairInfoOrBuilder {
            private Builder() {
                super(CarlifeBTPairInfo.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAddress() {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).clearAddress();
                return this;
            }

            public Builder clearHash() {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).clearHash();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).clearName();
                return this;
            }

            public Builder clearPassKey() {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).clearPassKey();
                return this;
            }

            public Builder clearRandomizer() {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).clearRandomizer();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).clearStatus();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).clearUuid();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public String getAddress() {
                return ((CarlifeBTPairInfo) this.instance).getAddress();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public l getAddressBytes() {
                return ((CarlifeBTPairInfo) this.instance).getAddressBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public String getHash() {
                return ((CarlifeBTPairInfo) this.instance).getHash();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public l getHashBytes() {
                return ((CarlifeBTPairInfo) this.instance).getHashBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public String getName() {
                return ((CarlifeBTPairInfo) this.instance).getName();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public l getNameBytes() {
                return ((CarlifeBTPairInfo) this.instance).getNameBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public String getPassKey() {
                return ((CarlifeBTPairInfo) this.instance).getPassKey();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public l getPassKeyBytes() {
                return ((CarlifeBTPairInfo) this.instance).getPassKeyBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public String getRandomizer() {
                return ((CarlifeBTPairInfo) this.instance).getRandomizer();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public l getRandomizerBytes() {
                return ((CarlifeBTPairInfo) this.instance).getRandomizerBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public int getStatus() {
                return ((CarlifeBTPairInfo) this.instance).getStatus();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public String getUuid() {
                return ((CarlifeBTPairInfo) this.instance).getUuid();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public l getUuidBytes() {
                return ((CarlifeBTPairInfo) this.instance).getUuidBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public boolean hasAddress() {
                return ((CarlifeBTPairInfo) this.instance).hasAddress();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public boolean hasHash() {
                return ((CarlifeBTPairInfo) this.instance).hasHash();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public boolean hasName() {
                return ((CarlifeBTPairInfo) this.instance).hasName();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public boolean hasPassKey() {
                return ((CarlifeBTPairInfo) this.instance).hasPassKey();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public boolean hasRandomizer() {
                return ((CarlifeBTPairInfo) this.instance).hasRandomizer();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public boolean hasStatus() {
                return ((CarlifeBTPairInfo) this.instance).hasStatus();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
            public boolean hasUuid() {
                return ((CarlifeBTPairInfo) this.instance).hasUuid();
            }

            public Builder setAddress(String str) {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).setAddress(str);
                return this;
            }

            public Builder setAddressBytes(l lVar) {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).setAddressBytes(lVar);
                return this;
            }

            public Builder setHash(String str) {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).setHash(str);
                return this;
            }

            public Builder setHashBytes(l lVar) {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).setHashBytes(lVar);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(l lVar) {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).setNameBytes(lVar);
                return this;
            }

            public Builder setPassKey(String str) {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).setPassKey(str);
                return this;
            }

            public Builder setPassKeyBytes(l lVar) {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).setPassKeyBytes(lVar);
                return this;
            }

            public Builder setRandomizer(String str) {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).setRandomizer(str);
                return this;
            }

            public Builder setRandomizerBytes(l lVar) {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).setRandomizerBytes(lVar);
                return this;
            }

            public Builder setStatus(int i7) {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).setStatus(i7);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(l lVar) {
                copyOnWrite();
                ((CarlifeBTPairInfo) this.instance).setUuidBytes(lVar);
                return this;
            }
        }

        static {
            CarlifeBTPairInfo carlifeBTPairInfo = new CarlifeBTPairInfo();
            DEFAULT_INSTANCE = carlifeBTPairInfo;
            j0.registerDefaultInstance(CarlifeBTPairInfo.class, carlifeBTPairInfo);
        }

        private CarlifeBTPairInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddress() {
            this.bitField0_ &= -2;
            this.address_ = getDefaultInstance().getAddress();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHash() {
            this.bitField0_ &= -5;
            this.hash_ = getDefaultInstance().getHash();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -33;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPassKey() {
            this.bitField0_ &= -3;
            this.passKey_ = getDefaultInstance().getPassKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRandomizer() {
            this.bitField0_ &= -9;
            this.randomizer_ = getDefaultInstance().getRandomizer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.bitField0_ &= -65;
            this.status_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.bitField0_ &= -17;
            this.uuid_ = getDefaultInstance().getUuid();
        }

        public static CarlifeBTPairInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeBTPairInfo carlifeBTPairInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeBTPairInfo);
        }

        public static CarlifeBTPairInfo parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeBTPairInfo) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeBTPairInfo parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeBTPairInfo) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeBTPairInfo parseFrom(l lVar) {
            return (CarlifeBTPairInfo) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeBTPairInfo parseFrom(l lVar, y yVar) {
            return (CarlifeBTPairInfo) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeBTPairInfo parseFrom(p pVar) {
            return (CarlifeBTPairInfo) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeBTPairInfo parseFrom(p pVar, y yVar) {
            return (CarlifeBTPairInfo) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeBTPairInfo parseFrom(InputStream inputStream) {
            return (CarlifeBTPairInfo) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeBTPairInfo parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeBTPairInfo) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeBTPairInfo parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeBTPairInfo) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeBTPairInfo parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeBTPairInfo) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeBTPairInfo parseFrom(byte[] bArr) {
            return (CarlifeBTPairInfo) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeBTPairInfo parseFrom(byte[] bArr, y yVar) {
            return (CarlifeBTPairInfo) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddress(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.address_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddressBytes(l lVar) {
            this.address_ = lVar.u();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHash(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.hash_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHashBytes(l lVar) {
            this.hash_ = lVar.u();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(l lVar) {
            this.name_ = lVar.u();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPassKey(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.passKey_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPassKeyBytes(l lVar) {
            this.passKey_ = lVar.u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRandomizer(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.randomizer_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRandomizerBytes(l lVar) {
            this.randomizer_ = lVar.u();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(int i7) {
            this.bitField0_ |= 64;
            this.status_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(l lVar) {
            this.uuid_ = lVar.u();
            this.bitField0_ |= 16;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0004\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ᔈ\u0004\u0006ᔈ\u0005\u0007ᔄ\u0006", new Object[]{"bitField0_", "address_", "passKey_", "hash_", "randomizer_", "uuid_", "name_", "status_"});
                case 3:
                    return new CarlifeBTPairInfo();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeBTPairInfo.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public String getAddress() {
            return this.address_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public l getAddressBytes() {
            return l.m(this.address_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public String getHash() {
            return this.hash_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public l getHashBytes() {
            return l.m(this.hash_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public l getNameBytes() {
            return l.m(this.name_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public String getPassKey() {
            return this.passKey_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public l getPassKeyBytes() {
            return l.m(this.passKey_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public String getRandomizer() {
            return this.randomizer_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public l getRandomizerBytes() {
            return l.m(this.randomizer_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public int getStatus() {
            return this.status_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public l getUuidBytes() {
            return l.m(this.uuid_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public boolean hasAddress() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public boolean hasHash() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public boolean hasPassKey() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public boolean hasRandomizer() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTPairInfoProto.CarlifeBTPairInfoOrBuilder
        public boolean hasUuid() {
            return (this.bitField0_ & 16) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeBTPairInfoOrBuilder extends m1 {
        String getAddress();

        l getAddressBytes();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        String getHash();

        l getHashBytes();

        String getName();

        l getNameBytes();

        String getPassKey();

        l getPassKeyBytes();

        String getRandomizer();

        l getRandomizerBytes();

        int getStatus();

        String getUuid();

        l getUuidBytes();

        boolean hasAddress();

        boolean hasHash();

        boolean hasName();

        boolean hasPassKey();

        boolean hasRandomizer();

        boolean hasStatus();

        boolean hasUuid();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeBTPairInfoProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

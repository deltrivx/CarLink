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
public final class CarlifeBTHfpIndicationProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto$1, reason: invalid class name */
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
    public static final class CarlifeBTHfpIndication extends j0 implements CarlifeBTHfpIndicationOrBuilder {
        public static final int ADDRESS_FIELD_NUMBER = 4;
        private static final CarlifeBTHfpIndication DEFAULT_INSTANCE;
        private static volatile s1 PARSER = null;
        public static final int PHONENAME_FIELD_NUMBER = 3;
        public static final int PHONENUM_FIELD_NUMBER = 2;
        public static final int STATE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int state_;
        private byte memoizedIsInitialized = 2;
        private String phoneNum_ = "";
        private String phoneName_ = "";
        private String address_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeBTHfpIndicationOrBuilder {
            private Builder() {
                super(CarlifeBTHfpIndication.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAddress() {
                copyOnWrite();
                ((CarlifeBTHfpIndication) this.instance).clearAddress();
                return this;
            }

            public Builder clearPhoneName() {
                copyOnWrite();
                ((CarlifeBTHfpIndication) this.instance).clearPhoneName();
                return this;
            }

            public Builder clearPhoneNum() {
                copyOnWrite();
                ((CarlifeBTHfpIndication) this.instance).clearPhoneNum();
                return this;
            }

            public Builder clearState() {
                copyOnWrite();
                ((CarlifeBTHfpIndication) this.instance).clearState();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
            public String getAddress() {
                return ((CarlifeBTHfpIndication) this.instance).getAddress();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
            public l getAddressBytes() {
                return ((CarlifeBTHfpIndication) this.instance).getAddressBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
            public String getPhoneName() {
                return ((CarlifeBTHfpIndication) this.instance).getPhoneName();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
            public l getPhoneNameBytes() {
                return ((CarlifeBTHfpIndication) this.instance).getPhoneNameBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
            public String getPhoneNum() {
                return ((CarlifeBTHfpIndication) this.instance).getPhoneNum();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
            public l getPhoneNumBytes() {
                return ((CarlifeBTHfpIndication) this.instance).getPhoneNumBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
            public int getState() {
                return ((CarlifeBTHfpIndication) this.instance).getState();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
            public boolean hasAddress() {
                return ((CarlifeBTHfpIndication) this.instance).hasAddress();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
            public boolean hasPhoneName() {
                return ((CarlifeBTHfpIndication) this.instance).hasPhoneName();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
            public boolean hasPhoneNum() {
                return ((CarlifeBTHfpIndication) this.instance).hasPhoneNum();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
            public boolean hasState() {
                return ((CarlifeBTHfpIndication) this.instance).hasState();
            }

            public Builder setAddress(String str) {
                copyOnWrite();
                ((CarlifeBTHfpIndication) this.instance).setAddress(str);
                return this;
            }

            public Builder setAddressBytes(l lVar) {
                copyOnWrite();
                ((CarlifeBTHfpIndication) this.instance).setAddressBytes(lVar);
                return this;
            }

            public Builder setPhoneName(String str) {
                copyOnWrite();
                ((CarlifeBTHfpIndication) this.instance).setPhoneName(str);
                return this;
            }

            public Builder setPhoneNameBytes(l lVar) {
                copyOnWrite();
                ((CarlifeBTHfpIndication) this.instance).setPhoneNameBytes(lVar);
                return this;
            }

            public Builder setPhoneNum(String str) {
                copyOnWrite();
                ((CarlifeBTHfpIndication) this.instance).setPhoneNum(str);
                return this;
            }

            public Builder setPhoneNumBytes(l lVar) {
                copyOnWrite();
                ((CarlifeBTHfpIndication) this.instance).setPhoneNumBytes(lVar);
                return this;
            }

            public Builder setState(int i7) {
                copyOnWrite();
                ((CarlifeBTHfpIndication) this.instance).setState(i7);
                return this;
            }
        }

        static {
            CarlifeBTHfpIndication carlifeBTHfpIndication = new CarlifeBTHfpIndication();
            DEFAULT_INSTANCE = carlifeBTHfpIndication;
            j0.registerDefaultInstance(CarlifeBTHfpIndication.class, carlifeBTHfpIndication);
        }

        private CarlifeBTHfpIndication() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddress() {
            this.bitField0_ &= -9;
            this.address_ = getDefaultInstance().getAddress();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhoneName() {
            this.bitField0_ &= -5;
            this.phoneName_ = getDefaultInstance().getPhoneName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhoneNum() {
            this.bitField0_ &= -3;
            this.phoneNum_ = getDefaultInstance().getPhoneNum();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearState() {
            this.bitField0_ &= -2;
            this.state_ = 0;
        }

        public static CarlifeBTHfpIndication getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeBTHfpIndication carlifeBTHfpIndication) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeBTHfpIndication);
        }

        public static CarlifeBTHfpIndication parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeBTHfpIndication) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeBTHfpIndication parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeBTHfpIndication) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeBTHfpIndication parseFrom(l lVar) {
            return (CarlifeBTHfpIndication) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeBTHfpIndication parseFrom(l lVar, y yVar) {
            return (CarlifeBTHfpIndication) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeBTHfpIndication parseFrom(p pVar) {
            return (CarlifeBTHfpIndication) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeBTHfpIndication parseFrom(p pVar, y yVar) {
            return (CarlifeBTHfpIndication) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeBTHfpIndication parseFrom(InputStream inputStream) {
            return (CarlifeBTHfpIndication) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeBTHfpIndication parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeBTHfpIndication) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeBTHfpIndication parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeBTHfpIndication) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeBTHfpIndication parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeBTHfpIndication) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeBTHfpIndication parseFrom(byte[] bArr) {
            return (CarlifeBTHfpIndication) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeBTHfpIndication parseFrom(byte[] bArr, y yVar) {
            return (CarlifeBTHfpIndication) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddress(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.address_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddressBytes(l lVar) {
            this.address_ = lVar.u();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneName(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.phoneName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneNameBytes(l lVar) {
            this.phoneName_ = lVar.u();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneNum(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.phoneNum_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneNumBytes(l lVar) {
            this.phoneNum_ = lVar.u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setState(int i7) {
            this.bitField0_ |= 1;
            this.state_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "state_", "phoneNum_", "phoneName_", "address_"});
                case 3:
                    return new CarlifeBTHfpIndication();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeBTHfpIndication.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
        public String getAddress() {
            return this.address_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
        public l getAddressBytes() {
            return l.m(this.address_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
        public String getPhoneName() {
            return this.phoneName_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
        public l getPhoneNameBytes() {
            return l.m(this.phoneName_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
        public String getPhoneNum() {
            return this.phoneNum_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
        public l getPhoneNumBytes() {
            return l.m(this.phoneNum_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
        public int getState() {
            return this.state_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
        public boolean hasAddress() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
        public boolean hasPhoneName() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
        public boolean hasPhoneNum() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpIndicationProto.CarlifeBTHfpIndicationOrBuilder
        public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeBTHfpIndicationOrBuilder extends m1 {
        String getAddress();

        l getAddressBytes();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        String getPhoneName();

        l getPhoneNameBytes();

        String getPhoneNum();

        l getPhoneNumBytes();

        int getState();

        boolean hasAddress();

        boolean hasPhoneName();

        boolean hasPhoneNum();

        boolean hasState();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeBTHfpIndicationProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

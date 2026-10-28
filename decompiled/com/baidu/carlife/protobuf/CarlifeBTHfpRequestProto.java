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
public final class CarlifeBTHfpRequestProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto$1, reason: invalid class name */
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
    public static final class CarlifeBTHfpRequest extends j0 implements CarlifeBTHfpRequestOrBuilder {
        public static final int COMMAND_FIELD_NUMBER = 1;
        private static final CarlifeBTHfpRequest DEFAULT_INSTANCE;
        public static final int DTMFCODE_FIELD_NUMBER = 3;
        private static volatile s1 PARSER = null;
        public static final int PHONENUM_FIELD_NUMBER = 2;
        private int bitField0_;
        private int command_;
        private int dtmfCode_;
        private byte memoizedIsInitialized = 2;
        private String phoneNum_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeBTHfpRequestOrBuilder {
            private Builder() {
                super(CarlifeBTHfpRequest.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCommand() {
                copyOnWrite();
                ((CarlifeBTHfpRequest) this.instance).clearCommand();
                return this;
            }

            public Builder clearDtmfCode() {
                copyOnWrite();
                ((CarlifeBTHfpRequest) this.instance).clearDtmfCode();
                return this;
            }

            public Builder clearPhoneNum() {
                copyOnWrite();
                ((CarlifeBTHfpRequest) this.instance).clearPhoneNum();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequestOrBuilder
            public int getCommand() {
                return ((CarlifeBTHfpRequest) this.instance).getCommand();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequestOrBuilder
            public int getDtmfCode() {
                return ((CarlifeBTHfpRequest) this.instance).getDtmfCode();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequestOrBuilder
            public String getPhoneNum() {
                return ((CarlifeBTHfpRequest) this.instance).getPhoneNum();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequestOrBuilder
            public l getPhoneNumBytes() {
                return ((CarlifeBTHfpRequest) this.instance).getPhoneNumBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequestOrBuilder
            public boolean hasCommand() {
                return ((CarlifeBTHfpRequest) this.instance).hasCommand();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequestOrBuilder
            public boolean hasDtmfCode() {
                return ((CarlifeBTHfpRequest) this.instance).hasDtmfCode();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequestOrBuilder
            public boolean hasPhoneNum() {
                return ((CarlifeBTHfpRequest) this.instance).hasPhoneNum();
            }

            public Builder setCommand(int i7) {
                copyOnWrite();
                ((CarlifeBTHfpRequest) this.instance).setCommand(i7);
                return this;
            }

            public Builder setDtmfCode(int i7) {
                copyOnWrite();
                ((CarlifeBTHfpRequest) this.instance).setDtmfCode(i7);
                return this;
            }

            public Builder setPhoneNum(String str) {
                copyOnWrite();
                ((CarlifeBTHfpRequest) this.instance).setPhoneNum(str);
                return this;
            }

            public Builder setPhoneNumBytes(l lVar) {
                copyOnWrite();
                ((CarlifeBTHfpRequest) this.instance).setPhoneNumBytes(lVar);
                return this;
            }
        }

        static {
            CarlifeBTHfpRequest carlifeBTHfpRequest = new CarlifeBTHfpRequest();
            DEFAULT_INSTANCE = carlifeBTHfpRequest;
            j0.registerDefaultInstance(CarlifeBTHfpRequest.class, carlifeBTHfpRequest);
        }

        private CarlifeBTHfpRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCommand() {
            this.bitField0_ &= -2;
            this.command_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDtmfCode() {
            this.bitField0_ &= -5;
            this.dtmfCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhoneNum() {
            this.bitField0_ &= -3;
            this.phoneNum_ = getDefaultInstance().getPhoneNum();
        }

        public static CarlifeBTHfpRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeBTHfpRequest carlifeBTHfpRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeBTHfpRequest);
        }

        public static CarlifeBTHfpRequest parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeBTHfpRequest) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeBTHfpRequest parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeBTHfpRequest) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeBTHfpRequest parseFrom(l lVar) {
            return (CarlifeBTHfpRequest) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeBTHfpRequest parseFrom(l lVar, y yVar) {
            return (CarlifeBTHfpRequest) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeBTHfpRequest parseFrom(p pVar) {
            return (CarlifeBTHfpRequest) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeBTHfpRequest parseFrom(p pVar, y yVar) {
            return (CarlifeBTHfpRequest) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeBTHfpRequest parseFrom(InputStream inputStream) {
            return (CarlifeBTHfpRequest) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeBTHfpRequest parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeBTHfpRequest) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeBTHfpRequest parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeBTHfpRequest) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeBTHfpRequest parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeBTHfpRequest) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeBTHfpRequest parseFrom(byte[] bArr) {
            return (CarlifeBTHfpRequest) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeBTHfpRequest parseFrom(byte[] bArr, y yVar) {
            return (CarlifeBTHfpRequest) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCommand(int i7) {
            this.bitField0_ |= 1;
            this.command_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDtmfCode(int i7) {
            this.bitField0_ |= 4;
            this.dtmfCode_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔄ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"bitField0_", "command_", "phoneNum_", "dtmfCode_"});
                case 3:
                    return new CarlifeBTHfpRequest();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeBTHfpRequest.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequestOrBuilder
        public int getCommand() {
            return this.command_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequestOrBuilder
        public int getDtmfCode() {
            return this.dtmfCode_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequestOrBuilder
        public String getPhoneNum() {
            return this.phoneNum_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequestOrBuilder
        public l getPhoneNumBytes() {
            return l.m(this.phoneNum_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequestOrBuilder
        public boolean hasCommand() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequestOrBuilder
        public boolean hasDtmfCode() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeBTHfpRequestProto.CarlifeBTHfpRequestOrBuilder
        public boolean hasPhoneNum() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeBTHfpRequestOrBuilder extends m1 {
        int getCommand();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getDtmfCode();

        String getPhoneNum();

        l getPhoneNumBytes();

        boolean hasCommand();

        boolean hasDtmfCode();

        boolean hasPhoneNum();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeBTHfpRequestProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

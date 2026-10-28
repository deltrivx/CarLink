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
public final class CarlifeContactsProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeContactsProto$1, reason: invalid class name */
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
    public static final class CarlifeContacts extends j0 implements CarlifeContactsOrBuilder {
        public static final int CID_FIELD_NUMBER = 1;
        private static final CarlifeContacts DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NUMBER_FIELD_NUMBER = 3;
        private static volatile s1 PARSER;
        private int bitField0_;
        private int cid_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private String number_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeContactsOrBuilder {
            private Builder() {
                super(CarlifeContacts.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCid() {
                copyOnWrite();
                ((CarlifeContacts) this.instance).clearCid();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((CarlifeContacts) this.instance).clearName();
                return this;
            }

            public Builder clearNumber() {
                copyOnWrite();
                ((CarlifeContacts) this.instance).clearNumber();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeContactsProto.CarlifeContactsOrBuilder
            public int getCid() {
                return ((CarlifeContacts) this.instance).getCid();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeContactsProto.CarlifeContactsOrBuilder
            public String getName() {
                return ((CarlifeContacts) this.instance).getName();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeContactsProto.CarlifeContactsOrBuilder
            public l getNameBytes() {
                return ((CarlifeContacts) this.instance).getNameBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeContactsProto.CarlifeContactsOrBuilder
            public String getNumber() {
                return ((CarlifeContacts) this.instance).getNumber();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeContactsProto.CarlifeContactsOrBuilder
            public l getNumberBytes() {
                return ((CarlifeContacts) this.instance).getNumberBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeContactsProto.CarlifeContactsOrBuilder
            public boolean hasCid() {
                return ((CarlifeContacts) this.instance).hasCid();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeContactsProto.CarlifeContactsOrBuilder
            public boolean hasName() {
                return ((CarlifeContacts) this.instance).hasName();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeContactsProto.CarlifeContactsOrBuilder
            public boolean hasNumber() {
                return ((CarlifeContacts) this.instance).hasNumber();
            }

            public Builder setCid(int i7) {
                copyOnWrite();
                ((CarlifeContacts) this.instance).setCid(i7);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((CarlifeContacts) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(l lVar) {
                copyOnWrite();
                ((CarlifeContacts) this.instance).setNameBytes(lVar);
                return this;
            }

            public Builder setNumber(String str) {
                copyOnWrite();
                ((CarlifeContacts) this.instance).setNumber(str);
                return this;
            }

            public Builder setNumberBytes(l lVar) {
                copyOnWrite();
                ((CarlifeContacts) this.instance).setNumberBytes(lVar);
                return this;
            }
        }

        static {
            CarlifeContacts carlifeContacts = new CarlifeContacts();
            DEFAULT_INSTANCE = carlifeContacts;
            j0.registerDefaultInstance(CarlifeContacts.class, carlifeContacts);
        }

        private CarlifeContacts() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCid() {
            this.bitField0_ &= -2;
            this.cid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -3;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumber() {
            this.bitField0_ &= -5;
            this.number_ = getDefaultInstance().getNumber();
        }

        public static CarlifeContacts getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeContacts carlifeContacts) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeContacts);
        }

        public static CarlifeContacts parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeContacts) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeContacts parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeContacts) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeContacts parseFrom(l lVar) {
            return (CarlifeContacts) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeContacts parseFrom(l lVar, y yVar) {
            return (CarlifeContacts) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeContacts parseFrom(p pVar) {
            return (CarlifeContacts) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeContacts parseFrom(p pVar, y yVar) {
            return (CarlifeContacts) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeContacts parseFrom(InputStream inputStream) {
            return (CarlifeContacts) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeContacts parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeContacts) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeContacts parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeContacts) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeContacts parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeContacts) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeContacts parseFrom(byte[] bArr) {
            return (CarlifeContacts) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeContacts parseFrom(byte[] bArr, y yVar) {
            return (CarlifeContacts) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCid(int i7) {
            this.bitField0_ |= 1;
            this.cid_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(l lVar) {
            this.name_ = lVar.u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.number_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumberBytes(l lVar) {
            this.number_ = lVar.u();
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002", new Object[]{"bitField0_", "cid_", "name_", "number_"});
                case 3:
                    return new CarlifeContacts();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeContacts.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeContactsProto.CarlifeContactsOrBuilder
        public int getCid() {
            return this.cid_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeContactsProto.CarlifeContactsOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeContactsProto.CarlifeContactsOrBuilder
        public l getNameBytes() {
            return l.m(this.name_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeContactsProto.CarlifeContactsOrBuilder
        public String getNumber() {
            return this.number_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeContactsProto.CarlifeContactsOrBuilder
        public l getNumberBytes() {
            return l.m(this.number_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeContactsProto.CarlifeContactsOrBuilder
        public boolean hasCid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeContactsProto.CarlifeContactsOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeContactsProto.CarlifeContactsOrBuilder
        public boolean hasNumber() {
            return (this.bitField0_ & 4) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeContactsOrBuilder extends m1 {
        int getCid();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        String getName();

        l getNameBytes();

        String getNumber();

        l getNumberBytes();

        boolean hasCid();

        boolean hasName();

        boolean hasNumber();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeContactsProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

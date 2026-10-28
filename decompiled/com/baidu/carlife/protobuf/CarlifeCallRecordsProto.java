package com.baidu.carlife.protobuf;

import com.google.protobuf.e0;
import com.google.protobuf.f0;
import com.google.protobuf.i0;
import com.google.protobuf.j0;
import com.google.protobuf.l;
import com.google.protobuf.l1;
import com.google.protobuf.m1;
import com.google.protobuf.n0;
import com.google.protobuf.o0;
import com.google.protobuf.p;
import com.google.protobuf.p0;
import com.google.protobuf.s1;
import com.google.protobuf.y;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class CarlifeCallRecordsProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeCallRecordsProto$1, reason: invalid class name */
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
    public static final class CarlifeCallRecords extends j0 implements CarlifeCallRecordsOrBuilder {
        public static final int CID_FIELD_NUMBER = 1;
        private static final CarlifeCallRecords DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NUMBER_FIELD_NUMBER = 3;
        private static volatile s1 PARSER = null;
        public static final int TIME_FIELD_NUMBER = 5;
        public static final int TYPE_FIELD_NUMBER = 6;
        private int bitField0_;
        private int cid_;
        private int type_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private String number_ = "";
        private String duration_ = "";
        private String time_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeCallRecordsOrBuilder {
            private Builder() {
                super(CarlifeCallRecords.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCid() {
                copyOnWrite();
                ((CarlifeCallRecords) this.instance).clearCid();
                return this;
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((CarlifeCallRecords) this.instance).clearDuration();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((CarlifeCallRecords) this.instance).clearName();
                return this;
            }

            public Builder clearNumber() {
                copyOnWrite();
                ((CarlifeCallRecords) this.instance).clearNumber();
                return this;
            }

            public Builder clearTime() {
                copyOnWrite();
                ((CarlifeCallRecords) this.instance).clearTime();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((CarlifeCallRecords) this.instance).clearType();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
            public int getCid() {
                return ((CarlifeCallRecords) this.instance).getCid();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
            public String getDuration() {
                return ((CarlifeCallRecords) this.instance).getDuration();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
            public l getDurationBytes() {
                return ((CarlifeCallRecords) this.instance).getDurationBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
            public String getName() {
                return ((CarlifeCallRecords) this.instance).getName();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
            public l getNameBytes() {
                return ((CarlifeCallRecords) this.instance).getNameBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
            public String getNumber() {
                return ((CarlifeCallRecords) this.instance).getNumber();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
            public l getNumberBytes() {
                return ((CarlifeCallRecords) this.instance).getNumberBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
            public String getTime() {
                return ((CarlifeCallRecords) this.instance).getTime();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
            public l getTimeBytes() {
                return ((CarlifeCallRecords) this.instance).getTimeBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
            public CallRecordsType getType() {
                return ((CarlifeCallRecords) this.instance).getType();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
            public boolean hasCid() {
                return ((CarlifeCallRecords) this.instance).hasCid();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
            public boolean hasDuration() {
                return ((CarlifeCallRecords) this.instance).hasDuration();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
            public boolean hasName() {
                return ((CarlifeCallRecords) this.instance).hasName();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
            public boolean hasNumber() {
                return ((CarlifeCallRecords) this.instance).hasNumber();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
            public boolean hasTime() {
                return ((CarlifeCallRecords) this.instance).hasTime();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
            public boolean hasType() {
                return ((CarlifeCallRecords) this.instance).hasType();
            }

            public Builder setCid(int i7) {
                copyOnWrite();
                ((CarlifeCallRecords) this.instance).setCid(i7);
                return this;
            }

            public Builder setDuration(String str) {
                copyOnWrite();
                ((CarlifeCallRecords) this.instance).setDuration(str);
                return this;
            }

            public Builder setDurationBytes(l lVar) {
                copyOnWrite();
                ((CarlifeCallRecords) this.instance).setDurationBytes(lVar);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((CarlifeCallRecords) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(l lVar) {
                copyOnWrite();
                ((CarlifeCallRecords) this.instance).setNameBytes(lVar);
                return this;
            }

            public Builder setNumber(String str) {
                copyOnWrite();
                ((CarlifeCallRecords) this.instance).setNumber(str);
                return this;
            }

            public Builder setNumberBytes(l lVar) {
                copyOnWrite();
                ((CarlifeCallRecords) this.instance).setNumberBytes(lVar);
                return this;
            }

            public Builder setTime(String str) {
                copyOnWrite();
                ((CarlifeCallRecords) this.instance).setTime(str);
                return this;
            }

            public Builder setTimeBytes(l lVar) {
                copyOnWrite();
                ((CarlifeCallRecords) this.instance).setTimeBytes(lVar);
                return this;
            }

            public Builder setType(CallRecordsType callRecordsType) {
                copyOnWrite();
                ((CarlifeCallRecords) this.instance).setType(callRecordsType);
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public enum CallRecordsType implements n0 {
            DEFAULT_TYPE(0),
            INCOMING_TYPE(1),
            OUTGOING_TYPE(2),
            MISSED_TYPE(3);

            public static final int DEFAULT_TYPE_VALUE = 0;
            public static final int INCOMING_TYPE_VALUE = 1;
            public static final int MISSED_TYPE_VALUE = 3;
            public static final int OUTGOING_TYPE_VALUE = 2;
            private static final o0 internalValueMap = new o0() { // from class: com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecords.CallRecordsType.1
                /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
                public CallRecordsType m0findValueByNumber(int i7) {
                    return CallRecordsType.forNumber(i7);
                }
            };
            private final int value;

            /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
            public static final class CallRecordsTypeVerifier implements p0 {
                static final p0 INSTANCE = new CallRecordsTypeVerifier();

                private CallRecordsTypeVerifier() {
                }

                @Override // com.google.protobuf.p0
                public boolean isInRange(int i7) {
                    return CallRecordsType.forNumber(i7) != null;
                }
            }

            CallRecordsType(int i7) {
                this.value = i7;
            }

            public static CallRecordsType forNumber(int i7) {
                if (i7 == 0) {
                    return DEFAULT_TYPE;
                }
                if (i7 == 1) {
                    return INCOMING_TYPE;
                }
                if (i7 == 2) {
                    return OUTGOING_TYPE;
                }
                if (i7 != 3) {
                    return null;
                }
                return MISSED_TYPE;
            }

            public static o0 internalGetValueMap() {
                return internalValueMap;
            }

            public static p0 internalGetVerifier() {
                return CallRecordsTypeVerifier.INSTANCE;
            }

            @Deprecated
            public static CallRecordsType valueOf(int i7) {
                return forNumber(i7);
            }

            public final int getNumber() {
                return this.value;
            }
        }

        static {
            CarlifeCallRecords carlifeCallRecords = new CarlifeCallRecords();
            DEFAULT_INSTANCE = carlifeCallRecords;
            j0.registerDefaultInstance(CarlifeCallRecords.class, carlifeCallRecords);
        }

        private CarlifeCallRecords() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCid() {
            this.bitField0_ &= -2;
            this.cid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuration() {
            this.bitField0_ &= -9;
            this.duration_ = getDefaultInstance().getDuration();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTime() {
            this.bitField0_ &= -17;
            this.time_ = getDefaultInstance().getTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -33;
            this.type_ = 0;
        }

        public static CarlifeCallRecords getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeCallRecords carlifeCallRecords) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeCallRecords);
        }

        public static CarlifeCallRecords parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeCallRecords) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeCallRecords parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeCallRecords) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeCallRecords parseFrom(l lVar) {
            return (CarlifeCallRecords) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeCallRecords parseFrom(l lVar, y yVar) {
            return (CarlifeCallRecords) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeCallRecords parseFrom(p pVar) {
            return (CarlifeCallRecords) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeCallRecords parseFrom(p pVar, y yVar) {
            return (CarlifeCallRecords) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeCallRecords parseFrom(InputStream inputStream) {
            return (CarlifeCallRecords) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeCallRecords parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeCallRecords) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeCallRecords parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeCallRecords) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeCallRecords parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeCallRecords) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeCallRecords parseFrom(byte[] bArr) {
            return (CarlifeCallRecords) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeCallRecords parseFrom(byte[] bArr, y yVar) {
            return (CarlifeCallRecords) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
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
        public void setDuration(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.duration_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDurationBytes(l lVar) {
            this.duration_ = lVar.u();
            this.bitField0_ |= 8;
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setTime(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.time_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeBytes(l lVar) {
            this.time_ = lVar.u();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(CallRecordsType callRecordsType) {
            this.type_ = callRecordsType.getNumber();
            this.bitField0_ |= 32;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᔄ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002\u0004ᔈ\u0003\u0005ᔈ\u0004\u0006ᔌ\u0005", new Object[]{"bitField0_", "cid_", "name_", "number_", "duration_", "time_", "type_", CallRecordsType.internalGetVerifier()});
                case 3:
                    return new CarlifeCallRecords();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeCallRecords.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
        public int getCid() {
            return this.cid_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
        public String getDuration() {
            return this.duration_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
        public l getDurationBytes() {
            return l.m(this.duration_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
        public l getNameBytes() {
            return l.m(this.name_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
        public String getNumber() {
            return this.number_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
        public l getNumberBytes() {
            return l.m(this.number_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
        public String getTime() {
            return this.time_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
        public l getTimeBytes() {
            return l.m(this.time_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
        public CallRecordsType getType() {
            CallRecordsType callRecordsTypeForNumber = CallRecordsType.forNumber(this.type_);
            return callRecordsTypeForNumber == null ? CallRecordsType.DEFAULT_TYPE : callRecordsTypeForNumber;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
        public boolean hasCid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
        public boolean hasDuration() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
        public boolean hasNumber() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
        public boolean hasTime() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 32) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeCallRecordsOrBuilder extends m1 {
        int getCid();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        String getDuration();

        l getDurationBytes();

        String getName();

        l getNameBytes();

        String getNumber();

        l getNumberBytes();

        String getTime();

        l getTimeBytes();

        CarlifeCallRecords.CallRecordsType getType();

        boolean hasCid();

        boolean hasDuration();

        boolean hasName();

        boolean hasNumber();

        boolean hasTime();

        boolean hasType();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeCallRecordsProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

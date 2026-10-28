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
public final class CarlifeCallRecordsListProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeCallRecordsListProto$1, reason: invalid class name */
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
    public static final class CarlifeCallRecordsList extends j0 implements CarlifeCallRecordsListOrBuilder {
        public static final int CARLIFECALLRECORDS_FIELD_NUMBER = 2;
        public static final int CNT_FIELD_NUMBER = 1;
        private static final CarlifeCallRecordsList DEFAULT_INSTANCE;
        private static volatile s1 PARSER;
        private int bitField0_;
        private int cnt_;
        private byte memoizedIsInitialized = 2;
        private t0 carlifeCallRecords_ = j0.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeCallRecordsListOrBuilder {
            private Builder() {
                super(CarlifeCallRecordsList.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllCarlifeCallRecords(Iterable<? extends CarlifeCallRecordsProto.CarlifeCallRecords> iterable) {
                copyOnWrite();
                ((CarlifeCallRecordsList) this.instance).addAllCarlifeCallRecords(iterable);
                return this;
            }

            public Builder addCarlifeCallRecords(int i7, CarlifeCallRecordsProto.CarlifeCallRecords.Builder builder) {
                copyOnWrite();
                ((CarlifeCallRecordsList) this.instance).addCarlifeCallRecords(i7, (CarlifeCallRecordsProto.CarlifeCallRecords) builder.m16build());
                return this;
            }

            public Builder addCarlifeCallRecords(int i7, CarlifeCallRecordsProto.CarlifeCallRecords carlifeCallRecords) {
                copyOnWrite();
                ((CarlifeCallRecordsList) this.instance).addCarlifeCallRecords(i7, carlifeCallRecords);
                return this;
            }

            public Builder addCarlifeCallRecords(CarlifeCallRecordsProto.CarlifeCallRecords.Builder builder) {
                copyOnWrite();
                ((CarlifeCallRecordsList) this.instance).addCarlifeCallRecords((CarlifeCallRecordsProto.CarlifeCallRecords) builder.m16build());
                return this;
            }

            public Builder addCarlifeCallRecords(CarlifeCallRecordsProto.CarlifeCallRecords carlifeCallRecords) {
                copyOnWrite();
                ((CarlifeCallRecordsList) this.instance).addCarlifeCallRecords(carlifeCallRecords);
                return this;
            }

            public Builder clearCarlifeCallRecords() {
                copyOnWrite();
                ((CarlifeCallRecordsList) this.instance).clearCarlifeCallRecords();
                return this;
            }

            public Builder clearCnt() {
                copyOnWrite();
                ((CarlifeCallRecordsList) this.instance).clearCnt();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsListProto.CarlifeCallRecordsListOrBuilder
            public CarlifeCallRecordsProto.CarlifeCallRecords getCarlifeCallRecords(int i7) {
                return ((CarlifeCallRecordsList) this.instance).getCarlifeCallRecords(i7);
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsListProto.CarlifeCallRecordsListOrBuilder
            public int getCarlifeCallRecordsCount() {
                return ((CarlifeCallRecordsList) this.instance).getCarlifeCallRecordsCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsListProto.CarlifeCallRecordsListOrBuilder
            public List<CarlifeCallRecordsProto.CarlifeCallRecords> getCarlifeCallRecordsList() {
                return Collections.unmodifiableList(((CarlifeCallRecordsList) this.instance).getCarlifeCallRecordsList());
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsListProto.CarlifeCallRecordsListOrBuilder
            public int getCnt() {
                return ((CarlifeCallRecordsList) this.instance).getCnt();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsListProto.CarlifeCallRecordsListOrBuilder
            public boolean hasCnt() {
                return ((CarlifeCallRecordsList) this.instance).hasCnt();
            }

            public Builder removeCarlifeCallRecords(int i7) {
                copyOnWrite();
                ((CarlifeCallRecordsList) this.instance).removeCarlifeCallRecords(i7);
                return this;
            }

            public Builder setCarlifeCallRecords(int i7, CarlifeCallRecordsProto.CarlifeCallRecords.Builder builder) {
                copyOnWrite();
                ((CarlifeCallRecordsList) this.instance).setCarlifeCallRecords(i7, (CarlifeCallRecordsProto.CarlifeCallRecords) builder.m16build());
                return this;
            }

            public Builder setCarlifeCallRecords(int i7, CarlifeCallRecordsProto.CarlifeCallRecords carlifeCallRecords) {
                copyOnWrite();
                ((CarlifeCallRecordsList) this.instance).setCarlifeCallRecords(i7, carlifeCallRecords);
                return this;
            }

            public Builder setCnt(int i7) {
                copyOnWrite();
                ((CarlifeCallRecordsList) this.instance).setCnt(i7);
                return this;
            }
        }

        static {
            CarlifeCallRecordsList carlifeCallRecordsList = new CarlifeCallRecordsList();
            DEFAULT_INSTANCE = carlifeCallRecordsList;
            j0.registerDefaultInstance(CarlifeCallRecordsList.class, carlifeCallRecordsList);
        }

        private CarlifeCallRecordsList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCarlifeCallRecords(Iterable<? extends CarlifeCallRecordsProto.CarlifeCallRecords> iterable) {
            ensureCarlifeCallRecordsIsMutable();
            c.addAll((Iterable) iterable, (List) this.carlifeCallRecords_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCarlifeCallRecords(int i7, CarlifeCallRecordsProto.CarlifeCallRecords carlifeCallRecords) {
            carlifeCallRecords.getClass();
            ensureCarlifeCallRecordsIsMutable();
            this.carlifeCallRecords_.add(i7, carlifeCallRecords);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCarlifeCallRecords(CarlifeCallRecordsProto.CarlifeCallRecords carlifeCallRecords) {
            carlifeCallRecords.getClass();
            ensureCarlifeCallRecordsIsMutable();
            this.carlifeCallRecords_.add(carlifeCallRecords);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCarlifeCallRecords() {
            this.carlifeCallRecords_ = j0.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCnt() {
            this.bitField0_ &= -2;
            this.cnt_ = 0;
        }

        private void ensureCarlifeCallRecordsIsMutable() {
            t0 t0Var = this.carlifeCallRecords_;
            if (((d) t0Var).f2729a) {
                return;
            }
            this.carlifeCallRecords_ = j0.mutableCopy(t0Var);
        }

        public static CarlifeCallRecordsList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeCallRecordsList carlifeCallRecordsList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeCallRecordsList);
        }

        public static CarlifeCallRecordsList parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeCallRecordsList) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeCallRecordsList parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeCallRecordsList) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeCallRecordsList parseFrom(l lVar) {
            return (CarlifeCallRecordsList) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeCallRecordsList parseFrom(l lVar, y yVar) {
            return (CarlifeCallRecordsList) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeCallRecordsList parseFrom(p pVar) {
            return (CarlifeCallRecordsList) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeCallRecordsList parseFrom(p pVar, y yVar) {
            return (CarlifeCallRecordsList) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeCallRecordsList parseFrom(InputStream inputStream) {
            return (CarlifeCallRecordsList) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeCallRecordsList parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeCallRecordsList) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeCallRecordsList parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeCallRecordsList) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeCallRecordsList parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeCallRecordsList) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeCallRecordsList parseFrom(byte[] bArr) {
            return (CarlifeCallRecordsList) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeCallRecordsList parseFrom(byte[] bArr, y yVar) {
            return (CarlifeCallRecordsList) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCarlifeCallRecords(int i7) {
            ensureCarlifeCallRecordsIsMutable();
            this.carlifeCallRecords_.remove(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCarlifeCallRecords(int i7, CarlifeCallRecordsProto.CarlifeCallRecords carlifeCallRecords) {
            carlifeCallRecords.getClass();
            ensureCarlifeCallRecordsIsMutable();
            this.carlifeCallRecords_.set(i7, carlifeCallRecords);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCnt(int i7) {
            this.bitField0_ |= 1;
            this.cnt_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᔄ\u0000\u0002Л", new Object[]{"bitField0_", "cnt_", "carlifeCallRecords_", CarlifeCallRecordsProto.CarlifeCallRecords.class});
                case 3:
                    return new CarlifeCallRecordsList();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeCallRecordsList.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsListProto.CarlifeCallRecordsListOrBuilder
        public CarlifeCallRecordsProto.CarlifeCallRecords getCarlifeCallRecords(int i7) {
            return (CarlifeCallRecordsProto.CarlifeCallRecords) this.carlifeCallRecords_.get(i7);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsListProto.CarlifeCallRecordsListOrBuilder
        public int getCarlifeCallRecordsCount() {
            return this.carlifeCallRecords_.size();
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsListProto.CarlifeCallRecordsListOrBuilder
        public List<CarlifeCallRecordsProto.CarlifeCallRecords> getCarlifeCallRecordsList() {
            return this.carlifeCallRecords_;
        }

        public CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder getCarlifeCallRecordsOrBuilder(int i7) {
            return (CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder) this.carlifeCallRecords_.get(i7);
        }

        public List<? extends CarlifeCallRecordsProto.CarlifeCallRecordsOrBuilder> getCarlifeCallRecordsOrBuilderList() {
            return this.carlifeCallRecords_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsListProto.CarlifeCallRecordsListOrBuilder
        public int getCnt() {
            return this.cnt_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCallRecordsListProto.CarlifeCallRecordsListOrBuilder
        public boolean hasCnt() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeCallRecordsListOrBuilder extends m1 {
        CarlifeCallRecordsProto.CarlifeCallRecords getCarlifeCallRecords(int i7);

        int getCarlifeCallRecordsCount();

        List<CarlifeCallRecordsProto.CarlifeCallRecords> getCarlifeCallRecordsList();

        int getCnt();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        boolean hasCnt();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeCallRecordsListProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

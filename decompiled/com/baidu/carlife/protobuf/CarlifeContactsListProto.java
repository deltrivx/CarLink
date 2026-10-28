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
public final class CarlifeContactsListProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeContactsListProto$1, reason: invalid class name */
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
    public static final class CarlifeContactsList extends j0 implements CarlifeContactsListOrBuilder {
        public static final int CARLIFECONTACTS_FIELD_NUMBER = 2;
        public static final int CNT_FIELD_NUMBER = 1;
        private static final CarlifeContactsList DEFAULT_INSTANCE;
        private static volatile s1 PARSER;
        private int bitField0_;
        private int cnt_;
        private byte memoizedIsInitialized = 2;
        private t0 carlifeContacts_ = j0.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeContactsListOrBuilder {
            private Builder() {
                super(CarlifeContactsList.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllCarlifeContacts(Iterable<? extends CarlifeContactsProto.CarlifeContacts> iterable) {
                copyOnWrite();
                ((CarlifeContactsList) this.instance).addAllCarlifeContacts(iterable);
                return this;
            }

            public Builder addCarlifeContacts(int i7, CarlifeContactsProto.CarlifeContacts.Builder builder) {
                copyOnWrite();
                ((CarlifeContactsList) this.instance).addCarlifeContacts(i7, (CarlifeContactsProto.CarlifeContacts) builder.m16build());
                return this;
            }

            public Builder addCarlifeContacts(int i7, CarlifeContactsProto.CarlifeContacts carlifeContacts) {
                copyOnWrite();
                ((CarlifeContactsList) this.instance).addCarlifeContacts(i7, carlifeContacts);
                return this;
            }

            public Builder addCarlifeContacts(CarlifeContactsProto.CarlifeContacts.Builder builder) {
                copyOnWrite();
                ((CarlifeContactsList) this.instance).addCarlifeContacts((CarlifeContactsProto.CarlifeContacts) builder.m16build());
                return this;
            }

            public Builder addCarlifeContacts(CarlifeContactsProto.CarlifeContacts carlifeContacts) {
                copyOnWrite();
                ((CarlifeContactsList) this.instance).addCarlifeContacts(carlifeContacts);
                return this;
            }

            public Builder clearCarlifeContacts() {
                copyOnWrite();
                ((CarlifeContactsList) this.instance).clearCarlifeContacts();
                return this;
            }

            public Builder clearCnt() {
                copyOnWrite();
                ((CarlifeContactsList) this.instance).clearCnt();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeContactsListProto.CarlifeContactsListOrBuilder
            public CarlifeContactsProto.CarlifeContacts getCarlifeContacts(int i7) {
                return ((CarlifeContactsList) this.instance).getCarlifeContacts(i7);
            }

            @Override // com.baidu.carlife.protobuf.CarlifeContactsListProto.CarlifeContactsListOrBuilder
            public int getCarlifeContactsCount() {
                return ((CarlifeContactsList) this.instance).getCarlifeContactsCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeContactsListProto.CarlifeContactsListOrBuilder
            public List<CarlifeContactsProto.CarlifeContacts> getCarlifeContactsList() {
                return Collections.unmodifiableList(((CarlifeContactsList) this.instance).getCarlifeContactsList());
            }

            @Override // com.baidu.carlife.protobuf.CarlifeContactsListProto.CarlifeContactsListOrBuilder
            public int getCnt() {
                return ((CarlifeContactsList) this.instance).getCnt();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeContactsListProto.CarlifeContactsListOrBuilder
            public boolean hasCnt() {
                return ((CarlifeContactsList) this.instance).hasCnt();
            }

            public Builder removeCarlifeContacts(int i7) {
                copyOnWrite();
                ((CarlifeContactsList) this.instance).removeCarlifeContacts(i7);
                return this;
            }

            public Builder setCarlifeContacts(int i7, CarlifeContactsProto.CarlifeContacts.Builder builder) {
                copyOnWrite();
                ((CarlifeContactsList) this.instance).setCarlifeContacts(i7, (CarlifeContactsProto.CarlifeContacts) builder.m16build());
                return this;
            }

            public Builder setCarlifeContacts(int i7, CarlifeContactsProto.CarlifeContacts carlifeContacts) {
                copyOnWrite();
                ((CarlifeContactsList) this.instance).setCarlifeContacts(i7, carlifeContacts);
                return this;
            }

            public Builder setCnt(int i7) {
                copyOnWrite();
                ((CarlifeContactsList) this.instance).setCnt(i7);
                return this;
            }
        }

        static {
            CarlifeContactsList carlifeContactsList = new CarlifeContactsList();
            DEFAULT_INSTANCE = carlifeContactsList;
            j0.registerDefaultInstance(CarlifeContactsList.class, carlifeContactsList);
        }

        private CarlifeContactsList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCarlifeContacts(Iterable<? extends CarlifeContactsProto.CarlifeContacts> iterable) {
            ensureCarlifeContactsIsMutable();
            c.addAll((Iterable) iterable, (List) this.carlifeContacts_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCarlifeContacts(int i7, CarlifeContactsProto.CarlifeContacts carlifeContacts) {
            carlifeContacts.getClass();
            ensureCarlifeContactsIsMutable();
            this.carlifeContacts_.add(i7, carlifeContacts);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCarlifeContacts(CarlifeContactsProto.CarlifeContacts carlifeContacts) {
            carlifeContacts.getClass();
            ensureCarlifeContactsIsMutable();
            this.carlifeContacts_.add(carlifeContacts);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCarlifeContacts() {
            this.carlifeContacts_ = j0.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCnt() {
            this.bitField0_ &= -2;
            this.cnt_ = 0;
        }

        private void ensureCarlifeContactsIsMutable() {
            t0 t0Var = this.carlifeContacts_;
            if (((d) t0Var).f2729a) {
                return;
            }
            this.carlifeContacts_ = j0.mutableCopy(t0Var);
        }

        public static CarlifeContactsList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeContactsList carlifeContactsList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeContactsList);
        }

        public static CarlifeContactsList parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeContactsList) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeContactsList parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeContactsList) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeContactsList parseFrom(l lVar) {
            return (CarlifeContactsList) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeContactsList parseFrom(l lVar, y yVar) {
            return (CarlifeContactsList) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeContactsList parseFrom(p pVar) {
            return (CarlifeContactsList) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeContactsList parseFrom(p pVar, y yVar) {
            return (CarlifeContactsList) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeContactsList parseFrom(InputStream inputStream) {
            return (CarlifeContactsList) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeContactsList parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeContactsList) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeContactsList parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeContactsList) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeContactsList parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeContactsList) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeContactsList parseFrom(byte[] bArr) {
            return (CarlifeContactsList) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeContactsList parseFrom(byte[] bArr, y yVar) {
            return (CarlifeContactsList) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeCarlifeContacts(int i7) {
            ensureCarlifeContactsIsMutable();
            this.carlifeContacts_.remove(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCarlifeContacts(int i7, CarlifeContactsProto.CarlifeContacts carlifeContacts) {
            carlifeContacts.getClass();
            ensureCarlifeContactsIsMutable();
            this.carlifeContacts_.set(i7, carlifeContacts);
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᔄ\u0000\u0002Л", new Object[]{"bitField0_", "cnt_", "carlifeContacts_", CarlifeContactsProto.CarlifeContacts.class});
                case 3:
                    return new CarlifeContactsList();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeContactsList.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeContactsListProto.CarlifeContactsListOrBuilder
        public CarlifeContactsProto.CarlifeContacts getCarlifeContacts(int i7) {
            return (CarlifeContactsProto.CarlifeContacts) this.carlifeContacts_.get(i7);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeContactsListProto.CarlifeContactsListOrBuilder
        public int getCarlifeContactsCount() {
            return this.carlifeContacts_.size();
        }

        @Override // com.baidu.carlife.protobuf.CarlifeContactsListProto.CarlifeContactsListOrBuilder
        public List<CarlifeContactsProto.CarlifeContacts> getCarlifeContactsList() {
            return this.carlifeContacts_;
        }

        public CarlifeContactsProto.CarlifeContactsOrBuilder getCarlifeContactsOrBuilder(int i7) {
            return (CarlifeContactsProto.CarlifeContactsOrBuilder) this.carlifeContacts_.get(i7);
        }

        public List<? extends CarlifeContactsProto.CarlifeContactsOrBuilder> getCarlifeContactsOrBuilderList() {
            return this.carlifeContacts_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeContactsListProto.CarlifeContactsListOrBuilder
        public int getCnt() {
            return this.cnt_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeContactsListProto.CarlifeContactsListOrBuilder
        public boolean hasCnt() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeContactsListOrBuilder extends m1 {
        CarlifeContactsProto.CarlifeContacts getCarlifeContacts(int i7);

        int getCarlifeContactsCount();

        List<CarlifeContactsProto.CarlifeContacts> getCarlifeContactsList();

        int getCnt();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        boolean hasCnt();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeContactsListProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

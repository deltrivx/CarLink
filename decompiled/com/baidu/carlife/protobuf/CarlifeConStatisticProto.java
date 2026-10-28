package com.baidu.carlife.protobuf;

import com.google.protobuf.c;
import com.google.protobuf.d;
import com.google.protobuf.e0;
import com.google.protobuf.f0;
import com.google.protobuf.i0;
import com.google.protobuf.j0;
import com.google.protobuf.k0;
import com.google.protobuf.l;
import com.google.protobuf.l1;
import com.google.protobuf.m1;
import com.google.protobuf.p;
import com.google.protobuf.r0;
import com.google.protobuf.s1;
import com.google.protobuf.y;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class CarlifeConStatisticProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeConStatisticProto$1, reason: invalid class name */
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
    public static final class CarlifeConnectStatistics extends j0 implements CarlifeConnectStatisticsOrBuilder {
        public static final int CONFAILED_FIELD_NUMBER = 3;
        public static final int CONSUCCESS_FIELD_NUMBER = 2;
        public static final int CONTIME_FIELD_NUMBER = 4;
        public static final int CONTOTAL_FIELD_NUMBER = 1;
        private static final CarlifeConnectStatistics DEFAULT_INSTANCE;
        public static final int NERRORCOUNT_FIELD_NUMBER = 5;
        public static final int NERROR_TYPE_FIELD_NUMBER = 6;
        private static volatile s1 PARSER;
        private int bitField0_;
        private int confailed_;
        private int consuccess_;
        private int contime_;
        private int contotal_;
        private byte memoizedIsInitialized = 2;
        private r0 nerrorType_ = j0.emptyIntList();
        private int nerrorcount_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeConnectStatisticsOrBuilder {
            private Builder() {
                super(CarlifeConnectStatistics.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllNerrorType(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((CarlifeConnectStatistics) this.instance).addAllNerrorType(iterable);
                return this;
            }

            public Builder addNerrorType(int i7) {
                copyOnWrite();
                ((CarlifeConnectStatistics) this.instance).addNerrorType(i7);
                return this;
            }

            public Builder clearConfailed() {
                copyOnWrite();
                ((CarlifeConnectStatistics) this.instance).clearConfailed();
                return this;
            }

            public Builder clearConsuccess() {
                copyOnWrite();
                ((CarlifeConnectStatistics) this.instance).clearConsuccess();
                return this;
            }

            public Builder clearContime() {
                copyOnWrite();
                ((CarlifeConnectStatistics) this.instance).clearContime();
                return this;
            }

            public Builder clearContotal() {
                copyOnWrite();
                ((CarlifeConnectStatistics) this.instance).clearContotal();
                return this;
            }

            public Builder clearNerrorType() {
                copyOnWrite();
                ((CarlifeConnectStatistics) this.instance).clearNerrorType();
                return this;
            }

            public Builder clearNerrorcount() {
                copyOnWrite();
                ((CarlifeConnectStatistics) this.instance).clearNerrorcount();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
            public int getConfailed() {
                return ((CarlifeConnectStatistics) this.instance).getConfailed();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
            public int getConsuccess() {
                return ((CarlifeConnectStatistics) this.instance).getConsuccess();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
            public int getContime() {
                return ((CarlifeConnectStatistics) this.instance).getContime();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
            public int getContotal() {
                return ((CarlifeConnectStatistics) this.instance).getContotal();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
            public int getNerrorType(int i7) {
                return ((CarlifeConnectStatistics) this.instance).getNerrorType(i7);
            }

            @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
            public int getNerrorTypeCount() {
                return ((CarlifeConnectStatistics) this.instance).getNerrorTypeCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
            public List<Integer> getNerrorTypeList() {
                return Collections.unmodifiableList(((CarlifeConnectStatistics) this.instance).getNerrorTypeList());
            }

            @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
            public int getNerrorcount() {
                return ((CarlifeConnectStatistics) this.instance).getNerrorcount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
            public boolean hasConfailed() {
                return ((CarlifeConnectStatistics) this.instance).hasConfailed();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
            public boolean hasConsuccess() {
                return ((CarlifeConnectStatistics) this.instance).hasConsuccess();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
            public boolean hasContime() {
                return ((CarlifeConnectStatistics) this.instance).hasContime();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
            public boolean hasContotal() {
                return ((CarlifeConnectStatistics) this.instance).hasContotal();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
            public boolean hasNerrorcount() {
                return ((CarlifeConnectStatistics) this.instance).hasNerrorcount();
            }

            public Builder setConfailed(int i7) {
                copyOnWrite();
                ((CarlifeConnectStatistics) this.instance).setConfailed(i7);
                return this;
            }

            public Builder setConsuccess(int i7) {
                copyOnWrite();
                ((CarlifeConnectStatistics) this.instance).setConsuccess(i7);
                return this;
            }

            public Builder setContime(int i7) {
                copyOnWrite();
                ((CarlifeConnectStatistics) this.instance).setContime(i7);
                return this;
            }

            public Builder setContotal(int i7) {
                copyOnWrite();
                ((CarlifeConnectStatistics) this.instance).setContotal(i7);
                return this;
            }

            public Builder setNerrorType(int i7, int i10) {
                copyOnWrite();
                ((CarlifeConnectStatistics) this.instance).setNerrorType(i7, i10);
                return this;
            }

            public Builder setNerrorcount(int i7) {
                copyOnWrite();
                ((CarlifeConnectStatistics) this.instance).setNerrorcount(i7);
                return this;
            }
        }

        static {
            CarlifeConnectStatistics carlifeConnectStatistics = new CarlifeConnectStatistics();
            DEFAULT_INSTANCE = carlifeConnectStatistics;
            j0.registerDefaultInstance(CarlifeConnectStatistics.class, carlifeConnectStatistics);
        }

        private CarlifeConnectStatistics() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllNerrorType(Iterable<? extends Integer> iterable) {
            ensureNerrorTypeIsMutable();
            c.addAll((Iterable) iterable, (List) this.nerrorType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNerrorType(int i7) {
            ensureNerrorTypeIsMutable();
            ((k0) this.nerrorType_).d(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfailed() {
            this.bitField0_ &= -5;
            this.confailed_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConsuccess() {
            this.bitField0_ &= -3;
            this.consuccess_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContime() {
            this.bitField0_ &= -9;
            this.contime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContotal() {
            this.bitField0_ &= -2;
            this.contotal_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNerrorType() {
            this.nerrorType_ = j0.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNerrorcount() {
            this.bitField0_ &= -17;
            this.nerrorcount_ = 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void ensureNerrorTypeIsMutable() {
            r0 r0Var = this.nerrorType_;
            if (((d) r0Var).f2729a) {
                return;
            }
            this.nerrorType_ = j0.mutableCopy(r0Var);
        }

        public static CarlifeConnectStatistics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeConnectStatistics carlifeConnectStatistics) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeConnectStatistics);
        }

        public static CarlifeConnectStatistics parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeConnectStatistics) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeConnectStatistics parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeConnectStatistics) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeConnectStatistics parseFrom(l lVar) {
            return (CarlifeConnectStatistics) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeConnectStatistics parseFrom(l lVar, y yVar) {
            return (CarlifeConnectStatistics) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeConnectStatistics parseFrom(p pVar) {
            return (CarlifeConnectStatistics) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeConnectStatistics parseFrom(p pVar, y yVar) {
            return (CarlifeConnectStatistics) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeConnectStatistics parseFrom(InputStream inputStream) {
            return (CarlifeConnectStatistics) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeConnectStatistics parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeConnectStatistics) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeConnectStatistics parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeConnectStatistics) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeConnectStatistics parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeConnectStatistics) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeConnectStatistics parseFrom(byte[] bArr) {
            return (CarlifeConnectStatistics) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeConnectStatistics parseFrom(byte[] bArr, y yVar) {
            return (CarlifeConnectStatistics) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfailed(int i7) {
            this.bitField0_ |= 4;
            this.confailed_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConsuccess(int i7) {
            this.bitField0_ |= 2;
            this.consuccess_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContime(int i7) {
            this.bitField0_ |= 8;
            this.contime_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContotal(int i7) {
            this.bitField0_ |= 1;
            this.contotal_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNerrorType(int i7, int i10) {
            ensureNerrorTypeIsMutable();
            ((k0) this.nerrorType_).n(i7, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNerrorcount(int i7) {
            this.bitField0_ |= 16;
            this.nerrorcount_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0005\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005ᔄ\u0004\u0006\u0016", new Object[]{"bitField0_", "contotal_", "consuccess_", "confailed_", "contime_", "nerrorcount_", "nerrorType_"});
                case 3:
                    return new CarlifeConnectStatistics();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeConnectStatistics.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
        public int getConfailed() {
            return this.confailed_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
        public int getConsuccess() {
            return this.consuccess_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
        public int getContime() {
            return this.contime_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
        public int getContotal() {
            return this.contotal_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
        public int getNerrorType(int i7) {
            return ((k0) this.nerrorType_).m(i7);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
        public int getNerrorTypeCount() {
            return ((k0) this.nerrorType_).size();
        }

        @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
        public List<Integer> getNerrorTypeList() {
            return this.nerrorType_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
        public int getNerrorcount() {
            return this.nerrorcount_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
        public boolean hasConfailed() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
        public boolean hasConsuccess() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
        public boolean hasContime() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
        public boolean hasContotal() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeConStatisticProto.CarlifeConnectStatisticsOrBuilder
        public boolean hasNerrorcount() {
            return (this.bitField0_ & 16) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeConnectStatisticsOrBuilder extends m1 {
        int getConfailed();

        int getConsuccess();

        int getContime();

        int getContotal();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getNerrorType(int i7);

        int getNerrorTypeCount();

        List<Integer> getNerrorTypeList();

        int getNerrorcount();

        boolean hasConfailed();

        boolean hasConsuccess();

        boolean hasContime();

        boolean hasContotal();

        boolean hasNerrorcount();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeConStatisticProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

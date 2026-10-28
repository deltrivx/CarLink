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
public final class CarlifeModuleStatusListProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeModuleStatusListProto$1, reason: invalid class name */
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
    public static final class CarlifeModuleStatusList extends j0 implements CarlifeModuleStatusListOrBuilder {
        public static final int CNT_FIELD_NUMBER = 1;
        private static final CarlifeModuleStatusList DEFAULT_INSTANCE;
        public static final int MODULESTATUS_FIELD_NUMBER = 2;
        private static volatile s1 PARSER;
        private int bitField0_;
        private int cnt_;
        private byte memoizedIsInitialized = 2;
        private t0 moduleStatus_ = j0.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeModuleStatusListOrBuilder {
            private Builder() {
                super(CarlifeModuleStatusList.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllModuleStatus(Iterable<? extends CarlifeModuleStatusProto.CarlifeModuleStatus> iterable) {
                copyOnWrite();
                ((CarlifeModuleStatusList) this.instance).addAllModuleStatus(iterable);
                return this;
            }

            public Builder addModuleStatus(int i7, CarlifeModuleStatusProto.CarlifeModuleStatus.Builder builder) {
                copyOnWrite();
                ((CarlifeModuleStatusList) this.instance).addModuleStatus(i7, (CarlifeModuleStatusProto.CarlifeModuleStatus) builder.m16build());
                return this;
            }

            public Builder addModuleStatus(int i7, CarlifeModuleStatusProto.CarlifeModuleStatus carlifeModuleStatus) {
                copyOnWrite();
                ((CarlifeModuleStatusList) this.instance).addModuleStatus(i7, carlifeModuleStatus);
                return this;
            }

            public Builder addModuleStatus(CarlifeModuleStatusProto.CarlifeModuleStatus.Builder builder) {
                copyOnWrite();
                ((CarlifeModuleStatusList) this.instance).addModuleStatus((CarlifeModuleStatusProto.CarlifeModuleStatus) builder.m16build());
                return this;
            }

            public Builder addModuleStatus(CarlifeModuleStatusProto.CarlifeModuleStatus carlifeModuleStatus) {
                copyOnWrite();
                ((CarlifeModuleStatusList) this.instance).addModuleStatus(carlifeModuleStatus);
                return this;
            }

            public Builder clearCnt() {
                copyOnWrite();
                ((CarlifeModuleStatusList) this.instance).clearCnt();
                return this;
            }

            public Builder clearModuleStatus() {
                copyOnWrite();
                ((CarlifeModuleStatusList) this.instance).clearModuleStatus();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeModuleStatusListProto.CarlifeModuleStatusListOrBuilder
            public int getCnt() {
                return ((CarlifeModuleStatusList) this.instance).getCnt();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeModuleStatusListProto.CarlifeModuleStatusListOrBuilder
            public CarlifeModuleStatusProto.CarlifeModuleStatus getModuleStatus(int i7) {
                return ((CarlifeModuleStatusList) this.instance).getModuleStatus(i7);
            }

            @Override // com.baidu.carlife.protobuf.CarlifeModuleStatusListProto.CarlifeModuleStatusListOrBuilder
            public int getModuleStatusCount() {
                return ((CarlifeModuleStatusList) this.instance).getModuleStatusCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeModuleStatusListProto.CarlifeModuleStatusListOrBuilder
            public List<CarlifeModuleStatusProto.CarlifeModuleStatus> getModuleStatusList() {
                return Collections.unmodifiableList(((CarlifeModuleStatusList) this.instance).getModuleStatusList());
            }

            @Override // com.baidu.carlife.protobuf.CarlifeModuleStatusListProto.CarlifeModuleStatusListOrBuilder
            public boolean hasCnt() {
                return ((CarlifeModuleStatusList) this.instance).hasCnt();
            }

            public Builder removeModuleStatus(int i7) {
                copyOnWrite();
                ((CarlifeModuleStatusList) this.instance).removeModuleStatus(i7);
                return this;
            }

            public Builder setCnt(int i7) {
                copyOnWrite();
                ((CarlifeModuleStatusList) this.instance).setCnt(i7);
                return this;
            }

            public Builder setModuleStatus(int i7, CarlifeModuleStatusProto.CarlifeModuleStatus.Builder builder) {
                copyOnWrite();
                ((CarlifeModuleStatusList) this.instance).setModuleStatus(i7, (CarlifeModuleStatusProto.CarlifeModuleStatus) builder.m16build());
                return this;
            }

            public Builder setModuleStatus(int i7, CarlifeModuleStatusProto.CarlifeModuleStatus carlifeModuleStatus) {
                copyOnWrite();
                ((CarlifeModuleStatusList) this.instance).setModuleStatus(i7, carlifeModuleStatus);
                return this;
            }
        }

        static {
            CarlifeModuleStatusList carlifeModuleStatusList = new CarlifeModuleStatusList();
            DEFAULT_INSTANCE = carlifeModuleStatusList;
            j0.registerDefaultInstance(CarlifeModuleStatusList.class, carlifeModuleStatusList);
        }

        private CarlifeModuleStatusList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllModuleStatus(Iterable<? extends CarlifeModuleStatusProto.CarlifeModuleStatus> iterable) {
            ensureModuleStatusIsMutable();
            c.addAll((Iterable) iterable, (List) this.moduleStatus_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addModuleStatus(int i7, CarlifeModuleStatusProto.CarlifeModuleStatus carlifeModuleStatus) {
            carlifeModuleStatus.getClass();
            ensureModuleStatusIsMutable();
            this.moduleStatus_.add(i7, carlifeModuleStatus);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addModuleStatus(CarlifeModuleStatusProto.CarlifeModuleStatus carlifeModuleStatus) {
            carlifeModuleStatus.getClass();
            ensureModuleStatusIsMutable();
            this.moduleStatus_.add(carlifeModuleStatus);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCnt() {
            this.bitField0_ &= -2;
            this.cnt_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModuleStatus() {
            this.moduleStatus_ = j0.emptyProtobufList();
        }

        private void ensureModuleStatusIsMutable() {
            t0 t0Var = this.moduleStatus_;
            if (((d) t0Var).f2729a) {
                return;
            }
            this.moduleStatus_ = j0.mutableCopy(t0Var);
        }

        public static CarlifeModuleStatusList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeModuleStatusList carlifeModuleStatusList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeModuleStatusList);
        }

        public static CarlifeModuleStatusList parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeModuleStatusList) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeModuleStatusList parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeModuleStatusList) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeModuleStatusList parseFrom(l lVar) {
            return (CarlifeModuleStatusList) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeModuleStatusList parseFrom(l lVar, y yVar) {
            return (CarlifeModuleStatusList) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeModuleStatusList parseFrom(p pVar) {
            return (CarlifeModuleStatusList) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeModuleStatusList parseFrom(p pVar, y yVar) {
            return (CarlifeModuleStatusList) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeModuleStatusList parseFrom(InputStream inputStream) {
            return (CarlifeModuleStatusList) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeModuleStatusList parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeModuleStatusList) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeModuleStatusList parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeModuleStatusList) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeModuleStatusList parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeModuleStatusList) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeModuleStatusList parseFrom(byte[] bArr) {
            return (CarlifeModuleStatusList) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeModuleStatusList parseFrom(byte[] bArr, y yVar) {
            return (CarlifeModuleStatusList) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeModuleStatus(int i7) {
            ensureModuleStatusIsMutable();
            this.moduleStatus_.remove(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCnt(int i7) {
            this.bitField0_ |= 1;
            this.cnt_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModuleStatus(int i7, CarlifeModuleStatusProto.CarlifeModuleStatus carlifeModuleStatus) {
            carlifeModuleStatus.getClass();
            ensureModuleStatusIsMutable();
            this.moduleStatus_.set(i7, carlifeModuleStatus);
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᔄ\u0000\u0002Л", new Object[]{"bitField0_", "cnt_", "moduleStatus_", CarlifeModuleStatusProto.CarlifeModuleStatus.class});
                case 3:
                    return new CarlifeModuleStatusList();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeModuleStatusList.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeModuleStatusListProto.CarlifeModuleStatusListOrBuilder
        public int getCnt() {
            return this.cnt_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeModuleStatusListProto.CarlifeModuleStatusListOrBuilder
        public CarlifeModuleStatusProto.CarlifeModuleStatus getModuleStatus(int i7) {
            return (CarlifeModuleStatusProto.CarlifeModuleStatus) this.moduleStatus_.get(i7);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeModuleStatusListProto.CarlifeModuleStatusListOrBuilder
        public int getModuleStatusCount() {
            return this.moduleStatus_.size();
        }

        @Override // com.baidu.carlife.protobuf.CarlifeModuleStatusListProto.CarlifeModuleStatusListOrBuilder
        public List<CarlifeModuleStatusProto.CarlifeModuleStatus> getModuleStatusList() {
            return this.moduleStatus_;
        }

        public CarlifeModuleStatusProto.CarlifeModuleStatusOrBuilder getModuleStatusOrBuilder(int i7) {
            return (CarlifeModuleStatusProto.CarlifeModuleStatusOrBuilder) this.moduleStatus_.get(i7);
        }

        public List<? extends CarlifeModuleStatusProto.CarlifeModuleStatusOrBuilder> getModuleStatusOrBuilderList() {
            return this.moduleStatus_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeModuleStatusListProto.CarlifeModuleStatusListOrBuilder
        public boolean hasCnt() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeModuleStatusListOrBuilder extends m1 {
        int getCnt();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        CarlifeModuleStatusProto.CarlifeModuleStatus getModuleStatus(int i7);

        int getModuleStatusCount();

        List<CarlifeModuleStatusProto.CarlifeModuleStatus> getModuleStatusList();

        boolean hasCnt();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeModuleStatusListProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

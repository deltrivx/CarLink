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
public final class CarlifeModuleStatusProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeModuleStatusProto$1, reason: invalid class name */
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
    public static final class CarlifeModuleStatus extends j0 implements CarlifeModuleStatusOrBuilder {
        private static final CarlifeModuleStatus DEFAULT_INSTANCE;
        public static final int MODULEID_FIELD_NUMBER = 1;
        private static volatile s1 PARSER = null;
        public static final int STATUSID_FIELD_NUMBER = 2;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int moduleID_;
        private int statusID_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeModuleStatusOrBuilder {
            private Builder() {
                super(CarlifeModuleStatus.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearModuleID() {
                copyOnWrite();
                ((CarlifeModuleStatus) this.instance).clearModuleID();
                return this;
            }

            public Builder clearStatusID() {
                copyOnWrite();
                ((CarlifeModuleStatus) this.instance).clearStatusID();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeModuleStatusProto.CarlifeModuleStatusOrBuilder
            public int getModuleID() {
                return ((CarlifeModuleStatus) this.instance).getModuleID();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeModuleStatusProto.CarlifeModuleStatusOrBuilder
            public int getStatusID() {
                return ((CarlifeModuleStatus) this.instance).getStatusID();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeModuleStatusProto.CarlifeModuleStatusOrBuilder
            public boolean hasModuleID() {
                return ((CarlifeModuleStatus) this.instance).hasModuleID();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeModuleStatusProto.CarlifeModuleStatusOrBuilder
            public boolean hasStatusID() {
                return ((CarlifeModuleStatus) this.instance).hasStatusID();
            }

            public Builder setModuleID(int i7) {
                copyOnWrite();
                ((CarlifeModuleStatus) this.instance).setModuleID(i7);
                return this;
            }

            public Builder setStatusID(int i7) {
                copyOnWrite();
                ((CarlifeModuleStatus) this.instance).setStatusID(i7);
                return this;
            }
        }

        static {
            CarlifeModuleStatus carlifeModuleStatus = new CarlifeModuleStatus();
            DEFAULT_INSTANCE = carlifeModuleStatus;
            j0.registerDefaultInstance(CarlifeModuleStatus.class, carlifeModuleStatus);
        }

        private CarlifeModuleStatus() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModuleID() {
            this.bitField0_ &= -2;
            this.moduleID_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatusID() {
            this.bitField0_ &= -3;
            this.statusID_ = 0;
        }

        public static CarlifeModuleStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeModuleStatus carlifeModuleStatus) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeModuleStatus);
        }

        public static CarlifeModuleStatus parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeModuleStatus) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeModuleStatus parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeModuleStatus) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeModuleStatus parseFrom(l lVar) {
            return (CarlifeModuleStatus) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeModuleStatus parseFrom(l lVar, y yVar) {
            return (CarlifeModuleStatus) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeModuleStatus parseFrom(p pVar) {
            return (CarlifeModuleStatus) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeModuleStatus parseFrom(p pVar, y yVar) {
            return (CarlifeModuleStatus) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeModuleStatus parseFrom(InputStream inputStream) {
            return (CarlifeModuleStatus) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeModuleStatus parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeModuleStatus) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeModuleStatus parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeModuleStatus) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeModuleStatus parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeModuleStatus) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeModuleStatus parseFrom(byte[] bArr) {
            return (CarlifeModuleStatus) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeModuleStatus parseFrom(byte[] bArr, y yVar) {
            return (CarlifeModuleStatus) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModuleID(int i7) {
            this.bitField0_ |= 1;
            this.moduleID_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusID(int i7) {
            this.bitField0_ |= 2;
            this.statusID_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"bitField0_", "moduleID_", "statusID_"});
                case 3:
                    return new CarlifeModuleStatus();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeModuleStatus.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeModuleStatusProto.CarlifeModuleStatusOrBuilder
        public int getModuleID() {
            return this.moduleID_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeModuleStatusProto.CarlifeModuleStatusOrBuilder
        public int getStatusID() {
            return this.statusID_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeModuleStatusProto.CarlifeModuleStatusOrBuilder
        public boolean hasModuleID() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeModuleStatusProto.CarlifeModuleStatusOrBuilder
        public boolean hasStatusID() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeModuleStatusOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getModuleID();

        int getStatusID();

        boolean hasModuleID();

        boolean hasStatusID();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeModuleStatusProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

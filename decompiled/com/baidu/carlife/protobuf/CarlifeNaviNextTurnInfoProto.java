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
public final class CarlifeNaviNextTurnInfoProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto$1, reason: invalid class name */
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
    public static final class CarlifeNaviNextTurnInfo extends j0 implements CarlifeNaviNextTurnInfoOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 1;
        private static final CarlifeNaviNextTurnInfo DEFAULT_INSTANCE;
        public static final int NEXTTURN_FIELD_NUMBER = 2;
        private static volatile s1 PARSER = null;
        public static final int REMAINDISTANCE_FIELD_NUMBER = 5;
        public static final int ROADNAME_FIELD_NUMBER = 3;
        public static final int TOTALDISTANCE_FIELD_NUMBER = 4;
        public static final int TURNICONDATA_FIELD_NUMBER = 6;
        private int action_;
        private int bitField0_;
        private int nextTurn_;
        private int remainDistance_;
        private int totalDistance_;
        private byte memoizedIsInitialized = 2;
        private String roadName_ = "";
        private l turnIconData_ = l.f2785b;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeNaviNextTurnInfoOrBuilder {
            private Builder() {
                super(CarlifeNaviNextTurnInfo.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAction() {
                copyOnWrite();
                ((CarlifeNaviNextTurnInfo) this.instance).clearAction();
                return this;
            }

            public Builder clearNextTurn() {
                copyOnWrite();
                ((CarlifeNaviNextTurnInfo) this.instance).clearNextTurn();
                return this;
            }

            public Builder clearRemainDistance() {
                copyOnWrite();
                ((CarlifeNaviNextTurnInfo) this.instance).clearRemainDistance();
                return this;
            }

            public Builder clearRoadName() {
                copyOnWrite();
                ((CarlifeNaviNextTurnInfo) this.instance).clearRoadName();
                return this;
            }

            public Builder clearTotalDistance() {
                copyOnWrite();
                ((CarlifeNaviNextTurnInfo) this.instance).clearTotalDistance();
                return this;
            }

            public Builder clearTurnIconData() {
                copyOnWrite();
                ((CarlifeNaviNextTurnInfo) this.instance).clearTurnIconData();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
            public int getAction() {
                return ((CarlifeNaviNextTurnInfo) this.instance).getAction();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
            public int getNextTurn() {
                return ((CarlifeNaviNextTurnInfo) this.instance).getNextTurn();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
            public int getRemainDistance() {
                return ((CarlifeNaviNextTurnInfo) this.instance).getRemainDistance();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
            public String getRoadName() {
                return ((CarlifeNaviNextTurnInfo) this.instance).getRoadName();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
            public l getRoadNameBytes() {
                return ((CarlifeNaviNextTurnInfo) this.instance).getRoadNameBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
            public int getTotalDistance() {
                return ((CarlifeNaviNextTurnInfo) this.instance).getTotalDistance();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
            public l getTurnIconData() {
                return ((CarlifeNaviNextTurnInfo) this.instance).getTurnIconData();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
            public boolean hasAction() {
                return ((CarlifeNaviNextTurnInfo) this.instance).hasAction();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
            public boolean hasNextTurn() {
                return ((CarlifeNaviNextTurnInfo) this.instance).hasNextTurn();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
            public boolean hasRemainDistance() {
                return ((CarlifeNaviNextTurnInfo) this.instance).hasRemainDistance();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
            public boolean hasRoadName() {
                return ((CarlifeNaviNextTurnInfo) this.instance).hasRoadName();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
            public boolean hasTotalDistance() {
                return ((CarlifeNaviNextTurnInfo) this.instance).hasTotalDistance();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
            public boolean hasTurnIconData() {
                return ((CarlifeNaviNextTurnInfo) this.instance).hasTurnIconData();
            }

            public Builder setAction(int i7) {
                copyOnWrite();
                ((CarlifeNaviNextTurnInfo) this.instance).setAction(i7);
                return this;
            }

            public Builder setNextTurn(int i7) {
                copyOnWrite();
                ((CarlifeNaviNextTurnInfo) this.instance).setNextTurn(i7);
                return this;
            }

            public Builder setRemainDistance(int i7) {
                copyOnWrite();
                ((CarlifeNaviNextTurnInfo) this.instance).setRemainDistance(i7);
                return this;
            }

            public Builder setRoadName(String str) {
                copyOnWrite();
                ((CarlifeNaviNextTurnInfo) this.instance).setRoadName(str);
                return this;
            }

            public Builder setRoadNameBytes(l lVar) {
                copyOnWrite();
                ((CarlifeNaviNextTurnInfo) this.instance).setRoadNameBytes(lVar);
                return this;
            }

            public Builder setTotalDistance(int i7) {
                copyOnWrite();
                ((CarlifeNaviNextTurnInfo) this.instance).setTotalDistance(i7);
                return this;
            }

            public Builder setTurnIconData(l lVar) {
                copyOnWrite();
                ((CarlifeNaviNextTurnInfo) this.instance).setTurnIconData(lVar);
                return this;
            }
        }

        static {
            CarlifeNaviNextTurnInfo carlifeNaviNextTurnInfo = new CarlifeNaviNextTurnInfo();
            DEFAULT_INSTANCE = carlifeNaviNextTurnInfo;
            j0.registerDefaultInstance(CarlifeNaviNextTurnInfo.class, carlifeNaviNextTurnInfo);
        }

        private CarlifeNaviNextTurnInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAction() {
            this.bitField0_ &= -2;
            this.action_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNextTurn() {
            this.bitField0_ &= -3;
            this.nextTurn_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemainDistance() {
            this.bitField0_ &= -17;
            this.remainDistance_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoadName() {
            this.bitField0_ &= -5;
            this.roadName_ = getDefaultInstance().getRoadName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalDistance() {
            this.bitField0_ &= -9;
            this.totalDistance_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTurnIconData() {
            this.bitField0_ &= -33;
            this.turnIconData_ = getDefaultInstance().getTurnIconData();
        }

        public static CarlifeNaviNextTurnInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeNaviNextTurnInfo carlifeNaviNextTurnInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeNaviNextTurnInfo);
        }

        public static CarlifeNaviNextTurnInfo parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeNaviNextTurnInfo) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeNaviNextTurnInfo parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeNaviNextTurnInfo) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeNaviNextTurnInfo parseFrom(l lVar) {
            return (CarlifeNaviNextTurnInfo) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeNaviNextTurnInfo parseFrom(l lVar, y yVar) {
            return (CarlifeNaviNextTurnInfo) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeNaviNextTurnInfo parseFrom(p pVar) {
            return (CarlifeNaviNextTurnInfo) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeNaviNextTurnInfo parseFrom(p pVar, y yVar) {
            return (CarlifeNaviNextTurnInfo) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeNaviNextTurnInfo parseFrom(InputStream inputStream) {
            return (CarlifeNaviNextTurnInfo) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeNaviNextTurnInfo parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeNaviNextTurnInfo) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeNaviNextTurnInfo parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeNaviNextTurnInfo) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeNaviNextTurnInfo parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeNaviNextTurnInfo) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeNaviNextTurnInfo parseFrom(byte[] bArr) {
            return (CarlifeNaviNextTurnInfo) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeNaviNextTurnInfo parseFrom(byte[] bArr, y yVar) {
            return (CarlifeNaviNextTurnInfo) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAction(int i7) {
            this.bitField0_ |= 1;
            this.action_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNextTurn(int i7) {
            this.bitField0_ |= 2;
            this.nextTurn_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemainDistance(int i7) {
            this.bitField0_ |= 16;
            this.remainDistance_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoadName(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.roadName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoadNameBytes(l lVar) {
            this.roadName_ = lVar.u();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalDistance(int i7) {
            this.bitField0_ |= 8;
            this.totalDistance_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTurnIconData(l lVar) {
            lVar.getClass();
            this.bitField0_ |= 32;
            this.turnIconData_ = lVar;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔈ\u0002\u0004ᔄ\u0003\u0005ᔄ\u0004\u0006ᔊ\u0005", new Object[]{"bitField0_", "action_", "nextTurn_", "roadName_", "totalDistance_", "remainDistance_", "turnIconData_"});
                case 3:
                    return new CarlifeNaviNextTurnInfo();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeNaviNextTurnInfo.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
        public int getAction() {
            return this.action_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
        public int getNextTurn() {
            return this.nextTurn_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
        public int getRemainDistance() {
            return this.remainDistance_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
        public String getRoadName() {
            return this.roadName_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
        public l getRoadNameBytes() {
            return l.m(this.roadName_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
        public int getTotalDistance() {
            return this.totalDistance_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
        public l getTurnIconData() {
            return this.turnIconData_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
        public boolean hasAction() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
        public boolean hasNextTurn() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
        public boolean hasRemainDistance() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
        public boolean hasRoadName() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
        public boolean hasTotalDistance() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfoOrBuilder
        public boolean hasTurnIconData() {
            return (this.bitField0_ & 32) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeNaviNextTurnInfoOrBuilder extends m1 {
        int getAction();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getNextTurn();

        int getRemainDistance();

        String getRoadName();

        l getRoadNameBytes();

        int getTotalDistance();

        l getTurnIconData();

        boolean hasAction();

        boolean hasNextTurn();

        boolean hasRemainDistance();

        boolean hasRoadName();

        boolean hasTotalDistance();

        boolean hasTurnIconData();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeNaviNextTurnInfoProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

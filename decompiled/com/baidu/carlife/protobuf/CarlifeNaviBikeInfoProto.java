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
public final class CarlifeNaviBikeInfoProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto$1, reason: invalid class name */
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
    public static final class CarlifeNaviBikeInfo extends j0 implements CarlifeNaviBikeInfoOrBuilder {
        private static final CarlifeNaviBikeInfo DEFAULT_INSTANCE;
        public static final int ICONDATA_FIELD_NUMBER = 1;
        public static final int ICONFORMAT_FIELD_NUMBER = 3;
        public static final int ICONLENGTH_FIELD_NUMBER = 2;
        public static final int ICONNAME_FIELD_NUMBER = 4;
        private static volatile s1 PARSER = null;
        public static final int REMAINDISTANCEDESC_FIELD_NUMBER = 7;
        public static final int REMAINTIMEDESC_FIELD_NUMBER = 8;
        public static final int SPEED_FIELD_NUMBER = 9;
        public static final int TIMESTAMP_FIELD_NUMBER = 10;
        public static final int TURNINFO1_FIELD_NUMBER = 5;
        public static final int TURNINFO2_FIELD_NUMBER = 6;
        private int bitField0_;
        private int iconFormat_;
        private int iconLength_;
        private int speed_;
        private long timeStamp_;
        private byte memoizedIsInitialized = 2;
        private l iconData_ = l.f2785b;
        private String iconName_ = "";
        private String turnInfo1_ = "";
        private String turnInfo2_ = "";
        private String remainDistanceDesc_ = "";
        private String remainTimeDesc_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeNaviBikeInfoOrBuilder {
            private Builder() {
                super(CarlifeNaviBikeInfo.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIconData() {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).clearIconData();
                return this;
            }

            public Builder clearIconFormat() {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).clearIconFormat();
                return this;
            }

            public Builder clearIconLength() {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).clearIconLength();
                return this;
            }

            public Builder clearIconName() {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).clearIconName();
                return this;
            }

            public Builder clearRemainDistanceDesc() {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).clearRemainDistanceDesc();
                return this;
            }

            public Builder clearRemainTimeDesc() {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).clearRemainTimeDesc();
                return this;
            }

            public Builder clearSpeed() {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).clearSpeed();
                return this;
            }

            public Builder clearTimeStamp() {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).clearTimeStamp();
                return this;
            }

            public Builder clearTurnInfo1() {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).clearTurnInfo1();
                return this;
            }

            public Builder clearTurnInfo2() {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).clearTurnInfo2();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public l getIconData() {
                return ((CarlifeNaviBikeInfo) this.instance).getIconData();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public int getIconFormat() {
                return ((CarlifeNaviBikeInfo) this.instance).getIconFormat();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public int getIconLength() {
                return ((CarlifeNaviBikeInfo) this.instance).getIconLength();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public String getIconName() {
                return ((CarlifeNaviBikeInfo) this.instance).getIconName();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public l getIconNameBytes() {
                return ((CarlifeNaviBikeInfo) this.instance).getIconNameBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public String getRemainDistanceDesc() {
                return ((CarlifeNaviBikeInfo) this.instance).getRemainDistanceDesc();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public l getRemainDistanceDescBytes() {
                return ((CarlifeNaviBikeInfo) this.instance).getRemainDistanceDescBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public String getRemainTimeDesc() {
                return ((CarlifeNaviBikeInfo) this.instance).getRemainTimeDesc();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public l getRemainTimeDescBytes() {
                return ((CarlifeNaviBikeInfo) this.instance).getRemainTimeDescBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public int getSpeed() {
                return ((CarlifeNaviBikeInfo) this.instance).getSpeed();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public long getTimeStamp() {
                return ((CarlifeNaviBikeInfo) this.instance).getTimeStamp();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public String getTurnInfo1() {
                return ((CarlifeNaviBikeInfo) this.instance).getTurnInfo1();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public l getTurnInfo1Bytes() {
                return ((CarlifeNaviBikeInfo) this.instance).getTurnInfo1Bytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public String getTurnInfo2() {
                return ((CarlifeNaviBikeInfo) this.instance).getTurnInfo2();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public l getTurnInfo2Bytes() {
                return ((CarlifeNaviBikeInfo) this.instance).getTurnInfo2Bytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public boolean hasIconData() {
                return ((CarlifeNaviBikeInfo) this.instance).hasIconData();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public boolean hasIconFormat() {
                return ((CarlifeNaviBikeInfo) this.instance).hasIconFormat();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public boolean hasIconLength() {
                return ((CarlifeNaviBikeInfo) this.instance).hasIconLength();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public boolean hasIconName() {
                return ((CarlifeNaviBikeInfo) this.instance).hasIconName();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public boolean hasRemainDistanceDesc() {
                return ((CarlifeNaviBikeInfo) this.instance).hasRemainDistanceDesc();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public boolean hasRemainTimeDesc() {
                return ((CarlifeNaviBikeInfo) this.instance).hasRemainTimeDesc();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public boolean hasSpeed() {
                return ((CarlifeNaviBikeInfo) this.instance).hasSpeed();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public boolean hasTimeStamp() {
                return ((CarlifeNaviBikeInfo) this.instance).hasTimeStamp();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public boolean hasTurnInfo1() {
                return ((CarlifeNaviBikeInfo) this.instance).hasTurnInfo1();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
            public boolean hasTurnInfo2() {
                return ((CarlifeNaviBikeInfo) this.instance).hasTurnInfo2();
            }

            public Builder setIconData(l lVar) {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).setIconData(lVar);
                return this;
            }

            public Builder setIconFormat(int i7) {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).setIconFormat(i7);
                return this;
            }

            public Builder setIconLength(int i7) {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).setIconLength(i7);
                return this;
            }

            public Builder setIconName(String str) {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).setIconName(str);
                return this;
            }

            public Builder setIconNameBytes(l lVar) {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).setIconNameBytes(lVar);
                return this;
            }

            public Builder setRemainDistanceDesc(String str) {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).setRemainDistanceDesc(str);
                return this;
            }

            public Builder setRemainDistanceDescBytes(l lVar) {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).setRemainDistanceDescBytes(lVar);
                return this;
            }

            public Builder setRemainTimeDesc(String str) {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).setRemainTimeDesc(str);
                return this;
            }

            public Builder setRemainTimeDescBytes(l lVar) {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).setRemainTimeDescBytes(lVar);
                return this;
            }

            public Builder setSpeed(int i7) {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).setSpeed(i7);
                return this;
            }

            public Builder setTimeStamp(long j5) {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).setTimeStamp(j5);
                return this;
            }

            public Builder setTurnInfo1(String str) {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).setTurnInfo1(str);
                return this;
            }

            public Builder setTurnInfo1Bytes(l lVar) {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).setTurnInfo1Bytes(lVar);
                return this;
            }

            public Builder setTurnInfo2(String str) {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).setTurnInfo2(str);
                return this;
            }

            public Builder setTurnInfo2Bytes(l lVar) {
                copyOnWrite();
                ((CarlifeNaviBikeInfo) this.instance).setTurnInfo2Bytes(lVar);
                return this;
            }
        }

        static {
            CarlifeNaviBikeInfo carlifeNaviBikeInfo = new CarlifeNaviBikeInfo();
            DEFAULT_INSTANCE = carlifeNaviBikeInfo;
            j0.registerDefaultInstance(CarlifeNaviBikeInfo.class, carlifeNaviBikeInfo);
        }

        private CarlifeNaviBikeInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIconData() {
            this.bitField0_ &= -2;
            this.iconData_ = getDefaultInstance().getIconData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIconFormat() {
            this.bitField0_ &= -5;
            this.iconFormat_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIconLength() {
            this.bitField0_ &= -3;
            this.iconLength_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIconName() {
            this.bitField0_ &= -9;
            this.iconName_ = getDefaultInstance().getIconName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemainDistanceDesc() {
            this.bitField0_ &= -65;
            this.remainDistanceDesc_ = getDefaultInstance().getRemainDistanceDesc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemainTimeDesc() {
            this.bitField0_ &= -129;
            this.remainTimeDesc_ = getDefaultInstance().getRemainTimeDesc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpeed() {
            this.bitField0_ &= -257;
            this.speed_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeStamp() {
            this.bitField0_ &= -513;
            this.timeStamp_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTurnInfo1() {
            this.bitField0_ &= -17;
            this.turnInfo1_ = getDefaultInstance().getTurnInfo1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTurnInfo2() {
            this.bitField0_ &= -33;
            this.turnInfo2_ = getDefaultInstance().getTurnInfo2();
        }

        public static CarlifeNaviBikeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeNaviBikeInfo carlifeNaviBikeInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeNaviBikeInfo);
        }

        public static CarlifeNaviBikeInfo parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeNaviBikeInfo) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeNaviBikeInfo parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeNaviBikeInfo) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeNaviBikeInfo parseFrom(l lVar) {
            return (CarlifeNaviBikeInfo) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeNaviBikeInfo parseFrom(l lVar, y yVar) {
            return (CarlifeNaviBikeInfo) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeNaviBikeInfo parseFrom(p pVar) {
            return (CarlifeNaviBikeInfo) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeNaviBikeInfo parseFrom(p pVar, y yVar) {
            return (CarlifeNaviBikeInfo) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeNaviBikeInfo parseFrom(InputStream inputStream) {
            return (CarlifeNaviBikeInfo) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeNaviBikeInfo parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeNaviBikeInfo) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeNaviBikeInfo parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeNaviBikeInfo) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeNaviBikeInfo parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeNaviBikeInfo) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeNaviBikeInfo parseFrom(byte[] bArr) {
            return (CarlifeNaviBikeInfo) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeNaviBikeInfo parseFrom(byte[] bArr, y yVar) {
            return (CarlifeNaviBikeInfo) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconData(l lVar) {
            lVar.getClass();
            this.bitField0_ |= 1;
            this.iconData_ = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconFormat(int i7) {
            this.bitField0_ |= 4;
            this.iconFormat_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconLength(int i7) {
            this.bitField0_ |= 2;
            this.iconLength_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconName(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.iconName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIconNameBytes(l lVar) {
            this.iconName_ = lVar.u();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemainDistanceDesc(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.remainDistanceDesc_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemainDistanceDescBytes(l lVar) {
            this.remainDistanceDesc_ = lVar.u();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemainTimeDesc(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.remainTimeDesc_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemainTimeDescBytes(l lVar) {
            this.remainTimeDesc_ = lVar.u();
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpeed(int i7) {
            this.bitField0_ |= 256;
            this.speed_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeStamp(long j5) {
            this.bitField0_ |= 512;
            this.timeStamp_ = j5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTurnInfo1(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.turnInfo1_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTurnInfo1Bytes(l lVar) {
            this.turnInfo1_ = lVar.u();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTurnInfo2(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.turnInfo2_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTurnInfo2Bytes(l lVar) {
            this.turnInfo2_ = lVar.u();
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0002\u0001ᔊ\u0000\u0002ᔄ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tင\b\nဂ\t", new Object[]{"bitField0_", "iconData_", "iconLength_", "iconFormat_", "iconName_", "turnInfo1_", "turnInfo2_", "remainDistanceDesc_", "remainTimeDesc_", "speed_", "timeStamp_"});
                case 3:
                    return new CarlifeNaviBikeInfo();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeNaviBikeInfo.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public l getIconData() {
            return this.iconData_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public int getIconFormat() {
            return this.iconFormat_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public int getIconLength() {
            return this.iconLength_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public String getIconName() {
            return this.iconName_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public l getIconNameBytes() {
            return l.m(this.iconName_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public String getRemainDistanceDesc() {
            return this.remainDistanceDesc_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public l getRemainDistanceDescBytes() {
            return l.m(this.remainDistanceDesc_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public String getRemainTimeDesc() {
            return this.remainTimeDesc_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public l getRemainTimeDescBytes() {
            return l.m(this.remainTimeDesc_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public int getSpeed() {
            return this.speed_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public long getTimeStamp() {
            return this.timeStamp_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public String getTurnInfo1() {
            return this.turnInfo1_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public l getTurnInfo1Bytes() {
            return l.m(this.turnInfo1_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public String getTurnInfo2() {
            return this.turnInfo2_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public l getTurnInfo2Bytes() {
            return l.m(this.turnInfo2_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public boolean hasIconData() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public boolean hasIconFormat() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public boolean hasIconLength() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public boolean hasIconName() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public boolean hasRemainDistanceDesc() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public boolean hasRemainTimeDesc() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public boolean hasSpeed() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public boolean hasTimeStamp() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public boolean hasTurnInfo1() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeNaviBikeInfoProto.CarlifeNaviBikeInfoOrBuilder
        public boolean hasTurnInfo2() {
            return (this.bitField0_ & 32) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeNaviBikeInfoOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        l getIconData();

        int getIconFormat();

        int getIconLength();

        String getIconName();

        l getIconNameBytes();

        String getRemainDistanceDesc();

        l getRemainDistanceDescBytes();

        String getRemainTimeDesc();

        l getRemainTimeDescBytes();

        int getSpeed();

        long getTimeStamp();

        String getTurnInfo1();

        l getTurnInfo1Bytes();

        String getTurnInfo2();

        l getTurnInfo2Bytes();

        boolean hasIconData();

        boolean hasIconFormat();

        boolean hasIconLength();

        boolean hasIconName();

        boolean hasRemainDistanceDesc();

        boolean hasRemainTimeDesc();

        boolean hasSpeed();

        boolean hasTimeStamp();

        boolean hasTurnInfo1();

        boolean hasTurnInfo2();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeNaviBikeInfoProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

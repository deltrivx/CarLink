package com.baidu.carlife.protobuf;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
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
public final class CarlifeCarGpsProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeCarGpsProto$1, reason: invalid class name */
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
    public static final class CarlifeCarGps extends j0 implements CarlifeCarGpsOrBuilder {
        public static final int ANTENNASTATE_FIELD_NUMBER = 1;
        public static final int DAY_FIELD_NUMBER = 10;
        private static final CarlifeCarGps DEFAULT_INSTANCE;
        public static final int EASTSPEED_FIELD_NUMBER = 23;
        public static final int FIX_FIELD_NUMBER = 14;
        public static final int HDOP_FIELD_NUMBER = 15;
        public static final int HEADING_FIELD_NUMBER = 7;
        public static final int HEIGHT_FIELD_NUMBER = 5;
        public static final int HORPOSERROR_FIELD_NUMBER = 20;
        public static final int HRS_FIELD_NUMBER = 11;
        public static final int LATITUDE_FIELD_NUMBER = 3;
        public static final int LONGITUDE_FIELD_NUMBER = 4;
        public static final int MIN_FIELD_NUMBER = 12;
        public static final int MONTH_FIELD_NUMBER = 9;
        public static final int NORTHSPEED_FIELD_NUMBER = 22;
        private static volatile s1 PARSER = null;
        public static final int PDOP_FIELD_NUMBER = 16;
        public static final int SATSUSED_FIELD_NUMBER = 18;
        public static final int SATSVISIBLE_FIELD_NUMBER = 19;
        public static final int SEC_FIELD_NUMBER = 13;
        public static final int SIGNALQUALITY_FIELD_NUMBER = 2;
        public static final int SPEED_FIELD_NUMBER = 6;
        public static final int TIMESTAMP_FIELD_NUMBER = 25;
        public static final int VDOP_FIELD_NUMBER = 17;
        public static final int VERTPOSERROR_FIELD_NUMBER = 21;
        public static final int VERTSPEED_FIELD_NUMBER = 24;
        public static final int YEAR_FIELD_NUMBER = 8;
        private int antennaState_;
        private int bitField0_;
        private int day_;
        private int eastSpeed_;
        private int fix_;
        private int hdop_;
        private int heading_;
        private int height_;
        private int horPosError_;
        private int hrs_;
        private int latitude_;
        private int longitude_;
        private byte memoizedIsInitialized = 2;
        private int min_;
        private int month_;
        private int northSpeed_;
        private int pdop_;
        private int satsUsed_;
        private int satsVisible_;
        private int sec_;
        private int signalQuality_;
        private int speed_;
        private long timeStamp_;
        private int vdop_;
        private int vertPosError_;
        private int vertSpeed_;
        private int year_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeCarGpsOrBuilder {
            private Builder() {
                super(CarlifeCarGps.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAntennaState() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearAntennaState();
                return this;
            }

            public Builder clearDay() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearDay();
                return this;
            }

            public Builder clearEastSpeed() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearEastSpeed();
                return this;
            }

            public Builder clearFix() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearFix();
                return this;
            }

            public Builder clearHdop() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearHdop();
                return this;
            }

            public Builder clearHeading() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearHeading();
                return this;
            }

            public Builder clearHeight() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearHeight();
                return this;
            }

            public Builder clearHorPosError() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearHorPosError();
                return this;
            }

            public Builder clearHrs() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearHrs();
                return this;
            }

            public Builder clearLatitude() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearLatitude();
                return this;
            }

            public Builder clearLongitude() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearLongitude();
                return this;
            }

            public Builder clearMin() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearMin();
                return this;
            }

            public Builder clearMonth() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearMonth();
                return this;
            }

            public Builder clearNorthSpeed() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearNorthSpeed();
                return this;
            }

            public Builder clearPdop() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearPdop();
                return this;
            }

            public Builder clearSatsUsed() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearSatsUsed();
                return this;
            }

            public Builder clearSatsVisible() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearSatsVisible();
                return this;
            }

            public Builder clearSec() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearSec();
                return this;
            }

            public Builder clearSignalQuality() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearSignalQuality();
                return this;
            }

            public Builder clearSpeed() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearSpeed();
                return this;
            }

            public Builder clearTimeStamp() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearTimeStamp();
                return this;
            }

            public Builder clearVdop() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearVdop();
                return this;
            }

            public Builder clearVertPosError() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearVertPosError();
                return this;
            }

            public Builder clearVertSpeed() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearVertSpeed();
                return this;
            }

            public Builder clearYear() {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).clearYear();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getAntennaState() {
                return ((CarlifeCarGps) this.instance).getAntennaState();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getDay() {
                return ((CarlifeCarGps) this.instance).getDay();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getEastSpeed() {
                return ((CarlifeCarGps) this.instance).getEastSpeed();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getFix() {
                return ((CarlifeCarGps) this.instance).getFix();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getHdop() {
                return ((CarlifeCarGps) this.instance).getHdop();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getHeading() {
                return ((CarlifeCarGps) this.instance).getHeading();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getHeight() {
                return ((CarlifeCarGps) this.instance).getHeight();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getHorPosError() {
                return ((CarlifeCarGps) this.instance).getHorPosError();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getHrs() {
                return ((CarlifeCarGps) this.instance).getHrs();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getLatitude() {
                return ((CarlifeCarGps) this.instance).getLatitude();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getLongitude() {
                return ((CarlifeCarGps) this.instance).getLongitude();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getMin() {
                return ((CarlifeCarGps) this.instance).getMin();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getMonth() {
                return ((CarlifeCarGps) this.instance).getMonth();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getNorthSpeed() {
                return ((CarlifeCarGps) this.instance).getNorthSpeed();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getPdop() {
                return ((CarlifeCarGps) this.instance).getPdop();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getSatsUsed() {
                return ((CarlifeCarGps) this.instance).getSatsUsed();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getSatsVisible() {
                return ((CarlifeCarGps) this.instance).getSatsVisible();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getSec() {
                return ((CarlifeCarGps) this.instance).getSec();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getSignalQuality() {
                return ((CarlifeCarGps) this.instance).getSignalQuality();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getSpeed() {
                return ((CarlifeCarGps) this.instance).getSpeed();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public long getTimeStamp() {
                return ((CarlifeCarGps) this.instance).getTimeStamp();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getVdop() {
                return ((CarlifeCarGps) this.instance).getVdop();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getVertPosError() {
                return ((CarlifeCarGps) this.instance).getVertPosError();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getVertSpeed() {
                return ((CarlifeCarGps) this.instance).getVertSpeed();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public int getYear() {
                return ((CarlifeCarGps) this.instance).getYear();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasAntennaState() {
                return ((CarlifeCarGps) this.instance).hasAntennaState();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasDay() {
                return ((CarlifeCarGps) this.instance).hasDay();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasEastSpeed() {
                return ((CarlifeCarGps) this.instance).hasEastSpeed();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasFix() {
                return ((CarlifeCarGps) this.instance).hasFix();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasHdop() {
                return ((CarlifeCarGps) this.instance).hasHdop();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasHeading() {
                return ((CarlifeCarGps) this.instance).hasHeading();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasHeight() {
                return ((CarlifeCarGps) this.instance).hasHeight();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasHorPosError() {
                return ((CarlifeCarGps) this.instance).hasHorPosError();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasHrs() {
                return ((CarlifeCarGps) this.instance).hasHrs();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasLatitude() {
                return ((CarlifeCarGps) this.instance).hasLatitude();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasLongitude() {
                return ((CarlifeCarGps) this.instance).hasLongitude();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasMin() {
                return ((CarlifeCarGps) this.instance).hasMin();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasMonth() {
                return ((CarlifeCarGps) this.instance).hasMonth();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasNorthSpeed() {
                return ((CarlifeCarGps) this.instance).hasNorthSpeed();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasPdop() {
                return ((CarlifeCarGps) this.instance).hasPdop();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasSatsUsed() {
                return ((CarlifeCarGps) this.instance).hasSatsUsed();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasSatsVisible() {
                return ((CarlifeCarGps) this.instance).hasSatsVisible();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasSec() {
                return ((CarlifeCarGps) this.instance).hasSec();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasSignalQuality() {
                return ((CarlifeCarGps) this.instance).hasSignalQuality();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasSpeed() {
                return ((CarlifeCarGps) this.instance).hasSpeed();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasTimeStamp() {
                return ((CarlifeCarGps) this.instance).hasTimeStamp();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasVdop() {
                return ((CarlifeCarGps) this.instance).hasVdop();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasVertPosError() {
                return ((CarlifeCarGps) this.instance).hasVertPosError();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasVertSpeed() {
                return ((CarlifeCarGps) this.instance).hasVertSpeed();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
            public boolean hasYear() {
                return ((CarlifeCarGps) this.instance).hasYear();
            }

            public Builder setAntennaState(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setAntennaState(i7);
                return this;
            }

            public Builder setDay(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setDay(i7);
                return this;
            }

            public Builder setEastSpeed(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setEastSpeed(i7);
                return this;
            }

            public Builder setFix(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setFix(i7);
                return this;
            }

            public Builder setHdop(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setHdop(i7);
                return this;
            }

            public Builder setHeading(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setHeading(i7);
                return this;
            }

            public Builder setHeight(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setHeight(i7);
                return this;
            }

            public Builder setHorPosError(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setHorPosError(i7);
                return this;
            }

            public Builder setHrs(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setHrs(i7);
                return this;
            }

            public Builder setLatitude(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setLatitude(i7);
                return this;
            }

            public Builder setLongitude(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setLongitude(i7);
                return this;
            }

            public Builder setMin(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setMin(i7);
                return this;
            }

            public Builder setMonth(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setMonth(i7);
                return this;
            }

            public Builder setNorthSpeed(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setNorthSpeed(i7);
                return this;
            }

            public Builder setPdop(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setPdop(i7);
                return this;
            }

            public Builder setSatsUsed(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setSatsUsed(i7);
                return this;
            }

            public Builder setSatsVisible(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setSatsVisible(i7);
                return this;
            }

            public Builder setSec(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setSec(i7);
                return this;
            }

            public Builder setSignalQuality(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setSignalQuality(i7);
                return this;
            }

            public Builder setSpeed(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setSpeed(i7);
                return this;
            }

            public Builder setTimeStamp(long j5) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setTimeStamp(j5);
                return this;
            }

            public Builder setVdop(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setVdop(i7);
                return this;
            }

            public Builder setVertPosError(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setVertPosError(i7);
                return this;
            }

            public Builder setVertSpeed(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setVertSpeed(i7);
                return this;
            }

            public Builder setYear(int i7) {
                copyOnWrite();
                ((CarlifeCarGps) this.instance).setYear(i7);
                return this;
            }
        }

        static {
            CarlifeCarGps carlifeCarGps = new CarlifeCarGps();
            DEFAULT_INSTANCE = carlifeCarGps;
            j0.registerDefaultInstance(CarlifeCarGps.class, carlifeCarGps);
        }

        private CarlifeCarGps() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAntennaState() {
            this.bitField0_ &= -2;
            this.antennaState_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDay() {
            this.bitField0_ &= -513;
            this.day_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEastSpeed() {
            this.bitField0_ &= -4194305;
            this.eastSpeed_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFix() {
            this.bitField0_ &= -8193;
            this.fix_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHdop() {
            this.bitField0_ &= -16385;
            this.hdop_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeading() {
            this.bitField0_ &= -65;
            this.heading_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeight() {
            this.bitField0_ &= -17;
            this.height_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHorPosError() {
            this.bitField0_ &= -524289;
            this.horPosError_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHrs() {
            this.bitField0_ &= -1025;
            this.hrs_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLatitude() {
            this.bitField0_ &= -5;
            this.latitude_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLongitude() {
            this.bitField0_ &= -9;
            this.longitude_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMin() {
            this.bitField0_ &= -2049;
            this.min_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMonth() {
            this.bitField0_ &= -257;
            this.month_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNorthSpeed() {
            this.bitField0_ &= -2097153;
            this.northSpeed_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPdop() {
            this.bitField0_ &= -32769;
            this.pdop_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSatsUsed() {
            this.bitField0_ &= -131073;
            this.satsUsed_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSatsVisible() {
            this.bitField0_ &= -262145;
            this.satsVisible_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSec() {
            this.bitField0_ &= -4097;
            this.sec_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSignalQuality() {
            this.bitField0_ &= -3;
            this.signalQuality_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpeed() {
            this.bitField0_ &= -33;
            this.speed_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeStamp() {
            this.bitField0_ &= -16777217;
            this.timeStamp_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVdop() {
            this.bitField0_ &= -65537;
            this.vdop_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVertPosError() {
            this.bitField0_ &= -1048577;
            this.vertPosError_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVertSpeed() {
            this.bitField0_ &= -8388609;
            this.vertSpeed_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearYear() {
            this.bitField0_ &= -129;
            this.year_ = 0;
        }

        public static CarlifeCarGps getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeCarGps carlifeCarGps) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeCarGps);
        }

        public static CarlifeCarGps parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeCarGps) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeCarGps parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeCarGps) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeCarGps parseFrom(l lVar) {
            return (CarlifeCarGps) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeCarGps parseFrom(l lVar, y yVar) {
            return (CarlifeCarGps) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeCarGps parseFrom(p pVar) {
            return (CarlifeCarGps) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeCarGps parseFrom(p pVar, y yVar) {
            return (CarlifeCarGps) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeCarGps parseFrom(InputStream inputStream) {
            return (CarlifeCarGps) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeCarGps parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeCarGps) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeCarGps parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeCarGps) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeCarGps parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeCarGps) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeCarGps parseFrom(byte[] bArr) {
            return (CarlifeCarGps) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeCarGps parseFrom(byte[] bArr, y yVar) {
            return (CarlifeCarGps) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAntennaState(int i7) {
            this.bitField0_ |= 1;
            this.antennaState_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDay(int i7) {
            this.bitField0_ |= 512;
            this.day_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEastSpeed(int i7) {
            this.bitField0_ |= 4194304;
            this.eastSpeed_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFix(int i7) {
            this.bitField0_ |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
            this.fix_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHdop(int i7) {
            this.bitField0_ |= 16384;
            this.hdop_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeading(int i7) {
            this.bitField0_ |= 64;
            this.heading_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(int i7) {
            this.bitField0_ |= 16;
            this.height_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHorPosError(int i7) {
            this.bitField0_ |= 524288;
            this.horPosError_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHrs(int i7) {
            this.bitField0_ |= 1024;
            this.hrs_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLatitude(int i7) {
            this.bitField0_ |= 4;
            this.latitude_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongitude(int i7) {
            this.bitField0_ |= 8;
            this.longitude_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMin(int i7) {
            this.bitField0_ |= 2048;
            this.min_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMonth(int i7) {
            this.bitField0_ |= 256;
            this.month_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNorthSpeed(int i7) {
            this.bitField0_ |= 2097152;
            this.northSpeed_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPdop(int i7) {
            this.bitField0_ |= 32768;
            this.pdop_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSatsUsed(int i7) {
            this.bitField0_ |= 131072;
            this.satsUsed_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSatsVisible(int i7) {
            this.bitField0_ |= 262144;
            this.satsVisible_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSec(int i7) {
            this.bitField0_ |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
            this.sec_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSignalQuality(int i7) {
            this.bitField0_ |= 2;
            this.signalQuality_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpeed(int i7) {
            this.bitField0_ |= 32;
            this.speed_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeStamp(long j5) {
            this.bitField0_ |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_GLOBAL;
            this.timeStamp_ = j5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVdop(int i7) {
            this.bitField0_ |= 65536;
            this.vdop_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVertPosError(int i7) {
            this.bitField0_ |= 1048576;
            this.vertPosError_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVertSpeed(int i7) {
            this.bitField0_ |= 8388608;
            this.vertSpeed_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setYear(int i7) {
            this.bitField0_ |= 128;
            this.year_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0019\u0000\u0001\u0001\u0019\u0019\u0000\u0000\u0018\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005ᔄ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔄ\u0015\u0017ᔄ\u0016\u0018ᔄ\u0017\u0019ဃ\u0018", new Object[]{"bitField0_", "antennaState_", "signalQuality_", "latitude_", "longitude_", "height_", "speed_", "heading_", "year_", "month_", "day_", "hrs_", "min_", "sec_", "fix_", "hdop_", "pdop_", "vdop_", "satsUsed_", "satsVisible_", "horPosError_", "vertPosError_", "northSpeed_", "eastSpeed_", "vertSpeed_", "timeStamp_"});
                case 3:
                    return new CarlifeCarGps();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeCarGps.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getAntennaState() {
            return this.antennaState_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getDay() {
            return this.day_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getEastSpeed() {
            return this.eastSpeed_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getFix() {
            return this.fix_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getHdop() {
            return this.hdop_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getHeading() {
            return this.heading_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getHorPosError() {
            return this.horPosError_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getHrs() {
            return this.hrs_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getLatitude() {
            return this.latitude_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getLongitude() {
            return this.longitude_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getMin() {
            return this.min_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getMonth() {
            return this.month_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getNorthSpeed() {
            return this.northSpeed_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getPdop() {
            return this.pdop_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getSatsUsed() {
            return this.satsUsed_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getSatsVisible() {
            return this.satsVisible_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getSec() {
            return this.sec_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getSignalQuality() {
            return this.signalQuality_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getSpeed() {
            return this.speed_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public long getTimeStamp() {
            return this.timeStamp_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getVdop() {
            return this.vdop_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getVertPosError() {
            return this.vertPosError_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getVertSpeed() {
            return this.vertSpeed_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public int getYear() {
            return this.year_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasAntennaState() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasDay() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasEastSpeed() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasFix() {
            return (this.bitField0_ & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasHdop() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasHeading() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasHeight() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasHorPosError() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasHrs() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasLatitude() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasLongitude() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasMin() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasMonth() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasNorthSpeed() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasPdop() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasSatsUsed() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasSatsVisible() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasSec() {
            return (this.bitField0_ & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasSignalQuality() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasSpeed() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasTimeStamp() {
            return (this.bitField0_ & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_GLOBAL) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasVdop() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasVertPosError() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasVertSpeed() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeCarGpsProto.CarlifeCarGpsOrBuilder
        public boolean hasYear() {
            return (this.bitField0_ & 128) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeCarGpsOrBuilder extends m1 {
        int getAntennaState();

        int getDay();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getEastSpeed();

        int getFix();

        int getHdop();

        int getHeading();

        int getHeight();

        int getHorPosError();

        int getHrs();

        int getLatitude();

        int getLongitude();

        int getMin();

        int getMonth();

        int getNorthSpeed();

        int getPdop();

        int getSatsUsed();

        int getSatsVisible();

        int getSec();

        int getSignalQuality();

        int getSpeed();

        long getTimeStamp();

        int getVdop();

        int getVertPosError();

        int getVertSpeed();

        int getYear();

        boolean hasAntennaState();

        boolean hasDay();

        boolean hasEastSpeed();

        boolean hasFix();

        boolean hasHdop();

        boolean hasHeading();

        boolean hasHeight();

        boolean hasHorPosError();

        boolean hasHrs();

        boolean hasLatitude();

        boolean hasLongitude();

        boolean hasMin();

        boolean hasMonth();

        boolean hasNorthSpeed();

        boolean hasPdop();

        boolean hasSatsUsed();

        boolean hasSatsVisible();

        boolean hasSec();

        boolean hasSignalQuality();

        boolean hasSpeed();

        boolean hasTimeStamp();

        boolean hasVdop();

        boolean hasVertPosError();

        boolean hasVertSpeed();

        boolean hasYear();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeCarGpsProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

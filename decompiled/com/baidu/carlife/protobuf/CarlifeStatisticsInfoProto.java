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
public final class CarlifeStatisticsInfoProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto$1, reason: invalid class name */
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
    public static final class CarlifeStatisticsInfo extends j0 implements CarlifeStatisticsInfoOrBuilder {
        public static final int CHANNEL_FIELD_NUMBER = 4;
        public static final int CONNECTCOUNT_FIELD_NUMBER = 5;
        public static final int CONNECTSUCCESSCOUNT_FIELD_NUMBER = 6;
        public static final int CONNECTTIME_FIELD_NUMBER = 7;
        public static final int CRASHLOG_FIELD_NUMBER = 8;
        public static final int CUID_FIELD_NUMBER = 1;
        private static final CarlifeStatisticsInfo DEFAULT_INSTANCE;
        private static volatile s1 PARSER = null;
        public static final int VERSIONCODE_FIELD_NUMBER = 3;
        public static final int VERSIONNAME_FIELD_NUMBER = 2;
        private int bitField0_;
        private int connectCount_;
        private int connectSuccessCount_;
        private int connectTime_;
        private int versionCode_;
        private byte memoizedIsInitialized = 2;
        private String cuid_ = "";
        private String versionName_ = "";
        private String channel_ = "";
        private String crashLog_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeStatisticsInfoOrBuilder {
            private Builder() {
                super(CarlifeStatisticsInfo.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearChannel() {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).clearChannel();
                return this;
            }

            public Builder clearConnectCount() {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).clearConnectCount();
                return this;
            }

            public Builder clearConnectSuccessCount() {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).clearConnectSuccessCount();
                return this;
            }

            public Builder clearConnectTime() {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).clearConnectTime();
                return this;
            }

            public Builder clearCrashLog() {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).clearCrashLog();
                return this;
            }

            public Builder clearCuid() {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).clearCuid();
                return this;
            }

            public Builder clearVersionCode() {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).clearVersionCode();
                return this;
            }

            public Builder clearVersionName() {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).clearVersionName();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public String getChannel() {
                return ((CarlifeStatisticsInfo) this.instance).getChannel();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public l getChannelBytes() {
                return ((CarlifeStatisticsInfo) this.instance).getChannelBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public int getConnectCount() {
                return ((CarlifeStatisticsInfo) this.instance).getConnectCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public int getConnectSuccessCount() {
                return ((CarlifeStatisticsInfo) this.instance).getConnectSuccessCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public int getConnectTime() {
                return ((CarlifeStatisticsInfo) this.instance).getConnectTime();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public String getCrashLog() {
                return ((CarlifeStatisticsInfo) this.instance).getCrashLog();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public l getCrashLogBytes() {
                return ((CarlifeStatisticsInfo) this.instance).getCrashLogBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public String getCuid() {
                return ((CarlifeStatisticsInfo) this.instance).getCuid();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public l getCuidBytes() {
                return ((CarlifeStatisticsInfo) this.instance).getCuidBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public int getVersionCode() {
                return ((CarlifeStatisticsInfo) this.instance).getVersionCode();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public String getVersionName() {
                return ((CarlifeStatisticsInfo) this.instance).getVersionName();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public l getVersionNameBytes() {
                return ((CarlifeStatisticsInfo) this.instance).getVersionNameBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public boolean hasChannel() {
                return ((CarlifeStatisticsInfo) this.instance).hasChannel();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public boolean hasConnectCount() {
                return ((CarlifeStatisticsInfo) this.instance).hasConnectCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public boolean hasConnectSuccessCount() {
                return ((CarlifeStatisticsInfo) this.instance).hasConnectSuccessCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public boolean hasConnectTime() {
                return ((CarlifeStatisticsInfo) this.instance).hasConnectTime();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public boolean hasCrashLog() {
                return ((CarlifeStatisticsInfo) this.instance).hasCrashLog();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public boolean hasCuid() {
                return ((CarlifeStatisticsInfo) this.instance).hasCuid();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public boolean hasVersionCode() {
                return ((CarlifeStatisticsInfo) this.instance).hasVersionCode();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
            public boolean hasVersionName() {
                return ((CarlifeStatisticsInfo) this.instance).hasVersionName();
            }

            public Builder setChannel(String str) {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).setChannel(str);
                return this;
            }

            public Builder setChannelBytes(l lVar) {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).setChannelBytes(lVar);
                return this;
            }

            public Builder setConnectCount(int i7) {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).setConnectCount(i7);
                return this;
            }

            public Builder setConnectSuccessCount(int i7) {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).setConnectSuccessCount(i7);
                return this;
            }

            public Builder setConnectTime(int i7) {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).setConnectTime(i7);
                return this;
            }

            public Builder setCrashLog(String str) {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).setCrashLog(str);
                return this;
            }

            public Builder setCrashLogBytes(l lVar) {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).setCrashLogBytes(lVar);
                return this;
            }

            public Builder setCuid(String str) {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).setCuid(str);
                return this;
            }

            public Builder setCuidBytes(l lVar) {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).setCuidBytes(lVar);
                return this;
            }

            public Builder setVersionCode(int i7) {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).setVersionCode(i7);
                return this;
            }

            public Builder setVersionName(String str) {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).setVersionName(str);
                return this;
            }

            public Builder setVersionNameBytes(l lVar) {
                copyOnWrite();
                ((CarlifeStatisticsInfo) this.instance).setVersionNameBytes(lVar);
                return this;
            }
        }

        static {
            CarlifeStatisticsInfo carlifeStatisticsInfo = new CarlifeStatisticsInfo();
            DEFAULT_INSTANCE = carlifeStatisticsInfo;
            j0.registerDefaultInstance(CarlifeStatisticsInfo.class, carlifeStatisticsInfo);
        }

        private CarlifeStatisticsInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChannel() {
            this.bitField0_ &= -9;
            this.channel_ = getDefaultInstance().getChannel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectCount() {
            this.bitField0_ &= -17;
            this.connectCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectSuccessCount() {
            this.bitField0_ &= -33;
            this.connectSuccessCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectTime() {
            this.bitField0_ &= -65;
            this.connectTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCrashLog() {
            this.bitField0_ &= -129;
            this.crashLog_ = getDefaultInstance().getCrashLog();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCuid() {
            this.bitField0_ &= -2;
            this.cuid_ = getDefaultInstance().getCuid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersionCode() {
            this.bitField0_ &= -5;
            this.versionCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersionName() {
            this.bitField0_ &= -3;
            this.versionName_ = getDefaultInstance().getVersionName();
        }

        public static CarlifeStatisticsInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeStatisticsInfo carlifeStatisticsInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeStatisticsInfo);
        }

        public static CarlifeStatisticsInfo parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeStatisticsInfo) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeStatisticsInfo parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeStatisticsInfo) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeStatisticsInfo parseFrom(l lVar) {
            return (CarlifeStatisticsInfo) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeStatisticsInfo parseFrom(l lVar, y yVar) {
            return (CarlifeStatisticsInfo) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeStatisticsInfo parseFrom(p pVar) {
            return (CarlifeStatisticsInfo) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeStatisticsInfo parseFrom(p pVar, y yVar) {
            return (CarlifeStatisticsInfo) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeStatisticsInfo parseFrom(InputStream inputStream) {
            return (CarlifeStatisticsInfo) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeStatisticsInfo parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeStatisticsInfo) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeStatisticsInfo parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeStatisticsInfo) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeStatisticsInfo parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeStatisticsInfo) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeStatisticsInfo parseFrom(byte[] bArr) {
            return (CarlifeStatisticsInfo) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeStatisticsInfo parseFrom(byte[] bArr, y yVar) {
            return (CarlifeStatisticsInfo) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChannel(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.channel_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChannelBytes(l lVar) {
            this.channel_ = lVar.u();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectCount(int i7) {
            this.bitField0_ |= 16;
            this.connectCount_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectSuccessCount(int i7) {
            this.bitField0_ |= 32;
            this.connectSuccessCount_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectTime(int i7) {
            this.bitField0_ |= 64;
            this.connectTime_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCrashLog(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.crashLog_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCrashLogBytes(l lVar) {
            this.crashLog_ = lVar.u();
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCuid(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.cuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCuidBytes(l lVar) {
            this.cuid_ = lVar.u();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionCode(int i7) {
            this.bitField0_ |= 4;
            this.versionCode_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionName(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.versionName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionNameBytes(l lVar) {
            this.versionName_ = lVar.u();
            this.bitField0_ |= 2;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0007\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\u0004ᔈ\u0003\u0005ᔄ\u0004\u0006ᔄ\u0005\u0007ᔄ\u0006\bဈ\u0007", new Object[]{"bitField0_", "cuid_", "versionName_", "versionCode_", "channel_", "connectCount_", "connectSuccessCount_", "connectTime_", "crashLog_"});
                case 3:
                    return new CarlifeStatisticsInfo();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeStatisticsInfo.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public String getChannel() {
            return this.channel_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public l getChannelBytes() {
            return l.m(this.channel_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public int getConnectCount() {
            return this.connectCount_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public int getConnectSuccessCount() {
            return this.connectSuccessCount_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public int getConnectTime() {
            return this.connectTime_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public String getCrashLog() {
            return this.crashLog_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public l getCrashLogBytes() {
            return l.m(this.crashLog_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public String getCuid() {
            return this.cuid_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public l getCuidBytes() {
            return l.m(this.cuid_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public int getVersionCode() {
            return this.versionCode_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public String getVersionName() {
            return this.versionName_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public l getVersionNameBytes() {
            return l.m(this.versionName_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public boolean hasChannel() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public boolean hasConnectCount() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public boolean hasConnectSuccessCount() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public boolean hasConnectTime() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public boolean hasCrashLog() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public boolean hasCuid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public boolean hasVersionCode() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto.CarlifeStatisticsInfoOrBuilder
        public boolean hasVersionName() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeStatisticsInfoOrBuilder extends m1 {
        String getChannel();

        l getChannelBytes();

        int getConnectCount();

        int getConnectSuccessCount();

        int getConnectTime();

        String getCrashLog();

        l getCrashLogBytes();

        String getCuid();

        l getCuidBytes();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getVersionCode();

        String getVersionName();

        l getVersionNameBytes();

        boolean hasChannel();

        boolean hasConnectCount();

        boolean hasConnectSuccessCount();

        boolean hasConnectTime();

        boolean hasCrashLog();

        boolean hasCuid();

        boolean hasVersionCode();

        boolean hasVersionName();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeStatisticsInfoProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

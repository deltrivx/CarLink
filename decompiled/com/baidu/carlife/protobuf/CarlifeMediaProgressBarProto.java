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
public final class CarlifeMediaProgressBarProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeMediaProgressBarProto$1, reason: invalid class name */
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
    public static final class CarlifeMediaProgressBar extends j0 implements CarlifeMediaProgressBarOrBuilder {
        private static final CarlifeMediaProgressBar DEFAULT_INSTANCE;
        public static final int MEDIALYRIC_FIELD_NUMBER = 2;
        private static volatile s1 PARSER = null;
        public static final int PROGRESSBAR_FIELD_NUMBER = 1;
        private int bitField0_;
        private int progressBar_;
        private byte memoizedIsInitialized = 2;
        private String mediaLyric_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeMediaProgressBarOrBuilder {
            private Builder() {
                super(CarlifeMediaProgressBar.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearMediaLyric() {
                copyOnWrite();
                ((CarlifeMediaProgressBar) this.instance).clearMediaLyric();
                return this;
            }

            public Builder clearProgressBar() {
                copyOnWrite();
                ((CarlifeMediaProgressBar) this.instance).clearProgressBar();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBarOrBuilder
            public String getMediaLyric() {
                return ((CarlifeMediaProgressBar) this.instance).getMediaLyric();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBarOrBuilder
            public l getMediaLyricBytes() {
                return ((CarlifeMediaProgressBar) this.instance).getMediaLyricBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBarOrBuilder
            public int getProgressBar() {
                return ((CarlifeMediaProgressBar) this.instance).getProgressBar();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBarOrBuilder
            public boolean hasMediaLyric() {
                return ((CarlifeMediaProgressBar) this.instance).hasMediaLyric();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBarOrBuilder
            public boolean hasProgressBar() {
                return ((CarlifeMediaProgressBar) this.instance).hasProgressBar();
            }

            public Builder setMediaLyric(String str) {
                copyOnWrite();
                ((CarlifeMediaProgressBar) this.instance).setMediaLyric(str);
                return this;
            }

            public Builder setMediaLyricBytes(l lVar) {
                copyOnWrite();
                ((CarlifeMediaProgressBar) this.instance).setMediaLyricBytes(lVar);
                return this;
            }

            public Builder setProgressBar(int i7) {
                copyOnWrite();
                ((CarlifeMediaProgressBar) this.instance).setProgressBar(i7);
                return this;
            }
        }

        static {
            CarlifeMediaProgressBar carlifeMediaProgressBar = new CarlifeMediaProgressBar();
            DEFAULT_INSTANCE = carlifeMediaProgressBar;
            j0.registerDefaultInstance(CarlifeMediaProgressBar.class, carlifeMediaProgressBar);
        }

        private CarlifeMediaProgressBar() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediaLyric() {
            this.bitField0_ &= -3;
            this.mediaLyric_ = getDefaultInstance().getMediaLyric();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProgressBar() {
            this.bitField0_ &= -2;
            this.progressBar_ = 0;
        }

        public static CarlifeMediaProgressBar getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeMediaProgressBar carlifeMediaProgressBar) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeMediaProgressBar);
        }

        public static CarlifeMediaProgressBar parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeMediaProgressBar) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeMediaProgressBar parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeMediaProgressBar) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeMediaProgressBar parseFrom(l lVar) {
            return (CarlifeMediaProgressBar) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeMediaProgressBar parseFrom(l lVar, y yVar) {
            return (CarlifeMediaProgressBar) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeMediaProgressBar parseFrom(p pVar) {
            return (CarlifeMediaProgressBar) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeMediaProgressBar parseFrom(p pVar, y yVar) {
            return (CarlifeMediaProgressBar) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeMediaProgressBar parseFrom(InputStream inputStream) {
            return (CarlifeMediaProgressBar) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeMediaProgressBar parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeMediaProgressBar) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeMediaProgressBar parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeMediaProgressBar) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeMediaProgressBar parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeMediaProgressBar) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeMediaProgressBar parseFrom(byte[] bArr) {
            return (CarlifeMediaProgressBar) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeMediaProgressBar parseFrom(byte[] bArr, y yVar) {
            return (CarlifeMediaProgressBar) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediaLyric(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.mediaLyric_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediaLyricBytes(l lVar) {
            this.mediaLyric_ = lVar.u();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgressBar(int i7) {
            this.bitField0_ |= 1;
            this.progressBar_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔄ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "progressBar_", "mediaLyric_"});
                case 3:
                    return new CarlifeMediaProgressBar();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeMediaProgressBar.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBarOrBuilder
        public String getMediaLyric() {
            return this.mediaLyric_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBarOrBuilder
        public l getMediaLyricBytes() {
            return l.m(this.mediaLyric_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBarOrBuilder
        public int getProgressBar() {
            return this.progressBar_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBarOrBuilder
        public boolean hasMediaLyric() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeMediaProgressBarProto.CarlifeMediaProgressBarOrBuilder
        public boolean hasProgressBar() {
            return (this.bitField0_ & 1) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeMediaProgressBarOrBuilder extends m1 {
        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        String getMediaLyric();

        l getMediaLyricBytes();

        int getProgressBar();

        boolean hasMediaLyric();

        boolean hasProgressBar();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeMediaProgressBarProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

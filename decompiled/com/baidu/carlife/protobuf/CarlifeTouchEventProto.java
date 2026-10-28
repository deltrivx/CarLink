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
public final class CarlifeTouchEventProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeTouchEventProto$1, reason: invalid class name */
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
    public static final class CarlifeTouchEvent extends j0 implements CarlifeTouchEventOrBuilder {
        public static final int CODE_FIELD_NUMBER = 2;
        private static final CarlifeTouchEvent DEFAULT_INSTANCE;
        private static volatile s1 PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private int code_;
        private byte memoizedIsInitialized = 2;
        private int type_;
        private int value_;

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeTouchEventOrBuilder {
            private Builder() {
                super(CarlifeTouchEvent.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCode() {
                copyOnWrite();
                ((CarlifeTouchEvent) this.instance).clearCode();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((CarlifeTouchEvent) this.instance).clearType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((CarlifeTouchEvent) this.instance).clearValue();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventProto.CarlifeTouchEventOrBuilder
            public int getCode() {
                return ((CarlifeTouchEvent) this.instance).getCode();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventProto.CarlifeTouchEventOrBuilder
            public int getType() {
                return ((CarlifeTouchEvent) this.instance).getType();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventProto.CarlifeTouchEventOrBuilder
            public int getValue() {
                return ((CarlifeTouchEvent) this.instance).getValue();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventProto.CarlifeTouchEventOrBuilder
            public boolean hasCode() {
                return ((CarlifeTouchEvent) this.instance).hasCode();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventProto.CarlifeTouchEventOrBuilder
            public boolean hasType() {
                return ((CarlifeTouchEvent) this.instance).hasType();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventProto.CarlifeTouchEventOrBuilder
            public boolean hasValue() {
                return ((CarlifeTouchEvent) this.instance).hasValue();
            }

            public Builder setCode(int i7) {
                copyOnWrite();
                ((CarlifeTouchEvent) this.instance).setCode(i7);
                return this;
            }

            public Builder setType(int i7) {
                copyOnWrite();
                ((CarlifeTouchEvent) this.instance).setType(i7);
                return this;
            }

            public Builder setValue(int i7) {
                copyOnWrite();
                ((CarlifeTouchEvent) this.instance).setValue(i7);
                return this;
            }
        }

        static {
            CarlifeTouchEvent carlifeTouchEvent = new CarlifeTouchEvent();
            DEFAULT_INSTANCE = carlifeTouchEvent;
            j0.registerDefaultInstance(CarlifeTouchEvent.class, carlifeTouchEvent);
        }

        private CarlifeTouchEvent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.bitField0_ &= -3;
            this.code_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.bitField0_ &= -5;
            this.value_ = 0;
        }

        public static CarlifeTouchEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeTouchEvent carlifeTouchEvent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeTouchEvent);
        }

        public static CarlifeTouchEvent parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeTouchEvent) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeTouchEvent parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeTouchEvent) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeTouchEvent parseFrom(l lVar) {
            return (CarlifeTouchEvent) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeTouchEvent parseFrom(l lVar, y yVar) {
            return (CarlifeTouchEvent) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeTouchEvent parseFrom(p pVar) {
            return (CarlifeTouchEvent) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeTouchEvent parseFrom(p pVar, y yVar) {
            return (CarlifeTouchEvent) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeTouchEvent parseFrom(InputStream inputStream) {
            return (CarlifeTouchEvent) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeTouchEvent parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeTouchEvent) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeTouchEvent parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeTouchEvent) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeTouchEvent parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeTouchEvent) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeTouchEvent parseFrom(byte[] bArr) {
            return (CarlifeTouchEvent) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeTouchEvent parseFrom(byte[] bArr, y yVar) {
            return (CarlifeTouchEvent) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(int i7) {
            this.bitField0_ |= 2;
            this.code_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i7) {
            this.bitField0_ |= 1;
            this.type_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(int i7) {
            this.bitField0_ |= 4;
            this.value_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002", new Object[]{"bitField0_", "type_", "code_", "value_"});
                case 3:
                    return new CarlifeTouchEvent();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeTouchEvent.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventProto.CarlifeTouchEventOrBuilder
        public int getCode() {
            return this.code_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventProto.CarlifeTouchEventOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventProto.CarlifeTouchEventOrBuilder
        public int getValue() {
            return this.value_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventProto.CarlifeTouchEventOrBuilder
        public boolean hasCode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventProto.CarlifeTouchEventOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventProto.CarlifeTouchEventOrBuilder
        public boolean hasValue() {
            return (this.bitField0_ & 4) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeTouchEventOrBuilder extends m1 {
        int getCode();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        int getType();

        int getValue();

        boolean hasCode();

        boolean hasType();

        boolean hasValue();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeTouchEventProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

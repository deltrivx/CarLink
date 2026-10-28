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
public final class CarlifeTouchEventDeviceProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto$1, reason: invalid class name */
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
    public static final class CarlifeTouchEventDevice extends j0 implements CarlifeTouchEventDeviceOrBuilder {
        public static final int ABS_X_MAX_FIELD_NUMBER = 6;
        public static final int ABS_X_MIN_FIELD_NUMBER = 5;
        public static final int ABS_Y_MAX_FIELD_NUMBER = 8;
        public static final int ABS_Y_MIN_FIELD_NUMBER = 7;
        public static final int CID_FIELD_NUMBER = 1;
        private static final CarlifeTouchEventDevice DEFAULT_INSTANCE;
        public static final int DEVICE_FIELD_NUMBER = 9;
        public static final int DOWNEVENT_FIELD_NUMBER = 10;
        public static final int EVENTX_FIELD_NUMBER = 2;
        public static final int MOVEEVENT_FIELD_NUMBER = 12;
        private static volatile s1 PARSER = null;
        public static final int SCREEN_HEIGHT_FIELD_NUMBER = 4;
        public static final int SCREEN_WIDTH_FIELD_NUMBER = 3;
        public static final int UPEVENT_FIELD_NUMBER = 11;
        private int absXMax_;
        private int absXMin_;
        private int absYMax_;
        private int absYMin_;
        private int bitField0_;
        private int cid_;
        private int eventx_;
        private int screenHeight_;
        private int screenWidth_;
        private byte memoizedIsInitialized = 2;
        private String device_ = "";
        private t0 downEvent_ = j0.emptyProtobufList();
        private t0 upEvent_ = j0.emptyProtobufList();
        private t0 moveEvent_ = j0.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeTouchEventDeviceOrBuilder {
            private Builder() {
                super(CarlifeTouchEventDevice.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllDownEvent(Iterable<? extends CarlifeTouchEventProto.CarlifeTouchEvent> iterable) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).addAllDownEvent(iterable);
                return this;
            }

            public Builder addAllMoveEvent(Iterable<? extends CarlifeTouchEventProto.CarlifeTouchEvent> iterable) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).addAllMoveEvent(iterable);
                return this;
            }

            public Builder addAllUpEvent(Iterable<? extends CarlifeTouchEventProto.CarlifeTouchEvent> iterable) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).addAllUpEvent(iterable);
                return this;
            }

            public Builder addDownEvent(int i7, CarlifeTouchEventProto.CarlifeTouchEvent.Builder builder) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).addDownEvent(i7, (CarlifeTouchEventProto.CarlifeTouchEvent) builder.m16build());
                return this;
            }

            public Builder addDownEvent(int i7, CarlifeTouchEventProto.CarlifeTouchEvent carlifeTouchEvent) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).addDownEvent(i7, carlifeTouchEvent);
                return this;
            }

            public Builder addDownEvent(CarlifeTouchEventProto.CarlifeTouchEvent.Builder builder) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).addDownEvent((CarlifeTouchEventProto.CarlifeTouchEvent) builder.m16build());
                return this;
            }

            public Builder addDownEvent(CarlifeTouchEventProto.CarlifeTouchEvent carlifeTouchEvent) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).addDownEvent(carlifeTouchEvent);
                return this;
            }

            public Builder addMoveEvent(int i7, CarlifeTouchEventProto.CarlifeTouchEvent.Builder builder) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).addMoveEvent(i7, (CarlifeTouchEventProto.CarlifeTouchEvent) builder.m16build());
                return this;
            }

            public Builder addMoveEvent(int i7, CarlifeTouchEventProto.CarlifeTouchEvent carlifeTouchEvent) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).addMoveEvent(i7, carlifeTouchEvent);
                return this;
            }

            public Builder addMoveEvent(CarlifeTouchEventProto.CarlifeTouchEvent.Builder builder) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).addMoveEvent((CarlifeTouchEventProto.CarlifeTouchEvent) builder.m16build());
                return this;
            }

            public Builder addMoveEvent(CarlifeTouchEventProto.CarlifeTouchEvent carlifeTouchEvent) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).addMoveEvent(carlifeTouchEvent);
                return this;
            }

            public Builder addUpEvent(int i7, CarlifeTouchEventProto.CarlifeTouchEvent.Builder builder) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).addUpEvent(i7, (CarlifeTouchEventProto.CarlifeTouchEvent) builder.m16build());
                return this;
            }

            public Builder addUpEvent(int i7, CarlifeTouchEventProto.CarlifeTouchEvent carlifeTouchEvent) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).addUpEvent(i7, carlifeTouchEvent);
                return this;
            }

            public Builder addUpEvent(CarlifeTouchEventProto.CarlifeTouchEvent.Builder builder) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).addUpEvent((CarlifeTouchEventProto.CarlifeTouchEvent) builder.m16build());
                return this;
            }

            public Builder addUpEvent(CarlifeTouchEventProto.CarlifeTouchEvent carlifeTouchEvent) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).addUpEvent(carlifeTouchEvent);
                return this;
            }

            public Builder clearAbsXMax() {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).clearAbsXMax();
                return this;
            }

            public Builder clearAbsXMin() {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).clearAbsXMin();
                return this;
            }

            public Builder clearAbsYMax() {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).clearAbsYMax();
                return this;
            }

            public Builder clearAbsYMin() {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).clearAbsYMin();
                return this;
            }

            public Builder clearCid() {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).clearCid();
                return this;
            }

            public Builder clearDevice() {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).clearDevice();
                return this;
            }

            public Builder clearDownEvent() {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).clearDownEvent();
                return this;
            }

            public Builder clearEventx() {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).clearEventx();
                return this;
            }

            public Builder clearMoveEvent() {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).clearMoveEvent();
                return this;
            }

            public Builder clearScreenHeight() {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).clearScreenHeight();
                return this;
            }

            public Builder clearScreenWidth() {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).clearScreenWidth();
                return this;
            }

            public Builder clearUpEvent() {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).clearUpEvent();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public int getAbsXMax() {
                return ((CarlifeTouchEventDevice) this.instance).getAbsXMax();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public int getAbsXMin() {
                return ((CarlifeTouchEventDevice) this.instance).getAbsXMin();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public int getAbsYMax() {
                return ((CarlifeTouchEventDevice) this.instance).getAbsYMax();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public int getAbsYMin() {
                return ((CarlifeTouchEventDevice) this.instance).getAbsYMin();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public int getCid() {
                return ((CarlifeTouchEventDevice) this.instance).getCid();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public String getDevice() {
                return ((CarlifeTouchEventDevice) this.instance).getDevice();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public l getDeviceBytes() {
                return ((CarlifeTouchEventDevice) this.instance).getDeviceBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public CarlifeTouchEventProto.CarlifeTouchEvent getDownEvent(int i7) {
                return ((CarlifeTouchEventDevice) this.instance).getDownEvent(i7);
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public int getDownEventCount() {
                return ((CarlifeTouchEventDevice) this.instance).getDownEventCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public List<CarlifeTouchEventProto.CarlifeTouchEvent> getDownEventList() {
                return Collections.unmodifiableList(((CarlifeTouchEventDevice) this.instance).getDownEventList());
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public int getEventx() {
                return ((CarlifeTouchEventDevice) this.instance).getEventx();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public CarlifeTouchEventProto.CarlifeTouchEvent getMoveEvent(int i7) {
                return ((CarlifeTouchEventDevice) this.instance).getMoveEvent(i7);
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public int getMoveEventCount() {
                return ((CarlifeTouchEventDevice) this.instance).getMoveEventCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public List<CarlifeTouchEventProto.CarlifeTouchEvent> getMoveEventList() {
                return Collections.unmodifiableList(((CarlifeTouchEventDevice) this.instance).getMoveEventList());
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public int getScreenHeight() {
                return ((CarlifeTouchEventDevice) this.instance).getScreenHeight();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public int getScreenWidth() {
                return ((CarlifeTouchEventDevice) this.instance).getScreenWidth();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public CarlifeTouchEventProto.CarlifeTouchEvent getUpEvent(int i7) {
                return ((CarlifeTouchEventDevice) this.instance).getUpEvent(i7);
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public int getUpEventCount() {
                return ((CarlifeTouchEventDevice) this.instance).getUpEventCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public List<CarlifeTouchEventProto.CarlifeTouchEvent> getUpEventList() {
                return Collections.unmodifiableList(((CarlifeTouchEventDevice) this.instance).getUpEventList());
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public boolean hasAbsXMax() {
                return ((CarlifeTouchEventDevice) this.instance).hasAbsXMax();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public boolean hasAbsXMin() {
                return ((CarlifeTouchEventDevice) this.instance).hasAbsXMin();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public boolean hasAbsYMax() {
                return ((CarlifeTouchEventDevice) this.instance).hasAbsYMax();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public boolean hasAbsYMin() {
                return ((CarlifeTouchEventDevice) this.instance).hasAbsYMin();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public boolean hasCid() {
                return ((CarlifeTouchEventDevice) this.instance).hasCid();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public boolean hasDevice() {
                return ((CarlifeTouchEventDevice) this.instance).hasDevice();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public boolean hasEventx() {
                return ((CarlifeTouchEventDevice) this.instance).hasEventx();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public boolean hasScreenHeight() {
                return ((CarlifeTouchEventDevice) this.instance).hasScreenHeight();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
            public boolean hasScreenWidth() {
                return ((CarlifeTouchEventDevice) this.instance).hasScreenWidth();
            }

            public Builder removeDownEvent(int i7) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).removeDownEvent(i7);
                return this;
            }

            public Builder removeMoveEvent(int i7) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).removeMoveEvent(i7);
                return this;
            }

            public Builder removeUpEvent(int i7) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).removeUpEvent(i7);
                return this;
            }

            public Builder setAbsXMax(int i7) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).setAbsXMax(i7);
                return this;
            }

            public Builder setAbsXMin(int i7) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).setAbsXMin(i7);
                return this;
            }

            public Builder setAbsYMax(int i7) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).setAbsYMax(i7);
                return this;
            }

            public Builder setAbsYMin(int i7) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).setAbsYMin(i7);
                return this;
            }

            public Builder setCid(int i7) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).setCid(i7);
                return this;
            }

            public Builder setDevice(String str) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).setDevice(str);
                return this;
            }

            public Builder setDeviceBytes(l lVar) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).setDeviceBytes(lVar);
                return this;
            }

            public Builder setDownEvent(int i7, CarlifeTouchEventProto.CarlifeTouchEvent.Builder builder) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).setDownEvent(i7, (CarlifeTouchEventProto.CarlifeTouchEvent) builder.m16build());
                return this;
            }

            public Builder setDownEvent(int i7, CarlifeTouchEventProto.CarlifeTouchEvent carlifeTouchEvent) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).setDownEvent(i7, carlifeTouchEvent);
                return this;
            }

            public Builder setEventx(int i7) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).setEventx(i7);
                return this;
            }

            public Builder setMoveEvent(int i7, CarlifeTouchEventProto.CarlifeTouchEvent.Builder builder) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).setMoveEvent(i7, (CarlifeTouchEventProto.CarlifeTouchEvent) builder.m16build());
                return this;
            }

            public Builder setMoveEvent(int i7, CarlifeTouchEventProto.CarlifeTouchEvent carlifeTouchEvent) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).setMoveEvent(i7, carlifeTouchEvent);
                return this;
            }

            public Builder setScreenHeight(int i7) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).setScreenHeight(i7);
                return this;
            }

            public Builder setScreenWidth(int i7) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).setScreenWidth(i7);
                return this;
            }

            public Builder setUpEvent(int i7, CarlifeTouchEventProto.CarlifeTouchEvent.Builder builder) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).setUpEvent(i7, (CarlifeTouchEventProto.CarlifeTouchEvent) builder.m16build());
                return this;
            }

            public Builder setUpEvent(int i7, CarlifeTouchEventProto.CarlifeTouchEvent carlifeTouchEvent) {
                copyOnWrite();
                ((CarlifeTouchEventDevice) this.instance).setUpEvent(i7, carlifeTouchEvent);
                return this;
            }
        }

        static {
            CarlifeTouchEventDevice carlifeTouchEventDevice = new CarlifeTouchEventDevice();
            DEFAULT_INSTANCE = carlifeTouchEventDevice;
            j0.registerDefaultInstance(CarlifeTouchEventDevice.class, carlifeTouchEventDevice);
        }

        private CarlifeTouchEventDevice() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDownEvent(Iterable<? extends CarlifeTouchEventProto.CarlifeTouchEvent> iterable) {
            ensureDownEventIsMutable();
            c.addAll((Iterable) iterable, (List) this.downEvent_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMoveEvent(Iterable<? extends CarlifeTouchEventProto.CarlifeTouchEvent> iterable) {
            ensureMoveEventIsMutable();
            c.addAll((Iterable) iterable, (List) this.moveEvent_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUpEvent(Iterable<? extends CarlifeTouchEventProto.CarlifeTouchEvent> iterable) {
            ensureUpEventIsMutable();
            c.addAll((Iterable) iterable, (List) this.upEvent_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDownEvent(int i7, CarlifeTouchEventProto.CarlifeTouchEvent carlifeTouchEvent) {
            carlifeTouchEvent.getClass();
            ensureDownEventIsMutable();
            this.downEvent_.add(i7, carlifeTouchEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDownEvent(CarlifeTouchEventProto.CarlifeTouchEvent carlifeTouchEvent) {
            carlifeTouchEvent.getClass();
            ensureDownEventIsMutable();
            this.downEvent_.add(carlifeTouchEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMoveEvent(int i7, CarlifeTouchEventProto.CarlifeTouchEvent carlifeTouchEvent) {
            carlifeTouchEvent.getClass();
            ensureMoveEventIsMutable();
            this.moveEvent_.add(i7, carlifeTouchEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMoveEvent(CarlifeTouchEventProto.CarlifeTouchEvent carlifeTouchEvent) {
            carlifeTouchEvent.getClass();
            ensureMoveEventIsMutable();
            this.moveEvent_.add(carlifeTouchEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUpEvent(int i7, CarlifeTouchEventProto.CarlifeTouchEvent carlifeTouchEvent) {
            carlifeTouchEvent.getClass();
            ensureUpEventIsMutable();
            this.upEvent_.add(i7, carlifeTouchEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUpEvent(CarlifeTouchEventProto.CarlifeTouchEvent carlifeTouchEvent) {
            carlifeTouchEvent.getClass();
            ensureUpEventIsMutable();
            this.upEvent_.add(carlifeTouchEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAbsXMax() {
            this.bitField0_ &= -33;
            this.absXMax_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAbsXMin() {
            this.bitField0_ &= -17;
            this.absXMin_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAbsYMax() {
            this.bitField0_ &= -129;
            this.absYMax_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAbsYMin() {
            this.bitField0_ &= -65;
            this.absYMin_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCid() {
            this.bitField0_ &= -2;
            this.cid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDevice() {
            this.bitField0_ &= -257;
            this.device_ = getDefaultInstance().getDevice();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDownEvent() {
            this.downEvent_ = j0.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventx() {
            this.bitField0_ &= -3;
            this.eventx_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMoveEvent() {
            this.moveEvent_ = j0.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenHeight() {
            this.bitField0_ &= -9;
            this.screenHeight_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenWidth() {
            this.bitField0_ &= -5;
            this.screenWidth_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpEvent() {
            this.upEvent_ = j0.emptyProtobufList();
        }

        private void ensureDownEventIsMutable() {
            t0 t0Var = this.downEvent_;
            if (((d) t0Var).f2729a) {
                return;
            }
            this.downEvent_ = j0.mutableCopy(t0Var);
        }

        private void ensureMoveEventIsMutable() {
            t0 t0Var = this.moveEvent_;
            if (((d) t0Var).f2729a) {
                return;
            }
            this.moveEvent_ = j0.mutableCopy(t0Var);
        }

        private void ensureUpEventIsMutable() {
            t0 t0Var = this.upEvent_;
            if (((d) t0Var).f2729a) {
                return;
            }
            this.upEvent_ = j0.mutableCopy(t0Var);
        }

        public static CarlifeTouchEventDevice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeTouchEventDevice carlifeTouchEventDevice) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeTouchEventDevice);
        }

        public static CarlifeTouchEventDevice parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeTouchEventDevice) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeTouchEventDevice parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeTouchEventDevice) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeTouchEventDevice parseFrom(l lVar) {
            return (CarlifeTouchEventDevice) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeTouchEventDevice parseFrom(l lVar, y yVar) {
            return (CarlifeTouchEventDevice) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeTouchEventDevice parseFrom(p pVar) {
            return (CarlifeTouchEventDevice) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeTouchEventDevice parseFrom(p pVar, y yVar) {
            return (CarlifeTouchEventDevice) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeTouchEventDevice parseFrom(InputStream inputStream) {
            return (CarlifeTouchEventDevice) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeTouchEventDevice parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeTouchEventDevice) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeTouchEventDevice parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeTouchEventDevice) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeTouchEventDevice parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeTouchEventDevice) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeTouchEventDevice parseFrom(byte[] bArr) {
            return (CarlifeTouchEventDevice) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeTouchEventDevice parseFrom(byte[] bArr, y yVar) {
            return (CarlifeTouchEventDevice) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDownEvent(int i7) {
            ensureDownEventIsMutable();
            this.downEvent_.remove(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMoveEvent(int i7) {
            ensureMoveEventIsMutable();
            this.moveEvent_.remove(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUpEvent(int i7) {
            ensureUpEventIsMutable();
            this.upEvent_.remove(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAbsXMax(int i7) {
            this.bitField0_ |= 32;
            this.absXMax_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAbsXMin(int i7) {
            this.bitField0_ |= 16;
            this.absXMin_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAbsYMax(int i7) {
            this.bitField0_ |= 128;
            this.absYMax_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAbsYMin(int i7) {
            this.bitField0_ |= 64;
            this.absYMin_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCid(int i7) {
            this.bitField0_ |= 1;
            this.cid_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDevice(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.device_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceBytes(l lVar) {
            this.device_ = lVar.u();
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDownEvent(int i7, CarlifeTouchEventProto.CarlifeTouchEvent carlifeTouchEvent) {
            carlifeTouchEvent.getClass();
            ensureDownEventIsMutable();
            this.downEvent_.set(i7, carlifeTouchEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventx(int i7) {
            this.bitField0_ |= 2;
            this.eventx_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMoveEvent(int i7, CarlifeTouchEventProto.CarlifeTouchEvent carlifeTouchEvent) {
            carlifeTouchEvent.getClass();
            ensureMoveEventIsMutable();
            this.moveEvent_.set(i7, carlifeTouchEvent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenHeight(int i7) {
            this.bitField0_ |= 8;
            this.screenHeight_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenWidth(int i7) {
            this.bitField0_ |= 4;
            this.screenWidth_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpEvent(int i7, CarlifeTouchEventProto.CarlifeTouchEvent carlifeTouchEvent) {
            carlifeTouchEvent.getClass();
            ensureUpEventIsMutable();
            this.upEvent_.set(i7, carlifeTouchEvent);
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0003\f\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005ᔄ\u0004\u0006ᔄ\u0005\u0007ᔄ\u0006\bᔄ\u0007\tᔈ\b\nЛ\u000bЛ\fЛ", new Object[]{"bitField0_", "cid_", "eventx_", "screenWidth_", "screenHeight_", "absXMin_", "absXMax_", "absYMin_", "absYMax_", "device_", "downEvent_", CarlifeTouchEventProto.CarlifeTouchEvent.class, "upEvent_", CarlifeTouchEventProto.CarlifeTouchEvent.class, "moveEvent_", CarlifeTouchEventProto.CarlifeTouchEvent.class});
                case 3:
                    return new CarlifeTouchEventDevice();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeTouchEventDevice.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public int getAbsXMax() {
            return this.absXMax_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public int getAbsXMin() {
            return this.absXMin_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public int getAbsYMax() {
            return this.absYMax_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public int getAbsYMin() {
            return this.absYMin_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public int getCid() {
            return this.cid_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public String getDevice() {
            return this.device_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public l getDeviceBytes() {
            return l.m(this.device_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public CarlifeTouchEventProto.CarlifeTouchEvent getDownEvent(int i7) {
            return (CarlifeTouchEventProto.CarlifeTouchEvent) this.downEvent_.get(i7);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public int getDownEventCount() {
            return this.downEvent_.size();
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public List<CarlifeTouchEventProto.CarlifeTouchEvent> getDownEventList() {
            return this.downEvent_;
        }

        public CarlifeTouchEventProto.CarlifeTouchEventOrBuilder getDownEventOrBuilder(int i7) {
            return (CarlifeTouchEventProto.CarlifeTouchEventOrBuilder) this.downEvent_.get(i7);
        }

        public List<? extends CarlifeTouchEventProto.CarlifeTouchEventOrBuilder> getDownEventOrBuilderList() {
            return this.downEvent_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public int getEventx() {
            return this.eventx_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public CarlifeTouchEventProto.CarlifeTouchEvent getMoveEvent(int i7) {
            return (CarlifeTouchEventProto.CarlifeTouchEvent) this.moveEvent_.get(i7);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public int getMoveEventCount() {
            return this.moveEvent_.size();
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public List<CarlifeTouchEventProto.CarlifeTouchEvent> getMoveEventList() {
            return this.moveEvent_;
        }

        public CarlifeTouchEventProto.CarlifeTouchEventOrBuilder getMoveEventOrBuilder(int i7) {
            return (CarlifeTouchEventProto.CarlifeTouchEventOrBuilder) this.moveEvent_.get(i7);
        }

        public List<? extends CarlifeTouchEventProto.CarlifeTouchEventOrBuilder> getMoveEventOrBuilderList() {
            return this.moveEvent_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public int getScreenHeight() {
            return this.screenHeight_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public int getScreenWidth() {
            return this.screenWidth_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public CarlifeTouchEventProto.CarlifeTouchEvent getUpEvent(int i7) {
            return (CarlifeTouchEventProto.CarlifeTouchEvent) this.upEvent_.get(i7);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public int getUpEventCount() {
            return this.upEvent_.size();
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public List<CarlifeTouchEventProto.CarlifeTouchEvent> getUpEventList() {
            return this.upEvent_;
        }

        public CarlifeTouchEventProto.CarlifeTouchEventOrBuilder getUpEventOrBuilder(int i7) {
            return (CarlifeTouchEventProto.CarlifeTouchEventOrBuilder) this.upEvent_.get(i7);
        }

        public List<? extends CarlifeTouchEventProto.CarlifeTouchEventOrBuilder> getUpEventOrBuilderList() {
            return this.upEvent_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public boolean hasAbsXMax() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public boolean hasAbsXMin() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public boolean hasAbsYMax() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public boolean hasAbsYMin() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public boolean hasCid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public boolean hasDevice() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public boolean hasEventx() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public boolean hasScreenHeight() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeTouchEventDeviceProto.CarlifeTouchEventDeviceOrBuilder
        public boolean hasScreenWidth() {
            return (this.bitField0_ & 4) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeTouchEventDeviceOrBuilder extends m1 {
        int getAbsXMax();

        int getAbsXMin();

        int getAbsYMax();

        int getAbsYMin();

        int getCid();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        String getDevice();

        l getDeviceBytes();

        CarlifeTouchEventProto.CarlifeTouchEvent getDownEvent(int i7);

        int getDownEventCount();

        List<CarlifeTouchEventProto.CarlifeTouchEvent> getDownEventList();

        int getEventx();

        CarlifeTouchEventProto.CarlifeTouchEvent getMoveEvent(int i7);

        int getMoveEventCount();

        List<CarlifeTouchEventProto.CarlifeTouchEvent> getMoveEventList();

        int getScreenHeight();

        int getScreenWidth();

        CarlifeTouchEventProto.CarlifeTouchEvent getUpEvent(int i7);

        int getUpEventCount();

        List<CarlifeTouchEventProto.CarlifeTouchEvent> getUpEventList();

        boolean hasAbsXMax();

        boolean hasAbsXMin();

        boolean hasAbsYMax();

        boolean hasAbsYMin();

        boolean hasCid();

        boolean hasDevice();

        boolean hasEventx();

        boolean hasScreenHeight();

        boolean hasScreenWidth();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeTouchEventDeviceProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

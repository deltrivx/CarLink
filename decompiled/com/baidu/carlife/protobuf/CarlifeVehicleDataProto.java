package com.baidu.carlife.protobuf;

import com.google.protobuf.c;
import com.google.protobuf.c0;
import com.google.protobuf.d;
import com.google.protobuf.d1;
import com.google.protobuf.e0;
import com.google.protobuf.f0;
import com.google.protobuf.i0;
import com.google.protobuf.j0;
import com.google.protobuf.k0;
import com.google.protobuf.l;
import com.google.protobuf.l1;
import com.google.protobuf.m1;
import com.google.protobuf.p;
import com.google.protobuf.q0;
import com.google.protobuf.r0;
import com.google.protobuf.s0;
import com.google.protobuf.s1;
import com.google.protobuf.y;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class CarlifeVehicleDataProto {

    /* JADX INFO: renamed from: com.baidu.carlife.protobuf.CarlifeVehicleDataProto$1, reason: invalid class name */
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
    public static final class CarlifeVehicleData extends j0 implements CarlifeVehicleDataOrBuilder {
        public static final int AREA_ID_FIELD_NUMBER = 3;
        public static final int AREA_VALUE_FIELD_NUMBER = 4;
        public static final int BYTES_VALUE_FIELD_NUMBER = 6;
        private static final CarlifeVehicleData DEFAULT_INSTANCE;
        public static final int FLOAT_VALUES_FIELD_NUMBER = 9;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int INT32_VALUES_FIELD_NUMBER = 7;
        public static final int INT64_VALUES_FIELD_NUMBER = 8;
        private static volatile s1 PARSER = null;
        public static final int STRING_VALUE_FIELD_NUMBER = 10;
        public static final int SUPPORT_FIELD_NUMBER = 2;
        public static final int VALUE_TYPE_FIELD_NUMBER = 5;
        private int areaId_;
        private int bitField0_;
        private int id_;
        private boolean support_;
        private int valueType_;
        private byte memoizedIsInitialized = 2;
        private r0 areaValue_ = j0.emptyIntList();
        private l bytesValue_ = l.f2785b;
        private r0 int32Values_ = j0.emptyIntList();
        private s0 int64Values_ = j0.emptyLongList();
        private q0 floatValues_ = j0.emptyFloatList();
        private String stringValue_ = "";

        /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
        public static final class Builder extends e0 implements CarlifeVehicleDataOrBuilder {
            private Builder() {
                super(CarlifeVehicleData.DEFAULT_INSTANCE);
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllAreaValue(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).addAllAreaValue(iterable);
                return this;
            }

            public Builder addAllFloatValues(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).addAllFloatValues(iterable);
                return this;
            }

            public Builder addAllInt32Values(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).addAllInt32Values(iterable);
                return this;
            }

            public Builder addAllInt64Values(Iterable<? extends Long> iterable) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).addAllInt64Values(iterable);
                return this;
            }

            public Builder addAreaValue(int i7) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).addAreaValue(i7);
                return this;
            }

            public Builder addFloatValues(float f10) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).addFloatValues(f10);
                return this;
            }

            public Builder addInt32Values(int i7) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).addInt32Values(i7);
                return this;
            }

            public Builder addInt64Values(long j5) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).addInt64Values(j5);
                return this;
            }

            public Builder clearAreaId() {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).clearAreaId();
                return this;
            }

            public Builder clearAreaValue() {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).clearAreaValue();
                return this;
            }

            public Builder clearBytesValue() {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).clearBytesValue();
                return this;
            }

            public Builder clearFloatValues() {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).clearFloatValues();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).clearId();
                return this;
            }

            public Builder clearInt32Values() {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).clearInt32Values();
                return this;
            }

            public Builder clearInt64Values() {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).clearInt64Values();
                return this;
            }

            public Builder clearStringValue() {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).clearStringValue();
                return this;
            }

            public Builder clearSupport() {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).clearSupport();
                return this;
            }

            public Builder clearValueType() {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).clearValueType();
                return this;
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public int getAreaId() {
                return ((CarlifeVehicleData) this.instance).getAreaId();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public int getAreaValue(int i7) {
                return ((CarlifeVehicleData) this.instance).getAreaValue(i7);
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public int getAreaValueCount() {
                return ((CarlifeVehicleData) this.instance).getAreaValueCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public List<Integer> getAreaValueList() {
                return Collections.unmodifiableList(((CarlifeVehicleData) this.instance).getAreaValueList());
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public l getBytesValue() {
                return ((CarlifeVehicleData) this.instance).getBytesValue();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public float getFloatValues(int i7) {
                return ((CarlifeVehicleData) this.instance).getFloatValues(i7);
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public int getFloatValuesCount() {
                return ((CarlifeVehicleData) this.instance).getFloatValuesCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public List<Float> getFloatValuesList() {
                return Collections.unmodifiableList(((CarlifeVehicleData) this.instance).getFloatValuesList());
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public int getId() {
                return ((CarlifeVehicleData) this.instance).getId();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public int getInt32Values(int i7) {
                return ((CarlifeVehicleData) this.instance).getInt32Values(i7);
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public int getInt32ValuesCount() {
                return ((CarlifeVehicleData) this.instance).getInt32ValuesCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public List<Integer> getInt32ValuesList() {
                return Collections.unmodifiableList(((CarlifeVehicleData) this.instance).getInt32ValuesList());
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public long getInt64Values(int i7) {
                return ((CarlifeVehicleData) this.instance).getInt64Values(i7);
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public int getInt64ValuesCount() {
                return ((CarlifeVehicleData) this.instance).getInt64ValuesCount();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public List<Long> getInt64ValuesList() {
                return Collections.unmodifiableList(((CarlifeVehicleData) this.instance).getInt64ValuesList());
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public String getStringValue() {
                return ((CarlifeVehicleData) this.instance).getStringValue();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public l getStringValueBytes() {
                return ((CarlifeVehicleData) this.instance).getStringValueBytes();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public boolean getSupport() {
                return ((CarlifeVehicleData) this.instance).getSupport();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public int getValueType() {
                return ((CarlifeVehicleData) this.instance).getValueType();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public boolean hasAreaId() {
                return ((CarlifeVehicleData) this.instance).hasAreaId();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public boolean hasBytesValue() {
                return ((CarlifeVehicleData) this.instance).hasBytesValue();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public boolean hasId() {
                return ((CarlifeVehicleData) this.instance).hasId();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public boolean hasStringValue() {
                return ((CarlifeVehicleData) this.instance).hasStringValue();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public boolean hasSupport() {
                return ((CarlifeVehicleData) this.instance).hasSupport();
            }

            @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
            public boolean hasValueType() {
                return ((CarlifeVehicleData) this.instance).hasValueType();
            }

            public Builder setAreaId(int i7) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).setAreaId(i7);
                return this;
            }

            public Builder setAreaValue(int i7, int i10) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).setAreaValue(i7, i10);
                return this;
            }

            public Builder setBytesValue(l lVar) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).setBytesValue(lVar);
                return this;
            }

            public Builder setFloatValues(int i7, float f10) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).setFloatValues(i7, f10);
                return this;
            }

            public Builder setId(int i7) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).setId(i7);
                return this;
            }

            public Builder setInt32Values(int i7, int i10) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).setInt32Values(i7, i10);
                return this;
            }

            public Builder setInt64Values(int i7, long j5) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).setInt64Values(i7, j5);
                return this;
            }

            public Builder setStringValue(String str) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).setStringValue(str);
                return this;
            }

            public Builder setStringValueBytes(l lVar) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).setStringValueBytes(lVar);
                return this;
            }

            public Builder setSupport(boolean z10) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).setSupport(z10);
                return this;
            }

            public Builder setValueType(int i7) {
                copyOnWrite();
                ((CarlifeVehicleData) this.instance).setValueType(i7);
                return this;
            }
        }

        static {
            CarlifeVehicleData carlifeVehicleData = new CarlifeVehicleData();
            DEFAULT_INSTANCE = carlifeVehicleData;
            j0.registerDefaultInstance(CarlifeVehicleData.class, carlifeVehicleData);
        }

        private CarlifeVehicleData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAreaValue(Iterable<? extends Integer> iterable) {
            ensureAreaValueIsMutable();
            c.addAll((Iterable) iterable, (List) this.areaValue_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFloatValues(Iterable<? extends Float> iterable) {
            ensureFloatValuesIsMutable();
            c.addAll((Iterable) iterable, (List) this.floatValues_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllInt32Values(Iterable<? extends Integer> iterable) {
            ensureInt32ValuesIsMutable();
            c.addAll((Iterable) iterable, (List) this.int32Values_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllInt64Values(Iterable<? extends Long> iterable) {
            ensureInt64ValuesIsMutable();
            c.addAll((Iterable) iterable, (List) this.int64Values_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAreaValue(int i7) {
            ensureAreaValueIsMutable();
            ((k0) this.areaValue_).d(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFloatValues(float f10) {
            ensureFloatValuesIsMutable();
            ((c0) this.floatValues_).d(f10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addInt32Values(int i7) {
            ensureInt32ValuesIsMutable();
            ((k0) this.int32Values_).d(i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addInt64Values(long j5) {
            ensureInt64ValuesIsMutable();
            ((d1) this.int64Values_).d(j5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAreaId() {
            this.bitField0_ &= -5;
            this.areaId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAreaValue() {
            this.areaValue_ = j0.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBytesValue() {
            this.bitField0_ &= -17;
            this.bytesValue_ = getDefaultInstance().getBytesValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFloatValues() {
            this.floatValues_ = j0.emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.bitField0_ &= -2;
            this.id_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInt32Values() {
            this.int32Values_ = j0.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInt64Values() {
            this.int64Values_ = j0.emptyLongList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStringValue() {
            this.bitField0_ &= -33;
            this.stringValue_ = getDefaultInstance().getStringValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSupport() {
            this.bitField0_ &= -3;
            this.support_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValueType() {
            this.bitField0_ &= -9;
            this.valueType_ = 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void ensureAreaValueIsMutable() {
            r0 r0Var = this.areaValue_;
            if (((d) r0Var).f2729a) {
                return;
            }
            this.areaValue_ = j0.mutableCopy(r0Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void ensureFloatValuesIsMutable() {
            q0 q0Var = this.floatValues_;
            if (((d) q0Var).f2729a) {
                return;
            }
            this.floatValues_ = j0.mutableCopy(q0Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void ensureInt32ValuesIsMutable() {
            r0 r0Var = this.int32Values_;
            if (((d) r0Var).f2729a) {
                return;
            }
            this.int32Values_ = j0.mutableCopy(r0Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void ensureInt64ValuesIsMutable() {
            s0 s0Var = this.int64Values_;
            if (((d) s0Var).f2729a) {
                return;
            }
            this.int64Values_ = j0.mutableCopy(s0Var);
        }

        public static CarlifeVehicleData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CarlifeVehicleData carlifeVehicleData) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(carlifeVehicleData);
        }

        public static CarlifeVehicleData parseDelimitedFrom(InputStream inputStream) {
            return (CarlifeVehicleData) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeVehicleData parseDelimitedFrom(InputStream inputStream, y yVar) {
            return (CarlifeVehicleData) j0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeVehicleData parseFrom(l lVar) {
            return (CarlifeVehicleData) j0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CarlifeVehicleData parseFrom(l lVar, y yVar) {
            return (CarlifeVehicleData) j0.parseFrom(DEFAULT_INSTANCE, lVar, yVar);
        }

        public static CarlifeVehicleData parseFrom(p pVar) {
            return (CarlifeVehicleData) j0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static CarlifeVehicleData parseFrom(p pVar, y yVar) {
            return (CarlifeVehicleData) j0.parseFrom(DEFAULT_INSTANCE, pVar, yVar);
        }

        public static CarlifeVehicleData parseFrom(InputStream inputStream) {
            return (CarlifeVehicleData) j0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CarlifeVehicleData parseFrom(InputStream inputStream, y yVar) {
            return (CarlifeVehicleData) j0.parseFrom(DEFAULT_INSTANCE, inputStream, yVar);
        }

        public static CarlifeVehicleData parseFrom(ByteBuffer byteBuffer) {
            return (CarlifeVehicleData) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CarlifeVehicleData parseFrom(ByteBuffer byteBuffer, y yVar) {
            return (CarlifeVehicleData) j0.parseFrom(DEFAULT_INSTANCE, byteBuffer, yVar);
        }

        public static CarlifeVehicleData parseFrom(byte[] bArr) {
            return (CarlifeVehicleData) j0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CarlifeVehicleData parseFrom(byte[] bArr, y yVar) {
            return (CarlifeVehicleData) j0.parseFrom(DEFAULT_INSTANCE, bArr, yVar);
        }

        public static s1 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAreaId(int i7) {
            this.bitField0_ |= 4;
            this.areaId_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAreaValue(int i7, int i10) {
            ensureAreaValueIsMutable();
            ((k0) this.areaValue_).n(i7, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBytesValue(l lVar) {
            lVar.getClass();
            this.bitField0_ |= 16;
            this.bytesValue_ = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloatValues(int i7, float f10) {
            ensureFloatValuesIsMutable();
            c0 c0Var = (c0) this.floatValues_;
            c0Var.c();
            c0Var.k(i7);
            float[] fArr = c0Var.f2724b;
            float f11 = fArr[i7];
            fArr[i7] = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(int i7) {
            this.bitField0_ |= 1;
            this.id_ = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInt32Values(int i7, int i10) {
            ensureInt32ValuesIsMutable();
            ((k0) this.int32Values_).n(i7, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInt64Values(int i7, long j5) {
            ensureInt64ValuesIsMutable();
            d1 d1Var = (d1) this.int64Values_;
            d1Var.c();
            d1Var.k(i7);
            long[] jArr = d1Var.f2733b;
            long j10 = jArr[i7];
            jArr[i7] = j5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.stringValue_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValueBytes(l lVar) {
            this.stringValue_ = lVar.u();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSupport(boolean z10) {
            this.bitField0_ |= 2;
            this.support_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueType(int i7) {
            this.bitField0_ |= 8;
            this.valueType_ = i7;
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
                    return j0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0004\u0001\u0001ᔄ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004\u0016\u0005င\u0003\u0006ည\u0004\u0007!\b\"\t\u0013\nဈ\u0005", new Object[]{"bitField0_", "id_", "support_", "areaId_", "areaValue_", "valueType_", "bytesValue_", "int32Values_", "int64Values_", "floatValues_", "stringValue_"});
                case 3:
                    return new CarlifeVehicleData();
                case 4:
                    return new Builder(anonymousClass1);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    s1 s1Var = PARSER;
                    if (s1Var != null) {
                        return s1Var;
                    }
                    synchronized (CarlifeVehicleData.class) {
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

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public int getAreaId() {
            return this.areaId_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public int getAreaValue(int i7) {
            return ((k0) this.areaValue_).m(i7);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public int getAreaValueCount() {
            return ((k0) this.areaValue_).size();
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public List<Integer> getAreaValueList() {
            return this.areaValue_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public l getBytesValue() {
            return this.bytesValue_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public float getFloatValues(int i7) {
            c0 c0Var = (c0) this.floatValues_;
            c0Var.k(i7);
            return c0Var.f2724b[i7];
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public int getFloatValuesCount() {
            return ((c0) this.floatValues_).size();
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public List<Float> getFloatValuesList() {
            return this.floatValues_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public int getInt32Values(int i7) {
            return ((k0) this.int32Values_).m(i7);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public int getInt32ValuesCount() {
            return ((k0) this.int32Values_).size();
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public List<Integer> getInt32ValuesList() {
            return this.int32Values_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public long getInt64Values(int i7) {
            return ((d1) this.int64Values_).m(i7);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public int getInt64ValuesCount() {
            return ((d1) this.int64Values_).size();
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public List<Long> getInt64ValuesList() {
            return this.int64Values_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public String getStringValue() {
            return this.stringValue_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public l getStringValueBytes() {
            return l.m(this.stringValue_);
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public boolean getSupport() {
            return this.support_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public int getValueType() {
            return this.valueType_;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public boolean hasAreaId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public boolean hasBytesValue() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public boolean hasStringValue() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public boolean hasSupport() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.baidu.carlife.protobuf.CarlifeVehicleDataProto.CarlifeVehicleDataOrBuilder
        public boolean hasValueType() {
            return (this.bitField0_ & 8) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public interface CarlifeVehicleDataOrBuilder extends m1 {
        int getAreaId();

        int getAreaValue(int i7);

        int getAreaValueCount();

        List<Integer> getAreaValueList();

        l getBytesValue();

        @Override // com.google.protobuf.m1
        /* synthetic */ l1 getDefaultInstanceForType();

        float getFloatValues(int i7);

        int getFloatValuesCount();

        List<Float> getFloatValuesList();

        int getId();

        int getInt32Values(int i7);

        int getInt32ValuesCount();

        List<Integer> getInt32ValuesList();

        long getInt64Values(int i7);

        int getInt64ValuesCount();

        List<Long> getInt64ValuesList();

        String getStringValue();

        l getStringValueBytes();

        boolean getSupport();

        int getValueType();

        boolean hasAreaId();

        boolean hasBytesValue();

        boolean hasId();

        boolean hasStringValue();

        boolean hasSupport();

        boolean hasValueType();

        /* synthetic */ boolean isInitialized();
    }

    private CarlifeVehicleDataProto() {
    }

    public static void registerAllExtensions(y yVar) {
    }
}

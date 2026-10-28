package com.baidu.carlife.sdk.internal.protocol.decoder;

import com.baidu.carlife.protobuf.CarlifeAccelerationProto;
import com.baidu.carlife.protobuf.CarlifeActiveRequestProto;
import com.baidu.carlife.protobuf.CarlifeAuthenRequestProto;
import com.baidu.carlife.protobuf.CarlifeAuthenResponseProto;
import com.baidu.carlife.protobuf.CarlifeAuthenResultProto;
import com.baidu.carlife.protobuf.CarlifeBTPairInfoProto;
import com.baidu.carlife.protobuf.CarlifeCarGpsProto;
import com.baidu.carlife.protobuf.CarlifeCarHardKeyCodeProto;
import com.baidu.carlife.protobuf.CarlifeCarSpeedProto;
import com.baidu.carlife.protobuf.CarlifeConnectTimeSyncProto;
import com.baidu.carlife.protobuf.CarlifeDeviceInfoProto;
import com.baidu.carlife.protobuf.CarlifeFileTransferBeginProto;
import com.baidu.carlife.protobuf.CarlifeGearInfoProto;
import com.baidu.carlife.protobuf.CarlifeGyroscopeProto;
import com.baidu.carlife.protobuf.CarlifeHuRsaPublicKeyResponseProto;
import com.baidu.carlife.protobuf.CarlifeMdAesKeyRequestProto;
import com.baidu.carlife.protobuf.CarlifeModuleStatusListProto;
import com.baidu.carlife.protobuf.CarlifeModuleStatusProto;
import com.baidu.carlife.protobuf.CarlifeMusicInitProto;
import com.baidu.carlife.protobuf.CarlifeNaviAssitantGuideInfoProto;
import com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto;
import com.baidu.carlife.protobuf.CarlifeOilProto;
import com.baidu.carlife.protobuf.CarlifeProtocolVersionMatchStatusProto;
import com.baidu.carlife.protobuf.CarlifeProtocolVersionProto;
import com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto;
import com.baidu.carlife.protobuf.CarlifeSubscribeMobileCarLifeInfoListProto;
import com.baidu.carlife.protobuf.CarlifeTouchActionProto;
import com.baidu.carlife.protobuf.CarlifeVehicleControlProto;
import com.baidu.carlife.protobuf.CarlifeVehicleInfoListProto;
import com.baidu.carlife.protobuf.CarlifeVehicleInfoProto;
import com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto;
import com.baidu.carlife.protobuf.CarlifeVideoFrameRateProto;
import com.baidu.carlife.protobuf.CarlifeWirlessInfoProto;
import com.baidu.carlife.protobuf.CarlifeWirlessIpProto;
import com.baidu.carlife.protobuf.CarlifeWirlessStatusProto;
import com.baidu.carlife.protobuf.CarlifeWirlessTargetProto;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.google.protobuf.p;
import h9.o;
import i9.l;
import i9.n;
import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0005R2\u0010\u0003\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004j\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/baidu/carlife/sdk/internal/protocol/decoder/PayloadDecoderFactory;", "", "()V", "decoders", "Ljava/util/HashMap;", "", "Lcom/baidu/carlife/sdk/internal/protocol/decoder/PayloadDecoder;", "Lkotlin/collections/HashMap;", "decoderOf", "serviceType", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class PayloadDecoderFactory {
    public static final PayloadDecoderFactory INSTANCE = new PayloadDecoderFactory();
    private static final HashMap<Integer, PayloadDecoder<?>> decoders;

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeActiveRequestProto$CarlifeActiveRequest;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass1 extends n implements o {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(3);
        }

        public final CarlifeActiveRequestProto.CarlifeActiveRequest invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeActiveRequestProto.CarlifeActiveRequest.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$10, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeVehicleInfoListProto$CarlifeVehicleInfoList;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass10 extends n implements o {
        public static final AnonymousClass10 INSTANCE = new AnonymousClass10();

        public AnonymousClass10() {
            super(3);
        }

        public final CarlifeVehicleInfoListProto.CarlifeVehicleInfoList invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeVehicleInfoListProto.CarlifeVehicleInfoList.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$11, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeVehicleInfoProto$CarlifeVehicleInfo;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass11 extends n implements o {
        public static final AnonymousClass11 INSTANCE = new AnonymousClass11();

        public AnonymousClass11() {
            super(3);
        }

        public final CarlifeVehicleInfoProto.CarlifeVehicleInfo invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeVehicleInfoProto.CarlifeVehicleInfo.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$12, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeVehicleInfoProto$CarlifeVehicleInfo;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass12 extends n implements o {
        public static final AnonymousClass12 INSTANCE = new AnonymousClass12();

        public AnonymousClass12() {
            super(3);
        }

        public final CarlifeVehicleInfoProto.CarlifeVehicleInfo invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeVehicleInfoProto.CarlifeVehicleInfo.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$13, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeSubscribeMobileCarLifeInfoListProto$CarlifeSubscribeMobileCarLifeInfoList;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass13 extends n implements o {
        public static final AnonymousClass13 INSTANCE = new AnonymousClass13();

        public AnonymousClass13() {
            super(3);
        }

        public final CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoList invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoList.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$14, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeSubscribeMobileCarLifeInfoListProto$CarlifeSubscribeMobileCarLifeInfoList;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass14 extends n implements o {
        public static final AnonymousClass14 INSTANCE = new AnonymousClass14();

        public AnonymousClass14() {
            super(3);
        }

        public final CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoList invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoList.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$15, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeSubscribeMobileCarLifeInfoListProto$CarlifeSubscribeMobileCarLifeInfoList;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass15 extends n implements o {
        public static final AnonymousClass15 INSTANCE = new AnonymousClass15();

        public AnonymousClass15() {
            super(3);
        }

        public final CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoList invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoList.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$16, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeSubscribeMobileCarLifeInfoListProto$CarlifeSubscribeMobileCarLifeInfoList;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass16 extends n implements o {
        public static final AnonymousClass16 INSTANCE = new AnonymousClass16();

        public AnonymousClass16() {
            super(3);
        }

        public final CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoList invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeSubscribeMobileCarLifeInfoListProto.CarlifeSubscribeMobileCarLifeInfoList.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$17, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeNaviAssitantGuideInfoProto$CarlifeNaviAssitantGuideInfo;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass17 extends n implements o {
        public static final AnonymousClass17 INSTANCE = new AnonymousClass17();

        public AnonymousClass17() {
            super(3);
        }

        public final CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeNaviAssitantGuideInfoProto.CarlifeNaviAssitantGuideInfo.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$18, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeNaviNextTurnInfoProto$CarlifeNaviNextTurnInfo;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass18 extends n implements o {
        public static final AnonymousClass18 INSTANCE = new AnonymousClass18();

        public AnonymousClass18() {
            super(3);
        }

        public final CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfo invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfo.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$19, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeTouchActionProto$CarlifeTouchAction;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass19 extends n implements o {
        public static final AnonymousClass19 INSTANCE = new AnonymousClass19();

        public AnonymousClass19() {
            super(3);
        }

        public final CarlifeTouchActionProto.CarlifeTouchAction invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeTouchActionProto.CarlifeTouchAction.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeProtocolVersionProto$CarlifeProtocolVersion;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass2 extends n implements o {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(3);
        }

        public final CarlifeProtocolVersionProto.CarlifeProtocolVersion invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeProtocolVersionProto.CarlifeProtocolVersion.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$20, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeConnectTimeSyncProto$CarlifeConnectTimeSync;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass20 extends n implements o {
        public static final AnonymousClass20 INSTANCE = new AnonymousClass20();

        public AnonymousClass20() {
            super(3);
        }

        public final CarlifeConnectTimeSyncProto.CarlifeConnectTimeSync invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeConnectTimeSyncProto.CarlifeConnectTimeSync.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$21, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeProtocolVersionMatchStatusProto$CarlifeProtocolVersionMatchStatus;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass21 extends n implements o {
        public static final AnonymousClass21 INSTANCE = new AnonymousClass21();

        public AnonymousClass21() {
            super(3);
        }

        public final CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$22, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeBTPairInfoProto$CarlifeBTPairInfo;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass22 extends n implements o {
        public static final AnonymousClass22 INSTANCE = new AnonymousClass22();

        public AnonymousClass22() {
            super(3);
        }

        public final CarlifeBTPairInfoProto.CarlifeBTPairInfo invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeBTPairInfoProto.CarlifeBTPairInfo.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$23, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeHuRsaPublicKeyResponseProto$CarlifeHuRsaPublicKeyResponse;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass23 extends n implements o {
        public static final AnonymousClass23 INSTANCE = new AnonymousClass23();

        public AnonymousClass23() {
            super(3);
        }

        public final CarlifeHuRsaPublicKeyResponseProto.CarlifeHuRsaPublicKeyResponse invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeHuRsaPublicKeyResponseProto.CarlifeHuRsaPublicKeyResponse.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$24, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeVideoEncoderInfoProto$CarlifeVideoEncoderInfo;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass24 extends n implements o {
        public static final AnonymousClass24 INSTANCE = new AnonymousClass24();

        public AnonymousClass24() {
            super(3);
        }

        public final CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$25, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeVideoFrameRateProto$CarlifeVideoFrameRate;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass25 extends n implements o {
        public static final AnonymousClass25 INSTANCE = new AnonymousClass25();

        public AnonymousClass25() {
            super(3);
        }

        public final CarlifeVideoFrameRateProto.CarlifeVideoFrameRate invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeVideoFrameRateProto.CarlifeVideoFrameRate.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$26, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeVideoFrameRateProto$CarlifeVideoFrameRate;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass26 extends n implements o {
        public static final AnonymousClass26 INSTANCE = new AnonymousClass26();

        public AnonymousClass26() {
            super(3);
        }

        public final CarlifeVideoFrameRateProto.CarlifeVideoFrameRate invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeVideoFrameRateProto.CarlifeVideoFrameRate.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$27, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeMusicInitProto$CarlifeMusicInit;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass27 extends n implements o {
        public static final AnonymousClass27 INSTANCE = new AnonymousClass27();

        public AnonymousClass27() {
            super(3);
        }

        public final CarlifeMusicInitProto.CarlifeMusicInit invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeMusicInitProto.CarlifeMusicInit.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$28, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeCarHardKeyCodeProto$CarlifeCarHardKeyCode;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass28 extends n implements o {
        public static final AnonymousClass28 INSTANCE = new AnonymousClass28();

        public AnonymousClass28() {
            super(3);
        }

        public final CarlifeCarHardKeyCodeProto.CarlifeCarHardKeyCode invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeCarHardKeyCodeProto.CarlifeCarHardKeyCode.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$29, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeWirlessInfoProto$CarlifeWirlessInfo;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass29 extends n implements o {
        public static final AnonymousClass29 INSTANCE = new AnonymousClass29();

        public AnonymousClass29() {
            super(3);
        }

        public final CarlifeWirlessInfoProto.CarlifeWirlessInfo invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeWirlessInfoProto.CarlifeWirlessInfo.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeDeviceInfoProto$CarlifeDeviceInfo;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass3 extends n implements o {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(3);
        }

        public final CarlifeDeviceInfoProto.CarlifeDeviceInfo invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeDeviceInfoProto.CarlifeDeviceInfo.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$30, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeWirlessTargetProto$CarlifeWirlessTarget;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass30 extends n implements o {
        public static final AnonymousClass30 INSTANCE = new AnonymousClass30();

        public AnonymousClass30() {
            super(3);
        }

        public final CarlifeWirlessTargetProto.CarlifeWirlessTarget invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeWirlessTargetProto.CarlifeWirlessTarget.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$31, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeWirlessStatusProto$CarlifeWirlessStatus;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass31 extends n implements o {
        public static final AnonymousClass31 INSTANCE = new AnonymousClass31();

        public AnonymousClass31() {
            super(3);
        }

        public final CarlifeWirlessStatusProto.CarlifeWirlessStatus invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeWirlessStatusProto.CarlifeWirlessStatus.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$32, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeAuthenRequestProto$CarlifeAuthenRequest;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass32 extends n implements o {
        public static final AnonymousClass32 INSTANCE = new AnonymousClass32();

        public AnonymousClass32() {
            super(3);
        }

        public final CarlifeAuthenRequestProto.CarlifeAuthenRequest invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeAuthenRequestProto.CarlifeAuthenRequest.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$33, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeAuthenResponseProto$CarlifeAuthenResponse;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass33 extends n implements o {
        public static final AnonymousClass33 INSTANCE = new AnonymousClass33();

        public AnonymousClass33() {
            super(3);
        }

        public final CarlifeAuthenResponseProto.CarlifeAuthenResponse invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeAuthenResponseProto.CarlifeAuthenResponse.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$34, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeAuthenResultProto$CarlifeAuthenResult;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass34 extends n implements o {
        public static final AnonymousClass34 INSTANCE = new AnonymousClass34();

        public AnonymousClass34() {
            super(3);
        }

        public final CarlifeAuthenResultProto.CarlifeAuthenResult invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeAuthenResultProto.CarlifeAuthenResult.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$35, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeFileTransferBeginProto$CarlifeFileTransferBegin;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass35 extends n implements o {
        public static final AnonymousClass35 INSTANCE = new AnonymousClass35();

        public AnonymousClass35() {
            super(3);
        }

        public final CarlifeFileTransferBeginProto.CarlifeFileTransferBegin invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeFileTransferBeginProto.CarlifeFileTransferBegin.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$36, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeWirlessIpProto$CarlifeWirlessIp;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass36 extends n implements o {
        public static final AnonymousClass36 INSTANCE = new AnonymousClass36();

        public AnonymousClass36() {
            super(3);
        }

        public final CarlifeWirlessIpProto.CarlifeWirlessIp invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeWirlessIpProto.CarlifeWirlessIp.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$37, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeMdAesKeyRequestProto$CarlifeMdAesKeyRequest;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass37 extends n implements o {
        public static final AnonymousClass37 INSTANCE = new AnonymousClass37();

        public AnonymousClass37() {
            super(3);
        }

        public final CarlifeMdAesKeyRequestProto.CarlifeMdAesKeyRequest invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeMdAesKeyRequestProto.CarlifeMdAesKeyRequest.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$38, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeVehicleControlProto$CarlifeVehicleControl;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass38 extends n implements o {
        public static final AnonymousClass38 INSTANCE = new AnonymousClass38();

        public AnonymousClass38() {
            super(3);
        }

        public final CarlifeVehicleControlProto.CarlifeVehicleControl invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeVehicleControlProto.CarlifeVehicleControl.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$39, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeCarGpsProto$CarlifeCarGps;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass39 extends n implements o {
        public static final AnonymousClass39 INSTANCE = new AnonymousClass39();

        public AnonymousClass39() {
            super(3);
        }

        public final CarlifeCarGpsProto.CarlifeCarGps invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeCarGpsProto.CarlifeCarGps.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeDeviceInfoProto$CarlifeDeviceInfo;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass4 extends n implements o {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(3);
        }

        public final CarlifeDeviceInfoProto.CarlifeDeviceInfo invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeDeviceInfoProto.CarlifeDeviceInfo.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$40, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeCarSpeedProto$CarlifeCarSpeed;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass40 extends n implements o {
        public static final AnonymousClass40 INSTANCE = new AnonymousClass40();

        public AnonymousClass40() {
            super(3);
        }

        public final CarlifeCarSpeedProto.CarlifeCarSpeed invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeCarSpeedProto.CarlifeCarSpeed.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$41, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeGyroscopeProto$CarlifeGyroscope;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass41 extends n implements o {
        public static final AnonymousClass41 INSTANCE = new AnonymousClass41();

        public AnonymousClass41() {
            super(3);
        }

        public final CarlifeGyroscopeProto.CarlifeGyroscope invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeGyroscopeProto.CarlifeGyroscope.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$42, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeAccelerationProto$CarlifeAcceleration;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass42 extends n implements o {
        public static final AnonymousClass42 INSTANCE = new AnonymousClass42();

        public AnonymousClass42() {
            super(3);
        }

        public final CarlifeAccelerationProto.CarlifeAcceleration invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeAccelerationProto.CarlifeAcceleration.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$43, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeGearInfoProto$CarlifeGearInfo;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass43 extends n implements o {
        public static final AnonymousClass43 INSTANCE = new AnonymousClass43();

        public AnonymousClass43() {
            super(3);
        }

        public final CarlifeGearInfoProto.CarlifeGearInfo invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeGearInfoProto.CarlifeGearInfo.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$44, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeOilProto$CarlifeOil;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass44 extends n implements o {
        public static final AnonymousClass44 INSTANCE = new AnonymousClass44();

        public AnonymousClass44() {
            super(3);
        }

        public final CarlifeOilProto.CarlifeOil invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeOilProto.CarlifeOil.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeStatisticsInfoProto$CarlifeStatisticsInfo;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass5 extends n implements o {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(3);
        }

        public final CarlifeStatisticsInfoProto.CarlifeStatisticsInfo invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeStatisticsInfoProto.CarlifeStatisticsInfo.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeAuthenResultProto$CarlifeAuthenResult;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass6 extends n implements o {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(3);
        }

        public final CarlifeAuthenResultProto.CarlifeAuthenResult invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeAuthenResultProto.CarlifeAuthenResult.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeVideoEncoderInfoProto$CarlifeVideoEncoderInfo;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass7 extends n implements o {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        public AnonymousClass7() {
            super(3);
        }

        public final CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$8, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeModuleStatusProto$CarlifeModuleStatus;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass8 extends n implements o {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        public AnonymousClass8() {
            super(3);
        }

        public final CarlifeModuleStatusProto.CarlifeModuleStatus invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeModuleStatusProto.CarlifeModuleStatus.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory$9, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeModuleStatusListProto$CarlifeModuleStatusList;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class AnonymousClass9 extends n implements o {
        public static final AnonymousClass9 INSTANCE = new AnonymousClass9();

        public AnonymousClass9() {
            super(3);
        }

        public final CarlifeModuleStatusListProto.CarlifeModuleStatusList invoke(byte[] bArr, int i7, int i10) {
            l.e(bArr, "payload");
            return CarlifeModuleStatusListProto.CarlifeModuleStatusList.parseFrom(p.f(bArr, i7, i10, false));
        }

        @Override // h9.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    static {
        HashMap<Integer, PayloadDecoder<?>> map = new HashMap<>();
        decoders = map;
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_BOX_ACTIVE), new PayloadDecoder<>(AnonymousClass1.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_HU_PROTOCOL_VERSION), new PayloadDecoder<>(AnonymousClass2.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_HU_INFO), new PayloadDecoder<>(AnonymousClass3.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_MD_INFO), new PayloadDecoder<>(AnonymousClass4.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_STATISTIC_INFO), new PayloadDecoder<>(AnonymousClass5.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_MD_AUTH_RESULT), new PayloadDecoder<>(AnonymousClass6.INSTANCE));
        PayloadDecoder<?> payloadDecoder = new PayloadDecoder<>(PayloadDecoderFactory$featureConfigDecoder$1.INSTANCE);
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_MD_FEATURE_CONFIG_REQUEST), payloadDecoder);
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_HU_FEATURE_CONFIG_RESPONSE), payloadDecoder);
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_VIDEO_ENCODER_INIT), new PayloadDecoder<>(AnonymousClass7.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_MODULE_CONTROL), new PayloadDecoder<>(AnonymousClass8.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_MODULE_STATUS), new PayloadDecoder<>(AnonymousClass9.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_CAR_DATA_SUBSCRIBE_RSP), new PayloadDecoder<>(AnonymousClass10.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_CAR_DATA_START_REQ), new PayloadDecoder<>(AnonymousClass11.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_CAR_DATA_STOP_REQ), new PayloadDecoder<>(AnonymousClass12.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_CARLIFE_DATA_SUBSCRIBE), new PayloadDecoder<>(AnonymousClass13.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_CARLIFE_DATA_SUBSCRIBE_DONE), new PayloadDecoder<>(AnonymousClass14.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_CARLIFE_DATA_SUBSCRIBE_START), new PayloadDecoder<>(AnonymousClass15.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_CARLIFE_DATA_SUBSCRIBE_STOP), new PayloadDecoder<>(AnonymousClass16.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_NAV_ASSISTANT_GUIDE_INFO), new PayloadDecoder<>(AnonymousClass17.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_NAV_NEXT_TURN_INFO), new PayloadDecoder<>(AnonymousClass18.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_TOUCH_ACTION), new PayloadDecoder<>(AnonymousClass19.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_TIME_SYNC), new PayloadDecoder<>(AnonymousClass20.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_PROTOCOL_VERSION_MATCH_STATUS), new PayloadDecoder<>(AnonymousClass21.INSTANCE));
        PayloadDecoder<?> payloadDecoder2 = new PayloadDecoder<>(PayloadDecoderFactory$touchSinglePointDecoder$1.INSTANCE);
        map.put(Integer.valueOf(ServiceTypes.MSG_TOUCH_ACTION_DOWN), payloadDecoder2);
        map.put(Integer.valueOf(ServiceTypes.MSG_TOUCH_ACTION_MOVE), payloadDecoder2);
        map.put(Integer.valueOf(ServiceTypes.MSG_TOUCH_ACTION_UP), payloadDecoder2);
        map.put(Integer.valueOf(ServiceTypes.MSG_TOUCH_SINGLE_CLICK), payloadDecoder2);
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_HU_BT_OOB_INFO), new PayloadDecoder<>(AnonymousClass22.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_HU_RSA_PUBLIC_KEY_RESPONSE), new PayloadDecoder<>(AnonymousClass23.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_VIDEO_ENCODER_INIT_DONE), new PayloadDecoder<>(AnonymousClass24.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_VIDEO_ENCODER_FRAME_RATE_CHANGE), new PayloadDecoder<>(AnonymousClass25.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_VIDEO_ENCODER_FRAME_RATE_CHANGE_DONE), new PayloadDecoder<>(AnonymousClass26.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_MEDIA_INIT), new PayloadDecoder<>(AnonymousClass27.INSTANCE));
        PayloadDecoder<?> payloadDecoder3 = new PayloadDecoder<>(PayloadDecoderFactory$ttsInitDecoder$1.INSTANCE);
        map.put(Integer.valueOf(ServiceTypes.MSG_NAV_TTS_INIT), payloadDecoder3);
        map.put(Integer.valueOf(ServiceTypes.MSG_VR_AUDIO_INIT), payloadDecoder3);
        map.put(Integer.valueOf(ServiceTypes.MSG_TOUCH_CAR_HARD_KEY_CODE), new PayloadDecoder<>(AnonymousClass28.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_WIRELESS_INFO_RESPONSE), new PayloadDecoder<>(AnonymousClass29.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_WIRELESS_TARGET_INFO_RESPONSE), new PayloadDecoder<>(AnonymousClass30.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_WIRELESS_MD_STATUS), new PayloadDecoder<>(AnonymousClass31.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_HU_AUTH_REQUEST), new PayloadDecoder<>(AnonymousClass32.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_MD_AUTH_RESPONSE), new PayloadDecoder<>(AnonymousClass33.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_HU_AUTH_RESULT), new PayloadDecoder<>(AnonymousClass34.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_DATA_MD_TRANSFER_START), new PayloadDecoder<>(AnonymousClass35.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_WIRELESS_RESPONSE_IP), new PayloadDecoder<>(AnonymousClass36.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_MD_AES_KEY_SEND_REQUEST), new PayloadDecoder<>(AnonymousClass37.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_VEHICLE_CONTROL), new PayloadDecoder<>(AnonymousClass38.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_CAR_GPS), new PayloadDecoder<>(AnonymousClass39.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_CAR_VELOCITY), new PayloadDecoder<>(AnonymousClass40.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_CAR_GYROSCOPE), new PayloadDecoder<>(AnonymousClass41.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_CAR_ACCELERATION), new PayloadDecoder<>(AnonymousClass42.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_CAR_GEAR), new PayloadDecoder<>(AnonymousClass43.INSTANCE));
        map.put(Integer.valueOf(ServiceTypes.MSG_CMD_CAR_OIL), new PayloadDecoder<>(AnonymousClass44.INSTANCE));
    }

    private PayloadDecoderFactory() {
    }

    public final PayloadDecoder<?> decoderOf(int serviceType) {
        return decoders.get(Integer.valueOf(serviceType));
    }
}

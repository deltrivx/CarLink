package com.baidu.carlife.sdk.internal.protocol.decoder;

import com.baidu.carlife.protobuf.CarlifeTouchSinglePointProto;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.google.protobuf.p;
import h9.o;
import i9.l;
import i9.n;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/baidu/carlife/protobuf/CarlifeTouchSinglePointProto$CarlifeTouchSinglePoint;", "kotlin.jvm.PlatformType", "payload", "", "offset", "", "length", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class PayloadDecoderFactory$touchSinglePointDecoder$1 extends n implements o {
    public static final PayloadDecoderFactory$touchSinglePointDecoder$1 INSTANCE = new PayloadDecoderFactory$touchSinglePointDecoder$1();

    public PayloadDecoderFactory$touchSinglePointDecoder$1() {
        super(3);
    }

    public final CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint invoke(byte[] bArr, int i7, int i10) {
        l.e(bArr, "payload");
        return CarlifeTouchSinglePointProto.CarlifeTouchSinglePoint.parseFrom(p.f(bArr, i7, i10, false));
    }

    @Override // h9.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((byte[]) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }
}

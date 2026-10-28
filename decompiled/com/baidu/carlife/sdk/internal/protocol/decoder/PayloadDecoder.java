package com.baidu.carlife.sdk.internal.protocol.decoder;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.o;
import i9.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR,\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/baidu/carlife/sdk/internal/protocol/decoder/PayloadDecoder;", "T", "", "Lkotlin/Function3;", "", "", "mapper", "<init>", "(Lh9/o;)V", "payload", "offset", "length", "decode", "([BII)Ljava/lang/Object;", "Lh9/o;", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class PayloadDecoder<T> {
    private final o mapper;

    public PayloadDecoder(o oVar) {
        l.e(oVar, "mapper");
        this.mapper = oVar;
    }

    public final T decode(byte[] payload, int offset, int length) {
        l.e(payload, "payload");
        return (T) this.mapper.invoke(payload, Integer.valueOf(offset), Integer.valueOf(length));
    }
}

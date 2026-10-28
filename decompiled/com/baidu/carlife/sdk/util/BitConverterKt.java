package com.baidu.carlife.sdk.util;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u001a-\u0010\t\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "", "offset", "toShort", "([BI)I", "toInt", "array", "byteSize", "Lt8/z;", "fillByteArray", "(I[BII)V", "carlife-sdk_release"}, k = 2, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class BitConverterKt {
    public static final void fillByteArray(int i7, byte[] bArr, int i10, int i11) {
        l.e(bArr, "array");
        int i12 = (i11 - 1) * 8;
        for (int i13 = 0; i13 < i11; i13++) {
            bArr[i10 + i13] = (byte) ((i7 >> i12) & 255);
            i12 -= 8;
        }
    }

    public static /* synthetic */ void fillByteArray$default(int i7, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 4;
        }
        fillByteArray(i7, bArr, i10, i11);
    }

    public static final int toInt(byte[] bArr, int i7) {
        l.e(bArr, "<this>");
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public static /* synthetic */ int toInt$default(byte[] bArr, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = 0;
        }
        return toInt(bArr, i7);
    }

    public static final int toShort(byte[] bArr, int i7) {
        l.e(bArr, "<this>");
        return (bArr[i7 + 1] & 255) | ((bArr[i7] & 255) << 8);
    }

    public static /* synthetic */ int toShort$default(byte[] bArr, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i7 = 0;
        }
        return toShort(bArr, i7);
    }
}

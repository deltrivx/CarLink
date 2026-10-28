package com.tencent.bugly.proguard;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f3454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f3455b;

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        for (int i7 = 0; i7 < 256; i7++) {
            bArr2[i7] = bArr[i7 >>> 4];
            bArr3[i7] = bArr[i7 & 15];
        }
        f3454a = bArr2;
        f3455b = bArr3;
    }

    public static boolean a(int i7, int i10) {
        return i7 == i10;
    }

    public static boolean a(long j5, long j10) {
        return j5 == j10;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    public static boolean a(boolean z10, boolean z11) {
        return z10 == z11;
    }

    public static byte[] a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        byte[] bArr = new byte[iPosition];
        System.arraycopy(byteBuffer.array(), 0, bArr, 0, iPosition);
        return bArr;
    }
}

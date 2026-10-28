package com.tencent.bugly.proguard;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f3415b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f3414a = new byte[0];

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byte b10 = bArr[i7];
            int i10 = i7 * 2;
            char[] cArr2 = f3415b;
            cArr[i10 + 1] = cArr2[b10 & 15];
            cArr[i10] = cArr2[((byte) (b10 >>> 4)) & 15];
        }
        return new String(cArr);
    }
}

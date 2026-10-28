package c6;

import b6.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f2434b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f2437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f2438f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f2433a = new int[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f2435c = new float[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f2436d = new float[4];

    public a() {
        int[] iArr = new int[8];
        this.f2434b = iArr;
        this.f2437e = new int[iArr.length / 2];
        this.f2438f = new int[iArr.length / 2];
    }

    public static void g(int[] iArr, float[] fArr) {
        int i7 = 0;
        float f10 = fArr[0];
        for (int i10 = 1; i10 < iArr.length; i10++) {
            float f11 = fArr[i10];
            if (f11 < f10) {
                i7 = i10;
                f10 = f11;
            }
        }
        iArr[i7] = iArr[i7] - 1;
    }

    public static void h(int[] iArr, float[] fArr) {
        int i7 = 0;
        float f10 = fArr[0];
        for (int i10 = 1; i10 < iArr.length; i10++) {
            float f11 = fArr[i10];
            if (f11 > f10) {
                i7 = i10;
                f10 = f11;
            }
        }
        iArr[i7] = iArr[i7] + 1;
    }

    public static boolean i(int[] iArr) {
        int i7 = iArr[0] + iArr[1];
        float f10 = i7 / ((iArr[2] + i7) + iArr[3]);
        if (f10 >= 0.7916667f && f10 <= 0.89285713f) {
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            for (int i12 : iArr) {
                if (i12 > i11) {
                    i11 = i12;
                }
                if (i12 < i10) {
                    i10 = i12;
                }
            }
            if (i11 < i10 * 10) {
                return true;
            }
        }
        return false;
    }
}

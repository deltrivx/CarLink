package t5;

import g1.j0;
import n5.i;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f12777e = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f12778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f12779b = f12777e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f12780c = new int[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f12781d;

    public e(j0 j0Var) {
        this.f12778a = j0Var;
    }

    public static int a(int[] iArr) throws i {
        int length = iArr.length;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i13 > i7) {
                i11 = i12;
                i7 = i13;
            }
            if (i13 > i10) {
                i10 = i13;
            }
        }
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            int i17 = i16 - i11;
            int i18 = iArr[i16] * i17 * i17;
            if (i18 > i15) {
                i14 = i16;
                i15 = i18;
            }
        }
        if (i11 <= i14) {
            int i19 = i11;
            i11 = i14;
            i14 = i19;
        }
        if (i11 - i14 <= length / 16) {
            throw i.f8833c;
        }
        int i20 = i11 - 1;
        int i21 = i20;
        int i22 = -1;
        while (i20 > i14) {
            int i23 = i20 - i14;
            int i24 = (i10 - iArr[i20]) * (i11 - i20) * i23 * i23;
            if (i24 > i22) {
                i21 = i20;
                i22 = i24;
            }
            i20--;
        }
        return i21 << 3;
    }
}

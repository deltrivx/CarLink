package h6;

import android.support.v4.media.session.r;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f6437e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f6438a = new int[929];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f6439b = new int[929];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f6440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f6441d;

    public a() {
        int i7 = 1;
        for (int i10 = 0; i10 < 929; i10++) {
            this.f6438a[i10] = i7;
            i7 = (i7 * 3) % 929;
        }
        for (int i11 = 0; i11 < 928; i11++) {
            this.f6439b[this.f6438a[i11]] = i11;
        }
        this.f6440c = new r(this, new int[]{0});
        this.f6441d = new r(this, new int[]{1});
    }

    public final int a(int i7, int i10) {
        return (i7 + i10) % 929;
    }

    public final int b(int i7) {
        if (i7 == 0) {
            throw new ArithmeticException();
        }
        return this.f6438a[928 - this.f6439b[i7]];
    }

    public final int c(int i7, int i10) {
        if (i7 == 0 || i10 == 0) {
            return 0;
        }
        int[] iArr = this.f6439b;
        return this.f6438a[(iArr[i7] + iArr[i10]) % 928];
    }
}

package l;

import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f7566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7568c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        int i7 = (int) ((f10 * this.f7568c) + 0.5f);
        int i10 = this.f7567b;
        int[] iArr = this.f7566a;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = iArr[i11];
            if (i7 < i12) {
                break;
            }
            i7 -= i12;
            i11++;
        }
        return (i11 / i10) + (i11 < i10 ? i7 / this.f7568c : 0.0f);
    }
}

package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15287b;

    public /* synthetic */ a(int i7) {
        this.f15287b = i7;
    }

    @Override // z.c
    public final float a(float f10, float f11, float f12) {
        switch (this.f15287b) {
            case 0:
                c.f15325a.getClass();
                float f13 = f11 + f10;
                if ((f10 >= 0.0f && f13 <= f12) || (f10 < 0.0f && f13 > f12)) {
                    return 0.0f;
                }
                float f14 = f13 - f12;
                return Math.abs(f10) < Math.abs(f14) ? f10 : f14;
            default:
                float fAbs = Math.abs((f11 + f10) - f10);
                float f15 = (0.3f * f12) - (0.0f * fAbs);
                float f16 = f12 - f15;
                if ((fAbs <= f12) && f16 < fAbs) {
                    f15 = f12 - fAbs;
                }
                return f10 - f15;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // z.c
    public final v.g0 b() {
        switch (this.f15287b) {
        }
        c.f15325a.getClass();
        return b.f15307b;
    }
}

package d2;

import a2.c;
import a2.d;
import f7.q;
import i9.l;
import n3.o;
import q2.j0;
import y1.k;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f3752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f3753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3754c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f3755d = o.f8749a;

    public abstract void a(float f10);

    public abstract void b(k kVar);

    public final void c(j0 j0Var, long j5, float f10, k kVar) {
        c cVar = j0Var.f10720a;
        if (this.f3754c != f10) {
            a(f10);
            this.f3754c = f10;
        }
        if (!l.a(this.f3753b, kVar)) {
            b(kVar);
            this.f3753b = kVar;
        }
        o layoutDirection = j0Var.getLayoutDirection();
        if (this.f3755d != layoutDirection) {
            this.f3755d = layoutDirection;
        }
        int i7 = (int) (j5 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j0Var.g() >> 32)) - Float.intBitsToFloat(i7);
        int i10 = (int) (j5 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j0Var.g() & 4294967295L)) - Float.intBitsToFloat(i10);
        ((d) cVar.f16b.f12b).q(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f10 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i7) > 0.0f && Float.intBitsToFloat(i10) > 0.0f) {
                    e(j0Var);
                }
            } finally {
                ((d) cVar.f16b.f12b).q(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    public abstract long d();

    public abstract void e(j0 j0Var);
}

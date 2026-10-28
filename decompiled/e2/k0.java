package e2;

import f1.h1;
import f1.k1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends d2.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f4211e = f1.b.s(new x1.e(0));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f4212f = f1.b.s(Boolean.FALSE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f0 f4213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h1 f4214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f4215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y1.k f4216j;
    public int k;

    public k0(c cVar) {
        f0 f0Var = new f0(cVar);
        f0Var.f4161f = new b1.a(4, this);
        this.f4213g = f0Var;
        this.f4214h = new h1(0);
        this.f4215i = 1.0f;
        this.k = -1;
    }

    @Override // d2.b
    public final void a(float f10) {
        this.f4215i = f10;
    }

    @Override // d2.b
    public final void b(y1.k kVar) {
        this.f4216j = kVar;
    }

    @Override // d2.b
    public final long d() {
        return ((x1.e) this.f4211e.getValue()).f14535a;
    }

    @Override // d2.b
    public final void e(q2.j0 j0Var) {
        a2.c cVar = j0Var.f10720a;
        y1.k kVar = this.f4216j;
        f0 f0Var = this.f4213g;
        if (kVar == null) {
            kVar = (y1.k) f0Var.f4162g.getValue();
        }
        if (((Boolean) this.f4212f.getValue()).booleanValue() && j0Var.getLayoutDirection() == n3.o.f8750b) {
            long jC0 = cVar.c0();
            a2.b bVar = cVar.f16b;
            long J = bVar.J();
            bVar.z().h();
            try {
                ((a2.d) bVar.f12b).y(-1.0f, 1.0f, jC0);
                f0Var.e(j0Var, this.f4215i, kVar);
                ob.a.y(bVar, J);
            } catch (Throwable th) {
                ob.a.y(bVar, J);
                throw th;
            }
        } else {
            f0Var.e(j0Var, this.f4215i, kVar);
        }
        this.k = this.f4214h.f();
    }
}

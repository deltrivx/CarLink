package d0;

import l0.q1;
import l0.s1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3593e;

    public /* synthetic */ m0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f3589a = i10;
        this.f3591c = obj;
        this.f3592d = obj2;
        this.f3593e = obj3;
        this.f3590b = i7;
    }

    public /* synthetic */ m0(o2.v0[] v0VarArr, n0 n0Var, int i7, int[] iArr) {
        this.f3589a = 0;
        this.f3591c = v0VarArr;
        this.f3592d = n0Var;
        this.f3590b = i7;
        this.f3593e = iArr;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f3589a) {
            case 0:
                o2.v0[] v0VarArr = (o2.v0[]) this.f3591c;
                n0 n0Var = (n0) this.f3592d;
                int[] iArr = (int[]) this.f3593e;
                o2.u0 u0Var = (o2.u0) obj;
                int length = v0VarArr.length;
                int i7 = 0;
                int i10 = 0;
                while (i7 < length) {
                    o2.v0 v0Var = v0VarArr[i7];
                    i9.l.b(v0Var);
                    v0Var.w();
                    o2.u0.f(u0Var, v0Var, iArr[i10], n0Var.f3601b.a(0, this.f3590b - v0Var.f9436b));
                    i7++;
                    i10++;
                }
                return t8.z.f12851a;
            case 1:
                f1.f0 f0Var = (f1.f0) this.f3591c;
                n1.d dVar = (n1.d) this.f3592d;
                s.c0 c0Var = (s.c0) this.f3593e;
                if (obj == f0Var) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof p1.z) {
                    int i11 = dVar.f8708a - this.f3590b;
                    int iD = c0Var.d(obj);
                    c0Var.h(Math.min(i11, iD >= 0 ? c0Var.f12399c[iD] : Integer.MAX_VALUE), obj);
                }
                return t8.z.f12851a;
            default:
                l0.k0 k0Var = (l0.k0) this.f3591c;
                o2.o0 o0Var = (o2.o0) this.f3592d;
                o2.v0 v0Var2 = (o2.v0) this.f3593e;
                o2.u0 u0Var2 = (o2.u0) obj;
                int i12 = k0Var.f7706b;
                q1 q1Var = k0Var.f7705a;
                g3.d0 d0Var = k0Var.f7707c;
                s1 s1Var = (s1) k0Var.f7708d.invoke();
                q1Var.a(z.x0.f15592b, l0.q0.i(u0Var2, i12, d0Var, s1Var != null ? s1Var.f7828a : null, o0Var.getLayoutDirection() == n3.o.f8750b, v0Var2.f9435a), this.f3590b, v0Var2.f9435a);
                o2.u0.j(u0Var2, v0Var2, Math.round(-q1Var.f7803a.f()), 0);
                return t8.z.f12851a;
        }
    }
}

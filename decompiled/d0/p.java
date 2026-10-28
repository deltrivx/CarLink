package d0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p implements o2.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1.h f3609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3610b;

    public p(r1.h hVar, boolean z10) {
        this.f3609a = hVar;
        this.f3610b = z10;
    }

    @Override // o2.m0
    public final /* synthetic */ int a(o2.r rVar, List list, int i7) {
        return a2.f.i(this, rVar, list, i7);
    }

    @Override // o2.m0
    public final o2.n0 c(final o2.o0 o0Var, final List list, long j5) {
        boolean zIsEmpty = list.isEmpty();
        u8.x xVar = u8.x.f13123a;
        if (zIsEmpty) {
            return o0Var.i(n3.a.j(j5), n3.a.i(j5), xVar, new u7.d(27));
        }
        long j10 = this.f3610b ? j5 : j5 & (-8589934589L);
        if (list.size() == 1) {
            final o2.l0 l0Var = (o2.l0) list.get(0);
            l0Var.w();
            final o2.v0 v0VarU = l0Var.u(j10);
            final int iMax = Math.max(n3.a.j(j5), v0VarU.f9435a);
            final int iMax2 = Math.max(n3.a.i(j5), v0VarU.f9436b);
            return o0Var.i(iMax, iMax2, xVar, new h9.k() { // from class: d0.n
                @Override // h9.k
                public final Object invoke(Object obj) {
                    m.b((o2.u0) obj, v0VarU, l0Var, o0Var.getLayoutDirection(), iMax, iMax2, this.f3609a);
                    return t8.z.f12851a;
                }
            });
        }
        final o2.v0[] v0VarArr = new o2.v0[list.size()];
        final i9.v vVar = new i9.v();
        vVar.f6686a = n3.a.j(j5);
        final i9.v vVar2 = new i9.v();
        vVar2.f6686a = n3.a.i(j5);
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            o2.l0 l0Var2 = (o2.l0) list.get(i7);
            l0Var2.w();
            o2.v0 v0VarU2 = l0Var2.u(j10);
            v0VarArr[i7] = v0VarU2;
            vVar.f6686a = Math.max(vVar.f6686a, v0VarU2.f9435a);
            vVar2.f6686a = Math.max(vVar2.f6686a, v0VarU2.f9436b);
        }
        return o0Var.i(vVar.f6686a, vVar2.f6686a, xVar, new h9.k() { // from class: d0.o
            @Override // h9.k
            public final Object invoke(Object obj) {
                o2.u0 u0Var = (o2.u0) obj;
                o2.v0[] v0VarArr2 = v0VarArr;
                int length = v0VarArr2.length;
                int i10 = 0;
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i10;
                    o2.v0 v0Var = v0VarArr2[i11];
                    i9.l.c(v0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    m.b(u0Var, v0Var, (o2.l0) list.get(i12), o0Var.getLayoutDirection(), vVar.f6686a, vVar2.f6686a, this.f3609a);
                    i11++;
                    i10 = i12 + 1;
                }
                return t8.z.f12851a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f3609a.equals(pVar.f3609a) && this.f3610b == pVar.f3610b;
    }

    @Override // o2.m0
    public final /* synthetic */ int f(o2.r rVar, List list, int i7) {
        return a2.f.d(this, rVar, list, i7);
    }

    @Override // o2.m0
    public final /* synthetic */ int h(o2.r rVar, List list, int i7) {
        return a2.f.b(this, rVar, list, i7);
    }

    public final int hashCode() {
        return (this.f3609a.hashCode() * 31) + (this.f3610b ? 1231 : 1237);
    }

    @Override // o2.m0
    public final /* synthetic */ int j(o2.r rVar, List list, int i7) {
        return a2.f.g(this, rVar, list, i7);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f3609a + ", propagateMinConstraints=" + this.f3610b + ')';
    }
}

package g0;

import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h0.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f5628a;

    public d(v vVar) {
        this.f5628a = vVar;
    }

    @Override // h0.o
    public final int a() {
        return this.f5628a.g().f5689p;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // h0.o
    public final int b() {
        return ((o) u8.p.s0(this.f5628a.g().f5686m)).f5693a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    @Override // h0.o
    public final int c() {
        int i7;
        v vVar = this.f5628a;
        if (vVar.g().f5686m.isEmpty()) {
            return 0;
        }
        n nVarG = vVar.g();
        x0 x0Var = nVarG.f5690q;
        x0 x0Var2 = x0.f15591a;
        int iE = (int) (x0Var == x0Var2 ? nVarG.e() & 4294967295L : nVarG.e() >> 32);
        n nVarG2 = vVar.g();
        boolean z10 = nVarG2.f5690q == x0Var2;
        ?? r8 = nVarG2.f5686m;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < r8.size()) {
            int iS0 = g5.a.s0(z10, nVarG2, i10);
            if (iS0 == -1) {
                i10++;
            } else {
                int iMax = 0;
                while (i10 < r8.size() && g5.a.s0(z10, nVarG2, i10) == iS0) {
                    iMax = Math.max(iMax, (int) (z10 ? ((o) r8.get(i10)).f5705n & 4294967295L : ((o) r8.get(i10)).f5705n >> 32));
                    i10++;
                    z10 = z10;
                }
                i11 += iMax;
                i12++;
                z10 = z10;
            }
        }
        int i13 = (i11 / i12) + nVarG2.f5692s;
        if (i13 != 0 && (i7 = iE / i13) >= 1) {
            return i7;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // h0.o
    public final boolean d() {
        return !this.f5628a.g().f5686m.isEmpty();
    }

    @Override // h0.o
    public final int e() {
        return this.f5628a.f5741d.f4839b.f();
    }
}

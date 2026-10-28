package c1;

import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b2 implements o2.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f1822a;

    public b2(i2 i2Var) {
        this.f1822a = i2Var;
    }

    @Override // o2.m0
    public final /* synthetic */ int a(o2.r rVar, List list, int i7) {
        return a2.f.i(this, rVar, list, i7);
    }

    @Override // o2.m0
    public final o2.n0 c(o2.o0 o0Var, List list, long j5) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            o2.l0 l0Var = (o2.l0) list.get(i7);
            if (androidx.compose.ui.layout.a.a(l0Var) == n1.f2012a) {
                o2.v0 v0VarU = l0Var.u(j5);
                int size2 = list.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    o2.l0 l0Var2 = (o2.l0) list.get(i10);
                    if (androidx.compose.ui.layout.a.a(l0Var2) == n1.f2013b) {
                        o2.v0 v0VarU2 = l0Var2.u(n3.a.a(n3.b.j(-v0VarU.f9435a, 0, 2, j5), 0, 0, 0, 0, 11));
                        int i11 = v0VarU.f9435a + v0VarU2.f9435a;
                        int iMax = Math.max(v0VarU2.f9436b, v0VarU.f9436b);
                        float f10 = v0VarU2.f9436b;
                        i2 i2Var = this.f1822a;
                        i2Var.f1930i.g(f10);
                        i2Var.f1928g.g(i11);
                        return o0Var.i(i11, iMax, u8.x.f13123a, new a2(v0VarU2, v0VarU.f9435a / 2, (iMax - v0VarU2.f9436b) / 2, v0VarU, k9.a.M(i2Var.b() * v0VarU2.f9435a), (iMax - v0VarU.f9436b) / 2));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // o2.m0
    public final /* synthetic */ int f(o2.r rVar, List list, int i7) {
        return a2.f.d(this, rVar, list, i7);
    }

    @Override // o2.m0
    public final /* synthetic */ int h(o2.r rVar, List list, int i7) {
        return a2.f.b(this, rVar, list, i7);
    }

    @Override // o2.m0
    public final /* synthetic */ int j(o2.r rVar, List list, int i7) {
        return a2.f.g(this, rVar, list, i7);
    }
}

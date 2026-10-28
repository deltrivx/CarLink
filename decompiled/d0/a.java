package d0;

import e4.s1;
import f1.k1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f3533c = f1.b.s(x3.b.f14562e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f3534d = f1.b.s(Boolean.TRUE);

    public a(int i7, String str) {
        this.f3531a = i7;
        this.f3532b = str;
    }

    @Override // d0.t0
    public final int a(o2.o0 o0Var, n3.o oVar) {
        return e().f14565c;
    }

    @Override // d0.t0
    public final int b(o2.o0 o0Var) {
        return e().f14566d;
    }

    @Override // d0.t0
    public final int c(o2.o0 o0Var, n3.o oVar) {
        return e().f14563a;
    }

    @Override // d0.t0
    public final int d(o2.o0 o0Var) {
        return e().f14564b;
    }

    public final x3.b e() {
        return (x3.b) this.f3533c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f3531a == ((a) obj).f3531a;
        }
        return false;
    }

    public final void f(s1 s1Var, int i7) {
        int i10 = this.f3531a;
        if (i7 == 0 || (i7 & i10) != 0) {
            this.f3533c.setValue(s1Var.f4398a.g(i10));
            this.f3534d.setValue(Boolean.valueOf(s1Var.f4398a.q(i10)));
        }
    }

    public final int hashCode() {
        return this.f3531a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f3532b);
        sb2.append('(');
        sb2.append(e().f14563a);
        sb2.append(", ");
        sb2.append(e().f14564b);
        sb2.append(", ");
        sb2.append(e().f14565c);
        sb2.append(", ");
        return a2.f.H(sb2, e().f14566d, ')');
    }
}

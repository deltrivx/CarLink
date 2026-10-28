package d0;

import f1.k1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f3630b;

    public s0(b0 b0Var, String str) {
        this.f3629a = str;
        this.f3630b = f1.b.s(b0Var);
    }

    @Override // d0.t0
    public final int a(o2.o0 o0Var, n3.o oVar) {
        return e().f3541c;
    }

    @Override // d0.t0
    public final int b(o2.o0 o0Var) {
        return e().f3542d;
    }

    @Override // d0.t0
    public final int c(o2.o0 o0Var, n3.o oVar) {
        return e().f3539a;
    }

    @Override // d0.t0
    public final int d(o2.o0 o0Var) {
        return e().f3540b;
    }

    public final b0 e() {
        return (b0) this.f3630b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            return i9.l.a(e(), ((s0) obj).e());
        }
        return false;
    }

    public final void f(b0 b0Var) {
        this.f3630b.setValue(b0Var);
    }

    public final int hashCode() {
        return this.f3629a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f3629a);
        sb2.append("(left=");
        sb2.append(e().f3539a);
        sb2.append(", top=");
        sb2.append(e().f3540b);
        sb2.append(", right=");
        sb2.append(e().f3541c);
        sb2.append(", bottom=");
        return a2.f.H(sb2, e().f3542d, ')');
    }
}

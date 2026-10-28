package v;

import f1.d1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f13470c;

    public v0(int i7, int i10, t tVar) {
        this.f13468a = i7;
        this.f13469b = i10;
        this.f13470c = tVar;
    }

    public v0(int i7, t tVar, int i10) {
        this(i7, 0, (i10 & 4) != 0 ? u.f13466a : tVar);
    }

    @Override // v.j
    public final x0 d(w0 w0Var) {
        return new d1(this.f13468a, this.f13469b, this.f13470c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return v0Var.f13468a == this.f13468a && v0Var.f13469b == this.f13469b && i9.l.a(v0Var.f13470c, this.f13470c);
    }

    public final int hashCode() {
        return ((this.f13470c.hashCode() + (this.f13468a * 31)) * 31) + this.f13469b;
    }
}

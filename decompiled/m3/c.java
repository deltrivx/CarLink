package m3;

import t8.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8404a;

    public c(long j5) {
        this.f8404a = j5;
        if (j5 != 16) {
            return;
        }
        h3.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // m3.o
    public final float a() {
        return y1.q.d(this.f8404a);
    }

    @Override // m3.o
    public final long b() {
        return this.f8404a;
    }

    @Override // m3.o
    public final /* synthetic */ o c(o oVar) {
        return a2.f.e(this, oVar);
    }

    @Override // m3.o
    public final o d(h9.a aVar) {
        return !equals(n.f8425a) ? this : (o) aVar.invoke();
    }

    @Override // m3.o
    public final y1.m e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && y1.q.c(this.f8404a, ((c) obj).f8404a);
    }

    public final int hashCode() {
        int i7 = y1.q.f14959n;
        return u.a(this.f8404a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) y1.q.i(this.f8404a)) + ')';
    }
}

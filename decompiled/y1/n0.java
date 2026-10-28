package y1;

import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14942a;

    public n0(long j5) {
        this.f14942a = j5;
    }

    @Override // y1.m
    public final void a(float f10, long j5, f7.q qVar) {
        qVar.i(1.0f);
        long jB = this.f14942a;
        if (f10 != 1.0f) {
            jB = q.b(q.d(jB) * f10, jB);
        }
        qVar.k(jB);
        if (((Shader) qVar.f5448d) != null) {
            qVar.n(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            return q.c(this.f14942a, ((n0) obj).f14942a);
        }
        return false;
    }

    public final int hashCode() {
        int i7 = q.f14959n;
        return t8.u.a(this.f14942a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) q.i(this.f14942a)) + ')';
    }
}

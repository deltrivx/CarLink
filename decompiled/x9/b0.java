package x9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wa.b f14687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f14688b;

    public b0(wa.b bVar, List list) {
        i9.l.e(bVar, "classId");
        this.f14687a = bVar;
        this.f14688b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return i9.l.a(this.f14687a, b0Var.f14687a) && i9.l.a(this.f14688b, b0Var.f14688b);
    }

    public final int hashCode() {
        return this.f14688b.hashCode() + (this.f14687a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.f14687a + ", typeParametersCount=" + this.f14688b + ')';
    }
}

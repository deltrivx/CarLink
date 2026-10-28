package h0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends r1.o implements q2.o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.b f6356o;

    @Override // q2.o
    public final /* synthetic */ void H() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && i9.l.a(this.f6356o, ((q) obj).f6356o);
    }

    public final int hashCode() {
        return this.f6356o.hashCode();
    }

    @Override // r1.o
    public final void q0() {
        this.f6356o.getClass();
    }

    @Override // r1.o
    public final void s0() {
        androidx.compose.foundation.lazy.layout.b bVar = this.f6356o;
        bVar.d();
        bVar.f839b = null;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f6356o + ')';
    }

    @Override // q2.o
    public final void x(q2.j0 j0Var) {
        ArrayList arrayList = this.f6356o.f845h;
        if (arrayList.size() <= 0) {
            j0Var.b();
        } else {
            a2.f.N(arrayList.get(0));
            throw null;
        }
    }
}

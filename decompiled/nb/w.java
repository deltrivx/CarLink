package nb;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class w implements y9.a, qb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9048a;

    public abstract List B0();

    public abstract h0 C0();

    public abstract k0 D0();

    public abstract boolean E0();

    public abstract w F0(ob.g gVar);

    public abstract w0 G0();

    public abstract gb.o U();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (E0() == wVar.E0()) {
            return c.y(ob.f.f9639b, G0(), wVar.G0());
        }
        return false;
    }

    @Override // y9.a
    public final y9.h getAnnotations() {
        return h.a(C0());
    }

    public final int hashCode() {
        int iHashCode;
        int i7 = this.f9048a;
        if (i7 != 0) {
            return i7;
        }
        if (c.j(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (E0() ? 1 : 0) + ((B0().hashCode() + (D0().hashCode() * 31)) * 31);
        }
        this.f9048a = iHashCode;
        return iHashCode;
    }
}

package nb;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mb.d f8988b;

    public f(mb.n nVar) {
        i9.l.e(nVar, "storageManager");
        this.f8988b = new mb.d((mb.k) nVar, new aa.e(19, this), new aa.a(21, this));
    }

    public abstract Collection b();

    public abstract w c();

    public abstract x9.o0 d();

    @Override // nb.k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final List m() {
        return ((e) this.f8988b.invoke()).f8985b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k0) && obj.hashCode() == hashCode()) {
            k0 k0Var = (k0) obj;
            if (k0Var.n().size() == n().size()) {
                x9.h hVarL = l();
                x9.h hVarL2 = k0Var.l();
                if (hVarL2 == null || pb.l.f(hVarL) || za.d.o(hVarL) || pb.l.f(hVarL2) || za.d.o(hVarL2)) {
                    return false;
                }
                return f(hVarL2);
            }
        }
        return false;
    }

    public abstract boolean f(x9.h hVar);

    public List g(List list) {
        return list;
    }

    public final int hashCode() {
        int i7 = this.f8987a;
        if (i7 != 0) {
            return i7;
        }
        x9.h hVarL = l();
        int iIdentityHashCode = (pb.l.f(hVarL) || za.d.o(hVarL)) ? System.identityHashCode(this) : za.d.g(hVarL).f14243a.hashCode();
        this.f8987a = iIdentityHashCode;
        return iIdentityHashCode;
    }
}

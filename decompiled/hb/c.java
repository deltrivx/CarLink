package hb;

import i9.l;
import nb.a0;
import nb.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x9.e f6494a;

    public c(x9.e eVar) {
        this.f6494a = eVar;
    }

    public final boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return l.a(this.f6494a, cVar != null ? cVar.f6494a : null);
    }

    @Override // hb.d, x9.t0
    public final w getType() {
        a0 a0VarN = this.f6494a.n();
        l.d(a0VarN, "getDefaultType(...)");
        return a0VarN;
    }

    public final int hashCode() {
        return this.f6494a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Class{");
        a0 a0VarN = this.f6494a.n();
        l.d(a0VarN, "getDefaultType(...)");
        sb2.append(a0VarN);
        sb2.append('}');
        return sb2.toString();
    }
}

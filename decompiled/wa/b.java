package wa;

import i9.l;
import zb.j;
import zb.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f14237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14238c;

    public b(c cVar, c cVar2, boolean z10) {
        l.e(cVar, "packageFqName");
        l.e(cVar2, "relativeClassName");
        this.f14236a = cVar;
        this.f14237b = cVar2;
        this.f14238c = z10;
        cVar2.f14240a.c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(c cVar, e eVar) {
        this(cVar, n4.h.h0(eVar), false);
        l.e(cVar, "packageFqName");
        l.e(eVar, "topLevelName");
        c cVar2 = c.f14239c;
    }

    public static final String c(c cVar) {
        String str = cVar.f14240a.f14243a;
        if (!j.s0(str, '/')) {
            return str;
        }
        return "`" + str + '`';
    }

    public final c a() {
        c cVar = this.f14236a;
        boolean zC = cVar.f14240a.c();
        c cVar2 = this.f14237b;
        if (zC) {
            return cVar2;
        }
        return new c(cVar.f14240a.f14243a + '.' + cVar2.f14240a.f14243a);
    }

    public final String b() {
        c cVar = this.f14236a;
        boolean zC = cVar.f14240a.c();
        c cVar2 = this.f14237b;
        if (zC) {
            return c(cVar2);
        }
        return q.m0(cVar.f14240a.f14243a, '.', '/') + "/" + c(cVar2);
    }

    public final b d(e eVar) {
        l.e(eVar, "name");
        return new b(this.f14236a, this.f14237b.a(eVar), this.f14238c);
    }

    public final b e() {
        c cVarB = this.f14237b.b();
        if (cVarB.f14240a.c()) {
            return null;
        }
        return new b(this.f14236a, cVarB, this.f14238c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f14236a, bVar.f14236a) && l.a(this.f14237b, bVar.f14237b) && this.f14238c == bVar.f14238c;
    }

    public final e f() {
        return this.f14237b.f14240a.f();
    }

    public final boolean g() {
        return !this.f14237b.b().f14240a.c();
    }

    public final int hashCode() {
        return ((this.f14237b.hashCode() + (this.f14236a.hashCode() * 31)) * 31) + (this.f14238c ? 1231 : 1237);
    }

    public final String toString() {
        if (!this.f14236a.f14240a.c()) {
            return b();
        }
        return "/" + b();
    }
}

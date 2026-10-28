package x9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends aa.n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f14691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final nb.i f14692i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(mb.k kVar, g gVar, wa.e eVar, boolean z10, int i7) {
        super(kVar, gVar, eVar, n0.f14716e0);
        i9.l.e(gVar, "container");
        this.f14690g = z10;
        n9.d dVarE0 = n3.r.e0(0, i7);
        ArrayList arrayList = new ArrayList(u8.q.a0(dVarE0, 10));
        Iterator it = dVarE0.iterator();
        while (true) {
            n9.c cVar = (n9.c) it;
            if (!cVar.f8970c) {
                this.f14691h = arrayList;
                this.f14692i = new nb.i(this, v.c(this), n3.r.W(db.e.j(this).k().e()), kVar);
                return;
            } else {
                int iNextInt = cVar.nextInt();
                arrayList.add(aa.w0.F0(this, nb.x0.INVARIANT, wa.e.e("T" + iNextInt), iNextInt, kVar));
            }
        }
    }

    @Override // x9.e
    public final Collection E() {
        return u8.w.f13122a;
    }

    @Override // x9.w
    public final boolean G() {
        return false;
    }

    @Override // x9.i
    public final boolean H() {
        return this.f14690g;
    }

    @Override // x9.e
    public final aa.m P() {
        return null;
    }

    @Override // x9.e
    public final /* bridge */ /* synthetic */ gb.o Q() {
        return gb.n.f6198b;
    }

    @Override // x9.e, x9.w, x9.n
    public final ga.o d() {
        ga.o oVar = o.f14721e;
        i9.l.d(oVar, "PUBLIC");
        return oVar;
    }

    @Override // x9.e
    public final f f() {
        return f.f14701a;
    }

    @Override // x9.e
    public final boolean g() {
        return false;
    }

    @Override // y9.a
    public final y9.h getAnnotations() {
        return y9.g.f15129a;
    }

    @Override // x9.e, x9.w
    public final x i() {
        return x.f14747b;
    }

    @Override // x9.e
    public final boolean j() {
        return false;
    }

    @Override // x9.e
    public final s0 o0() {
        return null;
    }

    @Override // aa.e0
    public final gb.o p0(ob.g gVar) {
        return gb.n.f6198b;
    }

    @Override // x9.e, x9.i
    public final List q() {
        return this.f14691h;
    }

    @Override // aa.n, x9.w
    public final boolean s() {
        return false;
    }

    @Override // x9.h
    public final nb.k0 t() {
        return this.f14692i;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // x9.e
    public final boolean u() {
        return false;
    }

    @Override // x9.w
    public final boolean u0() {
        return false;
    }

    @Override // x9.e
    public final Collection w() {
        return u8.y.f13124a;
    }

    @Override // x9.e
    public final boolean z() {
        return false;
    }

    @Override // x9.e
    public final boolean z0() {
        return false;
    }
}

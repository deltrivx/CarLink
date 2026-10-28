package lb;

import aa.f0;
import aa.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ra.e0;
import ra.f1;
import ra.y0;
import u8.y;
import x9.d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p extends o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d0 f8356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wa.c f8358i;

    public p(d0 d0Var, e0 e0Var, ta.f fVar, ta.a aVar, pa.g gVar, jb.i iVar, String str, h9.a aVar2) {
        ta.g gVar2;
        i9.l.e(e0Var, "proto");
        i9.l.e(fVar, "nameResolver");
        i9.l.e(aVar, "metadataVersion");
        i9.l.e(iVar, "components");
        i9.l.e(str, "debugName");
        y0 y0Var = e0Var.f11911g;
        i9.l.d(y0Var, "getTypeTable(...)");
        f0 f0Var = new f0(y0Var);
        f1 f1Var = e0Var.f11912h;
        i9.l.d(f1Var, "getVersionRequirementTable(...)");
        if (f1Var.f11942b.size() == 0) {
            gVar2 = ta.g.f12888a;
        } else {
            i9.l.d(f1Var.f11942b, "getRequirementList(...)");
            gVar2 = new ta.g();
        }
        jb.k kVarA = iVar.a(d0Var, fVar, f0Var, gVar2, aVar, gVar);
        List list = e0Var.f11908d;
        i9.l.d(list, "getFunctionList(...)");
        List list2 = e0Var.f11909e;
        i9.l.d(list2, "getPropertyList(...)");
        List list3 = e0Var.f11910f;
        i9.l.d(list3, "getTypeAliasList(...)");
        super(kVarA, list, list2, list3, aVar2);
        this.f8356g = d0Var;
        this.f8357h = str;
        this.f8358i = ((j0) d0Var).f364e;
    }

    @Override // lb.o, gb.p, gb.q
    public final x9.h a(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        a.a.Q(this.f8352b.f7043a.f7026i, bVar, this.f8356g, eVar);
        return super.a(eVar, bVar);
    }

    @Override // gb.p, gb.q
    public final Collection d(gb.f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        List listI = i(fVar, kVar);
        Iterable iterable = this.f8352b.f7043a.k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            u8.u.c0(((z9.c) it.next()).a(this.f8358i), arrayList);
        }
        return u8.p.x0(arrayList, listI);
    }

    @Override // lb.o
    public final void h(ArrayList arrayList, h9.k kVar) {
    }

    @Override // lb.o
    public final wa.b l(wa.e eVar) {
        i9.l.e(eVar, "name");
        return new wa.b(this.f8358i, eVar);
    }

    @Override // lb.o
    public final Set n() {
        return y.f13124a;
    }

    @Override // lb.o
    public final Set o() {
        return y.f13124a;
    }

    @Override // lb.o
    public final Set p() {
        return y.f13124a;
    }

    @Override // lb.o
    public final boolean q(wa.e eVar) {
        i9.l.e(eVar, "name");
        if (super.q(eVar)) {
            return true;
        }
        Iterable iterable = this.f8352b.f7043a.k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((z9.c) it.next()).b(this.f8358i, eVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f8357h;
    }
}

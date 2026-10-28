package lb;

import i9.y;
import i9.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import u8.w;
import x9.q0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends gb.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ o9.u[] f8351f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb.k f8352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f8353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mb.i f8354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mb.h f8355e;

    static {
        i9.r rVar = new i9.r(o.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0);
        z zVar = y.f6689a;
        f8351f = new o9.u[]{zVar.g(rVar), ob.a.v(o.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0, zVar)};
    }

    public o(jb.k kVar, List list, List list2, List list3, h9.a aVar) {
        i9.l.e(kVar, "c");
        i9.l.e(list, "functionList");
        i9.l.e(list2, "propertyList");
        i9.l.e(list3, "typeAliasList");
        this.f8352b = kVar;
        jb.i iVar = kVar.f7043a;
        iVar.f7020c.getClass();
        this.f8353c = new n(this, list, list2, list3);
        mb.k kVar2 = iVar.f7018a;
        gb.j jVar = new gb.j(aVar, 1);
        kVar2.getClass();
        this.f8354d = new mb.i(kVar2, jVar);
        aa.e eVar = new aa.e(17, this);
        kVar2.getClass();
        this.f8355e = new mb.h(kVar2, eVar);
    }

    @Override // gb.p, gb.q
    public x9.h a(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        if (q(eVar)) {
            return this.f8352b.f7043a.b(l(eVar));
        }
        n nVar = this.f8353c;
        if (!nVar.f8344c.keySet().contains(eVar)) {
            return null;
        }
        nVar.getClass();
        return (q0) nVar.f8347f.invoke(eVar);
    }

    @Override // gb.p, gb.o
    public Collection b(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        n nVar = this.f8353c;
        nVar.getClass();
        i9.l.e(eVar, "name");
        return !((Set) k9.a.z(nVar.f8349h, n.f8341j[1])).contains(eVar) ? w.f13122a : (Collection) nVar.f8346e.invoke(eVar);
    }

    @Override // gb.p, gb.o
    public final Set c() {
        return (Set) k9.a.z(this.f8353c.f8348g, n.f8341j[0]);
    }

    @Override // gb.p, gb.o
    public final Set e() {
        o9.u uVar = f8351f[1];
        mb.h hVar = this.f8355e;
        i9.l.e(hVar, "<this>");
        i9.l.e(uVar, "p");
        return (Set) hVar.invoke();
    }

    @Override // gb.p, gb.o
    public Collection f(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        n nVar = this.f8353c;
        nVar.getClass();
        i9.l.e(eVar, "name");
        return !((Set) k9.a.z(nVar.f8348g, n.f8341j[0])).contains(eVar) ? w.f13122a : (Collection) nVar.f8345d.invoke(eVar);
    }

    @Override // gb.p, gb.o
    public final Set g() {
        return (Set) k9.a.z(this.f8353c.f8349h, n.f8341j[1]);
    }

    public abstract void h(ArrayList arrayList, h9.k kVar);

    public final List i(gb.f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        ArrayList arrayList = new ArrayList(0);
        if (fVar.a(gb.f.f6167f)) {
            h(arrayList, kVar);
        }
        n nVar = this.f8353c;
        nVar.getClass();
        mb.i iVar = nVar.f8348g;
        mb.i iVar2 = nVar.f8349h;
        boolean zA = fVar.a(gb.f.f6171j);
        w wVar = w.f13122a;
        za.g gVar = za.g.f15792b;
        if (zA) {
            Set<wa.e> set = (Set) k9.a.z(iVar2, n.f8341j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (wa.e eVar : set) {
                if (((Boolean) kVar.invoke(eVar)).booleanValue()) {
                    i9.l.e(eVar, "name");
                    arrayList2.addAll(!((Set) k9.a.z(iVar2, n.f8341j[1])).contains(eVar) ? wVar : (Collection) nVar.f8346e.invoke(eVar));
                }
            }
            u8.t.b0(arrayList2, gVar);
            arrayList.addAll(arrayList2);
        }
        if (fVar.a(gb.f.f6170i)) {
            Set<wa.e> set2 = (Set) k9.a.z(iVar, n.f8341j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (wa.e eVar2 : set2) {
                if (((Boolean) kVar.invoke(eVar2)).booleanValue()) {
                    i9.l.e(eVar2, "name");
                    arrayList3.addAll(!((Set) k9.a.z(iVar, n.f8341j[0])).contains(eVar2) ? wVar : (Collection) nVar.f8345d.invoke(eVar2));
                }
            }
            u8.t.b0(arrayList3, gVar);
            arrayList.addAll(arrayList3);
        }
        if (fVar.a(gb.f.f6172l)) {
            for (wa.e eVar3 : m()) {
                if (((Boolean) kVar.invoke(eVar3)).booleanValue()) {
                    wb.l.a(arrayList, this.f8352b.f7043a.b(l(eVar3)));
                }
            }
        }
        if (fVar.a(gb.f.f6168g)) {
            for (wa.e eVar4 : nVar.f8344c.keySet()) {
                if (((Boolean) kVar.invoke(eVar4)).booleanValue()) {
                    nVar.getClass();
                    i9.l.e(eVar4, "name");
                    wb.l.a(arrayList, (q0) nVar.f8347f.invoke(eVar4));
                }
            }
        }
        return wb.l.d(arrayList);
    }

    public void j(ArrayList arrayList, wa.e eVar) {
        i9.l.e(eVar, "name");
    }

    public void k(ArrayList arrayList, wa.e eVar) {
        i9.l.e(eVar, "name");
    }

    public abstract wa.b l(wa.e eVar);

    public final Set m() {
        return (Set) k9.a.z(this.f8354d, f8351f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(wa.e eVar) {
        i9.l.e(eVar, "name");
        return m().contains(eVar);
    }

    public boolean r(r rVar) {
        return true;
    }
}

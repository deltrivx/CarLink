package ka;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import nb.s0;
import nb.u0;
import nb.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends aa.d {
    public final da.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final da.c0 f7423l;

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(da.a aVar, da.c0 c0Var, int i7, x9.l lVar) {
        i9.l.e(c0Var, "javaTypeParameter");
        ja.a aVar2 = (ja.a) aVar.f3847b;
        super(aVar2.f6964a, lVar, new ja.c(aVar, c0Var, false), wa.e.e(c0Var.f3859a.getName()), x0.INVARIANT, false, i7, aVar2.f6975m);
        this.k = aVar;
        this.f7423l = c0Var;
    }

    @Override // aa.l
    public final List C0(List list) {
        oa.d dVar;
        nb.w wVar;
        nb.w wVarB;
        da.a aVar = this.k;
        oa.d dVar2 = ((ja.a) aVar.f3847b).f6980r;
        dVar2.getClass();
        ArrayList arrayList = new ArrayList(u8.q.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nb.w wVar2 = (nb.w) it.next();
            oa.o oVar = oa.o.f9614d;
            i9.l.e(wVar2, "<this>");
            if (u0.c(wVar2, oVar, null)) {
                dVar = dVar2;
                wVar = wVar2;
            } else {
                dVar = dVar2;
                wVar = wVar2;
                wVarB = dVar.b(new oa.r(this, false, aVar, ga.a.TYPE_PARAMETER_BOUNDS, false), wVar, u8.w.f13122a, null, false);
                if (wVarB == null) {
                }
                arrayList.add(wVarB);
                dVar2 = dVar;
            }
            wVarB = wVar;
            arrayList.add(wVarB);
            dVar2 = dVar;
        }
        return arrayList;
    }

    @Override // aa.l
    public final List D0() {
        Type[] bounds = this.f7423l.f3859a.getBounds();
        i9.l.d(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new da.q(type));
        }
        da.q qVar = (da.q) u8.p.C0(arrayList);
        Collection collection = arrayList;
        if (i9.l.a(qVar != null ? qVar.f3883a : null, Object.class)) {
            collection = u8.w.f13122a;
        }
        boolean zIsEmpty = collection.isEmpty();
        da.a aVar = this.k;
        if (zIsEmpty) {
            return n3.l.I(nb.c.e(((ja.a) aVar.f3847b).f6977o.k().e(), ((ja.a) aVar.f3847b).f6977o.k().p()));
        }
        ArrayList arrayList2 = new ArrayList(u8.q.a0(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a2.b) aVar.f3850e).d0((da.q) it.next(), o9.e0.R(s0.f9034b, false, this, 3)));
        }
        return arrayList2;
    }
}

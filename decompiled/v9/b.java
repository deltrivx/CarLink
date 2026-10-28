package v9;

import aa.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import nb.f0;
import nb.h0;
import u8.p;
import u8.q;
import u9.o;
import x9.o0;
import x9.r0;
import x9.v;
import x9.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends nb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f13686c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(cVar.f13689e);
        this.f13686c = cVar;
    }

    @Override // nb.f
    public final Collection b() {
        List<wa.b> listJ;
        c cVar = this.f13686c;
        int i7 = cVar.f13692h;
        k kVar = cVar.f13691g;
        g gVar = g.f13697c;
        if (i9.l.a(kVar, gVar)) {
            listJ = n3.l.I(c.f13687l);
        } else if (i9.l.a(kVar, h.f13698c)) {
            listJ = n3.l.J(c.f13688m, new wa.b(o.k, gVar.a(i7)));
        } else {
            j jVar = j.f13700c;
            if (i9.l.a(kVar, jVar)) {
                listJ = n3.l.I(c.f13687l);
            } else {
                if (!i9.l.a(kVar, i.f13699c)) {
                    int i10 = xb.a.f14846a;
                    throw new IllegalStateException("should not be called");
                }
                listJ = n3.l.J(c.f13688m, new wa.b(o.f13202f, jVar.a(i7)));
            }
        }
        y yVarL = ((j0) cVar.f13690f).l();
        ArrayList arrayList = new ArrayList(q.a0(listJ, 10));
        for (wa.b bVar : listJ) {
            x9.e eVarD = v.d(yVarL, bVar);
            if (eVarD == null) {
                throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
            }
            List listG0 = p.G0(eVarD.t().n().size(), cVar.k);
            ArrayList arrayList2 = new ArrayList(q.a0(listG0, 10));
            Iterator it = listG0.iterator();
            while (it.hasNext()) {
                arrayList2.add(new f0(((r0) it.next()).n()));
            }
            h0.f8997b.getClass();
            arrayList.add(nb.c.s(h0.f8998c, eVarD, arrayList2));
        }
        return p.J0(arrayList);
    }

    @Override // nb.f
    public final o0 d() {
        return o0.f14732c;
    }

    @Override // nb.b
    /* JADX INFO: renamed from: i */
    public final x9.e l() {
        return this.f13686c;
    }

    @Override // nb.b, nb.k0
    public final x9.h l() {
        return this.f13686c;
    }

    @Override // nb.k0
    public final List n() {
        return this.f13686c.k;
    }

    @Override // nb.k0
    public final boolean o() {
        return true;
    }

    public final String toString() {
        return this.f13686c.toString();
    }
}

package v9;

import aa.s0;
import aa.y;
import aa.y0;
import aa.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nb.r0;
import nb.w;
import tb.s;
import u8.p;
import u8.q;
import x9.n0;
import x9.t;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends s0 {
    public f(x9.k kVar, f fVar, int i7, boolean z10) {
        super(kVar, fVar, y9.g.f15129a, s.f12932g, i7, n0.f14716e0);
        this.f483m = true;
        this.f491u = z10;
        this.f492v = false;
    }

    @Override // aa.s0, aa.z
    public final z E0(int i7, wa.e eVar, x9.k kVar, t tVar, n0 n0Var, y9.h hVar) {
        i9.l.e(kVar, "newOwner");
        a2.f.M(i7, "kind");
        i9.l.e(hVar, "annotations");
        return new f(kVar, (f) tVar, i7, this.f491u);
    }

    @Override // aa.z
    public final z F0(y yVar) {
        wa.e eVar;
        f fVar = (f) super.F0(yVar);
        if (fVar == null) {
            return null;
        }
        List listX = fVar.X();
        i9.l.d(listX, "getValueParameters(...)");
        if (listX.isEmpty()) {
            return fVar;
        }
        Iterator it = listX.iterator();
        while (it.hasNext()) {
            w type = ((y0) it.next()).getType();
            i9.l.d(type, "getType(...)");
            if (n4.h.B(type) != null) {
                List listX2 = fVar.X();
                i9.l.d(listX2, "getValueParameters(...)");
                ArrayList arrayList = new ArrayList(q.a0(listX2, 10));
                Iterator it2 = listX2.iterator();
                while (it2.hasNext()) {
                    w type2 = ((y0) it2.next()).getType();
                    i9.l.d(type2, "getType(...)");
                    arrayList.add(n4.h.B(type2));
                }
                int size = fVar.X().size() - arrayList.size();
                boolean z10 = true;
                if (size == 0) {
                    List listX3 = fVar.X();
                    i9.l.d(listX3, "getValueParameters(...)");
                    ArrayList<t8.j> arrayListO0 = p.O0(arrayList, listX3);
                    if (arrayListO0.isEmpty()) {
                        return fVar;
                    }
                    for (t8.j jVar : arrayListO0) {
                        if (!i9.l.a((wa.e) jVar.f12830a, ((y0) jVar.f12831b).getName())) {
                        }
                    }
                    return fVar;
                }
                List<y0> listX4 = fVar.X();
                i9.l.d(listX4, "getValueParameters(...)");
                ArrayList arrayList2 = new ArrayList(q.a0(listX4, 10));
                for (y0 y0Var : listX4) {
                    wa.e name = y0Var.getName();
                    i9.l.d(name, "getName(...)");
                    int i7 = y0Var.f471f;
                    int i10 = i7 - size;
                    if (i10 >= 0 && (eVar = (wa.e) arrayList.get(i10)) != null) {
                        name = eVar;
                    }
                    arrayList2.add(y0Var.C0(fVar, name, i7));
                }
                y yVarI0 = fVar.I0(r0.f9028b);
                if (arrayList.isEmpty()) {
                    z10 = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((wa.e) it3.next()) == null) {
                        }
                    }
                    z10 = false;
                }
                yVarI0.f468v = Boolean.valueOf(z10);
                yVarI0.f454g = arrayList2;
                yVarI0.f452e = fVar.a();
                z zVarF0 = super.F0(yVarI0);
                i9.l.b(zVarF0);
                return zVarF0;
            }
        }
        return fVar;
    }

    @Override // aa.z, x9.t
    public final boolean N() {
        return false;
    }

    @Override // aa.z, x9.t
    public final boolean g() {
        return false;
    }

    @Override // aa.z, x9.w
    public final boolean s() {
        return false;
    }
}

package t7;

import a8.f1;
import c8.v;
import f1.b1;
import f1.s;
import f1.w0;
import h9.n;
import java.util.List;
import n1.h;
import n3.l;
import o7.o;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f12807b;

    public /* synthetic */ d(f fVar, int i7) {
        this.f12806a = i7;
        this.f12807b = fVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12806a) {
            case 0:
                s sVar = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    sVar.W(1849434622);
                    Object objK = sVar.K();
                    w0 w0Var = f1.n.f5051a;
                    if (objK == w0Var) {
                        objK = f1.b.s(null);
                        sVar.h0(objK);
                    }
                    b1 b1Var = (b1) objK;
                    sVar.p(false);
                    List list = this.f12807b.f12813c;
                    int i7 = 0;
                    for (Object obj3 : list) {
                        int i10 = i7 + 1;
                        if (i7 < 0) {
                            l.Y();
                            throw null;
                        }
                        g gVar = (g) obj3;
                        n1.c cVarE = h.e(-224846058, new v(8, gVar), sVar);
                        int i11 = i7;
                        n1.c cVar = b.f12803e;
                        boolean z10 = i11 != l.A(list);
                        sVar.W(-1633490746);
                        boolean zH = sVar.h(gVar);
                        Object objK2 = sVar.K();
                        if (zH || objK2 == w0Var) {
                            objK2 = new f1(18, gVar, b1Var);
                            sVar.h0(objK2);
                        }
                        sVar.p(false);
                        a.a.h(cVarE, cVar, z10, (h9.a) objK2, sVar, 54, 0);
                        boolean zA = i9.l.a((String) b1Var.getValue(), gVar.getName());
                        sVar.W(5004770);
                        Object objK3 = sVar.K();
                        if (objK3 == w0Var) {
                            objK3 = new o(b1Var, 11);
                            sVar.h0(objK3);
                        }
                        sVar.p(false);
                        gVar.d(zA, (h9.a) objK3, sVar, 48);
                        i7 = i10;
                    }
                }
                return z.f12851a;
            default:
                s sVar2 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    g5.a.b(null, h.e(-1809670194, new d(this.f12807b, 0), sVar2), sVar2, 48, 1);
                }
                return z.f12851a;
        }
    }
}

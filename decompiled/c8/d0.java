package c8;

import a8.f1;
import b8.n2;
import f1.b1;
import f1.w0;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1.p f2481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f2482c;

    public /* synthetic */ d0(p1.p pVar, b1 b1Var, int i7) {
        this.f2480a = i7;
        this.f2481b = pVar;
        this.f2482c = b1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2480a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    p1.p pVar = this.f2481b;
                    boolean zIsEmpty = pVar.isEmpty();
                    w0 w0Var = f1.n.f5051a;
                    if (zIsEmpty) {
                        sVar.W(-815175434);
                        n1.c cVar = c.f2471b;
                        n1.c cVar2 = c.f2472c;
                        sVar.W(5004770);
                        Object objK = sVar.K();
                        if (objK == w0Var) {
                            objK = new i(pVar, 1);
                            sVar.h0(objK);
                        }
                        sVar.p(false);
                        a.a.h(cVar, cVar2, false, (h9.a) objK, sVar, 3510, 0);
                        sVar.p(false);
                    } else {
                        sVar.W(-814731049);
                        Iterator it = new u8.d0(pVar).iterator();
                        int i7 = 0;
                        while (true) {
                            ListIterator listIterator = (ListIterator) ((p1.c0) it).f10014b;
                            if (listIterator.hasPrevious()) {
                                Object objPrevious = listIterator.previous();
                                int i10 = i7 + 1;
                                if (i7 < 0) {
                                    n3.l.Y();
                                    throw null;
                                }
                                n2 n2Var = (n2) objPrevious;
                                sVar.U(1665255947, Integer.valueOf(n2Var.f1623a));
                                boolean z10 = i7 == n3.l.A(pVar);
                                sVar.W(-1633490746);
                                boolean zH = sVar.h(n2Var);
                                Object objK2 = sVar.K();
                                if (zH || objK2 == w0Var) {
                                    objK2 = new p(1, n2Var, pVar, false);
                                    sVar.h0(objK2);
                                }
                                h9.k kVar = (h9.k) objK2;
                                sVar.p(false);
                                sVar.W(-1633490746);
                                boolean zH2 = sVar.h(n2Var);
                                Object objK3 = sVar.K();
                                if (zH2 || objK3 == w0Var) {
                                    objK3 = new f1(1, n2Var, pVar);
                                    sVar.h0(objK3);
                                }
                                h9.a aVar = (h9.a) objK3;
                                sVar.p(false);
                                sVar.W(-1633490746);
                                boolean zH3 = sVar.h(n2Var);
                                Object objK4 = sVar.K();
                                if (zH3 || objK4 == w0Var) {
                                    objK4 = new f1(2, n2Var, this.f2482c);
                                    sVar.h0(objK4);
                                }
                                sVar.p(false);
                                f1.s sVar2 = sVar;
                                f0.f2498a.e(n2Var, z10, kVar, aVar, (h9.a) objK4, sVar2, 196608);
                                sVar = sVar2;
                                sVar.p(false);
                                i7 = i10;
                            } else {
                                sVar.p(false);
                            }
                        }
                    }
                }
                return t8.z.f12851a;
            default:
                f1.s sVar3 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    sVar3.W(-1633490746);
                    Object objK5 = sVar3.K();
                    if (objK5 == f1.n.f5051a) {
                        objK5 = new c0(this.f2481b, this.f2482c, 1);
                        sVar3.h0(objK5);
                    }
                    sVar3.p(false);
                    i2.c.l("保存", 0L, 0L, (h9.a) objK5, sVar3, 3078, 6);
                }
                return t8.z.f12851a;
        }
    }
}

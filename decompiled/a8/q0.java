package a8;

import android.content.res.Configuration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.n f202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.h1 f205e;

    public /* synthetic */ q0(h9.n nVar, String str, f1.b1 b1Var, f1.h1 h1Var, int i7) {
        this.f201a = i7;
        this.f202b = nVar;
        this.f203c = str;
        this.f204d = b1Var;
        this.f205e = h1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f201a;
        t8.z zVar = t8.z.f12851a;
        f1.w0 w0Var = f1.n.f5051a;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    List listJ = n3.l.J("音频通道", "选择音频通道版本");
                    List listJ2 = n3.l.J(new l8.j0("新版", new l8.k0(false), null, null, null, 28), new l8.j0("旧版", new l8.k0(true), null, null, null, 28));
                    boolean z10 = !m7.j.f8589m;
                    sVar.W(-1224400529);
                    h9.n nVar = this.f202b;
                    boolean zF = sVar.f(nVar);
                    String str = this.f203c;
                    boolean zF2 = zF | sVar.f(str);
                    Object objK = sVar.K();
                    if (zF2 || objK == w0Var) {
                        objK = new p0(nVar, str, this.f204d, this.f205e);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    k9.a.e(listJ, listJ2, null, z10, false, null, (h9.k) objK, sVar, 24582, 36);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    h9.n nVar2 = this.f202b;
                    String str2 = this.f203c;
                    f1.b1 b1Var = this.f204d;
                    f1.h1 h1Var = this.f205e;
                    g5.a.b(null, n1.h.e(1777420147, new q0(nVar2, str2, b1Var, h1Var, 0), sVar2), sVar2, 48, 1);
                    a2.f.L(16, sVar2, r1.m.f11116a, sVar2);
                    n9.d dVarE0 = n3.r.e0(1, 21);
                    ArrayList arrayList = new ArrayList(u8.q.a0(dVarE0, 10));
                    Iterator it = dVarE0.iterator();
                    while (true) {
                        n9.c cVar = (n9.c) it;
                        if (!cVar.f8970c) {
                            l8.j0 j0Var = new l8.j0(String.valueOf(h1Var.f()), new l8.l0(h1Var.f()), null, null, null, 28);
                            int i10 = ((Configuration) sVar2.j(r2.n0.f11342a)).orientation == 2 ? 5 : 4;
                            sVar2.W(-1224400529);
                            boolean zF3 = sVar2.f(nVar2) | sVar2.f(str2);
                            Object objK2 = sVar2.K();
                            if (zF3 || objK2 == w0Var) {
                                objK2 = new p0(nVar2, str2, h1Var, b1Var);
                                sVar2.h0(objK2);
                            }
                            sVar2.p(false);
                            g5.a.c(arrayList, j0Var, i10, null, 0.0f, 0.0f, (h9.k) objK2, sVar2, 0, 56);
                        } else {
                            int iNextInt = cVar.nextInt();
                            arrayList.add(new l8.j0(String.valueOf(iNextInt), new l8.l0(iNextInt), null, null, null, 28));
                        }
                    }
                }
                break;
        }
        return zVar;
    }
}

package m7;

import android.content.res.Configuration;
import f1.b1;
import f1.h1;
import f1.s;
import f1.w0;
import h9.n;
import h9.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l0.c1;
import l8.j0;
import l8.k0;
import l8.l0;
import n3.r;
import r1.m;
import r2.n0;
import t8.z;
import u8.p;
import u8.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8575a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t8.j f8576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f8577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f8578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f8579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f8580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h1 f8581g;

    public e(List list, t8.j jVar, o oVar, b1 b1Var, b1 b1Var2, h1 h1Var) {
        this.f8578d = list;
        this.f8576b = jVar;
        this.f8577c = oVar;
        this.f8579e = b1Var;
        this.f8580f = b1Var2;
        this.f8581g = h1Var;
    }

    public e(t8.j jVar, o oVar, List list, b1 b1Var, b1 b1Var2, h1 h1Var) {
        this.f8576b = jVar;
        this.f8577c = oVar;
        this.f8578d = list;
        this.f8579e = b1Var;
        this.f8580f = b1Var2;
        this.f8581g = h1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f8575a;
        z zVar = z.f12851a;
        w0 w0Var = f1.n.f5051a;
        o oVar = this.f8577c;
        h1 h1Var = this.f8581g;
        switch (i7) {
            case 0:
                s sVar = (s) obj;
                int iIntValue = ((Number) obj2).intValue();
                Object obj3 = this.f8576b.f12830a;
                if ((iIntValue & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    List list = this.f8578d;
                    List listJ = n3.l.J(p.k0(list) + "焦点", "播放时请求音频焦点");
                    t8.j jVar = new t8.j(obj3 + "_FOCUS", Boolean.TRUE);
                    boolean z10 = j.f8589m ^ true;
                    sVar.W(-1224400529);
                    boolean zF = sVar.f(oVar);
                    Object objK = sVar.K();
                    b1 b1Var = this.f8579e;
                    b1 b1Var2 = this.f8580f;
                    if (zF || objK == w0Var) {
                        objK = new d(oVar, b1Var, b1Var2, h1Var);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    g5.a.g(listJ, jVar, z10, (h9.k) objK, sVar, 0, 0);
                    List listJ2 = n3.l.J(p.k0(list) + "版本", "选择" + p.k0(list) + "版本");
                    List listJ3 = n3.l.J(new j0("新版", new k0(false), null, null, null, 28), new j0("旧版", new k0(true), null, null, null, 28));
                    t8.j jVar2 = new t8.j(obj3 + "_VERSION", new k0(((Boolean) b1Var2.getValue()).booleanValue()));
                    sVar.W(-1224400529);
                    boolean zF2 = sVar.f(oVar);
                    Object objK2 = sVar.K();
                    if (zF2 || objK2 == w0Var) {
                        objK2 = new d(oVar, b1Var2, h1Var, b1Var);
                        sVar.h0(objK2);
                    }
                    sVar.p(false);
                    k9.a.f(listJ2, listJ3, jVar2, z10, false, (h9.k) objK2, sVar, 24640, 0);
                }
                break;
            default:
                s sVar2 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    b1 b1Var3 = this.f8579e;
                    h1 h1Var2 = this.f8581g;
                    List list2 = this.f8578d;
                    t8.j jVar3 = this.f8576b;
                    o oVar2 = this.f8577c;
                    b1 b1Var4 = this.f8580f;
                    g5.a.b(null, n1.h.e(298987325, new e(list2, jVar3, oVar2, b1Var3, b1Var4, h1Var2), sVar2), sVar2, 48, 1);
                    a2.f.L(16, sVar2, m.f11116a, sVar2);
                    n9.d dVarE0 = r.e0(1, 21);
                    ArrayList arrayList = new ArrayList(q.a0(dVarE0, 10));
                    Iterator it = dVarE0.iterator();
                    while (true) {
                        n9.c cVar = (n9.c) it;
                        if (!cVar.f8970c) {
                            j0 j0Var = new j0(String.valueOf(h1Var.f()), new l0(h1Var.f()), null, null, null, 28);
                            int i10 = ((Configuration) sVar2.j(n0.f11342a)).orientation == 2 ? 5 : 4;
                            sVar2.W(-1224400529);
                            boolean zF3 = sVar2.f(oVar) | sVar2.f(jVar3);
                            Object objK3 = sVar2.K();
                            if (zF3 || objK3 == w0Var) {
                                objK3 = new c1(jVar3, this.f8577c, this.f8581g, b1Var4, this.f8579e, 1);
                                sVar2.h0(objK3);
                            }
                            sVar2.p(false);
                            g5.a.c(arrayList, j0Var, i10, null, 0.0f, 0.0f, (h9.k) objK3, sVar2, 64, 56);
                        } else {
                            int iNextInt = cVar.nextInt();
                            arrayList.add(new j0(String.valueOf(iNextInt), new l0(iNextInt), null, null, null, 28));
                        }
                    }
                }
                break;
        }
        return zVar;
    }
}

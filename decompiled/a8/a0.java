package a8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import f1.s2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f66b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f67c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f68d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f69e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f70f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f71g;

    public /* synthetic */ a0(Object obj, Object obj2, f1.b1 b1Var, f1.b1 b1Var2, f1.b1 b1Var3, f1.b1 b1Var4, int i7) {
        this.f65a = i7;
        this.f70f = obj;
        this.f71g = obj2;
        this.f66b = b1Var;
        this.f67c = b1Var2;
        this.f68d = b1Var3;
        this.f69e = b1Var4;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        l8.j0 j0Var;
        switch (this.f65a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                h9.n nVar = (h9.n) this.f71g;
                g0 g0Var = (g0) this.f70f;
                int i7 = iIntValue & 3;
                t8.z zVar = t8.z.f12851a;
                if (i7 == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    sVar.W(1244512721);
                    Boolean bool = (Boolean) this.f66b.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    sVar.W(497261777);
                    sVar.W(5004770);
                    boolean zG = sVar.g(zBooleanValue);
                    Object objK = sVar.K();
                    f1.w0 w0Var = f1.n.f5051a;
                    if (zG || objK == w0Var) {
                        objK = f1.b.s(u8.w.f13122a);
                        sVar.h0(objK);
                    }
                    f1.b1 b1Var = (f1.b1) objK;
                    sVar.p(false);
                    int i10 = -1633490746;
                    sVar.W(-1633490746);
                    boolean zF = sVar.f(b1Var) | sVar.g(zBooleanValue);
                    Object objK2 = sVar.K();
                    y8.c cVar = null;
                    if (zF || objK2 == w0Var) {
                        objK2 = new f0(zBooleanValue, b1Var, null, 0);
                        sVar.h0(objK2);
                    }
                    sVar.p(false);
                    f1.b.f(sVar, (h9.n) objK2, bool);
                    List<PackageInfo> list = (List) b1Var.getValue();
                    sVar.p(false);
                    ArrayList arrayList = new ArrayList();
                    for (PackageInfo packageInfo : list) {
                        String str = packageInfo.packageName;
                        i9.l.d(str, "packageName");
                        sVar.W(627907097);
                        Context contextB = n8.a.b();
                        sVar.W(i10);
                        boolean zH = sVar.h(contextB) | sVar.f(str);
                        Object objK3 = sVar.K();
                        if (zH || objK3 == w0Var) {
                            objK3 = new e0(contextB, str, cVar, 0);
                            sVar.h0(objK3);
                        }
                        h9.n nVar2 = (h9.n) objK3;
                        sVar.p(false);
                        Object objK4 = sVar.K();
                        if (objK4 == w0Var) {
                            objK4 = f1.b.s(null);
                            sVar.h0(objK4);
                        }
                        f1.b1 b1Var2 = (f1.b1) objK4;
                        boolean zH2 = sVar.h(nVar2);
                        Object objK5 = sVar.K();
                        if (zH2 || objK5 == w0Var) {
                            objK5 = new s2(nVar2, b1Var2, null, 0);
                            sVar.h0(objK5);
                        }
                        f1.b.f(sVar, (h9.n) objK5, zVar);
                        t8.j jVar = (t8.j) b1Var2.getValue();
                        sVar.p(false);
                        if (jVar != null) {
                            String str2 = (String) jVar.f12830a;
                            Drawable drawable = (Drawable) jVar.f12831b;
                            String str3 = packageInfo.packageName;
                            i9.l.d(str3, "packageName");
                            j0Var = new l8.j0(str2, new l8.m0(str3), null, drawable, null, 20);
                        } else {
                            j0Var = null;
                        }
                        if (j0Var != null) {
                            arrayList.add(j0Var);
                        }
                        i10 = -1633490746;
                    }
                    sVar.p(false);
                    if (arrayList.isEmpty()) {
                        sVar.W(-74534791);
                        g5.a.b(null, c.f91a, sVar, 48, 1);
                        sVar.p(false);
                    } else {
                        sVar.W(-74022795);
                        float fN = g5.a.n(120, sVar);
                        n1.c cVarE = n1.h.e(-330019374, new b(g0Var), sVar);
                        sVar.W(-1224400529);
                        boolean zF2 = sVar.f(nVar);
                        Object objK6 = sVar.K();
                        if (zF2 || objK6 == w0Var) {
                            z zVar2 = new z(nVar, this.f67c, this.f68d, this.f69e, 0);
                            sVar.h0(zVar2);
                            objK6 = zVar2;
                        }
                        sVar.p(false);
                        g5.a.c(arrayList, null, 4, cVarE, fN, 0.0f, (h9.k) objK6, sVar, 3456, 34);
                        sVar.p(false);
                    }
                }
                return zVar;
            default:
                e8.f1 f1Var = (e8.f1) this.f71g;
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    sVar2.W(-1224400529);
                    boolean zF3 = sVar2.f((h9.k) this.f70f) | sVar2.h(f1Var);
                    h9.k kVar = (h9.k) this.f70f;
                    Object objK7 = sVar2.K();
                    if (zF3 || objK7 == f1.n.f5051a) {
                        objK7 = new e8.e1(kVar, f1Var, this.f66b, this.f67c, this.f68d, this.f69e, 0);
                        sVar2.h0(objK7);
                    }
                    sVar2.p(false);
                    i2.c.l("添加", 0L, 0L, (h9.a) objK7, sVar2, 6, 6);
                }
                return t8.z.f12851a;
        }
    }
}

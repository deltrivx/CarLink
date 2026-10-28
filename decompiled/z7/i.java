package z7;

import f1.s;
import f1.w0;
import f1.w2;
import h9.n;
import java.io.IOException;
import java.util.List;
import l8.j0;
import l8.k0;
import org.xmlpull.v1.XmlPullParserException;
import t8.o;
import t8.z;
import x.n1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15760d;

    public /* synthetic */ i(int i7, int i10, w2 w2Var, int i11) {
        this.f15757a = i11;
        this.f15758b = i7;
        this.f15759c = i10;
        this.f15760d = w2Var;
    }

    public /* synthetic */ i(Object obj, int i7, int i10, int i11) {
        this.f15757a = i11;
        this.f15760d = obj;
        this.f15758b = i7;
        this.f15759c = i10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
        int i7 = this.f15757a;
        w0 w0Var = f1.n.f5051a;
        z zVar = z.f12851a;
        int i10 = this.f15759c;
        int i11 = this.f15758b;
        Object obj3 = this.f15760d;
        int i12 = 1;
        int i13 = 0;
        switch (i7) {
            case 0:
                s sVar = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    List listJ = n3.l.J("状态栏", "是否显示状态栏");
                    List listJ2 = n3.l.J(new j0("隐藏", new k0(false), null, null, null, 28), new j0("显示", new k0(true), null, null, null, 28));
                    sVar.W(1849434622);
                    Object objK = sVar.K();
                    if (objK == w0Var) {
                        objK = new n1(24);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    k9.a.c(listJ, listJ2, "STATUS_SHOW", false, false, (h9.k) objK, sVar, 196998, 24);
                    o oVar = n8.h.f8903a;
                    List listJ3 = n3.l.J(a2.f.F("状态栏大小(默认", "px)", n8.h.d()), "px");
                    t8.j jVar = new t8.j("STATUS_SIZE", Integer.valueOf(((k) ((w2) obj3).getValue()).f15766c));
                    t8.j jVarJ = a2.f.J(new n9.a(0.0f, Math.max(i11, i10) / 2), 0, sVar, 1849434622);
                    Object objK2 = sVar.K();
                    if (objK2 == w0Var) {
                        objK2 = new n1(25);
                        sVar.h0(objK2);
                    }
                    sVar.p(false);
                    a.a.i(listJ3, jVar, jVarJ, false, (h9.k) objK2, sVar, 24576, 8);
                    List listJ4 = n3.l.J("状态栏颜色", "设置状态栏颜色");
                    t8.j jVar2 = new t8.j("STATUS_COLOR", "#00000000");
                    sVar.W(1849434622);
                    Object objK3 = sVar.K();
                    if (objK3 == w0Var) {
                        objK3 = new n1(26);
                        sVar.h0(objK3);
                    }
                    sVar.p(false);
                    i2.c.g(listJ4, jVar2, false, (h9.k) objK3, sVar, 3510, 0);
                }
                break;
            case 1:
                s sVar2 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    List listJ5 = n3.l.J("导航栏", "是否显示导航栏");
                    List listJ6 = n3.l.J(new j0("隐藏", new k0(false), null, null, null, 28), new j0("显示", new k0(true), null, null, null, 28));
                    sVar2.W(1849434622);
                    Object objK4 = sVar2.K();
                    if (objK4 == w0Var) {
                        objK4 = new n1(27);
                        sVar2.h0(objK4);
                    }
                    sVar2.p(false);
                    k9.a.c(listJ5, listJ6, "NAVIGATION_SHOW", false, false, (h9.k) objK4, sVar2, 196998, 24);
                    List listJ7 = n3.l.J("导航栏位置", "导航栏在什么位置?");
                    List listJ8 = n3.l.J(new j0("左侧", new k0(false), null, null, null, 28), new j0("底部", new k0(true), null, null, null, 28));
                    sVar2.W(1849434622);
                    Object objK5 = sVar2.K();
                    if (objK5 == w0Var) {
                        objK5 = new n1(28);
                        sVar2.h0(objK5);
                    }
                    sVar2.p(false);
                    k9.a.c(listJ7, listJ8, "NAVIGATION_POSITION", false, false, (h9.k) objK5, sVar2, 196998, 24);
                    o oVar2 = n8.h.f8903a;
                    List listJ9 = n3.l.J(a2.f.F("导航栏大小(默认", "px)", n8.h.c()), "px");
                    t8.j jVar3 = new t8.j("NAVIGATION_SIZE", Integer.valueOf(((k) ((w2) obj3).getValue()).f15769f));
                    t8.j jVarJ2 = a2.f.J(new n9.a(0.0f, Math.max(i11, i10) / 2), 0, sVar2, 1849434622);
                    Object objK6 = sVar2.K();
                    if (objK6 == w0Var) {
                        objK6 = new n1(29);
                        sVar2.h0(objK6);
                    }
                    sVar2.p(false);
                    a.a.i(listJ9, jVar3, jVarJ2, false, (h9.k) objK6, sVar2, 24576, 8);
                    List listJ10 = n3.l.J("导航栏颜色", "设置导航栏颜色");
                    t8.j jVar4 = new t8.j("NAVIGATION_COLOR", "#00000000");
                    sVar2.W(1849434622);
                    Object objK7 = sVar2.K();
                    if (objK7 == w0Var) {
                        objK7 = new j(0);
                        sVar2.h0(objK7);
                    }
                    sVar2.p(false);
                    i2.c.g(listJ10, jVar4, false, (h9.k) objK7, sVar2, 3510, 0);
                }
                break;
            case 2:
                s sVar3 = (s) obj;
                w2 w2Var = (w2) obj3;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    g5.a.b(null, n1.h.e(720285556, new g8.h(w2Var, 15), sVar3), sVar3, 48, 1);
                    g5.a.b("状态栏设置", n1.h.e(118524189, new i(i11, i10, w2Var, i13), sVar3), sVar3, 54, 0);
                    g5.a.b("导航栏设置", n1.h.e(403660092, new i(i11, i10, w2Var, i12), sVar3), sVar3, 54, 0);
                    g5.a.b("全屏设置", b.f15745b, sVar3, 54, 0);
                }
                break;
            default:
                s sVar4 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    ((s7.d) obj3).f(i11, i10, sVar4, 0);
                }
                break;
        }
        return zVar;
    }
}

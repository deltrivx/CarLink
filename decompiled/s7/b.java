package s7;

import a2.f;
import android.app.Activity;
import f1.b1;
import f1.s;
import f1.w0;
import h9.k;
import h9.n;
import java.util.List;
import n1.h;
import n3.l;
import o7.q;
import t8.j;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f12584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f12585c;

    public /* synthetic */ b(Activity activity, b1 b1Var, int i7) {
        this.f12583a = i7;
        this.f12584b = activity;
        this.f12585c = b1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12583a) {
            case 0:
                s sVar = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    List listJ = l.J("悬浮图标", "应用后台时显示悬浮图标");
                    sVar.W(5004770);
                    Activity activity = this.f12584b;
                    boolean zH = sVar.h(activity);
                    Object objK = sVar.K();
                    w0 w0Var = f1.n.f5051a;
                    if (zH || objK == w0Var) {
                        objK = new s0.d(1, activity);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    g5.a.f(listJ, "FLOAT_ICON_SWITCH", false, false, (k) objK, sVar, 54, 12);
                    List listJ2 = l.J("悬浮图标大小", "px");
                    b1 b1Var = this.f12585c;
                    j jVar = new j("FLOAT_ICON_SIZE", Integer.valueOf(((e) b1Var.getValue()).f12590b));
                    j jVarJ = f.J(new n9.a(0.0f, 200.0f), 0, sVar, 1849434622);
                    Object objK2 = sVar.K();
                    if (objK2 == w0Var) {
                        objK2 = new q(15);
                        sVar.h0(objK2);
                    }
                    sVar.p(false);
                    a.a.i(listJ2, jVar, jVarJ, false, (k) objK2, sVar, 24582, 8);
                    List listJ3 = l.J("悬浮图标圆角", "px");
                    j jVar2 = new j("FLOAT_ICON_CLIP", Integer.valueOf(((e) b1Var.getValue()).f12591c));
                    j jVarJ2 = f.J(new n9.a(0.0f, 100.0f), 0, sVar, 1849434622);
                    Object objK3 = sVar.K();
                    if (objK3 == w0Var) {
                        objK3 = new q(16);
                        sVar.h0(objK3);
                    }
                    sVar.p(false);
                    a.a.i(listJ3, jVar2, jVarJ2, false, (k) objK3, sVar, 24582, 8);
                    List listJ4 = l.J("悬浮图标透明度", "");
                    j jVar3 = new j("FLOAT_ICON_ALPHA", Integer.valueOf(((e) b1Var.getValue()).f12592d));
                    j jVarJ3 = f.J(new n9.a(0.0f, 10.0f), 0, sVar, 1849434622);
                    Object objK4 = sVar.K();
                    if (objK4 == w0Var) {
                        objK4 = new q(17);
                        sVar.h0(objK4);
                    }
                    sVar.p(false);
                    a.a.i(listJ4, jVar3, jVarJ3, false, (k) objK4, sVar, 27654, 0);
                }
                break;
            default:
                s sVar2 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    g5.a.b(null, h.e(327795881, new b(this.f12584b, this.f12585c, 0), sVar2), sVar2, 48, 1);
                }
                break;
        }
        return z.f12851a;
    }
}

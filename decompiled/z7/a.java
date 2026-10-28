package z7;

import f1.s;
import f1.w0;
import h9.n;
import java.util.List;
import t8.z;
import x.n1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15741b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15742c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15743a;

    public /* synthetic */ a(int i7) {
        this.f15743a = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15743a) {
            case 0:
                s sVar = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    i2.c.m("设置", null, sVar, 6, 2);
                    i2.c.b(0, sVar);
                }
                break;
            default:
                s sVar2 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    List listJ = n3.l.J("沉浸模式", "内容延伸到系统栏");
                    t8.j jVar = new t8.j("IMMERSIVE_MODE", Boolean.TRUE);
                    sVar2.W(1849434622);
                    Object objK = sVar2.K();
                    w0 w0Var = f1.n.f5051a;
                    if (objK == w0Var) {
                        objK = new n1(20);
                        sVar2.h0(objK);
                    }
                    sVar2.p(false);
                    g5.a.g(listJ, jVar, false, (h9.k) objK, sVar2, 3126, 4);
                    List listJ2 = n3.l.J("哈曼全屏", "哈曼车机全屏显示");
                    sVar2.W(1849434622);
                    Object objK2 = sVar2.K();
                    if (objK2 == w0Var) {
                        objK2 = new n1(21);
                        sVar2.h0(objK2);
                    }
                    sVar2.p(false);
                    g5.a.f(listJ2, "FULL_SCREEN_HARMAN", false, false, (h9.k) objK2, sVar2, 24630, 12);
                    List listJ3 = n3.l.J("哪吒全屏", "哪吒竖屏车机全屏显示");
                    sVar2.W(1849434622);
                    Object objK3 = sVar2.K();
                    if (objK3 == w0Var) {
                        objK3 = new n1(22);
                        sVar2.h0(objK3);
                    }
                    sVar2.p(false);
                    g5.a.f(listJ3, "FULL_SCREEN_HOZON", false, false, (h9.k) objK3, sVar2, 25014, 8);
                }
                break;
        }
        return z.f12851a;
    }
}

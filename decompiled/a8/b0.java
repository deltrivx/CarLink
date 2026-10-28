package a8;

import android.content.Context;
import android.content.Intent;
import b8.h2;
import b8.r2;
import b8.s2;
import com.baidu.carlife.sdk.receiver.CarLife;
import com.muyetuge.carlifevehicle.activity.EmptyActivity;
import com.muyetuge.carlifevehicle.activity.MainActivity;
import com.muyetuge.carlifevehicle.service.MainService;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements fc.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f79b = new b0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f80c = new b0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f81d = new b0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b0 f82e = new b0(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0 f83f = new b0(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b0 f84g = new b0(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b0 f85h = new b0(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86a;

    public /* synthetic */ b0(int i7) {
        this.f86a = i7;
    }

    public /* synthetic */ b0(h2 h2Var, int i7) {
        this.f86a = i7;
    }

    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        int i7 = this.f86a;
        r2 r2Var = s2.f1649c;
        t8.z zVar = t8.z.f12851a;
        switch (i7) {
            case 0:
                b8.c2 c2Var = (b8.c2) obj;
                if (c2Var instanceof b8.g) {
                    hc.c cVar2 = n8.c.f8897a;
                    b8.g gVar = (b8.g) c2Var;
                    n8.c.e(gVar.f1589b, gVar.f1590c);
                }
                break;
            case 1:
                b8.c2 c2Var2 = (b8.c2) obj;
                if (c2Var2 instanceof b8.m) {
                    int i10 = ((b8.m) c2Var2).f1608b;
                    if (i10 == 1) {
                        t8.o oVar = EmptyActivity.f2911y;
                        t8.o oVar2 = EmptyActivity.f2911y;
                        Intent intent = new Intent((Context) oVar2.getValue(), (Class<?>) EmptyActivity.class);
                        intent.setFlags(268435456);
                        ((Context) oVar2.getValue()).startActivity(intent);
                    } else if (i10 == 2) {
                        int i11 = MainService.f2921a;
                        k8.d.a();
                    } else if (i10 == 3) {
                        hc.c cVar3 = n8.c.f8897a;
                        n8.c.f();
                    } else if (i10 != 4) {
                        MainActivity mainActivity = MainActivity.f2912y;
                        a.a.N();
                    } else {
                        hc.c cVar4 = n8.c.f8897a;
                        n8.c.i();
                    }
                }
                break;
            case 2:
                b8.c2 c2Var3 = (b8.c2) obj;
                if (c2Var3 instanceof b8.p) {
                    b8.p pVar = (b8.p) c2Var3;
                    d8.p.a(pVar.f1630b, pVar.f1632d, pVar.f1631c);
                }
                break;
            case 3:
                b8.c2 c2Var4 = (b8.c2) obj;
                if (c2Var4 instanceof b8.i0) {
                    CarLife.receiver().setConnectType(((b8.i0) c2Var4).f1598b);
                }
                break;
            case 4:
                b8.c2 c2Var5 = (b8.c2) obj;
                if (c2Var5 instanceof b8.r0) {
                    b8.r0 r0Var = (b8.r0) c2Var5;
                    if (!r0Var.f1642b) {
                        n8.o.a();
                    } else {
                        t8.o oVar3 = n8.o.f8930a;
                        n8.o.d(r0Var.f1643c, r0Var.f1644d);
                    }
                }
                break;
            case 5:
                b8.c2 c2Var6 = (b8.c2) obj;
                if (c2Var6 instanceof b8.s1) {
                    int i12 = ((b8.s1) c2Var6).f1648b;
                    r2Var.getClass();
                    r2.b(i12);
                    t8.o oVar4 = n8.d.f8898a;
                    n8.d.f(i12, "TASKER_THEME_STATE");
                }
                break;
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    t8.o oVar5 = n8.d.f8898a;
                    int iB = n8.d.b(0, "TASKER_THEME_STATE");
                    r2Var.getClass();
                    r2.b(iB);
                }
                break;
            case 7:
                b8.c2 c2Var7 = (b8.c2) obj;
                if (c2Var7 instanceof b8.v) {
                    d1.d(new y0(0), ((b8.v) c2Var7).f1659b);
                }
                break;
            default:
                b8.c2 c2Var8 = (b8.c2) obj;
                if (c2Var8 instanceof b8.b2) {
                    f2.d(((b8.b2) c2Var8).f1570b);
                }
                break;
        }
        return zVar;
    }
}

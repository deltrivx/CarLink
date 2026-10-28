package t7;

import f1.s;
import h9.n;
import n3.l;
import r1.m;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12793b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12794c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f12795d = new a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f12796e = new a(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f12797f = new a(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12798a;

    public /* synthetic */ a(int i7) {
        this.f12798a = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12798a) {
            case 0:
                s sVar = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    i2.c.m("设置", null, sVar, 6, 2);
                    i2.c.b(0, sVar);
                }
                break;
            case 1:
                s sVar2 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    i2.c.m("悬浮设置", null, sVar2, 6, 2);
                    i2.c.p("悬浮相关设置", sVar2, 6);
                }
                break;
            case 2:
                s sVar3 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    w7.f.f14170a.f(l.J("显示悬浮窗", "需要开启显示悬浮窗权限"), l.I(x6.a.i()), false, sVar3, 3462, 0);
                }
                break;
            case 3:
                s sVar4 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    g5.a.b(null, b.f12801c, sVar4, 48, 1);
                    a2.f.L(16, sVar4, m.f11116a, sVar4);
                }
                break;
            default:
                s sVar5 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    i2.c.m("设置", null, sVar5, 6, 2);
                    i2.c.b(0, sVar5);
                }
                break;
        }
        return z.f12851a;
    }
}

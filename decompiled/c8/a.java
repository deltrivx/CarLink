package c8;

import c1.u2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2454b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f2455c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f2456d = new a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f2457e = new a(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f2458f = new a(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f2459g = new a(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2460a;

    public /* synthetic */ a(int i7) {
        this.f2460a = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2460a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    i2.c.m("查看", null, sVar, 6, 2);
                    i2.c.b(0, sVar);
                }
                break;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    i2.c.m("映射列表为空", null, sVar2, 6, 2);
                    i2.c.p("点击恢复默认映射设置", sVar2, 6);
                }
                break;
            case 2:
                f1.s sVar3 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    u2.b("任务名称", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 6, 0, 131070);
                }
                break;
            case 3:
                f1.s sVar4 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    i2.c.m("添加", null, sVar4, 6, 2);
                }
                break;
            case 4:
                f1.s sVar5 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    i2.c.m("恢复", null, sVar5, 6, 2);
                    i2.c.b(0, sVar5);
                }
                break;
            default:
                f1.s sVar6 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar6.z()) {
                    sVar6.Q();
                } else {
                    i2.c.m("添加", null, sVar6, 6, 2);
                    i2.c.b(0, sVar6);
                }
                break;
        }
        return t8.z.f12851a;
    }
}

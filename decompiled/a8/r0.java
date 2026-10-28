package a8;

import b8.m2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.k f215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.h1 f217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f218e;

    public /* synthetic */ r0(h9.k kVar, x0 x0Var, f1.b1 b1Var, f1.b1 b1Var2, f1.h1 h1Var) {
        this.f215b = kVar;
        this.f216c = b1Var;
        this.f218e = b1Var2;
        this.f217d = h1Var;
    }

    public /* synthetic */ r0(h9.k kVar, e8.t0 t0Var, f1.b1 b1Var, f1.h1 h1Var, f1.b1 b1Var2) {
        this.f215b = kVar;
        this.f216c = b1Var;
        this.f217d = h1Var;
        this.f218e = b1Var2;
    }

    @Override // h9.a
    public final Object invoke() {
        int i7 = this.f214a;
        t8.z zVar = t8.z.f12851a;
        f1.b1 b1Var = this.f218e;
        f1.h1 h1Var = this.f217d;
        f1.b1 b1Var2 = this.f216c;
        h9.k kVar = this.f215b;
        switch (i7) {
            case 0:
                if (((String) b1Var2.getValue()).length() != 0) {
                    kVar.invoke(new m2("Audio", "播放音频", (String) b1Var2.getValue(), new b8.p((String) b1Var2.getValue(), h1Var.f(), ((Boolean) b1Var.getValue()).booleanValue())));
                } else {
                    hc.c cVar = n8.c.f8897a;
                    n8.c.j(0, "未选择音频文件");
                }
                break;
            default:
                if (zb.q.p0((String) b1Var2.getValue()) != null) {
                    int iF = h1Var.f();
                    b8.a.f1559c.getClass();
                    kVar.invoke(new m2("KeyBoard", "物理按键", kb.d.k(iF) + ((String) b1Var2.getValue()) + " " + (((Boolean) b1Var.getValue()).booleanValue() ? "阻止其他事件" : ""), new b8.u0(Integer.parseInt((String) b1Var2.getValue()), h1Var.f(), ((Boolean) b1Var.getValue()).booleanValue())));
                } else {
                    hc.c cVar2 = n8.c.f8897a;
                    n8.c.j(0, "按键映射必须为数字");
                }
                break;
        }
        return zVar;
    }
}

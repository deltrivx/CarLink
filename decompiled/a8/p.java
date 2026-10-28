package a8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f191c;

    public /* synthetic */ p(e2 e2Var, f1.b1 b1Var, f1.b1 b1Var2) {
        this.f190b = b1Var;
        this.f191c = b1Var2;
    }

    public /* synthetic */ p(f1.b1 b1Var, f1.b1 b1Var2) {
        this.f190b = b1Var;
        this.f191c = b1Var2;
    }

    @Override // h9.a
    public final Object invoke() {
        int i7 = this.f189a;
        t8.z zVar = t8.z.f12851a;
        f1.b1 b1Var = this.f191c;
        f1.b1 b1Var2 = this.f190b;
        switch (i7) {
            case 0:
                if (((String) b1Var2.getValue()).length() == 0 || ((String) b1Var.getValue()).length() == 0) {
                    hc.c cVar = n8.c.f8897a;
                    n8.c.j(0, "请先选择应用包名及活动");
                } else {
                    hc.c cVar2 = n8.c.f8897a;
                    n8.c.e((String) b1Var2.getValue(), (String) b1Var.getValue());
                }
                break;
            default:
                if (((String) b1Var2.getValue()).length() == 0) {
                    hc.c cVar3 = n8.c.f8897a;
                    n8.c.j(0, "名称不能为空");
                } else if (((String) b1Var.getValue()).length() > 0 && ((String) b1Var.getValue()).length() < 8) {
                    hc.c cVar4 = n8.c.f8897a;
                    n8.c.j(0, "密码不能少于8位");
                } else {
                    hc.c cVar5 = n8.c.f8897a;
                    n8.c.j(0, "请稍等");
                    e2.d((String) b1Var2.getValue(), (String) b1Var.getValue(), new y0(2));
                }
                break;
        }
        return zVar;
    }
}

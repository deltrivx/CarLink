package a8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f147c;

    public /* synthetic */ j(String str, f1.b1 b1Var, int i7) {
        this.f145a = i7;
        this.f146b = str;
        this.f147c = b1Var;
    }

    @Override // h9.a
    public final Object invoke() {
        int i7 = this.f145a;
        t8.z zVar = t8.z.f12851a;
        f1.b1 b1Var = this.f147c;
        String str = this.f146b;
        switch (i7) {
            case 0:
                if (str.length() != 0) {
                    b1Var.setValue(Boolean.TRUE);
                } else {
                    hc.c cVar = n8.c.f8897a;
                    n8.c.j(0, "请先选择应用");
                }
                break;
            default:
                if (str.length() != 0) {
                    b1Var.setValue(Boolean.TRUE);
                } else {
                    hc.c cVar2 = n8.c.f8897a;
                    n8.c.j(0, "请先选择音频文件");
                }
                break;
        }
        return zVar;
    }
}

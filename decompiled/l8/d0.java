package l8;

import f1.b1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.k f8131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f8133d;

    public /* synthetic */ d0(h9.k kVar, String str, b1 b1Var, int i7) {
        this.f8130a = i7;
        this.f8131b = kVar;
        this.f8132c = str;
        this.f8133d = b1Var;
    }

    @Override // h9.a
    public final Object invoke() {
        int i7 = this.f8130a;
        t8.z zVar = t8.z.f12851a;
        b1 b1Var = this.f8133d;
        String str = this.f8132c;
        h9.k kVar = this.f8131b;
        switch (i7) {
            case 0:
                if (((Boolean) kVar.invoke(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()))).booleanValue()) {
                    b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                    t8.o oVar = n8.d.f8898a;
                    n8.d.e(str, ((Boolean) b1Var.getValue()).booleanValue());
                }
                break;
            default:
                if (((Boolean) kVar.invoke(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()))).booleanValue()) {
                    b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                    t8.o oVar2 = n8.d.f8898a;
                    n8.d.f(((Boolean) b1Var.getValue()).booleanValue() ? 1 : 0, str);
                }
                break;
        }
        return zVar;
    }
}

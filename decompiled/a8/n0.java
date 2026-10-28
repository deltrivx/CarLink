package a8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.h1 f182c;

    public /* synthetic */ n0(f1.b1 b1Var, f1.h1 h1Var, int i7) {
        this.f180a = i7;
        this.f181b = b1Var;
        this.f182c = h1Var;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f180a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    String str = ((Boolean) this.f181b.getValue()).booleanValue() ? "旧版" : "新版";
                    i2.c.m(str + "通道" + this.f182c.f(), null, sVar, 0, 2);
                    i2.c.b(0, sVar);
                }
                break;
            default:
                f1.s sVar2 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    String str2 = (m7.i.b(this.f181b) || m7.j.f8589m) ? "旧版" : "新版";
                    i2.c.m(str2 + "通道" + this.f182c.f(), null, sVar2, 0, 2);
                    i2.c.b(0, sVar2);
                }
                break;
        }
        return t8.z.f12851a;
    }
}

package o7;

import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f9494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f9495c;

    public /* synthetic */ i(j jVar, u uVar, int i7, int i10) {
        this.f9493a = i10;
        this.f9494b = jVar;
        this.f9495c = uVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f9493a;
        f1.s sVar = (f1.s) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                this.f9494b.b(this.f9495c, sVar, f1.b.y(49));
                break;
            default:
                this.f9494b.c(this.f9495c, sVar, f1.b.y(49));
                break;
        }
        return z.f12851a;
    }
}

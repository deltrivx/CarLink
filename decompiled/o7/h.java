package o7;

import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f9492b;

    public /* synthetic */ h(j jVar, int i7, int i10) {
        this.f9491a = i10;
        this.f9492b = jVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f9491a;
        f1.s sVar = (f1.s) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                this.f9492b.d(f1.b.y(7), sVar);
                break;
            case 1:
                this.f9492b.d(f1.b.y(7), sVar);
                break;
            default:
                this.f9492b.a(f1.b.y(7), sVar);
                break;
        }
        return z.f12851a;
    }
}

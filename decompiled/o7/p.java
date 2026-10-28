package o7;

import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f9509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t8.j f9510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h9.k f9511d;

    public /* synthetic */ p(j jVar, t8.j jVar2, h9.k kVar, int i7, int i10) {
        this.f9508a = i10;
        this.f9509b = jVar;
        this.f9510c = jVar2;
        this.f9511d = kVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f9508a;
        f1.s sVar = (f1.s) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                this.f9509b.f(this.f9510c, this.f9511d, sVar, f1.b.y(433));
                break;
            default:
                this.f9509b.e(this.f9510c, this.f9511d, sVar, f1.b.y(433));
                break;
        }
        return z.f12851a;
    }
}

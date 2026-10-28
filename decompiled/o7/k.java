package o7;

import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f9499b;

    public /* synthetic */ k(l lVar, int i7, int i10) {
        this.f9498a = i10;
        this.f9499b = lVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f9498a;
        f1.s sVar = (f1.s) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                this.f9499b.c(f1.b.y(1), sVar);
                break;
            default:
                this.f9499b.i(f1.b.y(1), sVar);
                break;
        }
        return z.f12851a;
    }
}

package m5;

import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f8438b;

    public /* synthetic */ a(l lVar, int i7) {
        this.f8437a = i7;
        this.f8438b = lVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f8437a) {
            case 0:
                l lVar = this.f8438b;
                i9.l.e(lVar, "$controller");
                lVar.f8495o = true;
                break;
            default:
                l lVar2 = this.f8438b;
                i9.l.e(lVar2, "$controller");
                lVar2.f8496p = true;
                break;
        }
        return z.f12851a;
    }
}

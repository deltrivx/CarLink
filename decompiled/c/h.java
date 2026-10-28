package c;

import f1.b1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements androidx.lifecycle.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1724c;

    public /* synthetic */ h(int i7, Object obj, Object obj2) {
        this.f1722a = i7;
        this.f1723b = obj;
        this.f1724c = obj2;
    }

    @Override // androidx.lifecycle.r
    public final void c(androidx.lifecycle.t tVar, androidx.lifecycle.n nVar) {
        switch (this.f1722a) {
            case 0:
                l0 l0Var = (l0) this.f1723b;
                p4.l lVar = (p4.l) this.f1724c;
                if (nVar == androidx.lifecycle.n.ON_CREATE) {
                    l0Var.f1757e = a4.a.a(lVar);
                    l0Var.d(l0Var.f1759g);
                }
                break;
            default:
                ((b1) this.f1724c).setValue(((androidx.lifecycle.v) this.f1723b).f1072c);
                break;
        }
    }
}

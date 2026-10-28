package w0;

import q2.d2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i9.t f13908b;

    public /* synthetic */ r0(i9.t tVar, int i7) {
        this.f13907a = i7;
        this.f13908b = tVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    @Override // h9.k
    public final Object invoke(Object obj) {
        boolean z10;
        switch (this.f13907a) {
            case 0:
                if (((w) obj).f13978f.f1408a.f1393a.f1353b.length() > 0) {
                    this.f13908b.f6684a = false;
                }
                return t8.z.f12851a;
            default:
                d2 d2Var = (d2) obj;
                i9.t tVar = this.f13908b;
                if (tVar.f6684a) {
                    z10 = true;
                } else {
                    i9.l.c(d2Var, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                    if (((z.e1) d2Var).f15356o) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                tVar.f6684a = z10;
                return Boolean.valueOf(!z10);
        }
    }
}

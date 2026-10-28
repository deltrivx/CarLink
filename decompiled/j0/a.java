package j0;

import fc.s;
import fc.x;
import h9.k;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6863a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6865c;

    public /* synthetic */ a(k kVar, boolean z10) {
        this.f6865c = kVar;
        this.f6864b = z10;
    }

    public /* synthetic */ a(boolean z10, u0.b bVar) {
        this.f6864b = z10;
        this.f6865c = bVar;
    }

    @Override // h9.a
    public final Object invoke() {
        s sVarI;
        switch (this.f6863a) {
            case 0:
                ((k) this.f6865c).invoke(Boolean.valueOf(!this.f6864b));
                return z.f12851a;
            default:
                u0.b bVar = (u0.b) this.f6865c;
                boolean z10 = this.f6864b;
                z zVar = z.f12851a;
                if (z10 && (sVarI = bVar.i()) != null) {
                    ((x) sVarI).q(zVar);
                }
                return zVar;
        }
    }
}

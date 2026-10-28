package g0;

import h0.g0;
import java.util.Collection;
import java.util.List;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5729a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5731c;

    public /* synthetic */ t(int i7, Collection collection) {
        this.f5730b = i7;
        this.f5731c = collection;
    }

    public /* synthetic */ t(v vVar, int i7) {
        this.f5731c = vVar;
        this.f5730b = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f5729a) {
            case 0:
                g0 g0Var = (g0) obj;
                f0.a aVar = ((v) this.f5731c).f5738a;
                p1.f fVarH = n4.e.h();
                n4.e.r(fVarH, n4.e.k(fVarH), fVarH != null ? fVarH.e() : null);
                aVar.getClass();
                int i7 = g0Var.f6316a;
                if (i7 == -1) {
                    i7 = 2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    g0Var.a(this.f5730b + i10);
                }
                return z.f12851a;
            default:
                return Boolean.valueOf(((List) obj).addAll(this.f5730b, (Collection) this.f5731c));
        }
    }
}

package w9;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f14206b;

    public /* synthetic */ j(l lVar, int i7) {
        this.f14205a = i7;
        this.f14206b = lVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f14205a) {
            case 0:
                List listI = n3.l.I(y9.e.a(this.f14206b.f14214a.f344d, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING"));
                return listI.isEmpty() ? y9.g.f15129a : new y9.i(0, listI);
            default:
                return this.f14206b.f14214a.f344d.e();
        }
    }
}

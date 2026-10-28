package rc;

import java.util.List;
import pc.x;
import u8.b0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qc.u f12336j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f12337l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12338m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(qc.b bVar, qc.u uVar) {
        super(bVar, uVar, (String) null, 12);
        i9.l.e(bVar, "json");
        this.f12336j = uVar;
        List listJ0 = u8.p.J0(uVar.f11052a.keySet());
        this.k = listJ0;
        this.f12337l = listJ0.size() * 2;
        this.f12338m = -1;
    }

    @Override // rc.m, rc.a
    public final qc.j B(String str) {
        i9.l.e(str, "tag");
        if (this.f12338m % 2 != 0) {
            return (qc.j) b0.V0(str, this.f12336j);
        }
        x xVar = qc.k.f11042a;
        return new qc.o(str, true);
    }

    @Override // rc.m, rc.a
    public final String O(nc.e eVar, int i7) {
        i9.l.e(eVar, "descriptor");
        return (String) this.k.get(i7 / 2);
    }

    @Override // rc.m, rc.a
    public final qc.j Q() {
        return this.f12336j;
    }

    @Override // rc.m
    /* JADX INFO: renamed from: V */
    public final qc.u Q() {
        return this.f12336j;
    }

    @Override // rc.m, rc.a, oc.a
    public final void p(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
    }

    @Override // rc.m, oc.a
    public final int w(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
        int i7 = this.f12338m;
        if (i7 >= this.f12337l - 1) {
            return -1;
        }
        int i10 = i7 + 1;
        this.f12338m = i10;
        return i10;
    }
}

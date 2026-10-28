package u0;

import l0.s;
import l0.u0;
import r2.k1;
import r2.n2;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f12972b;

    public /* synthetic */ c(e eVar, int i7) {
        this.f12971a = i7;
        this.f12972b = eVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f12971a) {
            case 0:
                q2.f.s(this.f12972b);
                return z.f12851a;
            case 1:
                this.f12972b.f12980v.h(true);
                return Boolean.TRUE;
            case 2:
                this.f12972b.f12980v.d(true);
                return Boolean.TRUE;
            case 3:
                this.f12972b.f12980v.f();
                return Boolean.TRUE;
            case 4:
                q2.f.s(this.f12972b);
                return z.f12851a;
            case 5:
                this.f12972b.f12980v.o();
                return Boolean.TRUE;
            case 6:
                e eVar = this.f12972b;
                s sVar = eVar.f12977s.f7869w;
                sVar.f7826b.f7864r.W(eVar.f12981w.f5870e);
                return Boolean.TRUE;
            default:
                e eVar2 = this.f12972b;
                u0 u0Var = eVar2.f12977s;
                w1.o oVar = eVar2.f12982x;
                if (u0Var.b()) {
                    n2 n2Var = u0Var.f7850c;
                    if (n2Var != null) {
                        ((k1) n2Var).b();
                    }
                } else {
                    w1.o.b(oVar);
                }
                return Boolean.TRUE;
        }
    }
}

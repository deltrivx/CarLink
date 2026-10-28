package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g2 implements cc.y, d2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f4962d = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y8.h f4963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f4964b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile y8.h f4965c;

    public g2(y8.h hVar) {
        this.f4963a = hVar;
    }

    public final void a() {
        synchronized (this.f4964b) {
            try {
                y8.h hVar = this.f4965c;
                if (hVar == null) {
                    this.f4965c = f4962d;
                } else {
                    k0 k0Var = new k0(0);
                    cc.a1 a1Var = (cc.a1) hVar.l(cc.v.f2678b);
                    if (a1Var != null) {
                        a1Var.a(k0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f1.d2
    public final void c() {
        a();
    }

    @Override // f1.d2
    public final void e() {
        a();
    }

    @Override // f1.d2
    public final void f() {
    }

    @Override // cc.y
    public final y8.h u() {
        y8.h hVarS;
        y8.h hVar = this.f4965c;
        if (hVar == null || hVar == f4962d) {
            q1.c cVar = (q1.c) this.f4963a.l(q1.c.f10579b);
            y8.h f2Var = cVar != null ? new f2(cVar, this) : y8.i.f15108a;
            synchronized (this.f4964b) {
                try {
                    y8.h hVar2 = this.f4965c;
                    if (hVar2 == null) {
                        y8.h hVar3 = this.f4963a;
                        hVarS = hVar3.s(new cc.c1((cc.a1) hVar3.l(cc.v.f2678b))).s(y8.i.f15108a).s(f2Var);
                    } else if (hVar2 == f4962d) {
                        y8.h hVar4 = this.f4963a;
                        cc.c1 c1Var = new cc.c1((cc.a1) hVar4.l(cc.v.f2678b));
                        c1Var.B(new k0(0));
                        hVarS = hVar4.s(c1Var).s(y8.i.f15108a).s(f2Var);
                    } else {
                        hVarS = hVar2;
                    }
                    this.f4965c = hVarS;
                } catch (Throwable th) {
                    throw th;
                }
            }
            hVar = hVarS;
        }
        i9.l.b(hVar);
        return hVar;
    }
}

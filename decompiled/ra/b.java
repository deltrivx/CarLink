package ra;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends xa.i implements xa.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f11836e;

    public /* synthetic */ b(int i7) {
        this.f11833b = i7;
    }

    @Override // xa.i
    public final xa.a a() {
        switch (this.f11833b) {
            case 0:
                f fVarD = d();
                if (fVarD.isInitialized()) {
                    return fVarD;
                }
                throw new cc.s();
            default:
                l lVarE = e();
                if (lVarE.isInitialized()) {
                    return lVarE;
                }
                throw new cc.s();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        switch (this.f11833b) {
            case 0:
                f fVar = null;
                try {
                    try {
                        f.f11927h.getClass();
                        f(new f(eVar, gVar));
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (fVar != null) {
                            f(fVar);
                        }
                        throw th;
                    }
                } catch (xa.q e7) {
                    f fVar2 = (f) e7.f14823a;
                    try {
                        throw e7;
                    } catch (Throwable th2) {
                        th = th2;
                        fVar = fVar2;
                        if (fVar != null) {
                            f(fVar);
                        }
                        throw th;
                    }
                }
            default:
                l lVar = null;
                try {
                    try {
                        l.f12067h.getClass();
                        g(new l(eVar));
                        return this;
                    } catch (Throwable th3) {
                        th = th3;
                        if (lVar != null) {
                            g(lVar);
                        }
                        throw th;
                    }
                } catch (xa.q e10) {
                    l lVar2 = (l) e10.f14823a;
                    try {
                        throw e10;
                    } catch (Throwable th4) {
                        th = th4;
                        lVar = lVar2;
                        if (lVar != null) {
                            g(lVar);
                        }
                        throw th;
                    }
                }
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        switch (this.f11833b) {
            case 0:
                f((f) nVar);
                break;
            default:
                g((l) nVar);
                break;
        }
        return this;
    }

    public final Object clone() {
        switch (this.f11833b) {
            case 0:
                b bVar = new b(0);
                bVar.f11836e = e.f11889p;
                bVar.f(d());
                return bVar;
            default:
                b bVar2 = new b(1);
                bVar2.f11836e = xa.d.f14765a;
                bVar2.g(e());
                return bVar2;
        }
    }

    public f d() {
        f fVar = new f(this);
        int i7 = this.f11834c;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        fVar.f11930c = this.f11835d;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        fVar.f11931d = (e) this.f11836e;
        fVar.f11929b = i10;
        return fVar;
    }

    public l e() {
        l lVar = new l(this);
        int i7 = this.f11834c;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        lVar.f12070c = this.f11835d;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        lVar.f12071d = (xa.t) this.f11836e;
        lVar.f12069b = i10;
        return lVar;
    }

    public void f(f fVar) {
        e eVar;
        if (fVar == f.f11926g) {
            return;
        }
        int i7 = fVar.f11929b;
        if ((i7 & 1) == 1) {
            int i10 = fVar.f11930c;
            this.f11834c = 1 | this.f11834c;
            this.f11835d = i10;
        }
        if ((i7 & 2) == 2) {
            e eVar2 = fVar.f11931d;
            if ((this.f11834c & 2) != 2 || (eVar = (e) this.f11836e) == e.f11889p) {
                this.f11836e = eVar2;
            } else {
                c cVarE = c.e();
                cVarE.f(eVar);
                cVarE.f(eVar2);
                this.f11836e = cVarE.d();
            }
            this.f11834c |= 2;
        }
        this.f14792a = this.f14792a.d(fVar.f11928a);
    }

    public void g(l lVar) {
        if (lVar == l.f12066g) {
            return;
        }
        int i7 = lVar.f12069b;
        if ((i7 & 1) == 1) {
            int i10 = lVar.f12070c;
            this.f11834c = 1 | this.f11834c;
            this.f11835d = i10;
        }
        if ((i7 & 2) == 2) {
            xa.t tVar = lVar.f12071d;
            tVar.getClass();
            this.f11834c = 2 | this.f11834c;
            this.f11836e = tVar;
        }
        this.f14792a = this.f14792a.d(lVar.f12068a);
    }
}

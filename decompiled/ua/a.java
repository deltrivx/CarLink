package ua;

import xa.n;
import xa.q;
import xa.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends xa.i implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13231e;

    public /* synthetic */ a(int i7) {
        this.f13228b = i7;
    }

    @Override // xa.i
    public final xa.a a() {
        switch (this.f13228b) {
            case 0:
                b bVarD = d();
                bVarD.isInitialized();
                return bVarD;
            default:
                c cVarE = e();
                cVarE.isInitialized();
                return cVarE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        switch (this.f13228b) {
            case 0:
                b bVar = null;
                try {
                    try {
                        b.f13233h.getClass();
                        f(new b(eVar));
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (bVar != null) {
                            f(bVar);
                        }
                        throw th;
                    }
                } catch (q e7) {
                    b bVar2 = (b) e7.f14823a;
                    try {
                        throw e7;
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = bVar2;
                        if (bVar != null) {
                            f(bVar);
                        }
                        throw th;
                    }
                }
            default:
                c cVar = null;
                try {
                    try {
                        c.f13241h.getClass();
                        g(new c(eVar));
                        return this;
                    } catch (Throwable th3) {
                        th = th3;
                        if (cVar != null) {
                            g(cVar);
                        }
                        throw th;
                    }
                } catch (q e10) {
                    c cVar2 = (c) e10.f14823a;
                    try {
                        throw e10;
                    } catch (Throwable th4) {
                        th = th4;
                        cVar = cVar2;
                        if (cVar != null) {
                            g(cVar);
                        }
                        throw th;
                    }
                }
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(n nVar) {
        switch (this.f13228b) {
            case 0:
                f((b) nVar);
                break;
            default:
                g((c) nVar);
                break;
        }
        return this;
    }

    public final Object clone() {
        switch (this.f13228b) {
            case 0:
                a aVar = new a(0);
                aVar.f(d());
                return aVar;
            default:
                a aVar2 = new a(1);
                aVar2.g(e());
                return aVar2;
        }
    }

    public b d() {
        b bVar = new b(this);
        int i7 = this.f13229c;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        bVar.f13236c = this.f13230d;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        bVar.f13237d = this.f13231e;
        bVar.f13235b = i10;
        return bVar;
    }

    public c e() {
        c cVar = new c(this);
        int i7 = this.f13229c;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        cVar.f13244c = this.f13230d;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        cVar.f13245d = this.f13231e;
        cVar.f13243b = i10;
        return cVar;
    }

    public void f(b bVar) {
        if (bVar == b.f13232g) {
            return;
        }
        int i7 = bVar.f13235b;
        if ((i7 & 1) == 1) {
            int i10 = bVar.f13236c;
            this.f13229c = 1 | this.f13229c;
            this.f13230d = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = bVar.f13237d;
            this.f13229c = 2 | this.f13229c;
            this.f13231e = i11;
        }
        this.f14792a = this.f14792a.d(bVar.f13234a);
    }

    public void g(c cVar) {
        if (cVar == c.f13240g) {
            return;
        }
        int i7 = cVar.f13243b;
        if ((i7 & 1) == 1) {
            int i10 = cVar.f13244c;
            this.f13229c = 1 | this.f13229c;
            this.f13230d = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = cVar.f13245d;
            this.f13229c = 2 | this.f13229c;
            this.f13231e = i11;
        }
        this.f14792a = this.f14792a.d(cVar.f13242a);
    }
}

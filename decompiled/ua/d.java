package ua;

import xa.n;
import xa.q;
import xa.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends xa.i implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f13249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f13250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f13251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f13252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f13253g;

    public static d e() {
        d dVar = new d();
        dVar.f13249c = b.f13232g;
        c cVar = c.f13240g;
        dVar.f13250d = cVar;
        dVar.f13251e = cVar;
        dVar.f13252f = cVar;
        dVar.f13253g = cVar;
        return dVar;
    }

    @Override // xa.i
    public final xa.a a() {
        e eVarD = d();
        eVarD.isInitialized();
        return eVarD;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        e eVar2 = null;
        try {
            try {
                e.k.getClass();
                f(new e(eVar, gVar));
                return this;
            } catch (q e7) {
                e eVar3 = (e) e7.f14823a;
                try {
                    throw e7;
                } catch (Throwable th) {
                    th = th;
                    eVar2 = eVar3;
                    if (eVar2 != null) {
                        f(eVar2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (eVar2 != null) {
                f(eVar2);
            }
            throw th;
        }
    }

    @Override // xa.i
    public final /* bridge */ /* synthetic */ xa.i c(n nVar) {
        f((e) nVar);
        return this;
    }

    public final Object clone() {
        d dVarE = e();
        dVarE.f(d());
        return dVarE;
    }

    public final e d() {
        e eVar = new e(this);
        int i7 = this.f13248b;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        eVar.f13257c = this.f13249c;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        eVar.f13258d = this.f13250d;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        eVar.f13259e = this.f13251e;
        if ((i7 & 8) == 8) {
            i10 |= 8;
        }
        eVar.f13260f = this.f13252f;
        if ((i7 & 16) == 16) {
            i10 |= 16;
        }
        eVar.f13261g = this.f13253g;
        eVar.f13256b = i10;
        return eVar;
    }

    public final void f(e eVar) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        b bVar;
        if (eVar == e.f13254j) {
            return;
        }
        if ((eVar.f13256b & 1) == 1) {
            b bVar2 = eVar.f13257c;
            if ((this.f13248b & 1) != 1 || (bVar = this.f13249c) == b.f13232g) {
                this.f13249c = bVar2;
            } else {
                a aVar = new a(0);
                aVar.f(bVar);
                aVar.f(bVar2);
                this.f13249c = aVar.d();
            }
            this.f13248b |= 1;
        }
        if ((eVar.f13256b & 2) == 2) {
            c cVar5 = eVar.f13258d;
            if ((this.f13248b & 2) != 2 || (cVar4 = this.f13250d) == c.f13240g) {
                this.f13250d = cVar5;
            } else {
                a aVarG = c.g(cVar4);
                aVarG.g(cVar5);
                this.f13250d = aVarG.e();
            }
            this.f13248b |= 2;
        }
        if ((eVar.f13256b & 4) == 4) {
            c cVar6 = eVar.f13259e;
            if ((this.f13248b & 4) != 4 || (cVar3 = this.f13251e) == c.f13240g) {
                this.f13251e = cVar6;
            } else {
                a aVarG2 = c.g(cVar3);
                aVarG2.g(cVar6);
                this.f13251e = aVarG2.e();
            }
            this.f13248b |= 4;
        }
        if ((eVar.f13256b & 8) == 8) {
            c cVar7 = eVar.f13260f;
            if ((this.f13248b & 8) != 8 || (cVar2 = this.f13252f) == c.f13240g) {
                this.f13252f = cVar7;
            } else {
                a aVarG3 = c.g(cVar2);
                aVarG3.g(cVar7);
                this.f13252f = aVarG3.e();
            }
            this.f13248b |= 8;
        }
        if ((eVar.f13256b & 16) == 16) {
            c cVar8 = eVar.f13261g;
            if ((this.f13248b & 16) != 16 || (cVar = this.f13253g) == c.f13240g) {
                this.f13253g = cVar8;
            } else {
                a aVarG4 = c.g(cVar);
                aVarG4.g(cVar8);
                this.f13253g = aVarG4.e();
            }
            this.f13248b |= 16;
        }
        this.f14792a = this.f14792a.d(eVar.f13255a);
    }
}

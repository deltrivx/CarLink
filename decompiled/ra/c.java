package ra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends xa.i implements xa.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f11847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f11849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f11850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f11854j;
    public List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11856m;

    public static c e() {
        c cVar = new c();
        cVar.f11847c = d.BYTE;
        cVar.f11854j = h.f11960g;
        cVar.k = Collections.EMPTY_LIST;
        return cVar;
    }

    @Override // xa.i
    public final xa.a a() {
        e eVarD = d();
        if (eVarD.isInitialized()) {
            return eVarD;
        }
        throw new cc.s();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // xa.i
    public final xa.i b(xa.e eVar, xa.g gVar) throws Throwable {
        e eVar2 = null;
        try {
            try {
                e.f11890q.getClass();
                f(new e(eVar, gVar));
                return this;
            } catch (xa.q e7) {
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
    public final /* bridge */ /* synthetic */ xa.i c(xa.n nVar) {
        f((e) nVar);
        return this;
    }

    public final Object clone() {
        c cVarE = e();
        cVarE.f(d());
        return cVarE;
    }

    public final e d() {
        e eVar = new e(this);
        int i7 = this.f11846b;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        eVar.f11893c = this.f11847c;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        eVar.f11894d = this.f11848d;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        eVar.f11895e = this.f11849e;
        if ((i7 & 8) == 8) {
            i10 |= 8;
        }
        eVar.f11896f = this.f11850f;
        if ((i7 & 16) == 16) {
            i10 |= 16;
        }
        eVar.f11897g = this.f11851g;
        if ((i7 & 32) == 32) {
            i10 |= 32;
        }
        eVar.f11898h = this.f11852h;
        if ((i7 & 64) == 64) {
            i10 |= 64;
        }
        eVar.f11899i = this.f11853i;
        if ((i7 & 128) == 128) {
            i10 |= 128;
        }
        eVar.f11900j = this.f11854j;
        if ((i7 & 256) == 256) {
            this.k = Collections.unmodifiableList(this.k);
            this.f11846b &= -257;
        }
        eVar.k = this.k;
        if ((i7 & 512) == 512) {
            i10 |= 256;
        }
        eVar.f11901l = this.f11855l;
        if ((i7 & 1024) == 1024) {
            i10 |= 512;
        }
        eVar.f11902m = this.f11856m;
        eVar.f11892b = i10;
        return eVar;
    }

    public final void f(e eVar) {
        h hVar;
        if (eVar == e.f11889p) {
            return;
        }
        if ((eVar.f11892b & 1) == 1) {
            d dVar = eVar.f11893c;
            dVar.getClass();
            this.f11846b = 1 | this.f11846b;
            this.f11847c = dVar;
        }
        int i7 = eVar.f11892b;
        if ((i7 & 2) == 2) {
            long j5 = eVar.f11894d;
            this.f11846b |= 2;
            this.f11848d = j5;
        }
        if ((i7 & 4) == 4) {
            float f10 = eVar.f11895e;
            this.f11846b = 4 | this.f11846b;
            this.f11849e = f10;
        }
        if ((i7 & 8) == 8) {
            double d10 = eVar.f11896f;
            this.f11846b |= 8;
            this.f11850f = d10;
        }
        if ((i7 & 16) == 16) {
            int i10 = eVar.f11897g;
            this.f11846b = 16 | this.f11846b;
            this.f11851g = i10;
        }
        if ((i7 & 32) == 32) {
            int i11 = eVar.f11898h;
            this.f11846b = 32 | this.f11846b;
            this.f11852h = i11;
        }
        if ((i7 & 64) == 64) {
            int i12 = eVar.f11899i;
            this.f11846b = 64 | this.f11846b;
            this.f11853i = i12;
        }
        if ((i7 & 128) == 128) {
            h hVar2 = eVar.f11900j;
            if ((this.f11846b & 128) != 128 || (hVar = this.f11854j) == h.f11960g) {
                this.f11854j = hVar2;
            } else {
                g gVar = new g(0);
                gVar.f11947d = Collections.EMPTY_LIST;
                gVar.g(hVar);
                gVar.g(hVar2);
                this.f11854j = gVar.d();
            }
            this.f11846b |= 128;
        }
        if (!eVar.k.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k = eVar.k;
                this.f11846b &= -257;
            } else {
                if ((this.f11846b & 256) != 256) {
                    this.k = new ArrayList(this.k);
                    this.f11846b |= 256;
                }
                this.k.addAll(eVar.k);
            }
        }
        int i13 = eVar.f11892b;
        if ((i13 & 256) == 256) {
            int i14 = eVar.f11901l;
            this.f11846b |= 512;
            this.f11855l = i14;
        }
        if ((i13 & 512) == 512) {
            int i15 = eVar.f11902m;
            this.f11846b |= 1024;
            this.f11856m = i15;
        }
        this.f14792a = this.f14792a.d(eVar.f11891a);
    }
}

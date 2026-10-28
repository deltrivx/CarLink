package v0;

import b3.g0;
import b3.r0;
import b3.u;
import l0.q0;
import u8.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f13512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f3.d f13513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13517g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n3.c f13519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b3.b f13520j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f13521l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f13522m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f13523n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n3.o f13524o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f13528s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f13518h = a.f13483a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f13525p = n3.b.h(0, 0, 0, 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13526q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13527r = -1;

    public e(String str, r0 r0Var, f3.d dVar, int i7, boolean z10, int i10, int i11) {
        this.f13511a = str;
        this.f13512b = r0Var;
        this.f13513c = dVar;
        this.f13514d = i7;
        this.f13515e = z10;
        this.f13516f = i10;
        this.f13517g = i11;
        long j5 = 0;
        this.f13521l = (j5 & 4294967295L) | (j5 << 32);
    }

    public static long f(e eVar, long j5, n3.o oVar) {
        r0 r0Var = eVar.f13512b;
        b bVar = eVar.f13522m;
        n3.c cVar = eVar.f13519i;
        i9.l.b(cVar);
        b bVarZ = n3.r.z(bVar, oVar, r0Var, cVar, eVar.f13513c);
        eVar.f13522m = bVarZ;
        return bVarZ.a(eVar.f13517g, j5);
    }

    public final int a(int i7, n3.o oVar) {
        int i10 = this.f13526q;
        int i11 = this.f13527r;
        if (i7 == i10 && i10 != -1) {
            return i11;
        }
        long jA = n3.b.a(0, i7, 0, Integer.MAX_VALUE);
        if (this.f13517g > 1) {
            jA = f(this, jA, oVar);
        }
        u uVarE = e(oVar);
        long jG0 = n3.n.g0(jA, this.f13515e, this.f13514d, uVarE.d());
        boolean z10 = this.f13515e;
        int i12 = this.f13514d;
        int i13 = this.f13516f;
        int iK = q0.k(new b3.b((j3.d) uVarE, ((z10 || !(i12 == 2 || i12 == 4 || i12 == 5)) && i13 >= 1) ? i13 : 1, i12, jG0).b());
        int i14 = n3.a.i(jA);
        if (iK < i14) {
            iK = i14;
        }
        this.f13526q = i7;
        this.f13527r = iK;
        return iK;
    }

    public final boolean b(long j5, n3.o oVar) {
        u uVar;
        this.f13528s = (this.f13528s << 2) | 3;
        boolean z10 = true;
        long jF = this.f13517g > 1 ? f(this, j5, oVar) : j5;
        b3.b bVar = this.f13520j;
        boolean z11 = false;
        if (bVar != null && (uVar = this.f13523n) != null && !uVar.a() && oVar == this.f13524o && (n3.a.b(jF, this.f13525p) || (n3.a.h(jF) == n3.a.h(this.f13525p) && n3.a.j(jF) == n3.a.j(this.f13525p) && n3.a.g(jF) >= bVar.b() && !bVar.f1310d.f2406d))) {
            if (!n3.a.b(jF, this.f13525p)) {
                b3.b bVar2 = this.f13520j;
                i9.l.b(bVar2);
                long jD = n3.b.d(jF, (((long) q0.k(Math.min(bVar2.f1307a.f6931i.c(), bVar2.d()))) << 32) | (((long) q0.k(bVar2.b())) & 4294967295L));
                this.f13521l = jD;
                if (this.f13514d == 3 || (((int) (jD >> 32)) >= bVar2.d() && ((int) (4294967295L & jD)) >= bVar2.b())) {
                    z10 = false;
                }
                this.k = z10;
                this.f13525p = jF;
            }
            return false;
        }
        u uVarE = e(oVar);
        long jG0 = n3.n.g0(jF, this.f13515e, this.f13514d, uVarE.d());
        boolean z12 = this.f13515e;
        int i7 = this.f13514d;
        int i10 = this.f13516f;
        b3.b bVar3 = new b3.b((j3.d) uVarE, ((z12 || !(i7 == 2 || i7 == 4 || i7 == 5)) && i10 >= 1) ? i10 : 1, i7, jG0);
        this.f13525p = jF;
        long jD2 = n3.b.d(jF, (((long) q0.k(bVar3.b())) & 4294967295L) | (((long) q0.k(bVar3.d())) << 32));
        this.f13521l = jD2;
        if (this.f13514d != 3 && (((int) (jD2 >> 32)) < bVar3.d() || ((int) (jD2 & 4294967295L)) < bVar3.b())) {
            z11 = true;
        }
        this.k = z11;
        this.f13520j = bVar3;
        return true;
    }

    public final void c() {
        this.f13520j = null;
        this.f13523n = null;
        this.f13524o = null;
        this.f13526q = -1;
        this.f13527r = -1;
        this.f13525p = n3.b.h(0, 0, 0, 0);
        long j5 = 0;
        this.f13521l = (j5 & 4294967295L) | (j5 << 32);
        this.k = false;
    }

    public final void d(n3.c cVar) {
        long jA;
        n3.c cVar2 = this.f13519i;
        if (cVar != null) {
            int i7 = a.f13484b;
            jA = a.a(cVar.a(), cVar.O());
        } else {
            jA = a.f13483a;
        }
        if (cVar2 == null) {
            this.f13519i = cVar;
            this.f13518h = jA;
        } else if (cVar == null || this.f13518h != jA) {
            this.f13519i = cVar;
            this.f13518h = jA;
            this.f13528s = (this.f13528s << 2) | 1;
            c();
        }
    }

    public final u e(n3.o oVar) {
        u dVar = this.f13523n;
        if (dVar == null || oVar != this.f13524o || dVar.a()) {
            this.f13524o = oVar;
            String str = this.f13511a;
            r0 r0VarH = g0.h(this.f13512b, oVar);
            n3.c cVar = this.f13519i;
            i9.l.b(cVar);
            f3.d dVar2 = this.f13513c;
            w wVar = w.f13122a;
            dVar = new j3.d(str, r0VarH, wVar, wVar, dVar2, cVar);
        }
        this.f13523n = dVar;
        return dVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb2.append(this.f13520j != null ? "<paragraph>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) a.b(this.f13518h));
        sb2.append(", history=");
        sb2.append(this.f13528s);
        sb2.append(", constraints=$)");
        return sb2.toString();
    }
}

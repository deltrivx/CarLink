package v0;

import b3.g0;
import b3.n0;
import b3.o0;
import b3.r0;
import java.util.List;
import l0.q0;
import u8.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b3.h f13495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f3.d f13496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f13501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f13502h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n3.c f13504j;
    public r0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b3.r f13505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n3.o f13506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o0 f13507n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f13510q;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f13503i = a.f13483a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13508o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13509p = -1;

    public d(b3.h hVar, r0 r0Var, f3.d dVar, int i7, boolean z10, int i10, int i11, w wVar) {
        this.f13495a = hVar;
        this.f13496b = dVar;
        this.f13497c = i7;
        this.f13498d = z10;
        this.f13499e = i10;
        this.f13500f = i11;
        this.f13501g = wVar;
        this.k = r0Var;
    }

    public final int a(int i7, n3.o oVar) {
        int i10 = this.f13508o;
        int i11 = this.f13509p;
        if (i7 == i10 && i10 != -1) {
            return i11;
        }
        long jA = n3.b.a(0, i7, 0, Integer.MAX_VALUE);
        if (this.f13500f > 1) {
            b bVar = this.f13502h;
            r0 r0Var = this.k;
            n3.c cVar = this.f13504j;
            i9.l.b(cVar);
            b bVarZ = n3.r.z(bVar, oVar, r0Var, cVar, this.f13496b);
            this.f13502h = bVarZ;
            jA = bVarZ.a(this.f13500f, jA);
        }
        int iK = q0.k(b(jA, oVar).f1418e);
        int i12 = n3.a.i(jA);
        if (iK < i12) {
            iK = i12;
        }
        this.f13508o = i7;
        this.f13509p = iK;
        return iK;
    }

    public final b3.p b(long j5, n3.o oVar) {
        b3.r rVarE = e(oVar);
        long jG0 = n3.n.g0(j5, this.f13498d, this.f13497c, rVarE.d());
        boolean z10 = this.f13498d;
        int i7 = this.f13497c;
        int i10 = this.f13499e;
        return new b3.p(rVarE, jG0, ((z10 || !(i7 == 2 || i7 == 4 || i7 == 5)) && i10 >= 1) ? i10 : 1, i7);
    }

    public final boolean c(long j5, n3.o oVar) {
        this.f13510q = (this.f13510q << 2) | 3;
        if (this.f13500f > 1) {
            b bVar = this.f13502h;
            r0 r0Var = this.k;
            n3.c cVar = this.f13504j;
            i9.l.b(cVar);
            b bVarZ = n3.r.z(bVar, oVar, r0Var, cVar, this.f13496b);
            this.f13502h = bVarZ;
            j5 = bVarZ.a(this.f13500f, j5);
        }
        o0 o0Var = this.f13507n;
        if (o0Var != null) {
            b3.p pVar = o0Var.f1409b;
            n0 n0Var = o0Var.f1408a;
            if (!pVar.f1414a.a()) {
                n3.o oVar2 = n0Var.f1400h;
                long j10 = n0Var.f1402j;
                if (oVar == oVar2 && (n3.a.b(j5, j10) || (n3.a.h(j5) == n3.a.h(j10) && n3.a.j(j5) == n3.a.j(j10) && n3.a.g(j5) >= pVar.f1418e && !pVar.f1416c))) {
                    o0 o0Var2 = this.f13507n;
                    i9.l.b(o0Var2);
                    if (n3.a.b(j5, o0Var2.f1408a.f1402j)) {
                        return false;
                    }
                    o0 o0Var3 = this.f13507n;
                    i9.l.b(o0Var3);
                    this.f13507n = f(oVar, j5, o0Var3.f1409b);
                    return true;
                }
            }
        }
        this.f13507n = f(oVar, j5, b(j5, oVar));
        return true;
    }

    public final void d(n3.c cVar) {
        long jA;
        n3.c cVar2 = this.f13504j;
        if (cVar != null) {
            int i7 = a.f13484b;
            jA = a.a(cVar.a(), cVar.O());
        } else {
            jA = a.f13483a;
        }
        if (cVar2 == null) {
            this.f13504j = cVar;
            this.f13503i = jA;
        } else if (cVar == null || this.f13503i != jA) {
            this.f13504j = cVar;
            this.f13503i = jA;
            this.f13510q = (this.f13510q << 2) | 1;
            this.f13505l = null;
            this.f13507n = null;
            this.f13509p = -1;
            this.f13508o = -1;
        }
    }

    public final b3.r e(n3.o oVar) {
        b3.r rVar = this.f13505l;
        if (rVar == null || oVar != this.f13506m || rVar.a()) {
            this.f13506m = oVar;
            b3.h hVar = this.f13495a;
            r0 r0VarH = g0.h(this.k, oVar);
            n3.c cVar = this.f13504j;
            i9.l.b(cVar);
            f3.d dVar = this.f13496b;
            List list = this.f13501g;
            if (list == null) {
                list = w.f13122a;
            }
            rVar = new b3.r(hVar, r0VarH, list, cVar, dVar);
        }
        this.f13505l = rVar;
        return rVar;
    }

    public final o0 f(n3.o oVar, long j5, b3.p pVar) {
        float fMin = Math.min(pVar.f1414a.d(), pVar.f1417d);
        b3.h hVar = this.f13495a;
        r0 r0Var = this.k;
        List list = this.f13501g;
        if (list == null) {
            list = w.f13122a;
        }
        int i7 = this.f13499e;
        boolean z10 = this.f13498d;
        int i10 = this.f13497c;
        n3.c cVar = this.f13504j;
        i9.l.b(cVar);
        return new o0(new n0(hVar, r0Var, list, i7, z10, i10, cVar, oVar, this.f13496b, j5), pVar, n3.b.d(j5, (((long) q0.k(fMin)) << 32) | (((long) q0.k(pVar.f1418e)) & 4294967295L)));
    }

    public final String toString() {
        n0 n0Var;
        StringBuilder sb2 = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object aVar = "null";
        sb2.append(this.f13507n != null ? "<TextLayoutResult>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) a.b(this.f13503i));
        sb2.append(", history=");
        sb2.append(this.f13510q);
        sb2.append(", constraints=");
        o0 o0Var = this.f13507n;
        if (o0Var != null && (n0Var = o0Var.f1408a) != null) {
            aVar = new n3.a(n0Var.f1402j);
        }
        sb2.append(aVar);
        sb2.append(')');
        return sb2.toString();
    }
}

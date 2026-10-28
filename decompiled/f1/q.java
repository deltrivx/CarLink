package f1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f5091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f5092e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f5093f = new k1(n1.g.f8712d, w0.f5185d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f5094g;

    public q(s sVar, long j5, boolean z10, boolean z11, a2.d dVar) {
        this.f5094g = sVar;
        this.f5088a = j5;
        this.f5089b = z10;
        this.f5090c = z11;
    }

    @Override // f1.v
    public final void a(y yVar, h9.n nVar) {
        this.f5094g.f5107b.a(yVar, nVar);
    }

    @Override // f1.v
    public final s.i0 b(y yVar, b3.l0 l0Var, h9.n nVar) {
        return this.f5094g.f5107b.b(yVar, l0Var, nVar);
    }

    @Override // f1.v
    public final void c() {
        this.f5094g.A--;
    }

    @Override // f1.v
    public final boolean d() {
        return this.f5094g.f5107b.d();
    }

    @Override // f1.v
    public final boolean e() {
        return this.f5089b;
    }

    @Override // f1.v
    public final boolean f() {
        return this.f5090c;
    }

    @Override // f1.v
    public final long g() {
        return this.f5088a;
    }

    @Override // f1.v
    public final u h() {
        return this.f5094g.f5113h;
    }

    @Override // f1.v
    public final q1 i() {
        return (q1) this.f5093f.getValue();
    }

    @Override // f1.v
    public final y8.h j() {
        return this.f5094g.f5107b.j();
    }

    @Override // f1.v
    public final void k(y yVar) {
        s sVar = this.f5094g;
        sVar.f5107b.k(sVar.f5113h);
        sVar.f5107b.k(yVar);
    }

    @Override // f1.v
    public final z0 l(a1 a1Var) {
        return this.f5094g.f5107b.l(a1Var);
    }

    @Override // f1.v
    public final s.i0 m(y yVar, b3.l0 l0Var, s.i0 i0Var) {
        return this.f5094g.f5107b.m(yVar, l0Var, i0Var);
    }

    @Override // f1.v
    public final void n(Set set) {
        HashSet hashSet = this.f5091d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f5091d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // f1.v
    public final void o(s sVar) {
        this.f5092e.add(sVar);
    }

    @Override // f1.v
    public final void p(w1 w1Var) {
        this.f5094g.f5107b.p(w1Var);
    }

    @Override // f1.v
    public final void q(y yVar) {
        this.f5094g.f5107b.q(yVar);
    }

    @Override // f1.v
    public final void r() {
        this.f5094g.A++;
    }

    @Override // f1.v
    public final void s(s sVar) {
        HashSet<Set> hashSet = this.f5091d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                i9.l.c(sVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(sVar.f5108c);
            }
        }
        LinkedHashSet linkedHashSet = this.f5092e;
        i9.b0.a(linkedHashSet);
        linkedHashSet.remove(sVar);
    }

    @Override // f1.v
    public final void t(y yVar) {
        this.f5094g.f5107b.t(yVar);
    }

    public final void u() {
        LinkedHashSet<s> linkedHashSet = this.f5092e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f5091d;
        if (hashSet != null) {
            for (s sVar : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(sVar.f5108c);
                }
            }
        }
        linkedHashSet.clear();
    }
}

package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f13804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f13805e;

    public h1(boolean z10, int i7, int i10, z zVar, w wVar) {
        this.f13801a = z10;
        this.f13802b = i7;
        this.f13803c = i10;
        this.f13804d = zVar;
        this.f13805e = wVar;
    }

    @Override // w0.p0
    public final boolean a() {
        return this.f13801a;
    }

    @Override // w0.p0
    public final w b() {
        return this.f13805e;
    }

    @Override // w0.p0
    public final z c() {
        return this.f13804d;
    }

    @Override // w0.p0
    public final w d() {
        return this.f13805e;
    }

    @Override // w0.p0
    public final s.a0 e(z zVar) {
        boolean z10 = zVar.f14020c;
        y yVar = zVar.f14019b;
        y yVar2 = zVar.f14018a;
        if ((!z10 && yVar2.f14010b > yVar.f14010b) || (z10 && yVar2.f14010b <= yVar.f14010b)) {
            zVar = z.a(zVar, null, null, !z10, 3);
        }
        long j5 = this.f13805e.f13973a;
        s.a0 a0Var = s.o.f12475a;
        s.a0 a0Var2 = new s.a0();
        a0Var2.h(j5, zVar);
        return a0Var2;
    }

    @Override // w0.p0
    public final int f() {
        return this.f13803c;
    }

    @Override // w0.p0
    public final w g() {
        return this.f13805e;
    }

    @Override // w0.p0
    public final k h() {
        int i7 = this.f13802b;
        int i10 = this.f13803c;
        if (i7 < i10) {
            return k.f13825b;
        }
        return i7 > i10 ? k.f13824a : this.f13805e.b();
    }

    @Override // w0.p0
    public final void i(h9.k kVar) {
    }

    @Override // w0.p0
    public final w j() {
        return this.f13805e;
    }

    @Override // w0.p0
    public final int k() {
        return this.f13802b;
    }

    @Override // w0.p0
    public final int l() {
        return 1;
    }

    @Override // w0.p0
    public final boolean m(p0 p0Var) {
        if (this.f13804d == null || p0Var == null || !(p0Var instanceof h1)) {
            return true;
        }
        h1 h1Var = (h1) p0Var;
        if (this.f13802b != h1Var.f13802b || this.f13803c != h1Var.f13803c || this.f13801a != h1Var.f13801a) {
            return true;
        }
        w wVar = h1Var.f13805e;
        w wVar2 = this.f13805e;
        return (wVar2.f13973a == wVar.f13973a && wVar2.f13975c == wVar.f13975c && wVar2.f13976d == wVar.f13976d) ? false : true;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.f13801a + ", crossed=" + h() + ", info=\n\t" + this.f13805e + ')';
    }
}

package v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f13403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f13404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f13407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f13408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f13409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f13410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p f13411i;

    public m0(j jVar, w0 w0Var, Object obj, Object obj2, p pVar) {
        this.f13403a = jVar.d(w0Var);
        this.f13404b = w0Var;
        this.f13405c = obj2;
        this.f13406d = obj;
        this.f13407e = (p) w0Var.f13471a.invoke(obj);
        h9.k kVar = w0Var.f13471a;
        this.f13408f = (p) kVar.invoke(obj2);
        this.f13409g = pVar != null ? d.f(pVar) : ((p) kVar.invoke(obj)).c();
        this.f13410h = -1L;
    }

    @Override // v.f
    public final boolean a() {
        return this.f13403a.a();
    }

    @Override // v.f
    public final long b() {
        if (this.f13410h < 0) {
            this.f13410h = this.f13403a.r(this.f13407e, this.f13408f, this.f13409g);
        }
        return this.f13410h;
    }

    @Override // v.f
    public final w0 c() {
        return this.f13404b;
    }

    @Override // v.f
    public final p d(long j5) {
        if (!ob.a.b(this, j5)) {
            return this.f13403a.T(j5, this.f13407e, this.f13408f, this.f13409g);
        }
        p pVar = this.f13411i;
        if (pVar != null) {
            return pVar;
        }
        p pVarS = this.f13403a.s(this.f13407e, this.f13408f, this.f13409g);
        this.f13411i = pVarS;
        return pVarS;
    }

    @Override // v.f
    public final /* synthetic */ boolean e(long j5) {
        return ob.a.b(this, j5);
    }

    @Override // v.f
    public final Object f(long j5) {
        if (ob.a.b(this, j5)) {
            return this.f13405c;
        }
        p pVarF = this.f13403a.F(j5, this.f13407e, this.f13408f, this.f13409g);
        int iB = pVarF.b();
        for (int i7 = 0; i7 < iB; i7++) {
            if (Float.isNaN(pVarF.a(i7))) {
                d0.b("AnimationVector cannot contain a NaN. " + pVarF + ". Animation: " + this + ", playTimeNanos: " + j5);
            }
        }
        return this.f13404b.f13472b.invoke(pVarF);
    }

    @Override // v.f
    public final Object g() {
        return this.f13405c;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f13406d + " -> " + this.f13405c + ",initial velocity: " + this.f13409g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.f13403a;
    }
}

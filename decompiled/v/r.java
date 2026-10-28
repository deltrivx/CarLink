package v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final da.a f13441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f13442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f13444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f13445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f13446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f13447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13448h;

    public r(s sVar, w0 w0Var, Object obj, p pVar) {
        da.a aVar = new da.a(15, sVar.f13449a);
        this.f13441a = aVar;
        this.f13442b = w0Var;
        this.f13443c = obj;
        p pVar2 = (p) w0Var.f13471a.invoke(obj);
        this.f13444d = pVar2;
        this.f13445e = d.f(pVar);
        h9.k kVar = w0Var.f13472b;
        if (((p) aVar.f3850e) == null) {
            aVar.f3850e = pVar2.c();
        }
        p pVar3 = (p) aVar.f3850e;
        if (pVar3 == null) {
            i9.l.j("targetVector");
            throw null;
        }
        int iB = pVar3.b();
        int i7 = 0;
        while (i7 < iB) {
            p pVar4 = (p) aVar.f3850e;
            if (pVar4 == null) {
                i9.l.j("targetVector");
                throw null;
            }
            l0.o0 o0Var = (l0.o0) aVar.f3847b;
            float fA = pVar2.a(i7);
            float fA2 = pVar.a(i7);
            u.e eVar = (u.e) o0Var.f7772b;
            double dB = eVar.b(fA2);
            double d10 = u.f.f12964a;
            int i10 = i7;
            pVar4.e((Math.signum(fA2) * ((float) (Math.exp((d10 / (d10 - 1.0d)) * dB) * ((double) (eVar.f12962a * eVar.f12963b))))) + fA, i10);
            i7 = i10 + 1;
        }
        p pVar5 = (p) aVar.f3850e;
        if (pVar5 == null) {
            i9.l.j("targetVector");
            throw null;
        }
        this.f13447g = kVar.invoke(pVar5);
        da.a aVar2 = this.f13441a;
        p pVar6 = this.f13444d;
        if (((p) aVar2.f3849d) == null) {
            aVar2.f3849d = pVar6.c();
        }
        p pVar7 = (p) aVar2.f3849d;
        if (pVar7 == null) {
            i9.l.j("velocityVector");
            throw null;
        }
        int iB2 = pVar7.b();
        long jMax = 0;
        for (int i11 = 0; i11 < iB2; i11++) {
            l0.o0 o0Var2 = (l0.o0) aVar2.f3847b;
            pVar6.getClass();
            jMax = Math.max(jMax, ((long) (Math.exp(((u.e) o0Var2.f7772b).b(pVar.a(i11)) / (((double) u.f.f12964a) - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f13448h = jMax;
        p pVarF = d.f(this.f13441a.y(jMax, this.f13444d, pVar));
        this.f13446f = pVarF;
        int iB3 = pVarF.b();
        for (int i12 = 0; i12 < iB3; i12++) {
            p pVar8 = this.f13446f;
            float fA3 = pVar8.a(i12);
            this.f13441a.getClass();
            this.f13441a.getClass();
            pVar8.e(n3.r.l(fA3, -0.0f, 0.0f), i12);
        }
    }

    @Override // v.f
    public final boolean a() {
        return false;
    }

    @Override // v.f
    public final long b() {
        return this.f13448h;
    }

    @Override // v.f
    public final w0 c() {
        return this.f13442b;
    }

    @Override // v.f
    public final p d(long j5) {
        if (ob.a.b(this, j5)) {
            return this.f13446f;
        }
        return this.f13441a.y(j5, this.f13444d, this.f13445e);
    }

    @Override // v.f
    public final /* synthetic */ boolean e(long j5) {
        return ob.a.b(this, j5);
    }

    @Override // v.f
    public final Object f(long j5) {
        if (ob.a.b(this, j5)) {
            return this.f13447g;
        }
        h9.k kVar = this.f13442b.f13472b;
        da.a aVar = this.f13441a;
        p pVar = (p) aVar.f3848c;
        p pVar2 = this.f13444d;
        if (pVar == null) {
            aVar.f3848c = pVar2.c();
        }
        p pVar3 = (p) aVar.f3848c;
        if (pVar3 == null) {
            i9.l.j("valueVector");
            throw null;
        }
        int iB = pVar3.b();
        for (int i7 = 0; i7 < iB; i7++) {
            p pVar4 = (p) aVar.f3848c;
            if (pVar4 == null) {
                i9.l.j("valueVector");
                throw null;
            }
            l0.o0 o0Var = (l0.o0) aVar.f3847b;
            float fA = pVar2.a(i7);
            long j10 = j5 / 1000000;
            u.d dVarA = ((u.e) o0Var.f7772b).a(this.f13445e.a(i7));
            long j11 = dVarA.f12961c;
            pVar4.e((Math.signum(dVarA.f12959a) * dVarA.f12960b * u.b.a(j11 > 0 ? j10 / j11 : 1.0f).f12955a) + fA, i7);
        }
        p pVar5 = (p) aVar.f3848c;
        if (pVar5 != null) {
            return kVar.invoke(pVar5);
        }
        i9.l.j("valueVector");
        throw null;
    }

    @Override // v.f
    public final Object g() {
        return this.f13447g;
    }
}

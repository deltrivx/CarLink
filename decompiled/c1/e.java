package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v.c f1862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f1863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f1864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f1865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.j f1866f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v.c cVar, float f10, boolean z10, f fVar, b0.j jVar, y8.c cVar2) {
        super(2, cVar2);
        this.f1862b = cVar;
        this.f1863c = f10;
        this.f1864d = z10;
        this.f1865e = fVar;
        this.f1866f = jVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        return new e(this.f1862b, this.f1863c, this.f1864d, this.f1865e, this.f1866f, cVar);
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        b0.j dVar;
        Object objE;
        int i7 = this.f1861a;
        t8.z zVar = t8.z.f12851a;
        if (i7 == 0) {
            t8.a.e(obj);
            v.c cVar = this.f1862b;
            float f10 = ((n3.f) cVar.f13328e.getValue()).f8736a;
            float f11 = this.f1863c;
            if (!n3.f.a(f10, f11)) {
                boolean z10 = this.f1864d;
                z8.a aVar = z8.a.f15774a;
                if (z10) {
                    float f12 = ((n3.f) cVar.f13328e.getValue()).f8736a;
                    f fVar = this.f1865e;
                    v.v0 v0Var = null;
                    if (n3.f.a(f12, fVar.f1875b)) {
                        dVar = new b0.m(0L);
                    } else if (n3.f.a(f12, fVar.f1877d)) {
                        dVar = new b0.h();
                    } else {
                        dVar = n3.f.a(f12, fVar.f1876c) ? new b0.d() : null;
                    }
                    this.f1861a = 2;
                    v.v0 v0Var2 = d1.f.f3690b;
                    v.v0 v0Var3 = d1.f.f3689a;
                    b0.j jVar = this.f1866f;
                    if (jVar != null) {
                        if ((jVar instanceof b0.m) || (jVar instanceof b0.b) || (jVar instanceof b0.h) || (jVar instanceof b0.d)) {
                            v0Var = v0Var3;
                        }
                    } else if (dVar != null) {
                        if ((dVar instanceof b0.m) || (dVar instanceof b0.b)) {
                            v0Var = v0Var2;
                        } else if (dVar instanceof b0.h) {
                            v0Var = d1.f.f3691c;
                        } else if (dVar instanceof b0.d) {
                            v0Var = v0Var2;
                        }
                    }
                    if (v0Var == null ? (objE = cVar.e(new n3.f(f11), this)) != aVar : (objE = v.c.c(cVar, new n3.f(f11), v0Var, null, this, 12)) != aVar) {
                        objE = zVar;
                    }
                    if (objE == aVar) {
                    }
                } else {
                    n3.f fVar2 = new n3.f(f11);
                    this.f1861a = 1;
                    if (cVar.e(fVar2, this) == aVar) {
                    }
                }
                return aVar;
            }
            return zVar;
        }
        if (i7 != 1 && i7 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t8.a.e(obj);
        return zVar;
    }
}

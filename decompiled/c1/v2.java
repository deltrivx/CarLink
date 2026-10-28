package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v2 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ float f2224d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2(x2 x2Var, float f10, y8.c cVar, int i7) {
        super(2, cVar);
        this.f2221a = i7;
        this.f2223c = x2Var;
        this.f2224d = f10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(x2.c cVar, y8.c cVar2) {
        super(2, cVar2);
        this.f2221a = 2;
        this.f2223c = cVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f2221a) {
            case 0:
                return new v2((x2) this.f2223c, this.f2224d, cVar, 0);
            case 1:
                return new v2((x2) this.f2223c, this.f2224d, cVar, 1);
            default:
                v2 v2Var = new v2((x2.c) this.f2223c, cVar);
                v2Var.f2224d = ((Number) obj).floatValue();
                return v2Var;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2221a) {
            case 0:
                return ((v2) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 1:
                return ((v2) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            default:
                return ((v2) create(Float.valueOf(((Number) obj).floatValue()), (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2221a) {
            case 0:
                x2 x2Var = (x2) this.f2223c;
                int i7 = this.f2222b;
                if (i7 == 0) {
                    t8.a.e(obj);
                    v.c cVar = x2Var.f2316s;
                    if (cVar != null) {
                        Float f10 = new Float(this.f2224d);
                        v.j jVar = x2Var.f2314q ? androidx.compose.material3.a.f922f : androidx.compose.material3.a.f923g;
                        this.f2222b = 1;
                        obj = v.c.c(cVar, f10, jVar, null, this, 12);
                        z8.a aVar = z8.a.f15774a;
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return t8.z.f12851a;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t8.a.e(obj);
                return t8.z.f12851a;
            case 1:
                x2 x2Var2 = (x2) this.f2223c;
                int i10 = this.f2222b;
                if (i10 == 0) {
                    t8.a.e(obj);
                    v.c cVar2 = x2Var2.f2315r;
                    if (cVar2 != null) {
                        Float f11 = new Float(this.f2224d);
                        v.j jVar2 = x2Var2.f2314q ? androidx.compose.material3.a.f922f : androidx.compose.material3.a.f923g;
                        this.f2222b = 1;
                        obj = v.c.c(cVar2, f11, jVar2, null, this, 12);
                        z8.a aVar2 = z8.a.f15774a;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    }
                    return t8.z.f12851a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t8.a.e(obj);
                return t8.z.f12851a;
            default:
                x2.c cVar3 = (x2.c) this.f2223c;
                int i11 = this.f2222b;
                if (i11 == 0) {
                    t8.a.e(obj);
                    float f12 = this.f2224d;
                    Object objG = cVar3.f14547a.f15020d.f15011a.g(y2.i.f14990e);
                    if (objG == null) {
                        objG = null;
                    }
                    h9.n nVar = (h9.n) objG;
                    if (nVar == null) {
                        throw ob.a.o("Required value was null.");
                    }
                    x1.b bVar = new x1.b((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L));
                    this.f2222b = 1;
                    obj = nVar.invoke(bVar, this);
                    z8.a aVar3 = z8.a.f15774a;
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((x1.b) obj).f14521a & 4294967295L)));
        }
    }
}

package l0;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f7685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7687f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(long j5, CharSequence charSequence, w0.t tVar, y8.c cVar) {
        super(2, cVar);
        this.f7682a = 1;
        this.f7686e = tVar;
        this.f7687f = charSequence;
        this.f7685d = j5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(Object obj, long j5, Object obj2, y8.c cVar, int i7) {
        super(2, cVar);
        this.f7682a = i7;
        this.f7686e = obj;
        this.f7685d = j5;
        this.f7687f = obj2;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f7682a) {
            case 0:
                return new i1((f1.b1) this.f7686e, this.f7685d, (b0.k) this.f7687f, cVar, 0);
            case 1:
                w0.t tVar = (w0.t) this.f7686e;
                i1 i1Var = new i1(this.f7685d, (CharSequence) this.f7687f, tVar, cVar);
                i1Var.f7684c = obj;
                return i1Var;
            case 2:
                return new i1((x.f) this.f7686e, this.f7685d, (b0.k) this.f7687f, cVar, 2);
            case 3:
                return new i1((x.r) this.f7686e, this.f7685d, (b0.k) this.f7687f, cVar, 3);
            default:
                i1 i1Var2 = new i1((z.t1) this.f7686e, this.f7685d, (i9.u) this.f7687f, cVar, 4);
                i1Var2.f7684c = obj;
                return i1Var2;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7682a) {
            case 0:
                return ((i1) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 1:
                return ((i1) create(s1.i.k(obj), (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 2:
                return ((i1) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 3:
                return ((i1) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            default:
                return ((i1) create((z.r1) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:98:0x01de  */
    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        f1.b1 b1Var;
        b0.m mVar;
        b0.m mVar2;
        b0.m mVar3;
        b0.n nVar;
        switch (this.f7682a) {
            case 0:
                b0.k kVar = (b0.k) this.f7687f;
                f1.b1 b1Var2 = (f1.b1) this.f7686e;
                int i7 = this.f7683b;
                z8.a aVar = z8.a.f15774a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        b1Var = (f1.b1) this.f7684c;
                        t8.a.e(obj);
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mVar2 = (b0.m) this.f7684c;
                        t8.a.e(obj);
                    }
                    mVar = mVar2;
                    b1Var2.setValue(mVar);
                    return t8.z.f12851a;
                }
                t8.a.e(obj);
                b0.m mVar4 = (b0.m) b1Var2.getValue();
                if (mVar4 != null) {
                    b0.l lVar = new b0.l(mVar4);
                    if (kVar != null) {
                        this.f7684c = b1Var2;
                        this.f7683b = 1;
                        if (kVar.a(lVar, this) == aVar) {
                            return aVar;
                        }
                    }
                    b1Var = b1Var2;
                } else {
                    mVar = new b0.m(this.f7685d);
                    if (kVar != null) {
                        this.f7684c = mVar;
                        this.f7683b = 2;
                        if (kVar.a(mVar, this) == aVar) {
                            return aVar;
                        }
                        mVar2 = mVar;
                        mVar = mVar2;
                    }
                }
                b1Var2.setValue(mVar);
                return t8.z.f12851a;
                b1Var.setValue(null);
                mVar = new b0.m(this.f7685d);
                if (kVar != null) {
                    this.f7684c = mVar;
                    this.f7683b = 2;
                    if (kVar.a(mVar, this) == aVar) {
                        return aVar;
                    }
                    mVar2 = mVar;
                    mVar = mVar2;
                }
                b1Var2.setValue(mVar);
                return t8.z.f12851a;
            case 1:
                int i10 = this.f7683b;
                if (i10 == 0) {
                    t8.a.e(obj);
                    TextClassifier textClassifierK = s1.i.k(this.f7684c);
                    w0.t tVar = (w0.t) this.f7686e;
                    CharSequence charSequence = (CharSequence) this.f7687f;
                    this.f7683b = 1;
                    Object objA = w0.t.a(tVar, charSequence, this.f7685d, textClassifierK, this);
                    z8.a aVar2 = z8.a.f15774a;
                    if (objA == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return t8.z.f12851a;
            case 2:
                x.f fVar = (x.f) this.f7686e;
                int i11 = this.f7683b;
                z8.a aVar3 = z8.a.f15774a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        t8.a.e(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mVar3 = (b0.m) this.f7684c;
                        t8.a.e(obj);
                    }
                    fVar.B = mVar3;
                    return t8.z.f12851a;
                }
                t8.a.e(obj);
                if (fVar.F0()) {
                    long j5 = x.s.f14472a;
                    this.f7683b = 1;
                    if (cc.b0.h(j5, this) == aVar3) {
                        return aVar3;
                    }
                }
                mVar3 = new b0.m(this.f7685d);
                b0.k kVar2 = (b0.k) this.f7687f;
                this.f7684c = mVar3;
                this.f7683b = 2;
                if (kVar2.a(mVar3, this) == aVar3) {
                    return aVar3;
                }
                fVar.B = mVar3;
                return t8.z.f12851a;
            case 3:
                b0.k kVar3 = (b0.k) this.f7687f;
                int i12 = this.f7683b;
                z8.a aVar4 = z8.a.f15774a;
                if (i12 != 0) {
                    if (i12 == 1) {
                        t8.a.e(obj);
                    } else if (i12 == 2) {
                        nVar = (b0.n) this.f7684c;
                        t8.a.e(obj);
                        this.f7684c = null;
                        this.f7683b = 3;
                        if (kVar3.a(nVar, this) == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t8.a.e(obj);
                    }
                    return t8.z.f12851a;
                }
                t8.a.e(obj);
                cc.o1 o1Var = ((x.r) this.f7686e).H;
                if (o1Var != null) {
                    this.f7683b = 1;
                    if (cc.b0.f(o1Var, this) == aVar4) {
                        return aVar4;
                    }
                }
                b0.m mVar5 = new b0.m(this.f7685d);
                b0.n nVar2 = new b0.n(mVar5);
                this.f7684c = nVar2;
                this.f7683b = 2;
                if (kVar3.a(mVar5, this) == aVar4) {
                    return aVar4;
                }
                nVar = nVar2;
                this.f7684c = null;
                this.f7683b = 3;
                if (kVar3.a(nVar, this) == aVar4) {
                    return aVar4;
                }
                return t8.z.f12851a;
            default:
                z.t1 t1Var = (z.t1) this.f7686e;
                int i13 = this.f7683b;
                t8.z zVar = t8.z.f12851a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    return zVar;
                }
                t8.a.e(obj);
                z.r1 r1Var = (z.r1) this.f7684c;
                float fG = t1Var.g(this.f7685d);
                a8.l lVar2 = new a8.l((i9.u) this.f7687f, t1Var, r1Var, 7);
                this.f7683b = 1;
                v.g0 g0VarJ = v.d.j(7, null);
                v.w0 w0Var = v.d.f13345j;
                Float f10 = new Float(0.0f);
                Float f11 = new Float(fG);
                Float f12 = new Float(0.0f);
                h9.k kVar4 = w0Var.f13471a;
                v.p pVarC = (v.p) kVar4.invoke(f12);
                if (pVarC == null) {
                    pVarC = ((v.p) kVar4.invoke(f10)).c();
                }
                v.p pVar = pVarC;
                Object objC = v.d.c(new v.k(w0Var, f10, pVar, 56), new v.m0(g0VarJ, w0Var, f10, f11, pVar), Long.MIN_VALUE, new s0.d(5, lVar2), this);
                z8.a aVar5 = z8.a.f15774a;
                if (objC != aVar5) {
                    objC = zVar;
                }
                if (objC != aVar5) {
                    objC = zVar;
                }
                return objC == aVar5 ? aVar5 : zVar;
        }
    }
}

package f1;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5239g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(c2 c2Var, b2 b2Var, x0 x0Var, y8.c cVar) {
        super(2, cVar);
        this.f5233a = 0;
        this.f5237e = c2Var;
        this.f5238f = b2Var;
        this.f5239g = x0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, y8.c cVar, int i7) {
        super(2, cVar);
        this.f5233a = i7;
        this.f5235c = obj;
        this.f5236d = obj2;
        this.f5237e = obj3;
        this.f5238f = obj4;
        this.f5239g = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(Object obj, Object obj2, Object obj3, Object obj4, y8.c cVar, int i7) {
        super(2, cVar);
        this.f5233a = i7;
        this.f5235c = obj;
        this.f5237e = obj2;
        this.f5238f = obj3;
        this.f5239g = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z1(k2.z zVar, h9.o oVar, h9.k kVar, z.a1 a1Var, y8.c cVar) {
        super(2, cVar);
        this.f5233a = 5;
        this.f5235c = zVar;
        this.f5237e = (a9.i) oVar;
        this.f5238f = kVar;
        this.f5239g = a1Var;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [a9.i, h9.o] */
    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f5233a) {
            case 0:
                z1 z1Var = new z1((c2) this.f5237e, (b2) this.f5238f, (x0) this.f5239g, cVar);
                z1Var.f5236d = obj;
                return z1Var;
            case 1:
                return new z1((l0.u0) this.f5235c, (b1) this.f5236d, (g3.x) this.f5237e, (w0.t1) this.f5238f, (g3.k) this.f5239g, cVar, 1);
            case 2:
                return new z1((i0.b) this.f5235c, (g3.w) this.f5236d, (l0.u0) this.f5237e, (l0.s1) this.f5238f, (g3.q) this.f5239g, cVar, 2);
            case 3:
                z1 z1Var2 = new z1((r2.p0) this.f5235c, (h9.k) this.f5237e, (u0.b) this.f5238f, (u0.l) this.f5239g, cVar, 3);
                z1Var2.f5236d = obj;
                return z1Var2;
            case 4:
                z1 z1Var3 = new z1((z.g2) this.f5235c, (z.f) this.f5237e, (z.c) this.f5238f, (cc.a1) this.f5239g, cVar, 4);
                z1Var3.f5236d = obj;
                return z1Var3;
            default:
                z1 z1Var4 = new z1((k2.z) this.f5235c, (a9.i) this.f5237e, (h9.k) this.f5238f, (z.a1) this.f5239g, cVar);
                z1Var4.f5236d = obj;
                return z1Var4;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f5233a) {
            case 0:
                return ((z1) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 1:
                return ((z1) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 2:
                return ((z1) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 3:
                ((z1) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
                return z8.a.f15774a;
            case 4:
                return ((z1) create((z.r1) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            default:
                return ((z1) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x028d A[Catch: all -> 0x0299, LOOP:1: B:104:0x028b->B:105:0x028d, LOOP_END, TryCatch #2 {all -> 0x0299, blocks: (B:103:0x027e, B:105:0x028d, B:108:0x029d), top: B:141:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:111:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c6 A[Catch: all -> 0x02c9, TryCatch #3 {all -> 0x02c9, blocks: (B:114:0x02c2, B:116:0x02c6, B:119:0x02cc), top: B:143:0x02c2 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x02ee A[Catch: all -> 0x02f1, TryCatch #0 {all -> 0x02f1, blocks: (B:127:0x02ea, B:129:0x02ee, B:132:0x02f4), top: B:138:0x02ea }] */
    /* JADX WARN: Code duplicated, block: B:138:0x02ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x02c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v24, types: [a9.i, h9.o] */
    @Override // a9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        cc.a1 a1VarM;
        fc.h0 h0Var;
        i1.e eVar;
        l1.b bVar;
        g4.e eVar2;
        List listX;
        int size;
        int i7;
        b1.f fVar;
        c2 c2Var;
        c2 c2Var2;
        y8.c cVar = null;
        int i10 = 1;
        switch (this.f5233a) {
            case 0:
                z8.a aVar = z8.a.f15774a;
                int i11 = this.f5234b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar2 = (g4.e) this.f5235c;
                    a1VarM = (cc.a1) this.f5236d;
                    try {
                        t8.a.e(obj);
                        eVar2.a();
                        c2Var2 = (c2) this.f5237e;
                        synchronized (c2Var2.f4904b) {
                            try {
                                if (c2Var2.f4905c == a1VarM) {
                                    c2Var2.f4905c = null;
                                }
                                c2Var2.B();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        fc.h0 h0Var2 = c2.f4901y;
                        w0.b(((c2) this.f5237e).f4925x);
                        return t8.z.f12851a;
                    } catch (Throwable th2) {
                        th = th2;
                        Throwable th3 = th;
                        eVar2.a();
                        c2Var = (c2) this.f5237e;
                        synchronized (c2Var.f4904b) {
                            try {
                                if (c2Var.f4905c == a1VarM) {
                                    c2Var.f4905c = null;
                                }
                                c2Var.B();
                                fc.h0 h0Var3 = c2.f4901y;
                                w0.b(((c2) this.f5237e).f4925x);
                                throw th3;
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                }
                t8.a.e(obj);
                a1VarM = cc.b0.m(((cc.y) this.f5236d).u());
                c2.y((c2) this.f5237e, a1VarM);
                g4.e eVarQ = n4.e.q(new b3.a(7, (c2) this.f5237e));
                w0 w0Var = ((c2) this.f5237e).f4925x;
                try {
                    do {
                        h0Var = c2.f4901y;
                        eVar = (i1.e) h0Var.getValue();
                        bVar = (l1.b) eVar;
                        m1.b bVar2 = m1.b.f8399a;
                        k1.c cVar2 = bVar.f7970c;
                        if (!cVar2.containsKey(w0Var)) {
                            if (bVar.isEmpty()) {
                                bVar = new l1.b(w0Var, w0Var, cVar2.b(w0Var, new l1.a(bVar2, bVar2)));
                            } else {
                                Object obj2 = bVar.f7969b;
                                Object obj3 = cVar2.get(obj2);
                                i9.l.b(obj3);
                                bVar = new l1.b(bVar.f7968a, w0Var, cVar2.b(obj2, new l1.a(((l1.a) obj3).f7965a, w0Var)).b(w0Var, new l1.a(obj2, bVar2)));
                            }
                        }
                        if (eVar != bVar) {
                        }
                        listX = c2.x((c2) this.f5237e);
                        size = listX.size();
                        for (i7 = 0; i7 < size; i7++) {
                            ((y) listX.get(i7)).t();
                        }
                        fVar = new b1.f((b2) this.f5238f, (x0) this.f5239g, cVar, i10);
                        this.f5236d = a1VarM;
                        this.f5235c = eVarQ;
                        this.f5234b = 1;
                        if (cc.b0.g(fVar, this) == aVar) {
                            return aVar;
                        }
                        eVar2 = eVarQ;
                        eVar2.a();
                        c2Var2 = (c2) this.f5237e;
                        synchronized (c2Var2.f4904b) {
                            if (c2Var2.f4905c == a1VarM) {
                                c2Var2.f4905c = null;
                            }
                            c2Var2.B();
                            fc.h0 h0Var4 = c2.f4901y;
                            w0.b(((c2) this.f5237e).f4925x);
                            return t8.z.f12851a;
                        }
                    } while (!h0Var.f(eVar, bVar));
                    listX = c2.x((c2) this.f5237e);
                    size = listX.size();
                    while (i7 < size) {
                        ((y) listX.get(i7)).t();
                    }
                    fVar = new b1.f((b2) this.f5238f, (x0) this.f5239g, cVar, i10);
                    this.f5236d = a1VarM;
                    this.f5235c = eVarQ;
                    this.f5234b = 1;
                    if (cc.b0.g(fVar, this) == aVar) {
                        return aVar;
                    }
                    eVar2 = eVarQ;
                    eVar2.a();
                    c2Var2 = (c2) this.f5237e;
                    synchronized (c2Var2.f4904b) {
                        if (c2Var2.f4905c == a1VarM) {
                            c2Var2.f4905c = null;
                        }
                        c2Var2.B();
                        fc.h0 h0Var5 = c2.f4901y;
                        w0.b(((c2) this.f5237e).f4925x);
                        return t8.z.f12851a;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    eVar2 = eVarQ;
                    Throwable th6 = th;
                    eVar2.a();
                    c2Var = (c2) this.f5237e;
                    synchronized (c2Var.f4904b) {
                        if (c2Var.f4905c == a1VarM) {
                            c2Var.f4905c = null;
                        }
                        c2Var.B();
                    }
                    fc.h0 h0Var6 = c2.f4901y;
                    w0.b(((c2) this.f5237e).f4925x);
                    throw th6;
                }
            case 1:
                l0.u0 u0Var = (l0.u0) this.f5235c;
                z8.a aVar2 = z8.a.f15774a;
                int i12 = this.f5234b;
                try {
                    if (i12 == 0) {
                        t8.a.e(obj);
                        a2.d dVar = new a2.d(new u2(new f0.k((b1) this.f5236d, 11), null));
                        gc.j jVar = new gc.j(u0Var, (g3.x) this.f5237e, (w0.t1) this.f5238f, (g3.k) this.f5239g, 1);
                        this.f5234b = 1;
                        if (dVar.l(jVar, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t8.a.e(obj);
                    }
                    l0.q0.m(u0Var);
                    return t8.z.f12851a;
                } catch (Throwable th7) {
                    l0.q0.m(u0Var);
                    throw th7;
                }
            case 2:
                t8.z zVar = t8.z.f12851a;
                z8.a aVar3 = z8.a.f15774a;
                int i13 = this.f5234b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    return zVar;
                }
                t8.a.e(obj);
                i0.b bVar3 = (i0.b) this.f5235c;
                g3.w wVar = (g3.w) this.f5236d;
                l0.a1 a1Var = ((l0.u0) this.f5237e).f7848a;
                b3.o0 o0Var = ((l0.s1) this.f5238f).f7828a;
                g3.q qVar = (g3.q) this.f5239g;
                this.f5234b = 1;
                int iB = qVar.b(b3.q0.e(wVar.f5890b));
                Object objA = bVar3.a(iB < o0Var.f1408a.f1393a.f1353b.length() ? o0Var.b(iB) : iB != 0 ? o0Var.b(iB - 1) : new x1.c(0.0f, 0.0f, 1.0f, (int) (l0.e1.a(a1Var.f7592b, a1Var.f7597g, a1Var.f7598h, l0.e1.f7631a, 1) & 4294967295L)), this);
                if (objA != aVar3) {
                    objA = zVar;
                }
                return objA == aVar3 ? aVar3 : zVar;
            case 3:
                u0.b bVar4 = (u0.b) this.f5238f;
                r2.p0 p0Var = (r2.p0) this.f5235c;
                z8.a aVar4 = z8.a.f15774a;
                int i14 = this.f5234b;
                try {
                    if (i14 != 0) {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t8.a.e(obj);
                        throw new cc.s();
                    }
                    t8.a.e(obj);
                    cc.y yVar = (cc.y) this.f5236d;
                    u0.n nVar = u0.o.f13013a;
                    View view = p0Var.f11359a;
                    nVar.getClass();
                    u0.k kVar = new u0.k(view);
                    u0.p pVar = new u0.p(p0Var.f11359a, new u0.a((u0.l) this.f5239g), kVar);
                    if (t0.b.f12725a) {
                        cc.b0.s(yVar, null, new b0.g(bVar4, kVar, cVar, 16), 3);
                    }
                    h9.k kVar2 = (h9.k) this.f5237e;
                    if (kVar2 != null) {
                        kVar2.invoke(pVar);
                    }
                    bVar4.f12969c = pVar;
                    this.f5234b = 1;
                    p0Var.a(pVar, this);
                    return aVar4;
                } catch (Throwable th8) {
                    bVar4.f12969c = null;
                    throw th8;
                }
            case 4:
                z.c cVar3 = (z.c) this.f5238f;
                z.f fVar2 = (z.f) this.f5237e;
                z.g2 g2Var = (z.g2) this.f5235c;
                z8.a aVar5 = z8.a.f15774a;
                int i15 = this.f5234b;
                if (i15 == 0) {
                    t8.a.e(obj);
                    z.r1 r1Var = (z.r1) this.f5236d;
                    g2Var.f15394e = z.f.A0(fVar2, cVar3);
                    a8.u0 u0Var2 = new a8.u0(fVar2, g2Var, (cc.a1) this.f5239g, r1Var);
                    a8.j1 j1Var = new a8.j1(fVar2, g2Var, cVar3, 10);
                    this.f5234b = 1;
                    if (g2Var.a(u0Var2, j1Var, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return t8.z.f12851a;
            default:
                z8.a aVar6 = z8.a.f15774a;
                int i16 = this.f5234b;
                if (i16 == 0) {
                    t8.a.e(obj);
                    cc.y yVar2 = (cc.y) this.f5236d;
                    k2.z zVar2 = (k2.z) this.f5235c;
                    z.v vVar = new z.v(yVar2, (h9.o) this.f5237e, (h9.k) this.f5238f, (z.a1) this.f5239g, (y8.c) null);
                    this.f5234b = 1;
                    if (n4.h.l(zVar2, vVar, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return t8.z.f12851a;
        }
    }
}

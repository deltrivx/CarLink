package fc;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import android.view.textclassifier.TextClassifier;
import b3.o0;
import b3.q0;
import cc.a1;
import f1.b1;
import f1.y1;
import f1.z1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import r2.p0;
import w0.d1;
import w0.w0;
import w0.y0;
import x.v0;
import z.g2;
import z.t1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5557f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(h9.k kVar, AtomicReference atomicReference, h9.n nVar, y8.c cVar) {
        super(2, cVar);
        this.f5552a = 3;
        this.f5555d = (i9.n) kVar;
        this.f5556e = atomicReference;
        this.f5557f = nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(i9.x xVar, e eVar, y8.c cVar) {
        super(2, cVar);
        this.f5552a = 0;
        this.f5556e = xVar;
        this.f5557f = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, y8.c cVar, int i7) {
        super(2, cVar);
        this.f5552a = i7;
        this.f5555d = obj;
        this.f5556e = obj2;
        this.f5554c = obj3;
        this.f5557f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, y8.c cVar, int i7, boolean z10) {
        super(2, cVar);
        this.f5552a = i7;
        this.f5554c = obj;
        this.f5555d = obj2;
        this.f5556e = obj3;
        this.f5557f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Object obj2, Object obj3, y8.c cVar, int i7) {
        super(2, cVar);
        this.f5552a = i7;
        this.f5555d = obj;
        this.f5556e = obj2;
        this.f5557f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(w0.t tVar, h9.n nVar, y8.c cVar) {
        super(2, cVar);
        this.f5552a = 6;
        this.f5554c = tVar;
        this.f5557f = (a9.i) nVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [h9.k, i9.n] */
    /* JADX WARN: Type inference failed for: r0v6, types: [a9.i, h9.n] */
    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f5552a) {
            case 0:
                i iVar = new i((i9.x) this.f5556e, (e) this.f5557f, cVar);
                iVar.f5554c = obj;
                return iVar;
            case 1:
                i iVar2 = new i((d) this.f5555d, (h0) this.f5556e, (Float) this.f5557f, cVar, 1);
                iVar2.f5554c = obj;
                return iVar2;
            case 2:
                return new i((e0) this.f5555d, (d) this.f5556e, (h0) this.f5554c, (Float) this.f5557f, cVar, 2);
            case 3:
                i iVar3 = new i((i9.n) this.f5555d, (AtomicReference) this.f5556e, (h9.n) this.f5557f, cVar);
                iVar3.f5554c = obj;
                return iVar3;
            case 4:
                i iVar4 = new i((h9.k) this.f5555d, (u0.b) this.f5556e, (u0.l) this.f5557f, cVar, 4);
                iVar4.f5554c = obj;
                return iVar4;
            case 5:
                return new i(this.f5554c, (v.c) this.f5555d, (b1) this.f5556e, (b1) this.f5557f, cVar, 5, false);
            case 6:
                return new i((w0.t) this.f5554c, (h9.n) this.f5557f, cVar);
            case 7:
                return new i((w0) this.f5554c, (i9.x) this.f5555d, (i9.x) this.f5556e, (i9.w) this.f5557f, cVar, 7, false);
            case 8:
                return new i((x2.c) this.f5555d, (ScrollCaptureSession) this.f5556e, (Rect) this.f5554c, (Consumer) this.f5557f, cVar, 8);
            default:
                i iVar5 = new i((z.f) this.f5555d, (g2) this.f5556e, (z.c) this.f5557f, cVar, 9);
                iVar5.f5554c = obj;
                return iVar5;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5552a) {
            case 0:
                return ((i) create(new ec.o(((ec.o) obj).f4733a), (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 1:
                return ((i) create((a0) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 2:
                return ((i) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 3:
                return ((i) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 4:
                ((i) create((p0) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
                return z8.a.f15774a;
            case 5:
                return ((i) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 6:
                return ((i) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 7:
                return ((i) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            case 8:
                return ((i) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
            default:
                return ((i) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0314  */
    /* JADX WARN: Code duplicated, block: B:155:0x031c  */
    /* JADX WARN: Code duplicated, block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x011b  */
    /* JADX WARN: Type inference failed for: r7v5, types: [a9.i, h9.n] */
    /* JADX WARN: Type inference failed for: r8v5, types: [h9.k, i9.n] */
    @Override // a9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        i9.x xVar;
        i9.x xVar2;
        r1.r rVar;
        r1.r rVar2;
        r1.r rVar3;
        Object objInvoke;
        w0.t tVar;
        lc.c cVar;
        lc.a aVar;
        lc.a aVar2;
        TextClassifier textClassifierK;
        Object objB;
        lc.a aVar3;
        Object objB2;
        q0 q0Var;
        Object objA;
        long j5;
        w0.p pVar;
        o0 o0Var;
        Object objA2;
        int i7 = this.f5552a;
        int i10 = 2;
        boolean z10 = false;
        t8.z zVar = t8.z.f12851a;
        Object obj2 = this.f5557f;
        z8.a aVar4 = z8.a.f15774a;
        switch (i7) {
            case 0:
                int i11 = this.f5553b;
                if (i11 == 0) {
                    t8.a.e(obj);
                    Object obj3 = ((ec.o) this.f5554c).f4733a;
                    xVar = (i9.x) this.f5556e;
                    boolean z11 = obj3 instanceof ec.n;
                    if (!z11) {
                        xVar.f6688a = obj3;
                    }
                    e eVar = (e) obj2;
                    if (!z11) {
                        return zVar;
                    }
                    ec.m mVar = obj3 instanceof ec.m ? (ec.m) obj3 : null;
                    Throwable th = mVar != null ? mVar.f4731a : null;
                    if (th != null) {
                        throw th;
                    }
                    Object obj4 = xVar.f6688a;
                    if (obj4 != null) {
                        Object obj5 = obj4 != gc.c.f6217b ? obj4 : null;
                        this.f5554c = obj3;
                        this.f5555d = xVar;
                        this.f5553b = 1;
                        if (eVar.h(obj5, this) == aVar4) {
                            return aVar4;
                        }
                        xVar2 = xVar;
                    }
                    xVar.f6688a = gc.c.f6219d;
                    return zVar;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xVar2 = (i9.x) this.f5555d;
                t8.a.e(obj);
                xVar = xVar2;
                xVar.f6688a = gc.c.f6219d;
                return zVar;
            case 1:
                h0 h0Var = (h0) this.f5556e;
                int i12 = this.f5553b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    return zVar;
                }
                t8.a.e(obj);
                int iOrdinal = ((a0) this.f5554c).ordinal();
                if (iOrdinal == 0) {
                    d dVar = (d) this.f5555d;
                    this.f5553b = 1;
                    return dVar.l(h0Var, this) == aVar4 ? aVar4 : zVar;
                }
                if (iOrdinal == 1) {
                    return zVar;
                }
                if (iOrdinal != 2) {
                    throw new cc.s();
                }
                Float f10 = (Float) obj2;
                if (f10 != y.f5616a) {
                    h0Var.j(null, f10);
                    return zVar;
                }
                h0Var.getClass();
                throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
            case 2:
                d dVar2 = (d) this.f5556e;
                h0 h0Var2 = (h0) this.f5554c;
                int i13 = this.f5553b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            t8.a.e(obj);
                        } else if (i13 != 3 && i13 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    t8.a.e(obj);
                    return zVar;
                }
                t8.a.e(obj);
                e0 e0Var = (e0) this.f5555d;
                if (e0Var == b0.f5522a) {
                    this.f5553b = 1;
                    if (dVar2.l(h0Var2, this) != aVar4) {
                        return zVar;
                    }
                } else {
                    y8.c cVar2 = null;
                    if (e0Var == b0.f5523b) {
                        gc.z zVarE = h0Var2.e();
                        a8.c0 c0Var = new a8.c0(i10, cVar2, 13);
                        this.f5553b = 2;
                        if (y.f(zVarE, c0Var, this) != aVar4) {
                        }
                    } else {
                        gc.z zVarE2 = h0Var2.e();
                        d0 d0Var = new d0(e0Var, null);
                        int i14 = o.f5583a;
                        y8.i iVar = y8.i.f15108a;
                        ec.a aVar5 = ec.a.f4685a;
                        d dVarD = y.d(y.d(new android.support.v4.media.session.r(7, new gc.k(d0Var, zVarE2, iVar, -2, aVar5), new y1(2, null, 1))));
                        i iVar2 = new i(dVar2, h0Var2, (Float) obj2, cVar2, 1);
                        this.f5553b = 4;
                        Object objL = new gc.k(new n(iVar2, null, 0), dVarD, iVar, -2, aVar5).g(iVar, 0, aVar5).l(gc.t.f6266a, this);
                        if (objL != aVar4) {
                            objL = zVar;
                        }
                        if (objL != aVar4) {
                            objL = zVar;
                        }
                        if (objL != aVar4) {
                            return zVar;
                        }
                    }
                }
                return aVar4;
                this.f5553b = 3;
                if (dVar2.l(h0Var2, this) != aVar4) {
                    return zVar;
                }
                return aVar4;
            case 3:
                AtomicReference atomicReference = (AtomicReference) this.f5556e;
                int i15 = this.f5553b;
                try {
                    if (i15 == 0) {
                        t8.a.e(obj);
                        cc.y yVar = (cc.y) this.f5554c;
                        rVar = new r1.r(cc.b0.m(yVar.u()), ((i9.n) this.f5555d).invoke(yVar));
                        r1.r rVar4 = (r1.r) atomicReference.getAndSet(rVar);
                        if (rVar4 != null) {
                            a1 a1Var = rVar4.f11130a;
                            this.f5554c = rVar;
                            this.f5553b = 1;
                            if (cc.b0.f(a1Var, this) == aVar4) {
                                return aVar4;
                            }
                            rVar2 = rVar;
                        }
                        Object obj6 = rVar.f11131b;
                        this.f5554c = rVar;
                        this.f5553b = 2;
                        objInvoke = ((h9.n) obj2).invoke(obj6, this);
                        if (objInvoke == aVar4) {
                            return aVar4;
                        }
                        rVar3 = rVar;
                        while (!atomicReference.compareAndSet(rVar3, null)) {
                        }
                        return objInvoke;
                    }
                    if (i15 != 1) {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rVar3 = (r1.r) this.f5554c;
                        try {
                            t8.a.e(obj);
                            objInvoke = obj;
                            while (!atomicReference.compareAndSet(rVar3, null) && atomicReference.get() == rVar3) {
                            }
                            return objInvoke;
                        } catch (Throwable th2) {
                            th = th2;
                            while (!atomicReference.compareAndSet(rVar3, null) && atomicReference.get() == rVar3) {
                            }
                            throw th;
                        }
                    }
                    rVar2 = (r1.r) this.f5554c;
                    t8.a.e(obj);
                    Object obj7 = rVar.f11131b;
                    this.f5554c = rVar;
                    this.f5553b = 2;
                    objInvoke = ((h9.n) obj2).invoke(obj7, this);
                    if (objInvoke == aVar4) {
                        return aVar4;
                    }
                    rVar3 = rVar;
                    while (!atomicReference.compareAndSet(rVar3, null)) {
                    }
                    return objInvoke;
                } catch (Throwable th3) {
                    th = th3;
                    rVar3 = rVar;
                    while (!atomicReference.compareAndSet(rVar3, null)) {
                    }
                    throw th;
                }
                rVar = rVar2;
            case 4:
                int i16 = this.f5553b;
                if (i16 == 0) {
                    t8.a.e(obj);
                    z1 z1Var = new z1((p0) this.f5554c, (h9.k) this.f5555d, (u0.b) this.f5556e, (u0.l) obj2, null, 3);
                    this.f5553b = 1;
                    if (cc.b0.g(z1Var, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                throw new cc.s();
            case 5:
                v.c cVar3 = (v.c) this.f5555d;
                int i17 = this.f5553b;
                if (i17 == 0) {
                    t8.a.e(obj);
                    if (i9.l.a(this.f5554c, cVar3.f13328e.getValue())) {
                        return zVar;
                    }
                    v.c cVar4 = (v.c) this.f5555d;
                    Object obj8 = this.f5554c;
                    b1 b1Var = (b1) this.f5556e;
                    int i18 = v.e.f13353a;
                    v.j jVar = (v.j) b1Var.getValue();
                    this.f5553b = 1;
                    if (v.c.c(cVar4, obj8, jVar, null, this, 12) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                int i19 = v.e.f13353a;
                h9.k kVar = (h9.k) ((b1) obj2).getValue();
                if (kVar == null) {
                    return zVar;
                }
                kVar.invoke(cVar3.d());
                return zVar;
            case 6:
                int i20 = this.f5553b;
                try {
                    if (i20 == 0) {
                        t8.a.e(obj);
                        tVar = (w0.t) this.f5554c;
                        cVar = tVar.f13931e;
                        this.f5555d = cVar;
                        this.f5556e = tVar;
                        this.f5553b = 1;
                        if (cVar.d(this) != aVar4) {
                        }
                        aVar = cVar;
                        return aVar4;
                    }
                    if (i20 != 1) {
                        if (i20 != 2) {
                            if (i20 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t8.a.e(obj);
                            return obj;
                        }
                        aVar2 = (lc.a) this.f5555d;
                        try {
                            t8.a.e(obj);
                            objB = obj;
                            aVar2 = aVar2;
                            textClassifierK = s1.i.k(objB);
                            aVar3 = aVar2;
                            aVar3 = aVar;
                            ((lc.c) aVar3).f(null);
                            b0.g gVar = new b0.g(textClassifierK, (h9.n) obj2, (y8.c) null);
                            this.f5555d = null;
                            this.f5556e = null;
                            this.f5553b = 3;
                            objB2 = cc.b0.B(200L, gVar, this);
                            if (objB2 != aVar4) {
                                return objB2;
                            }
                            aVar = cVar;
                            return aVar4;
                        } catch (Throwable th4) {
                            th = th4;
                            ((lc.c) aVar2).f(null);
                            throw th;
                        }
                    }
                    tVar = (w0.t) this.f5556e;
                    lc.a aVar6 = (lc.a) this.f5555d;
                    t8.a.e(obj);
                    aVar = aVar6;
                    aVar = cVar;
                    textClassifierK = tVar.f13932f;
                    if (textClassifierK != null) {
                        if (textClassifierK.isDestroyed()) {
                            aVar3 = aVar;
                        } else {
                            aVar3 = aVar;
                            ((lc.c) aVar3).f(null);
                            b0.g gVar2 = new b0.g(textClassifierK, (h9.n) obj2, (y8.c) null);
                            this.f5555d = null;
                            this.f5556e = null;
                            this.f5553b = 3;
                            objB2 = cc.b0.B(200L, gVar2, this);
                            if (objB2 != aVar4) {
                                return objB2;
                            }
                        }
                        aVar = cVar;
                        return aVar4;
                    }
                    c8.b0 b0Var = new c8.b0(tVar, z10 ? 1 : 0, 5);
                    this.f5555d = aVar;
                    this.f5556e = null;
                    this.f5553b = 2;
                    objB = cc.b0.B(300L, b0Var, this);
                    if (objB != aVar4) {
                        aVar2 = aVar;
                        textClassifierK = s1.i.k(objB);
                        aVar3 = aVar2;
                        aVar3 = aVar;
                        ((lc.c) aVar3).f(null);
                        b0.g gVar3 = new b0.g(textClassifierK, (h9.n) obj2, (y8.c) null);
                        this.f5555d = null;
                        this.f5556e = null;
                        this.f5553b = 3;
                        objB2 = cc.b0.B(200L, gVar3, this);
                        if (objB2 != aVar4) {
                            return objB2;
                        }
                    }
                    aVar = cVar;
                    return aVar4;
                } catch (Throwable th5) {
                    th = th5;
                    aVar2 = aVar;
                    ((lc.c) aVar2).f(null);
                    throw th;
                }
            case 7:
                i9.x xVar3 = (i9.x) this.f5556e;
                i9.x xVar4 = (i9.x) this.f5555d;
                i9.w wVar = (i9.w) obj2;
                w0 w0Var = (w0) this.f5554c;
                d1 d1Var = w0Var.f13979a;
                int i21 = this.f5553b;
                if (i21 == 0) {
                    t8.a.e(obj);
                    w0.t tVar2 = w0Var.f14000w;
                    if (tVar2 != null) {
                        CharSequence charSequence = (CharSequence) xVar4.f6688a;
                        long j10 = ((q0) xVar3.f6688a).f1430a;
                        this.f5553b = 1;
                        objA = (charSequence.length() == 0 || q0.c(j10)) ? null : cc.b0.A(tVar2.f13927a, new i(tVar2, new w0.s(j10, charSequence, tVar2, null), (y8.c) null), this);
                        if (objA == aVar4) {
                            return aVar4;
                        }
                    } else {
                        q0Var = null;
                    }
                    if (q0Var != null) {
                        return zVar;
                    }
                    j5 = q0Var.f1430a;
                    if (!q0.a(j5, xVar3.f6688a) || (pVar = (w0.p) d1Var.f13764c.e(wVar.f6687a)) == null || pVar.d() != xVar4.f6688a || (o0Var = (o0) pVar.f13876c.invoke()) == null) {
                        return zVar;
                    }
                    int i22 = (int) (j5 >> 32);
                    w0.y yVar2 = new w0.y(y0.u(o0Var, i22), i22, wVar.f6687a);
                    int i23 = (int) (j5 & 4294967295L);
                    m3.j jVarU = y0.u(o0Var, i23);
                    long j11 = wVar.f6687a;
                    w0.z zVar2 = new w0.z(yVar2, new w0.y(jVarU, i23, j11), false);
                    s.a0 a0Var = s.o.f12475a;
                    s.a0 a0Var2 = new s.a0();
                    a0Var2.h(j11, zVar2);
                    d1Var.k.setValue(a0Var2);
                    w0Var.f13982d.invoke(zVar2);
                    w0Var.f13997t = null;
                    return zVar;
                }
                if (i21 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t8.a.e(obj);
                objA = obj;
                q0Var = (q0) objA;
                if (q0Var != null) {
                    return zVar;
                }
                j5 = q0Var.f1430a;
                return q0.a(j5, xVar3.f6688a) ? zVar : zVar;
            case 8:
                int i24 = this.f5553b;
                if (i24 == 0) {
                    t8.a.e(obj);
                    x2.c cVar5 = (x2.c) this.f5555d;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.f5556e;
                    Rect rect = (Rect) this.f5554c;
                    n3.k kVar2 = new n3.k(rect.left, rect.top, rect.right, rect.bottom);
                    this.f5553b = 1;
                    objA2 = x2.c.a(cVar5, scrollCaptureSession, kVar2, this);
                    if (objA2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                    objA2 = obj;
                }
                ((Consumer) obj2).accept(y1.h0.y((n3.k) objA2));
                return zVar;
            default:
                z.f fVar = (z.f) this.f5555d;
                h0.k kVar3 = fVar.f15361r;
                int i25 = this.f5553b;
                try {
                    try {
                        if (i25 == 0) {
                            t8.a.e(obj);
                            a1 a1VarM = cc.b0.m(((cc.y) this.f5554c).u());
                            fVar.f15366w = true;
                            t1 t1Var = fVar.f15359p;
                            v0 v0Var = v0.f14491a;
                            z1 z1Var2 = new z1((g2) this.f5556e, fVar, (z.c) obj2, a1VarM, null, 4);
                            this.f5553b = 1;
                            if (t1Var.f(v0Var, z1Var2, this) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i25 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t8.a.e(obj);
                        }
                        kVar3.b();
                        fVar.f15366w = false;
                        kVar3.a(null);
                        fVar.f15363t = false;
                        return zVar;
                    } catch (CancellationException e7) {
                        throw e7;
                    }
                } catch (Throwable th6) {
                    fVar.f15366w = false;
                    kVar3.a(null);
                    fVar.f15363t = false;
                    throw th6;
                }
        }
    }
}

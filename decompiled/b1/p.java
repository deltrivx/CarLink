package b1;

import cc.b0;
import cc.y;
import f1.i1;
import f1.k1;
import f1.o2;
import t8.z;
import v.s0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1176a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f1177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1180e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, float f10, v.j jVar, y8.c cVar) {
        super(2, cVar);
        this.f1179d = qVar;
        this.f1177b = f10;
        this.f1180e = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s0 s0Var, y8.c cVar) {
        super(2, cVar);
        this.f1180e = s0Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f1176a) {
            case 0:
                return new p((q) this.f1179d, this.f1177b, (v.j) this.f1180e, cVar);
            default:
                p pVar = new p((s0) this.f1180e, cVar);
                pVar.f1179d = obj;
                return pVar;
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f1176a) {
            case 0:
                break;
        }
        return ((p) create(yVar, cVar)).invokeSuspend(z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        final float fI;
        y yVar;
        switch (this.f1176a) {
            case 0:
                int i7 = this.f1178c;
                if (i7 == 0) {
                    t8.a.e(obj);
                    v.c cVar = (v.c) ((q) this.f1179d).f1183c;
                    Float f10 = new Float(this.f1177b);
                    v.j jVar = (v.j) this.f1180e;
                    this.f1178c = 1;
                    Object objC = v.c.c(cVar, f10, jVar, null, this, 12);
                    z8.a aVar = z8.a.f15774a;
                    if (objC == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t8.a.e(obj);
                }
                return z.f12851a;
            default:
                int i10 = this.f1178c;
                if (i10 == 0) {
                    t8.a.e(obj);
                    y yVar2 = (y) this.f1179d;
                    fI = v.d.i(yVar2.u());
                    yVar = yVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fI = this.f1177b;
                    yVar = (y) this.f1179d;
                    t8.a.e(obj);
                }
                while (b0.q(yVar)) {
                    final s0 s0Var = (s0) this.f1180e;
                    h9.k kVar = new h9.k() { // from class: v.q0
                        @Override // h9.k
                        public final Object invoke(Object obj2) {
                            long jLongValue = ((Long) obj2).longValue();
                            s0 s0Var2 = s0Var;
                            k1 k1Var = s0Var2.f13458i;
                            i1 i1Var = s0Var2.f13454e;
                            if (!((Boolean) k1Var.getValue()).booleanValue()) {
                                if (((o2) p1.l.u(i1Var.f4984b, i1Var)).f5076c == Long.MIN_VALUE) {
                                    i1Var.f(jLongValue);
                                    ((k1) s0Var2.f13450a.f12990b).setValue(Boolean.TRUE);
                                }
                                long jN = jLongValue - ((o2) p1.l.u(i1Var.f4984b, i1Var)).f5076c;
                                float f11 = fI;
                                if (f11 != 0.0f) {
                                    jN = k9.a.N(jN / ((double) f11));
                                }
                                s0Var2.f13453d.f(jN);
                                s0Var2.f(jN, f11 == 0.0f);
                            }
                            return t8.z.f12851a;
                        }
                    };
                    this.f1179d = yVar;
                    this.f1177b = fI;
                    this.f1178c = 1;
                    Object objM = f1.b.q(getContext()).m(kVar, this);
                    z8.a aVar2 = z8.a.f15774a;
                    if (objM == aVar2) {
                        return aVar2;
                    }
                }
                return z.f12851a;
        }
    }
}

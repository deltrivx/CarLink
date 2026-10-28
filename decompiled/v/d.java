package v;

import java.util.concurrent.CancellationException;
import r2.u1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f13336a = new l(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f13337b = new m(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f13338c = new n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f13339d = new o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f13340e = new l(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f13341f = new m(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f13342g = new n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f13343h = new o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f13344i = new float[91];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final w0 f13345j = new w0(new u7.d(5), new u7.d(22));
    public static final w0 k = new w0(new u7.d(6), new u7.d(7));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final w0 f13346l = new w0(new u7.d(8), new u7.d(9));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final w0 f13347m = new w0(new u7.d(10), new u7.d(11));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w0 f13348n = new w0(new u7.d(12), new u7.d(13));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final w0 f13349o = new w0(new u7.d(14), new u7.d(15));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final w0 f13350p = new w0(new u7.d(16), new u7.d(17));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final w0 f13351q = new w0(new u7.d(18), new u7.d(19));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final w0 f13352r = new w0(new u7.d(20), new u7.d(21));

    public static c a(float f10) {
        return new c(Float.valueOf(f10), f13345j, Float.valueOf(0.01f), 8);
    }

    public static k b(float f10, int i7) {
        if ((i7 & 2) != 0) {
            f10 = 0.0f;
        }
        return new k(f13345j, Float.valueOf(0.0f), new l(f10), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0137  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object c(k kVar, f fVar, long j5, final h9.k kVar2, y8.c cVar) {
        l0 l0Var;
        final i9.x xVar;
        final k kVar3;
        k kVar4;
        i9.x xVar2;
        h9.k kVar5;
        i iVar;
        i iVar2;
        l8.b bVar;
        final f fVar2 = fVar;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i7 = l0Var.f13400f;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                l0Var.f13400f = i7 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(cVar);
            }
        } else {
            l0Var = new l0(cVar);
        }
        l0 l0Var2 = l0Var;
        Object obj = l0Var2.f13399e;
        int i10 = l0Var2.f13400f;
        z8.a aVar = z8.a.f15774a;
        if (i10 == 0) {
            t8.a.e(obj);
            final Object objF = fVar2.f(0L);
            final p pVarD = fVar2.d(0L);
            xVar = new i9.x();
            if (j5 == Long.MIN_VALUE) {
                try {
                    final float fI = i(l0Var2.getContext());
                    kVar3 = kVar;
                    try {
                        h9.k kVar6 = new h9.k() { // from class: v.j0
                            @Override // h9.k
                            public final Object invoke(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                f fVar3 = fVar2;
                                w0 w0VarC = fVar3.c();
                                Object objG = fVar3.g();
                                k kVar7 = kVar3;
                                i iVar3 = new i(objF, w0VarC, pVarD, jLongValue, objG, jLongValue, new k0(kVar7, 1));
                                d.h(iVar3, jLongValue, fI, fVar3, kVar7, kVar2);
                                xVar.f6688a = iVar3;
                                return t8.z.f12851a;
                            }
                        };
                        xVar2 = xVar;
                        try {
                            l0Var2.f13395a = kVar3;
                            l0Var2.f13396b = fVar2;
                            l0Var2.f13397c = kVar2;
                            l0Var2.f13398d = xVar2;
                            l0Var2.f13400f = 1;
                            if (e(fVar2, kVar6, l0Var2) != aVar) {
                                kVar4 = kVar3;
                                kVar5 = kVar2;
                                xVar = xVar2;
                            }
                            return aVar;
                        } catch (CancellationException e7) {
                            e = e7;
                            kVar4 = kVar3;
                            xVar = xVar2;
                            iVar = (i) xVar.f6688a;
                            if (iVar != null) {
                                iVar.f13376i.setValue(Boolean.FALSE);
                            }
                            iVar2 = (i) xVar.f6688a;
                            if (iVar2 != null) {
                                kVar4.f13391f = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e10) {
                        e = e10;
                        kVar4 = kVar3;
                        iVar = (i) xVar.f6688a;
                        if (iVar != null) {
                            iVar.f13376i.setValue(Boolean.FALSE);
                        }
                        iVar2 = (i) xVar.f6688a;
                        if (iVar2 != null) {
                            kVar4.f13391f = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e11) {
                    e = e11;
                    kVar3 = kVar;
                }
            } else {
                xVar2 = xVar;
                try {
                    i iVar3 = new i(objF, fVar2.c(), pVarD, j5, fVar2.g(), j5, new k0(kVar, 0));
                    h(iVar3, j5, i(l0Var2.getContext()), fVar2, kVar, kVar2);
                    xVar2.f6688a = iVar3;
                    kVar4 = kVar;
                    fVar2 = fVar;
                    kVar5 = kVar2;
                    xVar = xVar2;
                } catch (CancellationException e12) {
                    e = e12;
                    kVar4 = kVar;
                    xVar = xVar2;
                    iVar = (i) xVar.f6688a;
                    if (iVar != null) {
                        iVar.f13376i.setValue(Boolean.FALSE);
                    }
                    iVar2 = (i) xVar.f6688a;
                    if (iVar2 != null && iVar2.f13374g == kVar4.f13389d) {
                        kVar4.f13391f = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xVar = l0Var2.f13398d;
            kVar5 = l0Var2.f13397c;
            fVar2 = l0Var2.f13396b;
            kVar4 = l0Var2.f13395a;
            try {
                t8.a.e(obj);
            } catch (CancellationException e13) {
                e = e13;
                iVar = (i) xVar.f6688a;
                if (iVar != null) {
                    iVar.f13376i.setValue(Boolean.FALSE);
                }
                iVar2 = (i) xVar.f6688a;
                if (iVar2 != null) {
                    kVar4.f13391f = false;
                }
                throw e;
            }
        }
        do {
            Object obj2 = xVar.f6688a;
            i9.l.b(obj2);
            if (!((Boolean) ((i) obj2).f13376i.getValue()).booleanValue()) {
                return t8.z.f12851a;
            }
            i9.x xVar3 = xVar;
            h9.k kVar7 = kVar5;
            f fVar3 = fVar2;
            k kVar8 = kVar4;
            try {
                bVar = new l8.b(xVar3, i(l0Var2.getContext()), fVar3, kVar8, kVar7);
                xVar = xVar3;
                fVar2 = fVar3;
                kVar4 = kVar8;
                kVar5 = kVar7;
                l0Var2.f13395a = kVar4;
                l0Var2.f13396b = fVar2;
                l0Var2.f13397c = kVar5;
                l0Var2.f13398d = xVar;
                l0Var2.f13400f = 2;
            } catch (CancellationException e14) {
                e = e14;
                xVar = xVar3;
                kVar4 = kVar8;
                iVar = (i) xVar.f6688a;
                if (iVar != null) {
                    iVar.f13376i.setValue(Boolean.FALSE);
                }
                iVar2 = (i) xVar.f6688a;
                if (iVar2 != null) {
                    kVar4.f13391f = false;
                }
                throw e;
            }
        } while (e(fVar2, bVar, l0Var2) != aVar);
        return aVar;
    }

    public static final Object d(k kVar, Float f10, v vVar, h9.k kVar2, a9.i iVar) {
        Object objC = c(kVar, new m0(vVar, kVar.f13386a, kVar.f13387b.getValue(), f10, kVar.f13388c), kVar.f13389d, kVar2, iVar);
        return objC == z8.a.f15774a ? objC : t8.z.f12851a;
    }

    public static final Object e(f fVar, h9.k kVar, l0 l0Var) {
        if (!fVar.a()) {
            return f1.b.q(l0Var.getContext()).m(new a8.j0(kVar, 11), l0Var);
        }
        if (l0Var.getContext().l(u1.f11491a) == null) {
            return f1.b.q(l0Var.getContext()).m(kVar, l0Var);
        }
        throw new ClassCastException();
    }

    public static final p f(p pVar) {
        p pVarC = pVar.c();
        int iB = pVarC.b();
        for (int i7 = 0; i7 < iB; i7++) {
            pVarC.e(pVar.a(i7), i7);
        }
        return pVarC;
    }

    public static k g(k kVar, float f10) {
        float f11 = ((l) kVar.f13388c).f13394a;
        return new k(kVar.f13386a, Float.valueOf(f10), new l(f11), kVar.f13389d, kVar.f13390e, kVar.f13391f);
    }

    public static final void h(i iVar, long j5, float f10, f fVar, k kVar, h9.k kVar2) {
        long jB = f10 == 0.0f ? fVar.b() : (long) ((j5 - iVar.f13370c) / f10);
        iVar.f13374g = j5;
        iVar.f13372e.setValue(fVar.f(jB));
        iVar.f13373f = fVar.d(jB);
        if (fVar.e(jB)) {
            iVar.f13375h = iVar.f13374g;
            iVar.f13376i.setValue(Boolean.FALSE);
        }
        l(iVar, kVar);
        kVar2.invoke(iVar);
    }

    public static final float i(y8.h hVar) {
        r1.q qVar = (r1.q) hVar.l(r1.c.f11105o);
        float fN = qVar != null ? qVar.n() : 1.0f;
        if (fN >= 0.0f) {
            return fN;
        }
        d0.b("negative scale factor");
        return fN;
    }

    public static g0 j(int i7, Object obj) {
        float f10 = (i7 & 2) != 0 ? 1500.0f : 400.0f;
        if ((i7 & 4) != 0) {
            obj = null;
        }
        return new g0(1.0f, f10, obj);
    }

    public static v0 k(int i7, int i10, t tVar) {
        if ((i10 & 4) != 0) {
            tVar = u.f13466a;
        }
        return new v0(i7, 0, tVar);
    }

    public static final void l(i iVar, k kVar) {
        kVar.f13387b.setValue(iVar.f13372e.getValue());
        p pVar = kVar.f13388c;
        p pVar2 = iVar.f13373f;
        int iB = pVar.b();
        for (int i7 = 0; i7 < iB; i7++) {
            pVar.e(pVar2.a(i7), i7);
        }
        kVar.f13390e = iVar.f13375h;
        kVar.f13389d = iVar.f13374g;
        kVar.f13391f = ((Boolean) iVar.f13376i.getValue()).booleanValue();
    }
}

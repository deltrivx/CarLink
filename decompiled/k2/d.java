package k2;

import android.view.KeyEvent;
import android.view.MotionEvent;
import q2.d1;
import q2.h1;
import q2.q0;
import q2.u0;
import q2.y1;
import r2.l2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i9.n implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7199c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        super(0);
        this.f7197a = i7;
        this.f7198b = obj;
        this.f7199c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v11 */
    @Override // h9.a
    public final Object invoke() {
        y2.m mVar;
        q2.h0 h0Var;
        x1.c cVar;
        switch (this.f7197a) {
            case 0:
                ((e) this.f7198b).g((r1.o) this.f7199c);
                return t8.z.f12851a;
            case 1:
                d1 d1Var = ((q2.h0) this.f7198b).E;
                i9.x xVar = (i9.x) this.f7199c;
                if ((d1Var.f10617f.f11120d & 8) != 0) {
                    for (r1.o oVar = d1Var.f10616e; oVar != null; oVar = oVar.f11121e) {
                        if ((oVar.f11119c & 8) != 0) {
                            ?? F = oVar;
                            ?? eVar = 0;
                            while (F != 0) {
                                if (F instanceof y1) {
                                    y1 y1Var = (y1) F;
                                    if (y1Var.B()) {
                                        y2.j jVar = new y2.j();
                                        xVar.f6688a = jVar;
                                        jVar.f15014d = true;
                                    }
                                    if (y1Var.j0()) {
                                        ((y2.j) xVar.f6688a).f15013c = true;
                                    }
                                    y1Var.Y((y2.j) xVar.f6688a);
                                } else if ((F.f11119c & 8) != 0 && (F instanceof q2.m)) {
                                    r1.o oVar2 = ((q2.m) F).f10746p;
                                    int i7 = 0;
                                    while (oVar2 != null) {
                                        if ((oVar2.f11119c & 8) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                F = F;
                                                eVar = eVar;
                                                eVar = eVar;
                                                F = oVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new h1.e(new r1.o[16]);
                                                }
                                                if (F != 0) {
                                                    eVar.b(F);
                                                    F = 0;
                                                }
                                                eVar.b(oVar2);
                                            }
                                        } else {
                                            F = F;
                                            eVar = eVar;
                                        }
                                        oVar2 = oVar2.f11122f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i7 == 1) {
                                        F = F;
                                        eVar = eVar;
                                    } else {
                                        F = F;
                                        eVar = eVar;
                                    }
                                }
                                F = q2.f.f(eVar);
                            }
                        }
                    }
                }
                return t8.z.f12851a;
            case 2:
                u0 u0Var = (u0) this.f7198b;
                q2.l0 l0Var = u0Var.f10810f;
                l0Var.f10736h = 0;
                h1.e eVarZ = l0Var.f10729a.z();
                Object[] objArr = eVarZ.f6421a;
                int i10 = eVarZ.f6423c;
                for (int i11 = 0; i11 < i10; i11++) {
                    u0 u0Var2 = ((q2.h0) objArr[i11]).F.f10744q;
                    i9.l.b(u0Var2);
                    u0Var2.f10812h = u0Var2.f10813i;
                    u0Var2.f10813i = Integer.MAX_VALUE;
                    if (u0Var2.f10814j == q2.f0.f10639b) {
                        u0Var2.f10814j = q2.f0.f10640c;
                    }
                }
                q2.h0 h0Var2 = l0Var.f10729a;
                q2.h0 h0Var3 = l0Var.f10729a;
                h1.e eVarZ2 = h0Var2.z();
                Object[] objArr2 = eVarZ2.f6421a;
                int i12 = eVarZ2.f6423c;
                for (int i13 = 0; i13 < i12; i13++) {
                    u0 u0Var3 = ((q2.h0) objArr2[i13]).F.f10744q;
                    i9.l.b(u0Var3);
                    u0Var3.f10820q.getClass();
                }
                q2.s sVar = u0Var.f().P;
                if (sVar != null) {
                    boolean z10 = sVar.k;
                    h1.b bVar = (h1.b) h0Var3.n();
                    int i14 = ((h1.e) bVar.f6413b).f6423c;
                    for (int i15 = 0; i15 < i14; i15++) {
                        q0 q0VarE0 = ((q2.h0) bVar.get(i15)).E.f10615d.E0();
                        if (q0VarE0 != null) {
                            q0VarE0.k = z10;
                        }
                    }
                }
                ((q0) this.f7199c).o0().c();
                if (u0Var.f().P != null) {
                    h1.b bVar2 = (h1.b) h0Var3.n();
                    int i16 = ((h1.e) bVar2.f6413b).f6423c;
                    for (int i17 = 0; i17 < i16; i17++) {
                        q0 q0VarE1 = ((q2.h0) bVar2.get(i17)).E.f10615d.E0();
                        if (q0VarE1 != null) {
                            q0VarE1.k = false;
                        }
                    }
                }
                h1.e eVarZ3 = h0Var3.z();
                Object[] objArr3 = eVarZ3.f6421a;
                int i18 = eVarZ3.f6423c;
                for (int i19 = 0; i19 < i18; i19++) {
                    u0 u0Var4 = ((q2.h0) objArr3[i19]).F.f10744q;
                    i9.l.b(u0Var4);
                    int i20 = u0Var4.f10812h;
                    int i21 = u0Var4.f10813i;
                    if (i20 != i21 && i21 == Integer.MAX_VALUE) {
                        u0Var4.Y(true);
                    }
                }
                h1.e eVarZ4 = h0Var3.z();
                Object[] objArr4 = eVarZ4.f6421a;
                int i22 = eVarZ4.f6423c;
                for (int i23 = 0; i23 < i22; i23++) {
                    u0 u0Var5 = ((q2.h0) objArr4[i23]).F.f10744q;
                    i9.l.b(u0Var5);
                    q2.i0 i0Var = u0Var5.f10820q;
                    i0Var.getClass();
                    i0Var.f10712c = false;
                }
                return t8.z.f12851a;
            case 3:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.f7199c));
            case 4:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchGenericMotionEvent((MotionEvent) this.f7199c));
            case 5:
                r2.b0 b0Var = (r2.b0) this.f7199c;
                l2 l2Var = (l2) this.f7198b;
                y2.h hVar = l2Var.f11326e;
                y2.h hVar2 = l2Var.f11327f;
                Float f10 = l2Var.f11324c;
                Float f11 = l2Var.f11325d;
                float fFloatValue = (hVar == null || f10 == null) ? 0.0f : ((Number) hVar.f14984a.invoke()).floatValue() - f10.floatValue();
                float fFloatValue2 = (hVar2 == null || f11 == null) ? 0.0f : ((Number) hVar2.f14984a.invoke()).floatValue() - f11.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iV = b0Var.v(l2Var.f11322a);
                    y2.n nVar = (y2.n) b0Var.o().b(b0Var.f11178n);
                    if (nVar != null) {
                        try {
                            f4.f fVar = b0Var.f11180p;
                            if (fVar != null) {
                                fVar.f5287a.setBoundsInScreen(b0Var.f(nVar));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    y2.n nVar2 = (y2.n) b0Var.o().b(b0Var.f11179o);
                    if (nVar2 != null) {
                        try {
                            f4.f fVar2 = b0Var.f11181q;
                            if (fVar2 != null) {
                                fVar2.f5287a.setBoundsInScreen(b0Var.f(nVar2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    b0Var.f11169d.invalidate();
                    y2.n nVar3 = (y2.n) b0Var.o().b(iV);
                    if (nVar3 != null && (mVar = nVar3.f15024a) != null && (h0Var = mVar.f15019c) != null) {
                        if (hVar != null) {
                            b0Var.f11183s.h(iV, hVar);
                        }
                        if (hVar2 != null) {
                            b0Var.f11184t.h(iV, hVar2);
                        }
                        b0Var.r(h0Var);
                    }
                }
                if (hVar != null) {
                    l2Var.f11324c = (Float) hVar.f14984a.invoke();
                }
                if (hVar2 != null) {
                    l2Var.f11325d = (Float) hVar2.f14984a.invoke();
                }
                return t8.z.f12851a;
            case 6:
                ((v1.b) this.f7198b).f13591q.invoke((v1.c) this.f7199c);
                return t8.z.f12851a;
            case 7:
                h9.a aVar = (h9.a) this.f7198b;
                if (aVar != null && (cVar = (x1.c) aVar.invoke()) != null) {
                    return cVar;
                }
                h1 h1Var = (h1) this.f7199c;
                if (!h1Var.G0().f11129n) {
                    h1Var = null;
                }
                if (h1Var != null) {
                    return n3.u.c(0L, n3.n.M0(h1Var.f9437c));
                }
                return null;
            default:
                ((i9.x) this.f7198b).f6688a = ((w1.s) this.f7199c).B0();
                return t8.z.f12851a;
        }
    }
}

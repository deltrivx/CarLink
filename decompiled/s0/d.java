package s0;

import a2.h;
import a2.j;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;
import cc.s;
import e8.p;
import f1.h1;
import fc.h0;
import h9.k;
import i9.x;
import java.util.Map;
import k2.u;
import k2.v;
import n3.l;
import n3.n;
import n3.r;
import o2.w;
import t8.o;
import t8.z;
import u0.q;
import v.i;
import v.s0;
import x.m;
import x.o1;
import y1.b0;
import y1.c0;
import y1.d0;
import y1.e0;
import y1.n0;
import z.m1;
import z.t1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12533b;

    public /* synthetic */ d(int i7, Object obj) {
        this.f12532a = i7;
        this.f12533b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x053c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0257  */
    /* JADX WARN: Code duplicated, block: B:96:0x02a9  */
    @Override // h9.k
    public final Object invoke(Object obj) {
        h0 h0Var;
        Object value;
        s7.e eVar;
        boolean z10;
        y1.k kVar;
        int i7;
        boolean z11;
        y1.k kVar2;
        a2.c cVar;
        a2.b bVar;
        float f10;
        float f11;
        long J;
        x1.c cVarB0;
        int i10 = this.f12532a;
        z zVar = z.f12851a;
        Object obj2 = this.f12533b;
        switch (i10) {
            case 0:
                return new p(11, (c) obj2);
            case 1:
                Activity activity = (Activity) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    o oVar = w7.g.f14171a;
                    if (w7.g.a(activity, "悬浮窗", l.I(x6.a.i()))) {
                        h0 h0Var2 = s7.e.f12587e;
                        h0Var = s7.e.f12587e;
                        do {
                            value = h0Var.getValue();
                            eVar = (s7.e) value;
                            i9.l.e(eVar, "$this$update");
                        } while (!h0Var.f(value, s7.e.a(eVar, zBooleanValue, 0, 0, 0, 14)));
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    h0 h0Var3 = s7.e.f12587e;
                    h0Var = s7.e.f12587e;
                    do {
                        value = h0Var.getValue();
                        eVar = (s7.e) value;
                        i9.l.e(eVar, "$this$update");
                    } while (!h0Var.f(value, s7.e.a(eVar, zBooleanValue, 0, 0, 0, 14)));
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 2:
                ((q) obj2).a((g3.g) obj);
                return zVar;
            case 3:
                return obj == ((u8.a) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 4:
                u8.f fVar = (u8.f) obj2;
                Map.Entry entry = (Map.Entry) obj;
                i9.l.e(entry, "it");
                StringBuilder sb2 = new StringBuilder();
                Object key = entry.getKey();
                sb2.append(key == fVar ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value2 = entry.getValue();
                sb2.append(value2 != fVar ? String.valueOf(value2) : "(this Map)");
                return sb2.toString();
            case 5:
                i iVar = (i) obj;
                ((a8.l) obj2).invoke(iVar.f13372e.getValue(), v.d.f13345j.f13472b.invoke(iVar.f13373f));
                return zVar;
            case 6:
                return new p(12, (s0) obj2);
            case 7:
                x.p pVar = (x.p) obj2;
                v1.c cVar2 = (v1.c) obj;
                if (cVar2.a() * pVar.f14454r < 0.0f || x1.e.c(cVar2.f13592a.g()) <= 0.0f) {
                    return cVar2.b(new u7.d(26));
                }
                float f12 = 2;
                final float fMin = Math.min(n3.f.a(pVar.f14454r, 0.0f) ? 1.0f : (float) Math.ceil(cVar2.a() * pVar.f14454r), (float) Math.ceil(x1.e.c(cVar2.f13592a.g()) / f12));
                final float f13 = fMin / f12;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cVar2.f13592a.g() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cVar2.f13592a.g() & 4294967295L)) - fMin)) & 4294967295L);
                float f14 = fMin * f12;
                boolean z12 = f14 > x1.e.c(cVar2.f13592a.g());
                y1.h0 h0VarA = pVar.f14456t.a(cVar2.f13592a.g(), cVar2.f13592a.getLayoutDirection(), cVar2);
                if (!(h0VarA instanceof b0)) {
                    if (!(h0VarA instanceof d0)) {
                        boolean z13 = z12;
                        if (!(h0VarA instanceof c0)) {
                            throw new s();
                        }
                        final n0 n0Var = pVar.f14455s;
                        final long j5 = z13 ? 0L : jFloatToRawIntBits;
                        final long jG = z13 ? cVar2.f13592a.g() : jFloatToRawIntBits2;
                        final h kVar3 = z13 ? j.f23a : new a2.k(fMin, 0.0f, 0, 0, 30);
                        return cVar2.b(new k() { // from class: x.n
                            @Override // h9.k
                            public final Object invoke(Object obj3) {
                                q2.j0 j0Var = (q2.j0) obj3;
                                j0Var.b();
                                a2.f.v(j0Var, n0Var, j5, jG, 0.0f, kVar3, 104);
                                return t8.z.f12851a;
                            }
                        });
                    }
                    final n0 n0Var2 = pVar.f14455s;
                    x1.d dVar = ((d0) h0VarA).f14882e;
                    if (n4.h.P(dVar)) {
                        final long j10 = dVar.f14531e;
                        final a2.k kVar4 = new a2.k(fMin, 0.0f, 0, 0, 30);
                        final boolean z14 = z12;
                        return cVar2.b(new k() { // from class: x.o
                            @Override // h9.k
                            public final Object invoke(Object obj3) throws Throwable {
                                a2.b bVar2;
                                long j11;
                                q2.j0 j0Var = (q2.j0) obj3;
                                j0Var.b();
                                a2.c cVar3 = j0Var.f10720a;
                                boolean z15 = z14;
                                y1.m mVar = n0Var2;
                                long j12 = j10;
                                if (z15) {
                                    a2.f.x(j0Var, mVar, 0L, 0L, j12, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
                                    float f15 = f13;
                                    if (fIntBitsToFloat < f15) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cVar3.f16b.J() >> 32));
                                        float f16 = fMin;
                                        float f17 = fIntBitsToFloat2 - f16;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (cVar3.f16b.J() & 4294967295L)) - f16;
                                        a2.b bVar3 = cVar3.f16b;
                                        long J2 = bVar3.J();
                                        bVar3.z().h();
                                        try {
                                            ((a2.b) ((a2.d) bVar3.f12b).f20b).z().l(f16, f16, f17, fIntBitsToFloat3, 0);
                                            j11 = J2;
                                            bVar2 = bVar3;
                                            try {
                                                a2.f.x(j0Var, mVar, 0L, 0L, j12, null, 246);
                                                ob.a.y(bVar2, j11);
                                            } catch (Throwable th) {
                                                th = th;
                                                ob.a.y(bVar2, j11);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bVar2 = bVar3;
                                            j11 = J2;
                                        }
                                    } else {
                                        a2.f.x(j0Var, mVar, jFloatToRawIntBits, jFloatToRawIntBits2, n3.r.Y(f15, j12), kVar4, 208);
                                    }
                                }
                                return t8.z.f12851a;
                            }
                        });
                    }
                    boolean z15 = z12;
                    if (pVar.f14453q == null) {
                        pVar.f14453q = new m();
                    }
                    m mVar = pVar.f14453q;
                    i9.l.b(mVar);
                    y1.h hVar = mVar.f14427d;
                    y1.h hVar2 = hVar;
                    if (hVar == null) {
                        y1.h hVarA = y1.j.a();
                        mVar.f14427d = hVarA;
                        hVar2 = hVarA;
                    }
                    hVar2.c();
                    ob.a.i(hVar2, dVar);
                    if (!z15) {
                        e0 e0VarA = y1.j.a();
                        ob.a.i(e0VarA, new x1.d(fMin, fMin, dVar.b() - fMin, dVar.a() - fMin, r.Y(fMin, dVar.f14531e), r.Y(fMin, dVar.f14532f), r.Y(fMin, dVar.f14533g), r.Y(fMin, dVar.f14534h)));
                        hVar2.b(hVar2, e0VarA, 0);
                    }
                    return cVar2.b(new c8.p(23, hVar2, n0Var2));
                }
                n0 n0Var3 = pVar.f14455s;
                b0 b0Var = (b0) h0VarA;
                e0 e0Var = b0Var.f14878e;
                if (z12) {
                    return cVar2.b(new c8.p(24, b0Var, n0Var3));
                }
                if (ob.a.A(n0Var3)) {
                    kVar = new y1.k(5, y1.q.b(1.0f, n0Var3.f14942a));
                    i7 = 1;
                } else {
                    kVar = null;
                    i7 = 0;
                }
                x1.c cVarA = ((y1.h) e0Var).a();
                float f15 = cVarA.f14524b;
                float f16 = cVarA.f14523a;
                if (pVar.f14453q == null) {
                    pVar.f14453q = new m();
                }
                m mVar2 = pVar.f14453q;
                i9.l.b(mVar2);
                y1.h hVar3 = mVar2.f14427d;
                y1.h hVar4 = hVar3;
                if (hVar3 == null) {
                    y1.h hVarA2 = y1.j.a();
                    mVar2.f14427d = hVarA2;
                    hVar4 = hVarA2;
                }
                hVar4.c();
                float f17 = cVarA.f14523a;
                float f18 = cVarA.f14526d;
                float f19 = cVarA.f14525c;
                float f20 = cVarA.f14524b;
                if (Float.isNaN(f17) || Float.isNaN(f20) || Float.isNaN(f19) || Float.isNaN(f18)) {
                    y1.j.b("Invalid rectangle, make sure no value is NaN");
                }
                if (hVar4.f14896b == null) {
                    hVar4.f14896b = new RectF();
                }
                RectF rectF = hVar4.f14896b;
                i9.l.b(rectF);
                rectF.set(f17, f20, f19, f18);
                Path path = hVar4.f14895a;
                RectF rectF2 = hVar4.f14896b;
                i9.l.b(rectF2);
                path.addRect(rectF2, Path.Direction.CCW);
                hVar4.b(hVar4, e0Var, 0);
                x xVar = new x();
                long jCeil = (((long) ((int) Math.ceil(cVarA.f14526d - f15))) & 4294967295L) | (((long) ((int) Math.ceil(cVarA.f14525c - f16))) << 32);
                m mVar3 = pVar.f14453q;
                i9.l.b(mVar3);
                y1.f fVarF = mVar3.f14424a;
                y1.b bVarA = mVar3.f14425b;
                y1.x xVar2 = fVarF != null ? new y1.x(fVarF.a()) : null;
                if (xVar2 != null && xVar2.f14965a == 0) {
                    z11 = true;
                } else {
                    y1.x xVar3 = fVarF != null ? new y1.x(fVarF.a()) : null;
                    if (ob.a.A(xVar3) && i7 == xVar3.f14965a) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                try {
                    try {
                        if (fVarF != null && bVarA != null) {
                            kVar2 = kVar;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar2.f13592a.g() >> 32));
                            Bitmap bitmap = fVarF.f14890a;
                            if (fIntBitsToFloat > bitmap.getWidth() || Float.intBitsToFloat((int) (cVar2.f13592a.g() & 4294967295L)) > bitmap.getHeight() || !z11) {
                            }
                            cVar = mVar3.f14426c;
                            if (cVar == null) {
                                cVar = new a2.c();
                                mVar3.f14426c = cVar;
                            }
                            bVar = cVar.f16b;
                            a2.a aVar = cVar.f15a;
                            long jM0 = n.M0(jCeil);
                            n3.o layoutDirection = cVar2.f13592a.getLayoutDirection();
                            n3.c cVar3 = aVar.f6a;
                            a2.c cVar4 = cVar;
                            n3.o oVar2 = aVar.f7b;
                            y1.h hVar5 = hVar4;
                            y1.o oVar3 = aVar.f8c;
                            long j11 = aVar.f9d;
                            aVar.f6a = cVar2;
                            aVar.f7b = layoutDirection;
                            aVar.f8c = bVarA;
                            aVar.f9d = jM0;
                            bVarA.h();
                            a2.f.w(cVar4, y1.q.f14948b, 0L, jM0, 58);
                            f10 = -f16;
                            f11 = -f15;
                            ((a2.d) bVar.f12b).B(f10, f11);
                            a2.f.t(cVar4, b0Var.f14878e, n0Var3, 0.0f, new a2.k(f14, 0.0f, 0, 0, 30), 52);
                            float f21 = 1;
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (bVar.J() >> 32)) + f21) / Float.intBitsToFloat((int) (bVar.J() >> 32));
                            y1.b bVar2 = bVarA;
                            float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (bVar.J() & 4294967295L)) + f21) / Float.intBitsToFloat((int) (bVar.J() & 4294967295L));
                            long jC0 = cVar4.c0();
                            y1.f fVar2 = fVarF;
                            J = bVar.J();
                            bVar.z().h();
                            ((a2.d) bVar.f12b).y(fIntBitsToFloat2, fIntBitsToFloat3, jC0);
                            a2.f.t(cVar4, hVar5, n0Var3, 0.0f, null, 28);
                            bVar.z().r();
                            bVar.b0(J);
                            ((a2.d) bVar.f12b).B(-f10, -f11);
                            bVar2.r();
                            aVar.f6a = cVar3;
                            aVar.f7b = oVar2;
                            aVar.f8c = oVar3;
                            aVar.f9d = j11;
                            fVar2.f14890a.prepareToDraw();
                            xVar.f6688a = fVar2;
                            return cVar2.b(new b3.o(cVarA, xVar, jCeil, kVar2));
                        }
                        kVar2 = kVar;
                        ((a2.d) bVar.f12b).y(fIntBitsToFloat2, fIntBitsToFloat3, jC0);
                        a2.f.t(cVar4, hVar5, n0Var3, 0.0f, null, 28);
                        bVar.z().r();
                        bVar.b0(J);
                        ((a2.d) bVar.f12b).B(-f10, -f11);
                        bVar2.r();
                        aVar.f6a = cVar3;
                        aVar.f7b = oVar2;
                        aVar.f8c = oVar3;
                        aVar.f9d = j11;
                        fVar2.f14890a.prepareToDraw();
                        xVar.f6688a = fVar2;
                        return cVar2.b(new b3.o(cVarA, xVar, jCeil, kVar2));
                    } catch (Throwable th) {
                        bVar.z().r();
                        bVar.b0(J);
                        throw th;
                    }
                    a2.f.t(cVar4, b0Var.f14878e, n0Var3, 0.0f, new a2.k(f14, 0.0f, 0, 0, 30), 52);
                    float f22 = 1;
                    float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (bVar.J() >> 32)) + f22) / Float.intBitsToFloat((int) (bVar.J() >> 32));
                    y1.b bVar3 = bVarA;
                    float fIntBitsToFloat5 = (Float.intBitsToFloat((int) (bVar.J() & 4294967295L)) + f22) / Float.intBitsToFloat((int) (bVar.J() & 4294967295L));
                    long jC1 = cVar4.c0();
                    y1.f fVar3 = fVarF;
                    J = bVar.J();
                    bVar.z().h();
                } catch (Throwable th2) {
                    ((a2.d) bVar.f12b).B(-f10, -f11);
                    throw th2;
                }
                fVarF = y1.h0.f((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i7);
                mVar3.f14424a = fVarF;
                bVarA = y1.h0.a(fVarF);
                mVar3.f14425b = bVarA;
                cVar = mVar3.f14426c;
                if (cVar == null) {
                    cVar = new a2.c();
                    mVar3.f14426c = cVar;
                }
                bVar = cVar.f16b;
                a2.a aVar2 = cVar.f15a;
                long jM1 = n.M0(jCeil);
                n3.o layoutDirection2 = cVar2.f13592a.getLayoutDirection();
                n3.c cVar5 = aVar2.f6a;
                a2.c cVar6 = cVar;
                n3.o oVar4 = aVar2.f7b;
                y1.h hVar6 = hVar4;
                y1.o oVar5 = aVar2.f8c;
                long j12 = aVar2.f9d;
                aVar2.f6a = cVar2;
                aVar2.f7b = layoutDirection2;
                aVar2.f8c = bVarA;
                aVar2.f9d = jM1;
                bVarA.h();
                a2.f.w(cVar6, y1.q.f14948b, 0L, jM1, 58);
                f10 = -f16;
                f11 = -f15;
                ((a2.d) bVar.f12b).B(f10, f11);
                break;
            case 8:
                o1 o1Var = (o1) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                h1 h1Var = o1Var.f14445a;
                float f23 = h1Var.f() + fFloatValue + o1Var.f14449e;
                float fL = r.l(f23, 0.0f, o1Var.f14448d.f());
                boolean z16 = f23 == fL;
                float f24 = fL - h1Var.f();
                int iRound = Math.round(f24);
                h1Var.g(h1Var.f() + iRound);
                o1Var.f14449e = f24 - iRound;
                if (!z16) {
                    fFloatValue = f24;
                }
                return Float.valueOf(fFloatValue);
            case 9:
                v vVar = (v) obj;
                ((a8.l) obj2).invoke(vVar, Float.valueOf(Float.intBitsToFloat((int) (u.f(vVar, false) >> 32))));
                vVar.a();
                return zVar;
            case 10:
                z.f fVar4 = ((m1) obj2).G;
                fVar4.f15362s = (w) obj;
                if (fVar4.f15364u && (cVarB0 = fVar4.B0()) != null && !fVar4.C0(cVarB0, fVar4.f15365v)) {
                    fVar4.f15363t = true;
                    fVar4.D0();
                }
                fVar4.f15364u = false;
                return zVar;
            default:
                t1 t1Var = (t1) obj2;
                return new x1.b(t1Var.c(t1Var.k, ((x1.b) obj).f14521a, t1Var.f15526j));
        }
    }
}

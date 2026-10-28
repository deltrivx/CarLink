package r2;

import android.graphics.Outline;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11142a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Outline f11143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y1.h0 f11144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y1.h f11145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y1.e0 f11146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y1.e0 f11149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x1.d f11150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f11151j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11153m;

    public a2() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f11143b = outline;
        this.k = 0L;
        this.f11152l = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c1  */
    public final void a(y1.o oVar) {
        e();
        y1.e0 e0Var = this.f11146e;
        if (e0Var != null) {
            oVar.j(e0Var);
            return;
        }
        float f10 = this.f11151j;
        if (f10 <= 0.0f) {
            oVar.l(Float.intBitsToFloat((int) (this.k >> 32)), Float.intBitsToFloat((int) (this.k & 4294967295L)), Float.intBitsToFloat((int) (this.f11152l >> 32)) + Float.intBitsToFloat((int) (this.k >> 32)), Float.intBitsToFloat((int) (this.f11152l & 4294967295L)) + Float.intBitsToFloat((int) (this.k & 4294967295L)), 1);
            return;
        }
        y1.e0 e0VarA = this.f11149h;
        x1.d dVar = this.f11150i;
        if (e0VarA != null) {
            long j5 = this.k;
            long j10 = this.f11152l;
            if (dVar == null || !n4.h.P(dVar)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.k >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.k & 4294967295L));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.f11152l >> 32)) + Float.intBitsToFloat((int) (this.k >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.f11152l & 4294967295L)) + Float.intBitsToFloat((int) (this.k & 4294967295L));
                float f11 = this.f11151j;
                x1.d dVarF = n4.h.f(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f11)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f11))));
                if (e0VarA == null) {
                    e0VarA = y1.j.a();
                } else {
                    ((y1.h) e0VarA).c();
                }
                ob.a.i(e0VarA, dVarF);
                this.f11150i = dVarF;
                this.f11149h = e0VarA;
            } else {
                int i7 = (int) (j5 >> 32);
                if (dVar.f14527a == Float.intBitsToFloat(i7)) {
                    int i10 = (int) (j5 & 4294967295L);
                    if (dVar.f14528b == Float.intBitsToFloat(i10)) {
                        if (dVar.f14529c == Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i7)) {
                            if (dVar.f14530d != Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i10) || Float.intBitsToFloat((int) (dVar.f14531e >> 32)) != f10) {
                                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (this.k >> 32));
                                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (this.k & 4294967295L));
                                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (this.f11152l >> 32)) + Float.intBitsToFloat((int) (this.k >> 32));
                                float fIntBitsToFloat8 = Float.intBitsToFloat((int) (this.f11152l & 4294967295L)) + Float.intBitsToFloat((int) (this.k & 4294967295L));
                                float f12 = this.f11151j;
                                x1.d dVarF2 = n4.h.f(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, (((long) Float.floatToRawIntBits(f12)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f12))));
                                if (e0VarA == null) {
                                    e0VarA = y1.j.a();
                                } else {
                                    ((y1.h) e0VarA).c();
                                }
                                ob.a.i(e0VarA, dVarF2);
                                this.f11150i = dVarF2;
                                this.f11149h = e0VarA;
                            }
                        } else {
                            float fIntBitsToFloat9 = Float.intBitsToFloat((int) (this.k >> 32));
                            float fIntBitsToFloat10 = Float.intBitsToFloat((int) (this.k & 4294967295L));
                            float fIntBitsToFloat11 = Float.intBitsToFloat((int) (this.f11152l >> 32)) + Float.intBitsToFloat((int) (this.k >> 32));
                            float fIntBitsToFloat12 = Float.intBitsToFloat((int) (this.f11152l & 4294967295L)) + Float.intBitsToFloat((int) (this.k & 4294967295L));
                            float f13 = this.f11151j;
                            x1.d dVarF3 = n4.h.f(fIntBitsToFloat9, fIntBitsToFloat10, fIntBitsToFloat11, fIntBitsToFloat12, (((long) Float.floatToRawIntBits(f13)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f13))));
                            if (e0VarA == null) {
                                e0VarA = y1.j.a();
                            } else {
                                ((y1.h) e0VarA).c();
                            }
                            ob.a.i(e0VarA, dVarF3);
                            this.f11150i = dVarF3;
                            this.f11149h = e0VarA;
                        }
                    } else {
                        float fIntBitsToFloat13 = Float.intBitsToFloat((int) (this.k >> 32));
                        float fIntBitsToFloat14 = Float.intBitsToFloat((int) (this.k & 4294967295L));
                        float fIntBitsToFloat15 = Float.intBitsToFloat((int) (this.f11152l >> 32)) + Float.intBitsToFloat((int) (this.k >> 32));
                        float fIntBitsToFloat16 = Float.intBitsToFloat((int) (this.f11152l & 4294967295L)) + Float.intBitsToFloat((int) (this.k & 4294967295L));
                        float f14 = this.f11151j;
                        x1.d dVarF4 = n4.h.f(fIntBitsToFloat13, fIntBitsToFloat14, fIntBitsToFloat15, fIntBitsToFloat16, (((long) Float.floatToRawIntBits(f14)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f14))));
                        if (e0VarA == null) {
                            e0VarA = y1.j.a();
                        } else {
                            ((y1.h) e0VarA).c();
                        }
                        ob.a.i(e0VarA, dVarF4);
                        this.f11150i = dVarF4;
                        this.f11149h = e0VarA;
                    }
                } else {
                    float fIntBitsToFloat17 = Float.intBitsToFloat((int) (this.k >> 32));
                    float fIntBitsToFloat18 = Float.intBitsToFloat((int) (this.k & 4294967295L));
                    float fIntBitsToFloat19 = Float.intBitsToFloat((int) (this.f11152l >> 32)) + Float.intBitsToFloat((int) (this.k >> 32));
                    float fIntBitsToFloat110 = Float.intBitsToFloat((int) (this.f11152l & 4294967295L)) + Float.intBitsToFloat((int) (this.k & 4294967295L));
                    float f15 = this.f11151j;
                    x1.d dVarF5 = n4.h.f(fIntBitsToFloat17, fIntBitsToFloat18, fIntBitsToFloat19, fIntBitsToFloat110, (((long) Float.floatToRawIntBits(f15)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f15))));
                    if (e0VarA == null) {
                        e0VarA = y1.j.a();
                    } else {
                        ((y1.h) e0VarA).c();
                    }
                    ob.a.i(e0VarA, dVarF5);
                    this.f11150i = dVarF5;
                    this.f11149h = e0VarA;
                }
            }
        } else {
            float fIntBitsToFloat111 = Float.intBitsToFloat((int) (this.k >> 32));
            float fIntBitsToFloat112 = Float.intBitsToFloat((int) (this.k & 4294967295L));
            float fIntBitsToFloat113 = Float.intBitsToFloat((int) (this.f11152l >> 32)) + Float.intBitsToFloat((int) (this.k >> 32));
            float fIntBitsToFloat114 = Float.intBitsToFloat((int) (this.f11152l & 4294967295L)) + Float.intBitsToFloat((int) (this.k & 4294967295L));
            float f16 = this.f11151j;
            x1.d dVarF6 = n4.h.f(fIntBitsToFloat111, fIntBitsToFloat112, fIntBitsToFloat113, fIntBitsToFloat114, (((long) Float.floatToRawIntBits(f16)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f16))));
            if (e0VarA == null) {
                e0VarA = y1.j.a();
            } else {
                ((y1.h) e0VarA).c();
            }
            ob.a.i(e0VarA, dVarF6);
            this.f11150i = dVarF6;
            this.f11149h = e0VarA;
        }
        oVar.j(e0VarA);
    }

    public final Outline b() {
        e();
        if (this.f11153m && this.f11142a) {
            return this.f11143b;
        }
        return null;
    }

    public final boolean c(long j5) {
        y1.h0 h0Var;
        if (this.f11153m && (h0Var = this.f11144c) != null) {
            return j0.q(h0Var, Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)));
        }
        return true;
    }

    public final boolean d(y1.h0 h0Var, float f10, boolean z10, float f11, long j5) {
        this.f11143b.setAlpha(f10);
        boolean zA = i9.l.a(this.f11144c, h0Var);
        boolean z11 = !zA;
        if (!zA) {
            this.f11144c = h0Var;
            this.f11147f = true;
        }
        this.f11152l = j5;
        boolean z12 = h0Var != null && (z10 || f11 > 0.0f);
        if (this.f11153m != z12) {
            this.f11153m = z12;
            this.f11147f = true;
        }
        return z11;
    }

    public final void e() {
        if (this.f11147f) {
            this.k = 0L;
            this.f11151j = 0.0f;
            this.f11146e = null;
            this.f11147f = false;
            this.f11148g = false;
            y1.h0 h0Var = this.f11144c;
            Outline outline = this.f11143b;
            if (h0Var == null || !this.f11153m || Float.intBitsToFloat((int) (this.f11152l >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.f11152l & 4294967295L)) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f11142a = true;
            if (h0Var instanceof y1.c0) {
                x1.c cVar = ((y1.c0) h0Var).f14880e;
                float f10 = cVar.f14523a;
                float f11 = cVar.f14524b;
                this.k = (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
                float f12 = cVar.f14525c;
                float f13 = cVar.f14526d;
                this.f11152l = (4294967295L & ((long) Float.floatToRawIntBits(f13 - f11))) | (Float.floatToRawIntBits(f12 - f10) << 32);
                outline.setRect(Math.round(f10), Math.round(f11), Math.round(f12), Math.round(f13));
                return;
            }
            if (!(h0Var instanceof y1.d0)) {
                if (!(h0Var instanceof y1.b0)) {
                    throw new cc.s();
                }
                f(((y1.b0) h0Var).f14878e);
                return;
            }
            x1.d dVar = ((y1.d0) h0Var).f14882e;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.f14531e >> 32));
            float f14 = dVar.f14527a;
            float f15 = dVar.f14528b;
            this.k = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L);
            float fB = dVar.b();
            this.f11152l = (((long) Float.floatToRawIntBits(dVar.a())) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
            if (n4.h.P(dVar)) {
                this.f11143b.setRoundRect(Math.round(f14), Math.round(f15), Math.round(dVar.f14529c), Math.round(dVar.f14530d), fIntBitsToFloat);
                this.f11151j = fIntBitsToFloat;
                return;
            }
            y1.h hVarA = this.f11145d;
            if (hVarA == null) {
                hVarA = y1.j.a();
                this.f11145d = hVarA;
            }
            hVarA.c();
            ob.a.i(hVarA, dVar);
            f(hVarA);
        }
    }

    public final void f(y1.e0 e0Var) {
        int i7 = Build.VERSION.SDK_INT;
        Outline outline = this.f11143b;
        if (i7 > 28 || ((y1.h) e0Var).f14895a.isConvex()) {
            if (i7 >= 30) {
                b2.f11193a.a(outline, e0Var);
            } else {
                if (!(e0Var instanceof y1.h)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outline.setConvexPath(((y1.h) e0Var).f14895a);
            }
            this.f11148g = !outline.canClip();
        } else {
            this.f11142a = false;
            outline.setEmpty();
            this.f11148g = true;
        }
        this.f11146e = e0Var;
    }
}

package x;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3.c f14371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14372b = 9205357640488583168L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f14373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1.k1 f14374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f14377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f14378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q2.m f14379i;

    public h(Context context, n3.c cVar, long j5, d0.h0 h0Var) {
        this.f14371a = cVar;
        b0 b0Var = new b0(context, y1.h0.C(j5));
        this.f14373c = b0Var;
        this.f14374d = new f1.k1(t8.z.f12851a, f1.w0.f5184c);
        this.f14375e = true;
        this.f14377g = 0L;
        this.f14378h = -1L;
        k2.m0 m0VarA = k2.h0.a(new q7.g(4, this));
        this.f14379i = Build.VERSION.SDK_INT >= 31 ? new f0(m0VarA, this, b0Var) : new f0(m0VarA, this, b0Var, h0Var);
    }

    public final void a() {
        boolean z10;
        b0 b0Var = this.f14373c;
        EdgeEffect edgeEffect = b0Var.f14317d;
        boolean z11 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = !edgeEffect.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = b0Var.f14318e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 = !edgeEffect2.isFinished() || z10;
        }
        EdgeEffect edgeEffect3 = b0Var.f14319f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 = !edgeEffect3.isFinished() || z10;
        }
        EdgeEffect edgeEffect4 = b0Var.f14320g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z10) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0138, code lost:
    
        if (r4 == r6) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r19, z.s1 r21, a9.c r22) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.h.b(long, z.s1, a9.c):java.lang.Object");
    }

    public final long c() {
        long jX = this.f14372b;
        if ((9223372034707292159L & jX) == 9205357640488583168L) {
            jX = n3.l.x(this.f14377g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jX >> 32)) / Float.intBitsToFloat((int) (this.f14377g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jX & 4294967295L)) / Float.intBitsToFloat((int) (this.f14377g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.f14375e) {
            this.f14374d.setValue(t8.z.f12851a);
        }
    }

    public final float e(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i7 = (int) (j5 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i7) / Float.intBitsToFloat((int) (this.f14377g & 4294967295L));
        EdgeEffect edgeEffectB = this.f14373c.b();
        float fC = -fIntBitsToFloat2;
        float f10 = 1 - fIntBitsToFloat;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            fC = k.c(edgeEffectB, fC, f10);
        } else {
            edgeEffectB.onPull(fC, f10);
        }
        return (i10 >= 31 ? k.b(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f14377g)) * (-fC) : Float.intBitsToFloat(i7);
    }

    public final float f(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i7 = (int) (j5 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i7) / Float.intBitsToFloat((int) (this.f14377g >> 32));
        EdgeEffect edgeEffectC = this.f14373c.c();
        float f10 = 1 - fIntBitsToFloat;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            fIntBitsToFloat2 = k.c(edgeEffectC, fIntBitsToFloat2, f10);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f10);
        }
        return (i10 >= 31 ? k.b(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f14377g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i7);
    }

    public final float g(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i7 = (int) (j5 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i7) / Float.intBitsToFloat((int) (this.f14377g >> 32));
        EdgeEffect edgeEffectD = this.f14373c.d();
        float fC = -fIntBitsToFloat2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            fC = k.c(edgeEffectD, fC, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fC, fIntBitsToFloat);
        }
        return (i10 >= 31 ? k.b(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f14377g >> 32)) * (-fC) : Float.intBitsToFloat(i7);
    }

    public final float h(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i7 = (int) (j5 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i7) / Float.intBitsToFloat((int) (this.f14377g & 4294967295L));
        EdgeEffect edgeEffectE = this.f14373c.e();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            fIntBitsToFloat2 = k.c(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i10 >= 31 ? k.b(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f14377g)) * fIntBitsToFloat2 : Float.intBitsToFloat(i7);
    }

    public final void i(long j5) {
        boolean zA = x1.e.a(this.f14377g, 0L);
        boolean zA2 = x1.e.a(j5, this.f14377g);
        this.f14377g = j5;
        if (!zA2) {
            int iM = k9.a.M(Float.intBitsToFloat((int) (j5 >> 32)));
            long jM = (((long) k9.a.M(Float.intBitsToFloat((int) (j5 & 4294967295L)))) & 4294967295L) | (((long) iM) << 32);
            b0 b0Var = this.f14373c;
            b0Var.f14316c = jM;
            EdgeEffect edgeEffect = b0Var.f14317d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jM >> 32), (int) (jM & 4294967295L));
            }
            EdgeEffect edgeEffect2 = b0Var.f14318e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jM >> 32), (int) (jM & 4294967295L));
            }
            EdgeEffect edgeEffect3 = b0Var.f14319f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jM & 4294967295L), (int) (jM >> 32));
            }
            EdgeEffect edgeEffect4 = b0Var.f14320g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jM & 4294967295L), (int) (jM >> 32));
            }
            EdgeEffect edgeEffect5 = b0Var.f14321h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jM >> 32), (int) (jM & 4294967295L));
            }
            EdgeEffect edgeEffect6 = b0Var.f14322i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jM >> 32), (int) (jM & 4294967295L));
            }
            EdgeEffect edgeEffect7 = b0Var.f14323j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jM & 4294967295L), (int) (jM >> 32));
            }
            EdgeEffect edgeEffect8 = b0Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jM), (int) (jM >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}

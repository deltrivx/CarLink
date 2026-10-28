package z;

import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1 f15482a;

    public r1(t1 t1Var) {
        this.f15482a = t1Var;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x021a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0229  */
    /* JADX WARN: Code duplicated, block: B:112:0x022e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0236  */
    /* JADX WARN: Code duplicated, block: B:115:0x023a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0246  */
    /* JADX WARN: Code duplicated, block: B:120:0x024b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0253  */
    /* JADX WARN: Code duplicated, block: B:123:0x0257  */
    /* JADX WARN: Code duplicated, block: B:125:0x025a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0260  */
    /* JADX WARN: Code duplicated, block: B:131:0x0268  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:152:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:158:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:165:0x0302  */
    /* JADX WARN: Code duplicated, block: B:167:0x0313  */
    /* JADX WARN: Code duplicated, block: B:168:0x0317  */
    /* JADX WARN: Code duplicated, block: B:174:0x0327  */
    /* JADX WARN: Code duplicated, block: B:181:0x0344  */
    /* JADX WARN: Code duplicated, block: B:183:0x0355  */
    /* JADX WARN: Code duplicated, block: B:184:0x0359  */
    /* JADX WARN: Code duplicated, block: B:190:0x0369  */
    /* JADX WARN: Code duplicated, block: B:195:0x0371  */
    /* JADX WARN: Code duplicated, block: B:198:0x0375  */
    /* JADX WARN: Code duplicated, block: B:61:0x0120  */
    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    /* JADX WARN: Code duplicated, block: B:72:0x0159 A[PHI: r7 r20
      0x0159: PHI (r7v22 float) = (r7v20 float), (r7v26 float) binds: [B:81:0x0189, B:70:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r20v1 char) = (r20v0 char), (r20v2 char) binds: [B:81:0x0189, B:70:0x0152] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x015b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:83:0x0190  */
    /* JADX WARN: Code duplicated, block: B:86:0x01aa  */
    public final long a(int i7, long j5) {
        long j10;
        float fIntBitsToFloat;
        int i10;
        char c10;
        float fIntBitsToFloat2;
        float fG;
        long jFloatToRawIntBits;
        long jG;
        long jG2;
        boolean z10;
        boolean zF;
        boolean z11;
        EdgeEffect edgeEffectB;
        float fIntBitsToFloat3;
        x.e0 e0Var;
        float f10;
        EdgeEffect edgeEffectE;
        float fIntBitsToFloat4;
        x.e0 e0Var2;
        float f11;
        EdgeEffect edgeEffectD;
        float fIntBitsToFloat5;
        x.e0 e0Var3;
        float f12;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        t1 t1Var = this.f15482a;
        t1Var.f15526j = i7;
        x.h hVar = t1Var.f15518b;
        if (hVar == null || !(t1Var.f15517a.d() || t1Var.f15517a.b())) {
            return t1Var.c(t1Var.k, j5, i7);
        }
        int i13 = t1Var.f15526j;
        t1 t1Var2 = (t1) t1Var.f15528m.f12533b;
        x.b0 b0Var = hVar.f14373c;
        if (x1.e.e(hVar.f14377g)) {
            return new x1.b(t1Var2.c(t1Var2.k, j5, t1Var2.f15526j)).f14521a;
        }
        if (!hVar.f14376f) {
            if (x.b0.g(b0Var.f14319f)) {
                hVar.f(0L);
            }
            if (x.b0.g(b0Var.f14320g)) {
                hVar.g(0L);
            }
            if (x.b0.g(b0Var.f14317d)) {
                hVar.h(0L);
            }
            if (x.b0.g(b0Var.f14318e)) {
                hVar.e(0L);
            }
            hVar.f14376f = true;
        }
        int i14 = x.j.f14394a;
        float f13 = i13 == 2 ? 4.0f : 1.0f;
        long jI = x1.b.i(f13, j5);
        int i15 = (int) (j5 & 4294967295L);
        if (Float.intBitsToFloat(i15) != 0.0f) {
            if (!x.b0.g(b0Var.f14317d) || Float.intBitsToFloat(i15) >= 0.0f) {
                j10 = 4294967295L;
                if (x.b0.g(b0Var.f14318e) && Float.intBitsToFloat(i15) > 0.0f) {
                    float fE = hVar.e(jI);
                    if (!x.b0.g(b0Var.f14318e)) {
                        b0Var.b().finish();
                    }
                    f13 = f13;
                    fIntBitsToFloat = fE == Float.intBitsToFloat((int) (jI & 4294967295L)) ? Float.intBitsToFloat(i15) : fE / f13;
                }
            } else {
                float fH = hVar.h(jI);
                j10 = 4294967295L;
                if (!x.b0.g(b0Var.f14317d)) {
                    b0Var.e().finish();
                }
                fIntBitsToFloat = fH == Float.intBitsToFloat((int) (jI & 4294967295L)) ? Float.intBitsToFloat(i15) : fH / f13;
                f13 = f13;
            }
            float f14 = fIntBitsToFloat;
            i10 = (int) (j5 >> 32);
            if (Float.intBitsToFloat(i10) == 0.0f) {
                fIntBitsToFloat2 = 0.0f;
                c10 = ' ';
            } else if (x.b0.g(b0Var.f14319f) || Float.intBitsToFloat(i10) >= 0.0f) {
                c10 = ' ';
                if (x.b0.g(b0Var.f14320g) || Float.intBitsToFloat(i10) <= 0.0f) {
                    fIntBitsToFloat2 = 0.0f;
                } else {
                    fG = hVar.g(jI);
                    if (!x.b0.g(b0Var.f14320g)) {
                        b0Var.d().finish();
                    }
                    if (fG == Float.intBitsToFloat((int) (jI >> 32))) {
                        fIntBitsToFloat2 = Float.intBitsToFloat(i10);
                    } else {
                        fIntBitsToFloat2 = fG / f13;
                    }
                }
            } else {
                fG = hVar.f(jI);
                c10 = ' ';
                if (!x.b0.g(b0Var.f14319f)) {
                    b0Var.c().finish();
                }
                if (fG == Float.intBitsToFloat((int) (jI >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i10);
                } else {
                    fIntBitsToFloat2 = fG / f13;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) & j10) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c10);
            if (!x1.b.b(jFloatToRawIntBits, 0L)) {
                hVar.d();
            }
            jG = x1.b.g(j5, jFloatToRawIntBits);
            long j11 = new x1.b(t1Var2.c(t1Var2.k, jG, t1Var2.f15526j)).f14521a;
            jG2 = x1.b.g(jG, j11);
            if ((Float.intBitsToFloat((int) (jG >> c10)) == 0.0f || Float.intBitsToFloat((int) (jG & j10)) != 0.0f) && ((Float.intBitsToFloat((int) (j11 >> c10)) != 0.0f || Float.intBitsToFloat((int) (j11 & j10)) != 0.0f) && (x.b0.g(b0Var.f14319f) || x.b0.g(b0Var.f14317d) || x.b0.g(b0Var.f14320g) || x.b0.g(b0Var.f14318e)))) {
                hVar.a();
            }
            if (i13 == 1) {
                i11 = (int) (jG2 >> c10);
                if (Float.intBitsToFloat(i11) > 0.5f) {
                    hVar.f(jG2);
                } else {
                    if (Float.intBitsToFloat(i11) < -0.5f) {
                        hVar.g(jG2);
                    } else {
                        z12 = false;
                    }
                    i12 = (int) (jG2 & j10);
                    if (Float.intBitsToFloat(i12) > 0.5f) {
                        hVar.h(jG2);
                    } else {
                        if (Float.intBitsToFloat(i12) < -0.5f) {
                            hVar.e(jG2);
                        } else {
                            z13 = false;
                        }
                        if (!z12 || z13) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    z13 = true;
                    if (z12) {
                    }
                    z10 = true;
                }
                z12 = true;
                i12 = (int) (jG2 & j10);
                if (Float.intBitsToFloat(i12) > 0.5f) {
                    hVar.h(jG2);
                } else {
                    if (Float.intBitsToFloat(i12) < -0.5f) {
                        hVar.e(jG2);
                    } else {
                        z13 = false;
                    }
                    if (z12) {
                    }
                    z10 = true;
                }
                z13 = true;
                if (z12) {
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (!x1.b.b(jG, 0L)) {
                if (x.b0.f(b0Var.f14319f) || Float.intBitsToFloat(i10) >= 0.0f) {
                    zF = false;
                } else {
                    EdgeEffect edgeEffectC = b0Var.c();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i10);
                    if (edgeEffectC instanceof x.e0) {
                        x.e0 e0Var4 = (x.e0) edgeEffectC;
                        float f15 = e0Var4.f14348b + fIntBitsToFloat6;
                        e0Var4.f14348b = f15;
                        if (Math.abs(f15) > e0Var4.f14347a) {
                            e0Var4.onRelease();
                        }
                    } else {
                        edgeEffectC.onRelease();
                    }
                    zF = x.b0.f(b0Var.f14319f);
                }
                if (x.b0.f(b0Var.f14320g) && Float.intBitsToFloat(i10) > 0.0f) {
                    edgeEffectD = b0Var.d();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i10);
                    if (edgeEffectD instanceof x.e0) {
                        e0Var3 = (x.e0) edgeEffectD;
                        f12 = e0Var3.f14348b + fIntBitsToFloat5;
                        e0Var3.f14348b = f12;
                        if (Math.abs(f12) > e0Var3.f14347a) {
                            e0Var3.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    if (!zF || x.b0.f(b0Var.f14320g)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (x.b0.f(b0Var.f14317d) && Float.intBitsToFloat(i15) < 0.0f) {
                    edgeEffectE = b0Var.e();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i15);
                    if (edgeEffectE instanceof x.e0) {
                        e0Var2 = (x.e0) edgeEffectE;
                        f11 = e0Var2.f14348b + fIntBitsToFloat4;
                        e0Var2.f14348b = f11;
                        if (Math.abs(f11) > e0Var2.f14347a) {
                            e0Var2.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    if (!zF || x.b0.f(b0Var.f14317d)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (x.b0.f(b0Var.f14318e) && Float.intBitsToFloat(i15) > 0.0f) {
                    edgeEffectB = b0Var.b();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i15);
                    if (edgeEffectB instanceof x.e0) {
                        e0Var = (x.e0) edgeEffectB;
                        f10 = e0Var.f14348b + fIntBitsToFloat3;
                        e0Var.f14348b = f10;
                        if (Math.abs(f10) > e0Var.f14347a) {
                            e0Var.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    if (!zF || x.b0.f(b0Var.f14318e)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (!zF || z10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z10 = z11;
            }
            if (z10) {
                hVar.d();
            }
            return x1.b.h(jFloatToRawIntBits, j11);
        }
        j10 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        float f16 = fIntBitsToFloat;
        i10 = (int) (j5 >> 32);
        if (Float.intBitsToFloat(i10) == 0.0f) {
            fIntBitsToFloat2 = 0.0f;
            c10 = ' ';
        } else if (x.b0.g(b0Var.f14319f)) {
            c10 = ' ';
            if (x.b0.g(b0Var.f14320g)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else {
            c10 = ' ';
            if (x.b0.g(b0Var.f14320g)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f16)) & j10) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c10);
        if (!x1.b.b(jFloatToRawIntBits, 0L)) {
            hVar.d();
        }
        jG = x1.b.g(j5, jFloatToRawIntBits);
        long j12 = new x1.b(t1Var2.c(t1Var2.k, jG, t1Var2.f15526j)).f14521a;
        jG2 = x1.b.g(jG, j12);
        if (Float.intBitsToFloat((int) (jG >> c10)) == 0.0f) {
            hVar.a();
        } else {
            hVar.a();
        }
        if (i13 == 1) {
            i11 = (int) (jG2 >> c10);
            if (Float.intBitsToFloat(i11) > 0.5f) {
                hVar.f(jG2);
            } else {
                if (Float.intBitsToFloat(i11) < -0.5f) {
                    hVar.g(jG2);
                } else {
                    z12 = false;
                }
                i12 = (int) (jG2 & j10);
                if (Float.intBitsToFloat(i12) > 0.5f) {
                    hVar.h(jG2);
                } else {
                    if (Float.intBitsToFloat(i12) < -0.5f) {
                        hVar.e(jG2);
                    } else {
                        z13 = false;
                    }
                    if (z12) {
                    }
                    z10 = true;
                }
                z13 = true;
                if (z12) {
                }
                z10 = true;
            }
            z12 = true;
            i12 = (int) (jG2 & j10);
            if (Float.intBitsToFloat(i12) > 0.5f) {
                hVar.h(jG2);
            } else {
                if (Float.intBitsToFloat(i12) < -0.5f) {
                    hVar.e(jG2);
                } else {
                    z13 = false;
                }
                if (z12) {
                }
                z10 = true;
            }
            z13 = true;
            if (z12) {
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (!x1.b.b(jG, 0L)) {
            if (x.b0.f(b0Var.f14319f)) {
                zF = false;
            } else {
                zF = false;
            }
            if (x.b0.f(b0Var.f14320g)) {
                edgeEffectD = b0Var.d();
                fIntBitsToFloat5 = Float.intBitsToFloat(i10);
                if (edgeEffectD instanceof x.e0) {
                    e0Var3 = (x.e0) edgeEffectD;
                    f12 = e0Var3.f14348b + fIntBitsToFloat5;
                    e0Var3.f14348b = f12;
                    if (Math.abs(f12) > e0Var3.f14347a) {
                        e0Var3.onRelease();
                    }
                } else {
                    edgeEffectD.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (x.b0.f(b0Var.f14317d)) {
                edgeEffectE = b0Var.e();
                fIntBitsToFloat4 = Float.intBitsToFloat(i15);
                if (edgeEffectE instanceof x.e0) {
                    e0Var2 = (x.e0) edgeEffectE;
                    f11 = e0Var2.f14348b + fIntBitsToFloat4;
                    e0Var2.f14348b = f11;
                    if (Math.abs(f11) > e0Var2.f14347a) {
                        e0Var2.onRelease();
                    }
                } else {
                    edgeEffectE.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (x.b0.f(b0Var.f14318e)) {
                edgeEffectB = b0Var.b();
                fIntBitsToFloat3 = Float.intBitsToFloat(i15);
                if (edgeEffectB instanceof x.e0) {
                    e0Var = (x.e0) edgeEffectB;
                    f10 = e0Var.f14348b + fIntBitsToFloat3;
                    e0Var.f14348b = f10;
                    if (Math.abs(f10) > e0Var.f14347a) {
                        e0Var.onRelease();
                    }
                } else {
                    edgeEffectB.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (zF) {
                z11 = true;
            } else {
                z11 = true;
            }
            z10 = z11;
        }
        if (z10) {
            hVar.d();
        }
        return x1.b.h(jFloatToRawIntBits, j12);
    }
}

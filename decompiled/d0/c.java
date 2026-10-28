package d0;

import f1.q1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f3543a = new b(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f3544b = new b(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p2.f f3545c = new p2.f(new b3.i0(7));

    public static final void a(f1.s sVar, r1.p pVar) {
        l lVar = l.f3583c;
        long j5 = sVar.T;
        int i7 = (int) (j5 ^ (j5 >>> 32));
        r1.p pVarC = r1.a.c(sVar, pVar);
        q1 q1VarL = sVar.l();
        q2.j.f10719d0.getClass();
        q2.a0 a0Var = q2.i.f10705b;
        a2.b bVar = sVar.f5106a;
        sVar.a0();
        if (sVar.S) {
            sVar.k(a0Var);
        } else {
            sVar.k0();
        }
        f1.b.w(sVar, q2.i.f10708e, lVar);
        f1.b.w(sVar, q2.i.f10707d, q1VarL);
        f1.b.w(sVar, q2.i.f10706c, pVarC);
        q2.h hVar = q2.i.f10709f;
        if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i7))) {
            ob.a.w(i7, sVar, i7, hVar);
        }
        sVar.p(true);
    }

    public static final k0 b(o2.l0 l0Var) {
        Object objW = l0Var.w();
        if (objW instanceof k0) {
            return (k0) objW;
        }
        return null;
    }

    public static final float c(k0 k0Var) {
        if (k0Var != null) {
            return k0Var.f3580a;
        }
        return 0.0f;
    }

    public static o2.n0 d(j0 j0Var, int i7, int i10, int i11, int i12, int i13, o2.o0 o0Var, List list, o2.v0[] v0VarArr, int i14) {
        int i15;
        float f10;
        int i16;
        int i17;
        int i18;
        List list2 = list;
        long j5 = i13;
        int[] iArr = new int[i14];
        int iMax = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int iMin = 0;
        float f11 = 0.0f;
        while (i19 < i14) {
            o2.l0 l0Var = (o2.l0) list2.get(i19);
            float fC = c(b(l0Var));
            if (fC > 0.0f) {
                f11 += fC;
                i20++;
                i16 = i19;
            } else {
                int i22 = i11 - i21;
                o2.v0 v0VarU = v0VarArr[i19];
                if (v0VarU == null) {
                    if (i11 == Integer.MAX_VALUE) {
                        i16 = i19;
                        i17 = i20;
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i16 = i19;
                        i17 = i20;
                        i18 = i22 < 0 ? 0 : i22;
                    }
                    v0VarU = l0Var.u(j0Var.d(0, i18, i12, false));
                } else {
                    i16 = i19;
                    i17 = i20;
                }
                o2.v0 v0Var = v0VarU;
                int iG = j0Var.g(v0Var);
                int iB = j0Var.b(v0Var);
                iArr[i16] = iG;
                int i23 = i22 - iG;
                if (i23 < 0) {
                    i23 = 0;
                }
                iMin = Math.min(i13, i23);
                i21 += iG + iMin;
                iMax = Math.max(iMax, iB);
                v0VarArr[i16] = v0Var;
                i20 = i17;
            }
            i19 = i16 + 1;
            j5 = j5;
        }
        long j10 = j5;
        int i24 = i20;
        if (i24 == 0) {
            i21 -= iMin;
            i15 = 0;
        } else {
            long j11 = ((long) (i24 - 1)) * j10;
            long jRound = ((long) ((i11 != Integer.MAX_VALUE ? i11 : i7) - i21)) - j11;
            if (jRound < 0) {
                jRound = 0;
            }
            float f12 = jRound / f11;
            for (int i25 = 0; i25 < i14; i25++) {
                jRound -= (long) Math.round(c(b((o2.l0) list2.get(i25))) * f12);
            }
            int i26 = iMax;
            int i27 = 0;
            int i28 = 0;
            while (i27 < i14) {
                if (v0VarArr[i27] == null) {
                    o2.l0 l0Var2 = (o2.l0) list2.get(i27);
                    k0 k0VarB = b(l0Var2);
                    float fC2 = c(k0VarB);
                    if (fC2 <= 0.0f) {
                        e0.a.b("All weights <= 0 should have placeables");
                    }
                    f10 = f12;
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = Math.max(0, Math.round(fC2 * f10) + iSignum);
                    o2.v0 v0VarU2 = l0Var2.u(j0Var.d((!(k0VarB != null ? k0VarB.f3581b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i12, true));
                    int iG2 = j0Var.g(v0VarU2);
                    int iB2 = j0Var.b(v0VarU2);
                    iArr[i27] = iG2;
                    i28 += iG2;
                    int iMax3 = Math.max(i26, iB2);
                    v0VarArr[i27] = v0VarU2;
                    i26 = iMax3;
                } else {
                    f10 = f12;
                }
                i27++;
                list2 = list;
                f12 = f10;
            }
            i15 = (int) (((long) i28) + j11);
            int i29 = i11 - i21;
            if (i15 < 0) {
                i15 = 0;
            }
            if (i15 > i29) {
                i15 = i29;
            }
            iMax = i26;
        }
        int i30 = i15 + i21;
        if (i30 < 0) {
            i30 = 0;
        }
        int iMax4 = Math.max(i30, i7);
        int iMax5 = Math.max(iMax, Math.max(i10, 0));
        int[] iArr2 = new int[i14];
        j0Var.i(iMax4, o0Var, iArr, iArr2);
        return j0Var.e(v0VarArr, o0Var, iArr2, iMax4, iMax5);
    }

    public static final b0 e(x3.b bVar) {
        return new b0(bVar.f14563a, bVar.f14564b, bVar.f14565c, bVar.f14566d);
    }
}

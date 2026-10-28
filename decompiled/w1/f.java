package w1;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import i9.x;
import q2.d1;
import q2.h0;
import q2.h1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f14035a = new int[2];

    public static final boolean A(int i7, q3.e eVar, s sVar, x1.c cVar) {
        s sVarH;
        h1.e eVar2 = new h1.e(new s[16]);
        if (!sVar.f11117a.f11129n) {
            n2.a.b("visitChildren called on an unattached node");
        }
        h1.e eVar3 = new h1.e(new r1.o[16]);
        r1.o oVar = sVar.f11117a;
        r1.o oVar2 = oVar.f11122f;
        if (oVar2 == null) {
            q2.f.b(eVar3, oVar);
        } else {
            eVar3.b(oVar2);
        }
        while (true) {
            int i10 = eVar3.f6423c;
            if (i10 == 0) {
                break;
            }
            r1.o oVarF = (r1.o) eVar3.l(i10 - 1);
            if ((oVarF.f11120d & 1024) == 0) {
                q2.f.b(eVar3, oVarF);
            } else {
                while (oVarF != null) {
                    if ((oVarF.f11119c & 1024) != 0) {
                        h1.e eVar4 = null;
                        while (oVarF != null) {
                            if (oVarF instanceof s) {
                                s sVar2 = (s) oVarF;
                                if (sVar2.f11129n) {
                                    eVar2.b(sVar2);
                                }
                            } else if ((oVarF.f11119c & 1024) != 0 && (oVarF instanceof q2.m)) {
                                int i11 = 0;
                                for (r1.o oVar3 = ((q2.m) oVarF).f10746p; oVar3 != null; oVar3 = oVar3.f11122f) {
                                    if ((oVar3.f11119c & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            oVarF = oVar3;
                                        } else {
                                            if (eVar4 == null) {
                                                eVar4 = new h1.e(new r1.o[16]);
                                            }
                                            if (oVarF != null) {
                                                eVar4.b(oVarF);
                                                oVarF = null;
                                            }
                                            eVar4.b(oVar3);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            oVarF = q2.f.f(eVar4);
                        }
                        break;
                    }
                    oVarF = oVarF.f11122f;
                }
            }
        }
        while (eVar2.f6423c != 0 && (sVarH = h(eVar2, cVar, i7)) != null) {
            if (sVarH.B0().f14054a) {
                return ((Boolean) eVar.invoke(sVarH)).booleanValue();
            }
            if (l(i7, eVar, sVarH, cVar)) {
                return true;
            }
            eVar2.k(sVarH);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a  */
    /* JADX WARN: Code duplicated, block: B:129:0x019a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0138 A[ADDED_TO_REGION, LOOP:6: B:92:0x0138->B:120:0x0185, LOOP_START, PHI: r13
      0x0138: PHI (r13v14 r1.o) = (r13v9 r1.o), (r13v15 r1.o) binds: [B:91:0x0136, B:120:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0140  */
    /* JADX WARN: Code duplicated, block: B:97:0x0144  */
    public static final boolean B(s sVar, s sVar2, int i7, q3.e eVar) {
        r1.o oVar;
        r1.o oVar2;
        h0 h0VarV;
        d1 d1Var;
        r1.o oVarF;
        h1.e eVar2;
        if (sVar.C0() != r.f14070b) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        Object[] objArr = new s[16];
        if (!sVar.f11117a.f11129n) {
            n2.a.b("visitChildren called on an unattached node");
        }
        h1.e eVar3 = new h1.e(new r1.o[16]);
        r1.o oVar3 = sVar.f11117a;
        r1.o oVar4 = oVar3.f11122f;
        if (oVar4 == null) {
            q2.f.b(eVar3, oVar3);
        } else {
            eVar3.b(oVar4);
        }
        int i10 = 0;
        while (true) {
            int i11 = eVar3.f6423c;
            oVar = null;
            if (i11 == 0) {
                break;
            }
            r1.o oVarF2 = (r1.o) eVar3.l(i11 - 1);
            if ((oVarF2.f11120d & 1024) == 0) {
                q2.f.b(eVar3, oVarF2);
            } else {
                while (oVarF2 != null) {
                    if ((oVarF2.f11119c & 1024) != 0) {
                        h1.e eVar4 = null;
                        while (oVarF2 != null) {
                            if (oVarF2 instanceof s) {
                                s sVar3 = (s) oVarF2;
                                int i12 = i10 + 1;
                                if (objArr.length < i12) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i12, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i10] = sVar3;
                                i10 = i12;
                            } else if ((oVarF2.f11119c & 1024) != 0 && (oVarF2 instanceof q2.m)) {
                                int i13 = 0;
                                for (r1.o oVar5 = ((q2.m) oVarF2).f10746p; oVar5 != null; oVar5 = oVar5.f11122f) {
                                    if ((oVar5.f11119c & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            oVarF2 = oVar5;
                                        } else {
                                            if (eVar4 == null) {
                                                eVar4 = new h1.e(new r1.o[16]);
                                            }
                                            if (oVarF2 != null) {
                                                eVar4.b(oVarF2);
                                                oVarF2 = null;
                                            }
                                            eVar4.b(oVar5);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            oVarF2 = q2.f.f(eVar4);
                        }
                        break;
                    }
                    oVarF2 = oVarF2.f11122f;
                }
            }
        }
        u8.l.J0(objArr, t.f14078a, 0, i10);
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            n9.d dVarE0 = n3.r.e0(0, i10);
            int i14 = dVarE0.f8965a;
            int i15 = dVarE0.f8966b;
            if (i14 <= i15) {
                boolean z10 = false;
                while (true) {
                    if (z10) {
                        s sVar4 = (s) objArr[i15];
                        if (r(sVar4) && a(sVar4, eVar)) {
                            return true;
                        }
                    }
                    if (i9.l.a(objArr[i15], sVar2)) {
                        z10 = true;
                    }
                    if (i15 == i14) {
                        break;
                    }
                    i15--;
                }
            }
            if (i7 != 1) {
                if (!sVar.f11117a.f11129n) {
                    n2.a.b("visitAncestors called on an unattached node");
                }
                oVar2 = sVar.f11117a.f11121e;
                h0VarV = q2.f.v(sVar);
                loop5: while (h0VarV != null) {
                    if ((h0VarV.E.f10617f.f11120d & 1024) != 0) {
                        while (oVar2 != null) {
                            if ((oVar2.f11119c & 1024) != 0) {
                                oVarF = oVar2;
                                eVar2 = null;
                                while (oVarF != null) {
                                    if (oVarF instanceof s) {
                                        oVar = oVarF;
                                        break loop5;
                                    }
                                    if ((oVarF.f11119c & 1024) == 0) {
                                    }
                                    oVarF = q2.f.f(eVar2);
                                }
                            }
                            oVar2 = oVar2.f11121e;
                        }
                    }
                    h0VarV = h0VarV.v();
                    if (h0VarV != null) {
                    }
                }
                if (oVar != null) {
                    return ((Boolean) eVar.invoke(sVar)).booleanValue();
                }
            }
            return false;
        }
        n9.d dVarE1 = n3.r.e0(0, i10);
        int i16 = dVarE1.f8965a;
        int i17 = dVarE1.f8966b;
        if (i16 <= i17) {
            boolean z11 = false;
            while (true) {
                if (z11) {
                    s sVar5 = (s) objArr[i16];
                    if (r(sVar5) && k(sVar5, eVar)) {
                        return true;
                    }
                }
                if (i9.l.a(objArr[i16], sVar2)) {
                    z11 = true;
                }
                if (i16 == i17) {
                    break;
                }
                i16++;
            }
        }
        if (i7 != 1 && sVar.B0().f14054a) {
            if (!sVar.f11117a.f11129n) {
                n2.a.b("visitAncestors called on an unattached node");
            }
            oVar2 = sVar.f11117a.f11121e;
            h0VarV = q2.f.v(sVar);
            loop5: while (h0VarV != null) {
                if ((h0VarV.E.f10617f.f11120d & 1024) != 0) {
                    while (oVar2 != null) {
                        if ((oVar2.f11119c & 1024) != 0) {
                            oVarF = oVar2;
                            eVar2 = null;
                            while (oVarF != null) {
                                if (oVarF instanceof s) {
                                    oVar = oVarF;
                                    break loop5;
                                }
                                if ((oVarF.f11119c & 1024) == 0 && (oVarF instanceof q2.m)) {
                                    int i18 = 0;
                                    for (r1.o oVar6 = ((q2.m) oVarF).f10746p; oVar6 != null; oVar6 = oVar6.f11122f) {
                                        if ((oVar6.f11119c & 1024) != 0) {
                                            i18++;
                                            if (i18 == 1) {
                                                oVarF = oVar6;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new h1.e(new r1.o[16]);
                                                }
                                                if (oVarF != null) {
                                                    eVar2.b(oVarF);
                                                    oVarF = null;
                                                }
                                                eVar2.b(oVar6);
                                            }
                                        }
                                    }
                                    if (i18 == 1) {
                                    }
                                }
                                oVarF = q2.f.f(eVar2);
                            }
                        }
                        oVar2 = oVar2.f11121e;
                    }
                }
                h0VarV = h0VarV.v();
                oVar2 = (h0VarV != null || (d1Var = h0VarV.E) == null) ? null : d1Var.f10616e;
            }
            if (oVar != null) {
                return ((Boolean) eVar.invoke(sVar)).booleanValue();
            }
        }
        return false;
    }

    public static final Integer C(int i7) {
        if (i7 == 5) {
            return 33;
        }
        if (i7 == 6) {
            return 130;
        }
        if (i7 == 3) {
            return 17;
        }
        if (i7 == 4) {
            return 66;
        }
        if (i7 == 1) {
            return 2;
        }
        return i7 == 2 ? 1 : null;
    }

    public static final d D(int i7) {
        if (i7 == 1) {
            return new d(2);
        }
        if (i7 == 2) {
            return new d(1);
        }
        if (i7 == 17) {
            return new d(3);
        }
        if (i7 == 33) {
            return new d(5);
        }
        if (i7 == 66) {
            return new d(4);
        }
        if (i7 != 130) {
            return null;
        }
        return new d(6);
    }

    public static final Boolean E(int i7, q3.e eVar, s sVar, x1.c cVar) {
        int iOrdinal = sVar.C0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                s sVarN = n(sVar);
                if (sVarN == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = sVarN.C0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolE = E(i7, eVar, sVarN, cVar);
                        if (!i9.l.a(boolE, Boolean.FALSE)) {
                            return boolE;
                        }
                        if (cVar == null) {
                            if (sVarN.C0() != r.f14070b) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            s sVarG = g(sVarN);
                            if (sVarG == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            cVar = j(sVarG);
                        }
                        return Boolean.valueOf(l(i7, eVar, sVar, cVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new cc.s();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (cVar == null) {
                    cVar = j(sVarN);
                }
                return Boolean.valueOf(l(i7, eVar, sVar, cVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new cc.s();
                }
                if (sVar.B0().f14054a) {
                    return (Boolean) eVar.invoke(sVar);
                }
                return cVar == null ? Boolean.valueOf(i(sVar, i7, eVar)) : Boolean.valueOf(A(i7, eVar, sVar, cVar));
            }
        }
        return Boolean.valueOf(i(sVar, i7, eVar));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007c A[RETURN] */
    public static final boolean a(s sVar, q3.e eVar) {
        int iOrdinal = sVar.C0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                s sVarN = n(sVar);
                if (sVarN == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = sVarN.C0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (a(sVarN, eVar) || m(sVar, sVarN, 2, eVar) || (sVarN.B0().f14054a && ((Boolean) eVar.invoke(sVarN)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new cc.s();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                return m(sVar, sVarN, 2, eVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new cc.s();
                }
                if (!w(sVar, eVar)) {
                    if (!(sVar.B0().f14054a ? ((Boolean) eVar.invoke(sVar)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return w(sVar, eVar);
    }

    public static final boolean b(x1.c cVar, x1.c cVar2, x1.c cVar3, int i7) {
        float f10;
        float f11;
        boolean zC = c(i7, cVar3, cVar);
        float f12 = cVar3.f14524b;
        float f13 = cVar3.f14526d;
        float f14 = cVar3.f14523a;
        float f15 = cVar3.f14525c;
        float f16 = cVar.f14526d;
        float f17 = cVar.f14524b;
        float f18 = cVar.f14525c;
        float f19 = cVar.f14523a;
        if (zC || !c(i7, cVar2, cVar)) {
            return false;
        }
        if (i7 == 3) {
            if (f19 < f15) {
                return true;
            }
        } else if (i7 == 4) {
            if (f18 > f14) {
                return true;
            }
        } else if (i7 == 5) {
            if (f17 < f13) {
                return true;
            }
        } else {
            if (i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f16 > f12) {
                return true;
            }
        }
        if (i7 == 3 || i7 == 4) {
            return true;
        }
        if (i7 == 3) {
            f10 = f19 - cVar2.f14525c;
        } else if (i7 == 4) {
            f10 = cVar2.f14523a - f18;
        } else if (i7 == 5) {
            f10 = f17 - cVar2.f14526d;
        } else {
            if (i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = cVar2.f14524b - f16;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (i7 == 3) {
            f11 = f19 - f14;
        } else if (i7 == 4) {
            f11 = f15 - f18;
        } else if (i7 == 5) {
            f11 = f17 - f12;
        } else {
            if (i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f11 = f13 - f16;
        }
        if (f11 < 1.0f) {
            f11 = 1.0f;
        }
        return f10 < f11;
    }

    public static final boolean c(int i7, x1.c cVar, x1.c cVar2) {
        if (i7 == 3 || i7 == 4) {
            return cVar.f14526d > cVar2.f14524b && cVar.f14524b < cVar2.f14526d;
        }
        if (i7 == 5 || i7 == 6) {
            return cVar.f14525c > cVar2.f14523a && cVar.f14523a < cVar2.f14525c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final x1.c d(View view, r2.u uVar) {
        int[] iArr = f14035a;
        view.getLocationInWindow(iArr);
        int i7 = iArr[0];
        int i10 = iArr[1];
        uVar.getLocationInWindow(iArr);
        float f10 = i7 - iArr[0];
        float f11 = i10 - iArr[1];
        return new x1.c(f10, f11, view.getWidth() + f10, view.getHeight() + f11);
    }

    public static final boolean e(s sVar, boolean z10) {
        int iOrdinal = sVar.C0().ordinal();
        r rVar = r.f14072d;
        if (iOrdinal == 0) {
            ((j) ((r2.u) q2.f.w(sVar)).getFocusOwner()).g(null);
            sVar.A0(r.f14069a, rVar);
            return true;
        }
        if (iOrdinal == 1) {
            s sVarN = n(sVar);
            if (!(sVarN != null ? e(sVarN, z10) : true)) {
                return false;
            }
            sVar.A0(r.f14070b, rVar);
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            throw new cc.s();
        }
        if (z10) {
            ((j) ((r2.u) q2.f.w(sVar)).getFocusOwner()).g(null);
            sVar.A0(r.f14071c, rVar);
        }
        return z10;
    }

    public static final void f(s sVar, h1.e eVar) {
        if (!sVar.f11117a.f11129n) {
            n2.a.b("visitChildren called on an unattached node");
        }
        h1.e eVar2 = new h1.e(new r1.o[16]);
        r1.o oVar = sVar.f11117a;
        r1.o oVar2 = oVar.f11122f;
        if (oVar2 == null) {
            q2.f.b(eVar2, oVar);
        } else {
            eVar2.b(oVar2);
        }
        while (true) {
            int i7 = eVar2.f6423c;
            if (i7 == 0) {
                return;
            }
            r1.o oVarF = (r1.o) eVar2.l(i7 - 1);
            if ((oVarF.f11120d & 1024) == 0) {
                q2.f.b(eVar2, oVarF);
            } else {
                while (oVarF != null) {
                    if ((oVarF.f11119c & 1024) != 0) {
                        h1.e eVar3 = null;
                        while (oVarF != null) {
                            if (oVarF instanceof s) {
                                s sVar2 = (s) oVarF;
                                if (sVar2.f11129n && !q2.f.v(sVar2).P) {
                                    if (sVar2.B0().f14054a) {
                                        eVar.b(sVar2);
                                    } else {
                                        f(sVar2, eVar);
                                    }
                                }
                            } else if ((oVarF.f11119c & 1024) != 0 && (oVarF instanceof q2.m)) {
                                int i10 = 0;
                                for (r1.o oVar3 = ((q2.m) oVarF).f10746p; oVar3 != null; oVar3 = oVar3.f11122f) {
                                    if ((oVar3.f11119c & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            oVarF = oVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new h1.e(new r1.o[16]);
                                            }
                                            if (oVarF != null) {
                                                eVar3.b(oVarF);
                                                oVarF = null;
                                            }
                                            eVar3.b(oVar3);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            oVarF = q2.f.f(eVar3);
                        }
                        break;
                    }
                    oVarF = oVarF.f11122f;
                }
            }
        }
    }

    public static final s g(s sVar) {
        s sVar2 = ((j) ((r2.u) q2.f.w(sVar)).getFocusOwner()).f14049h;
        if (sVar2 == null || !sVar2.f11129n) {
            return null;
        }
        return sVar2;
    }

    public static final s h(h1.e eVar, x1.c cVar, int i7) {
        x1.c cVarH;
        if (i7 == 3) {
            cVarH = cVar.h((cVar.f14525c - cVar.f14523a) + 1, 0.0f);
        } else if (i7 == 4) {
            cVarH = cVar.h(-((cVar.f14525c - cVar.f14523a) + 1), 0.0f);
        } else if (i7 == 5) {
            cVarH = cVar.h(0.0f, (cVar.f14526d - cVar.f14524b) + 1);
        } else {
            if (i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            cVarH = cVar.h(0.0f, -((cVar.f14526d - cVar.f14524b) + 1));
        }
        Object[] objArr = eVar.f6421a;
        int i10 = eVar.f6423c;
        s sVar = null;
        for (int i11 = 0; i11 < i10; i11++) {
            s sVar2 = (s) objArr[i11];
            if (r(sVar2)) {
                x1.c cVarJ = j(sVar2);
                if (o(cVarJ, cVarH, cVar, i7)) {
                    sVar = sVar2;
                    cVarH = cVarJ;
                }
            }
        }
        return sVar;
    }

    public static final boolean i(s sVar, int i7, h9.k kVar) {
        x1.c cVar;
        h1.e eVar = new h1.e(new s[16]);
        f(sVar, eVar);
        int i10 = eVar.f6423c;
        if (i10 <= 1) {
            s sVar2 = (s) (i10 == 0 ? null : eVar.f6421a[0]);
            if (sVar2 != null) {
                return ((Boolean) kVar.invoke(sVar2)).booleanValue();
            }
        } else {
            if (i7 == 7) {
                i7 = 4;
            }
            if (i7 == 4 || i7 == 6) {
                x1.c cVarJ = j(sVar);
                float f10 = cVarJ.f14523a;
                float f11 = cVarJ.f14524b;
                cVar = new x1.c(f10, f11, f10, f11);
            } else {
                if (i7 != 3 && i7 != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                x1.c cVarJ2 = j(sVar);
                float f12 = cVarJ2.f14525c;
                float f13 = cVarJ2.f14526d;
                cVar = new x1.c(f12, f13, f12, f13);
            }
            s sVarH = h(eVar, cVar, i7);
            if (sVarH != null) {
                return ((Boolean) kVar.invoke(sVarH)).booleanValue();
            }
        }
        return false;
    }

    public static final x1.c j(s sVar) {
        h1 h1Var = sVar.f11124h;
        return h1Var != null ? o2.d1.g(h1Var).h(h1Var, false) : x1.c.f14522e;
    }

    public static final boolean k(s sVar, q3.e eVar) {
        int iOrdinal = sVar.C0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                s sVarN = n(sVar);
                if (sVarN != null) {
                    return k(sVarN, eVar) || m(sVar, sVarN, 1, eVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return sVar.B0().f14054a ? ((Boolean) eVar.invoke(sVar)).booleanValue() : x(sVar, eVar);
                }
                throw new cc.s();
            }
        }
        return x(sVar, eVar);
    }

    public static final boolean l(int i7, q3.e eVar, s sVar, x1.c cVar) {
        if (A(i7, eVar, sVar, cVar)) {
            return true;
        }
        Boolean bool = (Boolean) z(sVar, i7, new u(((j) ((r2.u) q2.f.w(sVar)).getFocusOwner()).f14049h, sVar, cVar, i7, eVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(s sVar, s sVar2, int i7, q3.e eVar) {
        if (B(sVar, sVar2, i7, eVar)) {
            return true;
        }
        Boolean bool = (Boolean) z(sVar, i7, new u(((j) ((r2.u) q2.f.w(sVar)).getFocusOwner()).f14049h, sVar, sVar2, i7, eVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final s n(s sVar) {
        boolean z10 = sVar.f11117a.f11129n;
        if (z10) {
            if (!z10) {
                n2.a.b("visitChildren called on an unattached node");
            }
            h1.e eVar = new h1.e(new r1.o[16]);
            r1.o oVar = sVar.f11117a;
            r1.o oVar2 = oVar.f11122f;
            if (oVar2 == null) {
                q2.f.b(eVar, oVar);
            } else {
                eVar.b(oVar2);
            }
            while (true) {
                int i7 = eVar.f6423c;
                if (i7 == 0) {
                    break;
                }
                r1.o oVarF = (r1.o) eVar.l(i7 - 1);
                if ((oVarF.f11120d & 1024) == 0) {
                    q2.f.b(eVar, oVarF);
                } else {
                    while (oVarF != null) {
                        if ((oVarF.f11119c & 1024) != 0) {
                            h1.e eVar2 = null;
                            while (oVarF != null) {
                                if (oVarF instanceof s) {
                                    s sVar2 = (s) oVarF;
                                    if (sVar2.f11117a.f11129n) {
                                        int iOrdinal = sVar2.C0().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return sVar2;
                                        }
                                        if (iOrdinal != 3) {
                                            throw new cc.s();
                                        }
                                    }
                                } else if ((oVarF.f11119c & 1024) != 0 && (oVarF instanceof q2.m)) {
                                    int i10 = 0;
                                    for (r1.o oVar3 = ((q2.m) oVarF).f10746p; oVar3 != null; oVar3 = oVar3.f11122f) {
                                        if ((oVar3.f11119c & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                oVarF = oVar3;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new h1.e(new r1.o[16]);
                                                }
                                                if (oVarF != null) {
                                                    eVar2.b(oVarF);
                                                    oVarF = null;
                                                }
                                                eVar2.b(oVar3);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                oVarF = q2.f.f(eVar2);
                            }
                            break;
                        }
                        oVarF = oVarF.f11122f;
                    }
                }
            }
        }
        return null;
    }

    public static final boolean o(x1.c cVar, x1.c cVar2, x1.c cVar3, int i7) {
        if (!p(i7, cVar, cVar3)) {
            return false;
        }
        if (p(i7, cVar2, cVar3) && !b(cVar3, cVar, cVar2, i7)) {
            return !b(cVar3, cVar2, cVar, i7) && q(i7, cVar3, cVar) < q(i7, cVar3, cVar2);
        }
        return true;
    }

    public static final boolean p(int i7, x1.c cVar, x1.c cVar2) {
        float f10 = cVar.f14524b;
        float f11 = cVar.f14526d;
        float f12 = cVar.f14523a;
        float f13 = cVar.f14525c;
        if (i7 == 3) {
            float f14 = cVar2.f14525c;
            float f15 = cVar2.f14523a;
            return (f14 > f13 || f15 >= f13) && f15 > f12;
        }
        if (i7 == 4) {
            float f16 = cVar2.f14523a;
            float f17 = cVar2.f14525c;
            return (f16 < f12 || f17 <= f12) && f17 < f13;
        }
        if (i7 == 5) {
            float f18 = cVar2.f14526d;
            float f19 = cVar2.f14524b;
            return (f18 > f11 || f19 >= f11) && f19 > f10;
        }
        if (i7 != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f20 = cVar2.f14524b;
        float f21 = cVar2.f14526d;
        return (f20 < f10 || f21 <= f10) && f21 < f11;
    }

    public static final long q(int i7, x1.c cVar, x1.c cVar2) {
        float f10;
        float f11;
        float f12 = cVar2.f14524b;
        float f13 = cVar2.f14526d;
        float f14 = cVar2.f14523a;
        float f15 = cVar2.f14525c;
        if (i7 == 3) {
            f10 = cVar.f14523a - f15;
        } else if (i7 == 4) {
            f10 = f14 - cVar.f14525c;
        } else if (i7 == 5) {
            f10 = cVar.f14524b - f13;
        } else {
            if (i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = f12 - cVar.f14526d;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        long j5 = (long) f10;
        if (i7 == 3 || i7 == 4) {
            float f16 = cVar.f14524b;
            float f17 = 2;
            f11 = (((cVar.f14526d - f16) / f17) + f16) - (((f13 - f12) / f17) + f12);
        } else {
            if (i7 != 5 && i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f18 = cVar.f14523a;
            float f19 = 2;
            f11 = (((cVar.f14525c - f18) / f19) + f18) - (((f15 - f14) / f19) + f14);
        }
        long j10 = (long) f11;
        return (j10 * j10) + (((long) 13) * j5 * j5);
    }

    public static final boolean r(s sVar) {
        h0 h0Var;
        h1 h1Var;
        h0 h0Var2;
        h1 h1Var2 = sVar.f11124h;
        return (h1Var2 == null || (h0Var = h1Var2.f10692o) == null || !h0Var.J() || (h1Var = sVar.f11124h) == null || (h0Var2 = h1Var.f10692o) == null || !h0Var2.I()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [h9.k, i9.n] */
    public static final b s(s sVar, int i7) {
        int iOrdinal = sVar.C0().ordinal();
        b bVar = b.f14028a;
        if (iOrdinal != 0) {
            b bVar2 = b.f14029b;
            if (iOrdinal == 1) {
                s sVarN = n(sVar);
                if (sVarN == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                b bVarS = s(sVarN, i7);
                if (bVarS == bVar) {
                    bVarS = null;
                }
                if (bVarS != null) {
                    return bVarS;
                }
                if (sVar.f14075p) {
                    return bVar;
                }
                sVar.f14075p = true;
                try {
                    m mVarB0 = sVar.B0();
                    a aVar = new a(i7);
                    i focusOwner = ((r2.u) q2.f.w(sVar)).getFocusOwner();
                    s sVar2 = ((j) focusOwner).f14049h;
                    mVarB0.k.invoke(aVar);
                    s sVar3 = ((j) focusOwner).f14049h;
                    if (aVar.f14027b) {
                        o oVar = o.f14064b;
                        return bVar2;
                    }
                    if (sVar2 == sVar3 || sVar3 == null) {
                        return bVar;
                    }
                    return o.f14066d == o.f14065c ? bVar2 : b.f14030c;
                } finally {
                    sVar.f14075p = false;
                }
            }
            if (iOrdinal == 2) {
                return bVar2;
            }
            if (iOrdinal != 3) {
                throw new cc.s();
            }
        }
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h9.k, i9.n] */
    public static final b t(s sVar, int i7) {
        if (!sVar.f14076q) {
            sVar.f14076q = true;
            try {
                m mVarB0 = sVar.B0();
                a aVar = new a(i7);
                i focusOwner = ((r2.u) q2.f.w(sVar)).getFocusOwner();
                s sVar2 = ((j) focusOwner).f14049h;
                mVarB0.f14063j.invoke(aVar);
                s sVar3 = ((j) focusOwner).f14049h;
                boolean z10 = aVar.f14027b;
                b bVar = b.f14029b;
                if (z10) {
                    o oVar = o.f14064b;
                    return bVar;
                }
                if (sVar2 != sVar3 && sVar3 != null) {
                    return o.f14066d == o.f14065c ? bVar : b.f14030c;
                }
            } finally {
                sVar.f14076q = false;
            }
        }
        return b.f14028a;
    }

    public static final b u(s sVar, int i7) {
        r1.o oVarF;
        d1 d1Var;
        int iOrdinal = sVar.C0().ordinal();
        b bVar = b.f14028a;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                s sVarN = n(sVar);
                if (sVarN != null) {
                    return s(sVarN, i7);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new cc.s();
                }
                if (!sVar.f11117a.f11129n) {
                    n2.a.b("visitAncestors called on an unattached node");
                }
                r1.o oVar = sVar.f11117a.f11121e;
                h0 h0VarV = q2.f.v(sVar);
                loop0: while (true) {
                    if (h0VarV == null) {
                        oVarF = null;
                        break;
                    }
                    if ((h0VarV.E.f10617f.f11120d & 1024) != 0) {
                        while (oVar != null) {
                            if ((oVar.f11119c & 1024) != 0) {
                                oVarF = oVar;
                                h1.e eVar = null;
                                while (oVarF != null) {
                                    if (oVarF instanceof s) {
                                        break loop0;
                                    }
                                    if ((oVarF.f11119c & 1024) != 0 && (oVarF instanceof q2.m)) {
                                        int i10 = 0;
                                        for (r1.o oVar2 = ((q2.m) oVarF).f10746p; oVar2 != null; oVar2 = oVar2.f11122f) {
                                            if ((oVar2.f11119c & 1024) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    oVarF = oVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new h1.e(new r1.o[16]);
                                                    }
                                                    if (oVarF != null) {
                                                        eVar.b(oVarF);
                                                        oVarF = null;
                                                    }
                                                    eVar.b(oVar2);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    oVarF = q2.f.f(eVar);
                                }
                            }
                            oVar = oVar.f11121e;
                        }
                    }
                    h0VarV = h0VarV.v();
                    oVar = (h0VarV == null || (d1Var = h0VarV.E) == null) ? null : d1Var.f10616e;
                }
                s sVar2 = (s) oVarF;
                if (sVar2 == null) {
                    return bVar;
                }
                int iOrdinal2 = sVar2.C0().ordinal();
                if (iOrdinal2 == 0) {
                    return t(sVar2, i7);
                }
                if (iOrdinal2 == 1) {
                    return u(sVar2, i7);
                }
                if (iOrdinal2 == 2) {
                    return b.f14029b;
                }
                if (iOrdinal2 != 3) {
                    throw new cc.s();
                }
                b bVarU = u(sVar2, i7);
                b bVar2 = bVarU != bVar ? bVarU : null;
                return bVar2 == null ? t(sVar2, i7) : bVar2;
            }
        }
        return bVar;
    }

    public static final boolean v(s sVar) {
        h1.e eVar;
        d1 d1Var;
        d1 d1Var2;
        j jVar = (j) ((r2.u) q2.f.w(sVar)).getFocusOwner();
        s sVar2 = jVar.f14049h;
        r rVarC0 = sVar.C0();
        if (sVar2 == sVar) {
            sVar.A0(rVarC0, rVarC0);
            return true;
        }
        int i7 = 0;
        if (sVar2 == null && !((j) ((r2.u) q2.f.w(sVar)).getFocusOwner()).f14042a.J()) {
            return false;
        }
        if (sVar2 != null) {
            eVar = new h1.e(new s[16]);
            if (!sVar2.f11117a.f11129n) {
                n2.a.b("visitAncestors called on an unattached node");
            }
            r1.o oVar = sVar2.f11117a.f11121e;
            h0 h0VarV = q2.f.v(sVar2);
            while (h0VarV != null) {
                if ((h0VarV.E.f10617f.f11120d & 1024) != 0) {
                    while (oVar != null) {
                        if ((oVar.f11119c & 1024) != 0) {
                            r1.o oVarF = oVar;
                            h1.e eVar2 = null;
                            while (oVarF != null) {
                                if (oVarF instanceof s) {
                                    eVar.b((s) oVarF);
                                } else if ((oVarF.f11119c & 1024) != 0 && (oVarF instanceof q2.m)) {
                                    int i10 = 0;
                                    for (r1.o oVar2 = ((q2.m) oVarF).f10746p; oVar2 != null; oVar2 = oVar2.f11122f) {
                                        if ((oVar2.f11119c & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                oVarF = oVar2;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new h1.e(new r1.o[16]);
                                                }
                                                if (oVarF != null) {
                                                    eVar2.b(oVarF);
                                                    oVarF = null;
                                                }
                                                eVar2.b(oVar2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                oVarF = q2.f.f(eVar2);
                            }
                        }
                        oVar = oVar.f11121e;
                    }
                }
                h0VarV = h0VarV.v();
                oVar = (h0VarV == null || (d1Var2 = h0VarV.E) == null) ? null : d1Var2.f10616e;
            }
        } else {
            eVar = null;
        }
        Object[] objArr = new s[16];
        if (!sVar.f11117a.f11129n) {
            n2.a.b("visitAncestors called on an unattached node");
        }
        r1.o oVar3 = sVar.f11117a.f11121e;
        h0 h0VarV2 = q2.f.v(sVar);
        boolean z10 = true;
        int i11 = 0;
        while (h0VarV2 != null) {
            if ((h0VarV2.E.f10617f.f11120d & 1024) != 0) {
                while (oVar3 != null) {
                    if ((oVar3.f11119c & 1024) != 0) {
                        r1.o oVarF2 = oVar3;
                        h1.e eVar3 = null;
                        while (oVarF2 != null) {
                            if (oVarF2 instanceof s) {
                                s sVar3 = (s) oVarF2;
                                Boolean boolValueOf = eVar != null ? Boolean.valueOf(eVar.k(sVar3)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    int i12 = i11 + 1;
                                    if (objArr.length < i12) {
                                        int length = objArr.length;
                                        Object[] objArr2 = new Object[Math.max(i12, length * 2)];
                                        System.arraycopy(objArr, i7, objArr2, i7, length);
                                        objArr = objArr2;
                                    }
                                    objArr[i11] = sVar3;
                                    i11 = i12;
                                }
                                if (sVar3 == sVar2) {
                                    z10 = false;
                                }
                            } else {
                                if ((oVarF2.f11119c & 1024) != 0 && (oVarF2 instanceof q2.m)) {
                                    int i13 = 0;
                                    for (r1.o oVar4 = ((q2.m) oVarF2).f10746p; oVar4 != null; oVar4 = oVar4.f11122f) {
                                        if ((oVar4.f11119c & 1024) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                oVarF2 = oVar4;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new h1.e(new r1.o[16]);
                                                }
                                                if (oVarF2 != null) {
                                                    eVar3.b(oVarF2);
                                                    oVarF2 = null;
                                                }
                                                eVar3.b(oVar4);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                    i7 = 0;
                                }
                                oVarF2 = q2.f.f(eVar3);
                                i7 = 0;
                            }
                            oVarF2 = q2.f.f(eVar3);
                            i7 = 0;
                        }
                    }
                    oVar3 = oVar3.f11121e;
                    i7 = 0;
                }
            }
            h0VarV2 = h0VarV2.v();
            oVar3 = (h0VarV2 == null || (d1Var = h0VarV2.E) == null) ? null : d1Var.f10616e;
            i7 = 0;
        }
        if (z10 && sVar2 != null && !e(sVar2, false)) {
            return false;
        }
        q2.f.r(sVar, new b1.a(17, sVar));
        int iOrdinal = sVar.C0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ((j) ((r2.u) q2.f.w(sVar)).getFocusOwner()).g(sVar);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new cc.s();
                }
                ((j) ((r2.u) q2.f.w(sVar)).getFocusOwner()).g(sVar);
            }
        }
        r rVar = r.f14072d;
        r rVar2 = r.f14070b;
        if (eVar != null) {
            int i14 = eVar.f6423c - 1;
            Object[] objArr3 = eVar.f6421a;
            if (i14 < objArr3.length) {
                while (i14 >= 0) {
                    s sVar4 = (s) objArr3[i14];
                    if (jVar.f14049h != sVar) {
                        return false;
                    }
                    sVar4.A0(rVar2, rVar);
                    i14--;
                }
            }
        }
        int i15 = i11 - 1;
        int length2 = objArr.length;
        r rVar3 = r.f14069a;
        if (i15 < length2) {
            while (i15 >= 0) {
                s sVar5 = (s) objArr[i15];
                if (jVar.f14049h != sVar) {
                    return false;
                }
                sVar5.A0(sVar5 == sVar2 ? rVar3 : rVar, rVar2);
                i15--;
            }
        }
        if (jVar.f14049h != sVar) {
            return false;
        }
        sVar.A0(rVarC0, rVar3);
        return jVar.f14049h == sVar;
    }

    public static final boolean w(s sVar, q3.e eVar) {
        Object[] objArr = new s[16];
        if (!sVar.f11117a.f11129n) {
            n2.a.b("visitChildren called on an unattached node");
        }
        h1.e eVar2 = new h1.e(new r1.o[16]);
        r1.o oVar = sVar.f11117a;
        r1.o oVar2 = oVar.f11122f;
        if (oVar2 == null) {
            q2.f.b(eVar2, oVar);
        } else {
            eVar2.b(oVar2);
        }
        int i7 = 0;
        while (true) {
            int i10 = eVar2.f6423c;
            if (i10 == 0) {
                break;
            }
            r1.o oVarF = (r1.o) eVar2.l(i10 - 1);
            if ((oVarF.f11120d & 1024) == 0) {
                q2.f.b(eVar2, oVarF);
            } else {
                while (oVarF != null) {
                    if ((oVarF.f11119c & 1024) != 0) {
                        h1.e eVar3 = null;
                        while (oVarF != null) {
                            if (oVarF instanceof s) {
                                s sVar2 = (s) oVarF;
                                int i11 = i7 + 1;
                                if (objArr.length < i11) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i11, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i7] = sVar2;
                                i7 = i11;
                            } else if ((oVarF.f11119c & 1024) != 0 && (oVarF instanceof q2.m)) {
                                int i12 = 0;
                                for (r1.o oVar3 = ((q2.m) oVarF).f10746p; oVar3 != null; oVar3 = oVar3.f11122f) {
                                    if ((oVar3.f11119c & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            oVarF = oVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new h1.e(new r1.o[16]);
                                            }
                                            if (oVarF != null) {
                                                eVar3.b(oVarF);
                                                oVarF = null;
                                            }
                                            eVar3.b(oVar3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            oVarF = q2.f.f(eVar3);
                        }
                        break;
                    }
                    oVarF = oVarF.f11122f;
                }
            }
        }
        u8.l.J0(objArr, t.f14078a, 0, i7);
        int i13 = i7 - 1;
        if (i13 < objArr.length) {
            while (i13 >= 0) {
                s sVar3 = (s) objArr[i13];
                if (r(sVar3) && a(sVar3, eVar)) {
                    return true;
                }
                i13--;
            }
        }
        return false;
    }

    public static final boolean x(s sVar, q3.e eVar) {
        Object[] objArr = new s[16];
        if (!sVar.f11117a.f11129n) {
            n2.a.b("visitChildren called on an unattached node");
        }
        h1.e eVar2 = new h1.e(new r1.o[16]);
        r1.o oVar = sVar.f11117a;
        r1.o oVar2 = oVar.f11122f;
        if (oVar2 == null) {
            q2.f.b(eVar2, oVar);
        } else {
            eVar2.b(oVar2);
        }
        int i7 = 0;
        while (true) {
            int i10 = eVar2.f6423c;
            if (i10 == 0) {
                break;
            }
            r1.o oVarF = (r1.o) eVar2.l(i10 - 1);
            if ((oVarF.f11120d & 1024) == 0) {
                q2.f.b(eVar2, oVarF);
            } else {
                while (oVarF != null) {
                    if ((oVarF.f11119c & 1024) != 0) {
                        h1.e eVar3 = null;
                        while (oVarF != null) {
                            if (oVarF instanceof s) {
                                s sVar2 = (s) oVarF;
                                int i11 = i7 + 1;
                                if (objArr.length < i11) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i11, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i7] = sVar2;
                                i7 = i11;
                            } else if ((oVarF.f11119c & 1024) != 0 && (oVarF instanceof q2.m)) {
                                int i12 = 0;
                                for (r1.o oVar3 = ((q2.m) oVarF).f10746p; oVar3 != null; oVar3 = oVar3.f11122f) {
                                    if ((oVar3.f11119c & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            oVarF = oVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new h1.e(new r1.o[16]);
                                            }
                                            if (oVarF != null) {
                                                eVar3.b(oVarF);
                                                oVarF = null;
                                            }
                                            eVar3.b(oVar3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            oVarF = q2.f.f(eVar3);
                        }
                        break;
                    }
                    oVarF = oVarF.f11122f;
                }
            }
        }
        u8.l.J0(objArr, t.f14078a, 0, i7);
        for (int i13 = 0; i13 < i7; i13++) {
            s sVar3 = (s) objArr[i13];
            if (r(sVar3) && k(sVar3, eVar)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean y(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof r2.u) {
            return ((r2.u) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x017c  */
    public static final Object z(s sVar, int i7, h9.k kVar) {
        int i10;
        int i11;
        Object objInvoke;
        r1.o oVarF;
        h0.n nVar;
        d1 d1Var;
        if (!sVar.f11117a.f11129n) {
            n2.a.b("visitAncestors called on an unattached node");
        }
        r1.o oVar = sVar.f11117a.f11121e;
        h0 h0VarV = q2.f.v(sVar);
        loop0: while (true) {
            i10 = 0;
            i11 = 1;
            objInvoke = null;
            if (h0VarV == null) {
                oVarF = null;
                break;
            }
            if ((h0VarV.E.f10617f.f11120d & 1024) != 0) {
                while (oVar != null) {
                    if ((oVar.f11119c & 1024) != 0) {
                        oVarF = oVar;
                        h1.e eVar = null;
                        while (oVarF != null) {
                            if (oVarF instanceof s) {
                                break loop0;
                            }
                            if ((oVarF.f11119c & 1024) != 0 && (oVarF instanceof q2.m)) {
                                int i12 = 0;
                                for (r1.o oVar2 = ((q2.m) oVarF).f10746p; oVar2 != null; oVar2 = oVar2.f11122f) {
                                    if ((oVar2.f11119c & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            oVarF = oVar2;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new h1.e(new r1.o[16]);
                                            }
                                            if (oVarF != null) {
                                                eVar.b(oVarF);
                                                oVarF = null;
                                            }
                                            eVar.b(oVar2);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            oVarF = q2.f.f(eVar);
                        }
                    }
                    oVar = oVar.f11121e;
                }
            }
            h0VarV = h0VarV.v();
            oVar = (h0VarV == null || (d1Var = h0VarV.E) == null) ? null : d1Var.f10616e;
        }
        s sVar2 = (s) oVarF;
        if (sVar2 != null) {
            p2.f fVar = o2.f.f9325a;
            if (!i9.l.a((h0.n) ob.a.a(sVar2, fVar), (h0.n) ob.a.a(sVar, fVar))) {
                nVar = (h0.n) ob.a.a(sVar, o2.f.f9325a);
                if (nVar != null) {
                    if (i7 == 5) {
                        i11 = 5;
                    } else if (i7 == 6) {
                        i11 = 6;
                    } else if (i7 == 3) {
                        i11 = 3;
                    } else if (i7 == 4) {
                        i11 = 4;
                    } else if (i7 == 1) {
                        i11 = 2;
                    } else if (i7 != 2) {
                        throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                    }
                    if (nVar.f6340o.a() > 0 || !nVar.f6340o.d() || !nVar.f11129n) {
                        return kVar.invoke(h0.n.f6339r);
                    }
                    int iB = nVar.B0(i11) ? nVar.f6340o.b() : nVar.f6340o.e();
                    x xVar = new x();
                    h0.k kVar2 = nVar.f6341p;
                    kVar2.getClass();
                    h0.j jVar = new h0.j(iB, iB);
                    kVar2.f6332a.b(jVar);
                    xVar.f6688a = jVar;
                    int iC = nVar.f6340o.c() * 2;
                    int iA = nVar.f6340o.a();
                    if (iC > iA) {
                        iC = iA;
                    }
                    while (objInvoke == null && nVar.A0((h0.j) xVar.f6688a, i11) && i10 < iC) {
                        h0.j jVar2 = (h0.j) xVar.f6688a;
                        int i13 = jVar2.f6329a;
                        int i14 = jVar2.f6330b;
                        if (nVar.B0(i11)) {
                            i14++;
                        } else {
                            i13--;
                        }
                        h0.k kVar3 = nVar.f6341p;
                        kVar3.getClass();
                        h0.j jVar3 = new h0.j(i13, i14);
                        kVar3.f6332a.b(jVar3);
                        nVar.f6341p.f6332a.k((h0.j) xVar.f6688a);
                        xVar.f6688a = jVar3;
                        i10++;
                        q2.f.v(nVar).k();
                        objInvoke = kVar.invoke(new h0.m(nVar, xVar, i11));
                    }
                    nVar.f6341p.f6332a.k((h0.j) xVar.f6688a);
                    q2.f.v(nVar).k();
                    return objInvoke;
                }
            }
        } else {
            nVar = (h0.n) ob.a.a(sVar, o2.f.f9325a);
            if (nVar != null) {
                if (i7 == 5) {
                    i11 = 5;
                } else if (i7 == 6) {
                    i11 = 6;
                } else if (i7 == 3) {
                    i11 = 3;
                } else if (i7 == 4) {
                    i11 = 4;
                } else if (i7 == 1) {
                    i11 = 2;
                } else if (i7 != 2) {
                    throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                }
                if (nVar.f6340o.a() > 0) {
                }
                return kVar.invoke(h0.n.f6339r);
            }
        }
        return null;
    }
}

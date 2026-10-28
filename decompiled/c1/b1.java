package c1;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f1820a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f1821b;

    static {
        long j5 = e1.o.f4051l;
        n3.s[] sVarArr = n3.q.f8753b;
        long j10 = 1095216660480L & j5;
        if (j10 == 0) {
            n3.i.a("Cannot perform operation for Unspecified type.");
        }
        f1821b = n3.r.K(n3.q.c(j5) / 2, j10);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0295  */
    /* JADX WARN: Code duplicated, block: B:104:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:115:0x0315  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x008e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:77:0x0120  */
    /* JADX WARN: Code duplicated, block: B:79:0x012a  */
    /* JADX WARN: Code duplicated, block: B:81:0x012d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0130  */
    /* JADX WARN: Code duplicated, block: B:86:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0137  */
    /* JADX WARN: Code duplicated, block: B:88:0x0139  */
    /* JADX WARN: Code duplicated, block: B:89:0x013d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0157  */
    /* JADX WARN: Code duplicated, block: B:94:0x0249  */
    /* JADX WARN: Code duplicated, block: B:98:0x0278  */
    public static final void a(String str, h9.k kVar, r1.p pVar, boolean z10, b3.r0 r0Var, h9.n nVar, h9.n nVar2, boolean z11, b3.l0 l0Var, l0.s0 s0Var, l0.r0 r0Var2, boolean z12, int i7, int i10, y1.l0 l0Var2, q2 q2Var, f1.s sVar, int i11, int i12, int i13) {
        r1.p pVar2;
        h9.n nVar3;
        int i14;
        int i15;
        boolean z13;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z14;
        int i20;
        int i21;
        int i22;
        int i23;
        w wVar;
        q2 q2Var2;
        l0.r0 r0Var3;
        h9.n nVar4;
        b3.l0 l0Var3;
        l0.s0 s0Var2;
        b3.r0 r0Var4;
        int i24;
        y1.l0 l0Var4;
        boolean z15;
        q2 q2Var3;
        boolean z16;
        int i25;
        boolean z17;
        Object objK;
        b0.k kVar2;
        boolean z18;
        long jB;
        boolean zBooleanValue;
        long j5;
        b3.r0 r0Var5;
        boolean z19;
        boolean z20;
        l0.r0 r0Var6;
        boolean z21;
        int i26;
        int i27;
        b3.l0 l0Var5;
        h9.n nVar5;
        q2 q2Var4;
        l0.s0 s0Var3;
        y1.l0 l0Var6;
        f1.w1 w1VarR;
        int i28;
        sVar.Y(-1922450045);
        int i29 = (sVar.f(str) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i29 |= sVar.h(kVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            pVar2 = pVar;
            i29 |= sVar.f(pVar2) ? 256 : 128;
        } else {
            pVar2 = pVar;
        }
        int i30 = 113339392 | i29;
        int i31 = i13 & 512;
        if (i31 == 0) {
            if ((i11 & 805306368) == 0) {
                nVar3 = nVar2;
                i30 |= sVar.h(nVar3) ? 536870912 : 268435456;
            }
            i14 = i12 | 438;
            i15 = i13 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
            if (i15 != 0) {
                i17 = i12 | 3510;
                z13 = z11;
            } else {
                z13 = z11;
                if (sVar.g(z13)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i17 = i14 | i16;
            }
            i18 = 1794048 | i17;
            i19 = i13 & 131072;
            if (i19 != 0) {
                if ((12582912 & i12) == 0) {
                    z14 = z12;
                    if (sVar.g(z14)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i18 |= i20;
                }
                if ((i12 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_DOOR) == 0) {
                    i21 = i7;
                    if ((i13 & 262144) == 0) {
                        i22 = 805306368;
                        if (sVar.d(i21)) {
                            i28 = 67108864;
                        }
                        i18 |= i28;
                    } else {
                        i22 = 805306368;
                    }
                    i28 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_ZONE;
                    i18 |= i28;
                } else {
                    i21 = i7;
                    i22 = 805306368;
                }
                int i32 = i18 | i22;
                if ((i30 & 306783379) != 306783378 && (i32 & 306783379) == 306783378 && sVar.z()) {
                    sVar.Q();
                    r0Var5 = r0Var;
                    r0Var6 = r0Var2;
                    l0Var6 = l0Var2;
                    q2Var4 = q2Var;
                    nVar5 = nVar3;
                    i26 = i21;
                    z21 = z14;
                    z19 = z13;
                    z20 = z10;
                    l0Var5 = l0Var;
                    s0Var3 = s0Var;
                    i27 = i10;
                } else {
                    sVar.S();
                    if ((i11 & 1) != 0 || sVar.x()) {
                        b3.r0 r0Var7 = (b3.r0) sVar.j(u2.f2203a);
                        if (i31 != 0) {
                            nVar3 = null;
                        }
                        if (i15 != 0) {
                            z13 = false;
                        }
                        if (i19 != 0) {
                            z14 = false;
                        }
                        if ((i13 & 262144) == 0) {
                            i23 = i21;
                        } else if (z14) {
                            i23 = 1;
                        } else {
                            i23 = Integer.MAX_VALUE;
                        }
                        t0 t0Var = t0.f2160a;
                        y1.l0 l0VarA = l1.a(3, sVar);
                        wVar = (w) sVar.j(y.f2319a);
                        q2Var2 = wVar.P;
                        sVar.W(1540400102);
                        if (q2Var2 == null) {
                            long jC = y.c(wVar, 18);
                            long jC2 = y.c(wVar, 18);
                            long jB2 = y1.q.b(0.38f, y.c(wVar, 18));
                            long jC3 = y.c(wVar, 18);
                            long j10 = y1.q.f14957l;
                            q2 q2Var5 = new q2(jC, jC2, jB2, jC3, j10, j10, j10, j10, y.c(wVar, 26), y.c(wVar, 2), (w0.y1) sVar.j(w0.z1.f14024a), y.c(wVar, 26), y.c(wVar, 24), y1.q.b(0.12f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 26), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19));
                            wVar.P = q2Var5;
                            q2Var2 = q2Var5;
                        }
                        sVar.p(false);
                        b3.l0 l0Var7 = g3.e0.f5856a;
                        l0.s0 s0Var4 = l0.s0.f7827a;
                        r0Var3 = l0.r0.f7818a;
                        nVar4 = nVar3;
                        l0Var3 = l0Var7;
                        s0Var2 = s0Var4;
                        r0Var4 = r0Var7;
                        i24 = i23;
                        l0Var4 = l0VarA;
                        z15 = z14;
                        q2Var3 = q2Var2;
                        z16 = true;
                        i25 = 1;
                    } else {
                        sVar.Q();
                        z16 = z10;
                        r0Var4 = r0Var;
                        l0Var3 = l0Var;
                        s0Var2 = s0Var;
                        r0Var3 = r0Var2;
                        i25 = i10;
                        l0Var4 = l0Var2;
                        nVar4 = nVar3;
                        i24 = i21;
                        z15 = z14;
                        q2Var3 = q2Var;
                    }
                    z17 = z13;
                    sVar.q();
                    sVar.W(30062948);
                    objK = sVar.K();
                    if (objK == f1.n.f5051a) {
                        objK = ob.a.m(sVar);
                    }
                    kVar2 = (b0.k) objK;
                    z18 = false;
                    sVar.p(false);
                    sVar.W(30069058);
                    jB = r0Var4.b();
                    if (jB == 16) {
                        zBooleanValue = ((Boolean) a.a.r(kVar2, sVar, 0).getValue()).booleanValue();
                        if (!z16) {
                            j5 = q2Var3.f2079c;
                        } else if (z17) {
                            j5 = q2Var3.f2080d;
                        } else if (zBooleanValue) {
                            j5 = q2Var3.f2077a;
                        } else {
                            j5 = q2Var3.f2078b;
                        }
                        jB = j5;
                        z18 = false;
                    }
                    long j11 = jB;
                    sVar.p(z18);
                    l0.r0 r0Var8 = r0Var3;
                    f1.b.a(w0.z1.f14024a.a(q2Var3.k), n1.h.e(-1886965181, new w0(pVar2, nVar, (n3.c) sVar.j(r2.j1.f11276h), z17, q2Var3, str, kVar, z16, r0Var4.d(new b3.r0(j11, 0L, null, 0L, 0, 0L, 16777214)), s0Var2, r0Var8, z15, i24, i25, l0Var3, kVar2, nVar4, l0Var4), sVar), sVar, 56);
                    r0Var5 = r0Var4;
                    z19 = z17;
                    z20 = z16;
                    r0Var6 = r0Var8;
                    z21 = z15;
                    i26 = i24;
                    i27 = i25;
                    l0Var5 = l0Var3;
                    nVar5 = nVar4;
                    q2Var4 = q2Var3;
                    s0Var3 = s0Var2;
                    l0Var6 = l0Var4;
                }
                w1VarR = sVar.r();
                if (w1VarR != null) {
                    w1VarR.f5192d = new x0(str, kVar, pVar, z20, r0Var5, nVar, nVar5, z19, l0Var5, s0Var3, r0Var6, z21, i26, i27, l0Var6, q2Var4, i11, i12, i13);
                }
            }
            i18 = 14376960 | i17;
            z14 = z12;
            if ((i12 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_DOOR) == 0) {
                i21 = i7;
                if ((i13 & 262144) == 0) {
                    i22 = 805306368;
                    if (sVar.d(i21)) {
                        i28 = 67108864;
                    }
                    i18 |= i28;
                } else {
                    i22 = 805306368;
                }
                i28 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_ZONE;
                i18 |= i28;
            } else {
                i21 = i7;
                i22 = 805306368;
            }
            int i33 = i18 | i22;
            if ((i30 & 306783379) != 306783378) {
                sVar.S();
                if ((i11 & 1) != 0) {
                    b3.r0 r0Var9 = (b3.r0) sVar.j(u2.f2203a);
                    if (i31 != 0) {
                        nVar3 = null;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    }
                    if (i19 != 0) {
                        z14 = false;
                    }
                    if ((i13 & 262144) == 0) {
                        i23 = i21;
                    } else if (z14) {
                        i23 = 1;
                    } else {
                        i23 = Integer.MAX_VALUE;
                    }
                    t0 t0Var2 = t0.f2160a;
                    y1.l0 l0VarA2 = l1.a(3, sVar);
                    wVar = (w) sVar.j(y.f2319a);
                    q2Var2 = wVar.P;
                    sVar.W(1540400102);
                    if (q2Var2 == null) {
                        long jC4 = y.c(wVar, 18);
                        long jC5 = y.c(wVar, 18);
                        long jB3 = y1.q.b(0.38f, y.c(wVar, 18));
                        long jC6 = y.c(wVar, 18);
                        long j12 = y1.q.f14957l;
                        q2 q2Var6 = new q2(jC4, jC5, jB3, jC6, j12, j12, j12, j12, y.c(wVar, 26), y.c(wVar, 2), (w0.y1) sVar.j(w0.z1.f14024a), y.c(wVar, 26), y.c(wVar, 24), y1.q.b(0.12f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 26), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19));
                        wVar.P = q2Var6;
                        q2Var2 = q2Var6;
                    }
                    sVar.p(false);
                    b3.l0 l0Var8 = g3.e0.f5856a;
                    l0.s0 s0Var5 = l0.s0.f7827a;
                    r0Var3 = l0.r0.f7818a;
                    nVar4 = nVar3;
                    l0Var3 = l0Var8;
                    s0Var2 = s0Var5;
                    r0Var4 = r0Var9;
                    i24 = i23;
                    l0Var4 = l0VarA2;
                    z15 = z14;
                    q2Var3 = q2Var2;
                    z16 = true;
                    i25 = 1;
                } else {
                    b3.r0 r0Var10 = (b3.r0) sVar.j(u2.f2203a);
                    if (i31 != 0) {
                        nVar3 = null;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    }
                    if (i19 != 0) {
                        z14 = false;
                    }
                    if ((i13 & 262144) == 0) {
                        i23 = i21;
                    } else if (z14) {
                        i23 = 1;
                    } else {
                        i23 = Integer.MAX_VALUE;
                    }
                    t0 t0Var3 = t0.f2160a;
                    y1.l0 l0VarA3 = l1.a(3, sVar);
                    wVar = (w) sVar.j(y.f2319a);
                    q2Var2 = wVar.P;
                    sVar.W(1540400102);
                    if (q2Var2 == null) {
                        long jC7 = y.c(wVar, 18);
                        long jC8 = y.c(wVar, 18);
                        long jB4 = y1.q.b(0.38f, y.c(wVar, 18));
                        long jC9 = y.c(wVar, 18);
                        long j13 = y1.q.f14957l;
                        q2 q2Var7 = new q2(jC7, jC8, jB4, jC9, j13, j13, j13, j13, y.c(wVar, 26), y.c(wVar, 2), (w0.y1) sVar.j(w0.z1.f14024a), y.c(wVar, 26), y.c(wVar, 24), y1.q.b(0.12f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 26), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19));
                        wVar.P = q2Var7;
                        q2Var2 = q2Var7;
                    }
                    sVar.p(false);
                    b3.l0 l0Var9 = g3.e0.f5856a;
                    l0.s0 s0Var6 = l0.s0.f7827a;
                    r0Var3 = l0.r0.f7818a;
                    nVar4 = nVar3;
                    l0Var3 = l0Var9;
                    s0Var2 = s0Var6;
                    r0Var4 = r0Var10;
                    i24 = i23;
                    l0Var4 = l0VarA3;
                    z15 = z14;
                    q2Var3 = q2Var2;
                    z16 = true;
                    i25 = 1;
                }
                z17 = z13;
                sVar.q();
                sVar.W(30062948);
                objK = sVar.K();
                if (objK == f1.n.f5051a) {
                    objK = ob.a.m(sVar);
                }
                kVar2 = (b0.k) objK;
                z18 = false;
                sVar.p(false);
                sVar.W(30069058);
                jB = r0Var4.b();
                if (jB == 16) {
                    zBooleanValue = ((Boolean) a.a.r(kVar2, sVar, 0).getValue()).booleanValue();
                    if (!z16) {
                        j5 = q2Var3.f2079c;
                    } else if (z17) {
                        j5 = q2Var3.f2080d;
                    } else if (zBooleanValue) {
                        j5 = q2Var3.f2077a;
                    } else {
                        j5 = q2Var3.f2078b;
                    }
                    jB = j5;
                    z18 = false;
                }
                long j14 = jB;
                sVar.p(z18);
                l0.r0 r0Var11 = r0Var3;
                f1.b.a(w0.z1.f14024a.a(q2Var3.k), n1.h.e(-1886965181, new w0(pVar2, nVar, (n3.c) sVar.j(r2.j1.f11276h), z17, q2Var3, str, kVar, z16, r0Var4.d(new b3.r0(j14, 0L, null, 0L, 0, 0L, 16777214)), s0Var2, r0Var11, z15, i24, i25, l0Var3, kVar2, nVar4, l0Var4), sVar), sVar, 56);
                r0Var5 = r0Var4;
                z19 = z17;
                z20 = z16;
                r0Var6 = r0Var11;
                z21 = z15;
                i26 = i24;
                i27 = i25;
                l0Var5 = l0Var3;
                nVar5 = nVar4;
                q2Var4 = q2Var3;
                s0Var3 = s0Var2;
                l0Var6 = l0Var4;
            } else {
                sVar.S();
                if ((i11 & 1) != 0) {
                    b3.r0 r0Var12 = (b3.r0) sVar.j(u2.f2203a);
                    if (i31 != 0) {
                        nVar3 = null;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    }
                    if (i19 != 0) {
                        z14 = false;
                    }
                    if ((i13 & 262144) == 0) {
                        i23 = i21;
                    } else if (z14) {
                        i23 = 1;
                    } else {
                        i23 = Integer.MAX_VALUE;
                    }
                    t0 t0Var4 = t0.f2160a;
                    y1.l0 l0VarA4 = l1.a(3, sVar);
                    wVar = (w) sVar.j(y.f2319a);
                    q2Var2 = wVar.P;
                    sVar.W(1540400102);
                    if (q2Var2 == null) {
                        long jC10 = y.c(wVar, 18);
                        long jC11 = y.c(wVar, 18);
                        long jB5 = y1.q.b(0.38f, y.c(wVar, 18));
                        long jC12 = y.c(wVar, 18);
                        long j15 = y1.q.f14957l;
                        q2 q2Var8 = new q2(jC10, jC11, jB5, jC12, j15, j15, j15, j15, y.c(wVar, 26), y.c(wVar, 2), (w0.y1) sVar.j(w0.z1.f14024a), y.c(wVar, 26), y.c(wVar, 24), y1.q.b(0.12f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 26), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19));
                        wVar.P = q2Var8;
                        q2Var2 = q2Var8;
                    }
                    sVar.p(false);
                    b3.l0 l0Var10 = g3.e0.f5856a;
                    l0.s0 s0Var7 = l0.s0.f7827a;
                    r0Var3 = l0.r0.f7818a;
                    nVar4 = nVar3;
                    l0Var3 = l0Var10;
                    s0Var2 = s0Var7;
                    r0Var4 = r0Var12;
                    i24 = i23;
                    l0Var4 = l0VarA4;
                    z15 = z14;
                    q2Var3 = q2Var2;
                    z16 = true;
                    i25 = 1;
                } else {
                    b3.r0 r0Var13 = (b3.r0) sVar.j(u2.f2203a);
                    if (i31 != 0) {
                        nVar3 = null;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    }
                    if (i19 != 0) {
                        z14 = false;
                    }
                    if ((i13 & 262144) == 0) {
                        i23 = i21;
                    } else if (z14) {
                        i23 = 1;
                    } else {
                        i23 = Integer.MAX_VALUE;
                    }
                    t0 t0Var5 = t0.f2160a;
                    y1.l0 l0VarA5 = l1.a(3, sVar);
                    wVar = (w) sVar.j(y.f2319a);
                    q2Var2 = wVar.P;
                    sVar.W(1540400102);
                    if (q2Var2 == null) {
                        long jC13 = y.c(wVar, 18);
                        long jC14 = y.c(wVar, 18);
                        long jB6 = y1.q.b(0.38f, y.c(wVar, 18));
                        long jC15 = y.c(wVar, 18);
                        long j16 = y1.q.f14957l;
                        q2 q2Var9 = new q2(jC13, jC14, jB6, jC15, j16, j16, j16, j16, y.c(wVar, 26), y.c(wVar, 2), (w0.y1) sVar.j(w0.z1.f14024a), y.c(wVar, 26), y.c(wVar, 24), y1.q.b(0.12f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 26), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19));
                        wVar.P = q2Var9;
                        q2Var2 = q2Var9;
                    }
                    sVar.p(false);
                    b3.l0 l0Var11 = g3.e0.f5856a;
                    l0.s0 s0Var8 = l0.s0.f7827a;
                    r0Var3 = l0.r0.f7818a;
                    nVar4 = nVar3;
                    l0Var3 = l0Var11;
                    s0Var2 = s0Var8;
                    r0Var4 = r0Var13;
                    i24 = i23;
                    l0Var4 = l0VarA5;
                    z15 = z14;
                    q2Var3 = q2Var2;
                    z16 = true;
                    i25 = 1;
                }
                z17 = z13;
                sVar.q();
                sVar.W(30062948);
                objK = sVar.K();
                if (objK == f1.n.f5051a) {
                    objK = ob.a.m(sVar);
                }
                kVar2 = (b0.k) objK;
                z18 = false;
                sVar.p(false);
                sVar.W(30069058);
                jB = r0Var4.b();
                if (jB == 16) {
                    zBooleanValue = ((Boolean) a.a.r(kVar2, sVar, 0).getValue()).booleanValue();
                    if (!z16) {
                        j5 = q2Var3.f2079c;
                    } else if (z17) {
                        j5 = q2Var3.f2080d;
                    } else if (zBooleanValue) {
                        j5 = q2Var3.f2077a;
                    } else {
                        j5 = q2Var3.f2078b;
                    }
                    jB = j5;
                    z18 = false;
                }
                long j17 = jB;
                sVar.p(z18);
                l0.r0 r0Var14 = r0Var3;
                f1.b.a(w0.z1.f14024a.a(q2Var3.k), n1.h.e(-1886965181, new w0(pVar2, nVar, (n3.c) sVar.j(r2.j1.f11276h), z17, q2Var3, str, kVar, z16, r0Var4.d(new b3.r0(j17, 0L, null, 0L, 0, 0L, 16777214)), s0Var2, r0Var14, z15, i24, i25, l0Var3, kVar2, nVar4, l0Var4), sVar), sVar, 56);
                r0Var5 = r0Var4;
                z19 = z17;
                z20 = z16;
                r0Var6 = r0Var14;
                z21 = z15;
                i26 = i24;
                i27 = i25;
                l0Var5 = l0Var3;
                nVar5 = nVar4;
                q2Var4 = q2Var3;
                s0Var3 = s0Var2;
                l0Var6 = l0Var4;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new x0(str, kVar, pVar, z20, r0Var5, nVar, nVar5, z19, l0Var5, s0Var3, r0Var6, z21, i26, i27, l0Var6, q2Var4, i11, i12, i13);
            }
        }
        i30 = 918645760 | i29;
        nVar3 = nVar2;
        i14 = i12 | 438;
        i15 = i13 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        if (i15 != 0) {
            i17 = i12 | 3510;
            z13 = z11;
        } else {
            z13 = z11;
            if (sVar.g(z13)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i17 = i14 | i16;
        }
        i18 = 1794048 | i17;
        i19 = i13 & 131072;
        if (i19 != 0) {
            if ((12582912 & i12) == 0) {
                z14 = z12;
                if (sVar.g(z14)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i18 |= i20;
            }
            if ((i12 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_DOOR) == 0) {
                i21 = i7;
                if ((i13 & 262144) == 0) {
                    i22 = 805306368;
                    if (sVar.d(i21)) {
                        i28 = 67108864;
                    }
                    i18 |= i28;
                } else {
                    i22 = 805306368;
                }
                i28 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_ZONE;
                i18 |= i28;
            } else {
                i21 = i7;
                i22 = 805306368;
            }
            int i34 = i18 | i22;
            if ((i30 & 306783379) != 306783378) {
                sVar.S();
                if ((i11 & 1) != 0) {
                    b3.r0 r0Var15 = (b3.r0) sVar.j(u2.f2203a);
                    if (i31 != 0) {
                        nVar3 = null;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    }
                    if (i19 != 0) {
                        z14 = false;
                    }
                    if ((i13 & 262144) == 0) {
                        i23 = i21;
                    } else if (z14) {
                        i23 = 1;
                    } else {
                        i23 = Integer.MAX_VALUE;
                    }
                    t0 t0Var6 = t0.f2160a;
                    y1.l0 l0VarA6 = l1.a(3, sVar);
                    wVar = (w) sVar.j(y.f2319a);
                    q2Var2 = wVar.P;
                    sVar.W(1540400102);
                    if (q2Var2 == null) {
                        long jC16 = y.c(wVar, 18);
                        long jC17 = y.c(wVar, 18);
                        long jB7 = y1.q.b(0.38f, y.c(wVar, 18));
                        long jC18 = y.c(wVar, 18);
                        long j18 = y1.q.f14957l;
                        q2 q2Var10 = new q2(jC16, jC17, jB7, jC18, j18, j18, j18, j18, y.c(wVar, 26), y.c(wVar, 2), (w0.y1) sVar.j(w0.z1.f14024a), y.c(wVar, 26), y.c(wVar, 24), y1.q.b(0.12f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 26), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19));
                        wVar.P = q2Var10;
                        q2Var2 = q2Var10;
                    }
                    sVar.p(false);
                    b3.l0 l0Var12 = g3.e0.f5856a;
                    l0.s0 s0Var9 = l0.s0.f7827a;
                    r0Var3 = l0.r0.f7818a;
                    nVar4 = nVar3;
                    l0Var3 = l0Var12;
                    s0Var2 = s0Var9;
                    r0Var4 = r0Var15;
                    i24 = i23;
                    l0Var4 = l0VarA6;
                    z15 = z14;
                    q2Var3 = q2Var2;
                    z16 = true;
                    i25 = 1;
                } else {
                    b3.r0 r0Var16 = (b3.r0) sVar.j(u2.f2203a);
                    if (i31 != 0) {
                        nVar3 = null;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    }
                    if (i19 != 0) {
                        z14 = false;
                    }
                    if ((i13 & 262144) == 0) {
                        i23 = i21;
                    } else if (z14) {
                        i23 = 1;
                    } else {
                        i23 = Integer.MAX_VALUE;
                    }
                    t0 t0Var7 = t0.f2160a;
                    y1.l0 l0VarA7 = l1.a(3, sVar);
                    wVar = (w) sVar.j(y.f2319a);
                    q2Var2 = wVar.P;
                    sVar.W(1540400102);
                    if (q2Var2 == null) {
                        long jC19 = y.c(wVar, 18);
                        long jC110 = y.c(wVar, 18);
                        long jB8 = y1.q.b(0.38f, y.c(wVar, 18));
                        long jC111 = y.c(wVar, 18);
                        long j19 = y1.q.f14957l;
                        q2 q2Var11 = new q2(jC19, jC110, jB8, jC111, j19, j19, j19, j19, y.c(wVar, 26), y.c(wVar, 2), (w0.y1) sVar.j(w0.z1.f14024a), y.c(wVar, 26), y.c(wVar, 24), y1.q.b(0.12f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 26), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19));
                        wVar.P = q2Var11;
                        q2Var2 = q2Var11;
                    }
                    sVar.p(false);
                    b3.l0 l0Var13 = g3.e0.f5856a;
                    l0.s0 s0Var10 = l0.s0.f7827a;
                    r0Var3 = l0.r0.f7818a;
                    nVar4 = nVar3;
                    l0Var3 = l0Var13;
                    s0Var2 = s0Var10;
                    r0Var4 = r0Var16;
                    i24 = i23;
                    l0Var4 = l0VarA7;
                    z15 = z14;
                    q2Var3 = q2Var2;
                    z16 = true;
                    i25 = 1;
                }
                z17 = z13;
                sVar.q();
                sVar.W(30062948);
                objK = sVar.K();
                if (objK == f1.n.f5051a) {
                    objK = ob.a.m(sVar);
                }
                kVar2 = (b0.k) objK;
                z18 = false;
                sVar.p(false);
                sVar.W(30069058);
                jB = r0Var4.b();
                if (jB == 16) {
                    zBooleanValue = ((Boolean) a.a.r(kVar2, sVar, 0).getValue()).booleanValue();
                    if (!z16) {
                        j5 = q2Var3.f2079c;
                    } else if (z17) {
                        j5 = q2Var3.f2080d;
                    } else if (zBooleanValue) {
                        j5 = q2Var3.f2077a;
                    } else {
                        j5 = q2Var3.f2078b;
                    }
                    jB = j5;
                    z18 = false;
                }
                long j110 = jB;
                sVar.p(z18);
                l0.r0 r0Var17 = r0Var3;
                f1.b.a(w0.z1.f14024a.a(q2Var3.k), n1.h.e(-1886965181, new w0(pVar2, nVar, (n3.c) sVar.j(r2.j1.f11276h), z17, q2Var3, str, kVar, z16, r0Var4.d(new b3.r0(j110, 0L, null, 0L, 0, 0L, 16777214)), s0Var2, r0Var17, z15, i24, i25, l0Var3, kVar2, nVar4, l0Var4), sVar), sVar, 56);
                r0Var5 = r0Var4;
                z19 = z17;
                z20 = z16;
                r0Var6 = r0Var17;
                z21 = z15;
                i26 = i24;
                i27 = i25;
                l0Var5 = l0Var3;
                nVar5 = nVar4;
                q2Var4 = q2Var3;
                s0Var3 = s0Var2;
                l0Var6 = l0Var4;
            } else {
                sVar.S();
                if ((i11 & 1) != 0) {
                    b3.r0 r0Var18 = (b3.r0) sVar.j(u2.f2203a);
                    if (i31 != 0) {
                        nVar3 = null;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    }
                    if (i19 != 0) {
                        z14 = false;
                    }
                    if ((i13 & 262144) == 0) {
                        i23 = i21;
                    } else if (z14) {
                        i23 = 1;
                    } else {
                        i23 = Integer.MAX_VALUE;
                    }
                    t0 t0Var8 = t0.f2160a;
                    y1.l0 l0VarA8 = l1.a(3, sVar);
                    wVar = (w) sVar.j(y.f2319a);
                    q2Var2 = wVar.P;
                    sVar.W(1540400102);
                    if (q2Var2 == null) {
                        long jC112 = y.c(wVar, 18);
                        long jC113 = y.c(wVar, 18);
                        long jB9 = y1.q.b(0.38f, y.c(wVar, 18));
                        long jC114 = y.c(wVar, 18);
                        long j111 = y1.q.f14957l;
                        q2 q2Var12 = new q2(jC112, jC113, jB9, jC114, j111, j111, j111, j111, y.c(wVar, 26), y.c(wVar, 2), (w0.y1) sVar.j(w0.z1.f14024a), y.c(wVar, 26), y.c(wVar, 24), y1.q.b(0.12f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 26), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19));
                        wVar.P = q2Var12;
                        q2Var2 = q2Var12;
                    }
                    sVar.p(false);
                    b3.l0 l0Var14 = g3.e0.f5856a;
                    l0.s0 s0Var11 = l0.s0.f7827a;
                    r0Var3 = l0.r0.f7818a;
                    nVar4 = nVar3;
                    l0Var3 = l0Var14;
                    s0Var2 = s0Var11;
                    r0Var4 = r0Var18;
                    i24 = i23;
                    l0Var4 = l0VarA8;
                    z15 = z14;
                    q2Var3 = q2Var2;
                    z16 = true;
                    i25 = 1;
                } else {
                    b3.r0 r0Var19 = (b3.r0) sVar.j(u2.f2203a);
                    if (i31 != 0) {
                        nVar3 = null;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    }
                    if (i19 != 0) {
                        z14 = false;
                    }
                    if ((i13 & 262144) == 0) {
                        i23 = i21;
                    } else if (z14) {
                        i23 = 1;
                    } else {
                        i23 = Integer.MAX_VALUE;
                    }
                    t0 t0Var9 = t0.f2160a;
                    y1.l0 l0VarA9 = l1.a(3, sVar);
                    wVar = (w) sVar.j(y.f2319a);
                    q2Var2 = wVar.P;
                    sVar.W(1540400102);
                    if (q2Var2 == null) {
                        long jC115 = y.c(wVar, 18);
                        long jC116 = y.c(wVar, 18);
                        long jB10 = y1.q.b(0.38f, y.c(wVar, 18));
                        long jC117 = y.c(wVar, 18);
                        long j112 = y1.q.f14957l;
                        q2 q2Var13 = new q2(jC115, jC116, jB10, jC117, j112, j112, j112, j112, y.c(wVar, 26), y.c(wVar, 2), (w0.y1) sVar.j(w0.z1.f14024a), y.c(wVar, 26), y.c(wVar, 24), y1.q.b(0.12f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 26), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19));
                        wVar.P = q2Var13;
                        q2Var2 = q2Var13;
                    }
                    sVar.p(false);
                    b3.l0 l0Var15 = g3.e0.f5856a;
                    l0.s0 s0Var12 = l0.s0.f7827a;
                    r0Var3 = l0.r0.f7818a;
                    nVar4 = nVar3;
                    l0Var3 = l0Var15;
                    s0Var2 = s0Var12;
                    r0Var4 = r0Var19;
                    i24 = i23;
                    l0Var4 = l0VarA9;
                    z15 = z14;
                    q2Var3 = q2Var2;
                    z16 = true;
                    i25 = 1;
                }
                z17 = z13;
                sVar.q();
                sVar.W(30062948);
                objK = sVar.K();
                if (objK == f1.n.f5051a) {
                    objK = ob.a.m(sVar);
                }
                kVar2 = (b0.k) objK;
                z18 = false;
                sVar.p(false);
                sVar.W(30069058);
                jB = r0Var4.b();
                if (jB == 16) {
                    zBooleanValue = ((Boolean) a.a.r(kVar2, sVar, 0).getValue()).booleanValue();
                    if (!z16) {
                        j5 = q2Var3.f2079c;
                    } else if (z17) {
                        j5 = q2Var3.f2080d;
                    } else if (zBooleanValue) {
                        j5 = q2Var3.f2077a;
                    } else {
                        j5 = q2Var3.f2078b;
                    }
                    jB = j5;
                    z18 = false;
                }
                long j113 = jB;
                sVar.p(z18);
                l0.r0 r0Var110 = r0Var3;
                f1.b.a(w0.z1.f14024a.a(q2Var3.k), n1.h.e(-1886965181, new w0(pVar2, nVar, (n3.c) sVar.j(r2.j1.f11276h), z17, q2Var3, str, kVar, z16, r0Var4.d(new b3.r0(j113, 0L, null, 0L, 0, 0L, 16777214)), s0Var2, r0Var110, z15, i24, i25, l0Var3, kVar2, nVar4, l0Var4), sVar), sVar, 56);
                r0Var5 = r0Var4;
                z19 = z17;
                z20 = z16;
                r0Var6 = r0Var110;
                z21 = z15;
                i26 = i24;
                i27 = i25;
                l0Var5 = l0Var3;
                nVar5 = nVar4;
                q2Var4 = q2Var3;
                s0Var3 = s0Var2;
                l0Var6 = l0Var4;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new x0(str, kVar, pVar, z20, r0Var5, nVar, nVar5, z19, l0Var5, s0Var3, r0Var6, z21, i26, i27, l0Var6, q2Var4, i11, i12, i13);
            }
        }
        i18 = 14376960 | i17;
        z14 = z12;
        if ((i12 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_DOOR) == 0) {
            i21 = i7;
            if ((i13 & 262144) == 0) {
                i22 = 805306368;
                if (sVar.d(i21)) {
                    i28 = 67108864;
                }
                i18 |= i28;
            } else {
                i22 = 805306368;
            }
            i28 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_ZONE;
            i18 |= i28;
        } else {
            i21 = i7;
            i22 = 805306368;
        }
        int i35 = i18 | i22;
        if ((i30 & 306783379) != 306783378) {
            sVar.S();
            if ((i11 & 1) != 0) {
                b3.r0 r0Var111 = (b3.r0) sVar.j(u2.f2203a);
                if (i31 != 0) {
                    nVar3 = null;
                }
                if (i15 != 0) {
                    z13 = false;
                }
                if (i19 != 0) {
                    z14 = false;
                }
                if ((i13 & 262144) == 0) {
                    i23 = i21;
                } else if (z14) {
                    i23 = 1;
                } else {
                    i23 = Integer.MAX_VALUE;
                }
                t0 t0Var10 = t0.f2160a;
                y1.l0 l0VarA10 = l1.a(3, sVar);
                wVar = (w) sVar.j(y.f2319a);
                q2Var2 = wVar.P;
                sVar.W(1540400102);
                if (q2Var2 == null) {
                    long jC118 = y.c(wVar, 18);
                    long jC119 = y.c(wVar, 18);
                    long jB11 = y1.q.b(0.38f, y.c(wVar, 18));
                    long jC1110 = y.c(wVar, 18);
                    long j114 = y1.q.f14957l;
                    q2 q2Var14 = new q2(jC118, jC119, jB11, jC1110, j114, j114, j114, j114, y.c(wVar, 26), y.c(wVar, 2), (w0.y1) sVar.j(w0.z1.f14024a), y.c(wVar, 26), y.c(wVar, 24), y1.q.b(0.12f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 26), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19));
                    wVar.P = q2Var14;
                    q2Var2 = q2Var14;
                }
                sVar.p(false);
                b3.l0 l0Var16 = g3.e0.f5856a;
                l0.s0 s0Var13 = l0.s0.f7827a;
                r0Var3 = l0.r0.f7818a;
                nVar4 = nVar3;
                l0Var3 = l0Var16;
                s0Var2 = s0Var13;
                r0Var4 = r0Var111;
                i24 = i23;
                l0Var4 = l0VarA10;
                z15 = z14;
                q2Var3 = q2Var2;
                z16 = true;
                i25 = 1;
            } else {
                b3.r0 r0Var112 = (b3.r0) sVar.j(u2.f2203a);
                if (i31 != 0) {
                    nVar3 = null;
                }
                if (i15 != 0) {
                    z13 = false;
                }
                if (i19 != 0) {
                    z14 = false;
                }
                if ((i13 & 262144) == 0) {
                    i23 = i21;
                } else if (z14) {
                    i23 = 1;
                } else {
                    i23 = Integer.MAX_VALUE;
                }
                t0 t0Var11 = t0.f2160a;
                y1.l0 l0VarA11 = l1.a(3, sVar);
                wVar = (w) sVar.j(y.f2319a);
                q2Var2 = wVar.P;
                sVar.W(1540400102);
                if (q2Var2 == null) {
                    long jC1111 = y.c(wVar, 18);
                    long jC1112 = y.c(wVar, 18);
                    long jB12 = y1.q.b(0.38f, y.c(wVar, 18));
                    long jC1113 = y.c(wVar, 18);
                    long j115 = y1.q.f14957l;
                    q2 q2Var15 = new q2(jC1111, jC1112, jB12, jC1113, j115, j115, j115, j115, y.c(wVar, 26), y.c(wVar, 2), (w0.y1) sVar.j(w0.z1.f14024a), y.c(wVar, 26), y.c(wVar, 24), y1.q.b(0.12f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 26), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19));
                    wVar.P = q2Var15;
                    q2Var2 = q2Var15;
                }
                sVar.p(false);
                b3.l0 l0Var17 = g3.e0.f5856a;
                l0.s0 s0Var14 = l0.s0.f7827a;
                r0Var3 = l0.r0.f7818a;
                nVar4 = nVar3;
                l0Var3 = l0Var17;
                s0Var2 = s0Var14;
                r0Var4 = r0Var112;
                i24 = i23;
                l0Var4 = l0VarA11;
                z15 = z14;
                q2Var3 = q2Var2;
                z16 = true;
                i25 = 1;
            }
            z17 = z13;
            sVar.q();
            sVar.W(30062948);
            objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = ob.a.m(sVar);
            }
            kVar2 = (b0.k) objK;
            z18 = false;
            sVar.p(false);
            sVar.W(30069058);
            jB = r0Var4.b();
            if (jB == 16) {
                zBooleanValue = ((Boolean) a.a.r(kVar2, sVar, 0).getValue()).booleanValue();
                if (!z16) {
                    j5 = q2Var3.f2079c;
                } else if (z17) {
                    j5 = q2Var3.f2080d;
                } else if (zBooleanValue) {
                    j5 = q2Var3.f2077a;
                } else {
                    j5 = q2Var3.f2078b;
                }
                jB = j5;
                z18 = false;
            }
            long j116 = jB;
            sVar.p(z18);
            l0.r0 r0Var113 = r0Var3;
            f1.b.a(w0.z1.f14024a.a(q2Var3.k), n1.h.e(-1886965181, new w0(pVar2, nVar, (n3.c) sVar.j(r2.j1.f11276h), z17, q2Var3, str, kVar, z16, r0Var4.d(new b3.r0(j116, 0L, null, 0L, 0, 0L, 16777214)), s0Var2, r0Var113, z15, i24, i25, l0Var3, kVar2, nVar4, l0Var4), sVar), sVar, 56);
            r0Var5 = r0Var4;
            z19 = z17;
            z20 = z16;
            r0Var6 = r0Var113;
            z21 = z15;
            i26 = i24;
            i27 = i25;
            l0Var5 = l0Var3;
            nVar5 = nVar4;
            q2Var4 = q2Var3;
            s0Var3 = s0Var2;
            l0Var6 = l0Var4;
        } else {
            sVar.S();
            if ((i11 & 1) != 0) {
                b3.r0 r0Var114 = (b3.r0) sVar.j(u2.f2203a);
                if (i31 != 0) {
                    nVar3 = null;
                }
                if (i15 != 0) {
                    z13 = false;
                }
                if (i19 != 0) {
                    z14 = false;
                }
                if ((i13 & 262144) == 0) {
                    i23 = i21;
                } else if (z14) {
                    i23 = 1;
                } else {
                    i23 = Integer.MAX_VALUE;
                }
                t0 t0Var12 = t0.f2160a;
                y1.l0 l0VarA12 = l1.a(3, sVar);
                wVar = (w) sVar.j(y.f2319a);
                q2Var2 = wVar.P;
                sVar.W(1540400102);
                if (q2Var2 == null) {
                    long jC1114 = y.c(wVar, 18);
                    long jC1115 = y.c(wVar, 18);
                    long jB13 = y1.q.b(0.38f, y.c(wVar, 18));
                    long jC1116 = y.c(wVar, 18);
                    long j117 = y1.q.f14957l;
                    q2 q2Var16 = new q2(jC1114, jC1115, jB13, jC1116, j117, j117, j117, j117, y.c(wVar, 26), y.c(wVar, 2), (w0.y1) sVar.j(w0.z1.f14024a), y.c(wVar, 26), y.c(wVar, 24), y1.q.b(0.12f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 26), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19));
                    wVar.P = q2Var16;
                    q2Var2 = q2Var16;
                }
                sVar.p(false);
                b3.l0 l0Var18 = g3.e0.f5856a;
                l0.s0 s0Var15 = l0.s0.f7827a;
                r0Var3 = l0.r0.f7818a;
                nVar4 = nVar3;
                l0Var3 = l0Var18;
                s0Var2 = s0Var15;
                r0Var4 = r0Var114;
                i24 = i23;
                l0Var4 = l0VarA12;
                z15 = z14;
                q2Var3 = q2Var2;
                z16 = true;
                i25 = 1;
            } else {
                b3.r0 r0Var115 = (b3.r0) sVar.j(u2.f2203a);
                if (i31 != 0) {
                    nVar3 = null;
                }
                if (i15 != 0) {
                    z13 = false;
                }
                if (i19 != 0) {
                    z14 = false;
                }
                if ((i13 & 262144) == 0) {
                    i23 = i21;
                } else if (z14) {
                    i23 = 1;
                } else {
                    i23 = Integer.MAX_VALUE;
                }
                t0 t0Var13 = t0.f2160a;
                y1.l0 l0VarA13 = l1.a(3, sVar);
                wVar = (w) sVar.j(y.f2319a);
                q2Var2 = wVar.P;
                sVar.W(1540400102);
                if (q2Var2 == null) {
                    long jC1117 = y.c(wVar, 18);
                    long jC1118 = y.c(wVar, 18);
                    long jB14 = y1.q.b(0.38f, y.c(wVar, 18));
                    long jC1119 = y.c(wVar, 18);
                    long j118 = y1.q.f14957l;
                    q2 q2Var17 = new q2(jC1117, jC1118, jB14, jC1119, j118, j118, j118, j118, y.c(wVar, 26), y.c(wVar, 2), (w0.y1) sVar.j(w0.z1.f14024a), y.c(wVar, 26), y.c(wVar, 24), y1.q.b(0.12f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 26), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 18)), y.c(wVar, 2), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19), y.c(wVar, 19), y.c(wVar, 19), y1.q.b(0.38f, y.c(wVar, 19)), y.c(wVar, 19));
                    wVar.P = q2Var17;
                    q2Var2 = q2Var17;
                }
                sVar.p(false);
                b3.l0 l0Var19 = g3.e0.f5856a;
                l0.s0 s0Var16 = l0.s0.f7827a;
                r0Var3 = l0.r0.f7818a;
                nVar4 = nVar3;
                l0Var3 = l0Var19;
                s0Var2 = s0Var16;
                r0Var4 = r0Var115;
                i24 = i23;
                l0Var4 = l0VarA13;
                z15 = z14;
                q2Var3 = q2Var2;
                z16 = true;
                i25 = 1;
            }
            z17 = z13;
            sVar.q();
            sVar.W(30062948);
            objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = ob.a.m(sVar);
            }
            kVar2 = (b0.k) objK;
            z18 = false;
            sVar.p(false);
            sVar.W(30069058);
            jB = r0Var4.b();
            if (jB == 16) {
                zBooleanValue = ((Boolean) a.a.r(kVar2, sVar, 0).getValue()).booleanValue();
                if (!z16) {
                    j5 = q2Var3.f2079c;
                } else if (z17) {
                    j5 = q2Var3.f2080d;
                } else if (zBooleanValue) {
                    j5 = q2Var3.f2077a;
                } else {
                    j5 = q2Var3.f2078b;
                }
                jB = j5;
                z18 = false;
            }
            long j119 = jB;
            sVar.p(z18);
            l0.r0 r0Var116 = r0Var3;
            f1.b.a(w0.z1.f14024a.a(q2Var3.k), n1.h.e(-1886965181, new w0(pVar2, nVar, (n3.c) sVar.j(r2.j1.f11276h), z17, q2Var3, str, kVar, z16, r0Var4.d(new b3.r0(j119, 0L, null, 0L, 0, 0L, 16777214)), s0Var2, r0Var116, z15, i24, i25, l0Var3, kVar2, nVar4, l0Var4), sVar), sVar, 56);
            r0Var5 = r0Var4;
            z19 = z17;
            z20 = z16;
            r0Var6 = r0Var116;
            z21 = z15;
            i26 = i24;
            i27 = i25;
            l0Var5 = l0Var3;
            nVar5 = nVar4;
            q2Var4 = q2Var3;
            s0Var3 = s0Var2;
            l0Var6 = l0Var4;
        }
        w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new x0(str, kVar, pVar, z20, r0Var5, nVar, nVar5, z19, l0Var5, s0Var3, r0Var6, z21, i26, i27, l0Var6, q2Var4, i11, i12, i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
    public static final void b(h9.n nVar, h9.o oVar, h9.n nVar2, h9.n nVar3, h9.n nVar4, h9.n nVar5, h9.n nVar6, boolean z10, float f10, h9.k kVar, n1.c cVar, h9.n nVar7, d0.h0 h0Var, f1.s sVar, int i7, int i10) {
        int i11;
        int i12;
        d0.h0 h0Var2;
        r1.h hVar;
        h9.n nVar8;
        r1.h hVar2;
        int i13;
        float f11;
        h9.n nVar9;
        float f12;
        h9.n nVar10;
        boolean z11;
        h9.n nVar11 = nVar6;
        r1.h hVar3 = r1.c.f11096e;
        r1.h hVar4 = r1.c.f11092a;
        sVar.Y(1408290209);
        int i14 = i7 & 6;
        r1.m mVar = r1.m.f11116a;
        if (i14 == 0) {
            i11 = i7 | (sVar.f(mVar) ? 4 : 2);
        } else {
            i11 = i7;
        }
        if ((i7 & 48) == 0) {
            i11 |= sVar.h(nVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i11 |= sVar.h(oVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i11 |= sVar.h(nVar2) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i11 |= sVar.h(nVar3) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if ((196608 & i7) == 0) {
            i11 |= sVar.h(nVar4) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            i11 |= sVar.h(nVar5) ? 1048576 : 524288;
        }
        if ((12582912 & i7) == 0) {
            i11 |= sVar.h(nVar11) ? 8388608 : 4194304;
        }
        if ((100663296 & i7) == 0) {
            i11 |= sVar.g(z10) ? 67108864 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_ZONE;
        }
        if ((i7 & 805306368) == 0) {
            i11 |= sVar.c(f10) ? 536870912 : 268435456;
        }
        if ((i10 & 6) == 0) {
            i12 = i10 | (sVar.h(kVar) ? 4 : 2);
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= sVar.h(nVar7) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            h0Var2 = h0Var;
            i12 |= sVar.f(h0Var2) ? 2048 : 1024;
        } else {
            h0Var2 = h0Var;
        }
        int i15 = i12;
        if ((i11 & 306783379) == 306783378 && (i15 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
            nVar9 = nVar2;
            nVar10 = nVar7;
            f12 = f10;
        } else {
            boolean z12 = ((i15 & 14) == 4) | ((i11 & 234881024) == 67108864) | ((i11 & 1879048192) == 536870912) | ((i15 & 7168) == 2048);
            Object objK = sVar.K();
            if (z12 || objK == f1.n.f5051a) {
                objK = new e1(kVar, z10, f10, h0Var2);
                sVar.h0(objK);
            }
            e1 e1Var = (e1) objK;
            n3.o oVar2 = (n3.o) sVar.j(r2.j1.f11281n);
            int iP = f1.b.p(sVar);
            f1.q1 q1VarL = sVar.l();
            r1.p pVarC = r1.a.c(sVar, mVar);
            q2.j.f10719d0.getClass();
            q2.a0 a0Var = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            q2.h hVar5 = q2.i.f10708e;
            f1.b.w(sVar, hVar5, e1Var);
            q2.h hVar6 = q2.i.f10707d;
            f1.b.w(sVar, hVar6, q1VarL);
            q2.h hVar7 = q2.i.f10709f;
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(iP))) {
                ob.a.w(iP, sVar, iP, hVar7);
            }
            q2.h hVar8 = q2.i.f10706c;
            f1.b.w(sVar, hVar8, pVarC);
            cVar.invoke(sVar, Integer.valueOf((i15 >> 3) & 14));
            sVar.W(250370369);
            if (nVar3 != null) {
                r1.p pVarA = androidx.compose.ui.layout.a.c(mVar, "Leading").a(d1.r.f3743i);
                hVar = hVar3;
                o2.m0 m0VarD = d0.m.d(hVar, false);
                int iP2 = f1.b.p(sVar);
                f1.q1 q1VarL2 = sVar.l();
                r1.p pVarC2 = r1.a.c(sVar, pVarA);
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, hVar5, m0VarD);
                f1.b.w(sVar, hVar6, q1VarL2);
                if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(iP2))) {
                    ob.a.w(iP2, sVar, iP2, hVar7);
                }
                f1.b.w(sVar, hVar8, pVarC2);
                nVar3.invoke(sVar, Integer.valueOf((i11 >> 12) & 14));
                sVar.p(true);
            } else {
                hVar = hVar3;
            }
            ?? r15 = 0;
            sVar.p(false);
            sVar.W(250379492);
            if (nVar4 != null) {
                r1.p pVarA2 = androidx.compose.ui.layout.a.c(mVar, "Trailing").a(d1.r.f3743i);
                o2.m0 m0VarD2 = d0.m.d(hVar, false);
                int iP3 = f1.b.p(sVar);
                f1.q1 q1VarL3 = sVar.l();
                r1.p pVarC3 = r1.a.c(sVar, pVarA2);
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, hVar5, m0VarD2);
                f1.b.w(sVar, hVar6, q1VarL3);
                if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(iP3))) {
                    ob.a.w(iP3, sVar, iP3, hVar7);
                }
                f1.b.w(sVar, hVar8, pVarC3);
                nVar4.invoke(sVar, Integer.valueOf((i11 >> 15) & 14));
                sVar.p(true);
                r15 = 0;
            }
            sVar.p(r15);
            float fD = androidx.compose.foundation.layout.a.d(h0Var2, oVar2);
            float fB = oVar2 == n3.o.f8749a ? h0Var2.b(oVar2) : h0Var2.a(oVar2);
            if (nVar3 != null) {
                fD -= d1.r.f3737c;
                float f13 = (float) r15;
                if (fD < f13) {
                    fD = f13;
                }
            }
            float f14 = fD;
            if (nVar4 != null) {
                fB -= d1.r.f3737c;
                float f15 = (float) r15;
                if (fB < f15) {
                    fB = f15;
                }
            }
            sVar.W(250410106);
            if (nVar5 != null) {
                r1.p pVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.d(androidx.compose.ui.layout.a.c(mVar, "Prefix"), d1.r.f3740f, 0.0f, 2), 3), f14, 0.0f, d1.r.f3739e, 0.0f, 10);
                hVar2 = hVar4;
                o2.m0 m0VarD3 = d0.m.d(hVar2, false);
                int iP4 = f1.b.p(sVar);
                f1.q1 q1VarL4 = sVar.l();
                r1.p pVarC4 = r1.a.c(sVar, pVarK);
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, hVar5, m0VarD3);
                f1.b.w(sVar, hVar6, q1VarL4);
                if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(iP4))) {
                    ob.a.w(iP4, sVar, iP4, hVar7);
                }
                f1.b.w(sVar, hVar8, pVarC4);
                nVar8 = nVar5;
                nVar8.invoke(sVar, Integer.valueOf((i11 >> 18) & 14));
                sVar.p(true);
            } else {
                nVar8 = nVar5;
                hVar2 = hVar4;
            }
            sVar.p(false);
            sVar.W(250422072);
            if (nVar6 != null) {
                r1.p pVarK2 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.d(androidx.compose.ui.layout.a.c(mVar, "Suffix"), d1.r.f3740f, 0.0f, 2), 3), d1.r.f3739e, 0.0f, fB, 0.0f, 10);
                o2.m0 m0VarD4 = d0.m.d(hVar2, false);
                int iP5 = f1.b.p(sVar);
                f1.q1 q1VarL5 = sVar.l();
                r1.p pVarC5 = r1.a.c(sVar, pVarK2);
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, hVar5, m0VarD4);
                f1.b.w(sVar, hVar6, q1VarL5);
                if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(iP5))) {
                    ob.a.w(iP5, sVar, iP5, hVar7);
                }
                f1.b.w(sVar, hVar8, pVarC5);
                nVar11 = nVar6;
                nVar11.invoke(sVar, Integer.valueOf((i11 >> 21) & 14));
                sVar.p(true);
            } else {
                nVar11 = nVar6;
            }
            sVar.p(false);
            float f16 = d1.r.f3740f;
            r1.p pVarM = androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.d(mVar, f16, 0.0f, 2), 3);
            if (nVar8 == null) {
                f11 = f14;
                i13 = 0;
            } else {
                i13 = 0;
                f11 = 0;
            }
            r1.p pVarK3 = androidx.compose.foundation.layout.a.k(pVarM, f11, 0.0f, nVar11 == null ? fB : i13, 0.0f, 10);
            sVar.W(250444361);
            if (oVar != null) {
                oVar.invoke(androidx.compose.ui.layout.a.c(mVar, "Hint").a(pVarK3), sVar, Integer.valueOf((i11 >> 3) & 112));
            }
            sVar.p(false);
            r1.p pVarA3 = androidx.compose.ui.layout.a.c(mVar, "TextField").a(pVarK3);
            o2.m0 m0VarD5 = d0.m.d(hVar2, true);
            int iP6 = f1.b.p(sVar);
            f1.q1 q1VarL6 = sVar.l();
            r1.p pVarC6 = r1.a.c(sVar, pVarA3);
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, hVar5, m0VarD5);
            f1.b.w(sVar, hVar6, q1VarL6);
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(iP6))) {
                ob.a.w(iP6, sVar, iP6, hVar7);
            }
            f1.b.w(sVar, hVar8, pVarC6);
            nVar.invoke(sVar, Integer.valueOf((i11 >> 3) & 14));
            sVar.p(true);
            sVar.W(250455481);
            if (nVar2 != null) {
                f12 = f10;
                r1.p pVarC7 = androidx.compose.ui.layout.a.c(androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.d(mVar, n3.r.E(f16, d1.r.f3741g, f12), 0.0f, 2), 3), "Label");
                o2.m0 m0VarD6 = d0.m.d(hVar2, false);
                int iP7 = f1.b.p(sVar);
                f1.q1 q1VarL7 = sVar.l();
                r1.p pVarC8 = r1.a.c(sVar, pVarC7);
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, hVar5, m0VarD6);
                f1.b.w(sVar, hVar6, q1VarL7);
                if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(iP7))) {
                    ob.a.w(iP7, sVar, iP7, hVar7);
                }
                f1.b.w(sVar, hVar8, pVarC8);
                nVar9 = nVar2;
                nVar9.invoke(sVar, Integer.valueOf((i11 >> 9) & 14));
                sVar.p(true);
            } else {
                nVar9 = nVar2;
                f12 = f10;
            }
            sVar.p(false);
            sVar.W(250473414);
            if (nVar7 != null) {
                r1.p pVarM2 = androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.d(androidx.compose.ui.layout.a.c(mVar, "Supporting"), d1.r.f3742h, 0.0f, 2), 3);
                float f17 = d1.r.f3736b;
                r1.p pVarG = androidx.compose.foundation.layout.a.g(pVarM2, new d0.h0(f17, d1.r.f3738d, f17, 0));
                o2.m0 m0VarD7 = d0.m.d(hVar2, false);
                int iP8 = f1.b.p(sVar);
                f1.q1 q1VarL8 = sVar.l();
                r1.p pVarC9 = r1.a.c(sVar, pVarG);
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, hVar5, m0VarD7);
                f1.b.w(sVar, hVar6, q1VarL8);
                if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(iP8))) {
                    ob.a.w(iP8, sVar, iP8, hVar7);
                }
                f1.b.w(sVar, hVar8, pVarC9);
                nVar10 = nVar7;
                nVar10.invoke(sVar, Integer.valueOf((i15 >> 6) & 14));
                z11 = true;
                sVar.p(true);
            } else {
                nVar10 = nVar7;
                z11 = true;
            }
            sVar.p(false);
            sVar.p(z11);
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new y0(nVar, oVar, nVar9, nVar3, nVar4, nVar5, nVar11, z10, f12, kVar, cVar, nVar10, h0Var2, i7, i10);
        }
    }

    public static final int c(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, long j5, float f11, d0.h0 h0Var) {
        int[] iArr = {i15, i11, i12, n3.r.F(f10, i14, 0)};
        for (int i17 = 0; i17 < 4; i17++) {
            i13 = Math.max(i13, iArr[i17]);
        }
        float f12 = h0Var.f3572b * f11;
        return Math.max(n3.a.i(j5), Math.max(i7, Math.max(i10, k9.a.M(n3.r.E(f12, Math.max(f12, i14 / 2.0f), f10) + i13 + (h0Var.f3574d * f11)))) + i16);
    }

    public static final int d(int i7, int i10, int i11, int i12, int i13, int i14, int i15, float f10, long j5, float f11, d0.h0 h0Var) {
        int i16 = i11 + i12;
        int iMax = Math.max(i13 + i16, Math.max(i15 + i16, n3.r.F(f10, i14, 0))) + i7 + i10;
        n3.o oVar = n3.o.f8749a;
        return Math.max(iMax, Math.max(k9.a.M((i14 + ((h0Var.b(oVar) + h0Var.a(oVar)) * f11)) * f10), n3.a.j(j5)));
    }

    public static final int e(boolean z10, int i7, int i10, o2.v0 v0Var, o2.v0 v0Var2) {
        if (z10) {
            i10 = Math.round((1 + 0.0f) * ((i7 - v0Var2.f9436b) / 2.0f));
        }
        float f10 = d1.r.f3736b;
        return Math.max(i10, (v0Var != null ? v0Var.f9436b : 0) / 2);
    }
}

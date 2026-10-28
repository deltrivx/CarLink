package c1;

import androidx.compose.foundation.BorderModifierNodeElement;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f2160a = new t0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f2161b = 56;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f2162c = 280;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f2163d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f2164e = 2;

    /* JADX WARN: Code duplicated, block: B:100:0x0168  */
    /* JADX WARN: Code duplicated, block: B:102:0x016e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0195  */
    /* JADX WARN: Code duplicated, block: B:107:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:113:0x01da  */
    /* JADX WARN: Code duplicated, block: B:117:0x0226  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:86:0x011b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0120  */
    /* JADX WARN: Code duplicated, block: B:89:0x0124  */
    /* JADX WARN: Code duplicated, block: B:90:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0129  */
    /* JADX WARN: Code duplicated, block: B:92:0x012c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0133  */
    /* JADX WARN: Code duplicated, block: B:96:0x014a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0160  */
    public final void a(boolean z10, boolean z11, b0.k kVar, r1.p pVar, q2 q2Var, y1.l0 l0Var, float f10, float f11, f1.s sVar, int i7, int i10) {
        r1.p pVar2;
        int i11;
        int i12;
        int i13;
        float f12;
        float f13;
        r1.p pVar3;
        float f14;
        int i14;
        r1.p pVar4;
        float f15;
        boolean zBooleanValue;
        float f16;
        long j5;
        f1.w2 w2Var;
        float f17;
        v.t tVar;
        int i15;
        int i16;
        f1.w2 w2VarV;
        long j10;
        float f18;
        float f19;
        float f20;
        f1.w1 w1VarR;
        sVar.Y(1035477640);
        int i17 = (sVar.g(z10) ? 4 : 2) | i7 | (sVar.g(z11) ? 32 : 16) | (sVar.f(kVar) ? 256 : 128);
        int i18 = i10 & 8;
        if (i18 == 0) {
            if ((i7 & 3072) == 0) {
                pVar2 = pVar;
                i17 |= sVar.f(pVar2) ? 2048 : 1024;
            }
            if (sVar.f(q2Var)) {
                i11 = 16384;
            } else {
                i11 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
            }
            int i19 = i17 | i11;
            if (sVar.f(l0Var)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i13 = i19 | i12;
            if ((1572864 & i7) == 0) {
                if ((i10 & 64) == 0) {
                    f12 = f10;
                    int i20 = sVar.c(f12) ? 1048576 : 524288;
                    i13 |= i20;
                } else {
                    f12 = f10;
                }
                i13 |= i20;
            } else {
                f12 = f10;
            }
            if ((12582912 & i7) == 0) {
                if ((i10 & 128) == 0) {
                    f13 = f11;
                    int i21 = sVar.c(f13) ? 8388608 : 4194304;
                    i13 |= i21;
                } else {
                    f13 = f11;
                }
                i13 |= i21;
            } else {
                f13 = f11;
            }
            if ((38347923 & i13) == 38347922 || !sVar.z()) {
                sVar.S();
                if ((i7 & 1) != 0 || sVar.x()) {
                    if (i18 != 0) {
                        pVar3 = r1.m.f11116a;
                    } else {
                        pVar3 = pVar2;
                    }
                    if ((i10 & 64) != 0) {
                        i13 &= -3670017;
                        f14 = f2164e;
                    } else {
                        f14 = f12;
                    }
                    if ((i10 & 128) != 0) {
                        r1.p pVar5 = pVar3;
                        i14 = i13 & (-29360129);
                        pVar4 = pVar5;
                        f15 = f14;
                        f13 = f2163d;
                    } else {
                        r1.p pVar6 = pVar3;
                        i14 = i13;
                        pVar4 = pVar6;
                        f15 = f14;
                    }
                } else {
                    sVar.Q();
                    if ((i10 & 64) != 0) {
                        i13 &= -3670017;
                    }
                    if ((i10 & 128) != 0) {
                        i13 &= -29360129;
                    }
                    i14 = i13;
                    pVar4 = pVar2;
                    f15 = f12;
                }
                sVar.q();
                zBooleanValue = ((Boolean) a.a.r(kVar, sVar, (i14 >> 6) & 14).getValue()).booleanValue();
                float f21 = d1.r.f3736b;
                if (z10) {
                    f16 = f15;
                    if (z11) {
                        j5 = q2Var.f2090o;
                    } else if (zBooleanValue) {
                        j5 = q2Var.f2087l;
                    } else {
                        j5 = q2Var.f2088m;
                    }
                } else {
                    f16 = f15;
                    j5 = q2Var.f2089n;
                }
                if (z10) {
                    sVar.W(1023053998);
                    f1.w2 w2VarA = u.g.a(j5, v.d.k(150, 6, null), sVar, 48);
                    sVar.p(false);
                    w2Var = w2VarA;
                } else {
                    sVar.W(1023165505);
                    f1.b1 b1VarV = f1.b.v(new y1.q(j5), sVar);
                    sVar.p(false);
                    w2Var = b1VarV;
                }
                if (z10) {
                    sVar.W(1023269417);
                    if (zBooleanValue) {
                        f20 = f16;
                    } else {
                        f20 = f13;
                    }
                    v.v0 v0VarK = v.d.k(150, 6, null);
                    int i22 = v.e.f13353a;
                    tVar = null;
                    f17 = f13;
                    i15 = 0;
                    i16 = 6;
                    w2VarV = v.e.a(new n3.f(f20), v.d.f13346l, v0VarK, "DpAnimation", sVar, 384);
                    sVar.p(false);
                } else {
                    f17 = f13;
                    tVar = null;
                    i15 = 0;
                    i16 = 6;
                    sVar.W(1023478388);
                    w2VarV = f1.b.v(new n3.f(f17), sVar);
                    sVar.p(false);
                }
                f1.b1 b1VarV2 = f1.b.v(new x.q(((n3.f) w2VarV.getValue()).f8736a, new y1.n0(((y1.q) w2Var.getValue()).f14960a)), sVar);
                if (!z10) {
                    j10 = q2Var.f2083g;
                } else if (z11) {
                    j10 = q2Var.f2084h;
                } else if (zBooleanValue) {
                    j10 = q2Var.f2081e;
                } else {
                    j10 = q2Var.f2082f;
                }
                f1.w2 w2VarA2 = u.g.a(j10, v.d.k(150, i16, tVar), sVar, 48);
                x.q qVar = (x.q) b1VarV2.getValue();
                d0.m.a(androidx.compose.ui.draw.a.b(pVar4.a(new BorderModifierNodeElement(qVar.f14469a, qVar.f14470b, l0Var)), new a1(2, l0Var, new r2(new q0(0, 0, f1.w2.class, w2VarA2, "value", "getValue()Ljava/lang/Object;")))), sVar, i15);
                f18 = f16;
                f19 = f17;
            } else {
                sVar.Q();
                pVar4 = pVar2;
                f18 = f12;
                f19 = f13;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new r0(this, z10, z11, kVar, pVar4, q2Var, l0Var, f18, f19, i7, i10);
            }
        }
        i17 |= 3072;
        pVar2 = pVar;
        if (sVar.f(q2Var)) {
            i11 = 16384;
        } else {
            i11 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        int i110 = i17 | i11;
        if (sVar.f(l0Var)) {
            i12 = 131072;
        } else {
            i12 = 65536;
        }
        i13 = i110 | i12;
        if ((1572864 & i7) == 0) {
            if ((i10 & 64) == 0) {
                f12 = f10;
                if (sVar.c(f12)) {
                }
                i13 |= i20;
            } else {
                f12 = f10;
            }
            i13 |= i20;
        } else {
            f12 = f10;
        }
        if ((12582912 & i7) == 0) {
            if ((i10 & 128) == 0) {
                f13 = f11;
                if (sVar.c(f13)) {
                }
                i13 |= i21;
            } else {
                f13 = f11;
            }
            i13 |= i21;
        } else {
            f13 = f11;
        }
        if ((38347923 & i13) == 38347922) {
            sVar.S();
            if ((i7 & 1) != 0) {
                if (i18 != 0) {
                    pVar3 = r1.m.f11116a;
                } else {
                    pVar3 = pVar2;
                }
                if ((i10 & 64) != 0) {
                    i13 &= -3670017;
                    f14 = f2164e;
                } else {
                    f14 = f12;
                }
                if ((i10 & 128) != 0) {
                    r1.p pVar7 = pVar3;
                    i14 = i13 & (-29360129);
                    pVar4 = pVar7;
                    f15 = f14;
                    f13 = f2163d;
                } else {
                    r1.p pVar8 = pVar3;
                    i14 = i13;
                    pVar4 = pVar8;
                    f15 = f14;
                }
            } else {
                if (i18 != 0) {
                    pVar3 = r1.m.f11116a;
                } else {
                    pVar3 = pVar2;
                }
                if ((i10 & 64) != 0) {
                    i13 &= -3670017;
                    f14 = f2164e;
                } else {
                    f14 = f12;
                }
                if ((i10 & 128) != 0) {
                    r1.p pVar9 = pVar3;
                    i14 = i13 & (-29360129);
                    pVar4 = pVar9;
                    f15 = f14;
                    f13 = f2163d;
                } else {
                    r1.p pVar10 = pVar3;
                    i14 = i13;
                    pVar4 = pVar10;
                    f15 = f14;
                }
            }
            sVar.q();
            zBooleanValue = ((Boolean) a.a.r(kVar, sVar, (i14 >> 6) & 14).getValue()).booleanValue();
            float f22 = d1.r.f3736b;
            if (z10) {
                f16 = f15;
                j5 = q2Var.f2089n;
            } else {
                f16 = f15;
                if (z11) {
                    j5 = q2Var.f2090o;
                } else if (zBooleanValue) {
                    j5 = q2Var.f2087l;
                } else {
                    j5 = q2Var.f2088m;
                }
            }
            if (z10) {
                sVar.W(1023053998);
                f1.w2 w2VarA3 = u.g.a(j5, v.d.k(150, 6, null), sVar, 48);
                sVar.p(false);
                w2Var = w2VarA3;
            } else {
                sVar.W(1023165505);
                f1.b1 b1VarV3 = f1.b.v(new y1.q(j5), sVar);
                sVar.p(false);
                w2Var = b1VarV3;
            }
            if (z10) {
                sVar.W(1023269417);
                if (zBooleanValue) {
                    f20 = f16;
                } else {
                    f20 = f13;
                }
                v.v0 v0VarK2 = v.d.k(150, 6, null);
                int i23 = v.e.f13353a;
                tVar = null;
                f17 = f13;
                i15 = 0;
                i16 = 6;
                w2VarV = v.e.a(new n3.f(f20), v.d.f13346l, v0VarK2, "DpAnimation", sVar, 384);
                sVar.p(false);
            } else {
                f17 = f13;
                tVar = null;
                i15 = 0;
                i16 = 6;
                sVar.W(1023478388);
                w2VarV = f1.b.v(new n3.f(f17), sVar);
                sVar.p(false);
            }
            f1.b1 b1VarV4 = f1.b.v(new x.q(((n3.f) w2VarV.getValue()).f8736a, new y1.n0(((y1.q) w2Var.getValue()).f14960a)), sVar);
            if (!z10) {
                j10 = q2Var.f2083g;
            } else if (z11) {
                j10 = q2Var.f2084h;
            } else if (zBooleanValue) {
                j10 = q2Var.f2081e;
            } else {
                j10 = q2Var.f2082f;
            }
            f1.w2 w2VarA4 = u.g.a(j10, v.d.k(150, i16, tVar), sVar, 48);
            x.q qVar2 = (x.q) b1VarV4.getValue();
            d0.m.a(androidx.compose.ui.draw.a.b(pVar4.a(new BorderModifierNodeElement(qVar2.f14469a, qVar2.f14470b, l0Var)), new a1(2, l0Var, new r2(new q0(0, 0, f1.w2.class, w2VarA4, "value", "getValue()Ljava/lang/Object;")))), sVar, i15);
            f18 = f16;
            f19 = f17;
        } else {
            sVar.S();
            if ((i7 & 1) != 0) {
                if (i18 != 0) {
                    pVar3 = r1.m.f11116a;
                } else {
                    pVar3 = pVar2;
                }
                if ((i10 & 64) != 0) {
                    i13 &= -3670017;
                    f14 = f2164e;
                } else {
                    f14 = f12;
                }
                if ((i10 & 128) != 0) {
                    r1.p pVar11 = pVar3;
                    i14 = i13 & (-29360129);
                    pVar4 = pVar11;
                    f15 = f14;
                    f13 = f2163d;
                } else {
                    r1.p pVar12 = pVar3;
                    i14 = i13;
                    pVar4 = pVar12;
                    f15 = f14;
                }
            } else {
                if (i18 != 0) {
                    pVar3 = r1.m.f11116a;
                } else {
                    pVar3 = pVar2;
                }
                if ((i10 & 64) != 0) {
                    i13 &= -3670017;
                    f14 = f2164e;
                } else {
                    f14 = f12;
                }
                if ((i10 & 128) != 0) {
                    r1.p pVar13 = pVar3;
                    i14 = i13 & (-29360129);
                    pVar4 = pVar13;
                    f15 = f14;
                    f13 = f2163d;
                } else {
                    r1.p pVar14 = pVar3;
                    i14 = i13;
                    pVar4 = pVar14;
                    f15 = f14;
                }
            }
            sVar.q();
            zBooleanValue = ((Boolean) a.a.r(kVar, sVar, (i14 >> 6) & 14).getValue()).booleanValue();
            float f23 = d1.r.f3736b;
            if (z10) {
                f16 = f15;
                j5 = q2Var.f2089n;
            } else {
                f16 = f15;
                if (z11) {
                    j5 = q2Var.f2090o;
                } else if (zBooleanValue) {
                    j5 = q2Var.f2087l;
                } else {
                    j5 = q2Var.f2088m;
                }
            }
            if (z10) {
                sVar.W(1023053998);
                f1.w2 w2VarA5 = u.g.a(j5, v.d.k(150, 6, null), sVar, 48);
                sVar.p(false);
                w2Var = w2VarA5;
            } else {
                sVar.W(1023165505);
                f1.b1 b1VarV5 = f1.b.v(new y1.q(j5), sVar);
                sVar.p(false);
                w2Var = b1VarV5;
            }
            if (z10) {
                sVar.W(1023269417);
                if (zBooleanValue) {
                    f20 = f16;
                } else {
                    f20 = f13;
                }
                v.v0 v0VarK3 = v.d.k(150, 6, null);
                int i24 = v.e.f13353a;
                tVar = null;
                f17 = f13;
                i15 = 0;
                i16 = 6;
                w2VarV = v.e.a(new n3.f(f20), v.d.f13346l, v0VarK3, "DpAnimation", sVar, 384);
                sVar.p(false);
            } else {
                f17 = f13;
                tVar = null;
                i15 = 0;
                i16 = 6;
                sVar.W(1023478388);
                w2VarV = f1.b.v(new n3.f(f17), sVar);
                sVar.p(false);
            }
            f1.b1 b1VarV6 = f1.b.v(new x.q(((n3.f) w2VarV.getValue()).f8736a, new y1.n0(((y1.q) w2Var.getValue()).f14960a)), sVar);
            if (!z10) {
                j10 = q2Var.f2083g;
            } else if (z11) {
                j10 = q2Var.f2084h;
            } else if (zBooleanValue) {
                j10 = q2Var.f2081e;
            } else {
                j10 = q2Var.f2082f;
            }
            f1.w2 w2VarA6 = u.g.a(j10, v.d.k(150, i16, tVar), sVar, 48);
            x.q qVar3 = (x.q) b1VarV6.getValue();
            d0.m.a(androidx.compose.ui.draw.a.b(pVar4.a(new BorderModifierNodeElement(qVar3.f14469a, qVar3.f14470b, l0Var)), new a1(2, l0Var, new r2(new q0(0, 0, f1.w2.class, w2VarA6, "value", "getValue()Ljava/lang/Object;")))), sVar, i15);
            f18 = f16;
            f19 = f17;
        }
        w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new r0(this, z10, z11, kVar, pVar4, q2Var, l0Var, f18, f19, i7, i10);
        }
    }

    public final void b(String str, h9.n nVar, boolean z10, boolean z11, b3.l0 l0Var, b0.k kVar, boolean z12, h9.n nVar2, h9.n nVar3, q2 q2Var, d0.h0 h0Var, n1.c cVar, f1.s sVar, int i7) {
        int i10;
        boolean z13;
        boolean z14;
        b3.l0 l0Var2;
        int i11;
        d0.h0 h0Var2;
        d0.h0 h0Var3;
        sVar.Y(-350442135);
        if ((i7 & 6) == 0) {
            i10 = (sVar.f(str) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.h(nVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            z13 = z10;
            i10 |= sVar.g(z13) ? 256 : 128;
        } else {
            z13 = z10;
        }
        if ((i7 & 3072) == 0) {
            z14 = z11;
            i10 |= sVar.g(z14) ? 2048 : 1024;
        } else {
            z14 = z11;
        }
        int i12 = i7 & 24576;
        int i13 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        if (i12 == 0) {
            l0Var2 = l0Var;
            i10 |= sVar.f(l0Var2) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        } else {
            l0Var2 = l0Var;
        }
        if ((i7 & 196608) == 0) {
            i10 |= sVar.f(kVar) ? 131072 : 65536;
        }
        if ((i7 & 1572864) == 0) {
            i10 |= sVar.g(z12) ? 1048576 : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i10 |= sVar.h(nVar2) ? 8388608 : 4194304;
        }
        if ((i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_DOOR) == 0) {
            i10 |= sVar.h(null) ? 67108864 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_ZONE;
        }
        if ((i7 & 805306368) == 0) {
            i10 |= sVar.h(null) ? 536870912 : 268435456;
        }
        int i14 = 14155776 | (sVar.h(nVar3) ? 4 : 2) | (sVar.h(null) ? 32 : 16) | (sVar.h(null) ? 256 : 128) | (sVar.h(null) ? 2048 : 1024);
        if (sVar.f(q2Var)) {
            i13 = 16384;
        }
        int i15 = i14 | i13 | 65536;
        if ((306783379 & i10) == 306783378 && (4793491 & i15) == 4793490 && sVar.z()) {
            sVar.Q();
            h0Var3 = h0Var;
        } else {
            sVar.S();
            if ((i7 & 1) == 0 || sVar.x()) {
                float f10 = d1.r.f3736b;
                i11 = i15 & (-458753);
                h0Var2 = new d0.h0(f10, f10, f10, f10);
            } else {
                sVar.Q();
                i11 = i15 & (-458753);
                h0Var2 = h0Var;
            }
            sVar.q();
            int i16 = i10 << 3;
            int i17 = i10 >> 3;
            int i18 = (i17 & 7168) | (i16 & 896) | (i16 & 112) | 6;
            int i19 = i10 >> 9;
            int i20 = i11 << 21;
            d1.r.a(str, nVar, l0Var2, nVar2, nVar3, z14, z13, z12, kVar, h0Var2, q2Var, cVar, sVar, i18 | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016) | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), ((i11 >> 9) & 14) | ((i10 >> 6) & 112) | (i10 & 896) | (i19 & 7168) | (i17 & 57344) | ((i11 << 6) & 3670016) | 12582912);
            h0Var3 = h0Var2;
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new s0(this, str, nVar, z10, z11, l0Var, kVar, z12, nVar2, nVar3, q2Var, h0Var3, cVar, i7);
        }
    }
}

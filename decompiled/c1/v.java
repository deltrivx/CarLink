package c1;

import androidx.compose.material3.MinimumInteractiveModifier;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f2204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f2205b = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f2206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f2207d;

    static {
        float f10 = 2;
        f2204a = f10;
        f2206c = f10;
        f2207d = f10;
    }

    public static final void a(boolean z10, r1.p pVar, boolean z11, q qVar, f1.s sVar, int i7) {
        q qVar2;
        r1.p pVar2;
        boolean z12;
        r1.p pVar3;
        boolean z13;
        q qVar3;
        sVar.Y(-1406741137);
        if (((i7 | (sVar.g(z10) ? 4 : 2) | 208256) & 74899) == 74898 && sVar.z()) {
            sVar.Q();
            pVar3 = pVar;
            z13 = z11;
            qVar3 = qVar;
        } else {
            sVar.S();
            if ((i7 & 1) == 0 || sVar.x()) {
                w wVar = (w) sVar.j(y.f2319a);
                q qVar4 = wVar.M;
                if (qVar4 == null) {
                    long jC = y.c(wVar, e1.a.f3913d);
                    long j5 = y1.q.f14957l;
                    int i10 = e1.a.f3911b;
                    long jC2 = y.c(wVar, i10);
                    int i11 = e1.a.f3912c;
                    q qVar5 = new q(jC, j5, jC2, j5, y1.q.b(0.38f, y.c(wVar, i11)), j5, y1.q.b(0.38f, y.c(wVar, i11)), y.c(wVar, i10), y.c(wVar, e1.a.f3915f), y1.q.b(0.38f, y.c(wVar, i11)), y1.q.b(0.38f, y.c(wVar, e1.a.f3914e)), y1.q.b(0.38f, y.c(wVar, i11)));
                    wVar.M = qVar5;
                    qVar4 = qVar5;
                }
                qVar2 = qVar4;
                pVar2 = r1.m.f11116a;
                z12 = true;
            } else {
                sVar.Q();
                pVar2 = pVar;
                z12 = z11;
                qVar2 = qVar;
            }
            sVar.q();
            a3.a aVar = z10 ? a3.a.f28a : a3.a.f29b;
            sVar.W(1046936362);
            sVar.p(false);
            c(aVar, null, pVar2, z12, qVar2, sVar, 200064);
            pVar3 = pVar2;
            z13 = z12;
            qVar3 = qVar2;
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new r(z10, pVar3, z13, qVar3, i7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019f  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:125:0x01df  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:128:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:130:0x0204  */
    /* JADX WARN: Code duplicated, block: B:132:0x020a  */
    /* JADX WARN: Code duplicated, block: B:134:0x020d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0211  */
    /* JADX WARN: Code duplicated, block: B:139:0x0217  */
    /* JADX WARN: Code duplicated, block: B:140:0x021a  */
    /* JADX WARN: Code duplicated, block: B:141:0x021d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0223  */
    /* JADX WARN: Code duplicated, block: B:145:0x0226  */
    /* JADX WARN: Code duplicated, block: B:147:0x0229  */
    /* JADX WARN: Code duplicated, block: B:148:0x022c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0232  */
    /* JADX WARN: Code duplicated, block: B:151:0x0235  */
    /* JADX WARN: Code duplicated, block: B:153:0x0239  */
    /* JADX WARN: Code duplicated, block: B:155:0x0241  */
    /* JADX WARN: Code duplicated, block: B:157:0x0245  */
    /* JADX WARN: Code duplicated, block: B:160:0x0256  */
    /* JADX WARN: Code duplicated, block: B:164:0x0292  */
    /* JADX WARN: Code duplicated, block: B:90:0x0178  */
    /* JADX WARN: Code duplicated, block: B:93:0x0189  */
    /* JADX WARN: Code duplicated, block: B:94:0x018c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0190  */
    /* JADX WARN: Code duplicated, block: B:97:0x0193  */
    public static final void b(boolean z10, a3.a aVar, r1.p pVar, q qVar, f1.s sVar, int i7) {
        int i10;
        float f10;
        float f11;
        v.v e0Var;
        float f12;
        int i11;
        v.v vVarK;
        v.p0 p0VarB;
        Object objK;
        Object obj;
        p pVar2;
        long j5;
        int i12;
        f1.w2 w2VarA;
        Object obj2;
        int iOrdinal;
        long j10;
        f1.w2 w2VarV;
        int iOrdinal2;
        long j11;
        f1.w2 w2VarV2;
        boolean zF;
        Object objK2;
        int i13;
        int iOrdinal3;
        int i14;
        int iOrdinal4;
        sVar.Y(2007131616);
        if ((i7 & 6) == 0) {
            i10 = (sVar.g(z10) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.f(aVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.f(pVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= sVar.f(qVar) ? 2048 : 1024;
        }
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            v.s0 s0VarC = v.u0.c(aVar, sVar, (i10 >> 3) & 14, 2);
            f1.k1 k1Var = s0VarC.f13451b;
            v.w0 w0Var = v.d.f13345j;
            a3.a aVar2 = (a3.a) s0VarC.c();
            sVar.W(1800065638);
            int iOrdinal5 = aVar2.ordinal();
            float f13 = 0.0f;
            if (iOrdinal5 == 0) {
                f10 = 1.0f;
            } else if (iOrdinal5 != 1) {
                if (iOrdinal5 != 2) {
                    throw new cc.s();
                }
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            sVar.p(false);
            Float fValueOf = Float.valueOf(f10);
            a3.a aVar3 = (a3.a) k1Var.getValue();
            sVar.W(1800065638);
            int iOrdinal6 = aVar3.ordinal();
            if (iOrdinal6 == 0) {
                f11 = 1.0f;
            } else if (iOrdinal6 != 1) {
                if (iOrdinal6 != 2) {
                    throw new cc.s();
                }
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            sVar.p(false);
            Float fValueOf2 = Float.valueOf(f11);
            v.o0 o0VarE = s0VarC.e();
            sVar.W(1373301606);
            Object obj3 = o0VarE.f13421a;
            a3.a aVar4 = a3.a.f29b;
            if (obj3 == aVar4) {
                e0Var = v.d.k(100, 6, null);
            } else {
                e0Var = o0VarE.f13422b == aVar4 ? new v.e0(100) : v.d.j(7, null);
            }
            sVar.p(false);
            v.p0 p0VarB2 = v.u0.b(s0VarC, fValueOf, fValueOf2, e0Var, w0Var, sVar, 0);
            a3.a aVar5 = (a3.a) s0VarC.c();
            sVar.W(-1426969489);
            int iOrdinal7 = aVar5.ordinal();
            if (iOrdinal7 == 0 || iOrdinal7 == 1) {
                f12 = 0.0f;
            } else {
                if (iOrdinal7 != 2) {
                    throw new cc.s();
                }
                f12 = 1.0f;
            }
            sVar.p(false);
            Float fValueOf3 = Float.valueOf(f12);
            a3.a aVar6 = (a3.a) k1Var.getValue();
            sVar.W(-1426969489);
            int iOrdinal8 = aVar6.ordinal();
            if (iOrdinal8 != 0 && iOrdinal8 != 1) {
                if (iOrdinal8 != 2) {
                    throw new cc.s();
                }
                f13 = 1.0f;
            }
            sVar.p(false);
            Float fValueOf4 = Float.valueOf(f13);
            v.o0 o0VarE2 = s0VarC.e();
            sVar.W(-1324481169);
            if (o0VarE2.f13421a == aVar4) {
                vVarK = new v.e0(0);
            } else {
                if (o0VarE2.f13422b == aVar4) {
                    vVarK = new v.e0(100);
                } else {
                    i11 = 6;
                    vVarK = v.d.k(100, 6, null);
                }
                sVar.p(false);
                p0VarB = v.u0.b(s0VarC, fValueOf3, fValueOf4, vVarK, w0Var, sVar, 0);
                objK = sVar.K();
                obj = f1.n.f5051a;
                if (objK == obj) {
                    objK = new p();
                    sVar.h0(objK);
                }
                pVar2 = (p) objK;
                qVar.getClass();
                if (aVar == aVar4) {
                    j5 = qVar.f2065b;
                } else {
                    j5 = qVar.f2064a;
                }
                if (aVar == aVar4) {
                    i12 = 100;
                } else {
                    i12 = 50;
                }
                w2VarA = u.g.a(j5, v.d.k(i12, i11, null), sVar, 0);
                if (z10) {
                    iOrdinal4 = aVar.ordinal();
                    if (iOrdinal4 == 0) {
                        obj2 = obj;
                        j10 = qVar.f2066c;
                    } else if (iOrdinal4 != 1) {
                        if (iOrdinal4 != 2) {
                            throw new cc.s();
                        }
                        obj2 = obj;
                        j10 = qVar.f2066c;
                    } else {
                        obj2 = obj;
                        j10 = qVar.f2067d;
                    }
                } else {
                    obj2 = obj;
                    iOrdinal = aVar.ordinal();
                    if (iOrdinal != 0) {
                        j10 = qVar.f2068e;
                    } else if (iOrdinal != 1) {
                        j10 = qVar.f2069f;
                    } else {
                        if (iOrdinal == 2) {
                            throw new cc.s();
                        }
                        j10 = qVar.f2070g;
                    }
                }
                if (z10) {
                    sVar.W(-392211906);
                    if (aVar == aVar4) {
                        i14 = 100;
                    } else {
                        i14 = 50;
                    }
                    w2VarV = u.g.a(j10, v.d.k(i14, i11, null), sVar, 0);
                    sVar.p(false);
                } else {
                    sVar.W(-392031362);
                    w2VarV = f1.b.v(new y1.q(j10), sVar);
                    sVar.p(false);
                }
                if (z10) {
                    iOrdinal3 = aVar.ordinal();
                    if (iOrdinal3 == 0) {
                        j11 = qVar.f2071h;
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            throw new cc.s();
                        }
                        j11 = qVar.f2071h;
                    } else {
                        j11 = qVar.f2072i;
                    }
                } else {
                    iOrdinal2 = aVar.ordinal();
                    if (iOrdinal2 != 0) {
                        j11 = qVar.f2073j;
                    } else if (iOrdinal2 != 1) {
                        j11 = qVar.k;
                    } else {
                        if (iOrdinal2 == 2) {
                            throw new cc.s();
                        }
                        j11 = qVar.f2074l;
                    }
                }
                if (z10) {
                    sVar.W(-1725816497);
                    if (aVar == aVar4) {
                        i13 = 100;
                    } else {
                        i13 = 50;
                    }
                    w2VarV2 = u.g.a(j11, v.d.k(i13, 6, null), sVar, 0);
                    sVar.p(false);
                } else {
                    sVar.W(-1725635953);
                    w2VarV2 = f1.b.v(new y1.q(j11), sVar);
                    sVar.p(false);
                }
                r1.p pVarE = androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.n(pVar, 2));
                zF = sVar.f(w2VarV) | sVar.f(w2VarV2) | sVar.f(w2VarA) | sVar.f(p0VarB2) | sVar.f(p0VarB);
                objK2 = sVar.K();
                if (zF || objK2 == obj2) {
                    objK2 = new s(w2VarV, w2VarV2, w2VarA, p0VarB2, p0VarB, pVar2);
                    sVar.h0(objK2);
                }
                n3.u.a(0, sVar, (h9.k) objK2, pVarE);
            }
            i11 = 6;
            sVar.p(false);
            p0VarB = v.u0.b(s0VarC, fValueOf3, fValueOf4, vVarK, w0Var, sVar, 0);
            objK = sVar.K();
            obj = f1.n.f5051a;
            if (objK == obj) {
                objK = new p();
                sVar.h0(objK);
            }
            pVar2 = (p) objK;
            qVar.getClass();
            if (aVar == aVar4) {
                j5 = qVar.f2065b;
            } else {
                j5 = qVar.f2064a;
            }
            if (aVar == aVar4) {
                i12 = 100;
            } else {
                i12 = 50;
            }
            w2VarA = u.g.a(j5, v.d.k(i12, i11, null), sVar, 0);
            if (z10) {
                iOrdinal4 = aVar.ordinal();
                if (iOrdinal4 == 0) {
                    obj2 = obj;
                    j10 = qVar.f2066c;
                } else if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        throw new cc.s();
                    }
                    obj2 = obj;
                    j10 = qVar.f2066c;
                } else {
                    obj2 = obj;
                    j10 = qVar.f2067d;
                }
            } else {
                obj2 = obj;
                iOrdinal = aVar.ordinal();
                if (iOrdinal != 0) {
                    j10 = qVar.f2068e;
                } else if (iOrdinal != 1) {
                    j10 = qVar.f2069f;
                } else {
                    if (iOrdinal == 2) {
                        throw new cc.s();
                    }
                    j10 = qVar.f2070g;
                }
            }
            if (z10) {
                sVar.W(-392211906);
                if (aVar == aVar4) {
                    i14 = 100;
                } else {
                    i14 = 50;
                }
                w2VarV = u.g.a(j10, v.d.k(i14, i11, null), sVar, 0);
                sVar.p(false);
            } else {
                sVar.W(-392031362);
                w2VarV = f1.b.v(new y1.q(j10), sVar);
                sVar.p(false);
            }
            if (z10) {
                iOrdinal3 = aVar.ordinal();
                if (iOrdinal3 == 0) {
                    j11 = qVar.f2071h;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new cc.s();
                    }
                    j11 = qVar.f2071h;
                } else {
                    j11 = qVar.f2072i;
                }
            } else {
                iOrdinal2 = aVar.ordinal();
                if (iOrdinal2 != 0) {
                    j11 = qVar.f2073j;
                } else if (iOrdinal2 != 1) {
                    j11 = qVar.k;
                } else {
                    if (iOrdinal2 == 2) {
                        throw new cc.s();
                    }
                    j11 = qVar.f2074l;
                }
            }
            if (z10) {
                sVar.W(-1725816497);
                if (aVar == aVar4) {
                    i13 = 100;
                } else {
                    i13 = 50;
                }
                w2VarV2 = u.g.a(j11, v.d.k(i13, 6, null), sVar, 0);
                sVar.p(false);
            } else {
                sVar.W(-1725635953);
                w2VarV2 = f1.b.v(new y1.q(j11), sVar);
                sVar.p(false);
            }
            r1.p pVarE2 = androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.n(pVar, 2));
            zF = sVar.f(w2VarV) | sVar.f(w2VarV2) | sVar.f(w2VarA) | sVar.f(p0VarB2) | sVar.f(p0VarB);
            objK2 = sVar.K();
            if (zF) {
                objK2 = new s(w2VarV, w2VarV2, w2VarA, p0VarB2, p0VarB, pVar2);
                sVar.h0(objK2);
            } else {
                objK2 = new s(w2VarV, w2VarV2, w2VarA, p0VarB2, p0VarB, pVar2);
                sVar.h0(objK2);
            }
            n3.u.a(0, sVar, (h9.k) objK2, pVarE2);
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new t(z10, aVar, pVar, qVar, i7);
        }
    }

    public static final void c(a3.a aVar, h9.a aVar2, r1.p pVar, boolean z10, q qVar, f1.s sVar, int i7) {
        int i10;
        a3.a aVar3;
        f1.s sVar2;
        boolean z11;
        q qVar2;
        sVar.Y(-1608358065);
        if ((i7 & 6) == 0) {
            i10 = (sVar.f(aVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.h(aVar2) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.f(pVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= sVar.g(z10) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i10 |= sVar.f(qVar) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if ((196608 & i7) == 0) {
            i10 |= sVar.f(null) ? 131072 : 65536;
        }
        if ((74899 & i10) == 74898 && sVar.z()) {
            sVar.Q();
            aVar3 = aVar;
            sVar2 = sVar;
            qVar2 = qVar;
            z11 = z10;
        } else {
            sVar.S();
            if ((i7 & 1) != 0 && !sVar.x()) {
                sVar.Q();
            }
            sVar.q();
            sVar.W(-97239746);
            r1.p pVar2 = r1.m.f11116a;
            r1.p pVarB = aVar2 != null ? androidx.compose.foundation.selection.b.b(aVar, aVar2, h1.a(e1.a.f3910a / 2, sVar, 54, 4), new y2.g(1), z10) : pVar2;
            sVar.p(false);
            if (aVar2 != null) {
                f1.x2 x2Var = l0.f1978a;
                pVar2 = MinimumInteractiveModifier.f914a;
            }
            aVar3 = aVar;
            sVar2 = sVar;
            b(z10, aVar3, androidx.compose.foundation.layout.a.h(pVar.a(pVar2).a(pVarB), f2204a), qVar, sVar2, ((i10 >> 9) & 14) | ((i10 << 3) & 112) | ((i10 >> 3) & 7168));
            z11 = z10;
            qVar2 = qVar;
        }
        f1.w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new u(aVar3, aVar2, pVar, z11, qVar2, i7);
        }
    }
}

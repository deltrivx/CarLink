package c1;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1.g f1891a = new b1.g(0.16f, 0.1f, 0.08f, 0.1f);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v23 */
    public static final void a(h9.a aVar, r1.p pVar, boolean z10, y1.l0 l0Var, a aVar2, f fVar, d0.h0 h0Var, n1.c cVar, f1.s sVar, int i7) {
        int i10;
        float f10;
        boolean z11;
        v.k kVar;
        ?? r8;
        sVar.Y(650121315);
        if ((i7 & 6) == 0) {
            i10 = (sVar.h(aVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.f(pVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.g(z10) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= sVar.f(l0Var) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i10 |= sVar.f(aVar2) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if ((196608 & i7) == 0) {
            i10 |= sVar.f(fVar) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            i10 |= sVar.f(null) ? 1048576 : 524288;
        }
        if ((12582912 & i7) == 0) {
            i10 |= sVar.f(h0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i7) == 0) {
            i10 |= sVar.f(null) ? 67108864 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_ZONE;
        }
        if ((805306368 & i7) == 0) {
            i10 |= sVar.h(cVar) ? 536870912 : 268435456;
        }
        if ((306783379 & i10) == 306783378 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i7 & 1) != 0 && !sVar.x()) {
                sVar.Q();
            }
            sVar.q();
            sVar.W(-239156623);
            Object objK = sVar.K();
            Object obj = f1.n.f5051a;
            if (objK == obj) {
                objK = ob.a.m(sVar);
            }
            b0.k kVar2 = (b0.k) objK;
            sVar.p(false);
            long j5 = z10 ? aVar2.f1801a : aVar2.f1803c;
            long j10 = z10 ? aVar2.f1802b : aVar2.f1804d;
            sVar.W(-239150048);
            if (fVar == null) {
                kVar2 = kVar2;
                j10 = j10;
                r8 = 0;
                kVar = null;
            } else {
                int i11 = ((i10 >> 9) & 896) | ((i10 >> 6) & 14);
                Object objK2 = sVar.K();
                if (objK2 == obj) {
                    objK2 = new p1.p();
                    sVar.h0(objK2);
                }
                p1.p pVar2 = (p1.p) objK2;
                boolean zF = sVar.f(kVar2);
                Object objK3 = sVar.K();
                if (zF || objK3 == obj) {
                    objK3 = new d(kVar2, pVar2, null, 0);
                    sVar.h0(objK3);
                }
                f1.b.f(sVar, (h9.n) objK3, kVar2);
                b0.j jVar = (b0.j) u8.p.t0(pVar2);
                if (!z10) {
                    f10 = fVar.f1878e;
                } else if (jVar instanceof b0.m) {
                    f10 = fVar.f1875b;
                } else if (jVar instanceof b0.h) {
                    f10 = fVar.f1877d;
                } else {
                    f10 = jVar instanceof b0.d ? fVar.f1876c : fVar.f1874a;
                }
                Object objK4 = sVar.K();
                if (objK4 == obj) {
                    objK4 = new v.c(new n3.f(f10), v.d.f13346l, null, 12);
                    sVar.h0(objK4);
                }
                v.c cVar2 = (v.c) objK4;
                n3.f fVar2 = new n3.f(f10);
                boolean zH = ((((i11 & 896) ^ 384) > 256 && sVar.f(fVar)) || (i11 & 384) == 256) | sVar.h(cVar2) | sVar.c(f10) | ((((i11 & 14) ^ 6) > 4 && sVar.g(z10)) || (i11 & 6) == 4) | sVar.h(jVar);
                Object objK5 = sVar.K();
                if (zH || objK5 == obj) {
                    float f11 = f10;
                    z11 = false;
                    e eVar = new e(cVar2, f11, z10, fVar, jVar, null);
                    sVar.h0(eVar);
                    objK5 = eVar;
                } else {
                    z11 = false;
                }
                f1.b.f(sVar, (h9.n) objK5, fVar2);
                kVar = cVar2.f13326c;
                r8 = z11;
            }
            sVar.p(r8);
            float f12 = kVar != null ? ((n3.f) kVar.f13387b.getValue()).f8736a : (float) r8;
            r1.p pVarA = y2.k.a(pVar, g.f1884b);
            n1.c cVarE = n1.h.e(956488494, new i(j10, h0Var, cVar), sVar);
            f1.c0 c0Var = m2.f2009a;
            float f13 = ((n3.f) sVar.j(c0Var)).f8736a + ((float) r8);
            f1.u1 u1VarA = a0.f1805a.a(new y1.q(j10));
            f1.u1 u1VarA2 = c0Var.a(new n3.f(f13));
            f1.u1[] u1VarArr = new f1.u1[2];
            u1VarArr[r8] = u1VarA;
            u1VarArr[1] = u1VarA2;
            f1.b.b(u1VarArr, n1.h.e(1279702876, new l2(pVarA, l0Var, j5, f13, kVar2, z10, aVar, f12, cVarE), sVar), sVar, 56);
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new j(aVar, pVar, z10, l0Var, aVar2, fVar, h0Var, cVar, i7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:56:0x0132  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void b(r1.p pVar, y1.l0 l0Var, l lVar, m mVar, n1.c cVar, f1.s sVar, int i7, int i10) {
        int i11;
        l lVar2;
        int i12;
        m mVar2;
        int i13;
        l lVarF;
        m mVarE;
        m mVar3;
        float f10;
        Object objK;
        n1.c cVar2;
        l lVar3;
        m mVar4;
        f1.w1 w1VarR;
        sVar.Y(1179621553);
        if ((i7 & 6) == 0) {
            i11 = i7 | (sVar.f(pVar) ? 4 : 2);
        } else {
            i11 = i7;
        }
        int i14 = i11 | (sVar.f(l0Var) ? 32 : 16);
        if ((i10 & 4) == 0) {
            lVar2 = lVar;
            int i15 = sVar.f(lVar2) ? 256 : 128;
            i12 = i14 | i15;
            if ((i10 & 8) == 0) {
                mVar2 = mVar;
                i13 = sVar.f(mVar2) ? 2048 : 1024;
                if (((i12 | i13 | 24576) & 74899) == 74898 || !sVar.z()) {
                    sVar.S();
                    if ((i7 & 1) != 0 || sVar.x()) {
                        if ((i10 & 4) != 0) {
                            lVarF = f((w) sVar.j(y.f2319a));
                        } else {
                            lVarF = lVar2;
                        }
                        if ((i10 & 8) != 0) {
                            mVarE = e(0.0f, 63);
                        } else {
                            mVarE = mVar2;
                        }
                        mVar3 = mVarE;
                    } else {
                        sVar.Q();
                        lVarF = lVar2;
                        mVar3 = mVar2;
                    }
                    sVar.q();
                    long j5 = lVarF.f1974a;
                    long j10 = lVarF.f1975b;
                    f10 = mVar3.f1989a;
                    sVar.W(-1763481333);
                    sVar.W(-734838460);
                    objK = sVar.K();
                    if (objK == f1.n.f5051a) {
                        objK = f1.b.s(new n3.f(f10));
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    sVar.p(false);
                    float f11 = ((n3.f) ((f1.b1) objK).getValue()).f8736a;
                    cVar2 = cVar;
                    n1.c cVarE = n1.h.e(664103990, new n(0, cVar2), sVar);
                    f1.c0 c0Var = m2.f2009a;
                    float f12 = ((n3.f) sVar.j(c0Var)).f8736a + 0;
                    f1.b.b(new f1.u1[]{a0.f1805a.a(new y1.q(j10)), c0Var.a(new n3.f(f12))}, n1.h.e(-70914509, new k2(pVar, l0Var, j5, f12, f11, cVarE), sVar), sVar, 56);
                    lVar3 = lVarF;
                    mVar4 = mVar3;
                } else {
                    sVar.Q();
                    cVar2 = cVar;
                    mVar4 = mVar2;
                    lVar3 = lVar2;
                }
                w1VarR = sVar.r();
                if (w1VarR != null) {
                    w1VarR.f5192d = new o(pVar, l0Var, lVar3, mVar4, cVar2, i7, i10);
                }
            }
            mVar2 = mVar;
            if (((i12 | i13 | 24576) & 74899) == 74898) {
                sVar.S();
                if ((i7 & 1) != 0) {
                    if ((i10 & 4) != 0) {
                        lVarF = f((w) sVar.j(y.f2319a));
                    } else {
                        lVarF = lVar2;
                    }
                    if ((i10 & 8) != 0) {
                        mVarE = e(0.0f, 63);
                    } else {
                        mVarE = mVar2;
                    }
                    mVar3 = mVarE;
                } else {
                    if ((i10 & 4) != 0) {
                        lVarF = f((w) sVar.j(y.f2319a));
                    } else {
                        lVarF = lVar2;
                    }
                    if ((i10 & 8) != 0) {
                        mVarE = e(0.0f, 63);
                    } else {
                        mVarE = mVar2;
                    }
                    mVar3 = mVarE;
                }
                sVar.q();
                long j11 = lVarF.f1974a;
                long j12 = lVarF.f1975b;
                f10 = mVar3.f1989a;
                sVar.W(-1763481333);
                sVar.W(-734838460);
                objK = sVar.K();
                if (objK == f1.n.f5051a) {
                    objK = f1.b.s(new n3.f(f10));
                    sVar.h0(objK);
                }
                sVar.p(false);
                sVar.p(false);
                float f13 = ((n3.f) ((f1.b1) objK).getValue()).f8736a;
                cVar2 = cVar;
                n1.c cVarE2 = n1.h.e(664103990, new n(0, cVar2), sVar);
                f1.c0 c0Var2 = m2.f2009a;
                float f14 = ((n3.f) sVar.j(c0Var2)).f8736a + 0;
                f1.b.b(new f1.u1[]{a0.f1805a.a(new y1.q(j12)), c0Var2.a(new n3.f(f14))}, n1.h.e(-70914509, new k2(pVar, l0Var, j11, f14, f13, cVarE2), sVar), sVar, 56);
                lVar3 = lVarF;
                mVar4 = mVar3;
            } else {
                sVar.S();
                if ((i7 & 1) != 0) {
                    if ((i10 & 4) != 0) {
                        lVarF = f((w) sVar.j(y.f2319a));
                    } else {
                        lVarF = lVar2;
                    }
                    if ((i10 & 8) != 0) {
                        mVarE = e(0.0f, 63);
                    } else {
                        mVarE = mVar2;
                    }
                    mVar3 = mVarE;
                } else {
                    if ((i10 & 4) != 0) {
                        lVarF = f((w) sVar.j(y.f2319a));
                    } else {
                        lVarF = lVar2;
                    }
                    if ((i10 & 8) != 0) {
                        mVarE = e(0.0f, 63);
                    } else {
                        mVarE = mVar2;
                    }
                    mVar3 = mVarE;
                }
                sVar.q();
                long j13 = lVarF.f1974a;
                long j14 = lVarF.f1975b;
                f10 = mVar3.f1989a;
                sVar.W(-1763481333);
                sVar.W(-734838460);
                objK = sVar.K();
                if (objK == f1.n.f5051a) {
                    objK = f1.b.s(new n3.f(f10));
                    sVar.h0(objK);
                }
                sVar.p(false);
                sVar.p(false);
                float f15 = ((n3.f) ((f1.b1) objK).getValue()).f8736a;
                cVar2 = cVar;
                n1.c cVarE3 = n1.h.e(664103990, new n(0, cVar2), sVar);
                f1.c0 c0Var3 = m2.f2009a;
                float f16 = ((n3.f) sVar.j(c0Var3)).f8736a + 0;
                f1.b.b(new f1.u1[]{a0.f1805a.a(new y1.q(j14)), c0Var3.a(new n3.f(f16))}, n1.h.e(-70914509, new k2(pVar, l0Var, j13, f16, f15, cVarE3), sVar), sVar, 56);
                lVar3 = lVarF;
                mVar4 = mVar3;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new o(pVar, l0Var, lVar3, mVar4, cVar2, i7, i10);
            }
        }
        lVar2 = lVar;
        i12 = i14 | i15;
        if ((i10 & 8) == 0) {
            mVar2 = mVar;
            if (sVar.f(mVar2)) {
            }
            if (((i12 | i13 | 24576) & 74899) == 74898) {
                sVar.S();
                if ((i7 & 1) != 0) {
                    if ((i10 & 4) != 0) {
                        lVarF = f((w) sVar.j(y.f2319a));
                    } else {
                        lVarF = lVar2;
                    }
                    if ((i10 & 8) != 0) {
                        mVarE = e(0.0f, 63);
                    } else {
                        mVarE = mVar2;
                    }
                    mVar3 = mVarE;
                } else {
                    if ((i10 & 4) != 0) {
                        lVarF = f((w) sVar.j(y.f2319a));
                    } else {
                        lVarF = lVar2;
                    }
                    if ((i10 & 8) != 0) {
                        mVarE = e(0.0f, 63);
                    } else {
                        mVarE = mVar2;
                    }
                    mVar3 = mVarE;
                }
                sVar.q();
                long j15 = lVarF.f1974a;
                long j16 = lVarF.f1975b;
                f10 = mVar3.f1989a;
                sVar.W(-1763481333);
                sVar.W(-734838460);
                objK = sVar.K();
                if (objK == f1.n.f5051a) {
                    objK = f1.b.s(new n3.f(f10));
                    sVar.h0(objK);
                }
                sVar.p(false);
                sVar.p(false);
                float f17 = ((n3.f) ((f1.b1) objK).getValue()).f8736a;
                cVar2 = cVar;
                n1.c cVarE4 = n1.h.e(664103990, new n(0, cVar2), sVar);
                f1.c0 c0Var4 = m2.f2009a;
                float f18 = ((n3.f) sVar.j(c0Var4)).f8736a + 0;
                f1.b.b(new f1.u1[]{a0.f1805a.a(new y1.q(j16)), c0Var4.a(new n3.f(f18))}, n1.h.e(-70914509, new k2(pVar, l0Var, j15, f18, f17, cVarE4), sVar), sVar, 56);
                lVar3 = lVarF;
                mVar4 = mVar3;
            } else {
                sVar.S();
                if ((i7 & 1) != 0) {
                    if ((i10 & 4) != 0) {
                        lVarF = f((w) sVar.j(y.f2319a));
                    } else {
                        lVarF = lVar2;
                    }
                    if ((i10 & 8) != 0) {
                        mVarE = e(0.0f, 63);
                    } else {
                        mVarE = mVar2;
                    }
                    mVar3 = mVarE;
                } else {
                    if ((i10 & 4) != 0) {
                        lVarF = f((w) sVar.j(y.f2319a));
                    } else {
                        lVarF = lVar2;
                    }
                    if ((i10 & 8) != 0) {
                        mVarE = e(0.0f, 63);
                    } else {
                        mVarE = mVar2;
                    }
                    mVar3 = mVarE;
                }
                sVar.q();
                long j17 = lVarF.f1974a;
                long j18 = lVarF.f1975b;
                f10 = mVar3.f1989a;
                sVar.W(-1763481333);
                sVar.W(-734838460);
                objK = sVar.K();
                if (objK == f1.n.f5051a) {
                    objK = f1.b.s(new n3.f(f10));
                    sVar.h0(objK);
                }
                sVar.p(false);
                sVar.p(false);
                float f19 = ((n3.f) ((f1.b1) objK).getValue()).f8736a;
                cVar2 = cVar;
                n1.c cVarE5 = n1.h.e(664103990, new n(0, cVar2), sVar);
                f1.c0 c0Var5 = m2.f2009a;
                float f110 = ((n3.f) sVar.j(c0Var5)).f8736a + 0;
                f1.b.b(new f1.u1[]{a0.f1805a.a(new y1.q(j18)), c0Var5.a(new n3.f(f110))}, n1.h.e(-70914509, new k2(pVar, l0Var, j17, f110, f19, cVarE5), sVar), sVar, 56);
                lVar3 = lVarF;
                mVar4 = mVar3;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new o(pVar, l0Var, lVar3, mVar4, cVar2, i7, i10);
            }
        }
        mVar2 = mVar;
        if (((i12 | i13 | 24576) & 74899) == 74898) {
            sVar.S();
            if ((i7 & 1) != 0) {
                if ((i10 & 4) != 0) {
                    lVarF = f((w) sVar.j(y.f2319a));
                } else {
                    lVarF = lVar2;
                }
                if ((i10 & 8) != 0) {
                    mVarE = e(0.0f, 63);
                } else {
                    mVarE = mVar2;
                }
                mVar3 = mVarE;
            } else {
                if ((i10 & 4) != 0) {
                    lVarF = f((w) sVar.j(y.f2319a));
                } else {
                    lVarF = lVar2;
                }
                if ((i10 & 8) != 0) {
                    mVarE = e(0.0f, 63);
                } else {
                    mVarE = mVar2;
                }
                mVar3 = mVarE;
            }
            sVar.q();
            long j19 = lVarF.f1974a;
            long j110 = lVarF.f1975b;
            f10 = mVar3.f1989a;
            sVar.W(-1763481333);
            sVar.W(-734838460);
            objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = f1.b.s(new n3.f(f10));
                sVar.h0(objK);
            }
            sVar.p(false);
            sVar.p(false);
            float f111 = ((n3.f) ((f1.b1) objK).getValue()).f8736a;
            cVar2 = cVar;
            n1.c cVarE6 = n1.h.e(664103990, new n(0, cVar2), sVar);
            f1.c0 c0Var6 = m2.f2009a;
            float f112 = ((n3.f) sVar.j(c0Var6)).f8736a + 0;
            f1.b.b(new f1.u1[]{a0.f1805a.a(new y1.q(j110)), c0Var6.a(new n3.f(f112))}, n1.h.e(-70914509, new k2(pVar, l0Var, j19, f112, f111, cVarE6), sVar), sVar, 56);
            lVar3 = lVarF;
            mVar4 = mVar3;
        } else {
            sVar.S();
            if ((i7 & 1) != 0) {
                if ((i10 & 4) != 0) {
                    lVarF = f((w) sVar.j(y.f2319a));
                } else {
                    lVarF = lVar2;
                }
                if ((i10 & 8) != 0) {
                    mVarE = e(0.0f, 63);
                } else {
                    mVarE = mVar2;
                }
                mVar3 = mVarE;
            } else {
                if ((i10 & 4) != 0) {
                    lVarF = f((w) sVar.j(y.f2319a));
                } else {
                    lVarF = lVar2;
                }
                if ((i10 & 8) != 0) {
                    mVarE = e(0.0f, 63);
                } else {
                    mVarE = mVar2;
                }
                mVar3 = mVarE;
            }
            sVar.q();
            long j111 = lVarF.f1974a;
            long j112 = lVarF.f1975b;
            f10 = mVar3.f1989a;
            sVar.W(-1763481333);
            sVar.W(-734838460);
            objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = f1.b.s(new n3.f(f10));
                sVar.h0(objK);
            }
            sVar.p(false);
            sVar.p(false);
            float f113 = ((n3.f) ((f1.b1) objK).getValue()).f8736a;
            cVar2 = cVar;
            n1.c cVarE7 = n1.h.e(664103990, new n(0, cVar2), sVar);
            f1.c0 c0Var7 = m2.f2009a;
            float f114 = ((n3.f) sVar.j(c0Var7)).f8736a + 0;
            f1.b.b(new f1.u1[]{a0.f1805a.a(new y1.q(j112)), c0Var7.a(new n3.f(f114))}, n1.h.e(-70914509, new k2(pVar, l0Var, j111, f114, f113, cVarE7), sVar), sVar, 56);
            lVar3 = lVarF;
            mVar4 = mVar3;
        }
        w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new o(pVar, l0Var, lVar3, mVar4, cVar2, i7, i10);
        }
    }

    public static final void c(h9.a aVar, r1.p pVar, boolean z10, y1.l0 l0Var, a aVar2, f fVar, d0.h0 h0Var, n1.c cVar, f1.s sVar, int i7) {
        a aVar3;
        y1.l0 l0Var2;
        f fVar2;
        d0.h0 h0Var2;
        a aVar4;
        boolean z11;
        boolean z12;
        y1.l0 l0Var3;
        a aVar5;
        f fVar3;
        d0.h0 h0Var3;
        sVar.Y(-1717924381);
        if (((i7 | 114894208) & 306783379) == 306783378 && sVar.z()) {
            sVar.Q();
            z12 = z10;
            l0Var3 = l0Var;
            aVar5 = aVar2;
            fVar3 = fVar;
            h0Var3 = h0Var;
        } else {
            sVar.S();
            if ((i7 & 1) == 0 || sVar.x()) {
                d0.h0 h0Var4 = b.f1815a;
                y1.l0 l0VarA = l1.a(e1.i.f3981b, sVar);
                w wVar = (w) sVar.j(y.f2319a);
                a aVar6 = wVar.K;
                if (aVar6 == null) {
                    aVar3 = new a(y.c(wVar, 32), y.c(wVar, e1.i.f3986g), y1.q.b(0.12f, y.c(wVar, e1.i.f3982c)), y1.q.b(0.38f, y.c(wVar, e1.i.f3983d)));
                    wVar.K = aVar3;
                } else {
                    aVar3 = aVar6;
                }
                l0Var2 = l0VarA;
                fVar2 = new f(e1.i.f3980a, e1.i.f3987h, e1.i.f3984e, e1.i.f3985f, 0);
                h0Var2 = b.f1815a;
                aVar4 = aVar3;
                z11 = true;
            } else {
                sVar.Q();
                z11 = z10;
                l0Var2 = l0Var;
                aVar4 = aVar2;
                fVar2 = fVar;
                h0Var2 = h0Var;
            }
            sVar.q();
            a(aVar, pVar, z11, l0Var2, aVar4, fVar2, h0Var2, cVar, sVar, 920125878);
            z12 = z11;
            l0Var3 = l0Var2;
            aVar5 = aVar4;
            fVar3 = fVar2;
            h0Var3 = h0Var2;
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new k(aVar, pVar, z12, l0Var3, aVar5, fVar3, h0Var3, cVar, i7);
        }
    }

    public static final void d(r1.p pVar, float f10, long j5, f1.s sVar, int i7) {
        sVar.Y(75144485);
        if (((i7 | 134) & 147) == 146 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i7 & 1) == 0 || sVar.x()) {
                int i10 = e0.f1867a;
                float f11 = e1.e.f3967a;
                j5 = y.c((w) sVar.j(y.f2319a), 25);
                pVar = r1.m.f11116a;
            } else {
                sVar.Q();
            }
            sVar.q();
            r1.p pVarB = androidx.compose.foundation.layout.c.b(pVar.a(androidx.compose.foundation.layout.c.f820a), f10);
            boolean zE = sVar.e(j5);
            Object objK = sVar.K();
            if (zE || objK == f1.n.f5051a) {
                objK = new f0(f10, j5);
                sVar.h0(objK);
            }
            n3.u.a(0, sVar, (h9.k) objK, pVarB);
        }
        r1.p pVar2 = pVar;
        long j10 = j5;
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new g0(pVar2, f10, j10, i7);
        }
    }

    public static m e(float f10, int i7) {
        if ((i7 & 1) != 0) {
            f10 = e1.h.f3972a;
        }
        return new m(f10, e1.h.f3979h, e1.h.f3977f, e1.h.f3978g, e1.h.f3976e, e1.h.f3974c);
    }

    public static l f(w wVar) {
        l lVar = wVar.L;
        if (lVar != null) {
            return lVar;
        }
        float f10 = e1.h.f3972a;
        l lVar2 = new l(y.c(wVar, 39), y.a(wVar, y.c(wVar, 39)), y1.h0.k(y1.q.b(e1.h.f3975d, y.c(wVar, e1.h.f3973b)), y.c(wVar, 39)), y1.q.b(0.38f, y.a(wVar, y.c(wVar, 39))));
        wVar.L = lVar2;
        return lVar2;
    }
}

package b3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f1381a = n3.r.D(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f1382b = n3.r.D(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f1383c = y1.q.f14957l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m3.o f1384d;

    static {
        long j5 = y1.q.f14948b;
        f1384d = j5 != 16 ? new m3.c(j5) : m3.n.f8425a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015d  */
    /* JADX WARN: Code duplicated, block: B:101:0x0160  */
    /* JADX WARN: Code duplicated, block: B:103:0x0164  */
    /* JADX WARN: Code duplicated, block: B:104:0x0167  */
    /* JADX WARN: Code duplicated, block: B:106:0x016a  */
    /* JADX WARN: Code duplicated, block: B:108:0x016f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0178  */
    /* JADX WARN: Code duplicated, block: B:113:0x017c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0181  */
    /* JADX WARN: Code duplicated, block: B:116:0x0184  */
    /* JADX WARN: Code duplicated, block: B:119:0x018a  */
    /* JADX WARN: Code duplicated, block: B:120:0x018d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0193  */
    /* JADX WARN: Code duplicated, block: B:124:0x019a  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Code duplicated, block: B:82:0x0116  */
    /* JADX WARN: Code duplicated, block: B:84:0x0125  */
    /* JADX WARN: Code duplicated, block: B:85:0x012b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0131  */
    /* JADX WARN: Code duplicated, block: B:88:0x013a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0140  */
    /* JADX WARN: Code duplicated, block: B:92:0x0144  */
    /* JADX WARN: Code duplicated, block: B:95:0x0151  */
    /* JADX WARN: Code duplicated, block: B:97:0x0156  */
    /* JADX WARN: Code duplicated, block: B:98:0x0159  */
    public static final h0 a(h0 h0Var, long j5, y1.m mVar, float f10, long j10, f3.k kVar, f3.i iVar, f3.j jVar, f3.n nVar, String str, long j11, m3.a aVar, m3.p pVar, i3.b bVar, long j12, m3.l lVar, y1.k0 k0Var, y yVar, a2.h hVar) {
        m3.a aVar2;
        y1.k0 k0Var2;
        y yVar2;
        a2.h hVar2;
        m3.o cVar;
        long j13;
        f3.k kVar2;
        f3.i iVar2;
        m3.p pVar2;
        i3.b bVar2;
        long j14;
        m3.l lVar2;
        y yVar3;
        long jT;
        f3.j jVar2 = jVar;
        f3.n nVar2 = nVar;
        String str2 = str;
        long j15 = j11;
        n3.s[] sVarArr = n3.q.f8753b;
        long j16 = j10 & 1095216660480L;
        if ((j16 == 0 || n3.q.a(j10, h0Var.f1357b)) && ((mVar != null || j5 == 16 || y1.q.c(j5, h0Var.f1356a.b())) && ((iVar == null || iVar.equals(h0Var.f1359d)) && ((kVar == null || kVar.equals(h0Var.f1358c)) && ((nVar2 == null || nVar2 == h0Var.f1361f) && (((j15 & 1095216660480L) == 0 || n3.q.a(j15, h0Var.f1363h)) && ((lVar == null || lVar.equals(h0Var.f1367m)) && i9.l.a(mVar, h0Var.f1356a.e()) && ((mVar == null || f10 == h0Var.f1356a.a()) && ((jVar2 == null || jVar2.equals(h0Var.f1360e)) && (str2 == null || str2.equals(h0Var.f1362g))))))))))) {
            if (aVar != null) {
                aVar2 = aVar;
                if (aVar2.equals(h0Var.f1364i)) {
                }
                cVar = m3.n.f8425a;
                if (mVar != null) {
                    if (mVar instanceof y1.n0) {
                        jT = g5.a.T(f10, ((y1.n0) mVar).f14942a);
                        if (jT != 16) {
                            cVar = new m3.c(jT);
                        }
                    } else {
                        if (!(mVar instanceof y1.j0)) {
                            throw new cc.s();
                        }
                        cVar = new m3.b((y1.j0) mVar, f10);
                    }
                } else if (j5 != 16) {
                    cVar = new m3.c(j5);
                }
                m3.o oVarC = h0Var.f1356a.c(cVar);
                if (nVar2 == null) {
                    nVar2 = h0Var.f1361f;
                }
                if (j16 == 0) {
                    j13 = h0Var.f1357b;
                } else {
                    j13 = j10;
                }
                if (kVar == null) {
                    kVar2 = h0Var.f1358c;
                } else {
                    kVar2 = kVar;
                }
                if (iVar == null) {
                    iVar2 = h0Var.f1359d;
                } else {
                    iVar2 = iVar;
                }
                if (jVar2 == null) {
                    jVar2 = h0Var.f1360e;
                }
                if (str2 == null) {
                    str2 = h0Var.f1362g;
                }
                if ((j15 & 1095216660480L) == 0) {
                    j15 = h0Var.f1363h;
                }
                if (aVar2 == null) {
                    aVar2 = h0Var.f1364i;
                }
                if (pVar == null) {
                    pVar2 = h0Var.f1365j;
                } else {
                    pVar2 = pVar;
                }
                if (bVar == null) {
                    bVar2 = h0Var.k;
                } else {
                    bVar2 = bVar;
                }
                if (j12 != 16) {
                    j14 = j12;
                } else {
                    j14 = h0Var.f1366l;
                }
                if (lVar == null) {
                    lVar2 = h0Var.f1367m;
                } else {
                    lVar2 = lVar;
                }
                if (k0Var2 == null) {
                    k0Var2 = h0Var.f1368n;
                }
                long j17 = j14;
                yVar3 = h0Var.f1369o;
                if (yVar3 == null) {
                    yVar3 = yVar2;
                }
                if (hVar2 == null) {
                    hVar2 = h0Var.f1370p;
                }
                return new h0(oVarC, j13, kVar2, iVar2, jVar2, nVar2, str2, j15, aVar2, pVar2, bVar2, j17, lVar2, k0Var2, yVar3, hVar2);
            }
            aVar2 = aVar;
            if (pVar == null || pVar.equals(h0Var.f1365j)) {
                if (bVar == null || bVar.equals(h0Var.k)) {
                    if (j12 == 16 || y1.q.c(j12, h0Var.f1366l)) {
                        k0Var2 = k0Var;
                        if (k0Var2 == null || k0Var2.equals(h0Var.f1368n)) {
                            yVar2 = yVar;
                            if (yVar2 == null || yVar2.equals(h0Var.f1369o)) {
                                hVar2 = hVar;
                                if (hVar2 == null || hVar2.equals(h0Var.f1370p)) {
                                    return h0Var;
                                }
                            }
                        }
                        hVar2 = hVar;
                    }
                    yVar2 = yVar;
                    hVar2 = hVar;
                }
            }
            cVar = m3.n.f8425a;
            if (mVar != null) {
                if (mVar instanceof y1.n0) {
                    jT = g5.a.T(f10, ((y1.n0) mVar).f14942a);
                    if (jT != 16) {
                        cVar = new m3.c(jT);
                    }
                } else {
                    if (!(mVar instanceof y1.j0)) {
                        throw new cc.s();
                    }
                    cVar = new m3.b((y1.j0) mVar, f10);
                }
            } else if (j5 != 16) {
                cVar = new m3.c(j5);
            }
            m3.o oVarC2 = h0Var.f1356a.c(cVar);
            if (nVar2 == null) {
                nVar2 = h0Var.f1361f;
            }
            if (j16 == 0) {
                j13 = h0Var.f1357b;
            } else {
                j13 = j10;
            }
            if (kVar == null) {
                kVar2 = h0Var.f1358c;
            } else {
                kVar2 = kVar;
            }
            if (iVar == null) {
                iVar2 = h0Var.f1359d;
            } else {
                iVar2 = iVar;
            }
            if (jVar2 == null) {
                jVar2 = h0Var.f1360e;
            }
            if (str2 == null) {
                str2 = h0Var.f1362g;
            }
            if ((j15 & 1095216660480L) == 0) {
                j15 = h0Var.f1363h;
            }
            if (aVar2 == null) {
                aVar2 = h0Var.f1364i;
            }
            if (pVar == null) {
                pVar2 = h0Var.f1365j;
            } else {
                pVar2 = pVar;
            }
            if (bVar == null) {
                bVar2 = h0Var.k;
            } else {
                bVar2 = bVar;
            }
            if (j12 != 16) {
                j14 = j12;
            } else {
                j14 = h0Var.f1366l;
            }
            if (lVar == null) {
                lVar2 = h0Var.f1367m;
            } else {
                lVar2 = lVar;
            }
            if (k0Var2 == null) {
                k0Var2 = h0Var.f1368n;
            }
            long j18 = j14;
            yVar3 = h0Var.f1369o;
            if (yVar3 == null) {
                yVar3 = yVar2;
            }
            if (hVar2 == null) {
                hVar2 = h0Var.f1370p;
            }
            return new h0(oVarC2, j13, kVar2, iVar2, jVar2, nVar2, str2, j15, aVar2, pVar2, bVar2, j18, lVar2, k0Var2, yVar3, hVar2);
        }
        aVar2 = aVar;
        k0Var2 = k0Var;
        yVar2 = yVar;
        hVar2 = hVar;
        cVar = m3.n.f8425a;
        if (mVar != null) {
            if (mVar instanceof y1.n0) {
                jT = g5.a.T(f10, ((y1.n0) mVar).f14942a);
                if (jT != 16) {
                    cVar = new m3.c(jT);
                }
            } else {
                if (!(mVar instanceof y1.j0)) {
                    throw new cc.s();
                }
                cVar = new m3.b((y1.j0) mVar, f10);
            }
        } else if (j5 != 16) {
            cVar = new m3.c(j5);
        }
        m3.o oVarC3 = h0Var.f1356a.c(cVar);
        if (nVar2 == null) {
            nVar2 = h0Var.f1361f;
        }
        if (j16 == 0) {
            j13 = h0Var.f1357b;
        } else {
            j13 = j10;
        }
        if (kVar == null) {
            kVar2 = h0Var.f1358c;
        } else {
            kVar2 = kVar;
        }
        if (iVar == null) {
            iVar2 = h0Var.f1359d;
        } else {
            iVar2 = iVar;
        }
        if (jVar2 == null) {
            jVar2 = h0Var.f1360e;
        }
        if (str2 == null) {
            str2 = h0Var.f1362g;
        }
        if ((j15 & 1095216660480L) == 0) {
            j15 = h0Var.f1363h;
        }
        if (aVar2 == null) {
            aVar2 = h0Var.f1364i;
        }
        if (pVar == null) {
            pVar2 = h0Var.f1365j;
        } else {
            pVar2 = pVar;
        }
        if (bVar == null) {
            bVar2 = h0Var.k;
        } else {
            bVar2 = bVar;
        }
        if (j12 != 16) {
            j14 = j12;
        } else {
            j14 = h0Var.f1366l;
        }
        if (lVar == null) {
            lVar2 = h0Var.f1367m;
        } else {
            lVar2 = lVar;
        }
        if (k0Var2 == null) {
            k0Var2 = h0Var.f1368n;
        }
        long j19 = j14;
        yVar3 = h0Var.f1369o;
        if (yVar3 == null) {
            yVar3 = yVar2;
        }
        if (hVar2 == null) {
            hVar2 = h0Var.f1370p;
        }
        return new h0(oVarC3, j13, kVar2, iVar2, jVar2, nVar2, str2, j15, aVar2, pVar2, bVar2, j19, lVar2, k0Var2, yVar3, hVar2);
    }

    public static final Object b(float f10, Object obj, Object obj2) {
        return ((double) f10) < 0.5d ? obj : obj2;
    }

    public static final long c(float f10, long j5, long j10) {
        n3.s[] sVarArr = n3.q.f8753b;
        long j11 = j5 & 1095216660480L;
        if (j11 != 0) {
            long j12 = 1095216660480L & j10;
            if (j12 != 0) {
                if (j11 == 0 || j12 == 0) {
                    n3.i.a("Cannot perform operation for Unspecified type.");
                }
                if (!n3.s.a(n3.q.b(j5), n3.q.b(j10))) {
                    n3.i.a("Cannot perform operation for " + ((Object) n3.s.b(n3.q.b(j5))) + " and " + ((Object) n3.s.b(n3.q.b(j10))));
                }
                return n3.r.K(n3.r.E(n3.q.c(j5), n3.q.c(j10), f10), j11);
            }
        }
        return ((n3.q) b(f10, new n3.q(j5), new n3.q(j10))).f8755a;
    }
}

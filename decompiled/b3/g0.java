package b3;

import a8.y0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0.k f1349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0.k f1350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u0.k f1351c;

    static {
        int i7 = 18;
        f1349a = new u0.k(i7, new a0(22), new b0(4));
        f1350b = new u0.k(i7, new a0(23), new b0(5));
        f1351c = new u0.k(i7, new a0(24), new b0(6));
    }

    public static b a(String str, r0 r0Var, long j5, n3.c cVar, f3.d dVar, int i7, int i10) {
        u8.w wVar = u8.w.f13122a;
        return new b(new j3.d(str, r0Var, wVar, wVar, dVar, cVar), i7, 1, j5);
    }

    public static final long b(int i7, int i10) {
        if (i7 < 0 || i10 < 0) {
            h3.a.a("start and end cannot be negative. [start: " + i7 + ", end: " + i10 + ']');
        }
        long j5 = (((long) i10) & 4294967295L) | (((long) i7) << 32);
        int i11 = q0.f1429c;
        return j5;
    }

    public static final long c(int i7, long j5) {
        int i10 = q0.f1429c;
        int i11 = (int) (j5 >> 32);
        int i12 = i11 < 0 ? 0 : i11;
        if (i12 > i7) {
            i12 = i7;
        }
        int i13 = (int) (4294967295L & j5);
        int i14 = i13 >= 0 ? i13 : 0;
        if (i14 <= i7) {
            i7 = i14;
        }
        return (i12 == i11 && i7 == i13) ? j5 : b(i12, i7);
    }

    public static final int d(int i7, List list) {
        int i10;
        byte b10;
        int i11 = ((s) u8.p.s0(list)).f1443c;
        if (i7 > ((s) u8.p.s0(list)).f1443c) {
            h3.a.a("Index " + i7 + " should be less or equal than last line's end " + i11);
        }
        int size = list.size() - 1;
        int i12 = 0;
        while (true) {
            if (i12 > size) {
                i10 = -(i12 + 1);
                break;
            }
            i10 = (i12 + size) >>> 1;
            s sVar = (s) list.get(i10);
            if (sVar.f1442b > i7) {
                b10 = 1;
            } else {
                b10 = sVar.f1443c <= i7 ? (byte) -1 : (byte) 0;
            }
            if (b10 >= 0) {
                if (b10 <= 0) {
                    break;
                }
                size = i10 - 1;
            } else {
                i12 = i10 + 1;
            }
        }
        if (i10 >= 0 && i10 < list.size()) {
            return i10;
        }
        StringBuilder sbT = ob.a.t("Found paragraph index ", " should be in range [0, ", i10);
        sbT.append(list.size());
        sbT.append(").\nDebug info: index=");
        sbT.append(i7);
        sbT.append(", paragraphs=[");
        sbT.append(p3.a.a(list, null, new y0(11), 31));
        sbT.append(']');
        h3.a.a(sbT.toString());
        return i10;
    }

    public static final int e(int i7, List list) {
        byte b10;
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            s sVar = (s) list.get(i11);
            if (sVar.f1444d > i7) {
                b10 = 1;
            } else {
                b10 = sVar.f1445e <= i7 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i10 = i11 + 1;
            } else {
                if (b10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final int f(ArrayList arrayList, float f10) {
        byte b10;
        if (f10 <= 0.0f) {
            return 0;
        }
        if (f10 >= ((s) u8.p.s0(arrayList)).f1447g) {
            return n3.l.A(arrayList);
        }
        int size = arrayList.size() - 1;
        int i7 = 0;
        while (i7 <= size) {
            int i10 = (i7 + size) >>> 1;
            s sVar = (s) arrayList.get(i10);
            if (sVar.f1446f > f10) {
                b10 = 1;
            } else {
                b10 = sVar.f1447g <= f10 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i7 = i10 + 1;
            } else {
                if (b10 <= 0) {
                    return i10;
                }
                size = i10 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static final void g(ArrayList arrayList, long j5, h9.k kVar) {
        int size = arrayList.size();
        for (int iD = d(q0.f(j5), arrayList); iD < size; iD++) {
            s sVar = (s) arrayList.get(iD);
            if (sVar.f1442b >= q0.e(j5)) {
                return;
            }
            if (sVar.f1442b != sVar.f1443c) {
                kVar.invoke(sVar);
            }
        }
    }

    public static final r0 h(r0 r0Var, n3.o oVar) {
        int i7;
        h0 h0Var = r0Var.f1438a;
        m3.o oVar2 = j0.f1384d;
        m3.o oVarD = h0Var.f1356a.d(new i0(0));
        long j5 = h0Var.f1357b;
        n3.s[] sVarArr = n3.q.f8753b;
        if ((j5 & 1095216660480L) == 0) {
            j5 = j0.f1381a;
        }
        long j10 = j5;
        f3.k kVar = h0Var.f1358c;
        if (kVar == null) {
            kVar = f3.k.f5258c;
        }
        f3.k kVar2 = kVar;
        f3.i iVar = h0Var.f1359d;
        f3.i iVar2 = new f3.i(iVar != null ? iVar.f5255a : 0);
        f3.j jVar = h0Var.f1360e;
        f3.j jVar2 = new f3.j(jVar != null ? jVar.f5256a : 65535);
        f3.n nVar = h0Var.f1361f;
        if (nVar == null) {
            nVar = f3.n.f5263a;
        }
        f3.n nVar2 = nVar;
        String str = h0Var.f1362g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j11 = h0Var.f1363h;
        if ((j11 & 1095216660480L) == 0) {
            j11 = j0.f1382b;
        }
        long j12 = j11;
        m3.a aVar = h0Var.f1364i;
        m3.a aVar2 = new m3.a(aVar != null ? aVar.f8401a : 0.0f);
        m3.p pVar = h0Var.f1365j;
        if (pVar == null) {
            pVar = m3.p.f8426c;
        }
        m3.p pVar2 = pVar;
        i3.b bVarN = h0Var.k;
        if (bVarN == null) {
            i3.b bVar = i3.b.f6613c;
            bVarN = i3.d.f6616a.n();
        }
        i3.b bVar2 = bVarN;
        long j13 = h0Var.f1366l;
        if (j13 == 16) {
            j13 = j0.f1383c;
        }
        long j14 = j13;
        m3.l lVar = h0Var.f1367m;
        if (lVar == null) {
            lVar = m3.l.f8420b;
        }
        m3.l lVar2 = lVar;
        y1.k0 k0Var = h0Var.f1368n;
        if (k0Var == null) {
            k0Var = y1.k0.f14924d;
        }
        y1.k0 k0Var2 = k0Var;
        y yVar = h0Var.f1369o;
        a2.h hVar = h0Var.f1370p;
        if (hVar == null) {
            hVar = a2.j.f23a;
        }
        h0 h0Var2 = new h0(oVarD, j10, kVar2, iVar2, jVar2, nVar2, str2, j12, aVar2, pVar2, bVar2, j14, lVar2, k0Var2, yVar, hVar);
        v vVar = r0Var.f1439b;
        int i10 = w.f1463b;
        int i11 = vVar.f1453a;
        int i12 = i11 == Integer.MIN_VALUE ? 5 : i11;
        int i13 = vVar.f1454b;
        if (i13 == 3) {
            int iOrdinal = oVar.ordinal();
            if (iOrdinal == 0) {
                i7 = 4;
            } else {
                if (iOrdinal != 1) {
                    throw new cc.s();
                }
                i7 = 5;
            }
        } else if (i13 == Integer.MIN_VALUE) {
            int iOrdinal2 = oVar.ordinal();
            if (iOrdinal2 == 0) {
                i7 = 1;
            } else {
                if (iOrdinal2 != 1) {
                    throw new cc.s();
                }
                i7 = 2;
            }
        } else {
            i7 = i13;
        }
        long j15 = vVar.f1455c;
        if ((j15 & 1095216660480L) == 0) {
            j15 = w.f1462a;
        }
        m3.q qVar = vVar.f1456d;
        if (qVar == null) {
            qVar = m3.q.f8429c;
        }
        m3.q qVar2 = qVar;
        x xVar = vVar.f1457e;
        m3.i iVar3 = vVar.f1458f;
        int i14 = vVar.f1459g;
        if (i14 == 0) {
            i14 = m3.e.f8406b;
        }
        int i15 = i14;
        int i16 = vVar.f1460h;
        int i17 = i16 == Integer.MIN_VALUE ? 1 : i16;
        m3.s sVar = vVar.f1461i;
        if (sVar == null) {
            sVar = m3.s.f8433c;
        }
        return new r0(h0Var2, new v(i12, i7, j15, qVar2, xVar, iVar3, i15, i17, sVar), r0Var.f1440c);
    }
}

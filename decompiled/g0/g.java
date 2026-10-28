package g0;

import cc.r1;
import h0.q0;
import java.util.Map;
import l0.q1;
import s.h0;
import t8.z;
import w0.d1;
import x.o1;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5642a;

    public /* synthetic */ g(int i7) {
        this.f5642a = i7;
    }

    public /* synthetic */ g(int i7, int i10) {
        this.f5642a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0103 A[LOOP:0: B:30:0x00bc->B:43:0x0103, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x0106 A[SYNTHETIC] */
    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        y8.b bVar;
        int i7 = this.f5642a;
        z zVar = z.f12851a;
        switch (i7) {
            case 0:
                ((Integer) obj2).getClass();
                return new b(1);
            case 1:
                v vVar = (v) obj2;
                return n3.l.J(Integer.valueOf(vVar.f5741d.f4839b.f()), Integer.valueOf(vVar.f5741d.f4840c.f()));
            case 2:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 3:
                Map mapB = ((q0) obj2).b();
                if (mapB.isEmpty()) {
                    return null;
                }
                return mapB;
            case 4:
                y8.f fVar = (y8.f) obj2;
                if (!(fVar instanceof r1)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? fVar : Integer.valueOf(iIntValue + 1);
            case 5:
                r1 r1Var = (r1) obj;
                y8.f fVar2 = (y8.f) obj2;
                if (r1Var != null) {
                    return r1Var;
                }
                if (fVar2 instanceof r1) {
                    return (r1) fVar2;
                }
                return null;
            case 6:
                return (hc.v) obj;
            case 7:
                q1 q1Var = (q1) obj2;
                return n3.l.J(Float.valueOf(q1Var.f7803a.f()), Boolean.valueOf(((x0) q1Var.f7808f.getValue()) == x0.f15591a));
            case 8:
                ((Integer) obj2).getClass();
                i2.c.i(f1.b.y(1), (f1.s) obj);
                return zVar;
            case 9:
                ((Integer) obj2).getClass();
                i2.c.b(f1.b.y(1), (f1.s) obj);
                return zVar;
            case 10:
                i9.l.e((y1.o) obj, "<this>");
                return zVar;
            case 11:
                o1.d dVar = (o1.d) obj2;
                Map map = dVar.f9274a;
                h0 h0Var = dVar.f9275b;
                Object[] objArr = h0Var.f12438b;
                Object[] objArr2 = h0Var.f12439c;
                long[] jArr = h0Var.f12437a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j5 = jArr[i10];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j5) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                    Object obj3 = objArr[i13];
                                    Map mapB2 = ((o1.f) objArr2[i13]).b();
                                    if (mapB2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapB2);
                                    }
                                }
                                j5 >>= 8;
                            }
                            if (i11 == 8) {
                                if (i10 != length) {
                                    i10++;
                                }
                            }
                        } else if (i10 != length) {
                            i10++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 12:
                return obj2;
            case 13:
                return Long.valueOf(((d1) obj2).f13765d.get());
            case 14:
                return Integer.valueOf(((o1) obj2).f14445a.f());
            case 15:
                String str = (String) obj;
                y8.f fVar3 = (y8.f) obj2;
                i9.l.e(str, "acc");
                i9.l.e(fVar3, "element");
                if (str.length() == 0) {
                    return fVar3.toString();
                }
                return str + ", " + fVar3;
            default:
                y8.h hVar = (y8.h) obj;
                y8.f fVar4 = (y8.f) obj2;
                i9.l.e(hVar, "acc");
                i9.l.e(fVar4, "element");
                y8.h hVarH = hVar.h(fVar4.getKey());
                y8.i iVar = y8.i.f15108a;
                if (hVarH == iVar) {
                    return fVar4;
                }
                y8.d dVar2 = y8.d.f15107a;
                y8.e eVar = (y8.e) hVarH.l(dVar2);
                if (eVar == null) {
                    bVar = new y8.b(fVar4, hVarH);
                } else {
                    y8.h hVarH2 = hVarH.h(dVar2);
                    if (hVarH2 == iVar) {
                        return new y8.b(eVar, fVar4);
                    }
                    bVar = new y8.b(eVar, new y8.b(fVar4, hVarH2));
                }
                return bVar;
        }
    }
}

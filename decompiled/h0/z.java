package h0;

import a8.f1;
import f1.b1;
import f1.k1;
import f1.t1;
import f1.w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b4.c f6410a = new b4.c(4);

    public static final void a(h9.a aVar, r1.p pVar, i0 i0Var, f0.m mVar, f1.s sVar, int i7) {
        sVar.Y(1055276397);
        int i10 = (sVar.h(aVar) ? 4 : 2) | i7 | (sVar.f(pVar) ? 32 : 16) | (sVar.f(i0Var) ? 256 : 128) | (sVar.f(mVar) ? 2048 : 1024);
        if (sVar.N(i10 & 1, (i10 & 1171) != 1170)) {
            c(n1.h.e(-933153643, new androidx.compose.foundation.lazy.layout.c(i0Var, pVar, mVar, f1.b.v(aVar, sVar)), sVar), sVar, 6);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new w(aVar, pVar, i0Var, mVar, i7);
        }
    }

    public static final void b(final Object obj, final int i7, final f0 f0Var, final n1.c cVar, f1.s sVar, final int i10) {
        int i11;
        sVar.Y(872548579);
        if ((i10 & 6) == 0) {
            i11 = (sVar.h(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= sVar.d(i7) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= sVar.h(f0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if (sVar.N(i11 & 1, (i11 & 1171) != 1170)) {
            boolean zF = sVar.f(obj) | sVar.f(f0Var);
            Object objK = sVar.K();
            Object obj2 = f1.n.f5051a;
            if (zF || objK == obj2) {
                objK = new d0(obj, f0Var);
                sVar.h0(objK);
            }
            d0 d0Var = (d0) objK;
            d0Var.f6302c = i7;
            k1 k1Var = d0Var.f6306g;
            t1 t1Var = o2.t0.f9427a;
            d0 d0Var2 = (d0) sVar.j(t1Var);
            p1.f fVarH = n4.e.h();
            h9.k kVarE = fVarH != null ? fVarH.e() : null;
            p1.f fVarK = n4.e.k(fVarH);
            try {
                if (d0Var2 != ((d0) k1Var.getValue())) {
                    k1Var.setValue(d0Var2);
                    if (d0Var.f6303d > 0) {
                        d0 d0Var3 = d0Var.f6304e;
                        if (d0Var3 != null) {
                            d0Var3.b();
                        }
                        if (d0Var2 != null) {
                            d0Var2.a();
                        } else {
                            d0Var2 = null;
                        }
                        d0Var.f6304e = d0Var2;
                    }
                }
                n4.e.r(fVarH, fVarK, kVarE);
                boolean zF2 = sVar.f(d0Var);
                Object objK2 = sVar.K();
                if (zF2 || objK2 == obj2) {
                    objK2 = new c8.k(14, d0Var);
                    sVar.h0(objK2);
                }
                f1.b.c(d0Var, (h9.k) objK2, sVar);
                f1.b.a(t1Var.a(d0Var), cVar, sVar, ((i11 >> 6) & 112) | 8);
            } catch (Throwable th) {
                n4.e.r(fVarH, fVarK, kVarE);
                throw th;
            }
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n() { // from class: h0.e0
                @Override // h9.n
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    z.b(obj, i7, f0Var, cVar, (f1.s) obj3, f1.b.y(i10 | 1));
                    return t8.z.f12851a;
                }
            };
        }
    }

    public static final void c(n1.c cVar, f1.s sVar, int i7) {
        sVar.Y(-709502251);
        if (sVar.N(i7 & 1, (i7 & 3) != 2)) {
            t1 t1Var = o1.h.f9281a;
            Object obj = (o1.f) sVar.j(t1Var);
            sVar.W(1967008021);
            Object[] objArr = new Object[0];
            Object objK = sVar.K();
            int i10 = 3;
            Object obj2 = f1.n.f5051a;
            if (objK == obj2) {
                objK = new n8.f(i10);
                sVar.h0(objK);
            }
            o1.d dVar = (o1.d) o1.k.d(objArr, o1.d.f9273e, (h9.a) objK, sVar, 384);
            dVar.f9276c = (o1.f) sVar.j(t1Var);
            sVar.p(false);
            Object[] objArr2 = {obj};
            u0.k kVar = new u0.k(18, new g0.g(i10), new c8.p(12, obj, dVar));
            boolean zH = sVar.h(obj) | sVar.h(dVar);
            Object objK2 = sVar.K();
            if (zH || objK2 == obj2) {
                objK2 = new f1(5, obj, dVar);
                sVar.h0(objK2);
            }
            Object obj3 = (q0) o1.k.d(objArr2, kVar, (h9.a) objK2, sVar, 0);
            f1.b.a(t1Var.a(obj3), n1.h.e(-412824043, new a8.k0(14, cVar, obj3), sVar), sVar, 56);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new b3.a(i7, 13, cVar);
        }
    }

    public static final void d(v vVar, Object obj, int i7, Object obj2, f1.s sVar, int i10) {
        sVar.Y(1439843069);
        int i11 = (sVar.f(vVar) ? 4 : 2) | i10 | (sVar.f(obj) ? 32 : 16) | (sVar.d(i7) ? 256 : 128) | (sVar.f(obj2) ? 2048 : 1024);
        if (sVar.N(i11 & 1, (i11 & 1171) != 1170)) {
            ((o1.b) obj).d(obj2, n1.h.e(980966366, new c8.x(i7, vVar, obj2), sVar), sVar, 48);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new u(vVar, obj, i7, obj2, i10, 0);
        }
    }

    public static final int e(int i7, h1.e eVar) {
        int i10 = eVar.f6423c - 1;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = ((i10 - i11) / 2) + i11;
            Object[] objArr = eVar.f6421a;
            int i13 = ((i) objArr[i12]).f6320a;
            if (i13 != i7) {
                if (i13 < i7) {
                    i11 = i12 + 1;
                    if (i7 < ((i) objArr[i11]).f6320a) {
                    }
                } else {
                    i10 = i12 - 1;
                }
            }
            return i12;
        }
        return i11;
    }

    public static final List f(b0 b0Var, int i7, int i10, ArrayList arrayList, s.v vVar, int i11, int i12, int i13, h9.k kVar) {
        int i14;
        s.v vVar2;
        int i15;
        long j5;
        Object obj;
        int i16;
        if (b0Var == null || arrayList.isEmpty() || (i14 = vVar.f12509b) == 0) {
            return u8.w.f13122a;
        }
        int i17 = -1;
        int i18 = 0;
        if (i10 - i7 < 0 || i14 == 0) {
            vVar2 = s.j.f12449a;
        } else {
            n9.d dVarE0 = n3.r.e0(0, i14);
            int i19 = dVarE0.f8965a;
            int i20 = dVarE0.f8966b;
            int iB = -1;
            if (i19 <= i20) {
                while (vVar.b(i19) <= i7) {
                    iB = vVar.b(i19);
                    if (i19 == i20) {
                        break;
                    }
                    i19++;
                }
            }
            if (iB == -1) {
                vVar2 = s.j.f12449a;
            } else {
                s.v vVar3 = s.j.f12449a;
                vVar2 = new s.v(1);
                vVar2.a(iB);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            Object obj2 = arrayList.get(i21);
            int index = ((y) obj2).getIndex();
            int[] iArr = vVar.f12508a;
            int i22 = vVar.f12509b;
            for (int i23 = 0; i23 < i22; i23++) {
                if (iArr[i23] == index) {
                    arrayList3.add(obj2);
                    break;
                }
            }
        }
        int[] iArr2 = vVar2.f12508a;
        int i24 = vVar2.f12509b;
        int i25 = 0;
        while (i25 < i24) {
            int i26 = iArr2[i25];
            Iterator it = arrayList.iterator();
            int i27 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i27 = -1;
                    break;
                }
                if (((y) it.next()).getIndex() == i26) {
                    break;
                }
                i27++;
            }
            y yVar = i27 == i17 ? (y) kVar.invoke(Integer.valueOf(i26)) : (y) arrayList.remove(i27);
            int iC = yVar.c();
            long j10 = 4294967295L;
            if (i27 == i17) {
                i15 = Integer.MIN_VALUE;
            } else {
                long jI = yVar.i(i18);
                i15 = (int) (yVar.f() ? jI & 4294967295L : jI >> 32);
            }
            int size2 = arrayList3.size();
            int i28 = 0;
            while (true) {
                if (i28 >= size2) {
                    j5 = j10;
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i28);
                j5 = j10;
                if (((y) obj).getIndex() != i26) {
                    break;
                }
                i28++;
                j10 = j5;
            }
            y yVar2 = (y) obj;
            if (yVar2 != null) {
                long jI2 = yVar2.i(0);
                i16 = (int) (yVar2.f() ? jI2 & j5 : jI2 >> 32);
            } else {
                i16 = Integer.MIN_VALUE;
            }
            int iMax = i15 == Integer.MIN_VALUE ? -i11 : Math.max(-i11, i15);
            if (i16 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i16 - iC);
            }
            yVar.g();
            yVar.h(iMax, i12, i13);
            arrayList2.add(yVar);
            i25++;
            i17 = -1;
            i18 = 0;
        }
        return arrayList2;
    }

    public static final List g(v vVar, f0 f0Var, k kVar) {
        n9.d dVar;
        h1.e eVar = kVar.f6332a;
        if (!(eVar.f6423c != 0) && f0Var.f6314a.isEmpty()) {
            return u8.w.f13122a;
        }
        ArrayList arrayList = new ArrayList();
        if (kVar.f6332a.f6423c != 0) {
            int i7 = eVar.f6423c;
            if (i7 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = eVar.f6421a;
            int i10 = ((j) objArr[0]).f6329a;
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = ((j) objArr[i11]).f6329a;
                if (i12 < i10) {
                    i10 = i12;
                }
            }
            if (i10 < 0) {
                c0.b.a("negative minIndex");
            }
            int i13 = eVar.f6423c;
            if (i13 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = eVar.f6421a;
            int i14 = ((j) objArr2[0]).f6330b;
            for (int i15 = 0; i15 < i13; i15++) {
                int i16 = ((j) objArr2[i15]).f6330b;
                if (i16 > i14) {
                    i14 = i16;
                }
            }
            dVar = new n9.d(i10, Math.min(i14, vVar.a() - 1), 1);
        } else {
            dVar = n9.d.f8972d;
        }
        int size = f0Var.f6314a.size();
        for (int i17 = 0; i17 < size; i17++) {
            d0 d0Var = (d0) f0Var.get(i17);
            int i18 = i(d0Var.f6302c, vVar, d0Var.f6300a);
            int i19 = dVar.f8965a;
            if ((i18 > dVar.f8966b || i19 > i18) && i18 >= 0 && i18 < vVar.a()) {
                arrayList.add(Integer.valueOf(i18));
            }
        }
        int i20 = dVar.f8965a;
        int i21 = dVar.f8966b;
        if (i20 <= i21) {
            while (true) {
                arrayList.add(Integer.valueOf(i20));
                if (i20 == i21) {
                    break;
                }
                i20++;
            }
        }
        return arrayList;
    }

    public static b1 h() {
        return new k1(t8.z.f12851a, f1.w0.f5184c);
    }

    public static final int i(int i7, v vVar, Object obj) {
        int iD;
        return (obj == null || vVar.a() == 0 || (i7 < vVar.a() && obj.equals(vVar.b(i7))) || (iD = vVar.d(obj)) == -1) ? i7 : iD;
    }

    public static final List m(int i7, int i10, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return u8.w.f13122a;
        }
        ArrayList arrayListK0 = u8.p.K0(list);
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            y yVar = (y) arrayList.get(i11);
            int index = yVar.getIndex();
            if (i7 <= index && index <= i10) {
                arrayListK0.add(yVar);
            }
        }
        u8.t.b0(arrayListK0, f6410a);
        return arrayListK0;
    }

    public Object j(int i7) {
        i iVarC = k().c(i7);
        return iVarC.f6322c.getType().invoke(Integer.valueOf(i7 - iVarC.f6320a));
    }

    public abstract g7.l k();

    public Object l(int i7) {
        Object objInvoke;
        i iVarC = k().c(i7);
        int i10 = i7 - iVarC.f6320a;
        h9.k key = iVarC.f6322c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i10))) == null) ? new g(i7) : objInvoke;
    }
}

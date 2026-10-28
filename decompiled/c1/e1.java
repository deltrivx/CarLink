package c1;

import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements o2.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9.k f1868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0.h0 f1871d;

    public e1(h9.k kVar, boolean z10, float f10, d0.h0 h0Var) {
        this.f1868a = kVar;
        this.f1869b = z10;
        this.f1870c = f10;
        this.f1871d = h0Var;
    }

    @Override // o2.m0
    public final int a(o2.r rVar, List list, int i7) {
        return d(rVar, list, i7, c1.f1830e);
    }

    public final int b(o2.r rVar, List list, int i7, h9.n nVar) {
        Object obj;
        int iR;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int i10;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i11);
            if (i9.l.a(d1.r.d((o2.l0) obj), "Leading")) {
                break;
            }
            i11++;
        }
        o2.l0 l0Var = (o2.l0) obj;
        if (l0Var != null) {
            iR = i7 == Integer.MAX_VALUE ? i7 : i7 - l0Var.r(Integer.MAX_VALUE);
            iIntValue = ((Number) nVar.invoke(l0Var, Integer.valueOf(i7))).intValue();
        } else {
            iR = i7;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i12);
            if (i9.l.a(d1.r.d((o2.l0) obj2), "Trailing")) {
                break;
            }
            i12++;
        }
        o2.l0 l0Var2 = (o2.l0) obj2;
        if (l0Var2 != null) {
            int iR2 = l0Var2.r(Integer.MAX_VALUE);
            if (iR != Integer.MAX_VALUE) {
                iR -= iR2;
            }
            iIntValue2 = ((Number) nVar.invoke(l0Var2, Integer.valueOf(i7))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i13);
            if (i9.l.a(d1.r.d((o2.l0) obj3), "Label")) {
                break;
            }
            i13++;
        }
        Object obj8 = (o2.l0) obj3;
        int iIntValue4 = obj8 != null ? ((Number) nVar.invoke(obj8, Integer.valueOf(n3.r.F(this.f1870c, iR, i7)))).intValue() : 0;
        int size4 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i14);
            if (i9.l.a(d1.r.d((o2.l0) obj4), "Prefix")) {
                break;
            }
            i14++;
        }
        o2.l0 l0Var3 = (o2.l0) obj4;
        if (l0Var3 != null) {
            iIntValue3 = ((Number) nVar.invoke(l0Var3, Integer.valueOf(iR))).intValue();
            int iR3 = l0Var3.r(Integer.MAX_VALUE);
            if (iR != Integer.MAX_VALUE) {
                iR -= iR3;
            }
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i15);
            if (i9.l.a(d1.r.d((o2.l0) obj5), "Suffix")) {
                break;
            }
            i15++;
        }
        o2.l0 l0Var4 = (o2.l0) obj5;
        if (l0Var4 != null) {
            int iIntValue5 = ((Number) nVar.invoke(l0Var4, Integer.valueOf(iR))).intValue();
            int iR4 = l0Var4.r(Integer.MAX_VALUE);
            if (iR != Integer.MAX_VALUE) {
                iR -= iR4;
            }
            i10 = iIntValue5;
        } else {
            i10 = 0;
        }
        int size6 = list.size();
        for (int i16 = 0; i16 < size6; i16++) {
            Object obj9 = list.get(i16);
            if (i9.l.a(d1.r.d((o2.l0) obj9), "TextField")) {
                int iIntValue6 = ((Number) nVar.invoke(obj9, Integer.valueOf(iR))).intValue();
                int size7 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i17);
                    if (i9.l.a(d1.r.d((o2.l0) obj6), "Hint")) {
                        break;
                    }
                    i17++;
                }
                Object obj10 = (o2.l0) obj6;
                int iIntValue7 = obj10 != null ? ((Number) nVar.invoke(obj10, Integer.valueOf(iR))).intValue() : 0;
                int size8 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i18);
                    if (i9.l.a(d1.r.d((o2.l0) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i18++;
                }
                Object obj12 = (o2.l0) obj7;
                return b1.c(iIntValue, iIntValue2, iIntValue3, i10, iIntValue6, iIntValue4, iIntValue7, obj12 != null ? ((Number) nVar.invoke(obj12, Integer.valueOf(i7))).intValue() : 0, this.f1870c, d1.r.f3735a, rVar.a(), this.f1871d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // o2.m0
    public final o2.n0 c(o2.o0 o0Var, List list, long j5) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i7;
        Object obj6;
        Object obj7;
        e1 e1Var = this;
        List list2 = list;
        d0.h0 h0Var = e1Var.f1871d;
        int iA0 = o0Var.a0(h0Var.f3574d);
        long jA = n3.a.a(j5, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i10);
            if (i9.l.a(androidx.compose.ui.layout.a.a((o2.l0) obj), "Leading")) {
                break;
            }
            i10++;
        }
        o2.l0 l0Var = (o2.l0) obj;
        o2.v0 v0VarU = l0Var != null ? l0Var.u(jA) : null;
        float f10 = d1.r.f3736b;
        int i11 = v0VarU != null ? v0VarU.f9435a : 0;
        int iMax = Math.max(0, v0VarU != null ? v0VarU.f9436b : 0);
        int size2 = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i12);
            if (i9.l.a(androidx.compose.ui.layout.a.a((o2.l0) obj2), "Trailing")) {
                break;
            }
            i12++;
        }
        o2.l0 l0Var2 = (o2.l0) obj2;
        o2.v0 v0VarU2 = l0Var2 != null ? l0Var2.u(n3.b.j(-i11, 0, 2, jA)) : null;
        int i13 = i11 + (v0VarU2 != null ? v0VarU2.f9435a : 0);
        int iMax2 = Math.max(iMax, v0VarU2 != null ? v0VarU2.f9436b : 0);
        int size3 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i14);
            if (i9.l.a(androidx.compose.ui.layout.a.a((o2.l0) obj3), "Prefix")) {
                break;
            }
            i14++;
        }
        o2.l0 l0Var3 = (o2.l0) obj3;
        o2.v0 v0VarU3 = l0Var3 != null ? l0Var3.u(n3.b.j(-i13, 0, 2, jA)) : null;
        int i15 = i13 + (v0VarU3 != null ? v0VarU3.f9435a : 0);
        int iMax3 = Math.max(iMax2, v0VarU3 != null ? v0VarU3.f9436b : 0);
        int size4 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i16);
            if (i9.l.a(androidx.compose.ui.layout.a.a((o2.l0) obj4), "Suffix")) {
                break;
            }
            i16++;
        }
        o2.l0 l0Var4 = (o2.l0) obj4;
        o2.v0 v0VarU4 = l0Var4 != null ? l0Var4.u(n3.b.j(-i15, 0, 2, jA)) : null;
        int i17 = i15 + (v0VarU4 != null ? v0VarU4.f9435a : 0);
        int iMax4 = Math.max(iMax3, v0VarU4 != null ? v0VarU4.f9436b : 0);
        int iA1 = o0Var.a0(h0Var.b(o0Var.getLayoutDirection())) + o0Var.a0(h0Var.a(o0Var.getLayoutDirection()));
        int i18 = -i17;
        int iF = n3.r.F(e1Var.f1870c, i18 - iA1, -iA1);
        int i19 = -iA0;
        long jI = n3.b.i(iF, i19, jA);
        int size5 = list2.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list2.get(i20);
            int i21 = i20;
            int i22 = size5;
            if (i9.l.a(androidx.compose.ui.layout.a.a((o2.l0) obj5), "Label")) {
                break;
            }
            i20 = i21 + 1;
            size5 = i22;
        }
        o2.l0 l0Var5 = (o2.l0) obj5;
        o2.v0 v0VarU5 = l0Var5 != null ? l0Var5.u(jI) : null;
        e1Var.f1868a.invoke(new x1.e(v0VarU5 != null ? n3.l.h(v0VarU5.f9435a, v0VarU5.f9436b) : 0L));
        int size6 = list2.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size6) {
                i7 = i19;
                obj6 = null;
                break;
            }
            obj6 = list2.get(i23);
            int i24 = size6;
            i7 = i19;
            if (i9.l.a(androidx.compose.ui.layout.a.a((o2.l0) obj6), "Supporting")) {
                break;
            }
            i23++;
            i19 = i7;
            size6 = i24;
        }
        o2.l0 l0Var6 = (o2.l0) obj6;
        int iH = l0Var6 != null ? l0Var6.H(n3.a.j(j5)) : 0;
        int iMax5 = Math.max((v0VarU5 != null ? v0VarU5.f9436b : 0) / 2, o0Var.a0(h0Var.f3572b));
        long j10 = jA;
        long jA2 = n3.a.a(n3.b.i(i18, (i7 - iMax5) - iH, j5), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i25 = 0;
        while (i25 < size7) {
            o2.l0 l0Var7 = (o2.l0) list2.get(i25);
            int i26 = size7;
            if (i9.l.a(androidx.compose.ui.layout.a.a(l0Var7), "TextField")) {
                o2.v0 v0VarU6 = l0Var7.u(jA2);
                long jA3 = n3.a.a(jA2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i27 = 0;
                while (true) {
                    if (i27 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj8 = list2.get(i27);
                    int i28 = size8;
                    if (i9.l.a(androidx.compose.ui.layout.a.a((o2.l0) obj8), "Hint")) {
                        obj7 = obj8;
                        break;
                    }
                    i27++;
                    size8 = i28;
                }
                o2.l0 l0Var8 = (o2.l0) obj7;
                o2.v0 v0VarU7 = l0Var8 != null ? l0Var8.u(jA3) : null;
                int iMax6 = Math.max(iMax4, Math.max(v0VarU6.f9436b, v0VarU7 != null ? v0VarU7.f9436b : 0) + iMax5 + iA0);
                o2.v0 v0Var = v0VarU;
                int iD = b1.d(v0VarU != null ? v0Var.f9435a : 0, v0VarU2 != null ? v0VarU2.f9435a : 0, v0VarU3 != null ? v0VarU3.f9435a : 0, v0VarU4 != null ? v0VarU4.f9435a : 0, v0VarU6.f9435a, v0VarU5 != null ? v0VarU5.f9435a : 0, v0VarU7 != null ? v0VarU7.f9435a : 0, e1Var.f1870c, j5, o0Var.a(), e1Var.f1871d);
                o2.v0 v0VarU8 = l0Var6 != null ? l0Var6.u(n3.a.a(n3.b.j(0, -iMax6, 1, j10), 0, iD, 0, 0, 9)) : null;
                int i29 = v0VarU8 != null ? v0VarU8.f9436b : 0;
                o2.v0 v0Var2 = v0VarU8;
                int iC = b1.c(v0Var != null ? v0Var.f9436b : 0, v0VarU2 != null ? v0VarU2.f9436b : 0, v0VarU3 != null ? v0VarU3.f9436b : 0, v0VarU4 != null ? v0VarU4.f9436b : 0, v0VarU6.f9436b, v0VarU5 != null ? v0VarU5.f9436b : 0, v0VarU7 != null ? v0VarU7.f9436b : 0, v0VarU8 != null ? v0VarU8.f9436b : 0, e1Var.f1870c, j5, o0Var.a(), e1Var.f1871d);
                int i30 = iC - i29;
                int size9 = list.size();
                int i31 = 0;
                while (i31 < size9) {
                    o2.l0 l0Var9 = (o2.l0) list.get(i31);
                    int i32 = iC;
                    o2.v0 v0Var3 = v0VarU5;
                    if (i9.l.a(androidx.compose.ui.layout.a.a(l0Var9), "Container")) {
                        return o0Var.i(iD, i32, u8.x.f13123a, new d1(i32, iD, v0Var, v0VarU2, v0VarU3, v0VarU4, v0VarU6, v0Var3, v0VarU7, l0Var9.u(n3.b.a(iD != Integer.MAX_VALUE ? iD : 0, iD, i30 != Integer.MAX_VALUE ? i30 : 0, i30)), v0Var2, e1Var, o0Var));
                    }
                    iC = i32;
                    i31++;
                    e1Var = this;
                    v0VarU6 = v0VarU6;
                    v0Var2 = v0Var2;
                    v0VarU4 = v0VarU4;
                    v0VarU5 = v0Var3;
                    v0VarU7 = v0VarU7;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i25++;
            e1Var = this;
            j10 = j10;
            list2 = list2;
            size7 = i26;
            jA2 = jA2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int d(o2.r rVar, List list, int i7, h9.n nVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj7 = list.get(i10);
            if (i9.l.a(d1.r.d((o2.l0) obj7), "TextField")) {
                int iIntValue = ((Number) nVar.invoke(obj7, Integer.valueOf(i7))).intValue();
                int size2 = list.size();
                int i11 = 0;
                while (true) {
                    obj = null;
                    if (i11 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i11);
                    if (i9.l.a(d1.r.d((o2.l0) obj2), "Label")) {
                        break;
                    }
                    i11++;
                }
                o2.l0 l0Var = (o2.l0) obj2;
                int iIntValue2 = l0Var != null ? ((Number) nVar.invoke(l0Var, Integer.valueOf(i7))).intValue() : 0;
                int size3 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i12);
                    if (i9.l.a(d1.r.d((o2.l0) obj3), "Trailing")) {
                        break;
                    }
                    i12++;
                }
                o2.l0 l0Var2 = (o2.l0) obj3;
                int iIntValue3 = l0Var2 != null ? ((Number) nVar.invoke(l0Var2, Integer.valueOf(i7))).intValue() : 0;
                int size4 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i13);
                    if (i9.l.a(d1.r.d((o2.l0) obj4), "Leading")) {
                        break;
                    }
                    i13++;
                }
                o2.l0 l0Var3 = (o2.l0) obj4;
                int iIntValue4 = l0Var3 != null ? ((Number) nVar.invoke(l0Var3, Integer.valueOf(i7))).intValue() : 0;
                int size5 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i14);
                    if (i9.l.a(d1.r.d((o2.l0) obj5), "Prefix")) {
                        break;
                    }
                    i14++;
                }
                o2.l0 l0Var4 = (o2.l0) obj5;
                int iIntValue5 = l0Var4 != null ? ((Number) nVar.invoke(l0Var4, Integer.valueOf(i7))).intValue() : 0;
                int size6 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i15);
                    if (i9.l.a(d1.r.d((o2.l0) obj6), "Suffix")) {
                        break;
                    }
                    i15++;
                }
                o2.l0 l0Var5 = (o2.l0) obj6;
                int iIntValue6 = l0Var5 != null ? ((Number) nVar.invoke(l0Var5, Integer.valueOf(i7))).intValue() : 0;
                int size7 = list.size();
                for (int i16 = 0; i16 < size7; i16++) {
                    Object obj8 = list.get(i16);
                    if (i9.l.a(d1.r.d((o2.l0) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                o2.l0 l0Var6 = (o2.l0) obj;
                return b1.d(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, l0Var6 != null ? ((Number) nVar.invoke(l0Var6, Integer.valueOf(i7))).intValue() : 0, this.f1870c, d1.r.f3735a, rVar.a(), this.f1871d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // o2.m0
    public final int f(o2.r rVar, List list, int i7) {
        return d(rVar, list, i7, c1.f1828c);
    }

    @Override // o2.m0
    public final int h(o2.r rVar, List list, int i7) {
        return b(rVar, list, i7, c1.f1827b);
    }

    @Override // o2.m0
    public final int j(o2.r rVar, List list, int i7) {
        return b(rVar, list, i7, c1.f1829d);
    }
}

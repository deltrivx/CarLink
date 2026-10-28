package u8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends n4.h {
    public static Integer A0(int[] iArr, int i7) {
        i9.l.e(iArr, "<this>");
        if (i7 < 0 || i7 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i7]);
    }

    public static Object B0(Object[] objArr, int i7) {
        if (i7 < 0 || i7 >= objArr.length) {
            return null;
        }
        return objArr[i7];
    }

    public static int C0(Object obj, Object[] objArr) {
        i9.l.e(objArr, "<this>");
        int i7 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i7 < length) {
                if (objArr[i7] == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i7 < length2) {
            if (obj.equals(objArr[i7])) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static int D0(int[] iArr, int i7) {
        i9.l.e(iArr, "<this>");
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i7 == iArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final void E0(Object[] objArr, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, h9.k kVar) {
        i9.l.e(objArr, "<this>");
        sb2.append(charSequence2);
        int i7 = 0;
        for (Object obj : objArr) {
            i7++;
            if (i7 > 1) {
                sb2.append(charSequence);
            }
            n3.r.c(sb2, obj, kVar);
        }
        sb2.append(charSequence3);
    }

    public static String F0(Object[] objArr, String str, String str2, String str3, h9.k kVar, int i7) {
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i7 & 2) != 0 ? "" : str2;
        String str6 = (i7 & 4) != 0 ? "" : str3;
        if ((i7 & 32) != 0) {
            kVar = null;
        }
        i9.l.e(objArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        E0(objArr, sb2, str4, str5, str6, "...", kVar);
        return sb2.toString();
    }

    public static Object G0(Object[] objArr) {
        i9.l.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object H0(Object[] objArr) {
        i9.l.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static void I0(Object[] objArr, Comparator comparator) {
        i9.l.e(objArr, "<this>");
        i9.l.e(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void J0(Object[] objArr, Comparator comparator, int i7, int i10) {
        i9.l.e(objArr, "<this>");
        i9.l.e(comparator, "comparator");
        Arrays.sort(objArr, i7, i10, comparator);
    }

    public static List K0(Object[] objArr, Comparator comparator) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            i9.l.d(objArr, "copyOf(...)");
            I0(objArr, comparator);
        }
        return j0(objArr);
    }

    public static List L0(Object[] objArr) {
        i9.l.e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new j(objArr, false)) : n3.l.I(objArr[0]);
        }
        return w.f13122a;
    }

    public static Set M0(Object[] objArr) {
        i9.l.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return y.f13124a;
        }
        if (length == 1) {
            return n3.r.W(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(c0.S0(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static ArrayList N0(Object[] objArr, Object[] objArr2) {
        i9.l.e(objArr, "<this>");
        i9.l.e(objArr2, "other");
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i7 = 0; i7 < iMin; i7++) {
            arrayList.add(new t8.j(objArr[i7], objArr2[i7]));
        }
        return arrayList;
    }

    public static List j0(Object[] objArr) {
        i9.l.e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        i9.l.d(listAsList, "asList(...)");
        return listAsList;
    }

    public static yb.j k0(Object[] objArr) {
        return objArr.length == 0 ? yb.f.f15266a : new o(0, objArr);
    }

    public static boolean l0(Object obj, Object[] objArr) {
        i9.l.e(objArr, "<this>");
        return C0(obj, objArr) >= 0;
    }

    public static void m0(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        i9.l.e(iArr, "<this>");
        i9.l.e(iArr2, "destination");
        System.arraycopy(iArr, i10, iArr2, i7, i11 - i10);
    }

    public static void n0(char[] cArr, char[] cArr2, int i7, int i10, int i11) {
        i9.l.e(cArr, "<this>");
        System.arraycopy(cArr, i10, cArr2, i7, i11 - i10);
    }

    public static void o0(long[] jArr, long[] jArr2, int i7, int i10, int i11) {
        i9.l.e(jArr, "<this>");
        i9.l.e(jArr2, "destination");
        System.arraycopy(jArr, i10, jArr2, i7, i11 - i10);
    }

    public static void p0(Object[] objArr, Object[] objArr2, int i7, int i10, int i11) {
        i9.l.e(objArr, "<this>");
        i9.l.e(objArr2, "destination");
        System.arraycopy(objArr, i10, objArr2, i7, i11 - i10);
    }

    public static /* synthetic */ void q0(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        if ((i11 & 2) != 0) {
            i7 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = iArr.length;
        }
        m0(i7, 0, i10, iArr, iArr2);
    }

    public static /* synthetic */ void r0(Object[] objArr, Object[] objArr2, int i7, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i7 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        p0(objArr, objArr2, 0, i7, i10);
    }

    public static Object[] s0(Object[] objArr, int i7, int i10) {
        i9.l.e(objArr, "<this>");
        n4.h.u(i10, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i7, i10);
        i9.l.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void t0(int i7, int i10, Object obj, Object[] objArr) {
        i9.l.e(objArr, "<this>");
        Arrays.fill(objArr, i7, i10, obj);
    }

    public static void u0(long[] jArr, long j5) {
        int length = jArr.length;
        i9.l.e(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j5);
    }

    public static ArrayList v0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object w0(Object[] objArr) {
        i9.l.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object x0(Object[] objArr) {
        i9.l.e(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static n9.d y0(int[] iArr) {
        return new n9.d(0, iArr.length - 1, 1);
    }

    public static int z0(long[] jArr) {
        i9.l.e(jArr, "<this>");
        return jArr.length - 1;
    }
}

package s;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f12483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f12484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12485c;

    public q0(int i7) {
        this.f12483a = i7 == 0 ? t.a.f12719a : new int[i7];
        this.f12484b = i7 == 0 ? t.a.f12721c : new Object[i7 << 1];
    }

    public final int a(Object obj) {
        int i7 = this.f12485c * 2;
        Object[] objArr = this.f12484b;
        if (obj == null) {
            for (int i10 = 1; i10 < i7; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i7; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i7, Object obj) {
        int i10 = this.f12485c;
        if (i10 == 0) {
            return -1;
        }
        int iA = t.a.a(i10, i7, this.f12483a);
        if (iA < 0 || i9.l.a(obj, this.f12484b[iA << 1])) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f12483a[i11] == i7) {
            if (i9.l.a(obj, this.f12484b[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f12483a[i12] == i7; i12--) {
            if (i9.l.a(obj, this.f12484b[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f12485c > 0) {
            this.f12483a = t.a.f12719a;
            this.f12484b = t.a.f12721c;
            this.f12485c = 0;
        }
        if (this.f12485c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d() {
        int i7 = this.f12485c;
        if (i7 == 0) {
            return -1;
        }
        int iA = t.a.a(i7, 0, this.f12483a);
        if (iA < 0 || this.f12484b[iA << 1] == null) {
            return iA;
        }
        int i10 = iA + 1;
        while (i10 < i7 && this.f12483a[i10] == 0) {
            if (this.f12484b[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iA - 1; i11 >= 0 && this.f12483a[i11] == 0; i11--) {
            if (this.f12484b[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final Object e(int i7) {
        boolean z10 = false;
        if (i7 >= 0 && i7 < this.f12485c) {
            z10 = true;
        }
        if (z10) {
            return this.f12484b[i7 << 1];
        }
        t.a.c("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof q0) {
                int i7 = this.f12485c;
                if (i7 != ((q0) obj).f12485c) {
                    return false;
                }
                q0 q0Var = (q0) obj;
                for (int i10 = 0; i10 < i7; i10++) {
                    Object objE = e(i10);
                    Object objH = h(i10);
                    Object obj2 = q0Var.get(objE);
                    if (objH == null) {
                        if (obj2 != null || !q0Var.containsKey(objE)) {
                            return false;
                        }
                    } else if (!objH.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f12485c != ((Map) obj).size()) {
                return false;
            }
            int i11 = this.f12485c;
            for (int i12 = 0; i12 < i11; i12++) {
                Object objE2 = e(i12);
                Object objH2 = h(i12);
                Object obj3 = ((Map) obj).get(objE2);
                if (objH2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objE2)) {
                        return false;
                    }
                } else if (!objH2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i7) {
        int i10;
        if (i7 < 0 || i7 >= (i10 = this.f12485c)) {
            t.a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        Object[] objArr = this.f12484b;
        int i11 = i7 << 1;
        Object obj = objArr[i11 + 1];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i12 = i10 - 1;
        int[] iArr = this.f12483a;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i7 < i12) {
                int i13 = i7 + 1;
                u8.l.m0(i7, i13, i10, iArr, iArr);
                Object[] objArr2 = this.f12484b;
                u8.l.p0(objArr2, objArr2, i11, i13 << 1, i10 << 1);
            }
            Object[] objArr3 = this.f12484b;
            int i14 = i12 << 1;
            objArr3[i14] = null;
            objArr3[i14 + 1] = null;
        } else {
            int i15 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i15);
            i9.l.d(iArrCopyOf, "copyOf(...)");
            this.f12483a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12484b, i15 << 1);
            i9.l.d(objArrCopyOf, "copyOf(...)");
            this.f12484b = objArrCopyOf;
            if (i10 != this.f12485c) {
                throw new ConcurrentModificationException();
            }
            if (i7 > 0) {
                u8.l.m0(0, 0, i7, iArr, this.f12483a);
                u8.l.p0(objArr, this.f12484b, 0, 0, i11);
            }
            if (i7 < i12) {
                int i16 = i7 + 1;
                u8.l.m0(i7, i16, i10, iArr, this.f12483a);
                u8.l.p0(objArr, this.f12484b, i11, i16 << 1, i10 << 1);
            }
        }
        if (i10 != this.f12485c) {
            throw new ConcurrentModificationException();
        }
        this.f12485c = i12;
        return obj;
    }

    public final Object g(int i7, Object obj) {
        boolean z10 = false;
        if (i7 >= 0 && i7 < this.f12485c) {
            z10 = true;
        }
        if (!z10) {
            t.a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        int i10 = (i7 << 1) + 1;
        Object[] objArr = this.f12484b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return this.f12484b[(iC << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iC = c(obj);
        return iC >= 0 ? this.f12484b[(iC << 1) + 1] : obj2;
    }

    public final Object h(int i7) {
        boolean z10 = false;
        if (i7 >= 0 && i7 < this.f12485c) {
            z10 = true;
        }
        if (z10) {
            return this.f12484b[(i7 << 1) + 1];
        }
        t.a.c("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    public final int hashCode() {
        int[] iArr = this.f12483a;
        Object[] objArr = this.f12484b;
        int i7 = this.f12485c;
        int i10 = 1;
        int i11 = 0;
        int iHashCode = 0;
        while (i11 < i7) {
            Object obj = objArr[i10];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f12485c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i7 = this.f12485c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iB = obj != null ? b(iHashCode, obj) : d();
        if (iB >= 0) {
            int i10 = (iB << 1) + 1;
            Object[] objArr = this.f12484b;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~iB;
        int[] iArr = this.f12483a;
        if (i7 >= iArr.length) {
            int i12 = 8;
            if (i7 >= 8) {
                i12 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i12 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
            i9.l.d(iArrCopyOf, "copyOf(...)");
            this.f12483a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12484b, i12 << 1);
            i9.l.d(objArrCopyOf, "copyOf(...)");
            this.f12484b = objArrCopyOf;
            if (i7 != this.f12485c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i7) {
            int[] iArr2 = this.f12483a;
            int i13 = i11 + 1;
            u8.l.m0(i13, i11, i7, iArr2, iArr2);
            Object[] objArr2 = this.f12484b;
            u8.l.p0(objArr2, objArr2, i13 << 1, i11 << 1, this.f12485c << 1);
        }
        int i14 = this.f12485c;
        if (i7 == i14) {
            int[] iArr3 = this.f12483a;
            if (i11 < iArr3.length) {
                iArr3[i11] = iHashCode;
                Object[] objArr3 = this.f12484b;
                int i15 = i11 << 1;
                objArr3[i15] = obj;
                objArr3[i15 + 1] = obj2;
                this.f12485c = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return f(iC);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC < 0 || !i9.l.a(obj2, h(iC))) {
            return false;
        }
        f(iC);
        return true;
    }

    public final Object replace(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC >= 0) {
            return g(iC, obj2);
        }
        return null;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iC = c(obj);
        if (iC < 0 || !i9.l.a(obj2, h(iC))) {
            return false;
        }
        g(iC, obj3);
        return true;
    }

    public final int size() {
        return this.f12485c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f12485c * 28);
        sb2.append('{');
        int i7 = this.f12485c;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object objE = e(i10);
            if (objE != sb2) {
                sb2.append(objE);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objH = h(i10);
            if (objH != sb2) {
                sb2.append(objH);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        i9.l.d(string, "toString(...)");
        return string;
    }
}

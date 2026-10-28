package v8;

import i9.l;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import k1.i;
import n3.n;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Map, Serializable, j9.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e f13667n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f13668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f13669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f13670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f13671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f13677j;
    public i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f13678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13679m;

    static {
        e eVar = new e(0);
        eVar.f13679m = true;
        f13667n = eVar;
    }

    public e() {
        this(8);
    }

    public e(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i7];
        int[] iArr = new int[i7];
        int iHighestOneBit = Integer.highestOneBit((i7 < 1 ? 1 : i7) * 3);
        this.f13668a = objArr;
        this.f13669b = null;
        this.f13670c = iArr;
        this.f13671d = new int[iHighestOneBit];
        this.f13672e = 2;
        this.f13673f = 0;
        this.f13674g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iL = l(obj);
            int i7 = this.f13672e * 2;
            int length = this.f13671d.length / 2;
            if (i7 > length) {
                i7 = length;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f13671d;
                int i11 = iArr[iL];
                if (i11 <= 0) {
                    int i12 = this.f13673f;
                    Object[] objArr = this.f13668a;
                    if (i12 >= objArr.length) {
                        h(1);
                        break;
                    }
                    int i13 = i12 + 1;
                    this.f13673f = i13;
                    objArr[i12] = obj;
                    this.f13670c[i12] = iL;
                    iArr[iL] = i13;
                    this.f13676i++;
                    this.f13675h++;
                    if (i10 > this.f13672e) {
                        this.f13672e = i10;
                    }
                    return i12;
                }
                if (l.a(this.f13668a[i11 - 1], obj)) {
                    return -i11;
                }
                i10++;
                if (i10 > i7) {
                    m(this.f13671d.length * 2);
                    break;
                }
                iL = iL == 0 ? this.f13671d.length - 1 : iL - 1;
            }
        }
    }

    public final e b() {
        c();
        this.f13679m = true;
        if (this.f13676i > 0) {
            return this;
        }
        e eVar = f13667n;
        l.c(eVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return eVar;
    }

    public final void c() {
        if (this.f13679m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i7 = this.f13673f - 1;
        if (i7 >= 0) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f13670c;
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    this.f13671d[i11] = 0;
                    iArr[i10] = -1;
                }
                if (i10 == i7) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        n.J0(this.f13668a, 0, this.f13673f);
        Object[] objArr = this.f13669b;
        if (objArr != null) {
            n.J0(objArr, 0, this.f13673f);
        }
        this.f13676i = 0;
        this.f13673f = 0;
        this.f13675h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return j(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return k(obj) >= 0;
    }

    public final void d(boolean z10) {
        int i7;
        Object[] objArr = this.f13669b;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i7 = this.f13673f;
            if (i10 >= i7) {
                break;
            }
            int[] iArr = this.f13670c;
            int i12 = iArr[i10];
            if (i12 >= 0) {
                Object[] objArr2 = this.f13668a;
                objArr2[i11] = objArr2[i10];
                if (objArr != null) {
                    objArr[i11] = objArr[i10];
                }
                if (z10) {
                    iArr[i11] = i12;
                    this.f13671d[i12] = i11 + 1;
                }
                i11++;
            }
            i10++;
        }
        n.J0(this.f13668a, i11, i7);
        if (objArr != null) {
            n.J0(objArr, i11, this.f13673f);
        }
        this.f13673f = i11;
    }

    public final boolean e(Collection collection) {
        l.e(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        f fVar = this.f13678l;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 0);
        this.f13678l = fVar2;
        return fVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f13676i == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        l.e(entry, "entry");
        int iJ = j(entry.getKey());
        if (iJ < 0) {
            return false;
        }
        Object[] objArr = this.f13669b;
        l.b(objArr);
        return l.a(objArr[iJ], entry.getValue());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iJ = j(obj);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = this.f13669b;
        l.b(objArr);
        return objArr[iJ];
    }

    public final void h(int i7) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f13668a;
        int length = objArr.length;
        int i10 = this.f13673f;
        int i11 = length - i10;
        int i12 = i10 - this.f13676i;
        if (i11 < i7 && i11 + i12 >= i7 && i12 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i13 = i10 + i7;
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        if (i13 > objArr.length) {
            int length2 = objArr.length;
            int i14 = length2 + (length2 >> 1);
            if (i14 - i13 < 0) {
                i14 = i13;
            }
            if (i14 - 2147483639 > 0) {
                i14 = i13 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i14);
            l.d(objArrCopyOf2, "copyOf(...)");
            this.f13668a = objArrCopyOf2;
            Object[] objArr2 = this.f13669b;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i14);
                l.d(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f13669b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f13670c, i14);
            l.d(iArrCopyOf, "copyOf(...)");
            this.f13670c = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i14 >= 1 ? i14 : 1) * 3);
            if (iHighestOneBit > this.f13671d.length) {
                m(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        c cVar = new c(this, 0);
        int i7 = 0;
        while (cVar.hasNext()) {
            int i10 = cVar.f4317a;
            e eVar = (e) cVar.f4320d;
            if (i10 >= eVar.f13673f) {
                throw new NoSuchElementException();
            }
            cVar.f4317a = i10 + 1;
            cVar.f4318b = i10;
            Object obj = eVar.f13668a[i10];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = eVar.f13669b;
            l.b(objArr);
            Object obj2 = objArr[cVar.f4318b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            cVar.e();
            i7 += iHashCode ^ iHashCode2;
        }
        return i7;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f13676i == 0;
    }

    public final int j(Object obj) {
        int iL = l(obj);
        int i7 = this.f13672e;
        while (true) {
            int i10 = this.f13671d[iL];
            if (i10 == 0) {
                return -1;
            }
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (l.a(this.f13668a[i11], obj)) {
                    return i11;
                }
            }
            i7--;
            if (i7 < 0) {
                return -1;
            }
            iL = iL == 0 ? this.f13671d.length - 1 : iL - 1;
        }
    }

    public final int k(Object obj) {
        int i7 = this.f13673f;
        while (true) {
            i7--;
            if (i7 < 0) {
                return -1;
            }
            if (this.f13670c[i7] >= 0) {
                Object[] objArr = this.f13669b;
                l.b(objArr);
                if (l.a(objArr[i7], obj)) {
                    return i7;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        f fVar = this.f13677j;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 1);
        this.f13677j = fVar2;
        return fVar2;
    }

    public final int l(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f13674g;
    }

    public final void m(int i7) {
        int[] iArr;
        this.f13675h++;
        int i10 = 0;
        if (this.f13673f > this.f13676i) {
            d(false);
        }
        this.f13671d = new int[i7];
        this.f13674g = Integer.numberOfLeadingZeros(i7) + 1;
        while (i10 < this.f13673f) {
            int i11 = i10 + 1;
            int iL = l(this.f13668a[i10]);
            int i12 = this.f13672e;
            while (true) {
                iArr = this.f13671d;
                if (iArr[iL] == 0) {
                    break;
                }
                i12--;
                if (i12 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iL = iL == 0 ? iArr.length - 1 : iL - 1;
            }
            iArr[iL] = i11;
            this.f13670c[i10] = iL;
            i10 = i11;
        }
    }

    public final void n(int i7) {
        Object[] objArr = this.f13668a;
        l.e(objArr, "<this>");
        objArr[i7] = null;
        Object[] objArr2 = this.f13669b;
        if (objArr2 != null) {
            objArr2[i7] = null;
        }
        int length = this.f13670c[i7];
        int i10 = this.f13672e * 2;
        int length2 = this.f13671d.length / 2;
        if (i10 > length2) {
            i10 = length2;
        }
        int i11 = i10;
        int i12 = 0;
        int i13 = length;
        do {
            length = length == 0 ? this.f13671d.length - 1 : length - 1;
            i12++;
            if (i12 > this.f13672e) {
                this.f13671d[i13] = 0;
            } else {
                int[] iArr = this.f13671d;
                int i14 = iArr[length];
                if (i14 == 0) {
                    iArr[i13] = 0;
                } else {
                    if (i14 < 0) {
                        iArr[i13] = -1;
                    } else {
                        int i15 = i14 - 1;
                        int iL = l(this.f13668a[i15]) - length;
                        int[] iArr2 = this.f13671d;
                        if ((iL & (iArr2.length - 1)) >= i12) {
                            iArr2[i13] = i14;
                            this.f13670c[i15] = i13;
                        }
                        i11--;
                    }
                    i13 = length;
                    i12 = 0;
                    i11--;
                }
            }
            this.f13670c[i7] = -1;
            this.f13676i--;
            this.f13675h++;
        } while (i11 >= 0);
        this.f13671d[i13] = -1;
        this.f13670c[i7] = -1;
        this.f13676i--;
        this.f13675h++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f13669b;
        if (objArr == null) {
            int length = this.f13668a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f13669b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i7 = (-iA) - 1;
        Object obj3 = objArr[i7];
        objArr[i7] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        l.e(map, "from");
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        h(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f13669b;
            if (objArr == null) {
                int length = this.f13668a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f13669b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i7 = (-iA) - 1;
                if (!l.a(entry.getValue(), objArr[i7])) {
                    objArr[i7] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iJ = j(obj);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = this.f13669b;
        l.b(objArr);
        Object obj2 = objArr[iJ];
        n(iJ);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f13676i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f13676i * 3) + 2);
        sb2.append("{");
        int i7 = 0;
        c cVar = new c(this, 0);
        while (cVar.hasNext()) {
            if (i7 > 0) {
                sb2.append(", ");
            }
            int i10 = cVar.f4317a;
            e eVar = (e) cVar.f4320d;
            if (i10 >= eVar.f13673f) {
                throw new NoSuchElementException();
            }
            cVar.f4317a = i10 + 1;
            cVar.f4318b = i10;
            Object obj = eVar.f13668a[i10];
            if (obj == eVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = eVar.f13669b;
            l.b(objArr);
            Object obj2 = objArr[cVar.f4318b];
            if (obj2 == eVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            cVar.e();
            i7++;
        }
        sb2.append("}");
        String string = sb2.toString();
        l.d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        i iVar = this.k;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(1, this);
        this.k = iVar2;
        return iVar2;
    }
}

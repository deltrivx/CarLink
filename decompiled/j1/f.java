package j1;

import f1.r1;
import h9.k;
import i9.l;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends u8.g implements Collection, j9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f6876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f6877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f6878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m1.b f6880e = new m1.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object[] f6881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f6882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6883h;

    public f(c cVar, Object[] objArr, Object[] objArr2, int i7) {
        this.f6876a = cVar;
        this.f6877b = objArr;
        this.f6878c = objArr2;
        this.f6879d = i7;
        this.f6881f = objArr;
        this.f6882g = objArr2;
        this.f6883h = cVar.c();
    }

    public static void m(Object[] objArr, int i7, Iterator it) {
        while (i7 < 32 && it.hasNext()) {
            objArr[i7] = it.next();
            i7++;
        }
    }

    public final Object[] A(Object[] objArr, int i7, int i10, Iterator it) {
        if (!it.hasNext()) {
            r1.a("invalid buffersIterator");
        }
        if (!(i10 >= 0)) {
            r1.a("negative shift");
        }
        if (i10 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrT = t(objArr);
        int iD = k9.a.D(i7, i10);
        int i11 = i10 - 5;
        objArrT[iD] = A((Object[]) objArrT[iD], i7, i11, it);
        while (true) {
            iD++;
            if (iD >= 32 || !it.hasNext()) {
                break;
            }
            objArrT[iD] = A((Object[]) objArrT[iD], 0, i11, it);
        }
        return objArrT;
    }

    public final Object[] B(Object[] objArr, int i7, Object[][] objArr2) {
        i9.b bVarH = l.h(objArr2);
        int i10 = i7 >> 5;
        int i11 = this.f6879d;
        Object[] objArrA = i10 < (1 << i11) ? A(objArr, i7, i11, bVarH) : t(objArr);
        while (bVarH.hasNext()) {
            this.f6879d += 5;
            objArrA = w(objArrA);
            int i12 = this.f6879d;
            A(objArrA, 1 << i12, i12, bVarH);
        }
        return objArrA;
    }

    public final void C(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i7 = this.f6883h;
        int i10 = i7 >> 5;
        int i11 = this.f6879d;
        if (i10 > (1 << i11)) {
            this.f6881f = D(this.f6879d + 5, w(objArr), objArr2);
            this.f6882g = objArr3;
            this.f6879d += 5;
            this.f6883h++;
            return;
        }
        if (objArr == null) {
            this.f6881f = objArr2;
            this.f6882g = objArr3;
            this.f6883h = i7 + 1;
        } else {
            this.f6881f = D(i11, objArr, objArr2);
            this.f6882g = objArr3;
            this.f6883h++;
        }
    }

    public final Object[] D(int i7, Object[] objArr, Object[] objArr2) {
        int iD = k9.a.D(c() - 1, i7);
        Object[] objArrT = t(objArr);
        if (i7 == 5) {
            objArrT[iD] = objArr2;
            return objArrT;
        }
        objArrT[iD] = D(i7 - 5, (Object[]) objArrT[iD], objArr2);
        return objArrT;
    }

    public final int E(k kVar, Object[] objArr, int i7, int i10, f4.e eVar, ArrayList arrayList, ArrayList arrayList2) {
        if (r(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = eVar.f5285a;
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrV = objArr2;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj2 = objArr[i11];
            if (!((Boolean) kVar.invoke(obj2)).booleanValue()) {
                if (i10 == 32) {
                    objArrV = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : v();
                    i10 = 0;
                }
                objArrV[i10] = obj2;
                i10++;
            }
        }
        eVar.f5285a = objArrV;
        if (objArr2 != objArrV) {
            arrayList2.add(objArr2);
        }
        return i10;
    }

    public final int F(k kVar, Object[] objArr, int i7, f4.e eVar) {
        Object[] objArrT = objArr;
        int i10 = i7;
        boolean z10 = false;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj = objArr[i11];
            if (((Boolean) kVar.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArrT = t(objArr);
                    z10 = true;
                    i10 = i11;
                }
            } else if (z10) {
                objArrT[i10] = obj;
                i10++;
            }
        }
        eVar.f5285a = objArrT;
        return i10;
    }

    public final int G(k kVar, int i7, f4.e eVar) {
        int iF = F(kVar, this.f6882g, i7, eVar);
        if (iF == i7) {
            return i7;
        }
        Object obj = eVar.f5285a;
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iF, i7, (Object) null);
        this.f6882g = objArr;
        this.f6883h -= i7 - iF;
        return iF;
    }

    public final boolean H(k kVar) {
        Object[] objArrA;
        int i7;
        k kVar2 = kVar;
        int iN = N();
        Object[] objArrX = null;
        f4.e eVar = new f4.e(null);
        boolean z10 = false;
        if (this.f6881f != null) {
            a aVarS = s(0);
            int iF = 32;
            while (iF == 32 && aVarS.hasNext()) {
                iF = F(kVar2, (Object[]) aVarS.next(), 32, eVar);
            }
            if (iF == 32) {
                int iG = G(kVar2, iN, eVar);
                if (iG == 0) {
                    z(this.f6881f, this.f6883h, this.f6879d);
                }
                if (iG != iN) {
                }
            } else {
                int i10 = (aVarS.f6866a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iE = iF;
                while (aVarS.hasNext()) {
                    iE = E(kVar2, (Object[]) aVarS.next(), 32, iE, eVar, arrayList2, arrayList);
                    kVar2 = kVar;
                }
                int iE2 = E(kVar, this.f6882g, iN, iE, eVar, arrayList2, arrayList);
                Object obj = eVar.f5285a;
                l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iE2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrA = this.f6881f;
                    l.b(objArrA);
                } else {
                    objArrA = A(this.f6881f, i10, this.f6879d, arrayList.iterator());
                }
                int size = i10 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    r1.a("invalid size");
                }
                if (size == 0) {
                    this.f6879d = 0;
                } else {
                    int i11 = size - 1;
                    while (true) {
                        i7 = this.f6879d;
                        if ((i11 >> i7) != 0) {
                            break;
                        }
                        this.f6879d = i7 - 5;
                        Object[] objArr2 = objArrA[0];
                        l.c(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrA = objArr2;
                    }
                    objArrX = x(objArrA, i11, i7);
                }
                this.f6881f = objArrX;
                this.f6882g = objArr;
                this.f6883h = size + iE2;
            }
            z10 = true;
        } else if (G(kVar2, iN, eVar) != iN) {
            z10 = true;
        }
        if (z10) {
            ((AbstractList) this).modCount++;
        }
        return z10;
    }

    public final Object[] I(Object[] objArr, int i7, int i10, f4.e eVar) {
        int iD = k9.a.D(i10, i7);
        if (i7 == 0) {
            Object obj = objArr[iD];
            Object[] objArrT = t(objArr);
            u8.l.p0(objArr, objArrT, iD, iD + 1, 32);
            objArrT[31] = eVar.f5285a;
            eVar.f5285a = obj;
            return objArrT;
        }
        int iD2 = objArr[31] == null ? k9.a.D(K() - 1, i7) : 31;
        Object[] objArrT2 = t(objArr);
        int i11 = i7 - 5;
        int i12 = iD + 1;
        if (i12 <= iD2) {
            while (true) {
                Object obj2 = objArrT2[iD2];
                l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrT2[iD2] = I((Object[]) obj2, i11, 0, eVar);
                if (iD2 == i12) {
                    break;
                }
                iD2--;
            }
        }
        Object obj3 = objArrT2[iD];
        l.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrT2[iD] = I((Object[]) obj3, i11, i10, eVar);
        return objArrT2;
    }

    public final Object J(Object[] objArr, int i7, int i10, int i11) {
        int i12 = this.f6883h - i7;
        if (i12 == 1) {
            Object obj = this.f6882g[0];
            z(objArr, i7, i10);
            return obj;
        }
        Object[] objArr2 = this.f6882g;
        Object obj2 = objArr2[i11];
        Object[] objArrT = t(objArr2);
        u8.l.p0(objArr2, objArrT, i11, i11 + 1, i12);
        objArrT[i12 - 1] = null;
        this.f6881f = objArr;
        this.f6882g = objArrT;
        this.f6883h = (i7 + i12) - 1;
        this.f6879d = i10;
        return obj2;
    }

    public final int K() {
        int i7 = this.f6883h;
        if (i7 <= 32) {
            return 0;
        }
        return (i7 - 1) & (-32);
    }

    public final Object[] L(Object[] objArr, int i7, int i10, Object obj, f4.e eVar) {
        int iD = k9.a.D(i10, i7);
        Object[] objArrT = t(objArr);
        if (i7 != 0) {
            Object obj2 = objArrT[iD];
            l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrT[iD] = L((Object[]) obj2, i7 - 5, i10, obj, eVar);
            return objArrT;
        }
        if (objArrT != objArr) {
            ((AbstractList) this).modCount++;
        }
        eVar.f5285a = objArrT[iD];
        objArrT[iD] = obj;
        return objArrT;
    }

    public final void M(Collection collection, int i7, Object[] objArr, int i10, Object[][] objArr2, int i11, Object[] objArr3) {
        Object[] objArrV;
        if (i11 < 1) {
            r1.a("requires at least one nullBuffer");
        }
        Object[] objArrT = t(objArr);
        objArr2[0] = objArrT;
        int i12 = i7 & 31;
        int size = ((collection.size() + i7) - 1) & 31;
        int i13 = (i10 - i12) + size;
        if (i13 < 32) {
            u8.l.p0(objArrT, objArr3, size + 1, i12, i10);
        } else {
            int i14 = i13 - 31;
            if (i11 == 1) {
                objArrV = objArrT;
            } else {
                objArrV = v();
                i11--;
                objArr2[i11] = objArrV;
            }
            int i15 = i10 - i14;
            u8.l.p0(objArrT, objArr3, 0, i15, i10);
            u8.l.p0(objArrT, objArrV, size + 1, i12, i15);
            objArr3 = objArrV;
        }
        Iterator it = collection.iterator();
        m(objArrT, i12, it);
        for (int i16 = 1; i16 < i11; i16++) {
            Object[] objArrV2 = v();
            m(objArrV2, 0, it);
            objArr2[i16] = objArrV2;
        }
        m(objArr3, 0, it);
    }

    public final int N() {
        int i7 = this.f6883h;
        return i7 <= 32 ? i7 : i7 - ((i7 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        a.a.o(i7, c());
        if (i7 == c()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iK = K();
        if (i7 >= iK) {
            q(this.f6881f, i7 - iK, obj);
            return;
        }
        f4.e eVar = new f4.e(null);
        Object[] objArr = this.f6881f;
        l.b(objArr);
        q(p(objArr, this.f6879d, i7, obj, eVar), 0, eVar.f5285a);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iN = N();
        if (iN < 32) {
            Object[] objArrT = t(this.f6882g);
            objArrT[iN] = obj;
            this.f6882g = objArrT;
            this.f6883h = c() + 1;
        } else {
            C(this.f6881f, this.f6882g, w(obj));
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        Collection collection2;
        f fVar;
        Object[] objArrV;
        a.a.o(i7, this.f6883h);
        if (i7 == this.f6883h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i10 = (i7 >> 5) << 5;
        int size = ((collection.size() + (this.f6883h - i10)) - 1) / 32;
        if (size == 0) {
            int i11 = i7 & 31;
            int size2 = ((collection.size() + i7) - 1) & 31;
            Object[] objArr = this.f6882g;
            Object[] objArrT = t(objArr);
            u8.l.p0(objArr, objArrT, size2 + 1, i11, N());
            m(objArrT, i11, collection.iterator());
            this.f6882g = objArrT;
            this.f6883h = collection.size() + this.f6883h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iN = N();
        int size3 = collection.size() + this.f6883h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i7 >= K()) {
            objArrV = v();
            collection2 = collection;
            M(collection2, i7, this.f6882g, iN, objArr2, size, objArrV);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            if (size3 > iN) {
                int i12 = size3 - iN;
                Object[] objArrU = u(fVar.f6882g, i12);
                fVar.o(collection2, i7, i12, objArr2, size, objArrU);
                objArr2 = objArr2;
                objArrV = objArrU;
            } else {
                Object[] objArr3 = fVar.f6882g;
                objArrV = v();
                int i13 = iN - size3;
                u8.l.p0(objArr3, objArrV, 0, i13, iN);
                int i14 = 32 - i13;
                Object[] objArrU2 = u(fVar.f6882g, i14);
                int i15 = size - 1;
                objArr2[i15] = objArrU2;
                fVar.o(collection2, i7, i14, objArr2, i15, objArrU2);
                collection2 = collection2;
            }
        }
        fVar.f6881f = B(fVar.f6881f, i10, objArr2);
        fVar.f6882g = objArrV;
        fVar.f6883h = collection2.size() + fVar.f6883h;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iN = N();
        Iterator it = collection.iterator();
        if (32 - iN >= collection.size()) {
            Object[] objArrT = t(this.f6882g);
            m(objArrT, iN, it);
            this.f6882g = objArrT;
            this.f6883h = collection.size() + this.f6883h;
            return true;
        }
        int size = ((collection.size() + iN) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrT2 = t(this.f6882g);
        m(objArrT2, iN, it);
        objArr[0] = objArrT2;
        for (int i7 = 1; i7 < size; i7++) {
            Object[] objArrV = v();
            m(objArrV, 0, it);
            objArr[i7] = objArrV;
        }
        this.f6881f = B(this.f6881f, K(), objArr);
        Object[] objArrV2 = v();
        m(objArrV2, 0, it);
        this.f6882g = objArrV2;
        this.f6883h = collection.size() + this.f6883h;
        return true;
    }

    @Override // u8.g
    public final int c() {
        return this.f6883h;
    }

    @Override // u8.g
    public final Object d(int i7) {
        a.a.n(i7, c());
        ((AbstractList) this).modCount++;
        int iK = K();
        if (i7 >= iK) {
            return J(this.f6881f, iK, this.f6879d, i7 - iK);
        }
        f4.e eVar = new f4.e(this.f6882g[0]);
        Object[] objArr = this.f6881f;
        l.b(objArr);
        J(I(objArr, this.f6879d, i7, eVar), iK, this.f6879d, 0);
        return eVar.f5285a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        Object[] objArr;
        a.a.n(i7, c());
        if (K() <= i7) {
            objArr = this.f6882g;
        } else {
            objArr = this.f6881f;
            l.b(objArr);
            for (int i10 = this.f6879d; i10 > 0; i10 -= 5) {
                Object obj = objArr[k9.a.D(i7, i10)];
                l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i7 & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final c k() {
        c eVar;
        Object[] objArr = this.f6881f;
        if (objArr == this.f6877b && this.f6882g == this.f6878c) {
            eVar = this.f6876a;
        } else {
            this.f6880e = new m1.b();
            this.f6877b = objArr;
            Object[] objArr2 = this.f6882g;
            this.f6878c = objArr2;
            if (objArr != null) {
                eVar = new e(objArr, objArr2, this.f6883h, this.f6879d);
            } else if (objArr2.length == 0) {
                eVar = i.f6890b;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f6883h);
                l.d(objArrCopyOf, "copyOf(...)");
                eVar = new i(objArrCopyOf);
            }
        }
        this.f6876a = eVar;
        return eVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        a.a.o(i7, this.f6883h);
        return new h(this, i7);
    }

    public final int n() {
        return ((AbstractList) this).modCount;
    }

    public final void o(Collection collection, int i7, int i10, Object[][] objArr, int i11, Object[] objArr2) {
        if (this.f6881f == null) {
            throw new IllegalStateException("root is null");
        }
        int i12 = i7 >> 5;
        a aVarS = s(K() >> 5);
        int i13 = i11;
        Object[] objArrU = objArr2;
        while (aVarS.f6866a - 1 != i12) {
            Object[] objArr3 = (Object[]) aVarS.previous();
            u8.l.p0(objArr3, objArrU, 0, 32 - i10, 32);
            objArrU = u(objArr3, i10);
            i13--;
            objArr[i13] = objArrU;
        }
        Object[] objArr4 = (Object[]) aVarS.previous();
        int iK = i11 - (((K() >> 5) - 1) - i12);
        if (iK < i11) {
            objArr2 = objArr[iK];
            l.b(objArr2);
        }
        M(collection, i7, objArr4, 32, objArr, iK, objArr2);
    }

    public final Object[] p(Object[] objArr, int i7, int i10, Object obj, f4.e eVar) {
        Object obj2;
        int iD = k9.a.D(i10, i7);
        if (i7 == 0) {
            eVar.f5285a = objArr[31];
            Object[] objArrT = t(objArr);
            u8.l.p0(objArr, objArrT, iD + 1, iD, 31);
            objArrT[iD] = obj;
            return objArrT;
        }
        Object[] objArrT2 = t(objArr);
        int i11 = i7 - 5;
        Object obj3 = objArrT2[iD];
        l.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrT2[iD] = p((Object[]) obj3, i11, i10, obj, eVar);
        while (true) {
            iD++;
            if (iD >= 32 || (obj2 = objArrT2[iD]) == null) {
                break;
            }
            objArrT2[iD] = p((Object[]) obj2, i11, 0, eVar.f5285a, eVar);
        }
        return objArrT2;
    }

    public final void q(Object[] objArr, int i7, Object obj) {
        int iN = N();
        Object[] objArrT = t(this.f6882g);
        if (iN < 32) {
            u8.l.p0(this.f6882g, objArrT, i7 + 1, i7, iN);
            objArrT[i7] = obj;
            this.f6881f = objArr;
            this.f6882g = objArrT;
            this.f6883h++;
            return;
        }
        Object[] objArr2 = this.f6882g;
        Object obj2 = objArr2[31];
        u8.l.p0(objArr2, objArrT, i7 + 1, i7, 31);
        objArrT[i7] = obj;
        C(objArr, objArrT, w(obj2));
    }

    public final boolean r(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f6880e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return H(new b(1, collection));
    }

    public final a s(int i7) {
        Object[] objArr = this.f6881f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iK = K() >> 5;
        a.a.o(i7, iK);
        int i10 = this.f6879d;
        return i10 == 0 ? new d(i7, objArr) : new j(objArr, i7, iK, i10 / 5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        a.a.n(i7, c());
        if (K() > i7) {
            f4.e eVar = new f4.e(null);
            Object[] objArr = this.f6881f;
            l.b(objArr);
            this.f6881f = L(objArr, this.f6879d, i7, obj, eVar);
            return eVar.f5285a;
        }
        Object[] objArrT = t(this.f6882g);
        if (objArrT != this.f6882g) {
            ((AbstractList) this).modCount++;
        }
        int i10 = i7 & 31;
        Object obj2 = objArrT[i10];
        objArrT[i10] = obj;
        this.f6882g = objArrT;
        return obj2;
    }

    public final Object[] t(Object[] objArr) {
        if (objArr == null) {
            return v();
        }
        if (r(objArr)) {
            return objArr;
        }
        Object[] objArrV = v();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        u8.l.r0(objArr, objArrV, 0, length, 6);
        return objArrV;
    }

    public final Object[] u(Object[] objArr, int i7) {
        if (r(objArr)) {
            u8.l.p0(objArr, objArr, i7, 0, 32 - i7);
            return objArr;
        }
        Object[] objArrV = v();
        u8.l.p0(objArr, objArrV, i7, 0, 32 - i7);
        return objArrV;
    }

    public final Object[] v() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f6880e;
        return objArr;
    }

    public final Object[] w(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f6880e;
        return objArr;
    }

    public final Object[] x(Object[] objArr, int i7, int i10) {
        if (i10 < 0) {
            r1.a("shift should be positive");
        }
        if (i10 == 0) {
            return objArr;
        }
        int iD = k9.a.D(i7, i10);
        Object obj = objArr[iD];
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objX = x((Object[]) obj, i7, i10 - 5);
        if (iD < 31) {
            int i11 = iD + 1;
            if (objArr[i11] != null) {
                if (r(objArr)) {
                    Arrays.fill(objArr, i11, 32, (Object) null);
                }
                Object[] objArrV = v();
                u8.l.p0(objArr, objArrV, 0, 0, i11);
                objArr = objArrV;
            }
        }
        if (objX == objArr[iD]) {
            return objArr;
        }
        Object[] objArrT = t(objArr);
        objArrT[iD] = objX;
        return objArrT;
    }

    public final Object[] y(Object[] objArr, int i7, int i10, f4.e eVar) {
        Object[] objArrY;
        int iD = k9.a.D(i10 - 1, i7);
        if (i7 == 5) {
            eVar.f5285a = objArr[iD];
            objArrY = null;
        } else {
            Object obj = objArr[iD];
            l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrY = y((Object[]) obj, i7 - 5, i10, eVar);
        }
        if (objArrY == null && iD == 0) {
            return null;
        }
        Object[] objArrT = t(objArr);
        objArrT[iD] = objArrY;
        return objArrT;
    }

    public final void z(Object[] objArr, int i7, int i10) {
        if (i10 == 0) {
            this.f6881f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f6882g = objArr;
            this.f6883h = i7;
            this.f6879d = i10;
            return;
        }
        f4.e eVar = new f4.e(null);
        l.b(objArr);
        Object[] objArrY = y(objArr, i10, i7, eVar);
        l.b(objArrY);
        Object obj = eVar.f5285a;
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f6882g = (Object[]) obj;
        this.f6883h = i7;
        if (objArrY[1] == null) {
            this.f6881f = (Object[]) objArrY[0];
            this.f6879d = i10 - 5;
        } else {
            this.f6881f = objArrY;
            this.f6879d = i10;
        }
    }
}

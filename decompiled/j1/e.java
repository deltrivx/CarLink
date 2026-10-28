package j1;

import f1.r1;
import i9.l;
import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f6872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f6873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6875d;

    public e(Object[] objArr, Object[] objArr2, int i7, int i10) {
        this.f6872a = objArr;
        this.f6873b = objArr2;
        this.f6874c = i7;
        this.f6875d = i10;
        if (!(c() > 32)) {
            r1.a("Trie-based persistent vector should have at least 33 elements, got " + c());
        }
        int length = objArr2.length;
    }

    public static Object[] r(Object[] objArr, int i7, int i10, Object obj, f4.e eVar) {
        Object[] objArrCopyOf;
        int iD = k9.a.D(i10, i7);
        if (i7 == 0) {
            if (iD == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                l.d(objArrCopyOf, "copyOf(...)");
            }
            u8.l.p0(objArr, objArrCopyOf, iD + 1, iD, 31);
            eVar.f5285a = objArr[31];
            objArrCopyOf[iD] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        l.d(objArrCopyOf2, "copyOf(...)");
        int i11 = i7 - 5;
        Object obj2 = objArr[iD];
        l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iD] = r((Object[]) obj2, i11, i10, obj, eVar);
        while (true) {
            iD++;
            if (iD >= 32 || objArrCopyOf2[iD] == null) {
                break;
            }
            Object obj3 = objArr[iD];
            l.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iD] = r((Object[]) obj3, i11, 0, eVar.f5285a, eVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] t(Object[] objArr, int i7, int i10, f4.e eVar) {
        Object[] objArrT;
        int iD = k9.a.D(i10, i7);
        if (i7 == 5) {
            eVar.f5285a = objArr[iD];
            objArrT = null;
        } else {
            Object obj = objArr[iD];
            l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrT = t((Object[]) obj, i7 - 5, i10, eVar);
        }
        if (objArrT == null && iD == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        l.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iD] = objArrT;
        return objArrCopyOf;
    }

    public static Object[] z(int i7, int i10, Object obj, Object[] objArr) {
        int iD = k9.a.D(i10, i7);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        l.d(objArrCopyOf, "copyOf(...)");
        if (i7 == 0) {
            objArrCopyOf[iD] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iD];
        l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iD] = z(i7 - 5, i10, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // u8.a
    public final int c() {
        return this.f6874c;
    }

    @Override // j1.c
    public final c d(int i7, Object obj) {
        int i10 = this.f6874c;
        a.a.o(i7, i10);
        if (i7 == i10) {
            return k(obj);
        }
        int iY = y();
        Object[] objArr = this.f6872a;
        if (i7 >= iY) {
            return s(objArr, i7 - iY, obj);
        }
        f4.e eVar = new f4.e(null);
        return s(r(objArr, this.f6875d, i7, obj, eVar), 0, eVar.f5285a);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Object[] objArr;
        a.a.n(i7, c());
        if (y() <= i7) {
            objArr = this.f6873b;
        } else {
            objArr = this.f6872a;
            for (int i10 = this.f6875d; i10 > 0; i10 -= 5) {
                Object obj = objArr[k9.a.D(i7, i10)];
                l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i7 & 31];
    }

    @Override // j1.c
    public final c k(Object obj) {
        int iY = y();
        int i7 = this.f6874c;
        int i10 = i7 - iY;
        Object[] objArr = this.f6872a;
        Object[] objArr2 = this.f6873b;
        if (i10 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return u(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        l.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = obj;
        return new e(objArr, objArrCopyOf, i7 + 1, this.f6875d);
    }

    @Override // u8.e, java.util.List
    public final ListIterator listIterator(int i7) {
        a.a.o(i7, this.f6874c);
        return new g(this.f6872a, this.f6873b, i7, this.f6874c, (this.f6875d / 5) + 1);
    }

    @Override // j1.c
    public final f n() {
        return new f(this, this.f6872a, this.f6873b, this.f6875d);
    }

    @Override // j1.c
    public final c o(b bVar) {
        f fVar = new f(this, this.f6872a, this.f6873b, this.f6875d);
        fVar.H(bVar);
        return fVar.k();
    }

    @Override // j1.c
    public final c p(int i7) {
        a.a.n(i7, this.f6874c);
        int iY = y();
        Object[] objArr = this.f6872a;
        int i10 = this.f6875d;
        return i7 >= iY ? x(objArr, iY, i10, i7 - iY) : x(w(objArr, i10, i7, new f4.e(this.f6873b[0])), iY, i10, 0);
    }

    @Override // j1.c
    public final c q(int i7, Object obj) {
        int i10 = this.f6874c;
        a.a.n(i7, i10);
        int iY = y();
        Object[] objArr = this.f6872a;
        Object[] objArr2 = this.f6873b;
        int i11 = this.f6875d;
        if (iY > i7) {
            return new e(z(i11, i7, obj, objArr), objArr2, i10, i11);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        l.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i7 & 31] = obj;
        return new e(objArr, objArrCopyOf, i10, i11);
    }

    public final e s(Object[] objArr, int i7, Object obj) {
        int iY = y();
        int i10 = this.f6874c;
        int i11 = i10 - iY;
        Object[] objArr2 = this.f6873b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        l.d(objArrCopyOf, "copyOf(...)");
        if (i11 < 32) {
            u8.l.p0(objArr2, objArrCopyOf, i7 + 1, i7, i11);
            objArrCopyOf[i7] = obj;
            return new e(objArr, objArrCopyOf, i10 + 1, this.f6875d);
        }
        Object obj2 = objArr2[31];
        u8.l.p0(objArr2, objArrCopyOf, i7 + 1, i7, i11 - 1);
        objArrCopyOf[i7] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return u(objArr, objArrCopyOf, objArr3);
    }

    public final e u(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i7 = this.f6874c;
        int i10 = i7 >> 5;
        int i11 = this.f6875d;
        if (i10 <= (1 << i11)) {
            return new e(v(i11, objArr, objArr2), objArr3, i7 + 1, i11);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i12 = i11 + 5;
        return new e(v(i12, objArr4, objArr2), objArr3, i7 + 1, i12);
    }

    public final Object[] v(int i7, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iD = k9.a.D(c() - 1, i7);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            l.d(objArrCopyOf, "copyOf(...)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i7 == 5) {
            objArrCopyOf[iD] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iD] = v(i7 - 5, (Object[]) objArrCopyOf[iD], objArr2);
        return objArrCopyOf;
    }

    public final Object[] w(Object[] objArr, int i7, int i10, f4.e eVar) {
        Object[] objArrCopyOf;
        int iD = k9.a.D(i10, i7);
        if (i7 == 0) {
            if (iD == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                l.d(objArrCopyOf, "copyOf(...)");
            }
            u8.l.p0(objArr, objArrCopyOf, iD, iD + 1, 32);
            objArrCopyOf[31] = eVar.f5285a;
            eVar.f5285a = objArr[iD];
            return objArrCopyOf;
        }
        int iD2 = objArr[31] == null ? k9.a.D(y() - 1, i7) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        l.d(objArrCopyOf2, "copyOf(...)");
        int i11 = i7 - 5;
        int i12 = iD + 1;
        if (i12 <= iD2) {
            while (true) {
                Object obj = objArrCopyOf2[iD2];
                l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iD2] = w((Object[]) obj, i11, 0, eVar);
                if (iD2 == i12) {
                    break;
                }
                iD2--;
            }
        }
        Object obj2 = objArrCopyOf2[iD];
        l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iD] = w((Object[]) obj2, i11, i10, eVar);
        return objArrCopyOf2;
    }

    public final c x(Object[] objArr, int i7, int i10, int i11) {
        int i12 = this.f6874c - i7;
        if (i12 != 1) {
            Object[] objArr2 = this.f6873b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            l.d(objArrCopyOf, "copyOf(...)");
            int i13 = i12 - 1;
            if (i11 < i13) {
                u8.l.p0(objArr2, objArrCopyOf, i11, i11 + 1, i12);
            }
            objArrCopyOf[i13] = null;
            return new e(objArr, objArrCopyOf, (i7 + i12) - 1, i10);
        }
        if (i10 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                l.d(objArr, "copyOf(...)");
            }
            return new i(objArr);
        }
        f4.e eVar = new f4.e(null);
        Object[] objArrT = t(objArr, i10, i7 - 1, eVar);
        l.b(objArrT);
        Object obj = eVar.f5285a;
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrT[1] != null) {
            return new e(objArrT, objArr3, i7, i10);
        }
        Object obj2 = objArrT[0];
        l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj2, objArr3, i7, i10 - 5);
    }

    public final int y() {
        return (this.f6874c - 1) & (-32);
    }
}

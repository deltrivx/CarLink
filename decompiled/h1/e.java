package h1;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import n3.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f6421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f6422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6423c = 0;

    public e(Object[] objArr) {
        this.f6421a = objArr;
    }

    public final void a(int i7, Object obj) {
        int i10 = this.f6423c + 1;
        if (this.f6421a.length < i10) {
            n(i10);
        }
        Object[] objArr = this.f6421a;
        int i11 = this.f6423c;
        if (i7 != i11) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i11 - i7);
        }
        objArr[i7] = obj;
        this.f6423c++;
    }

    public final void b(Object obj) {
        int i7 = this.f6423c + 1;
        if (this.f6421a.length < i7) {
            n(i7);
        }
        Object[] objArr = this.f6421a;
        int i10 = this.f6423c;
        objArr[i10] = obj;
        this.f6423c = i10 + 1;
    }

    public final void c(int i7, e eVar) {
        int i10 = eVar.f6423c;
        if (i10 == 0) {
            return;
        }
        int i11 = this.f6423c + i10;
        if (this.f6421a.length < i11) {
            n(i11);
        }
        Object[] objArr = this.f6421a;
        int i12 = this.f6423c;
        if (i7 != i12) {
            System.arraycopy(objArr, i7, objArr, i7 + i10, i12 - i7);
        }
        System.arraycopy(eVar.f6421a, 0, objArr, i7, i10);
        this.f6423c += i10;
    }

    public final void d(int i7, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i10 = this.f6423c + size;
        if (this.f6421a.length < i10) {
            n(i10);
        }
        Object[] objArr = this.f6421a;
        int i11 = this.f6423c;
        if (i7 != i11) {
            System.arraycopy(objArr, i7, objArr, i7 + size, i11 - i7);
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            objArr[i7 + i12] = list.get(i12);
        }
        this.f6423c += size;
    }

    public final boolean f(int i7, Collection collection) {
        int i10 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i11 = this.f6423c + size;
        if (this.f6421a.length < i11) {
            n(i11);
        }
        Object[] objArr = this.f6421a;
        int i12 = this.f6423c;
        if (i7 != i12) {
            System.arraycopy(objArr, i7, objArr, i7 + size, i12 - i7);
        }
        for (Object obj : collection) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                l.Y();
                throw null;
            }
            objArr[i10 + i7] = obj;
            i10 = i13;
        }
        this.f6423c += size;
        return true;
    }

    public final List g() {
        b bVar = this.f6422b;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(0, this);
        this.f6422b = bVar2;
        return bVar2;
    }

    public final void h() {
        Object[] objArr = this.f6421a;
        int i7 = this.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = null;
        }
        this.f6423c = 0;
    }

    public final boolean i(Object obj) {
        int i7 = this.f6423c - 1;
        if (i7 >= 0) {
            for (int i10 = 0; !i9.l.a(this.f6421a[i10], obj); i10++) {
                if (i10 != i7) {
                }
            }
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        Object[] objArr = this.f6421a;
        int i7 = this.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i9.l.a(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean k(Object obj) {
        int iJ = j(obj);
        if (iJ < 0) {
            return false;
        }
        l(iJ);
        return true;
    }

    public final Object l(int i7) {
        Object[] objArr = this.f6421a;
        Object obj = objArr[i7];
        int i10 = this.f6423c;
        if (i7 != i10 - 1) {
            int i11 = i7 + 1;
            System.arraycopy(objArr, i11, objArr, i7, i10 - i11);
        }
        int i12 = this.f6423c - 1;
        this.f6423c = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void m(int i7, int i10) {
        if (i10 > i7) {
            int i11 = this.f6423c;
            if (i10 < i11) {
                Object[] objArr = this.f6421a;
                System.arraycopy(objArr, i10, objArr, i7, i11 - i10);
            }
            int i12 = this.f6423c;
            int i13 = i12 - (i10 - i7);
            int i14 = i12 - 1;
            if (i13 <= i14) {
                int i15 = i13;
                while (true) {
                    this.f6421a[i15] = null;
                    if (i15 == i14) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f6423c = i13;
        }
    }

    public final void n(int i7) {
        Object[] objArr = this.f6421a;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i7, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f6421a = objArr2;
    }
}

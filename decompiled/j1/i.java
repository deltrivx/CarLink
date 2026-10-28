package j1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import u8.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f6890b = new i(new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f6891a;

    public i(Object[] objArr) {
        this.f6891a = objArr;
    }

    @Override // u8.a
    public final int c() {
        return this.f6891a.length;
    }

    @Override // j1.c
    public final c d(int i7, Object obj) {
        Object[] objArr = this.f6891a;
        a.a.o(i7, objArr.length);
        if (i7 == objArr.length) {
            return k(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            l.r0(objArr, objArr2, 0, i7, 6);
            l.p0(objArr, objArr2, i7 + 1, i7, objArr.length);
            objArr2[i7] = obj;
            return new i(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        i9.l.d(objArrCopyOf, "copyOf(...)");
        l.p0(objArr, objArrCopyOf, i7 + 1, i7, objArr.length - 1);
        objArrCopyOf[i7] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        a.a.n(i7, c());
        return this.f6891a[i7];
    }

    @Override // u8.e, java.util.List
    public final int indexOf(Object obj) {
        return l.C0(obj, this.f6891a);
    }

    @Override // j1.c
    public final c k(Object obj) {
        Object[] objArr = this.f6891a;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new e(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        i9.l.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[objArr.length] = obj;
        return new i(objArrCopyOf);
    }

    @Override // u8.e, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f6891a;
        i9.l.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i7 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i7 >= 0) {
                        length = i7;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i10 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length2 = i10;
                }
            }
        }
        return -1;
    }

    @Override // u8.e, java.util.List
    public final ListIterator listIterator(int i7) {
        Object[] objArr = this.f6891a;
        a.a.o(i7, objArr.length);
        return new d(objArr, i7, objArr.length);
    }

    @Override // j1.c
    public final c m(Collection collection) {
        Object[] objArr = this.f6891a;
        if (collection.size() + objArr.length > 32) {
            f fVarN = n();
            fVarN.addAll(collection);
            return fVarN.k();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        i9.l.d(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new i(objArrCopyOf);
    }

    @Override // j1.c
    public final f n() {
        return new f(this, null, this.f6891a, 0);
    }

    @Override // j1.c
    public final c o(b bVar) {
        Object[] objArr = this.f6891a;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z10 = false;
        for (int i7 = 0; i7 < length2; i7++) {
            Object obj = objArr[i7];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    i9.l.d(objArrCopyOf, "copyOf(...)");
                    z10 = true;
                    length = i7;
                }
            } else if (z10) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? f6890b : new i(l.s0(objArrCopyOf, 0, length));
    }

    @Override // j1.c
    public final c p(int i7) {
        Object[] objArr = this.f6891a;
        a.a.n(i7, objArr.length);
        if (objArr.length == 1) {
            return f6890b;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        i9.l.d(objArrCopyOf, "copyOf(...)");
        l.p0(objArr, objArrCopyOf, i7, i7 + 1, objArr.length);
        return new i(objArrCopyOf);
    }

    @Override // j1.c
    public final c q(int i7, Object obj) {
        Object[] objArr = this.f6891a;
        a.a.n(i7, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        i9.l.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i7] = obj;
        return new i(objArrCopyOf);
    }
}

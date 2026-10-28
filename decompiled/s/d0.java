package s;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f12407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h1.b f12409c;

    public /* synthetic */ d0() {
        this(16);
    }

    public d0(int i7) {
        this.f12407a = i7 == 0 ? m0.f12471a : new Object[i7];
    }

    public final void a(Object obj) {
        int i7 = this.f12408b + 1;
        Object[] objArr = this.f12407a;
        if (objArr.length < i7) {
            l(objArr, i7);
        }
        Object[] objArr2 = this.f12407a;
        int i10 = this.f12408b;
        objArr2[i10] = obj;
        this.f12408b = i10 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i7 = this.f12408b;
        int size = list.size() + i7;
        Object[] objArr = this.f12407a;
        if (objArr.length < size) {
            l(objArr, size);
        }
        Object[] objArr2 = this.f12407a;
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            objArr2[i10 + i7] = list.get(i10);
        }
        this.f12408b = list.size() + this.f12408b;
    }

    public final void c() {
        u8.l.t0(0, this.f12408b, null, this.f12407a);
        this.f12408b = 0;
    }

    public final Object d() {
        if (!g()) {
            return this.f12407a[0];
        }
        t.a.e("ObjectList is empty.");
        throw null;
    }

    public final Object e(int i7) {
        if (i7 >= 0 && i7 < this.f12408b) {
            return this.f12407a[i7];
        }
        m(i7);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            int i7 = d0Var.f12408b;
            int i10 = this.f12408b;
            if (i7 == i10) {
                Object[] objArr = this.f12407a;
                Object[] objArr2 = d0Var.f12407a;
                n9.d dVarE0 = n3.r.e0(0, i10);
                int i11 = dVarE0.f8965a;
                int i12 = dVarE0.f8966b;
                if (i11 > i12) {
                    return true;
                }
                while (i9.l.a(objArr[i11], objArr2[i11])) {
                    if (i11 == i12) {
                        return true;
                    }
                    i11++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f(Object obj) {
        int i7 = 0;
        if (obj == null) {
            Object[] objArr = this.f12407a;
            int i10 = this.f12408b;
            while (i7 < i10) {
                if (objArr[i7] == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        Object[] objArr2 = this.f12407a;
        int i11 = this.f12408b;
        while (i7 < i11) {
            if (obj.equals(objArr2[i7])) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public final boolean g() {
        return this.f12408b == 0;
    }

    public final boolean h() {
        return this.f12408b != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f12407a;
        int i7 = this.f12408b;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            Object obj = objArr[i10];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean i(Object obj) {
        int iF = f(obj);
        if (iF < 0) {
            return false;
        }
        j(iF);
        return true;
    }

    public final Object j(int i7) {
        int i10;
        if (i7 < 0 || i7 >= (i10 = this.f12408b)) {
            m(i7);
            throw null;
        }
        Object[] objArr = this.f12407a;
        Object obj = objArr[i7];
        if (i7 != i10 - 1) {
            u8.l.p0(objArr, objArr, i7, i7 + 1, i10);
        }
        int i11 = this.f12408b - 1;
        this.f12408b = i11;
        objArr[i11] = null;
        return obj;
    }

    public final void k(int i7, int i10) {
        int i11;
        if (i7 < 0 || i7 > (i11 = this.f12408b) || i10 < 0 || i10 > i11) {
            t.a.d("Start (" + i7 + ") and end (" + i10 + ") must be in 0.." + this.f12408b);
            throw null;
        }
        if (i10 < i7) {
            t.a.c("Start (" + i7 + ") is more than end (" + i10 + ')');
            throw null;
        }
        if (i10 != i7) {
            if (i10 < i11) {
                Object[] objArr = this.f12407a;
                u8.l.p0(objArr, objArr, i7, i10, i11);
            }
            int i12 = this.f12408b;
            int i13 = i12 - (i10 - i7);
            u8.l.t0(i13, i12, null, this.f12407a);
            this.f12408b = i13;
        }
    }

    public final void l(Object[] objArr, int i7) {
        i9.l.e(objArr, "oldContent");
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i7, (length * 3) / 2)];
        u8.l.p0(objArr, objArr2, 0, 0, length);
        this.f12407a = objArr2;
    }

    public final void m(int i7) {
        StringBuilder sbT = ob.a.t("Index ", " must be in 0..", i7);
        sbT.append(this.f12408b - 1);
        t.a.d(sbT.toString());
        throw null;
    }

    public final String toString() {
        b2.a aVar = new b2.a(14, this);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f12407a;
        int i7 = this.f12408b;
        for (int i10 = 0; i10 < i7; i10++) {
            Object obj = objArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                i9.l.d(string, "toString(...)");
                return string;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) aVar.invoke(obj));
        }
        sb2.append((CharSequence) "]");
        String string2 = sb2.toString();
        i9.l.d(string2, "toString(...)");
        return string2;
    }
}

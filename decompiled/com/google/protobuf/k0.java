package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends d implements r0, RandomAccess, t1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k0 f2781d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f2782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2783c;

    static {
        k0 k0Var = new k0(new int[0], 0);
        f2781d = k0Var;
        k0Var.f2729a = false;
    }

    public k0(int[] iArr, int i7) {
        this.f2782b = iArr;
        this.f2783c = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        int iIntValue = ((Integer) obj).intValue();
        c();
        if (i7 < 0 || i7 > (i10 = this.f2783c)) {
            StringBuilder sbT = ob.a.t("Index:", ", Size:", i7);
            sbT.append(this.f2783c);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        int[] iArr = this.f2782b;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i7, iArr, i7 + 1, i10 - i7);
        } else {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            System.arraycopy(this.f2782b, i7, iArr2, i7 + 1, this.f2783c - i7);
            this.f2782b = iArr2;
        }
        this.f2782b[i7] = iIntValue;
        this.f2783c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = u0.f2861a;
        collection.getClass();
        if (!(collection instanceof k0)) {
            return super.addAll(collection);
        }
        k0 k0Var = (k0) collection;
        int i7 = k0Var.f2783c;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.f2783c;
        if (Integer.MAX_VALUE - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        int[] iArr = this.f2782b;
        if (i11 > iArr.length) {
            this.f2782b = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(k0Var.f2782b, 0, this.f2782b, this.f2783c, k0Var.f2783c);
        this.f2783c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i7) {
        c();
        int i10 = this.f2783c;
        int[] iArr = this.f2782b;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f2782b = iArr2;
        }
        int[] iArr3 = this.f2782b;
        int i11 = this.f2783c;
        this.f2783c = i11 + 1;
        iArr3[i11] = i7;
    }

    @Override // com.google.protobuf.t0
    public final t0 e(int i7) {
        if (i7 >= this.f2783c) {
            return new k0(Arrays.copyOf(this.f2782b, i7), this.f2783c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return super.equals(obj);
        }
        k0 k0Var = (k0) obj;
        if (this.f2783c != k0Var.f2783c) {
            return false;
        }
        int[] iArr = k0Var.f2782b;
        for (int i7 = 0; i7 < this.f2783c; i7++) {
            if (this.f2782b[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return Integer.valueOf(m(i7));
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.f2783c; i10++) {
            i7 = (i7 * 31) + this.f2782b[i10];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i7 = this.f2783c;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.f2782b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void k(int i7) {
        if (i7 < 0 || i7 >= this.f2783c) {
            StringBuilder sbT = ob.a.t("Index:", ", Size:", i7);
            sbT.append(this.f2783c);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    public final int m(int i7) {
        k(i7);
        return this.f2782b[i7];
    }

    public final int n(int i7, int i10) {
        c();
        k(i7);
        int[] iArr = this.f2782b;
        int i11 = iArr[i7];
        iArr[i7] = i10;
        return i11;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        c();
        k(i7);
        int[] iArr = this.f2782b;
        int i10 = iArr[i7];
        int i11 = this.f2783c;
        if (i7 < i11 - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (i11 - i7) - 1);
        }
        this.f2783c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        c();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f2782b;
        System.arraycopy(iArr, i10, iArr, i7, this.f2783c - i10);
        this.f2783c -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        return Integer.valueOf(n(i7, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2783c;
    }
}

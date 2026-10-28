package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends d implements l0, RandomAccess, t1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f2745d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f2746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2747c;

    static {
        g gVar = new g(new boolean[0], 0);
        f2745d = gVar;
        gVar.f2729a = false;
    }

    public g(boolean[] zArr, int i7) {
        this.f2746b = zArr;
        this.f2747c = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i7 < 0 || i7 > (i10 = this.f2747c)) {
            StringBuilder sbT = ob.a.t("Index:", ", Size:", i7);
            sbT.append(this.f2747c);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        boolean[] zArr = this.f2746b;
        if (i10 < zArr.length) {
            System.arraycopy(zArr, i7, zArr, i7 + 1, i10 - i7);
        } else {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i7);
            System.arraycopy(this.f2746b, i7, zArr2, i7 + 1, this.f2747c - i7);
            this.f2746b = zArr2;
        }
        this.f2746b[i7] = zBooleanValue;
        this.f2747c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = u0.f2861a;
        collection.getClass();
        if (!(collection instanceof g)) {
            return super.addAll(collection);
        }
        g gVar = (g) collection;
        int i7 = gVar.f2747c;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.f2747c;
        if (Integer.MAX_VALUE - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        boolean[] zArr = this.f2746b;
        if (i11 > zArr.length) {
            this.f2746b = Arrays.copyOf(zArr, i11);
        }
        System.arraycopy(gVar.f2746b, 0, this.f2746b, this.f2747c, gVar.f2747c);
        this.f2747c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(boolean z10) {
        c();
        int i7 = this.f2747c;
        boolean[] zArr = this.f2746b;
        if (i7 == zArr.length) {
            boolean[] zArr2 = new boolean[((i7 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i7);
            this.f2746b = zArr2;
        }
        boolean[] zArr3 = this.f2746b;
        int i10 = this.f2747c;
        this.f2747c = i10 + 1;
        zArr3[i10] = z10;
    }

    @Override // com.google.protobuf.t0
    public final t0 e(int i7) {
        if (i7 >= this.f2747c) {
            return new g(Arrays.copyOf(this.f2746b, i7), this.f2747c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return super.equals(obj);
        }
        g gVar = (g) obj;
        if (this.f2747c != gVar.f2747c) {
            return false;
        }
        boolean[] zArr = gVar.f2746b;
        for (int i7 = 0; i7 < this.f2747c; i7++) {
            if (this.f2746b[i7] != zArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        k(i7);
        return Boolean.valueOf(this.f2746b[i7]);
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.f2747c; i10++) {
            int i11 = i7 * 31;
            boolean z10 = this.f2746b[i10];
            Charset charset = u0.f2861a;
            i7 = i11 + (z10 ? 1231 : 1237);
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i7 = this.f2747c;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.f2746b[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void k(int i7) {
        if (i7 < 0 || i7 >= this.f2747c) {
            StringBuilder sbT = ob.a.t("Index:", ", Size:", i7);
            sbT.append(this.f2747c);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        c();
        k(i7);
        boolean[] zArr = this.f2746b;
        boolean z10 = zArr[i7];
        int i10 = this.f2747c;
        if (i7 < i10 - 1) {
            System.arraycopy(zArr, i7 + 1, zArr, i7, (i10 - i7) - 1);
        }
        this.f2747c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        c();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f2746b;
        System.arraycopy(zArr, i10, zArr, i7, this.f2747c - i10);
        this.f2747c -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        c();
        k(i7);
        boolean[] zArr = this.f2746b;
        boolean z10 = zArr[i7];
        zArr[i7] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2747c;
    }
}

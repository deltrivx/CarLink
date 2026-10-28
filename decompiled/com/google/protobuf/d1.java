package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends d implements s0, RandomAccess, t1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d1 f2732d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f2733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2734c;

    static {
        d1 d1Var = new d1(new long[0], 0);
        f2732d = d1Var;
        d1Var.f2729a = false;
    }

    public d1(long[] jArr, int i7) {
        this.f2733b = jArr;
        this.f2734c = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        long jLongValue = ((Long) obj).longValue();
        c();
        if (i7 < 0 || i7 > (i10 = this.f2734c)) {
            StringBuilder sbT = ob.a.t("Index:", ", Size:", i7);
            sbT.append(this.f2734c);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        long[] jArr = this.f2733b;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, i7, jArr, i7 + 1, i10 - i7);
        } else {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i7);
            System.arraycopy(this.f2733b, i7, jArr2, i7 + 1, this.f2734c - i7);
            this.f2733b = jArr2;
        }
        this.f2733b[i7] = jLongValue;
        this.f2734c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = u0.f2861a;
        collection.getClass();
        if (!(collection instanceof d1)) {
            return super.addAll(collection);
        }
        d1 d1Var = (d1) collection;
        int i7 = d1Var.f2734c;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.f2734c;
        if (Integer.MAX_VALUE - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        long[] jArr = this.f2733b;
        if (i11 > jArr.length) {
            this.f2733b = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(d1Var.f2733b, 0, this.f2733b, this.f2734c, d1Var.f2734c);
        this.f2734c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j5) {
        c();
        int i7 = this.f2734c;
        long[] jArr = this.f2733b;
        if (i7 == jArr.length) {
            long[] jArr2 = new long[((i7 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i7);
            this.f2733b = jArr2;
        }
        long[] jArr3 = this.f2733b;
        int i10 = this.f2734c;
        this.f2734c = i10 + 1;
        jArr3[i10] = j5;
    }

    @Override // com.google.protobuf.t0
    public final t0 e(int i7) {
        if (i7 >= this.f2734c) {
            return new d1(Arrays.copyOf(this.f2733b, i7), this.f2734c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return super.equals(obj);
        }
        d1 d1Var = (d1) obj;
        if (this.f2734c != d1Var.f2734c) {
            return false;
        }
        long[] jArr = d1Var.f2733b;
        for (int i7 = 0; i7 < this.f2734c; i7++) {
            if (this.f2733b[i7] != jArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return Long.valueOf(m(i7));
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i7 = 0; i7 < this.f2734c; i7++) {
            iB = (iB * 31) + u0.b(this.f2733b[i7]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i7 = this.f2734c;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.f2733b[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void k(int i7) {
        if (i7 < 0 || i7 >= this.f2734c) {
            StringBuilder sbT = ob.a.t("Index:", ", Size:", i7);
            sbT.append(this.f2734c);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    public final long m(int i7) {
        k(i7);
        return this.f2733b[i7];
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        c();
        k(i7);
        long[] jArr = this.f2733b;
        long j5 = jArr[i7];
        int i10 = this.f2734c;
        if (i7 < i10 - 1) {
            System.arraycopy(jArr, i7 + 1, jArr, i7, (i10 - i7) - 1);
        }
        this.f2734c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        c();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f2733b;
        System.arraycopy(jArr, i10, jArr, i7, this.f2734c - i10);
        this.f2734c -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        c();
        k(i7);
        long[] jArr = this.f2733b;
        long j5 = jArr[i7];
        jArr[i7] = jLongValue;
        return Long.valueOf(j5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2734c;
    }
}

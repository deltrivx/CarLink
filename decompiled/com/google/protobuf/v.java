package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v extends d implements m0, RandomAccess, t1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f2866d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f2867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2868c;

    static {
        v vVar = new v(new double[0], 0);
        f2866d = vVar;
        vVar.f2729a = false;
    }

    public v(double[] dArr, int i7) {
        this.f2867b = dArr;
        this.f2868c = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        if (i7 < 0 || i7 > (i10 = this.f2868c)) {
            StringBuilder sbT = ob.a.t("Index:", ", Size:", i7);
            sbT.append(this.f2868c);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        double[] dArr = this.f2867b;
        if (i10 < dArr.length) {
            System.arraycopy(dArr, i7, dArr, i7 + 1, i10 - i7);
        } else {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i7);
            System.arraycopy(this.f2867b, i7, dArr2, i7 + 1, this.f2868c - i7);
            this.f2867b = dArr2;
        }
        this.f2867b[i7] = dDoubleValue;
        this.f2868c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = u0.f2861a;
        collection.getClass();
        if (!(collection instanceof v)) {
            return super.addAll(collection);
        }
        v vVar = (v) collection;
        int i7 = vVar.f2868c;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.f2868c;
        if (Integer.MAX_VALUE - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        double[] dArr = this.f2867b;
        if (i11 > dArr.length) {
            this.f2867b = Arrays.copyOf(dArr, i11);
        }
        System.arraycopy(vVar.f2867b, 0, this.f2867b, this.f2868c, vVar.f2868c);
        this.f2868c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(double d10) {
        c();
        int i7 = this.f2868c;
        double[] dArr = this.f2867b;
        if (i7 == dArr.length) {
            double[] dArr2 = new double[((i7 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i7);
            this.f2867b = dArr2;
        }
        double[] dArr3 = this.f2867b;
        int i10 = this.f2868c;
        this.f2868c = i10 + 1;
        dArr3[i10] = d10;
    }

    @Override // com.google.protobuf.t0
    public final t0 e(int i7) {
        if (i7 >= this.f2868c) {
            return new v(Arrays.copyOf(this.f2867b, i7), this.f2868c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return super.equals(obj);
        }
        v vVar = (v) obj;
        if (this.f2868c != vVar.f2868c) {
            return false;
        }
        double[] dArr = vVar.f2867b;
        for (int i7 = 0; i7 < this.f2868c; i7++) {
            if (Double.doubleToLongBits(this.f2867b[i7]) != Double.doubleToLongBits(dArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        k(i7);
        return Double.valueOf(this.f2867b[i7]);
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i7 = 0; i7 < this.f2868c; i7++) {
            iB = (iB * 31) + u0.b(Double.doubleToLongBits(this.f2867b[i7]));
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i7 = this.f2868c;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.f2867b[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void k(int i7) {
        if (i7 < 0 || i7 >= this.f2868c) {
            StringBuilder sbT = ob.a.t("Index:", ", Size:", i7);
            sbT.append(this.f2868c);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        c();
        k(i7);
        double[] dArr = this.f2867b;
        double d10 = dArr[i7];
        int i10 = this.f2868c;
        if (i7 < i10 - 1) {
            System.arraycopy(dArr, i7 + 1, dArr, i7, (i10 - i7) - 1);
        }
        this.f2868c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        c();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f2867b;
        System.arraycopy(dArr, i10, dArr, i7, this.f2868c - i10);
        this.f2868c -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        k(i7);
        double[] dArr = this.f2867b;
        double d10 = dArr[i7];
        dArr[i7] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2868c;
    }
}

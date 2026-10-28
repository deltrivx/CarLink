package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends d implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v1 f2869d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f2870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2871c;

    static {
        v1 v1Var = new v1(new Object[0], 0);
        f2869d = v1Var;
        v1Var.f2729a = false;
    }

    public v1(Object[] objArr, int i7) {
        this.f2870b = objArr;
        this.f2871c = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        c();
        if (i7 < 0 || i7 > (i10 = this.f2871c)) {
            StringBuilder sbT = ob.a.t("Index:", ", Size:", i7);
            sbT.append(this.f2871c);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        Object[] objArr = this.f2870b;
        if (i10 < objArr.length) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i10 - i7);
        } else {
            Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i7);
            System.arraycopy(this.f2870b, i7, objArr2, i7 + 1, this.f2871c - i7);
            this.f2870b = objArr2;
        }
        this.f2870b[i7] = obj;
        this.f2871c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i7 = this.f2871c;
        Object[] objArr = this.f2870b;
        if (i7 == objArr.length) {
            this.f2870b = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f2870b;
        int i10 = this.f2871c;
        this.f2871c = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(int i7) {
        if (i7 < 0 || i7 >= this.f2871c) {
            StringBuilder sbT = ob.a.t("Index:", ", Size:", i7);
            sbT.append(this.f2871c);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    @Override // com.google.protobuf.t0
    public final t0 e(int i7) {
        if (i7 >= this.f2871c) {
            return new v1(Arrays.copyOf(this.f2870b, i7), this.f2871c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        d(i7);
        return this.f2870b[i7];
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        c();
        d(i7);
        Object[] objArr = this.f2870b;
        Object obj = objArr[i7];
        int i10 = this.f2871c;
        if (i7 < i10 - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (i10 - i7) - 1);
        }
        this.f2871c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        c();
        d(i7);
        Object[] objArr = this.f2870b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2871c;
    }
}

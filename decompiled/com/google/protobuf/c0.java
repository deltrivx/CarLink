package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends d implements q0, RandomAccess, t1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f2723d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f2724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2725c;

    static {
        c0 c0Var = new c0(new float[0], 0);
        f2723d = c0Var;
        c0Var.f2729a = false;
    }

    public c0(float[] fArr, int i7) {
        this.f2724b = fArr;
        this.f2725c = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        float fFloatValue = ((Float) obj).floatValue();
        c();
        if (i7 < 0 || i7 > (i10 = this.f2725c)) {
            StringBuilder sbT = ob.a.t("Index:", ", Size:", i7);
            sbT.append(this.f2725c);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        float[] fArr = this.f2724b;
        if (i10 < fArr.length) {
            System.arraycopy(fArr, i7, fArr, i7 + 1, i10 - i7);
        } else {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i7);
            System.arraycopy(this.f2724b, i7, fArr2, i7 + 1, this.f2725c - i7);
            this.f2724b = fArr2;
        }
        this.f2724b[i7] = fFloatValue;
        this.f2725c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = u0.f2861a;
        collection.getClass();
        if (!(collection instanceof c0)) {
            return super.addAll(collection);
        }
        c0 c0Var = (c0) collection;
        int i7 = c0Var.f2725c;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.f2725c;
        if (Integer.MAX_VALUE - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        float[] fArr = this.f2724b;
        if (i11 > fArr.length) {
            this.f2724b = Arrays.copyOf(fArr, i11);
        }
        System.arraycopy(c0Var.f2724b, 0, this.f2724b, this.f2725c, c0Var.f2725c);
        this.f2725c = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(float f10) {
        c();
        int i7 = this.f2725c;
        float[] fArr = this.f2724b;
        if (i7 == fArr.length) {
            float[] fArr2 = new float[((i7 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i7);
            this.f2724b = fArr2;
        }
        float[] fArr3 = this.f2724b;
        int i10 = this.f2725c;
        this.f2725c = i10 + 1;
        fArr3[i10] = f10;
    }

    @Override // com.google.protobuf.t0
    public final t0 e(int i7) {
        if (i7 >= this.f2725c) {
            return new c0(Arrays.copyOf(this.f2724b, i7), this.f2725c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return super.equals(obj);
        }
        c0 c0Var = (c0) obj;
        if (this.f2725c != c0Var.f2725c) {
            return false;
        }
        float[] fArr = c0Var.f2724b;
        for (int i7 = 0; i7 < this.f2725c; i7++) {
            if (Float.floatToIntBits(this.f2724b[i7]) != Float.floatToIntBits(fArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        k(i7);
        return Float.valueOf(this.f2724b[i7]);
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i7 = 0; i7 < this.f2725c; i7++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f2724b[i7]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i7 = this.f2725c;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.f2724b[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void k(int i7) {
        if (i7 < 0 || i7 >= this.f2725c) {
            StringBuilder sbT = ob.a.t("Index:", ", Size:", i7);
            sbT.append(this.f2725c);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        c();
        k(i7);
        float[] fArr = this.f2724b;
        float f10 = fArr[i7];
        int i10 = this.f2725c;
        if (i7 < i10 - 1) {
            System.arraycopy(fArr, i7 + 1, fArr, i7, (i10 - i7) - 1);
        }
        this.f2725c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        c();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f2724b;
        System.arraycopy(fArr, i10, fArr, i7, this.f2725c - i10);
        this.f2725c -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        c();
        k(i7);
        float[] fArr = this.f2724b;
        float f10 = fArr[i7];
        fArr[i7] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2725c;
    }
}

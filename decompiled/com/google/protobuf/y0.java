package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends d implements z0, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2890b;

    static {
        new y0(10).f2729a = false;
    }

    public y0(int i7) {
        this(new ArrayList(i7));
    }

    public y0(ArrayList arrayList) {
        this.f2890b = arrayList;
    }

    @Override // com.google.protobuf.z0
    public final List a() {
        return Collections.unmodifiableList(this.f2890b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        c();
        this.f2890b.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        c();
        if (collection instanceof z0) {
            collection = ((z0) collection).a();
        }
        boolean zAddAll = this.f2890b.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f2890b.size(), collection);
    }

    @Override // com.google.protobuf.z0
    public final z0 b() {
        return this.f2729a ? new e2(this) : this;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.f2890b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.t0
    public final t0 e(int i7) {
        ArrayList arrayList = this.f2890b;
        if (i7 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i7);
        arrayList2.addAll(arrayList);
        return new y0(arrayList2);
    }

    @Override // com.google.protobuf.z0
    public final void f(l lVar) {
        c();
        this.f2890b.add(lVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        ArrayList arrayList = this.f2890b;
        Object obj = arrayList.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            String strU = lVar.u();
            if (lVar.p()) {
                arrayList.set(i7, strU);
            }
            return strU;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, u0.f2861a);
        if (m2.f2795a.K(bArr, 0, bArr.length)) {
            arrayList.set(i7, str);
        }
        return str;
    }

    @Override // com.google.protobuf.z0
    public final Object j(int i7) {
        return this.f2890b.get(i7);
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        c();
        Object objRemove = this.f2890b.remove(i7);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        return objRemove instanceof l ? ((l) objRemove).u() : new String((byte[]) objRemove, u0.f2861a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        c();
        Object obj2 = this.f2890b.set(i7, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return obj2 instanceof l ? ((l) obj2).u() : new String((byte[]) obj2, u0.f2861a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2890b.size();
    }
}

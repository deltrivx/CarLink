package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends AbstractList implements z0, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f2739a;

    public e2(y0 y0Var) {
        this.f2739a = y0Var;
    }

    @Override // com.google.protobuf.z0
    public final List a() {
        return Collections.unmodifiableList(this.f2739a.f2890b);
    }

    @Override // com.google.protobuf.z0
    public final z0 b() {
        return this;
    }

    @Override // com.google.protobuf.z0
    public final void f(l lVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return (String) this.f2739a.get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        d2 d2Var = new d2();
        d2Var.f2735a = this.f2739a.iterator();
        return d2Var;
    }

    @Override // com.google.protobuf.z0
    public final Object j(int i7) {
        return this.f2739a.f2890b.get(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        c2 c2Var = new c2();
        c2Var.f2728a = this.f2739a.listIterator(i7);
        return c2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2739a.size();
    }
}

package u8;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13107a;

    public d0(List list) {
        this.f13107a = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        this.f13107a.add(p.e0(i7, this), obj);
    }

    @Override // u8.g
    public final int c() {
        return this.f13107a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f13107a.clear();
    }

    @Override // u8.g
    public final Object d(int i7) {
        return this.f13107a.remove(p.d0(i7, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return this.f13107a.get(p.d0(i7, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new p1.c0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new p1.c0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new p1.c0(this, i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        return this.f13107a.set(p.d0(i7, this), obj);
    }
}

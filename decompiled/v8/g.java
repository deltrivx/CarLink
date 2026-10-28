package v8;

import i9.l;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import u8.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f13682b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f13683a;

    static {
        e eVar = e.f13667n;
        f13682b = new g(e.f13667n);
    }

    public g(e eVar) {
        l.e(eVar, "backing");
        this.f13683a = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f13683a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        l.e(collection, "elements");
        this.f13683a.c();
        return super.addAll(collection);
    }

    @Override // u8.h
    public final int c() {
        return this.f13683a.f13676i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f13683a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f13683a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f13683a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        e eVar = this.f13683a;
        eVar.getClass();
        return new c(eVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        e eVar = this.f13683a;
        eVar.c();
        int iJ = eVar.j(obj);
        if (iJ < 0) {
            return false;
        }
        eVar.n(iJ);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        l.e(collection, "elements");
        this.f13683a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        l.e(collection, "elements");
        this.f13683a.c();
        return super.retainAll(collection);
    }
}

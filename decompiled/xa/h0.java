package xa;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends AbstractList implements RandomAccess, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f14791a;

    public h0(r rVar) {
        this.f14791a = rVar;
    }

    @Override // xa.s
    public final List a() {
        return Collections.unmodifiableList(this.f14791a.f14825a);
    }

    @Override // xa.s
    public final h0 b() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return (String) this.f14791a.get(i7);
    }

    @Override // xa.s
    public final d h(int i7) {
        return this.f14791a.h(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        g0 g0Var = new g0();
        g0Var.f14787a = this.f14791a.iterator();
        return g0Var;
    }

    @Override // xa.s
    public final void l(t tVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        f0 f0Var = new f0();
        f0Var.f14784a = this.f14791a.listIterator(i7);
        return f0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14791a.size();
    }
}

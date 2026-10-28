package s;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import o2.j1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Map, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f12498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f12499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f12500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j1 f12501d;

    public t(h0 h0Var) {
        i9.l.e(h0Var, "parent");
        this.f12498a = h0Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f12498a.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f12498a.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h hVar = this.f12499b;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this.f12498a, 0);
        this.f12499b = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        return i9.l.a(this.f12498a, ((t) obj).f12498a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f12498a.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f12498a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f12498a.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.f12500c;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this.f12498a, 1);
        this.f12500c = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f12498a.f12441e;
    }

    public final String toString() {
        return this.f12498a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        j1 j1Var = this.f12501d;
        if (j1Var != null) {
            return j1Var;
        }
        j1 j1Var2 = new j1(this.f12498a);
        this.f12501d = j1Var2;
        return j1Var2;
    }
}

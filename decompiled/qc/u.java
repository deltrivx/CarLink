package qc;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u extends j implements Map<String, j>, j9.a {
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f11052a;

    public u(Map map) {
        i9.l.e(map, "content");
        this.f11052a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j compute(String str, BiFunction<? super String, ? super j, ? extends j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j computeIfAbsent(String str, Function<? super String, ? extends j> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j computeIfPresent(String str, BiFunction<? super String, ? super j, ? extends j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f11052a.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        return this.f11052a.containsValue((j) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, j>> entrySet() {
        return this.f11052a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return i9.l.a(this.f11052a, obj);
    }

    @Override // java.util.Map
    public final j get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (j) this.f11052a.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f11052a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f11052a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f11052a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j merge(String str, j jVar, BiFunction<? super j, ? super j, ? extends j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j put(String str, j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends j> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j putIfAbsent(String str, j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final j remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j replace(String str, j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, j jVar, j jVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super j, ? extends j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f11052a.size();
    }

    public final String toString() {
        return u8.p.q0(this.f11052a.entrySet(), ",", "{", "}", new o7.q(10), 24);
    }

    @Override // java.util.Map
    public final Collection<j> values() {
        return this.f11052a.values();
    }
}

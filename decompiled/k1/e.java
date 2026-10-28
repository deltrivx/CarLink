package k1;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class e extends AbstractMap implements i1.c, Map, j9.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f7155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m1.b f7156b = new m1.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f7157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7160f;

    public e(c cVar) {
        this.f7155a = cVar;
        this.f7157c = cVar.f7150a;
        this.f7160f = cVar.f7151b;
    }

    @Override // i1.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c build() {
        m mVar = this.f7157c;
        c cVar = this.f7155a;
        if (mVar != cVar.f7150a) {
            this.f7156b = new m1.b();
            cVar = new c(this.f7157c, this.f7160f);
        }
        this.f7155a = cVar;
        return cVar;
    }

    public final void b(int i7) {
        this.f7160f = i7;
        this.f7159e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f7157c = m.f7172e;
        b(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f7157c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new g(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f7157c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new g(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f7158d = null;
        this.f7157c = this.f7157c.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f7158d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        c cVarBuild = null;
        c cVar = map instanceof c ? (c) map : null;
        if (cVar == null) {
            e eVar = map instanceof e ? (e) map : null;
            if (eVar != null) {
                cVarBuild = eVar.build();
            }
        } else {
            cVarBuild = cVar;
        }
        if (cVarBuild == null) {
            super.putAll(map);
            return;
        }
        m1.a aVar = new m1.a();
        aVar.f8398a = 0;
        int i7 = this.f7160f;
        m mVar = this.f7157c;
        m mVar2 = cVarBuild.f7150a;
        i9.l.c(mVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f7157c = mVar.m(mVar2, 0, aVar, this);
        int i10 = (cVarBuild.f7151b + i7) - aVar.f8398a;
        if (i7 != i10) {
            b(i10);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f7158d = null;
        m mVarN = this.f7157c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (mVarN == null) {
            mVarN = m.f7172e;
        }
        this.f7157c = mVarN;
        return this.f7158d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i7 = this.f7160f;
        m mVarO = this.f7157c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (mVarO == null) {
            mVarO = m.f7172e;
        }
        this.f7157c = mVarO;
        return i7 != this.f7160f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7160f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new i(0, this);
    }
}

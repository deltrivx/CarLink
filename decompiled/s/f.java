package s;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends q0 implements Map {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f12419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f12420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f12421f;

    @Override // java.util.Map
    public final Set entrySet() {
        a aVar = this.f12419d;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this, 0);
        this.f12419d = aVar2;
        return aVar2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i7 = this.f12485c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i7 != this.f12485c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c cVar = this.f12420e;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f12420e = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f12485c;
        int i7 = this.f12485c;
        int[] iArr = this.f12483a;
        if (iArr.length < size) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, size);
            i9.l.d(iArrCopyOf, "copyOf(...)");
            this.f12483a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12484b, size * 2);
            i9.l.d(objArrCopyOf, "copyOf(...)");
            this.f12484b = objArrCopyOf;
        }
        if (this.f12485c != i7) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        e eVar = this.f12421f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f12421f = eVar2;
        return eVar2;
    }
}

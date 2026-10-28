package s;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12404b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f12406d;

    public d(f fVar) {
        this.f12406d = fVar;
        this.f12403a = fVar.f12485c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f12405c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i7 = this.f12404b;
        f fVar = this.f12406d;
        return i9.l.a(key, fVar.e(i7)) && i9.l.a(entry.getValue(), fVar.h(this.f12404b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f12405c) {
            return this.f12406d.e(this.f12404b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f12405c) {
            return this.f12406d.h(this.f12404b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12404b < this.f12403a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f12405c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i7 = this.f12404b;
        f fVar = this.f12406d;
        Object objE = fVar.e(i7);
        Object objH = fVar.h(this.f12404b);
        return (objE == null ? 0 : objE.hashCode()) ^ (objH != null ? objH.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12404b++;
        this.f12405c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f12405c) {
            throw new IllegalStateException();
        }
        this.f12406d.f(this.f12404b);
        this.f12404b--;
        this.f12403a--;
        this.f12405c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f12405c) {
            return this.f12406d.g(this.f12404b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}

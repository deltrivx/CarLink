package v8;

import i9.l;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Map.Entry, j9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f13664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13666c;

    public d(e eVar, int i7) {
        l.e(eVar, "map");
        this.f13664a = eVar;
        this.f13665b = i7;
        this.f13666c = eVar.f13675h;
    }

    public final void a() {
        if (this.f13664a.f13675h != this.f13666c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return l.a(entry.getKey(), getKey()) && l.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f13664a.f13668a[this.f13665b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f13664a.f13669b;
        l.b(objArr);
        return objArr[this.f13665b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        e eVar = this.f13664a;
        eVar.c();
        Object[] objArr = eVar.f13669b;
        if (objArr == null) {
            int length = eVar.f13668a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            eVar.f13669b = objArr;
        }
        int i7 = this.f13665b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}

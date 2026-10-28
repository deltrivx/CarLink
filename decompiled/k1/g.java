package k1;

import e2.g0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends u8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f7166b;

    public /* synthetic */ g(int i7, e eVar) {
        this.f7165a = i7;
        this.f7166b = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f7165a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // u8.h
    public final int c() {
        switch (this.f7165a) {
            case 0:
                e eVar = this.f7166b;
                eVar.getClass();
                return eVar.f7160f;
            default:
                e eVar2 = this.f7166b;
                eVar2.getClass();
                return eVar2.f7160f;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f7165a) {
            case 0:
                this.f7166b.clear();
                break;
            default:
                this.f7166b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f7165a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    e eVar = this.f7166b;
                    Object obj2 = eVar.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && eVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f7166b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f7165a) {
            case 0:
                return new g0(this.f7166b);
            default:
                n[] nVarArr = new n[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    nVarArr[i7] = new o(1);
                }
                return new h(this.f7166b, nVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f7165a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f7166b.remove(entry.getKey(), entry.getValue());
            default:
                e eVar = this.f7166b;
                if (!eVar.containsKey(obj)) {
                    return false;
                }
                eVar.remove(obj);
                return true;
        }
    }
}

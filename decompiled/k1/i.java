package k1;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractCollection implements Collection, j9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7168b;

    public /* synthetic */ i(int i7, Object obj) {
        this.f7167a = i7;
        this.f7168b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f7167a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f7167a) {
            case 1:
                i9.l.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f7167a) {
            case 0:
                ((e) this.f7168b).clear();
                break;
            default:
                ((v8.e) this.f7168b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f7167a) {
            case 0:
                return ((e) this.f7168b).containsValue(obj);
            default:
                return ((v8.e) this.f7168b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f7167a) {
            case 1:
                return ((v8.e) this.f7168b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f7167a) {
            case 0:
                e eVar = (e) this.f7168b;
                n[] nVarArr = new n[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    nVarArr[i7] = new o(2);
                }
                return new h(eVar, nVarArr);
            default:
                v8.e eVar2 = (v8.e) this.f7168b;
                eVar2.getClass();
                return new v8.c(eVar2, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f7167a) {
            case 1:
                v8.e eVar = (v8.e) this.f7168b;
                eVar.c();
                int iK = eVar.k(obj);
                if (iK < 0) {
                    return false;
                }
                eVar.n(iK);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f7167a) {
            case 1:
                i9.l.e(collection, "elements");
                ((v8.e) this.f7168b).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f7167a) {
            case 1:
                i9.l.e(collection, "elements");
                ((v8.e) this.f7168b).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f7167a) {
            case 0:
                e eVar = (e) this.f7168b;
                eVar.getClass();
                return eVar.f7160f;
            default:
                return ((v8.e) this.f7168b).f13676i;
        }
    }
}

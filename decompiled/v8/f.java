package v8;

import i9.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import u8.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f13681b;

    public /* synthetic */ f(e eVar, int i7) {
        this.f13680a = i7;
        this.f13681b = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f13680a) {
            case 0:
                l.e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f13680a) {
            case 0:
                l.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                l.e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // u8.h
    public final int c() {
        switch (this.f13680a) {
            case 0:
                break;
        }
        return this.f13681b.f13676i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f13680a) {
            case 0:
                this.f13681b.clear();
                break;
            default:
                this.f13681b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f13680a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.f13681b.f((Map.Entry) obj);
            default:
                return this.f13681b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f13680a) {
            case 0:
                l.e(collection, "elements");
                return this.f13681b.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f13680a) {
            case 0:
                break;
        }
        return this.f13681b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f13680a) {
            case 0:
                e eVar = this.f13681b;
                eVar.getClass();
                return new c(eVar, 0);
            default:
                e eVar2 = this.f13681b;
                eVar2.getClass();
                return new c(eVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f13680a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                e eVar = this.f13681b;
                eVar.getClass();
                eVar.c();
                int iJ = eVar.j(entry.getKey());
                if (iJ < 0) {
                    return false;
                }
                Object[] objArr = eVar.f13669b;
                l.b(objArr);
                if (!l.a(objArr[iJ], entry.getValue())) {
                    return false;
                }
                eVar.n(iJ);
                return true;
            default:
                e eVar2 = this.f13681b;
                eVar2.c();
                int iJ2 = eVar2.j(obj);
                if (iJ2 < 0) {
                    return false;
                }
                eVar2.n(iJ2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f13680a) {
            case 0:
                l.e(collection, "elements");
                this.f13681b.c();
                break;
            default:
                l.e(collection, "elements");
                this.f13681b.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f13680a) {
            case 0:
                l.e(collection, "elements");
                this.f13681b.c();
                break;
            default:
                l.e(collection, "elements");
                this.f13681b.c();
                break;
        }
        return super.retainAll(collection);
    }
}

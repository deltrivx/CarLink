package h1;

import i9.k;
import i9.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import s.m0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements List, j9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6417d;

    public /* synthetic */ c(List list, int i7, int i10, int i11) {
        this.f6414a = i11;
        this.f6415b = list;
        this.f6416c = i7;
        this.f6417d = i10;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i7, Object obj) {
        switch (this.f6414a) {
            case 0:
                this.f6415b.add(i7 + this.f6416c, obj);
                this.f6417d++;
                break;
            default:
                this.f6415b.add(i7 + this.f6416c, obj);
                this.f6417d++;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f6414a) {
            case 0:
                int i7 = this.f6417d;
                this.f6417d = i7 + 1;
                this.f6415b.add(i7, obj);
                break;
            default:
                int i10 = this.f6417d;
                this.f6417d = i10 + 1;
                this.f6415b.add(i10, obj);
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        switch (this.f6414a) {
            case 0:
                this.f6415b.addAll(i7 + this.f6416c, collection);
                int size = collection.size();
                this.f6417d += size;
                return size > 0;
            default:
                l.e(collection, "elements");
                this.f6415b.addAll(i7 + this.f6416c, collection);
                this.f6417d = collection.size() + this.f6417d;
                return collection.size() > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f6414a) {
            case 0:
                this.f6415b.addAll(this.f6417d, collection);
                int size = collection.size();
                this.f6417d += size;
                return size > 0;
            default:
                l.e(collection, "elements");
                this.f6415b.addAll(this.f6417d, collection);
                this.f6417d = collection.size() + this.f6417d;
                return collection.size() > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f6414a) {
            case 0:
                int i7 = this.f6417d - 1;
                int i10 = this.f6416c;
                if (i10 <= i7) {
                    while (true) {
                        this.f6415b.remove(i7);
                        if (i7 != i10) {
                            i7--;
                        }
                    }
                }
                this.f6417d = i10;
                break;
            default:
                int i11 = this.f6417d - 1;
                int i12 = this.f6416c;
                if (i12 <= i11) {
                    while (true) {
                        this.f6415b.remove(i11);
                        if (i11 != i12) {
                            i11--;
                        }
                    }
                }
                this.f6417d = i12;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f6414a) {
            case 0:
                int i7 = this.f6417d;
                for (int i10 = this.f6416c; i10 < i7; i10++) {
                    if (l.a(this.f6415b.get(i10), obj)) {
                        return true;
                    }
                }
                return false;
            default:
                int i11 = this.f6417d;
                for (int i12 = this.f6416c; i12 < i11; i12++) {
                    if (l.a(this.f6415b.get(i12), obj)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f6414a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                l.e(collection, "elements");
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i7) {
        switch (this.f6414a) {
            case 0:
                f.a(i7, this);
                return this.f6415b.get(i7 + this.f6416c);
            default:
                m0.a(i7, this);
                return this.f6415b.get(i7 + this.f6416c);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f6414a) {
            case 0:
                int i7 = this.f6417d;
                int i10 = this.f6416c;
                for (int i11 = i10; i11 < i7; i11++) {
                    if (l.a(this.f6415b.get(i11), obj)) {
                        return i11 - i10;
                    }
                }
                return -1;
            default:
                int i12 = this.f6417d;
                int i13 = this.f6416c;
                for (int i14 = i13; i14 < i12; i14++) {
                    if (l.a(this.f6415b.get(i14), obj)) {
                        return i14 - i13;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f6414a) {
            case 0:
                return this.f6417d == this.f6416c;
            default:
                return this.f6417d == this.f6416c;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f6414a) {
            case 0:
                return new d(this, 0, 0);
            default:
                return new d(this, 0, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.f6414a) {
            case 0:
                int i7 = this.f6417d - 1;
                int i10 = this.f6416c;
                if (i10 <= i7) {
                    while (!l.a(this.f6415b.get(i7), obj)) {
                        if (i7 != i10) {
                            i7--;
                        }
                    }
                    return i7 - i10;
                }
                return -1;
            default:
                int i11 = this.f6417d - 1;
                int i12 = this.f6416c;
                if (i12 <= i11) {
                    while (!l.a(this.f6415b.get(i11), obj)) {
                        if (i11 != i12) {
                            i11--;
                        }
                    }
                    return i11 - i12;
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f6414a) {
            case 0:
                return new d(this, 0, 0);
            default:
                return new d(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        switch (this.f6414a) {
            case 0:
                return new d(this, i7, 0);
            default:
                return new d(this, i7, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i7) {
        switch (this.f6414a) {
            case 0:
                f.a(i7, this);
                Object objRemove = this.f6415b.remove(i7 + this.f6416c);
                this.f6417d--;
                return objRemove;
            default:
                m0.a(i7, this);
                Object objRemove2 = this.f6415b.remove(i7 + this.f6416c);
                this.f6417d--;
                return objRemove2;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f6414a) {
            case 0:
                int i7 = this.f6417d;
                for (int i10 = this.f6416c; i10 < i7; i10++) {
                    ?? r8 = this.f6415b;
                    if (l.a(r8.get(i10), obj)) {
                        r8.remove(i10);
                        this.f6417d--;
                        return true;
                    }
                }
                return false;
            default:
                int i11 = this.f6417d;
                for (int i12 = this.f6416c; i12 < i11; i12++) {
                    ?? r10 = this.f6415b;
                    if (l.a(r10.get(i12), obj)) {
                        r10.remove(i12);
                        this.f6417d--;
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f6414a) {
            case 0:
                int i7 = this.f6417d;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i7 != this.f6417d;
            default:
                l.e(collection, "elements");
                int i10 = this.f6417d;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                return i10 != this.f6417d;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f6414a) {
            case 0:
                int i7 = this.f6417d;
                int i10 = i7 - 1;
                int i11 = this.f6416c;
                if (i11 <= i10) {
                    while (true) {
                        ?? r8 = this.f6415b;
                        if (!collection.contains(r8.get(i10))) {
                            r8.remove(i10);
                            this.f6417d--;
                        }
                        if (i10 != i11) {
                            i10--;
                        }
                    }
                }
                return i7 != this.f6417d;
            default:
                l.e(collection, "elements");
                int i12 = this.f6417d;
                int i13 = i12 - 1;
                int i14 = this.f6416c;
                if (i14 <= i13) {
                    while (true) {
                        ?? r10 = this.f6415b;
                        if (!collection.contains(r10.get(i13))) {
                            r10.remove(i13);
                            this.f6417d--;
                        }
                        if (i13 != i14) {
                            i13--;
                        }
                    }
                }
                return i12 != this.f6417d;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        switch (this.f6414a) {
            case 0:
                f.a(i7, this);
                return this.f6415b.set(i7 + this.f6416c, obj);
            default:
                m0.a(i7, this);
                return this.f6415b.set(i7 + this.f6416c, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i7;
        int i10;
        switch (this.f6414a) {
            case 0:
                i7 = this.f6417d;
                i10 = this.f6416c;
                break;
            default:
                i7 = this.f6417d;
                i10 = this.f6416c;
                break;
        }
        return i7 - i10;
    }

    @Override // java.util.List
    public final List subList(int i7, int i10) {
        switch (this.f6414a) {
            case 0:
                f.b(this, i7, i10);
                return new c(this, i7, i10, 0);
            default:
                m0.b(this, i7, i10);
                return new c(this, i7, i10, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f6414a) {
            case 0:
                break;
        }
        return k.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f6414a) {
            case 0:
                break;
            default:
                l.e(objArr, "array");
                break;
        }
        return k.b(this, objArr);
    }
}

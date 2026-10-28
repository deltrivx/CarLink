package h1;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ListIterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6420c;

    public d(List list, int i7, int i10) {
        this.f6418a = i10;
        switch (i10) {
            case 1:
                this.f6419b = list;
                this.f6420c = i7 - 1;
                break;
            default:
                this.f6419b = list;
                this.f6420c = i7;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f6418a) {
            case 0:
                this.f6419b.add(this.f6420c, obj);
                this.f6420c++;
                break;
            default:
                int i7 = this.f6420c + 1;
                this.f6420c = i7;
                this.f6419b.add(i7, obj);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6418a) {
            case 0:
                return this.f6420c < this.f6419b.size();
            default:
                return this.f6420c < this.f6419b.size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f6418a) {
            case 0:
                return this.f6420c > 0;
            default:
                return this.f6420c >= 0;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f6418a) {
            case 0:
                int i7 = this.f6420c;
                this.f6420c = i7 + 1;
                return this.f6419b.get(i7);
            default:
                int i10 = this.f6420c + 1;
                this.f6420c = i10;
                return this.f6419b.get(i10);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f6418a) {
            case 0:
                return this.f6420c;
            default:
                return this.f6420c + 1;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f6418a) {
            case 0:
                int i7 = this.f6420c - 1;
                this.f6420c = i7;
                return this.f6419b.get(i7);
            default:
                int i10 = this.f6420c;
                this.f6420c = i10 - 1;
                return this.f6419b.get(i10);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f6418a) {
            case 0:
                return this.f6420c - 1;
            default:
                return this.f6420c;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f6418a) {
            case 0:
                int i7 = this.f6420c - 1;
                this.f6420c = i7;
                this.f6419b.remove(i7);
                break;
            default:
                this.f6419b.remove(this.f6420c);
                this.f6420c--;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f6418a) {
            case 0:
                this.f6419b.set(this.f6420c, obj);
                break;
            default:
                this.f6419b.set(this.f6420c, obj);
                break;
        }
    }
}

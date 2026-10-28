package s;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12390e;

    public b(int i7) {
        this.f12386a = i7;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i7) {
        this(fVar.f12485c);
        this.f12389d = i7;
        switch (i7) {
            case 1:
                this.f12390e = fVar;
                this(fVar.f12485c);
                break;
            default:
                this.f12390e = fVar;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(g gVar) {
        this(gVar.f12432c);
        this.f12389d = 2;
        this.f12390e = gVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12387b < this.f12386a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objE;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f12387b;
        switch (this.f12389d) {
            case 0:
                objE = ((f) this.f12390e).e(i7);
                break;
            case 1:
                objE = ((f) this.f12390e).h(i7);
                break;
            default:
                objE = ((g) this.f12390e).f12431b[i7];
                break;
        }
        this.f12387b++;
        this.f12388c = true;
        return objE;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f12388c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i7 = this.f12387b - 1;
        this.f12387b = i7;
        switch (this.f12389d) {
            case 0:
                ((f) this.f12390e).f(i7);
                break;
            case 1:
                ((f) this.f12390e).f(i7);
                break;
            default:
                ((g) this.f12390e).c(i7);
                break;
        }
        this.f12386a--;
        this.f12388c = false;
    }
}

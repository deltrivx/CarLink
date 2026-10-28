package p1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Iterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f10109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f10110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map.Entry f10112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map.Entry f10113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10114f;

    public y(s sVar, Iterator it, int i7) {
        this.f10114f = i7;
        this.f10109a = sVar;
        this.f10110b = it;
        this.f10111c = sVar.e().f10072d;
        a();
    }

    public final void a() {
        this.f10112d = this.f10113e;
        Iterator it = this.f10110b;
        this.f10113e = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10113e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10114f) {
            case 0:
                a();
                if (this.f10112d != null) {
                    return new x(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.f10113e;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.f10113e;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        s sVar = this.f10109a;
        if (sVar.e().f10072d != this.f10111c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f10112d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        sVar.remove(entry.getKey());
        this.f10112d = null;
        this.f10111c = sVar.e().f10072d;
    }
}

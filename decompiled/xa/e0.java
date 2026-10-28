package xa;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14778a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f14780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f14781d;

    public e0(z zVar) {
        this.f14781d = zVar;
    }

    public final Iterator a() {
        if (this.f14780c == null) {
            this.f14780c = this.f14781d.f14843c.entrySet().iterator();
        }
        return this.f14780c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14778a + 1 < this.f14781d.f14842b.size() || a().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f14779b = true;
        int i7 = this.f14778a + 1;
        this.f14778a = i7;
        z zVar = this.f14781d;
        return i7 < zVar.f14842b.size() ? (Map.Entry) zVar.f14842b.get(this.f14778a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f14779b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f14779b = false;
        int i7 = z.f14840f;
        z zVar = this.f14781d;
        zVar.b();
        if (this.f14778a >= zVar.f14842b.size()) {
            a().remove();
            return;
        }
        int i10 = this.f14778a;
        this.f14778a = i10 - 1;
        zVar.f(i10);
    }
}

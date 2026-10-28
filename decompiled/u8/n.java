package u8;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterable, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13118b;

    public /* synthetic */ n(int i7, Object obj) {
        this.f13117a = i7;
        this.f13118b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f13117a) {
            case 0:
                return i9.l.h((Object[]) this.f13118b);
            case 1:
                return new a0((Iterator) ((h9.a) this.f13118b).invoke());
            default:
                return ((yb.j) this.f13118b).iterator();
        }
    }
}

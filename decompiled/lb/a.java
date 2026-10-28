package lb;

import i9.y;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class a implements y9.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ o9.u[] f8303b = {y.f6689a.g(new i9.r(a.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mb.i f8304a;

    public a(mb.n nVar, h9.a aVar) {
        i9.l.e(nVar, "storageManager");
        this.f8304a = new mb.i((mb.k) nVar, aVar);
    }

    @Override // y9.h
    public final y9.b g(wa.c cVar) {
        return n4.h.C(this, cVar);
    }

    @Override // y9.h
    public final boolean i(wa.c cVar) {
        return n4.h.K(this, cVar);
    }

    @Override // y9.h
    public boolean isEmpty() {
        return ((List) k9.a.z(this.f8304a, f8303b[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) k9.a.z(this.f8304a, f8303b[0])).iterator();
    }
}

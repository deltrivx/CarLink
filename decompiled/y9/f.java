package y9;

import java.util.Iterator;
import u8.v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h {
    @Override // y9.h
    public final b g(wa.c cVar) {
        i9.l.e(cVar, "fqName");
        return null;
    }

    @Override // y9.h
    public final boolean i(wa.c cVar) {
        return n4.h.K(this, cVar);
    }

    @Override // y9.h
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return v.f13121a;
    }

    public final String toString() {
        return "EMPTY";
    }
}

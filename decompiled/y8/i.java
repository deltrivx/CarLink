package y8;

import h9.n;
import i9.l;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f15108a = new i();

    @Override // y8.h
    public final h h(g gVar) {
        l.e(gVar, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // y8.h
    public final f l(g gVar) {
        l.e(gVar, "key");
        return null;
    }

    @Override // y8.h
    public final Object q(n nVar, Object obj) {
        return obj;
    }

    @Override // y8.h
    public final h s(h hVar) {
        l.e(hVar, "context");
        return hVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}

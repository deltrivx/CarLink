package da;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y extends s implements na.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wa.c f3890a;

    public y(wa.c cVar) {
        i9.l.e(cVar, "fqName");
        this.f3890a = cVar;
    }

    @Override // na.b
    public final e a(wa.c cVar) {
        i9.l.e(cVar, "fqName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return i9.l.a(this.f3890a, ((y) obj).f3890a);
        }
        return false;
    }

    @Override // na.b
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return u8.w.f13122a;
    }

    public final int hashCode() {
        return this.f3890a.hashCode();
    }

    public final String toString() {
        return y.class.getName() + ": " + this.f3890a;
    }
}

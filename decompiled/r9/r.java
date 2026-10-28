package r9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class r implements o9.b, p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f11752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11753b;

    public r() {
        n4.h.R(null, new p(this, 0));
        this.f11752a = n4.h.R(null, new p(this, 1));
        n4.h.R(null, new p(this, 2));
        n4.h.R(null, new p(this, 3));
        n4.h.R(null, new p(this, 4));
        this.f11753b = t8.a.c(t8.i.f12827a, new p(this, 5));
    }

    public final Object f(Object... objArr) throws n5.q {
        try {
            return g().t(objArr);
        } catch (IllegalAccessException e7) {
            throw new n5.q(e7);
        }
    }

    public abstract s9.g g();

    public abstract e0 h();

    public abstract s9.g i();

    public abstract x9.c j();

    public final List k() {
        Object objInvoke = this.f11752a.invoke();
        i9.l.d(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    public final boolean l() {
        return i9.l.a(getName(), "<init>") && h().a().isAnnotation();
    }

    public abstract boolean m();
}

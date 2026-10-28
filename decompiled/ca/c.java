package ca;

import i9.l;
import zb.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f2576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qa.b f2577b;

    public c(Class cls, qa.b bVar) {
        this.f2576a = cls;
        this.f2577b = bVar;
    }

    public final String a() {
        return q.m0(this.f2576a.getName(), '.', '/').concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return l.a(this.f2576a, ((c) obj).f2576a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2576a.hashCode();
    }

    public final String toString() {
        return c.class.getName() + ": " + this.f2576a;
    }
}

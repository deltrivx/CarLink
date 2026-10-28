package v7;

import fc.h0;
import fc.y;
import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f13646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h0 f13647d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f13648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13649b;

    static {
        h0 h0VarB = y.b(new g(f.Settings, false));
        f13646c = h0VarB;
        f13647d = h0VarB;
    }

    public g(f fVar, boolean z10) {
        l.e(fVar, "navigation");
        this.f13648a = fVar;
        this.f13649b = z10;
    }

    public static g a(g gVar, boolean z10) {
        f fVar = gVar.f13648a;
        gVar.getClass();
        l.e(fVar, "navigation");
        return new g(fVar, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f13648a == gVar.f13648a && this.f13649b == gVar.f13649b;
    }

    public final int hashCode() {
        return (this.f13648a.hashCode() * 31) + (this.f13649b ? 1231 : 1237);
    }

    public final String toString() {
        return "OptionState(navigation=" + this.f13648a + ", showDialog=" + this.f13649b + ")";
    }
}

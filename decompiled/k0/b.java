package k0;

import n3.f;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7137a;

    public b(float f10) {
        this.f7137a = f10;
    }

    @Override // k0.a
    public final float a(long j5, n3.c cVar) {
        return cVar.R(this.f7137a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.a(this.f7137a, ((b) obj).f7137a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f7137a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f7137a + ".dp)";
    }
}

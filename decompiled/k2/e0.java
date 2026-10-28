package k2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7210a;

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            return this.f7210a == ((e0) obj).f7210a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7210a;
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f7210a + ')';
    }
}

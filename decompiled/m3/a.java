package m3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8401a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f8401a, ((a) obj).f8401a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f8401a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f8401a + ')';
    }
}

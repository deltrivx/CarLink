package m1;

import a2.f;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8398a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f8398a == ((a) obj).f8398a;
    }

    public final int hashCode() {
        return this.f8398a;
    }

    public final String toString() {
        return f.H(new StringBuilder("DeltaCounter(count="), this.f8398a, ')');
    }
}

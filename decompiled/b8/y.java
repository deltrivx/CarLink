package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y extends c2 {
    public static final x Companion = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1669b;

    public y() {
        this.f1669b = 0;
    }

    public /* synthetic */ y(int i7, int i10) {
        if ((i7 & 1) == 0) {
            this.f1669b = 0;
        } else {
            this.f1669b = i10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.f1669b == ((y) obj).f1669b;
    }

    public final int hashCode() {
        return this.f1669b;
    }

    public final String toString() {
        return a2.f.F("Boot(code=", ")", this.f1669b);
    }
}

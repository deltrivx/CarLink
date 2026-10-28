package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends c2 {
    public static final l Companion = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1608b;

    public m(int i7) {
        this.f1608b = i7;
    }

    public /* synthetic */ m(int i7, int i10) {
        if ((i7 & 1) == 0) {
            this.f1608b = 0;
        } else {
            this.f1608b = i10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f1608b == ((m) obj).f1608b;
    }

    public final int hashCode() {
        return this.f1608b;
    }

    public final String toString() {
        return a2.f.F("AppSwitch(code=", ")", this.f1608b);
    }
}

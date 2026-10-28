package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends c2 {
    public static final a2 Companion = new a2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1570b;

    public /* synthetic */ b2(int i7, boolean z10) {
        if ((i7 & 1) == 0) {
            this.f1570b = true;
        } else {
            this.f1570b = z10;
        }
    }

    public b2(boolean z10) {
        this.f1570b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2) && this.f1570b == ((b2) obj).f1570b;
    }

    public final int hashCode() {
        return this.f1570b ? 1231 : 1237;
    }

    public final String toString() {
        return "WifiSwitch(enabled=" + this.f1570b + ")";
    }
}

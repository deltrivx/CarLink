package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v extends c2 {
    public static final u Companion = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1659b;

    public /* synthetic */ v(int i7, boolean z10) {
        if ((i7 & 1) == 0) {
            this.f1659b = true;
        } else {
            this.f1659b = z10;
        }
    }

    public v(boolean z10) {
        this.f1659b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f1659b == ((v) obj).f1659b;
    }

    public final int hashCode() {
        return this.f1659b ? 1231 : 1237;
    }

    public final String toString() {
        return "BluetoothSwitch(enabled=" + this.f1659b + ")";
    }
}

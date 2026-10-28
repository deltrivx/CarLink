package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends c2 {
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1598b;

    public i0(int i7) {
        this.f1598b = i7;
    }

    public /* synthetic */ i0(int i7, int i10) {
        if ((i7 & 1) == 0) {
            this.f1598b = 0;
        } else {
            this.f1598b = i10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && this.f1598b == ((i0) obj).f1598b;
    }

    public final int hashCode() {
        return this.f1598b;
    }

    public final String toString() {
        return a2.f.F("ConnectType(code=", ")", this.f1598b);
    }
}

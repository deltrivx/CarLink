package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends c2 {
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1582b;

    public f0(int i7) {
        this.f1582b = i7;
    }

    public /* synthetic */ f0(int i7, int i10) {
        if ((i7 & 1) == 0) {
            this.f1582b = 0;
        } else {
            this.f1582b = i10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && this.f1582b == ((f0) obj).f1582b;
    }

    public final int hashCode() {
        return this.f1582b;
    }

    public final String toString() {
        return a2.f.F("ConnectState(code=", ")", this.f1582b);
    }
}

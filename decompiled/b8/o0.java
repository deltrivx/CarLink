package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends c2 {
    public static final n0 Companion = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1628b;

    public o0(int i7) {
        this.f1628b = i7;
    }

    public /* synthetic */ o0(int i7, int i10) {
        if ((i7 & 1) == 0) {
            this.f1628b = 0;
        } else {
            this.f1628b = i10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && this.f1628b == ((o0) obj).f1628b;
    }

    public final int hashCode() {
        return this.f1628b;
    }

    public final String toString() {
        return a2.f.F("Desay(code=", ")", this.f1628b);
    }
}

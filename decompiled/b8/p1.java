package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends c2 {
    public static final o1 Companion = new o1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1634b;

    public p1(int i7) {
        this.f1634b = i7;
    }

    public /* synthetic */ p1(int i7, int i10) {
        if ((i7 & 1) == 0) {
            this.f1634b = 0;
        } else {
            this.f1634b = i10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1) && this.f1634b == ((p1) obj).f1634b;
    }

    public final int hashCode() {
        return this.f1634b;
    }

    public final String toString() {
        return a2.f.F("SystemUi(code=", ")", this.f1634b);
    }
}

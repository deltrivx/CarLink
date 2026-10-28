package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends c2 {
    public static final c1 Companion = new c1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1575b;

    public d1(int i7) {
        this.f1575b = i7;
    }

    public /* synthetic */ d1(int i7, int i10) {
        if ((i7 & 1) == 0) {
            this.f1575b = 0;
        } else {
            this.f1575b = i10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && this.f1575b == ((d1) obj).f1575b;
    }

    public final int hashCode() {
        return this.f1575b;
    }

    public final String toString() {
        return a2.f.F("Message(code=", ")", this.f1575b);
    }
}

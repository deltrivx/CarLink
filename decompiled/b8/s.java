package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s extends c2 {
    public static final r Companion = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1646c;

    public s(int i7, String str) {
        i9.l.e(str, "name");
        this.f1645b = str;
        this.f1646c = i7;
    }

    public /* synthetic */ s(String str, int i7, int i10) {
        this.f1645b = (i7 & 1) == 0 ? "" : str;
        if ((i7 & 2) == 0) {
            this.f1646c = 0;
        } else {
            this.f1646c = i10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return i9.l.a(this.f1645b, sVar.f1645b) && this.f1646c == sVar.f1646c;
    }

    public final int hashCode() {
        return (this.f1645b.hashCode() * 31) + this.f1646c;
    }

    public final String toString() {
        return "BTDevice(name=" + this.f1645b + ", state=" + this.f1646c + ")";
    }
}

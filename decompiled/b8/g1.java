package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends c2 {
    public static final f1 Companion = new f1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1592b;

    public /* synthetic */ g1(int i7, String str) {
        if ((i7 & 1) == 0) {
            this.f1592b = "";
        } else {
            this.f1592b = str;
        }
    }

    public g1(String str) {
        i9.l.e(str, "url");
        this.f1592b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && i9.l.a(this.f1592b, ((g1) obj).f1592b);
    }

    public final int hashCode() {
        return this.f1592b.hashCode();
    }

    public final String toString() {
        return a2.f.G("NetWork(url=", this.f1592b, ")");
    }
}

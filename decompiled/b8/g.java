package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends c2 {
    public static final f Companion = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1590c;

    public g(String str, String str2) {
        i9.l.e(str, "packageName");
        i9.l.e(str2, "className");
        this.f1589b = str;
        this.f1590c = str2;
    }

    public /* synthetic */ g(String str, String str2, int i7) {
        if ((i7 & 1) == 0) {
            this.f1589b = "";
        } else {
            this.f1589b = str;
        }
        if ((i7 & 2) == 0) {
            this.f1590c = "";
        } else {
            this.f1590c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return i9.l.a(this.f1589b, gVar.f1589b) && i9.l.a(this.f1590c, gVar.f1590c);
    }

    public final int hashCode() {
        return this.f1590c.hashCode() + (this.f1589b.hashCode() * 31);
    }

    public final String toString() {
        return "AppOpen(packageName=" + this.f1589b + ", className=" + this.f1590c + ")";
    }
}

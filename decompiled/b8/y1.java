package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends c2 {
    public static final x1 Companion = new x1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1672c;

    public y1(String str, String str2) {
        i9.l.e(str, "username");
        i9.l.e(str2, "password");
        this.f1671b = str;
        this.f1672c = str2;
    }

    public /* synthetic */ y1(String str, String str2, int i7) {
        if ((i7 & 1) == 0) {
            this.f1671b = "";
        } else {
            this.f1671b = str;
        }
        if ((i7 & 2) == 0) {
            this.f1672c = "";
        } else {
            this.f1672c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return i9.l.a(this.f1671b, y1Var.f1671b) && i9.l.a(this.f1672c, y1Var.f1672c);
    }

    public final int hashCode() {
        return this.f1672c.hashCode() + (this.f1671b.hashCode() * 31);
    }

    public final String toString() {
        return "WifiConnect(username=" + this.f1671b + ", password=" + this.f1672c + ")";
    }
}

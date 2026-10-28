package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends c2 {
    public static final u1 Companion = new u1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1663d;

    public /* synthetic */ v1(String str, int i7, String str2, boolean z10) {
        this.f1661b = (i7 & 1) == 0 ? true : z10;
        if ((i7 & 2) == 0) {
            this.f1662c = "";
        } else {
            this.f1662c = str;
        }
        if ((i7 & 4) == 0) {
            this.f1663d = "";
        } else {
            this.f1663d = str2;
        }
    }

    public v1(String str, String str2, boolean z10) {
        i9.l.e(str, "start");
        i9.l.e(str2, "end");
        this.f1661b = z10;
        this.f1662c = str;
        this.f1663d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return this.f1661b == v1Var.f1661b && i9.l.a(this.f1662c, v1Var.f1662c) && i9.l.a(this.f1663d, v1Var.f1663d);
    }

    public final int hashCode() {
        return this.f1663d.hashCode() + ob.a.l(this.f1662c, (this.f1661b ? 1231 : 1237) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimeRange(enabled=");
        sb2.append(this.f1661b);
        sb2.append(", start=");
        sb2.append(this.f1662c);
        sb2.append(", end=");
        return ob.a.s(sb2, this.f1663d, ")");
    }
}

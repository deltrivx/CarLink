package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends c2 {
    public static final q0 Companion = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1644d;

    public /* synthetic */ r0(String str, int i7, String str2, boolean z10) {
        this.f1642b = (i7 & 1) == 0 ? true : z10;
        if ((i7 & 2) == 0) {
            this.f1643c = "";
        } else {
            this.f1643c = str;
        }
        if ((i7 & 4) == 0) {
            this.f1644d = "";
        } else {
            this.f1644d = str2;
        }
    }

    public r0(String str, String str2, boolean z10) {
        i9.l.e(str, "username");
        i9.l.e(str2, "password");
        this.f1642b = z10;
        this.f1643c = str;
        this.f1644d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f1642b == r0Var.f1642b && i9.l.a(this.f1643c, r0Var.f1643c) && i9.l.a(this.f1644d, r0Var.f1644d);
    }

    public final int hashCode() {
        return this.f1644d.hashCode() + ob.a.l(this.f1643c, (this.f1642b ? 1231 : 1237) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Hotspot(enabled=");
        sb2.append(this.f1642b);
        sb2.append(", username=");
        sb2.append(this.f1643c);
        sb2.append(", password=");
        return ob.a.s(sb2, this.f1644d, ")");
    }
}

package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends c2 {
    public static final w0 Companion = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1668d;

    public /* synthetic */ x0(String str, int i7, String str2, boolean z10) {
        if ((i7 & 1) == 0) {
            this.f1666b = "";
        } else {
            this.f1666b = str;
        }
        if ((i7 & 2) == 0) {
            this.f1667c = "";
        } else {
            this.f1667c = str2;
        }
        if ((i7 & 4) == 0) {
            this.f1668d = true;
        } else {
            this.f1668d = z10;
        }
    }

    public x0(String str, String str2, boolean z10) {
        i9.l.e(str, "lineText");
        i9.l.e(str2, "keywords");
        this.f1666b = str;
        this.f1667c = str2;
        this.f1668d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return i9.l.a(this.f1666b, x0Var.f1666b) && i9.l.a(this.f1667c, x0Var.f1667c) && this.f1668d == x0Var.f1668d;
    }

    public final int hashCode() {
        return ob.a.l(this.f1667c, this.f1666b.hashCode() * 31, 31) + (this.f1668d ? 1231 : 1237);
    }

    public final String toString() {
        return "LogLine(lineText=" + this.f1666b + ", keywords=" + this.f1667c + ", ignoreCase=" + this.f1668d + ")";
    }
}

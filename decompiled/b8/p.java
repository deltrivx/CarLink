package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p extends c2 {
    public static final o Companion = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1632d;

    public /* synthetic */ p(int i7, String str, boolean z10, int i10) {
        this.f1630b = (i7 & 1) == 0 ? "" : str;
        if ((i7 & 2) == 0) {
            this.f1631c = false;
        } else {
            this.f1631c = z10;
        }
        if ((i7 & 4) == 0) {
            this.f1632d = 1;
        } else {
            this.f1632d = i10;
        }
    }

    public p(String str, int i7, boolean z10) {
        i9.l.e(str, "fileName");
        this.f1630b = str;
        this.f1631c = z10;
        this.f1632d = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return i9.l.a(this.f1630b, pVar.f1630b) && this.f1631c == pVar.f1631c && this.f1632d == pVar.f1632d;
    }

    public final int hashCode() {
        return (((this.f1630b.hashCode() * 31) + (this.f1631c ? 1231 : 1237)) * 31) + this.f1632d;
    }

    public final String toString() {
        return "Audio(fileName=" + this.f1630b + ", isOldVersion=" + this.f1631c + ", channelIndex=" + this.f1632d + ")";
    }
}

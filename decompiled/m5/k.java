package m5;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8481c;

    public k(long j5, String str, boolean z10) {
        i9.l.e(str, "hexCode");
        this.f8479a = j5;
        this.f8480b = str;
        this.f8481c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return y1.q.c(this.f8479a, kVar.f8479a) && i9.l.a(this.f8480b, kVar.f8480b) && this.f8481c == kVar.f8481c;
    }

    public final int hashCode() {
        int i7 = y1.q.f14959n;
        return ob.a.l(this.f8480b, t8.u.a(this.f8479a) * 31, 31) + (this.f8481c ? 1231 : 1237);
    }

    public final String toString() {
        return "ColorEnvelope(color=" + y1.q.i(this.f8479a) + ", hexCode=" + this.f8480b + ", fromUser=" + this.f8481c + ")";
    }
}

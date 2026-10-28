package v0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13575c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f13576d = null;

    public q(String str, String str2) {
        this.f13573a = str;
        this.f13574b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return i9.l.a(this.f13573a, qVar.f13573a) && i9.l.a(this.f13574b, qVar.f13574b) && this.f13575c == qVar.f13575c && i9.l.a(this.f13576d, qVar.f13576d);
    }

    public final int hashCode() {
        int iL = (ob.a.l(this.f13574b, this.f13573a.hashCode() * 31, 31) + (this.f13575c ? 1231 : 1237)) * 31;
        e eVar = this.f13576d;
        return iL + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f13576d + ", isShowingSubstitution=" + this.f13575c + ')';
    }
}

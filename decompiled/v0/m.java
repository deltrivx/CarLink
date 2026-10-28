package v0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3.h f13553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b3.h f13554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13555c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f13556d = null;

    public m(b3.h hVar, b3.h hVar2) {
        this.f13553a = hVar;
        this.f13554b = hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return i9.l.a(this.f13553a, mVar.f13553a) && i9.l.a(this.f13554b, mVar.f13554b) && this.f13555c == mVar.f13555c && i9.l.a(this.f13556d, mVar.f13556d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f13554b.hashCode() + (this.f13553a.hashCode() * 31)) * 31) + (this.f13555c ? 1231 : 1237)) * 31;
        d dVar = this.f13556d;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f13553a) + ", substitution=" + ((Object) this.f13554b) + ", isShowingSubstitution=" + this.f13555c + ", layoutCache=" + this.f13556d + ')';
    }
}

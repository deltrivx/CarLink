package va;

import i9.l;
import n3.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13711e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        super(18);
        l.e(str, "name");
        l.e(str2, "desc");
        this.f13710d = str;
        this.f13711e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f13710d, dVar.f13710d) && l.a(this.f13711e, dVar.f13711e);
    }

    public final int hashCode() {
        return this.f13711e.hashCode() + (this.f13710d.hashCode() * 31);
    }

    @Override // n3.u
    public final String l() {
        return this.f13710d + ':' + this.f13711e;
    }
}

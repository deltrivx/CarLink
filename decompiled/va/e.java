package va;

import i9.l;
import n3.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13713e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2) {
        super(18);
        l.e(str, "name");
        l.e(str2, "desc");
        this.f13712d = str;
        this.f13713e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f13712d, eVar.f13712d) && l.a(this.f13713e, eVar.f13713e);
    }

    public final int hashCode() {
        return this.f13713e.hashCode() + (this.f13712d.hashCode() * 31);
    }

    @Override // n3.u
    public final String l() {
        return this.f13712d + this.f13713e;
    }
}

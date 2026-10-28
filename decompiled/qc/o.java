package qc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11047b;

    public o(String str, boolean z10) {
        i9.l.e(str, "body");
        this.f11046a = z10;
        this.f11047b = str.toString();
    }

    @Override // qc.y
    public final String c() {
        return this.f11047b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.f11046a == oVar.f11046a && i9.l.a(this.f11047b, oVar.f11047b);
    }

    public final int hashCode() {
        return this.f11047b.hashCode() + ((this.f11046a ? 1231 : 1237) * 31);
    }

    @Override // qc.y
    public final String toString() {
        boolean z10 = this.f11046a;
        String str = this.f11047b;
        if (!z10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        rc.u.a(str, sb2);
        return sb2.toString();
    }
}

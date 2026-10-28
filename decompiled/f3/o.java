package f3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f5265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f5266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5269e;

    public o(n nVar, k kVar, int i7, int i10, Object obj) {
        this.f5265a = nVar;
        this.f5266b = kVar;
        this.f5267c = i7;
        this.f5268d = i10;
        this.f5269e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return i9.l.a(this.f5265a, oVar.f5265a) && i9.l.a(this.f5266b, oVar.f5266b) && this.f5267c == oVar.f5267c && this.f5268d == oVar.f5268d && i9.l.a(this.f5269e, oVar.f5269e);
    }

    public final int hashCode() {
        n nVar = this.f5265a;
        int iHashCode = (((((((nVar == null ? 0 : nVar.hashCode()) * 31) + this.f5266b.f5261a) * 31) + this.f5267c) * 31) + this.f5268d) * 31;
        Object obj = this.f5269e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.f5265a);
        sb2.append(", fontWeight=");
        sb2.append(this.f5266b);
        sb2.append(", fontStyle=");
        String str2 = "Invalid";
        int i7 = this.f5267c;
        if (i7 == 0) {
            str = "Normal";
        } else {
            str = i7 == 1 ? "Italic" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(", fontSynthesis=");
        int i10 = this.f5268d;
        if (i10 == 0) {
            str2 = "None";
        } else if (i10 == 1) {
            str2 = "Weight";
        } else if (i10 == 2) {
            str2 = "Style";
        } else if (i10 == 65535) {
            str2 = "All";
        }
        sb2.append((Object) str2);
        sb2.append(", resourceLoaderCacheKey=");
        sb2.append(this.f5269e);
        sb2.append(')');
        return sb2.toString();
    }
}

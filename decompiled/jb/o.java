package jb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ta.e f7056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wa.b f7058f;

    public o(Object obj, Object obj2, ta.e eVar, ta.e eVar2, String str, wa.b bVar) {
        i9.l.e(str, "filePath");
        this.f7053a = obj;
        this.f7054b = obj2;
        this.f7055c = eVar;
        this.f7056d = eVar2;
        this.f7057e = str;
        this.f7058f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f7053a.equals(oVar.f7053a) && i9.l.a(this.f7054b, oVar.f7054b) && i9.l.a(this.f7055c, oVar.f7055c) && this.f7056d.equals(oVar.f7056d) && i9.l.a(this.f7057e, oVar.f7057e) && this.f7058f.equals(oVar.f7058f);
    }

    public final int hashCode() {
        int iHashCode = this.f7053a.hashCode() * 31;
        Object obj = this.f7054b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f7055c;
        return this.f7058f.hashCode() + ob.a.l(this.f7057e, (this.f7056d.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f7053a + ", compilerVersion=" + this.f7054b + ", languageVersion=" + this.f7055c + ", expectedVersion=" + this.f7056d + ", filePath=" + this.f7057e + ", classId=" + this.f7058f + ')';
    }
}

package i9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends d implements i, o9.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6680h;

    public j(int i7, Class cls, String str, String str2, int i10) {
        this(i7, c.f6670a, cls, str, str2, i10, 0);
    }

    public j(int i7, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f6679g = i7;
        this.f6680h = 0;
    }

    @Override // i9.d
    public final o9.b e() {
        return y.f6689a.a(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return this.f6674d.equals(jVar.f6674d) && this.f6675e.equals(jVar.f6675e) && this.f6680h == jVar.f6680h && this.f6679g == jVar.f6679g && l.a(this.f6672b, jVar.f6672b) && l.a(f(), jVar.f());
        }
        if (!(obj instanceof o9.f)) {
            return false;
        }
        o9.b bVarE = this.f6671a;
        if (bVarE == null) {
            bVarE = e();
            this.f6671a = bVarE;
        }
        return obj.equals(bVarE);
    }

    @Override // i9.i
    public final int getArity() {
        return this.f6679g;
    }

    public final int hashCode() {
        return this.f6675e.hashCode() + ob.a.l(this.f6674d, f() == null ? 0 : f().hashCode() * 31, 31);
    }

    public final String toString() {
        o9.b bVarE = this.f6671a;
        if (bVarE == null) {
            bVarE = e();
            this.f6671a = bVarE;
        }
        if (bVarE != this) {
            return bVarE.toString();
        }
        String str = this.f6674d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : a2.f.G("function ", str, " (Kotlin reflection is not available)");
    }
}

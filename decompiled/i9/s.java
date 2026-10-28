package i9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class s extends d implements o9.u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6683g;

    public s(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, (i7 & 1) == 1);
        this.f6683g = (i7 & 2) == 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return f().equals(sVar.f()) && this.f6674d.equals(sVar.f6674d) && this.f6675e.equals(sVar.f6675e) && l.a(this.f6672b, sVar.f6672b);
        }
        if (obj instanceof o9.u) {
            return obj.equals(g());
        }
        return false;
    }

    public final o9.b g() {
        if (this.f6683g) {
            return this;
        }
        o9.b bVar = this.f6671a;
        if (bVar != null) {
            return bVar;
        }
        o9.b bVarE = e();
        this.f6671a = bVarE;
        return bVarE;
    }

    public final o9.u h() {
        if (this.f6683g) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        o9.b bVarG = g();
        if (bVarG != this) {
            return (o9.u) bVarG;
        }
        throw new cc.a0();
    }

    public final int hashCode() {
        return this.f6675e.hashCode() + ob.a.l(this.f6674d, f().hashCode() * 31, 31);
    }

    public final String toString() {
        o9.b bVarG = g();
        return bVarG != this ? bVarG.toString() : ob.a.s(new StringBuilder("property "), this.f6674d, " (Kotlin reflection is not available)");
    }
}

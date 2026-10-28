package ga;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f6120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f6121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f6122c = u8.x.f13123a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6123d;

    public w(c0 c0Var, c0 c0Var2) {
        this.f6120a = c0Var;
        this.f6121b = c0Var2;
        t8.a.d(new aa.e(8, this));
        c0 c0Var3 = c0.IGNORE;
        this.f6123d = c0Var == c0Var3 && c0Var2 == c0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f6120a == wVar.f6120a && this.f6121b == wVar.f6121b && i9.l.a(this.f6122c, wVar.f6122c);
    }

    public final int hashCode() {
        int iHashCode = this.f6120a.hashCode() * 31;
        c0 c0Var = this.f6121b;
        return this.f6122c.hashCode() + ((iHashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f6120a + ", migrationLevel=" + this.f6121b + ", userDefinedLevelForSpecificAnnotation=" + this.f6122c + ')';
    }
}

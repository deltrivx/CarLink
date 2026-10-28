package la;

import i9.l;
import java.util.Set;
import nb.a0;
import nb.s0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f8283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f8287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f8288f;

    public a(s0 s0Var, b bVar, boolean z10, boolean z11, Set set, a0 a0Var) {
        this.f8283a = s0Var;
        this.f8284b = bVar;
        this.f8285c = z10;
        this.f8286d = z11;
        this.f8287e = set;
        this.f8288f = a0Var;
    }

    public /* synthetic */ a(s0 s0Var, boolean z10, boolean z11, Set set, int i7) {
        this(s0Var, b.f8289a, (i7 & 4) != 0 ? false : z10, (i7 & 8) != 0 ? false : z11, (i7 & 16) != 0 ? null : set, null);
    }

    public static a a(a aVar, b bVar, boolean z10, Set set, a0 a0Var, int i7) {
        s0 s0Var = aVar.f8283a;
        if ((i7 & 2) != 0) {
            bVar = aVar.f8284b;
        }
        b bVar2 = bVar;
        if ((i7 & 4) != 0) {
            z10 = aVar.f8285c;
        }
        boolean z11 = z10;
        boolean z12 = aVar.f8286d;
        if ((i7 & 16) != 0) {
            set = aVar.f8287e;
        }
        Set set2 = set;
        if ((i7 & 32) != 0) {
            a0Var = aVar.f8288f;
        }
        aVar.getClass();
        l.e(s0Var, "howThisTypeIsUsed");
        l.e(bVar2, "flexibility");
        return new a(s0Var, bVar2, z11, z12, set2, a0Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(aVar.f8288f, this.f8288f) && aVar.f8283a == this.f8283a && aVar.f8284b == this.f8284b && aVar.f8285c == this.f8285c && aVar.f8286d == this.f8286d;
    }

    public final int hashCode() {
        a0 a0Var = this.f8288f;
        int iHashCode = a0Var != null ? a0Var.hashCode() : 0;
        int iHashCode2 = this.f8283a.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.f8284b.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i7 = (iHashCode3 * 31) + (this.f8285c ? 1 : 0) + iHashCode3;
        return (i7 * 31) + (this.f8286d ? 1 : 0) + i7;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f8283a + ", flexibility=" + this.f8284b + ", isRaw=" + this.f8285c + ", isForAnnotationParameter=" + this.f8286d + ", visitedTypeParameters=" + this.f8287e + ", defaultType=" + this.f8288f + ')';
    }
}

package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f14018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f14019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14020c;

    public z(y yVar, y yVar2, boolean z10) {
        this.f14018a = yVar;
        this.f14019b = yVar2;
        this.f14020c = z10;
    }

    public static z a(z zVar, y yVar, y yVar2, boolean z10, int i7) {
        if ((i7 & 1) != 0) {
            yVar = zVar.f14018a;
        }
        if ((i7 & 2) != 0) {
            yVar2 = zVar.f14019b;
        }
        if ((i7 & 4) != 0) {
            z10 = zVar.f14020c;
        }
        zVar.getClass();
        return new z(yVar, yVar2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return i9.l.a(this.f14018a, zVar.f14018a) && i9.l.a(this.f14019b, zVar.f14019b) && this.f14020c == zVar.f14020c;
    }

    public final int hashCode() {
        return ((this.f14019b.hashCode() + (this.f14018a.hashCode() * 31)) * 31) + (this.f14020c ? 1231 : 1237);
    }

    public final String toString() {
        return "Selection(start=" + this.f14018a + ", end=" + this.f14019b + ", handlesCrossed=" + this.f14020c + ')';
    }
}

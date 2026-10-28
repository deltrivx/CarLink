package y2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t8.e f14970b;

    public a(String str, t8.e eVar) {
        this.f14969a = str;
        this.f14970b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i9.l.a(this.f14969a, aVar.f14969a) && i9.l.a(this.f14970b, aVar.f14970b);
    }

    public final int hashCode() {
        String str = this.f14969a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        t8.e eVar = this.f14970b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f14969a + ", action=" + this.f14970b + ')';
    }
}

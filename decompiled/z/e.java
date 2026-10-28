package z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0.d f15347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cc.l f15348b;

    public e(i0.d dVar, cc.l lVar) {
        this.f15347a = dVar;
        this.f15348b = lVar;
    }

    public final String toString() {
        cc.l lVar = this.f15348b;
        if (lVar.f2641e.l(cc.x.f2685b) != null) {
            throw new ClassCastException();
        }
        StringBuilder sb2 = new StringBuilder("Request@");
        int iHashCode = hashCode();
        n3.l.q(16);
        String string = Integer.toString(iHashCode, 16);
        i9.l.d(string, "toString(...)");
        sb2.append(string);
        sb2.append("(currentBounds()=");
        sb2.append(this.f15347a.invoke());
        sb2.append(", continuation=");
        sb2.append(lVar);
        sb2.append(')');
        return sb2.toString();
    }
}

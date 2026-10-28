package n1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8708a = 0;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.f8708a);
        sb2.append(")@");
        int iHashCode = hashCode();
        n3.l.q(16);
        String string = Integer.toString(iHashCode, 16);
        i9.l.d(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }
}

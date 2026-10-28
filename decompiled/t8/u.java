package t8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12846a;

    public /* synthetic */ u(long j5) {
        this.f12846a = j5;
    }

    public static int a(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return i9.l.g(this.f12846a ^ Long.MIN_VALUE, ((u) obj).f12846a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f12846a == ((u) obj).f12846a;
        }
        return false;
    }

    public final int hashCode() {
        return a(this.f12846a);
    }

    public final String toString() {
        long j5 = this.f12846a;
        if (j5 >= 0) {
            n3.l.q(10);
            String string = Long.toString(j5, 10);
            i9.l.d(string, "toString(...)");
            return string;
        }
        long j10 = 10;
        long j11 = ((j5 >>> 1) / j10) << 1;
        long j12 = j5 - (j11 * j10);
        if (j12 >= j10) {
            j12 -= j10;
            j11++;
        }
        n3.l.q(10);
        String string2 = Long.toString(j11, 10);
        i9.l.d(string2, "toString(...)");
        n3.l.q(10);
        String string3 = Long.toString(j12, 10);
        i9.l.d(string3, "toString(...)");
        return string2.concat(string3);
    }
}

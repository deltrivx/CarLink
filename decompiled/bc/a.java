package bc;

import i9.l;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1694c = new a(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1696b;

    public a(long j5, long j10) {
        this.f1695a = j5;
        this.f1696b = j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        l.e(aVar, "other");
        long j5 = aVar.f1695a;
        long j10 = this.f1695a;
        if (j10 != j5) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        }
        return Long.compare(this.f1696b ^ Long.MIN_VALUE, aVar.f1696b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1695a == aVar.f1695a && this.f1696b == aVar.f1696b;
    }

    public final int hashCode() {
        long j5 = this.f1695a ^ this.f1696b;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        k9.a.t(this.f1695a, bArr, 0, 0, 4);
        bArr[8] = 45;
        k9.a.t(this.f1695a, bArr, 9, 4, 6);
        bArr[13] = 45;
        k9.a.t(this.f1695a, bArr, 14, 6, 8);
        bArr[18] = 45;
        k9.a.t(this.f1696b, bArr, 19, 0, 2);
        bArr[23] = 45;
        k9.a.t(this.f1696b, bArr, 24, 2, 8);
        return new String(bArr, zb.a.f15804a);
    }
}

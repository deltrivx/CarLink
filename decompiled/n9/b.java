package n9;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class b implements Iterable, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8967c;

    public b(int i7, int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i11 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f8965a = i7;
        this.f8966b = i2.c.J(i7, i10, i11);
        this.f8967c = i11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return this.f8965a == bVar.f8965a && this.f8966b == bVar.f8966b && this.f8967c == bVar.f8967c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f8965a * 31) + this.f8966b) * 31) + this.f8967c;
    }

    public boolean isEmpty() {
        int i7 = this.f8967c;
        int i10 = this.f8966b;
        int i11 = this.f8965a;
        if (i7 > 0) {
            return i11 > i10;
        }
        return i11 < i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.f8965a, this.f8966b, this.f8967c);
    }

    public String toString() {
        StringBuilder sb2;
        int i7 = this.f8966b;
        int i10 = this.f8965a;
        int i11 = this.f8967c;
        if (i11 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append("..");
            sb2.append(i7);
            sb2.append(" step ");
            sb2.append(i11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(" downTo ");
            sb2.append(i7);
            sb2.append(" step ");
            sb2.append(-i11);
        }
        return sb2.toString();
    }
}

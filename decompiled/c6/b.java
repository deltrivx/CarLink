package c6;

import a2.f;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2440b;

    public b(int i7, int i10) {
        this.f2439a = i7;
        this.f2440b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2439a == bVar.f2439a && this.f2440b == bVar.f2440b;
    }

    public final int hashCode() {
        return this.f2439a ^ this.f2440b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2439a);
        sb2.append("(");
        return f.H(sb2, this.f2440b, ')');
    }
}

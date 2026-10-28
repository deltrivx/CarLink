package x3;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f14562e = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14566d;

    public b(int i7, int i10, int i11, int i12) {
        this.f14563a = i7;
        this.f14564b = i10;
        this.f14565c = i11;
        this.f14566d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f14563a, bVar2.f14563a), Math.max(bVar.f14564b, bVar2.f14564b), Math.max(bVar.f14565c, bVar2.f14565c), Math.max(bVar.f14566d, bVar2.f14566d));
    }

    public static b b(int i7, int i10, int i11, int i12) {
        return (i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? f14562e : new b(i7, i10, i11, i12);
    }

    public static b c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return u2.a.h(this.f14563a, this.f14564b, this.f14565c, this.f14566d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14566d == bVar.f14566d && this.f14563a == bVar.f14563a && this.f14565c == bVar.f14565c && this.f14564b == bVar.f14564b;
    }

    public final int hashCode() {
        return (((((this.f14563a * 31) + this.f14564b) * 31) + this.f14565c) * 31) + this.f14566d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f14563a);
        sb2.append(", top=");
        sb2.append(this.f14564b);
        sb2.append(", right=");
        sb2.append(this.f14565c);
        sb2.append(", bottom=");
        return a2.f.H(sb2, this.f14566d, '}');
    }
}

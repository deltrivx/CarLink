package b3;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f1393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f1394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n3.c f1399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n3.o f1400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f3.d f1401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f1402j;

    public n0(h hVar, r0 r0Var, List list, int i7, boolean z10, int i10, n3.c cVar, n3.o oVar, f3.d dVar, long j5) {
        this.f1393a = hVar;
        this.f1394b = r0Var;
        this.f1395c = list;
        this.f1396d = i7;
        this.f1397e = z10;
        this.f1398f = i10;
        this.f1399g = cVar;
        this.f1400h = oVar;
        this.f1401i = dVar;
        this.f1402j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return i9.l.a(this.f1393a, n0Var.f1393a) && i9.l.a(this.f1394b, n0Var.f1394b) && i9.l.a(this.f1395c, n0Var.f1395c) && this.f1396d == n0Var.f1396d && this.f1397e == n0Var.f1397e && this.f1398f == n0Var.f1398f && i9.l.a(this.f1399g, n0Var.f1399g) && this.f1400h == n0Var.f1400h && i9.l.a(this.f1401i, n0Var.f1401i) && n3.a.b(this.f1402j, n0Var.f1402j);
    }

    public final int hashCode() {
        int iHashCode = (this.f1401i.hashCode() + ((this.f1400h.hashCode() + ((this.f1399g.hashCode() + ((((((((this.f1395c.hashCode() + ((this.f1394b.hashCode() + (this.f1393a.hashCode() * 31)) * 31)) * 31) + this.f1396d) * 31) + (this.f1397e ? 1231 : 1237)) * 31) + this.f1398f) * 31)) * 31)) * 31)) * 31;
        long j5 = this.f1402j;
        return ((int) (j5 ^ (j5 >>> 32))) + iHashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TextLayoutInput(text=");
        sb2.append((Object) this.f1393a);
        sb2.append(", style=");
        sb2.append(this.f1394b);
        sb2.append(", placeholders=");
        sb2.append(this.f1395c);
        sb2.append(", maxLines=");
        sb2.append(this.f1396d);
        sb2.append(", softWrap=");
        sb2.append(this.f1397e);
        sb2.append(", overflow=");
        int i7 = this.f1398f;
        if (i7 == 1) {
            str = "Clip";
        } else if (i7 == 2) {
            str = "Ellipsis";
        } else if (i7 == 5) {
            str = "MiddleEllipsis";
        } else if (i7 == 3) {
            str = "Visible";
        } else {
            str = i7 == 4 ? "StartEllipsis" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(", density=");
        sb2.append(this.f1399g);
        sb2.append(", layoutDirection=");
        sb2.append(this.f1400h);
        sb2.append(", fontFamilyResolver=");
        sb2.append(this.f1401i);
        sb2.append(", constraints=");
        sb2.append((Object) n3.a.k(this.f1402j));
        sb2.append(')');
        return sb2.toString();
    }
}

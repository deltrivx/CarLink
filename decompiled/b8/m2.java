package b8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m2 {
    public static final l2 Companion = new l2();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t8.h[] f1613e = {null, null, null, t8.a.c(t8.i.f12827a, new b3.i0(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f1617d;

    public /* synthetic */ m2(int i7, String str, String str2, String str3, c2 c2Var) {
        if (15 != (i7 & 15)) {
            pc.m0.e(i7, 15, k2.f1606a.d());
            throw null;
        }
        this.f1614a = str;
        this.f1615b = str2;
        this.f1616c = str3;
        this.f1617d = c2Var;
    }

    public m2(String str, String str2, String str3, c2 c2Var) {
        i9.l.e(str, "name");
        i9.l.e(str2, "label");
        i9.l.e(str3, "info");
        this.f1614a = str;
        this.f1615b = str2;
        this.f1616c = str3;
        this.f1617d = c2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return i9.l.a(this.f1614a, m2Var.f1614a) && i9.l.a(this.f1615b, m2Var.f1615b) && i9.l.a(this.f1616c, m2Var.f1616c) && i9.l.a(this.f1617d, m2Var.f1617d);
    }

    public final int hashCode() {
        return this.f1617d.hashCode() + ob.a.l(this.f1616c, ob.a.l(this.f1615b, this.f1614a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Item(name=" + this.f1614a + ", label=" + this.f1615b + ", info=" + this.f1616c + ", event=" + this.f1617d + ")";
    }
}

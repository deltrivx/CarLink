package e2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y1.m f4226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y1.m f4228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f4229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4232j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f4233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f4234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f4235n;

    public l0(String str, List list, int i7, y1.m mVar, float f10, y1.m mVar2, float f11, float f12, int i10, int i11, float f13, float f14, float f15, float f16) {
        this.f4223a = str;
        this.f4224b = list;
        this.f4225c = i7;
        this.f4226d = mVar;
        this.f4227e = f10;
        this.f4228f = mVar2;
        this.f4229g = f11;
        this.f4230h = f12;
        this.f4231i = i10;
        this.f4232j = i11;
        this.k = f13;
        this.f4233l = f14;
        this.f4234m = f15;
        this.f4235n = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l0.class == obj.getClass()) {
            l0 l0Var = (l0) obj;
            return i9.l.a(this.f4223a, l0Var.f4223a) && i9.l.a(this.f4226d, l0Var.f4226d) && this.f4227e == l0Var.f4227e && i9.l.a(this.f4228f, l0Var.f4228f) && this.f4229g == l0Var.f4229g && this.f4230h == l0Var.f4230h && this.f4231i == l0Var.f4231i && this.f4232j == l0Var.f4232j && this.k == l0Var.k && this.f4233l == l0Var.f4233l && this.f4234m == l0Var.f4234m && this.f4235n == l0Var.f4235n && this.f4225c == l0Var.f4225c && i9.l.a(this.f4224b, l0Var.f4224b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f4224b.hashCode() + (this.f4223a.hashCode() * 31)) * 31;
        y1.m mVar = this.f4226d;
        int iJ = ob.a.j(this.f4227e, (iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 31, 31);
        y1.m mVar2 = this.f4228f;
        return ob.a.j(this.f4235n, ob.a.j(this.f4234m, ob.a.j(this.f4233l, ob.a.j(this.k, (((ob.a.j(this.f4230h, ob.a.j(this.f4229g, (iJ + (mVar2 != null ? mVar2.hashCode() : 0)) * 31, 31), 31) + this.f4231i) * 31) + this.f4232j) * 31, 31), 31), 31), 31) + this.f4225c;
    }
}

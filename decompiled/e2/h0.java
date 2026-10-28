package e2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends j0 implements Iterable, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f4180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f4182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f4183j;

    public h0(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, ArrayList arrayList) {
        this.f4174a = str;
        this.f4175b = f10;
        this.f4176c = f11;
        this.f4177d = f12;
        this.f4178e = f13;
        this.f4179f = f14;
        this.f4180g = f15;
        this.f4181h = f16;
        this.f4182i = list;
        this.f4183j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof h0)) {
            h0 h0Var = (h0) obj;
            return i9.l.a(this.f4174a, h0Var.f4174a) && this.f4175b == h0Var.f4175b && this.f4176c == h0Var.f4176c && this.f4177d == h0Var.f4177d && this.f4178e == h0Var.f4178e && this.f4179f == h0Var.f4179f && this.f4180g == h0Var.f4180g && this.f4181h == h0Var.f4181h && i9.l.a(this.f4182i, h0Var.f4182i) && i9.l.a(this.f4183j, h0Var.f4183j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4183j.hashCode() + ((this.f4182i.hashCode() + ob.a.j(this.f4181h, ob.a.j(this.f4180g, ob.a.j(this.f4179f, ob.a.j(this.f4178e, ob.a.j(this.f4177d, ob.a.j(this.f4176c, ob.a.j(this.f4175b, this.f4174a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new g0(this);
    }
}

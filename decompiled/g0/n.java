package g0;

import java.util.List;
import java.util.Map;
import o2.n0;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f5675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f5678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0 f5679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f5680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cc.y f5682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n3.c f5683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5684j;
    public final h9.k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h9.k f5685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f5686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f5687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f5688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f5689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x0 f5690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f5691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f5692s;

    public n(p pVar, int i7, boolean z10, float f10, n0 n0Var, float f11, boolean z11, cc.y yVar, n3.c cVar, int i10, h9.k kVar, h9.k kVar2, List list, int i11, int i12, int i13, x0 x0Var, int i14, int i15) {
        this.f5675a = pVar;
        this.f5676b = i7;
        this.f5677c = z10;
        this.f5678d = f10;
        this.f5679e = n0Var;
        this.f5680f = f11;
        this.f5681g = z11;
        this.f5682h = yVar;
        this.f5683i = cVar;
        this.f5684j = i10;
        this.k = kVar;
        this.f5685l = kVar2;
        this.f5686m = list;
        this.f5687n = i11;
        this.f5688o = i12;
        this.f5689p = i13;
        this.f5690q = x0Var;
        this.f5691r = i14;
        this.f5692s = i15;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final n a(int i7, boolean z10) {
        p pVar;
        if (this.f5681g) {
            return null;
        }
        ?? r8 = this.f5686m;
        if (r8.isEmpty() || (pVar = this.f5675a) == null) {
            return null;
        }
        int i10 = pVar.f5716g;
        int i11 = this.f5676b - i7;
        if (i11 < 0 || i11 >= i10) {
            return null;
        }
        o oVar = (o) u8.p.k0(r8);
        o oVar2 = (o) u8.p.s0(r8);
        if (oVar.f5709r || oVar2.f5709r) {
            return null;
        }
        int i12 = this.f5688o;
        int i13 = this.f5687n;
        x0 x0Var = this.f5690q;
        if (i7 < 0) {
            if (Math.min((a.a.M(oVar, x0Var) + oVar.f5703l) - i13, (a.a.M(oVar2, x0Var) + oVar2.f5703l) - i12) <= (-i7)) {
                return null;
            }
        } else if (Math.min(i13 - a.a.M(oVar, x0Var), i12 - a.a.M(oVar2, x0Var)) <= i7) {
            return null;
        }
        int size = r8.size();
        for (int i14 = 0; i14 < size; i14++) {
            o oVar3 = (o) r8.get(i14);
            oVar3.getClass();
            if (!oVar3.f5709r) {
                long j5 = oVar3.f5706o;
                oVar3.f5706o = (((long) (((int) (j5 & 4294967295L)) + i7)) & 4294967295L) | (((long) ((int) (j5 >> 32))) << 32);
                if (z10) {
                    int size2 = oVar3.f5697e.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        oVar3.f5700h.a(i15, oVar3.f5694b);
                    }
                }
            }
        }
        return new n(this.f5675a, i11, this.f5677c || i7 > 0, i7, this.f5679e, this.f5680f, this.f5681g, this.f5682h, this.f5683i, this.f5684j, this.k, this.f5685l, r8, this.f5687n, this.f5688o, this.f5689p, x0Var, this.f5691r, this.f5692s);
    }

    @Override // o2.n0
    public final Map b() {
        return this.f5679e.b();
    }

    @Override // o2.n0
    public final void c() {
        this.f5679e.c();
    }

    @Override // o2.n0
    public final h9.k d() {
        return this.f5679e.d();
    }

    public final long e() {
        n0 n0Var = this.f5679e;
        return (((long) n0Var.getWidth()) << 32) | (((long) n0Var.getHeight()) & 4294967295L);
    }

    @Override // o2.n0
    public final int getHeight() {
        return this.f5679e.getHeight();
    }

    @Override // o2.n0
    public final int getWidth() {
        return this.f5679e.getWidth();
    }
}

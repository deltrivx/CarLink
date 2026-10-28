package g0;

import java.util.List;
import o2.u0;
import o2.v0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o implements h0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n3.o f5696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f5697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f5699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f5700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5702j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f5703l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5704m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f5705n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f5706o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5707p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5708q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5709r;

    public o(int i7, Object obj, int i10, int i11, n3.o oVar, int i12, int i13, List list, long j5, Object obj2, androidx.compose.foundation.lazy.layout.b bVar, long j10, int i14, int i15) {
        this.f5693a = i7;
        this.f5694b = obj;
        this.f5695c = i10;
        this.f5696d = oVar;
        this.f5697e = list;
        this.f5698f = j5;
        this.f5699g = obj2;
        this.f5700h = bVar;
        this.f5701i = i14;
        this.f5702j = i15;
        int size = list.size();
        int iMax = 0;
        for (int i16 = 0; i16 < size; i16++) {
            iMax = Math.max(iMax, ((v0) list.get(i16)).f9436b);
        }
        this.k = iMax;
        int i17 = i11 + iMax;
        this.f5703l = i17 >= 0 ? i17 : 0;
        this.f5705n = (((long) this.f5695c) << 32) | (((long) iMax) & 4294967295L);
        this.f5706o = 0L;
        this.f5707p = -1;
        this.f5708q = -1;
    }

    public final void a(u0 u0Var) {
        if (this.f5704m == Integer.MIN_VALUE) {
            c0.b.a("position() should be called first");
        }
        List list = this.f5697e;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            v0 v0Var = (v0) list.get(i7);
            int i10 = v0Var.f9436b;
            long j5 = this.f5706o;
            this.f5700h.a(i7, this.f5694b);
            u0.m(u0Var, v0Var, n3.j.c(j5, this.f5698f));
        }
    }

    @Override // h0.y
    public final int b() {
        return this.f5697e.size();
    }

    @Override // h0.y
    public final int c() {
        return this.f5703l;
    }

    @Override // h0.y
    public final int d() {
        return this.f5702j;
    }

    @Override // h0.y
    public final Object e(int i7) {
        return ((v0) this.f5697e.get(i7)).w();
    }

    @Override // h0.y
    public final boolean f() {
        return true;
    }

    @Override // h0.y
    public final void g() {
        this.f5709r = true;
    }

    @Override // h0.y
    public final int getIndex() {
        return this.f5693a;
    }

    @Override // h0.y
    public final Object getKey() {
        return this.f5694b;
    }

    @Override // h0.y
    public final void h(int i7, int i10, int i11) {
        k(i7, 0, i10, i11, -1, -1);
    }

    @Override // h0.y
    public final long i(int i7) {
        return this.f5706o;
    }

    @Override // h0.y
    public final int j() {
        return this.f5701i;
    }

    public final void k(int i7, int i10, int i11, int i12, int i13, int i14) {
        this.f5704m = i12;
        if (this.f5696d == n3.o.f8750b) {
            i10 = (i11 - i10) - this.f5695c;
        }
        this.f5706o = (((long) i10) << 32) | (((long) i7) & 4294967295L);
        this.f5707p = i13;
        this.f5708q = i14;
    }
}

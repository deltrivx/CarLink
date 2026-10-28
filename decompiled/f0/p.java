package f0;

import h0.y;
import java.util.List;
import o2.u0;
import o2.v0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1.f f4824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n3.o f4825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f4828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f4829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f4830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4831j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f4833m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4834n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4835o = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f4836p;

    public p(int i7, List list, r1.f fVar, n3.o oVar, int i10, int i11, int i12, long j5, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.b bVar, long j10) {
        this.f4822a = i7;
        this.f4823b = list;
        this.f4824c = fVar;
        this.f4825d = oVar;
        this.f4826e = i12;
        this.f4827f = j5;
        this.f4828g = obj;
        this.f4829h = obj2;
        this.f4830i = bVar;
        int size = list.size();
        int i13 = 0;
        int iMax = 0;
        for (int i14 = 0; i14 < size; i14++) {
            v0 v0Var = (v0) list.get(i14);
            i13 += v0Var.f9436b;
            iMax = Math.max(iMax, v0Var.f9435a);
        }
        this.k = i13;
        int i15 = i13 + this.f4826e;
        this.f4832l = i15 >= 0 ? i15 : 0;
        this.f4833m = iMax;
        this.f4836p = new int[this.f4823b.size() * 2];
    }

    public final void a(u0 u0Var) {
        if (this.f4835o == Integer.MIN_VALUE) {
            c0.b.a("position() should be called first");
        }
        List list = this.f4823b;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            v0 v0Var = (v0) list.get(i7);
            int i10 = v0Var.f9436b;
            long jI = i(i7);
            this.f4830i.a(i7, this.f4828g);
            u0.m(u0Var, v0Var, n3.j.c(jI, this.f4827f));
        }
    }

    @Override // h0.y
    public final int b() {
        return this.f4823b.size();
    }

    @Override // h0.y
    public final int c() {
        return this.f4832l;
    }

    @Override // h0.y
    public final int d() {
        return 1;
    }

    @Override // h0.y
    public final Object e(int i7) {
        return ((v0) this.f4823b.get(i7)).w();
    }

    @Override // h0.y
    public final boolean f() {
        return true;
    }

    @Override // h0.y
    public final void g() {
        this.f4834n = true;
    }

    @Override // h0.y
    public final int getIndex() {
        return this.f4822a;
    }

    @Override // h0.y
    public final Object getKey() {
        return this.f4828g;
    }

    @Override // h0.y
    public final void h(int i7, int i10, int i11) {
        k(i7, i10, i11);
    }

    @Override // h0.y
    public final long i(int i7) {
        int i10;
        long j5;
        if (i7 == 0 && this.f4823b.size() == 0) {
            i10 = this.f4831j;
            j5 = 0;
        } else {
            int i11 = i7 * 2;
            int[] iArr = this.f4836p;
            int i12 = iArr[i11];
            i10 = iArr[i11 + 1];
            j5 = i12;
        }
        return (4294967295L & ((long) i10)) | (j5 << 32);
    }

    @Override // h0.y
    public final int j() {
        return 0;
    }

    public final void k(int i7, int i10, int i11) {
        this.f4831j = i7;
        this.f4835o = i11;
        List list = this.f4823b;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            v0 v0Var = (v0) list.get(i12);
            int i13 = i12 * 2;
            r1.f fVar = this.f4824c;
            if (fVar == null) {
                c0.b.b("null horizontalAlignment when isVertical == true");
                throw new cc.s();
            }
            int iA = fVar.a(v0Var.f9435a, i10, this.f4825d);
            int[] iArr = this.f4836p;
            iArr[i13] = iA;
            iArr[i13 + 1] = i7;
            i7 += v0Var.f9436b;
        }
    }
}

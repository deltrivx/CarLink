package f0;

import cc.y;
import java.util.List;
import java.util.Map;
import o2.n0;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f4806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0 f4810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f4813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n3.c f4814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f4815j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4816l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f4817m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f4818n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final x0 f4819o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f4821q;

    public o(p pVar, int i7, boolean z10, float f10, n0 n0Var, float f11, boolean z11, y yVar, n3.c cVar, long j5, List list, int i10, int i11, int i12, x0 x0Var, int i13, int i14) {
        this.f4806a = pVar;
        this.f4807b = i7;
        this.f4808c = z10;
        this.f4809d = f10;
        this.f4810e = n0Var;
        this.f4811f = f11;
        this.f4812g = z11;
        this.f4813h = yVar;
        this.f4814i = cVar;
        this.f4815j = j5;
        this.k = list;
        this.f4816l = i10;
        this.f4817m = i11;
        this.f4818n = i12;
        this.f4819o = x0Var;
        this.f4820p = i13;
        this.f4821q = i14;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final o a(int i7, boolean z10) {
        p pVar;
        if (this.f4812g) {
            return null;
        }
        ?? r15 = this.k;
        if (r15.isEmpty() || (pVar = this.f4806a) == null) {
            return null;
        }
        int i10 = pVar.f4832l;
        int i11 = this.f4807b - i7;
        if (i11 < 0 || i11 >= i10) {
            return null;
        }
        p pVar2 = (p) u8.p.k0(r15);
        p pVar3 = (p) u8.p.s0(r15);
        if (pVar2.f4834n || pVar3.f4834n) {
            return null;
        }
        int i12 = this.f4817m;
        int i13 = this.f4816l;
        if (i7 < 0) {
            if (Math.min((pVar2.f4831j + pVar2.f4832l) - i13, (pVar3.f4831j + pVar3.f4832l) - i12) <= (-i7)) {
                return null;
            }
        } else if (Math.min(i13 - pVar2.f4831j, i12 - pVar3.f4831j) <= i7) {
            return null;
        }
        int size = r15.size();
        for (int i14 = 0; i14 < size; i14++) {
            p pVar4 = (p) r15.get(i14);
            pVar4.getClass();
            int[] iArr = pVar4.f4836p;
            if (!pVar4.f4834n) {
                pVar4.f4831j += i7;
                int length = iArr.length;
                for (int i15 = 0; i15 < length; i15++) {
                    if ((i15 & 1) != 0) {
                        iArr[i15] = iArr[i15] + i7;
                    }
                }
                if (z10) {
                    int size2 = pVar4.f4823b.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        pVar4.f4830i.a(i16, pVar4.f4828g);
                    }
                }
            }
        }
        return new o(this.f4806a, i11, this.f4808c || i7 > 0, i7, this.f4810e, this.f4811f, this.f4812g, this.f4813h, this.f4814i, this.f4815j, r15, this.f4816l, this.f4817m, this.f4818n, this.f4819o, this.f4820p, this.f4821q);
    }

    @Override // o2.n0
    public final Map b() {
        return this.f4810e.b();
    }

    @Override // o2.n0
    public final void c() {
        this.f4810e.c();
    }

    @Override // o2.n0
    public final h9.k d() {
        return this.f4810e.d();
    }

    public final long e() {
        n0 n0Var = this.f4810e;
        return (((long) n0Var.getWidth()) << 32) | (((long) n0Var.getHeight()) & 4294967295L);
    }

    @Override // o2.n0
    public final int getHeight() {
        return this.f4810e.getHeight();
    }

    @Override // o2.n0
    public final int getWidth() {
        return this.f4810e.getWidth();
    }
}

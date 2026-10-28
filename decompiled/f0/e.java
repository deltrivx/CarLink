package f0;

import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h0.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f4767a;

    public e(u uVar) {
        this.f4767a = uVar;
    }

    @Override // h0.o
    public final int a() {
        return this.f4767a.g().f4818n;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // h0.o
    public final int b() {
        return Math.min(a() - 1, ((p) u8.p.s0(this.f4767a.g().k)).f4822a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // h0.o
    public final int c() {
        int i7;
        u uVar = this.f4767a;
        if (uVar.g().k.isEmpty()) {
            return 0;
        }
        o oVarG = uVar.g();
        int iE = (int) (oVarG.f4819o == x0.f15591a ? oVarG.e() & 4294967295L : oVarG.e() >> 32);
        o oVarG2 = uVar.g();
        ?? r8 = oVarG2.k;
        int size = r8.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((p) r8.get(i11)).k;
        }
        int size2 = (i10 / r8.size()) + oVarG2.f4821q;
        if (size2 != 0 && (i7 = iE / size2) >= 1) {
            return i7;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // h0.o
    public final boolean d() {
        return !this.f4767a.g().k.isEmpty();
    }

    @Override // h0.o
    public final int e() {
        return Math.max(0, this.f4767a.f4856e.f4839b.f());
    }
}

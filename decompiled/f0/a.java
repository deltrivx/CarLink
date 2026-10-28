package f0;

import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f4751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4752e;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    public static int a(g0.n nVar, boolean z10) {
        return z10 ? ((g0.o) u8.p.s0(nVar.f5686m)).f5693a + 1 : ((g0.o) u8.p.k0(nVar.f5686m)).f5693a - 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    public static int b(o oVar, boolean z10) {
        return z10 ? ((p) u8.p.s0(oVar.k)).f4822a + 1 : ((p) u8.p.k0(oVar.k)).f4822a - 1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    public static int c(g0.n nVar, boolean z10) {
        x0 x0Var = x0.f15591a;
        if (z10) {
            g0.o oVar = (g0.o) u8.p.s0(nVar.f5686m);
            return (nVar.f5690q == x0Var ? oVar.f5707p : oVar.f5708q) + 1;
        }
        g0.o oVar2 = (g0.o) u8.p.k0(nVar.f5686m);
        return (nVar.f5690q == x0Var ? oVar2.f5707p : oVar2.f5708q) - 1;
    }
}

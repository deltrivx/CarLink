package o2;

import q2.c2;
import q2.d2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s.x f9332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f9333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9334c;

    public h0(i0 i0Var, Object obj) {
        this.f9333b = i0Var;
        this.f9334c = obj;
        int[] iArr = s.m.f12470a;
        this.f9332a = new s.x();
    }

    @Override // o2.f1
    public final void a() {
        i0 i0Var = this.f9333b;
        q2.h0 h0Var = i0Var.f9341a;
        i0Var.e();
        q2.h0 h0Var2 = (q2.h0) i0Var.f9350j.k(this.f9334c);
        if (h0Var2 != null) {
            if (i0Var.f9354o <= 0) {
                n2.a.b("No pre-composed items to dispose");
            }
            int iJ = ((h1.e) ((h1.b) h0Var.o()).f6413b).j(h0Var2);
            if (iJ < ((h1.e) ((h1.b) h0Var.o()).f6413b).f6423c - i0Var.f9354o) {
                n2.a.b("Item is not in pre-composed item range");
            }
            i0Var.f9353n++;
            i0Var.f9354o--;
            b0 b0Var = (b0) i0Var.f9346f.g(h0Var2);
            if (b0Var != null) {
                i0.a(b0Var);
            }
            int i7 = (((h1.e) ((h1.b) h0Var.o()).f6413b).f6423c - i0Var.f9354o) - i0Var.f9353n;
            h0Var.f10681p = true;
            h0Var.M(iJ, i7, 1);
            h0Var.f10681p = false;
            i0Var.d(i7);
        }
    }

    @Override // o2.f1
    public final int b() {
        q2.h0 h0Var = (q2.h0) this.f9333b.f9350j.g(this.f9334c);
        if (h0Var != null) {
            return ((h1.e) ((h1.b) h0Var.n()).f6413b).f6423c;
        }
        return 0;
    }

    @Override // o2.f1
    public final long c(int i7) {
        q2.h0 h0Var = (q2.h0) this.f9333b.f9350j.g(this.f9334c);
        if (h0Var == null || !h0Var.I()) {
            return 0L;
        }
        int i10 = ((h1.e) ((h1.b) h0Var.n()).f6413b).f6423c;
        if (i7 < 0 || i7 >= i10) {
            n2.a.d("Index (" + i7 + ") is out of bound of [0, " + i10 + ')');
        }
        if (!this.f9332a.b(i7)) {
            return 0L;
        }
        return (((long) ((q2.h0) ((h1.b) h0Var.n()).get(i7)).F.f10743p.f9435a) << 32) | (((long) ((q2.h0) ((h1.b) h0Var.n()).get(i7)).F.f10743p.f9436b) & 4294967295L);
    }

    @Override // o2.f1
    public final void d(int i7, long j5) {
        i0 i0Var = this.f9333b;
        q2.h0 h0Var = (q2.h0) i0Var.f9350j.g(this.f9334c);
        if (h0Var == null || !h0Var.I()) {
            return;
        }
        int i10 = ((h1.e) ((h1.b) h0Var.n()).f6413b).f6423c;
        if (i7 < 0 || i7 >= i10) {
            n2.a.d("Index (" + i7 + ") is out of bound of [0, " + i10 + ')');
        }
        if (h0Var.J()) {
            n2.a.a("Pre-measure called on node that is not placed");
        }
        q2.h0 h0Var2 = i0Var.f9341a;
        h0Var2.f10681p = true;
        ((r2.u) q2.k0.a(h0Var)).z((q2.h0) ((h1.b) h0Var.n()).get(i7), j5);
        h0Var2.f10681p = false;
        this.f9332a.a(i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [c8.k] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // o2.f1
    public final void e(c8.k kVar) {
        q2.d1 d1Var;
        r1.o oVar;
        c2 c2Var;
        q2.h0 h0Var = (q2.h0) this.f9333b.f9350j.g(this.f9334c);
        if (h0Var == null || (d1Var = h0Var.E) == null || (oVar = d1Var.f10617f) == null) {
            return;
        }
        if (!oVar.f11117a.f11129n) {
            n2.a.b("visitSubtreeIf called on an unattached node");
        }
        h1.e eVar = new h1.e(new r1.o[16]);
        r1.o oVar2 = oVar.f11117a;
        r1.o oVar3 = oVar2.f11122f;
        if (oVar3 == null) {
            q2.f.b(eVar, oVar2);
        } else {
            eVar.b(oVar3);
        }
        while (true) {
            int i7 = eVar.f6423c;
            if (i7 == 0) {
                return;
            }
            r1.o oVar4 = (r1.o) eVar.l(i7 - 1);
            if ((oVar4.f11120d & 262144) != 0) {
                r1.o oVar5 = oVar4;
                while (true) {
                    if (oVar5 != null) {
                        if ((oVar5.f11119c & 262144) != 0) {
                            ?? F = oVar5;
                            ?? eVar2 = 0;
                            while (F != 0) {
                                if (F instanceof d2) {
                                    d2 d2Var = (d2) F;
                                    boolean zEquals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(d2Var.k());
                                    c2 c2Var2 = c2.f10602b;
                                    if (zEquals) {
                                        kVar.invoke(d2Var);
                                        c2Var = c2Var2;
                                    } else {
                                        c2Var = c2.f10601a;
                                    }
                                    if (c2Var != c2.f10603c) {
                                        if (c2Var == c2Var2) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((F.f11119c & 262144) != 0 && (F instanceof q2.m)) {
                                    r1.o oVar6 = ((q2.m) F).f10746p;
                                    int i10 = 0;
                                    F = F;
                                    eVar2 = eVar2;
                                    while (oVar6 != null) {
                                        if ((oVar6.f11119c & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                eVar2 = eVar2;
                                                F = oVar6;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new h1.e(new r1.o[16]);
                                                }
                                                if (F != 0) {
                                                    eVar2.b(F);
                                                    F = 0;
                                                }
                                                eVar2.b(oVar6);
                                            }
                                        }
                                        oVar6 = oVar6.f11122f;
                                        F = F;
                                        eVar2 = eVar2;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                F = q2.f.f(eVar2);
                            }
                        }
                        oVar5 = oVar5.f11122f;
                    }
                }
            }
            q2.f.b(eVar, oVar4);
        }
    }
}

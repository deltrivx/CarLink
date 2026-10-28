package p2;

import d0.a0;
import java.util.HashSet;
import q2.h0;
import q2.m;
import r1.o;
import r2.u;
import s.d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f10117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1.e f10118b = new h1.e(new q2.c[16]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1.e f10119c = new h1.e(new f[16]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h1.e f10120d = new h1.e(new h0[16]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1.e f10121e = new h1.e(new f[16]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10122f;

    public c(u uVar) {
        this.f10117a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(o oVar, f fVar, HashSet hashSet) {
        if (!oVar.f11117a.f11129n) {
            n2.a.b("visitSubtreeIf called on an unattached node");
        }
        h1.e eVar = new h1.e(new o[16]);
        o oVar2 = oVar.f11117a;
        o oVar3 = oVar2.f11122f;
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
            o oVar4 = (o) eVar.l(i7 - 1);
            if ((oVar4.f11120d & 32) != 0) {
                o oVar5 = oVar4;
                while (true) {
                    if (oVar5 != null) {
                        if ((oVar5.f11119c & 32) != 0) {
                            ?? F = oVar5;
                            ?? eVar2 = 0;
                            while (F != 0) {
                                if (F instanceof d) {
                                    d dVar = (d) F;
                                    if (dVar instanceof q2.c) {
                                        q2.c cVar = (q2.c) dVar;
                                        if ((cVar.f10598o instanceof a0) && cVar.f10600q.contains(fVar)) {
                                            hashSet.add(dVar);
                                        }
                                    }
                                    if (dVar.N().s(fVar)) {
                                        break;
                                    }
                                } else if ((F.f11119c & 32) != 0 && (F instanceof m)) {
                                    o oVar6 = ((m) F).f10746p;
                                    int i10 = 0;
                                    F = F;
                                    eVar2 = eVar2;
                                    while (oVar6 != null) {
                                        if ((oVar6.f11119c & 32) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                eVar2 = eVar2;
                                                F = oVar6;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new h1.e(new o[16]);
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

    public final void a() {
        if (this.f10122f) {
            return;
        }
        this.f10122f = true;
        b1.a aVar = new b1.a(11, this);
        d0 d0Var = this.f10117a.C0;
        if (d0Var.f(aVar) >= 0) {
            return;
        }
        d0Var.a(aVar);
    }
}

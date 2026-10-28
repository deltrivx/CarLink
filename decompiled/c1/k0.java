package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r1.p f1962a = androidx.compose.foundation.layout.c.h(r1.m.f11116a, e1.j.f3988a);

    /* JADX WARN: Code duplicated, block: B:79:0x0109  */
    public static final void a(d2.b bVar, String str, r1.p pVar, long j5, f1.s sVar, int i7) {
        d2.b bVar2;
        int i10;
        r1.p pVarA;
        sVar.Y(-2142239481);
        if ((i7 & 6) == 0) {
            bVar2 = bVar;
            i10 = (sVar.h(bVar2) ? 4 : 2) | i7;
        } else {
            bVar2 = bVar;
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.f(str) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.f(pVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= sVar.e(j5) ? 2048 : 1024;
        }
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i7 & 1) != 0 && !sVar.x()) {
                sVar.Q();
            }
            sVar.q();
            boolean z10 = (((i10 & 7168) ^ 3072) > 2048 && sVar.e(j5)) || (i10 & 3072) == 2048;
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (z10 || objK == w0Var) {
                objK = y1.q.c(j5, y1.q.f14958m) ? null : new y1.k(5, j5);
                sVar.h0(objK);
            }
            y1.k kVar = (y1.k) objK;
            sVar.W(-2144891392);
            r1.p pVar2 = r1.m.f11116a;
            if (str != null) {
                boolean z11 = (i10 & 112) == 32;
                Object objK2 = sVar.K();
                if (z11 || objK2 == w0Var) {
                    objK2 = new j0(0, str);
                    sVar.h0(objK2);
                }
                pVarA = y2.k.a(pVar2, (h9.k) objK2);
            } else {
                pVarA = pVar2;
            }
            sVar.p(false);
            if (x1.e.a(bVar2.d(), 9205357640488583168L)) {
                pVar2 = f1962a;
            } else {
                long jD = bVar.d();
                if (Float.isInfinite(x1.e.d(jD)) && Float.isInfinite(x1.e.b(jD))) {
                    pVar2 = f1962a;
                }
            }
            d0.m.a(androidx.compose.ui.draw.a.d(pVar.a(pVar2), bVar, null, o2.j.f9357b, 0.0f, kVar, 22).a(pVarA), sVar, 0);
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new i0(bVar, str, pVar, j5, i7);
        }
    }

    public static final void b(e2.f fVar, String str, r1.p pVar, long j5, f1.s sVar, int i7, int i10) {
        int i11;
        f1.s sVar2;
        String str2;
        r1.p pVar2;
        long j10;
        sVar.Y(-126890956);
        if ((i7 & 6) == 0) {
            i11 = (sVar.f(fVar) ? 4 : 2) | i7;
        } else {
            i11 = i7;
        }
        if ((i7 & 48) == 0) {
            i11 |= sVar.f(str) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i11 |= sVar.f(pVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i11 |= ((i10 & 8) == 0 && sVar.e(j5)) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
            sVar2 = sVar;
            j10 = j5;
            pVar2 = pVar;
            str2 = str;
        } else {
            sVar.S();
            if ((i7 & 1) != 0 && !sVar.x()) {
                sVar.Q();
                if ((i10 & 8) != 0) {
                    i11 &= -7169;
                }
            } else if ((i10 & 8) != 0) {
                j5 = ((y1.q) sVar.j(a0.f1805a)).f14960a;
                i11 &= -7169;
            }
            long j11 = j5;
            sVar.q();
            sVar2 = sVar;
            a(e2.b.c(fVar, sVar), str, pVar, j11, sVar2, (i11 & 112) | 8 | (i11 & 896) | (i11 & 7168));
            str2 = str;
            pVar2 = pVar;
            j10 = j11;
        }
        f1.w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h0(fVar, str2, pVar2, j10, i7, i10);
        }
    }
}

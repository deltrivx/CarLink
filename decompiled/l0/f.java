package l0;

import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f7632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f7633b;

    static {
        float f10 = 25;
        f7632a = f10;
        f7633b = (f10 * 2.0f) / 2.4142137f;
    }

    public static final void a(final w0.q qVar, final r1.p pVar, long j5, f1.s sVar, final int i7) {
        int i10;
        sVar.Y(1776202187);
        int i11 = (sVar.f(qVar) ? 4 : 2) | i7 | (sVar.f(pVar) ? 32 : 16) | 128;
        if (sVar.N(i11 & 1, (i11 & 147) != 146)) {
            sVar.S();
            if ((i7 & 1) == 0 || sVar.x()) {
                i10 = i11 & (-897);
                j5 = 9205357640488583168L;
            } else {
                sVar.Q();
                i10 = i11 & (-897);
            }
            sVar.q();
            int i12 = i10 & 14;
            boolean z10 = i12 == 4;
            Object objK = sVar.K();
            if (z10 || objK == f1.n.f5051a) {
                objK = new c8.k(17, qVar);
                sVar.h0(objK);
            }
            w0.y0.a(qVar, r1.c.f11093b, n1.h.e(-1653527038, new c(j5, y2.k.a(pVar, (h9.k) objK)), sVar), sVar, i12 | 432);
        } else {
            sVar.Q();
        }
        final long j10 = j5;
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n(pVar, j10, i7) { // from class: l0.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r1.p f7589b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f7590c;

                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = f1.b.y(1);
                    f.a(this.f7588a, this.f7589b, this.f7590c, (f1.s) obj, iY);
                    return t8.z.f12851a;
                }
            };
        }
    }

    public static final void b(r1.p pVar, f1.s sVar, int i7, int i10) {
        int i11;
        sVar.Y(694251107);
        int i12 = i10 & 1;
        if (i12 != 0) {
            i11 = i7 | 6;
        } else {
            i11 = (sVar.f(pVar) ? 4 : 2) | i7;
        }
        if (sVar.N(i11 & 1, (i11 & 3) != 2)) {
            if (i12 != 0) {
                pVar = r1.m.f11116a;
            }
            d0.c.a(sVar, r1.a.a(androidx.compose.foundation.layout.c.i(pVar, f7633b, f7632a), e.f7627a));
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new b(pVar, i7, i10);
        }
    }
}

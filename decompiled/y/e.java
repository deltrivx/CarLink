package y;

import a8.m;
import f1.s;
import f1.w1;
import h9.n;
import h9.o;
import p1.p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f14857a = new p();

    public static void b(e eVar, n nVar, n1.c cVar, h9.a aVar, int i7) {
        if ((i7 & 8) != 0) {
            cVar = null;
        }
        eVar.f14857a.add(new n1.c(new d(nVar, cVar, aVar), 424163756, true));
    }

    public final void a(c cVar, s sVar, int i7) {
        sVar.Y(1320309496);
        int i10 = (sVar.f(cVar) ? 4 : 2) | i7 | (sVar.f(this) ? 32 : 16);
        if (sVar.N(i10 & 1, (i10 & 19) != 18)) {
            p pVar = this.f14857a;
            int size = pVar.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((o) pVar.get(i11)).invoke(cVar, sVar, Integer.valueOf(i10 & 14));
            }
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new m(i7, 18, this, cVar);
        }
    }
}

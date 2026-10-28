package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1.c0 f2009a = new f1.c0(x.k);

    public static final r1.p a(r1.p pVar, y1.l0 l0Var, long j5, float f10) {
        r1.p pVarA;
        r1.m mVar = r1.m.f11116a;
        if (f10 > 0.0f) {
            long j10 = y1.p0.f14946a;
            long j11 = y1.w.f14964a;
            pVarA = androidx.compose.ui.graphics.a.a(mVar, 1.0f, f10, 0.0f, j10, l0Var, false, j11, j11);
        } else {
            pVarA = mVar;
        }
        return n4.h.o(androidx.compose.foundation.a.b(pVar.a(pVarA).a(mVar), j5, l0Var), l0Var);
    }

    public static final long b(long j5, float f10, f1.s sVar) {
        w wVar = (w) sVar.j(y.f2319a);
        boolean zBooleanValue = ((Boolean) sVar.j(y.f2320b)).booleanValue();
        long j10 = wVar.f2239p;
        if (y1.q.c(j5, j10) && zBooleanValue) {
            return n3.f.a(f10, (float) 0) ? j10 : y1.h0.k(y1.q.b(((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, wVar.f2243t), j10);
        }
        return j5;
    }
}

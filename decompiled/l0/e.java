package l0;

import w0.y1;
import w0.z1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f7627a = new e();

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r1.p pVar = (r1.p) obj;
        f1.s sVar = (f1.s) obj2;
        ((Number) obj3).intValue();
        sVar.W(-2126899193);
        long j5 = ((y1) sVar.j(z1.f14024a)).f14016a;
        boolean zE = sVar.e(j5);
        Object objK = sVar.K();
        if (zE || objK == f1.n.f5051a) {
            objK = new fc.g(1, j5);
            sVar.h0(objK);
        }
        r1.p pVarA = pVar.a(androidx.compose.ui.draw.a.b(r1.m.f11116a, (h9.k) objK));
        sVar.p(false);
        return pVarA;
    }
}

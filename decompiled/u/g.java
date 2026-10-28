package u;

import f1.n;
import f1.s;
import f1.w2;
import v.v0;
import v.w0;
import y1.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    static {
        v.d.j(7, null);
    }

    public static final w2 a(long j5, v0 v0Var, s sVar, int i7) {
        boolean zF = sVar.f(q.f(j5));
        Object objK = sVar.K();
        if (zF || objK == n.f5051a) {
            w0 w0Var = new w0(c.f12958a, new b2.a(17, q.f(j5)));
            sVar.h0(w0Var);
            objK = w0Var;
        }
        return v.e.a(new q(j5), (w0) objK, v0Var, "ColorAnimation", sVar, (i7 << 3) & 896);
    }
}

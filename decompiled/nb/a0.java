package nb;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 extends w0 implements qb.f, qb.g {
    @Override // nb.w0
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public abstract a0 H0(boolean z10);

    @Override // nb.w0
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public abstract a0 J0(h0 h0Var);

    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", ya.g.f15195e.v((y9.b) it.next(), null), "] "};
            for (int i7 = 0; i7 < 3; i7++) {
                sb2.append(strArr[i7]);
            }
        }
        sb2.append(D0());
        if (!B0().isEmpty()) {
            u8.p.p0(B0(), sb2, ", ", "<", ">", null, 112);
        }
        if (E0()) {
            sb2.append("?");
        }
        return sb2.toString();
    }
}

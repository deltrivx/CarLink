package u7;

import f1.s;
import h9.k;
import h9.n;
import java.util.List;
import n3.l;
import o7.q;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f13074a = new a();

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        s sVar = (s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            List listJ = l.J("显示时间", "连接后显示时间");
            sVar.W(1849434622);
            Object objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = new q(20);
                sVar.h0(objK);
            }
            sVar.p(false);
            g5.a.f(listJ, "TIME_SWITCH", false, false, (k) objK, sVar, 25014, 8);
        }
        return z.f12851a;
    }
}

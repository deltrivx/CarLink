package aa;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f335a;

    public f0(List list) {
        this.f335a = list;
    }

    public f0(ra.y0 y0Var) {
        i9.l.e(y0Var, "typeTable");
        List list = y0Var.f12282c;
        if ((y0Var.f12281b & 1) == 1) {
            int i7 = y0Var.f12283d;
            i9.l.d(list, "getTypeList(...)");
            ArrayList arrayList = new ArrayList(u8.q.a0(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    n3.l.Y();
                    throw null;
                }
                ra.s0 s0VarE = (ra.s0) obj;
                if (i10 >= i7) {
                    s0VarE.getClass();
                    ra.r0 r0VarO = ra.s0.o(s0VarE);
                    r0VarO.f12147d |= 2;
                    r0VarO.f12149f = true;
                    s0VarE = r0VarO.e();
                    if (!s0VarE.isInitialized()) {
                        throw new cc.s();
                    }
                }
                arrayList.add(s0VarE);
                i10 = i11;
            }
            list = arrayList;
        }
        i9.l.d(list, "run(...)");
        this.f335a = list;
    }

    public ra.s0 a(int i7) {
        return (ra.s0) this.f335a.get(i7);
    }
}

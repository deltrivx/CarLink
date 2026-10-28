package w0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements o2.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1 f13792a = new g1();

    @Override // o2.m0
    public final /* synthetic */ int a(o2.r rVar, List list, int i7) {
        return a2.f.i(this, rVar, list, i7);
    }

    @Override // o2.m0
    public final o2.n0 c(o2.o0 o0Var, List list, long j5) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            o2.v0 v0VarU = ((o2.l0) list.get(i7)).u(j5);
            iMax = Math.max(iMax, v0VarU.f9435a);
            iMax2 = Math.max(iMax2, v0VarU.f9436b);
            arrayList.add(v0VarU);
        }
        return o0Var.i(iMax, iMax2, u8.x.f13123a, new e8.w0(1, arrayList));
    }

    @Override // o2.m0
    public final /* synthetic */ int f(o2.r rVar, List list, int i7) {
        return a2.f.d(this, rVar, list, i7);
    }

    @Override // o2.m0
    public final /* synthetic */ int h(o2.r rVar, List list, int i7) {
        return a2.f.b(this, rVar, list, i7);
    }

    @Override // o2.m0
    public final /* synthetic */ int j(o2.r rVar, List list, int i7) {
        return a2.f.g(this, rVar, list, i7);
    }
}

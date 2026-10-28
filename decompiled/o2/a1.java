package o2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends q2.e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a1 f9290b = new a1("Undefined intrinsics block and it is required");

    @Override // o2.m0
    public final n0 c(o0 o0Var, List list, long j5) {
        int size = list.size();
        u8.x xVar = u8.x.f13123a;
        if (size == 0) {
            return o0Var.i(n3.a.j(j5), n3.a.i(j5), xVar, w0.f9441c);
        }
        if (size == 1) {
            v0 v0VarU = ((l0) list.get(0)).u(j5);
            return o0Var.i(n3.b.g(v0VarU.f9435a, j5), n3.b.f(v0VarU.f9436b, j5), xVar, new y0(v0VarU, 0));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < size2; i7++) {
            v0 v0VarU2 = ((l0) list.get(i7)).u(j5);
            iMax = Math.max(v0VarU2.f9435a, iMax);
            iMax2 = Math.max(v0VarU2.f9436b, iMax2);
            arrayList.add(v0VarU2);
        }
        return o0Var.i(n3.b.g(iMax, j5), n3.b.f(iMax2, j5), xVar, new z0(0, arrayList));
    }
}

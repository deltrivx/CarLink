package r3;

import java.util.ArrayList;
import java.util.List;
import o2.l0;
import o2.m0;
import o2.n0;
import o2.o0;
import o2.v0;
import o2.y0;
import o2.z0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f11550b = new f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f11551c = new f(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11552a;

    public /* synthetic */ f(int i7) {
        this.f11552a = i7;
    }

    @Override // o2.m0
    public final /* synthetic */ int a(o2.r rVar, List list, int i7) {
        int i10 = this.f11552a;
        return a2.f.i(this, rVar, list, i7);
    }

    @Override // o2.m0
    public final n0 c(o0 o0Var, List list, long j5) {
        switch (this.f11552a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iJ = 0;
                int i7 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    v0 v0VarU = ((l0) list.get(i10)).u(j5);
                    iJ = Math.max(iJ, v0VarU.f9435a);
                    i7 = Math.max(i7, v0VarU.f9436b);
                    arrayList.add(v0VarU);
                }
                if (list.isEmpty()) {
                    iJ = n3.a.j(j5);
                    i7 = n3.a.i(j5);
                }
                return o0Var.i(iJ, i7, u8.x.f13123a, new z0(1, arrayList));
            default:
                int size2 = list.size();
                u8.x xVar = u8.x.f13123a;
                if (size2 == 0) {
                    return o0Var.i(0, 0, xVar, d.f11543f);
                }
                if (size2 == 1) {
                    v0 v0VarU2 = ((l0) list.get(0)).u(j5);
                    return o0Var.i(v0VarU2.f9435a, v0VarU2.f9436b, xVar, new y0(v0VarU2, 2));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i11 = 0; i11 < size3; i11++) {
                    v0 v0VarU3 = ((l0) list.get(i11)).u(j5);
                    iMax = Math.max(iMax, v0VarU3.f9435a);
                    iMax2 = Math.max(iMax2, v0VarU3.f9436b);
                    arrayList2.add(v0VarU3);
                }
                return o0Var.i(iMax, iMax2, xVar, new z0(2, arrayList2));
        }
    }

    @Override // o2.m0
    public final /* synthetic */ int f(o2.r rVar, List list, int i7) {
        int i10 = this.f11552a;
        return a2.f.d(this, rVar, list, i7);
    }

    @Override // o2.m0
    public final /* synthetic */ int h(o2.r rVar, List list, int i7) {
        int i10 = this.f11552a;
        return a2.f.b(this, rVar, list, i7);
    }

    @Override // o2.m0
    public final /* synthetic */ int j(o2.r rVar, List list, int i7) {
        int i10 = this.f11552a;
        return a2.f.g(this, rVar, list, i7);
    }
}

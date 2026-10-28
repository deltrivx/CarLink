package o2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9450b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(int i7, ArrayList arrayList) {
        super(1);
        this.f9449a = i7;
        this.f9450b = arrayList;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f9449a) {
            case 0:
                u0 u0Var = (u0) obj;
                ArrayList arrayList = this.f9450b;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    u0.k(u0Var, (v0) arrayList.get(i7), 0, 0);
                }
                break;
            case 1:
                u0 u0Var2 = (u0) obj;
                ArrayList arrayList2 = this.f9450b;
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    u0.j(u0Var2, (v0) arrayList2.get(i10), 0, 0);
                }
                break;
            default:
                u0 u0Var3 = (u0) obj;
                ArrayList arrayList3 = this.f9450b;
                int iA = n3.l.A(arrayList3);
                if (iA >= 0) {
                    int i11 = 0;
                    while (true) {
                        u0.j(u0Var3, (v0) arrayList3.get(i11), 0, 0);
                        if (i11 != iA) {
                            i11++;
                        }
                    }
                }
                break;
        }
        return t8.z.f12851a;
    }
}

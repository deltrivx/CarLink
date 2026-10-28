package f0;

import f1.b1;
import java.util.ArrayList;
import java.util.List;
import o2.u0;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f4803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4805d;

    public /* synthetic */ n(b1 b1Var, ArrayList arrayList, List list, boolean z10, int i7) {
        this.f4802a = i7;
        this.f4803b = b1Var;
        this.f4804c = arrayList;
        this.f4805d = list;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // h9.k
    public final Object invoke(Object obj) {
        u0 u0Var = (u0) obj;
        switch (this.f4802a) {
            case 0:
                u0Var.f9432a = true;
                ArrayList arrayList = this.f4804c;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((p) arrayList.get(i7)).a(u0Var);
                }
                ?? r8 = this.f4805d;
                int size2 = r8.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((p) r8.get(i10)).a(u0Var);
                }
                u0Var.f9432a = false;
                this.f4803b.getValue();
                break;
            default:
                u0Var.f9432a = true;
                ArrayList arrayList2 = this.f4804c;
                int size3 = arrayList2.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    ((g0.o) arrayList2.get(i11)).a(u0Var);
                }
                ?? r10 = this.f4805d;
                int size4 = r10.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    ((g0.o) r10.get(i12)).a(u0Var);
                }
                u0Var.f9432a = false;
                this.f4803b.getValue();
                break;
        }
        return z.f12851a;
    }
}

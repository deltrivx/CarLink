package c8;

import c1.u2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h9.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f2520a;

    public m(List list) {
        this.f2520a = list;
    }

    @Override // h9.p
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        f0.c cVar = (f0.c) obj;
        int iIntValue = ((Number) obj2).intValue();
        f1.s sVar = (f1.s) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i7 = (sVar.f(cVar) ? 4 : 2) | iIntValue2;
        } else {
            i7 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i7 |= sVar.d(iIntValue) ? 32 : 16;
        }
        if (sVar.N(i7 & 1, (i7 & 147) != 146)) {
            String str = (String) this.f2520a.get(iIntValue);
            sVar.W(-2140411785);
            u2.b(str, androidx.compose.foundation.layout.c.o(r1.m.f11116a), 0L, n3.r.K(g5.a.n(18, sVar), 4294967296L), null, 0L, null, n3.r.K(g5.a.n(30, sVar), 4294967296L), 3, false, 0, 0, null, sVar, 48, 432, 123892);
            sVar.p(false);
        } else {
            sVar.Q();
        }
        return t8.z.f12851a;
    }
}

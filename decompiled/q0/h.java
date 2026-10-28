package q0;

import f1.s;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements h9.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f10555b = new h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f10556c = new h(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10557a;

    public /* synthetic */ h(int i7) {
        this.f10557a = i7;
    }

    @Override // h9.q
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i7;
        int i10;
        switch (this.f10557a) {
            case 0:
                o0.g gVar = (o0.g) obj;
                s0.e eVar = (s0.e) obj2;
                h9.a aVar = (h9.a) obj3;
                s sVar = (s) obj4;
                int iIntValue = ((Number) obj5).intValue();
                if ((iIntValue & 6) == 0) {
                    i7 = ((iIntValue & 8) == 0 ? sVar.f(gVar) : sVar.h(gVar) ? 4 : 2) | iIntValue;
                } else {
                    i7 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i7 |= (iIntValue & 64) == 0 ? sVar.f(eVar) : sVar.h(eVar) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i7 |= sVar.h(aVar) ? 256 : 128;
                }
                if (sVar.N(i7 & 1, (i7 & 1171) != 1170)) {
                    k.c((s0.b) gVar, eVar, aVar, sVar, i7 & 1022);
                } else {
                    sVar.Q();
                }
                break;
            default:
                o0.g gVar2 = (o0.g) obj;
                s0.e eVar2 = (s0.e) obj2;
                h9.a aVar2 = (h9.a) obj3;
                s sVar2 = (s) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i10 = ((iIntValue2 & 8) == 0 ? sVar2.f(gVar2) : sVar2.h(gVar2) ? 4 : 2) | iIntValue2;
                } else {
                    i10 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i10 |= (iIntValue2 & 64) == 0 ? sVar2.f(eVar2) : sVar2.h(eVar2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i10 |= sVar2.h(aVar2) ? 256 : 128;
                }
                if (sVar2.N(i10 & 1, (i10 & 1171) != 1170)) {
                    k.c((s0.b) gVar2, eVar2, aVar2, sVar2, i10 & 1022);
                } else {
                    sVar2.Q();
                }
                break;
        }
        return z.f12851a;
    }
}

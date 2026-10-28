package ka;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f7448b;

    public /* synthetic */ l(o oVar, int i7) {
        this.f7447a = i7;
        this.f7448b = oVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f7447a) {
            case 0:
                Class<?>[] declaredClasses = this.f7448b.f7459o.f3881a.getDeclaredClasses();
                i9.l.d(declaredClasses, "getDeclaredClasses(...)");
                return u8.p.M0(yb.l.U(yb.l.T(new yb.h(u8.l.k0(declaredClasses), false, da.c.f3856d), da.c.f3857e)));
            case 1:
                List listB = this.f7448b.f7459o.b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listB) {
                    if (((da.u) obj).f3887a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iS0 = u8.c0.S0(u8.q.a0(arrayList, 10));
                if (iS0 < 16) {
                    iS0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS0);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((da.u) obj2).c(), obj2);
                }
                return linkedHashMap;
            default:
                o oVar = this.f7448b;
                return u8.f0.g0(oVar.c(), oVar.g());
        }
    }
}

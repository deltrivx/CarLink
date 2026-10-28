package y;

import f1.s;
import h9.n;
import h9.o;
import r1.m;
import t8.z;
import zb.j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f14854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f14855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h9.a f14856c;

    public d(n nVar, o oVar, h9.a aVar) {
        this.f14854a = nVar;
        this.f14855b = oVar;
        this.f14856c = aVar;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        c cVar = (c) obj;
        s sVar = (s) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= sVar.f(cVar) ? 4 : 2;
        }
        if (sVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            String str = (String) this.f14854a.invoke(sVar, 0);
            if (j.B0(str)) {
                c0.b.c("Label must not be blank");
            }
            g.c(str, cVar, m.f11116a, this.f14855b, this.f14856c, sVar, (iIntValue << 6) & 896);
        } else {
            sVar.Q();
        }
        return z.f12851a;
    }
}

package j2;

import h9.k;
import i9.n;
import i9.x;
import q2.d2;
import r1.o;
import w1.s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends n implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f6919b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(x xVar, int i7) {
        super(1);
        this.f6918a = i7;
        this.f6919b = xVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        boolean z10;
        switch (this.f6918a) {
            case 0:
                Object obj2 = (d2) obj;
                if (((o) obj2).f11117a.f11129n) {
                    this.f6919b.f6688a = obj2;
                    z10 = false;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 1:
                k2.h hVar = (k2.h) obj;
                x xVar = this.f6919b;
                Object obj3 = xVar.f6688a;
                if (obj3 == null && hVar.f7216q) {
                    xVar.f6688a = hVar;
                } else if (obj3 != null) {
                    hVar.getClass();
                }
                return Boolean.TRUE;
            default:
                this.f6919b.f6688a = (s) obj;
                return Boolean.TRUE;
        }
    }
}

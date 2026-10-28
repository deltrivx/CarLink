package db;

import h9.k;
import i9.l;

/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f3894b = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3895a;

    public /* synthetic */ b(int i7) {
        this.f3895a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f3895a) {
            case 0:
                x9.k kVar = (x9.k) obj;
                int i7 = e.f3900a;
                l.e(kVar, "it");
                return kVar.l();
            default:
                x9.c cVar = (x9.c) obj;
                l.b(cVar);
                return e.l(cVar);
        }
    }
}

package z7;

import b3.t0;
import fc.h0;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15761a;

    public /* synthetic */ j(int i7) {
        this.f15761a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        Object value;
        k kVar;
        switch (this.f15761a) {
            case 0:
                String str = (String) obj;
                i9.l.e(str, "it");
                h0 h0Var = k.f15762l;
                h0 h0Var2 = k.f15762l;
                do {
                    value = h0Var2.getValue();
                    kVar = (k) value;
                    i9.l.e(kVar, "$this$update");
                } while (!h0Var2.f(value, k.a(kVar, 0, false, 0, null, false, 0, false, str, false, false, false, 1919)));
                return z.f12851a;
            default:
                String str2 = obj != null ? (String) obj : null;
                i9.l.b(str2);
                return new t0(str2);
        }
    }
}

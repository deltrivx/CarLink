package n1;

import cc.b0;
import f1.s;
import h9.n;
import n3.t;
import t8.z;
import z.k1;
import z.m1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends i9.a implements n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8702h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i7, i10, cls, obj, str, str2);
        this.f8702h = i11;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8702h) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                ((c) this.f6660a).e(iIntValue, (s) obj);
                break;
            default:
                long j5 = ((t) obj).f8763a;
                m1 m1Var = (m1) this.f6660a;
                b0.s(m1Var.B.c(), null, new k1(m1Var, j5, null, 2), 3);
                break;
        }
        return z.f12851a;
    }
}

package fc;

import w0.m0;
import w0.n0;
import w0.o0;
import w0.y0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5537b;

    public /* synthetic */ g(int i7, long j5) {
        this.f5536a = i7;
        this.f5537b = j5;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f5536a) {
            case 0:
                return Long.valueOf(this.f5537b);
            case 1:
                v1.c cVar = (v1.c) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.f13592a.g() >> 32)) / 2.0f;
                return cVar.b(new l0.d(fIntBitsToFloat, y0.q(cVar, fIntBitsToFloat), new y1.k(5, this.f5537b)));
            default:
                ((y2.j) obj).n(o0.f13870c, new n0(l0.h0.f7651a, this.f5537b, m0.f13851b, true));
                return t8.z.f12851a;
        }
    }
}

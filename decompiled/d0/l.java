package d0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l implements o2.m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f3582b = new l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f3583c = new l(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3584a;

    public /* synthetic */ l(int i7) {
        this.f3584a = i7;
    }

    @Override // o2.m0
    public final /* synthetic */ int a(o2.r rVar, List list, int i7) {
        int i10 = this.f3584a;
        return a2.f.i(this, rVar, list, i7);
    }

    @Override // o2.m0
    public final o2.n0 c(o2.o0 o0Var, List list, long j5) {
        switch (this.f3584a) {
            case 0:
                return o0Var.i(n3.a.j(j5), n3.a.i(j5), u8.x.f13123a, new u7.d(27));
            default:
                return o0Var.i(n3.a.f(j5) ? n3.a.h(j5) : 0, n3.a.e(j5) ? n3.a.g(j5) : 0, u8.x.f13123a, new u7.d(27));
        }
    }

    @Override // o2.m0
    public final /* synthetic */ int f(o2.r rVar, List list, int i7) {
        int i10 = this.f3584a;
        return a2.f.d(this, rVar, list, i7);
    }

    @Override // o2.m0
    public final /* synthetic */ int h(o2.r rVar, List list, int i7) {
        int i10 = this.f3584a;
        return a2.f.b(this, rVar, list, i7);
    }

    @Override // o2.m0
    public final /* synthetic */ int j(o2.r rVar, List list, int i7) {
        int i10 = this.f3584a;
        return a2.f.g(this, rVar, list, i7);
    }
}

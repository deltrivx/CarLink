package w0;

import r2.r2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r2 f13779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r1.p f13782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f13783e;

    public f(r2 r2Var, long j5, boolean z10, r1.p pVar, q qVar) {
        this.f13779a = r2Var;
        this.f13780b = j5;
        this.f13781c = z10;
        this.f13782d = pVar;
        this.f13783e = qVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            f1.b.a(r2.j1.f11286s.a(this.f13779a), n1.h.e(1260045569, new e(this.f13780b, this.f13781c, this.f13782d, this.f13783e), sVar), sVar, 56);
        } else {
            sVar.Q();
        }
        return t8.z.f12851a;
    }
}

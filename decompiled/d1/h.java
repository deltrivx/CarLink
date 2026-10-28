package d1;

import b3.r0;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f3698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h9.n f3699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3700e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(long j5, r0 r0Var, h9.n nVar, int i7, int i10) {
        super(2);
        this.f3696a = i10;
        this.f3697b = j5;
        this.f3698c = r0Var;
        this.f3699d = nVar;
        this.f3700e = i7;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3696a) {
            case 0:
                ((Number) obj2).intValue();
                e.a(this.f3697b, this.f3698c, this.f3699d, (f1.s) obj, f1.b.y(this.f3700e | 1));
                break;
            default:
                ((Number) obj2).intValue();
                r.b(this.f3697b, this.f3698c, this.f3699d, (f1.s) obj, f1.b.y(this.f3700e | 1));
                break;
        }
        return z.f12851a;
    }
}

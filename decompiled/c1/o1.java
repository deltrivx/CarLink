package c1;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1 f2040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.k f2041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1.p f2042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m1 f2043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f2044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f2045f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(t1 t1Var, b0.k kVar, r1.p pVar, m1 m1Var, boolean z10, long j5, int i7) {
        super(2);
        this.f2040a = t1Var;
        this.f2041b = kVar;
        this.f2042c = pVar;
        this.f2043d = m1Var;
        this.f2044e = z10;
        this.f2045f = j5;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iY = f1.b.y(ServiceTypes.MSG_MEDIA_INIT);
        this.f2040a.a(this.f2041b, this.f2042c, this.f2043d, this.f2044e, this.f2045f, (f1.s) obj, iY);
        return t8.z.f12851a;
    }
}

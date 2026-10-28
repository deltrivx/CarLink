package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends i9.n implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b3.l0 f2211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.k f2212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f2213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h9.n f2214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h9.n f2215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q2 f2216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y1.l0 f2217j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(String str, boolean z10, boolean z11, b3.l0 l0Var, b0.k kVar, boolean z12, h9.n nVar, h9.n nVar2, q2 q2Var, y1.l0 l0Var2) {
        super(3);
        this.f2208a = str;
        this.f2209b = z10;
        this.f2210c = z11;
        this.f2211d = l0Var;
        this.f2212e = kVar;
        this.f2213f = z12;
        this.f2214g = nVar;
        this.f2215h = nVar2;
        this.f2216i = q2Var;
        this.f2217j = l0Var2;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h9.n nVar = (h9.n) obj;
        f1.s sVar = (f1.s) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= sVar.h(nVar) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            int i7 = iIntValue;
            t0 t0Var = t0.f2160a;
            y1.l0 l0Var = this.f2217j;
            boolean z10 = this.f2209b;
            boolean z11 = this.f2213f;
            b0.k kVar = this.f2212e;
            q2 q2Var = this.f2216i;
            t0Var.b(this.f2208a, nVar, z10, this.f2210c, this.f2211d, kVar, z11, this.f2214g, this.f2215h, q2Var, null, n1.h.e(2108828640, new u0(z10, z11, kVar, q2Var, l0Var), sVar), sVar, (i7 << 3) & 112);
        }
        return t8.z.f12851a;
    }
}

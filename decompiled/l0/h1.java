package l0;

import w0.x1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f7655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0.t1 f7656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g3.w f7657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f7658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f7659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g3.q f7660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t1 f7661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h9.k f7662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7663i;

    public h1(u0 u0Var, w0.t1 t1Var, g3.w wVar, boolean z10, boolean z11, g3.q qVar, t1 t1Var2, h9.k kVar, int i7) {
        this.f7655a = u0Var;
        this.f7656b = t1Var;
        this.f7657c = wVar;
        this.f7658d = z10;
        this.f7659e = z11;
        this.f7660f = qVar;
        this.f7661g = t1Var2;
        this.f7662h = kVar;
        this.f7663i = i7;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        f1.s sVar = (f1.s) obj2;
        ((Number) obj3).intValue();
        sVar.W(851809892);
        Object objK = sVar.K();
        f1.w0 w0Var = f1.n.f5051a;
        if (objK == w0Var) {
            objK = new x1();
            sVar.h0(objK);
        }
        x1 x1Var = (x1) objK;
        Object objK2 = sVar.K();
        if (objK2 == w0Var) {
            objK2 = new f0();
            sVar.h0(objK2);
        }
        h9.k kVar = this.f7662h;
        int i7 = this.f7663i;
        g1 g1Var = new g1(this.f7655a, this.f7656b, this.f7657c, this.f7658d, this.f7659e, x1Var, this.f7660f, this.f7661g, (f0) objK2, kVar, i7);
        boolean zH = sVar.h(g1Var);
        Object objK3 = sVar.K();
        if (zH || objK3 == w0Var) {
            cc.d1 d1Var = new cc.d1(1, g1Var, g1.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 3);
            sVar.h0(d1Var);
            objK3 = d1Var;
        }
        r1.p pVarA = androidx.compose.ui.input.key.a.a(r1.m.f11116a, (h9.k) ((o9.f) objK3));
        sVar.p(false);
        return pVarA;
    }
}

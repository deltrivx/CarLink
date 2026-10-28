package r2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1.x2 f11269a = new f1.x2(k0.f11298h);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1.x2 f11270b = new f1.x2(k0.f11299i);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1.x2 f11271c = new f1.x2(k0.k);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f1.x2 f11272d = new f1.x2(k0.f11300j);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f1.x2 f11273e = new f1.x2(k0.f11302m);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f1.x2 f11274f = new f1.x2(k0.f11301l);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f1.x2 f11275g = new f1.x2(k0.f11308s);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f1.x2 f11276h = new f1.x2(k0.f11304o);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f1.x2 f11277i = new f1.x2(k0.f11305p);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f1.x2 f11278j = new f1.x2(k0.f11307r);
    public static final f1.x2 k = new f1.x2(k0.f11306q);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f1.x2 f11279l = new f1.x2(k0.f11309t);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f1.x2 f11280m = new f1.x2(k0.f11310u);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f1.x2 f11281n = new f1.x2(k0.f11311v);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f1.x2 f11282o = new f1.x2(k0.f11315z);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f1.x2 f11283p = new f1.x2(k0.f11314y);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f1.x2 f11284q = new f1.x2(k0.A);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f1.x2 f11285r = new f1.x2(k0.B);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f1.x2 f11286s = new f1.x2(k0.C);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f1.x2 f11287t = new f1.x2(k0.D);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final f1.x2 f11288u = new f1.x2(k0.f11312w);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f1.c0 f11289v = new f1.c0(k0.f11313x);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f1.x2 f11290w = new f1.x2(k0.f11303n);

    public static final void a(q2.q1 q1Var, u0 u0Var, h9.n nVar, f1.s sVar, int i7) {
        sVar.Y(1925803616);
        int i10 = i7 | (sVar.f(q1Var) ? 4 : 2) | (sVar.f(u0Var) ? 32 : 16) | (sVar.h(nVar) ? 256 : 128);
        if (sVar.N(i10 & 1, (i10 & 147) != 146)) {
            u uVar = (u) q1Var;
            f1.u1 u1VarA = f11269a.a(uVar.getAccessibilityManager());
            f1.u1 u1VarA2 = f11270b.a(uVar.getAutofill());
            f1.u1 u1VarA3 = f11272d.a(uVar.getAutofillManager());
            f1.u1 u1VarA4 = f11271c.a(uVar.getAutofillTree());
            f1.u1 u1VarA5 = f11273e.a(uVar.getClipboardManager());
            f1.u1 u1VarA6 = f11274f.a(uVar.getClipboard());
            f1.u1 u1VarA7 = f11276h.a(uVar.getDensity());
            f1.u1 u1VarA8 = f11277i.a(uVar.getFocusOwner());
            f1.u1 u1VarA9 = f11278j.a(uVar.getFontLoader());
            u1VarA9.f5161c = false;
            f1.u1 u1VarA10 = k.a(uVar.getFontFamilyResolver());
            u1VarA10.f5161c = false;
            f1.b.b(new f1.u1[]{u1VarA, u1VarA2, u1VarA3, u1VarA4, u1VarA5, u1VarA6, u1VarA7, u1VarA8, u1VarA9, u1VarA10, f11279l.a(uVar.getHapticFeedBack()), f11280m.a(uVar.getInputModeManager()), f11281n.a(uVar.getLayoutDirection()), f11282o.a(uVar.getTextInputService()), f11283p.a(uVar.getSoftwareKeyboardController()), f11284q.a(uVar.getTextToolbar()), f11285r.a(u0Var), f11286s.a(uVar.getViewConfiguration()), f11287t.a(uVar.getWindowInfo()), f11288u.a(uVar.getPointerIconService()), f11275g.a(uVar.getGraphicsContext())}, nVar, sVar, ((i10 >> 3) & 112) | 8);
        } else {
            sVar.Q();
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new d1.k(q1Var, u0Var, nVar, i7, 4);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}

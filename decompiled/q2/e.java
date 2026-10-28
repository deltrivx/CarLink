package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i9.n implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f10622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f10623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f10624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f10625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f10626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f10627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f10628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f10629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f10630j;
    public static final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e f10631l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f10632m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10633a;

    static {
        int i7 = 1;
        f10622b = new e(i7, 0);
        f10623c = new e(i7, 1);
        f10624d = new e(i7, 2);
        f10625e = new e(i7, 3);
        f10626f = new e(i7, 4);
        f10627g = new e(i7, 5);
        f10628h = new e(i7, 6);
        f10629i = new e(i7, 7);
        f10630j = new e(i7, 8);
        k = new e(i7, 9);
        f10631l = new e(i7, 10);
        f10632m = new e(i7, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i7, int i10) {
        super(i7);
        this.f10633a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0157 A[LOOP:0: B:80:0x0120->B:90:0x0157, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x015a A[SYNTHETIC] */
    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f10633a) {
            case 0:
                ((c) obj).C0();
                break;
            case 1:
                u1 u1Var = (u1) obj;
                if (u1Var.p()) {
                    p0 p0Var = u1Var.f10828b;
                    if (!p0Var.k) {
                        h9.k kVarD = u1Var.f10827a.d();
                        s.h0 h0Var = p0Var.f10775n;
                        if (kVarD != null) {
                            p0Var.f0(u1Var, 9223372034707292159L, 0L);
                            p0Var.f10769g = kVarD;
                        } else if (h0Var != null) {
                            Object[] objArr = h0Var.f12439c;
                            long[] jArr = h0Var.f12437a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i7 = 0;
                                while (true) {
                                    long j5 = jArr[i7];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i10 = 8 - ((~(i7 - length)) >>> 31);
                                        for (int i11 = 0; i11 < i10; i11++) {
                                            if ((255 & j5) < 128) {
                                                p0Var.t0((s.i0) objArr[(i7 << 3) + i11]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i10 == 8) {
                                            if (i7 != length) {
                                                i7++;
                                            }
                                        }
                                    } else if (i7 != length) {
                                        i7++;
                                    }
                                }
                            }
                            h0Var.a();
                        }
                    }
                }
                break;
            case 2:
                p1 p1Var = ((h1) obj).I;
                if (p1Var != null) {
                    p1Var.invalidate();
                }
                break;
            case 3:
                h1 h1Var = (h1) obj;
                if (h1Var.p() && h1Var.e1(true)) {
                    h0 h0Var2 = h1Var.f10692o;
                    l0 l0Var = h0Var2.F;
                    if (l0Var.f10739l > 0) {
                        if (l0Var.k || l0Var.f10738j) {
                            h0Var2.U(false);
                        }
                        l0Var.f10743p.g0();
                    }
                    h0Var2.F();
                    r2.u uVar = (r2.u) k0.a(h0Var2);
                    uVar.getRectManager().e(h0Var2);
                    if (h0Var2.O > 0) {
                        u0.k kVar = uVar.P.f10841e;
                        kVar.getClass();
                        if (h0Var2.O > 0) {
                            ((h1.e) kVar.f12990b).b(h0Var2);
                            h0Var2.N = true;
                        }
                        uVar.K(null);
                    }
                }
                break;
            case 4:
                m1 m1Var = (m1) obj;
                if (m1Var.p()) {
                    m1Var.f10751a.X();
                }
                break;
            case 5:
                h0 h0Var3 = (h0) obj;
                if (h0Var3.I()) {
                    h0Var3.U(false);
                }
                break;
            case 6:
                h0 h0Var4 = (h0) obj;
                if (h0Var4.I()) {
                    h0Var4.U(false);
                }
                break;
            case 7:
                h0 h0Var5 = (h0) obj;
                if (h0Var5.I()) {
                    h0Var5.S(false);
                }
                break;
            case 8:
                h0 h0Var6 = (h0) obj;
                if (h0Var6.I()) {
                    h0Var6.S(false);
                }
                break;
            case 9:
                h0 h0Var7 = (h0) obj;
                if (h0Var7.I()) {
                    h0.T(h0Var7, false, 7);
                }
                break;
            case 10:
                h0 h0Var8 = (h0) obj;
                if (h0Var8.I()) {
                    h0.V(h0Var8, false, 7);
                }
                break;
            default:
                h0 h0Var9 = (h0) obj;
                if (h0Var9.I()) {
                    h0Var9.G();
                }
                break;
        }
        return t8.z.f12851a;
    }
}

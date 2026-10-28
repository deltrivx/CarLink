package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v1 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5178d;

    public /* synthetic */ v1(int i7, int i10, Object obj, Object obj2) {
        this.f5175a = i10;
        this.f5177c = obj;
        this.f5176b = i7;
        this.f5178d = obj2;
    }

    public /* synthetic */ v1(l0.u1 u1Var, o2.v0 v0Var, int i7) {
        this.f5175a = 1;
        this.f5177c = u1Var;
        this.f5178d = v0Var;
        this.f5176b = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        u uVar;
        u uVar2;
        char c10;
        switch (this.f5175a) {
            case 0:
                w1 w1Var = (w1) this.f5177c;
                s.c0 c0Var = (s.c0) this.f5178d;
                u uVar3 = (u) obj;
                int i7 = w1Var.f5193e;
                int i10 = this.f5176b;
                if (i7 == i10 && i9.l.a(c0Var, w1Var.f5194f) && (uVar3 instanceof y)) {
                    long[] jArr = c0Var.f12397a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j5 = jArr[i11];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                int i13 = 0;
                                while (i13 < i12) {
                                    if ((255 & j5) < 128) {
                                        int i14 = (i11 << 3) + i13;
                                        Object obj2 = c0Var.f12398b[i14];
                                        boolean z10 = c0Var.f12399c[i14] != i10;
                                        if (z10) {
                                            c10 = '\b';
                                            y yVar = (y) uVar3;
                                            s.h0 h0Var = yVar.f5210g;
                                            k9.a.K(h0Var, obj2, w1Var);
                                            uVar2 = uVar3;
                                            if (obj2 instanceof f0) {
                                                f0 f0Var = (f0) obj2;
                                                if (!h0Var.c(f0Var)) {
                                                    k9.a.L(yVar.f5213j, f0Var);
                                                }
                                                s.h0 h0Var2 = w1Var.f5195g;
                                                if (h0Var2 != null) {
                                                    h0Var2.k(obj2);
                                                }
                                            }
                                        } else {
                                            uVar2 = uVar3;
                                            c10 = '\b';
                                        }
                                        if (z10) {
                                            c0Var.g(i14);
                                        }
                                    } else {
                                        uVar2 = uVar3;
                                        c10 = '\b';
                                    }
                                    j5 >>= c10;
                                    i13++;
                                    uVar3 = uVar2;
                                }
                                uVar = uVar3;
                                if (i12 == 8) {
                                }
                            } else {
                                uVar = uVar3;
                            }
                            if (i11 != length) {
                                i11++;
                                uVar3 = uVar;
                            }
                        }
                    }
                }
                return t8.z.f12851a;
            case 1:
                l0.u1 u1Var = (l0.u1) this.f5177c;
                o2.v0 v0Var = (o2.v0) this.f5178d;
                o2.u0 u0Var = (o2.u0) obj;
                int i15 = u1Var.f7874b;
                l0.q1 q1Var = u1Var.f7873a;
                g3.d0 d0Var = u1Var.f7875c;
                l0.s1 s1Var = (l0.s1) u1Var.f7876d.invoke();
                q1Var.a(z.x0.f15591a, l0.q0.i(u0Var, i15, d0Var, s1Var != null ? s1Var.f7828a : null, false, v0Var.f9435a), this.f5176b, v0Var.f9436b);
                o2.u0.j(u0Var, v0Var, 0, Math.round(-q1Var.f7803a.f()));
                break;
            default:
                x.l1 l1Var = (x.l1) this.f5177c;
                o2.v0 v0Var2 = (o2.v0) this.f5178d;
                o2.u0 u0Var2 = (o2.u0) obj;
                int iF = l1Var.f14422o.f14445a.f();
                if (iF < 0) {
                    iF = 0;
                }
                int i16 = this.f5176b;
                if (iF > i16) {
                    iF = i16;
                }
                int i17 = -iF;
                boolean z11 = l1Var.f14423p;
                int i18 = z11 ? 0 : i17;
                if (!z11) {
                    i17 = 0;
                }
                u0Var2.f9432a = true;
                o2.u0.k(u0Var2, v0Var2, i18, i17);
                u0Var2.f9432a = false;
                break;
        }
        return t8.z.f12851a;
    }
}

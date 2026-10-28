package r2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h2 implements q2.p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f11250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h9.n f11251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h9.a f11252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11253d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f7.q f11257h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l1 f11260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11261m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2 f11254e = new a2();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k2.e f11258i = new k2.e(g1.f11236c);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y1.p f11259j = new y1.p();
    public long k = y1.p0.f14946a;

    public h2(u uVar, h9.n nVar, h9.a aVar) {
        this.f11250a = uVar;
        this.f11251b = nVar;
        this.f11252c = aVar;
        l1 g2Var = Build.VERSION.SDK_INT >= 29 ? new g2() : new f2(uVar);
        g2Var.A();
        g2Var.u(false);
        this.f11260l = g2Var;
    }

    @Override // q2.p1
    public final void a(float[] fArr) {
        y1.a0.e(fArr, this.f11258i.c(this.f11260l));
    }

    @Override // q2.p1
    public final void b(h9.n nVar, h9.a aVar) {
        k2.e eVar = this.f11258i;
        eVar.f7202a = false;
        eVar.f7203b = false;
        eVar.f7205d = true;
        eVar.f7204c = true;
        y1.a0.d((float[]) eVar.f7208g);
        y1.a0.d((float[]) eVar.f7209h);
        l(false);
        this.f11255f = false;
        this.f11256g = false;
        this.k = y1.p0.f14946a;
        this.f11251b = nVar;
        this.f11252c = aVar;
    }

    @Override // q2.p1
    public final void c(x1.a aVar, boolean z10) {
        l1 l1Var = this.f11260l;
        k2.e eVar = this.f11258i;
        if (!z10) {
            float[] fArrC = eVar.c(l1Var);
            if (eVar.f7205d) {
                return;
            }
            y1.a0.c(fArrC, aVar);
            return;
        }
        float[] fArrB = eVar.b(l1Var);
        if (fArrB != null) {
            if (eVar.f7205d) {
                return;
            }
            y1.a0.c(fArrB, aVar);
        } else {
            aVar.f14517a = 0.0f;
            aVar.f14518b = 0.0f;
            aVar.f14519c = 0.0f;
            aVar.f14520d = 0.0f;
        }
    }

    @Override // q2.p1
    public final void d(y1.i0 i0Var) {
        h9.a aVar;
        int i7 = i0Var.f14903a | this.f11261m;
        int i10 = i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
        if (i10 != 0) {
            this.k = i0Var.f14912j;
        }
        l1 l1Var = this.f11260l;
        boolean zH = l1Var.H();
        a2 a2Var = this.f11254e;
        boolean z10 = false;
        boolean z11 = zH && a2Var.f11148g;
        if ((i7 & 1) != 0) {
            l1Var.l(i0Var.f14904b);
        }
        if ((i7 & 2) != 0) {
            l1Var.e(i0Var.f14905c);
        }
        if ((i7 & 4) != 0) {
            l1Var.h(i0Var.f14906d);
        }
        if ((i7 & 8) != 0) {
            l1Var.m();
        }
        if ((i7 & 16) != 0) {
            l1Var.i();
        }
        if ((i7 & 32) != 0) {
            l1Var.x(i0Var.f14907e);
        }
        if ((i7 & 64) != 0) {
            l1Var.F(y1.h0.C(i0Var.f14908f));
        }
        if ((i7 & 128) != 0) {
            l1Var.J(y1.h0.C(i0Var.f14909g));
        }
        if ((i7 & 1024) != 0) {
            l1Var.b(i0Var.f14910h);
        }
        if ((i7 & 256) != 0) {
            l1Var.g();
        }
        if ((i7 & 512) != 0) {
            l1Var.j();
        }
        if ((i7 & 2048) != 0) {
            l1Var.n(i0Var.f14911i);
        }
        if (i10 != 0) {
            l1Var.t(y1.p0.a(this.k) * l1Var.getWidth());
            l1Var.w(y1.p0.b(this.k) * l1Var.getHeight());
        }
        boolean z12 = i0Var.f14913l;
        y1.g0 g0Var = y1.h0.f14898a;
        boolean z13 = z12 && i0Var.k != g0Var;
        if ((i7 & 24576) != 0) {
            l1Var.I(z13);
            l1Var.u(i0Var.f14913l && i0Var.k == g0Var);
        }
        if ((131072 & i7) != 0) {
            l1Var.q();
        }
        if ((262144 & i7) != 0) {
            l1Var.k();
        }
        if ((524288 & i7) != 0) {
            l1Var.c(i0Var.f14917p);
        }
        if ((32768 & i7) != 0) {
            l1Var.E();
        }
        boolean zD = this.f11254e.d(i0Var.f14918q, i0Var.f14906d, z13, i0Var.f14907e, i0Var.f14914m);
        if (a2Var.f11147f) {
            l1Var.z(a2Var.b());
        }
        if (z13 && a2Var.f11148g) {
            z10 = true;
        }
        u uVar = this.f11250a;
        if (z11 != z10 || (z10 && zD)) {
            if (!this.f11253d && !this.f11255f) {
                uVar.invalidate();
                l(true);
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            ViewParent parent = uVar.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(uVar, uVar);
            }
        } else {
            uVar.invalidate();
        }
        if (!this.f11256g && l1Var.L() > 0.0f && (aVar = this.f11252c) != null) {
            aVar.invoke();
        }
        if ((i7 & 7963) != 0) {
            this.f11258i.e();
        }
        this.f11261m = i0Var.f14903a;
    }

    @Override // q2.p1
    public final void destroy() {
        l1 l1Var = this.f11260l;
        if (l1Var.f()) {
            l1Var.d();
        }
        this.f11251b = null;
        this.f11252c = null;
        this.f11255f = true;
        l(false);
        u uVar = this.f11250a;
        uVar.G = true;
        uVar.I(this);
    }

    @Override // q2.p1
    public final void e(y1.o oVar, b2.c cVar) {
        Canvas canvasA = y1.c.a(oVar);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        l1 l1Var = this.f11260l;
        if (zIsHardwareAccelerated) {
            k();
            boolean z10 = l1Var.L() > 0.0f;
            this.f11256g = z10;
            if (z10) {
                oVar.s();
            }
            l1Var.r(canvasA);
            if (this.f11256g) {
                oVar.i();
                return;
            }
            return;
        }
        float fS = l1Var.s();
        float fD = l1Var.D();
        float fG = l1Var.G();
        float fP = l1Var.p();
        if (l1Var.a() < 1.0f) {
            f7.q qVarH = this.f11257h;
            if (qVarH == null) {
                qVarH = y1.h0.h();
                this.f11257h = qVarH;
            }
            qVarH.i(l1Var.a());
            canvasA.saveLayer(fS, fD, fG, fP, (Paint) qVarH.f5447c);
        } else {
            oVar.h();
        }
        oVar.n(fS, fD);
        oVar.k(this.f11258i.c(l1Var));
        if (l1Var.H() || l1Var.C()) {
            this.f11254e.a(oVar);
        }
        h9.n nVar = this.f11251b;
        if (nVar != null) {
            nVar.invoke(oVar, null);
        }
        oVar.r();
        l(false);
    }

    @Override // q2.p1
    public final boolean f(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j5));
        l1 l1Var = this.f11260l;
        if (l1Var.C()) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) l1Var.getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) l1Var.getHeight());
        }
        if (l1Var.H()) {
            return this.f11254e.c(j5);
        }
        return true;
    }

    @Override // q2.p1
    public final long g(long j5, boolean z10) {
        l1 l1Var = this.f11260l;
        k2.e eVar = this.f11258i;
        if (!z10) {
            return !eVar.f7205d ? y1.a0.b(j5, eVar.c(l1Var)) : j5;
        }
        float[] fArrB = eVar.b(l1Var);
        if (fArrB == null) {
            return 9187343241974906880L;
        }
        return !eVar.f7205d ? y1.a0.b(j5, fArrB) : j5;
    }

    @Override // q2.p1
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo26getUnderlyingMatrixsQKQjiQ() {
        return this.f11258i.c(this.f11260l);
    }

    @Override // q2.p1
    public final void h(long j5) {
        int i7 = (int) (j5 >> 32);
        int i10 = (int) (j5 & 4294967295L);
        float fA = y1.p0.a(this.k) * i7;
        l1 l1Var = this.f11260l;
        l1Var.t(fA);
        l1Var.w(y1.p0.b(this.k) * i10);
        if (l1Var.v(l1Var.s(), l1Var.D(), l1Var.s() + i7, l1Var.D() + i10)) {
            l1Var.z(this.f11254e.b());
            if (!this.f11253d && !this.f11255f) {
                this.f11250a.invalidate();
                l(true);
            }
            this.f11258i.e();
        }
    }

    @Override // q2.p1
    public final void i(float[] fArr) {
        float[] fArrB = this.f11258i.b(this.f11260l);
        if (fArrB != null) {
            y1.a0.e(fArr, fArrB);
        }
    }

    @Override // q2.p1
    public final void invalidate() {
        if (this.f11253d || this.f11255f) {
            return;
        }
        this.f11250a.invalidate();
        l(true);
    }

    @Override // q2.p1
    public final void j(long j5) {
        l1 l1Var = this.f11260l;
        int iS = l1Var.s();
        int iD = l1Var.D();
        int i7 = (int) (j5 >> 32);
        int i10 = (int) (j5 & 4294967295L);
        if (iS == i7 && iD == i10) {
            return;
        }
        if (iS != i7) {
            l1Var.o(i7 - iS);
        }
        if (iD != i10) {
            l1Var.y(i10 - iD);
        }
        int i11 = Build.VERSION.SDK_INT;
        u uVar = this.f11250a;
        if (i11 >= 26) {
            ViewParent parent = uVar.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(uVar, uVar);
            }
        } else {
            uVar.invalidate();
        }
        this.f11258i.e();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    @Override // q2.p1
    public final void k() {
        y1.e0 e0Var;
        boolean z10 = this.f11253d;
        l1 l1Var = this.f11260l;
        if (z10 || !l1Var.f()) {
            if (l1Var.H()) {
                a2 a2Var = this.f11254e;
                if (a2Var.f11148g) {
                    a2Var.e();
                    e0Var = a2Var.f11146e;
                } else {
                    e0Var = null;
                }
            } else {
                e0Var = null;
            }
            h9.n nVar = this.f11251b;
            if (nVar != null) {
                l1Var.B(this.f11259j, e0Var, new b2.a(13, nVar));
            }
            l(false);
        }
    }

    public final void l(boolean z10) {
        if (z10 != this.f11253d) {
            this.f11253d = z10;
            this.f11250a.A(this, z10);
        }
    }
}

package z;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends f0 implements i2.d, q2.y1, q2.k {
    public h A;
    public final j2.d B;
    public final e1 C;
    public final h D;
    public final t1 E;
    public final e6.h F;
    public final f G;
    public y7.a H;
    public k1 I;
    public w0 J;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public x.h f15434z;

    public m1(b0.k kVar, x.h hVar, h hVar2, x0 x0Var, n1 n1Var, boolean z10, boolean z11) {
        super(androidx.compose.foundation.gestures.a.f793a, z10, kVar, x0Var);
        this.f15434z = hVar;
        this.A = hVar2;
        j2.d dVar = new j2.d();
        this.B = dVar;
        e1 e1Var = new e1();
        e1Var.f15356o = z10;
        A0(e1Var);
        this.C = e1Var;
        h hVar3 = new h(new v.s(new l0.o0(androidx.compose.foundation.gestures.a.f796d)));
        this.D = hVar3;
        x.h hVar4 = this.f15434z;
        h hVar5 = this.A;
        t1 t1Var = new t1(n1Var, hVar4, hVar5 == null ? hVar3 : hVar5, x0Var, z11, dVar, this, new v0.p(4, this));
        this.E = t1Var;
        e6.h hVar6 = new e6.h(t1Var, 5, z10);
        this.F = hVar6;
        f fVar = new f(x0Var, t1Var, z11);
        A0(fVar);
        this.G = fVar;
        A0(new j2.g(hVar6, dVar));
        A0(new w1.s(2, null, 4));
        i0.e eVar = new i0.e();
        eVar.f6580o = fVar;
        A0(eVar);
        s0.d dVar2 = new s0.d(10, this);
        x.d0 d0Var = new x.d0();
        d0Var.f14343o = dVar2;
        A0(d0Var);
    }

    @Override // q2.y1
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // z.f0
    public final Object H0(e0 e0Var, e0 e0Var2) {
        t1 t1Var = this.E;
        Object objF = t1Var.f(x.v0.f14492b, new b1.f(e0Var, t1Var, (y8.c) null, 18), e0Var2);
        return objF == z8.a.f15774a ? objF : t8.z.f12851a;
    }

    @Override // z.f0
    public final void I0(long j5) {
    }

    @Override // z.f0
    public final void J0(long j5) {
        cc.b0.s(this.B.c(), null, new k1(this, j5, null, 0), 3);
    }

    @Override // z.f0
    public final boolean K0() {
        t1 t1Var = this.E;
        if (t1Var.f15517a.a()) {
            return true;
        }
        x.h hVar = t1Var.f15518b;
        if (hVar == null) {
            return false;
        }
        x.b0 b0Var = hVar.f14373c;
        EdgeEffect edgeEffect = b0Var.f14317d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? x.k.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = b0Var.f14318e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? x.k.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = b0Var.f14319f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? x.k.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = b0Var.f14320g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? x.k.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final void M0(b0.k kVar, x.h hVar, h hVar2, x0 x0Var, n1 n1Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = true;
        boolean z14 = false;
        if (this.f15369s != z10) {
            this.F.f4442b = z10;
            this.C.f15356o = z10;
            z12 = true;
        } else {
            z12 = false;
        }
        h hVar3 = hVar2 == null ? this.D : hVar2;
        t1 t1Var = this.E;
        if (!i9.l.a(t1Var.f15517a, n1Var)) {
            t1Var.f15517a = n1Var;
            z14 = true;
        }
        t1Var.f15518b = hVar;
        if (t1Var.f15520d != x0Var) {
            t1Var.f15520d = x0Var;
            z14 = true;
        }
        if (t1Var.f15521e != z11) {
            t1Var.f15521e = z11;
        } else {
            z13 = z14;
        }
        t1Var.f15519c = hVar3;
        t1Var.f15522f = this.B;
        f fVar = this.G;
        fVar.f15358o = x0Var;
        fVar.f15360q = z11;
        this.f15434z = hVar;
        this.A = hVar2;
        x0 x0Var2 = t1Var.f15520d;
        x0 x0Var3 = x0.f15591a;
        if (x0Var2 != x0Var3) {
            x0Var3 = x0.f15592b;
        }
        L0(androidx.compose.foundation.gestures.a.f793a, z10, kVar, x0Var3, z13);
        if (z12) {
            this.H = null;
            this.I = null;
            q2.f.n(this);
        }
    }

    @Override // q2.y1
    public final void Y(y2.j jVar) {
        if (this.f15369s && (this.H == null || this.I == null)) {
            this.H = new y7.a(2, this);
            this.I = new k1(this, null);
        }
        y7.a aVar = this.H;
        if (aVar != null) {
            o9.u[] uVarArr = y2.t.f15077a;
            jVar.n(y2.i.f14989d, new y2.a(null, aVar));
        }
        k1 k1Var = this.I;
        if (k1Var != null) {
            o9.u[] uVarArr2 = y2.t.f15077a;
            jVar.n(y2.i.f14990e, k1Var);
        }
    }

    @Override // q2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // i2.d
    public final boolean j(KeyEvent keyEvent) {
        return false;
    }

    @Override // q2.y1
    public final /* synthetic */ boolean j0() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // z.f0, q2.v1
    public final void l0(k2.n nVar, k2.o oVar, long j5) {
        long j10;
        ?? r8 = nVar.f7264a;
        int size = r8.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((Boolean) this.f15368r.invoke((k2.v) r8.get(i7))).booleanValue()) {
                super.l0(nVar, oVar, j5);
                break;
            }
        }
        if (this.f15369s) {
            if (oVar == k2.o.f7269a && nVar.f7268e == 6) {
                if (this.J == null) {
                    this.J = new w0(this.E, new wb.b(ViewConfiguration.get(q2.f.x(this).getContext())), new n1.b(2, this, m1.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), q2.f.v(this).f10689x);
                }
                w0 w0Var = this.J;
                if (w0Var != null) {
                    cc.y yVarM0 = m0();
                    if (((cc.o1) w0Var.f15578g) == null) {
                        w0Var.f15578g = cc.b0.s(yVarM0, null, new b0.g(w0Var, (y8.c) null, 26), 3);
                    }
                }
            }
            w0 w0Var2 = this.J;
            if (w0Var2 == null || oVar != k2.o.f7270b) {
                return;
            }
            int i10 = nVar.f7268e;
            ?? r10 = nVar.f7264a;
            if (i10 == 6) {
                int size2 = r10.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (((k2.v) r10.get(i11)).b()) {
                        return;
                    }
                }
                wb.b bVar = (wb.b) w0Var2.f15574c;
                n3.c cVar = (n3.c) w0Var2.f15576e;
                ViewConfiguration viewConfiguration = (ViewConfiguration) bVar.f14284a;
                int i12 = Build.VERSION.SDK_INT;
                float f10 = -(i12 > 26 ? e4.k.e(viewConfiguration) : cVar.R(64));
                float f11 = -(i12 > 26 ? e4.k.b(viewConfiguration) : cVar.R(64));
                x1.b bVar2 = new x1.b(0L);
                int size3 = r10.size();
                int i13 = 0;
                while (true) {
                    j10 = bVar2.f14521a;
                    if (i13 >= size3) {
                        break;
                    }
                    bVar2 = new x1.b(x1.b.h(j10, ((k2.v) r10.get(i13)).f7287j));
                    i13++;
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) * f11)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10)));
                t1 t1Var = (t1) w0Var2.f15573b;
                float fG = t1Var.g(t1Var.e(jFloatToRawIntBits));
                if (fG == 0.0f ? false : fG > 0.0f ? t1Var.f15517a.d() : t1Var.f15517a.b() ? !(((ec.h) w0Var2.f15577f).x(new q0(jFloatToRawIntBits, ((k2.v) u8.p.k0(r10)).f7279b, false)) instanceof ec.n) : w0Var2.f15572a) {
                    int size4 = r10.size();
                    for (int i14 = 0; i14 < size4; i14++) {
                        ((k2.v) r10.get(i14)).a();
                    }
                }
            }
        }
    }

    @Override // r1.o
    public final boolean n0() {
        return false;
    }

    @Override // r1.o
    public final void q0() {
        if (this.f11129n) {
            n3.c cVar = q2.f.v(this).f10689x;
            h hVar = this.D;
            hVar.getClass();
            hVar.f15395a = new v.s(new l0.o0(cVar));
        }
        w0 w0Var = this.J;
        if (w0Var != null) {
            w0Var.f15576e = q2.f.v(this).f10689x;
        }
    }

    @Override // z.f0, r1.o
    public final void r0() {
        z();
        if (this.f11129n) {
            n3.c cVar = q2.f.v(this).f10689x;
            h hVar = this.D;
            hVar.getClass();
            hVar.f15395a = new v.s(new l0.o0(cVar));
        }
        w0 w0Var = this.J;
        if (w0Var != null) {
            w0Var.f15576e = q2.f.v(this).f10689x;
        }
    }

    @Override // i2.d
    public final boolean w(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.f15369s) {
            return false;
        }
        if ((!i2.a.a(i2.c.F(keyEvent), i2.a.f6597n) && !i2.a.a(i2.c.k(keyEvent.getKeyCode()), i2.a.f6596m)) || i2.c.K(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        x0 x0Var = this.E.f15520d;
        x0 x0Var2 = x0.f15591a;
        f fVar = this.G;
        if (x0Var == x0Var2) {
            int i7 = (int) (fVar.f15365v & 4294967295L);
            float f10 = i2.a.a(i2.c.k(keyEvent.getKeyCode()), i2.a.f6596m) ? i7 : -i7;
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        } else {
            int i10 = (int) (fVar.f15365v >> 32);
            jFloatToRawIntBits = Float.floatToRawIntBits(i2.a.a(i2.c.k(keyEvent.getKeyCode()), i2.a.f6596m) ? i10 : -i10);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        }
        cc.b0.s(m0(), null, new k1(this, (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L), null, 1), 3);
        return true;
    }
}

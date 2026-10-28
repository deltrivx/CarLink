package x;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import q2.b2;
import q2.d2;
import q2.v1;
import q2.y1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends q2.m implements v1, i2.d, y1, d2, q2.k, q2.l1 {
    public static final a1 J = new a1();
    public q2.l A;
    public b0.m B;
    public b0.h C;
    public final s.a0 D;
    public long E;
    public b0.k F;
    public boolean G;
    public cc.o1 H;
    public final a1 I;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b0.k f14349q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r0 f14350r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14351s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f14352t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public y2.g f14353u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14354v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h9.a f14355w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c0 f14356x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r0 f14357y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public k2.m0 f14358z;

    public f(b0.k kVar, r0 r0Var, boolean z10, boolean z11, String str, y2.g gVar, h9.a aVar) {
        this.f14349q = kVar;
        this.f14350r = r0Var;
        this.f14351s = z10;
        this.f14352t = str;
        this.f14353u = gVar;
        this.f14354v = z11;
        this.f14355w = aVar;
        this.f14356x = new c0(kVar, 0, new cc.d1(1, this, f.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 7));
        s.a0 a0Var = s.o.f12475a;
        this.D = new s.a0();
        this.E = 0L;
        b0.k kVar2 = this.f14349q;
        this.F = kVar2;
        this.G = kVar2 == null;
        this.I = J;
    }

    @Override // q2.y1
    public final /* synthetic */ boolean B() {
        return false;
    }

    public void D0(y2.j jVar) {
    }

    public abstract k2.m0 E0();

    public final boolean F0() {
        i9.t tVar = new i9.t();
        q2.f.y(this, z.e1.f15355p, new w0.r0(tVar, 1));
        if (!tVar.f6684a) {
            int i7 = s.f14473b;
            ViewParent parent = q2.f.x(this).getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!viewGroup.shouldDelayChildPressedState()) {
                    parent = viewGroup.getParent();
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[LOOP:0: B:13:0x002b->B:23:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x006a A[EDGE_INSN: B:27:0x006a->B:24:0x006a BREAK  A[LOOP:0: B:13:0x002b->B:23:0x0067], SYNTHETIC] */
    public final void G0() {
        b0.k kVar = this.f14349q;
        s.a0 a0Var = this.D;
        if (kVar != null) {
            b0.m mVar = this.B;
            if (mVar != null) {
                kVar.b(new b0.l(mVar));
            }
            b0.h hVar = this.C;
            if (hVar != null) {
                kVar.b(new b0.i(hVar));
            }
            Object[] objArr = a0Var.f12382c;
            long[] jArr = a0Var.f12380a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j5 = jArr[i7];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i7 != length) {
                            break;
                            break;
                        }
                        i7++;
                    } else {
                        int i10 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j5) < 128) {
                                kVar.b(new b0.l((b0.m) objArr[(i7 << 3) + i11]));
                            }
                            j5 >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        } else if (i7 != length) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
            }
        }
        this.B = null;
        this.C = null;
        a0Var.a();
    }

    public final void H0() {
        b0.k kVar = this.f14349q;
        if (kVar != null) {
            cc.o1 o1Var = this.H;
            if (o1Var == null || !o1Var.b()) {
                b0.m mVar = this.B;
                if (mVar != null) {
                    cc.b0.s(m0(), null, new c(mVar, kVar, null, 0), 3);
                }
            } else {
                cc.o1 o1Var2 = this.H;
                if (o1Var2 != null) {
                    o1Var2.a(null);
                }
            }
            this.B = null;
        }
    }

    @Override // q2.v1
    public final /* synthetic */ void I() {
    }

    public final void I0() {
        if (this.A != null) {
            return;
        }
        r0 r0Var = this.f14351s ? this.f14357y : this.f14350r;
        if (r0Var != null) {
            if (this.f14349q == null) {
                this.f14349q = new b0.k();
            }
            this.f14356x.F0(this.f14349q);
            b0.k kVar = this.f14349q;
            i9.l.b(kVar);
            q2.l lVarA = r0Var.a(kVar);
            A0(lVarA);
            this.A = lVarA;
        }
    }

    public void J0() {
    }

    public abstract boolean K0(KeyEvent keyEvent);

    public abstract void L0(KeyEvent keyEvent);

    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    public final void M0(b0.k kVar, r0 r0Var, boolean z10, boolean z11, String str, y2.g gVar, h9.a aVar) {
        boolean z12;
        boolean z13;
        q2.l lVar;
        if (i9.l.a(this.F, kVar)) {
            z12 = false;
        } else {
            G0();
            this.F = kVar;
            this.f14349q = kVar;
            z12 = true;
        }
        if (!i9.l.a(this.f14350r, r0Var)) {
            this.f14350r = r0Var;
            z12 = true;
        }
        if (this.f14351s != z10) {
            this.f14351s = z10;
            if (z10) {
                X();
            }
            z12 = true;
        }
        boolean z14 = this.f14354v;
        c0 c0Var = this.f14356x;
        if (z14 != z11) {
            if (z11) {
                A0(c0Var);
            } else {
                B0(c0Var);
                G0();
            }
            q2.f.n(this);
            this.f14354v = z11;
        }
        if (!i9.l.a(this.f14352t, str)) {
            this.f14352t = str;
            q2.f.n(this);
        }
        if (!i9.l.a(this.f14353u, gVar)) {
            this.f14353u = gVar;
            q2.f.n(this);
        }
        this.f14355w = aVar;
        boolean z15 = this.G;
        b0.k kVar2 = this.F;
        if (z15 != (kVar2 == null)) {
            boolean z16 = kVar2 == null;
            this.G = z16;
            z13 = (z16 || this.A != null) ? z12 : true;
        }
        if (z13 && ((lVar = this.A) != null || !this.G)) {
            if (lVar != null) {
                B0(lVar);
            }
            this.A = null;
            I0();
        }
        c0Var.F0(this.f14349q);
    }

    @Override // q2.l1
    public final void X() {
        if (this.f14351s) {
            q2.f.r(this, new a(this, 0));
        }
    }

    @Override // q2.y1
    public final void Y(y2.j jVar) {
        y2.g gVar = this.f14353u;
        if (gVar != null) {
            y2.t.b(jVar, gVar.f14983a);
        }
        String str = this.f14352t;
        a aVar = new a(this, 1);
        o9.u[] uVarArr = y2.t.f15077a;
        jVar.n(y2.i.f14987b, new y2.a(str, aVar));
        if (this.f14354v) {
            this.f14356x.Y(jVar);
        } else {
            jVar.n(y2.r.f15058i, t8.z.f12851a);
        }
        D0(jVar);
    }

    @Override // q2.v1
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // q2.v1
    public final void g0() {
        z();
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
    public final boolean j0() {
        return true;
    }

    @Override // q2.d2
    public final Object k() {
        return this.I;
    }

    @Override // q2.v1
    public void l0(k2.n nVar, k2.o oVar, long j5) {
        k2.m0 m0VarE0;
        long j10 = ((j5 >> 33) << 32) | (((j5 << 32) >> 33) & 4294967295L);
        this.E = (((long) Float.floatToRawIntBits((int) (j10 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j10 >> 32))) << 32);
        I0();
        if (this.f14354v && oVar == k2.o.f7270b) {
            int i7 = nVar.f7268e;
            y8.c cVar = null;
            if (i7 == 4) {
                cc.b0.s(m0(), null, new e(this, cVar, 0), 3);
            } else if (i7 == 5) {
                cc.b0.s(m0(), null, new e(this, cVar, 1), 3);
            }
        }
        if (this.f14358z == null && (m0VarE0 = E0()) != null) {
            A0(m0VarE0);
            this.f14358z = m0VarE0;
        }
        k2.m0 m0Var = this.f14358z;
        if (m0Var != null) {
            m0Var.l0(nVar, oVar, j5);
        }
    }

    @Override // q2.v1
    public final long m() {
        return b2.f10596a;
    }

    @Override // r1.o
    public final boolean n0() {
        return false;
    }

    @Override // r1.o
    public final void q0() {
        X();
        if (!this.G) {
            I0();
        }
        if (this.f14354v) {
            A0(this.f14356x);
        }
    }

    @Override // r1.o
    public final void r0() {
        z();
    }

    @Override // r1.o
    public final void s0() {
        G0();
        if (this.F == null) {
            this.f14349q = null;
        }
        q2.l lVar = this.A;
        if (lVar != null) {
            B0(lVar);
        }
        this.A = null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // i2.d
    public final boolean w(KeyEvent keyEvent) {
        boolean z10;
        I0();
        long jF = i2.c.F(keyEvent);
        boolean z11 = this.f14354v;
        s.a0 a0Var = this.D;
        if (z11 && i2.c.K(keyEvent) == 2 && androidx.compose.foundation.a.h(keyEvent)) {
            if (a0Var.b(jF)) {
                z10 = false;
            } else {
                b0.m mVar = new b0.m(this.E);
                a0Var.h(jF, mVar);
                if (this.f14349q != null) {
                    cc.b0.s(m0(), null, new d(this, mVar, null, 1), 3);
                }
                z10 = true;
            }
            if (K0(keyEvent) || z10) {
                return true;
            }
            return false;
        }
        if (this.f14354v && i2.c.K(keyEvent) == 1 && androidx.compose.foundation.a.h(keyEvent)) {
            b0.m mVar2 = (b0.m) a0Var.g(jF);
            if (mVar2 != null) {
                if (this.f14349q != null) {
                    cc.b0.s(m0(), null, new d(this, mVar2, null, 2), 3);
                }
                L0(keyEvent);
            }
            if (mVar2 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // q2.v1
    public void z() {
        b0.h hVar;
        b0.k kVar = this.f14349q;
        if (kVar != null && (hVar = this.C) != null) {
            kVar.b(new b0.i(hVar));
        }
        this.C = null;
        k2.m0 m0Var = this.f14358z;
        if (m0Var != null) {
            m0Var.z();
        }
    }
}

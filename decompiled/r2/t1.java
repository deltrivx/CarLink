package r2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t1 implements q2.p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b2.c f11428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1.v f11429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f11430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h9.n f11431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h9.a f11432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11434g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f11436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11437j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11440n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y1.h0 f11442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11443q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11444r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11446t;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f11435h = y1.a0.a();
    public n3.c k = i2.c.h();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n3.o f11438l = n3.o.f8749a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a2.c f11439m = new a2.c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f11441o = y1.p0.f14946a;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11445s = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b2.a f11447u = new b2.a(11, this);

    public t1(b2.c cVar, y1.v vVar, u uVar, h9.n nVar, h9.a aVar) {
        this.f11428a = cVar;
        this.f11429b = vVar;
        this.f11430c = uVar;
        this.f11431d = nVar;
        this.f11432e = aVar;
        long j5 = Integer.MAX_VALUE;
        this.f11433f = (j5 & 4294967295L) | (j5 << 32);
    }

    @Override // q2.p1
    public final void a(float[] fArr) {
        y1.a0.e(fArr, m());
    }

    @Override // q2.p1
    public final void b(h9.n nVar, h9.a aVar) {
        y1.v vVar = this.f11429b;
        if (vVar == null) {
            throw ob.a.o("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f11428a.f1214s) {
            n2.a.a("layer should have been released before reuse");
        }
        this.f11428a = vVar.b();
        this.f11434g = false;
        this.f11431d = nVar;
        this.f11432e = aVar;
        this.f11443q = false;
        this.f11444r = false;
        this.f11445s = true;
        y1.a0.d(this.f11435h);
        float[] fArr = this.f11436i;
        if (fArr != null) {
            y1.a0.d(fArr);
        }
        this.f11441o = y1.p0.f14946a;
        this.f11446t = false;
        long j5 = Integer.MAX_VALUE;
        this.f11433f = (j5 & 4294967295L) | (j5 << 32);
        this.f11442p = null;
        this.f11440n = 0;
    }

    @Override // q2.p1
    public final void c(x1.a aVar, boolean z10) {
        float[] fArrL = z10 ? l() : m();
        if (this.f11445s) {
            return;
        }
        if (fArrL != null) {
            y1.a0.c(fArrL, aVar);
            return;
        }
        aVar.f14517a = 0.0f;
        aVar.f14518b = 0.0f;
        aVar.f14519c = 0.0f;
        aVar.f14520d = 0.0f;
    }

    @Override // q2.p1
    public final void d(y1.i0 i0Var) {
        h9.a aVar;
        h9.a aVar2;
        int i7 = i0Var.f14903a | this.f11440n;
        this.f11438l = i0Var.f14916o;
        this.k = i0Var.f14915n;
        int i10 = i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
        if (i10 != 0) {
            this.f11441o = i0Var.f14912j;
        }
        if ((i7 & 1) != 0) {
            b2.c cVar = this.f11428a;
            float f10 = i0Var.f14904b;
            b2.e eVar = cVar.f1197a;
            if (eVar.o() != f10) {
                eVar.l(f10);
            }
        }
        if ((i7 & 2) != 0) {
            b2.c cVar2 = this.f11428a;
            float f11 = i0Var.f14905c;
            b2.e eVar2 = cVar2.f1197a;
            if (eVar2.M() != f11) {
                eVar2.e(f11);
            }
        }
        if ((i7 & 4) != 0) {
            b2.c cVar3 = this.f11428a;
            float f12 = i0Var.f14906d;
            b2.e eVar3 = cVar3.f1197a;
            if (eVar3.a() != f12) {
                eVar3.h(f12);
            }
        }
        if ((i7 & 8) != 0) {
            b2.e eVar4 = this.f11428a.f1197a;
            if (eVar4.E() != 0.0f) {
                eVar4.m();
            }
        }
        if ((i7 & 16) != 0) {
            b2.e eVar5 = this.f11428a.f1197a;
            if (eVar5.A() != 0.0f) {
                eVar5.i();
            }
        }
        boolean z10 = true;
        if ((i7 & 32) != 0) {
            b2.c cVar4 = this.f11428a;
            float f13 = i0Var.f14907e;
            b2.e eVar6 = cVar4.f1197a;
            if (eVar6.L() != f13) {
                eVar6.p(f13);
                cVar4.f1203g = true;
                cVar4.a();
            }
            if (i0Var.f14907e > 0.0f && !this.f11446t && (aVar2 = this.f11432e) != null) {
                aVar2.invoke();
            }
        }
        if ((i7 & 64) != 0) {
            b2.c cVar5 = this.f11428a;
            long j5 = i0Var.f14908f;
            b2.e eVar7 = cVar5.f1197a;
            if (!y1.q.c(j5, eVar7.y())) {
                eVar7.C(j5);
            }
        }
        if ((i7 & 128) != 0) {
            b2.c cVar6 = this.f11428a;
            long j10 = i0Var.f14909g;
            b2.e eVar8 = cVar6.f1197a;
            if (!y1.q.c(j10, eVar8.B())) {
                eVar8.I(j10);
            }
        }
        if ((i7 & 1024) != 0) {
            b2.c cVar7 = this.f11428a;
            float f14 = i0Var.f14910h;
            b2.e eVar9 = cVar7.f1197a;
            if (eVar9.w() != f14) {
                eVar9.b(f14);
            }
        }
        if ((i7 & 256) != 0) {
            b2.e eVar10 = this.f11428a.f1197a;
            if (eVar10.G() != 0.0f) {
                eVar10.g();
            }
        }
        if ((i7 & 512) != 0) {
            b2.e eVar11 = this.f11428a.f1197a;
            if (eVar11.u() != 0.0f) {
                eVar11.j();
            }
        }
        if ((i7 & 2048) != 0) {
            b2.c cVar8 = this.f11428a;
            float f15 = i0Var.f14911i;
            b2.e eVar12 = cVar8.f1197a;
            if (eVar12.D() != f15) {
                eVar12.n(f15);
            }
        }
        if (i10 != 0) {
            long j11 = this.f11441o;
            if (j11 == y1.p0.f14946a) {
                b2.c cVar9 = this.f11428a;
                if (!x1.b.b(cVar9.f1217v, 9205357640488583168L)) {
                    cVar9.f1217v = 9205357640488583168L;
                    cVar9.f1197a.x(9205357640488583168L);
                }
            } else {
                b2.c cVar10 = this.f11428a;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(y1.p0.b(this.f11441o) * ((int) (this.f11433f & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(y1.p0.a(j11) * ((int) (this.f11433f >> 32)))) << 32);
                if (!x1.b.b(cVar10.f1217v, jFloatToRawIntBits)) {
                    cVar10.f1217v = jFloatToRawIntBits;
                    cVar10.f1197a.x(jFloatToRawIntBits);
                }
            }
        }
        if ((i7 & 16384) != 0) {
            b2.c cVar11 = this.f11428a;
            boolean z11 = i0Var.f14913l;
            if (cVar11.f1218w != z11) {
                cVar11.f1218w = z11;
                cVar11.f1203g = true;
                cVar11.a();
            }
        }
        if ((131072 & i7) != 0) {
            b2.e eVar13 = this.f11428a.f1197a;
        }
        if ((262144 & i7) != 0) {
            b2.e eVar14 = this.f11428a.f1197a;
            if (!i9.l.a(eVar14.s(), null)) {
                eVar14.k();
            }
        }
        if ((524288 & i7) != 0) {
            b2.c cVar12 = this.f11428a;
            int i11 = i0Var.f14917p;
            b2.e eVar15 = cVar12.f1197a;
            if (eVar15.N() != i11) {
                eVar15.c(i11);
            }
        }
        if ((32768 & i7) != 0) {
            b2.e eVar16 = this.f11428a.f1197a;
            if (eVar16.r() != 0) {
                eVar16.H(0);
            }
        }
        if ((i7 & 7963) != 0) {
            this.f11443q = true;
            this.f11444r = true;
        }
        if (i9.l.a(this.f11442p, i0Var.f14918q)) {
            z10 = false;
        } else {
            y1.h0 h0Var = i0Var.f14918q;
            this.f11442p = h0Var;
            if (h0Var != null) {
                b2.c cVar13 = this.f11428a;
                if (h0Var instanceof y1.c0) {
                    x1.c cVar14 = ((y1.c0) h0Var).f14880e;
                    float f16 = cVar14.f14523a;
                    float f17 = cVar14.f14524b;
                    cVar13.f(0.0f, (((long) Float.floatToRawIntBits(f17)) & 4294967295L) | (Float.floatToRawIntBits(f16) << 32), (((long) Float.floatToRawIntBits(cVar14.f14525c - f16)) << 32) | (((long) Float.floatToRawIntBits(cVar14.f14526d - f17)) & 4294967295L));
                } else if (h0Var instanceof y1.b0) {
                    y1.e0 e0Var = ((y1.b0) h0Var).f14878e;
                    cVar13.k = null;
                    cVar13.f1205i = 9205357640488583168L;
                    cVar13.f1204h = 0L;
                    cVar13.f1206j = 0.0f;
                    cVar13.f1203g = true;
                    cVar13.f1209n = false;
                    cVar13.f1207l = e0Var;
                    cVar13.a();
                } else {
                    if (!(h0Var instanceof y1.d0)) {
                        throw new cc.s();
                    }
                    y1.d0 d0Var = (y1.d0) h0Var;
                    y1.h hVar = d0Var.f14883f;
                    if (hVar != null) {
                        cVar13.k = null;
                        cVar13.f1205i = 9205357640488583168L;
                        cVar13.f1204h = 0L;
                        cVar13.f1206j = 0.0f;
                        cVar13.f1203g = true;
                        cVar13.f1209n = false;
                        cVar13.f1207l = hVar;
                        cVar13.a();
                    } else {
                        x1.d dVar = d0Var.f14882e;
                        cVar13.f(Float.intBitsToFloat((int) (dVar.f14534h >> 32)), (((long) Float.floatToRawIntBits(dVar.f14528b)) & 4294967295L) | (((long) Float.floatToRawIntBits(dVar.f14527a)) << 32), (((long) Float.floatToRawIntBits(dVar.b())) << 32) | (((long) Float.floatToRawIntBits(dVar.a())) & 4294967295L));
                    }
                }
                if ((h0Var instanceof y1.b0) && Build.VERSION.SDK_INT < 33 && (aVar = this.f11432e) != null) {
                    aVar.invoke();
                }
            }
        }
        this.f11440n = i0Var.f14903a;
        if (i7 != 0 || z10) {
            int i12 = Build.VERSION.SDK_INT;
            u uVar = this.f11430c;
            if (i12 >= 26) {
                ViewParent parent = uVar.getParent();
                if (parent != null) {
                    parent.onDescendantInvalidated(uVar, uVar);
                }
            } else {
                uVar.invalidate();
            }
            if (uVar.f11453f) {
                uVar.Q(0.0f);
            }
        }
    }

    @Override // q2.p1
    public final void destroy() {
        this.f11431d = null;
        this.f11432e = null;
        this.f11434g = true;
        boolean z10 = this.f11437j;
        u uVar = this.f11430c;
        if (z10) {
            this.f11437j = false;
            uVar.A(this, false);
        }
        y1.v vVar = this.f11429b;
        if (vVar != null) {
            vVar.a(this.f11428a);
            uVar.I(this);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // q2.p1
    public final void e(y1.o oVar, b2.c cVar) {
        boolean z10;
        k();
        this.f11446t = this.f11428a.f1197a.L() > 0.0f;
        a2.c cVar2 = this.f11439m;
        a2.b bVar = cVar2.f16b;
        bVar.Y(oVar);
        bVar.f13c = cVar;
        b2.c cVar3 = this.f11428a;
        y1.o oVarZ = cVar2.W().z();
        b2.c cVar4 = (b2.c) cVar2.W().f13c;
        b2.e eVar = cVar3.f1197a;
        if (cVar3.f1214s) {
            return;
        }
        cVar3.a();
        if (!eVar.f()) {
            try {
                cVar3.f1197a.z(cVar3.f1198b, cVar3.f1199c, cVar3, cVar3.f1201e);
            } catch (Throwable unused) {
            }
        }
        boolean z11 = eVar.L() > 0.0f;
        if (z11) {
            oVarZ.s();
        }
        Canvas canvasA = y1.c.a(oVarZ);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j5 = cVar3.f1215t;
            float f10 = (int) (j5 >> 32);
            float f11 = (int) (j5 & 4294967295L);
            long j10 = cVar3.f1216u;
            float f12 = ((int) (j10 >> 32)) + f10;
            float f13 = f11 + ((int) (j10 & 4294967295L));
            float fA = eVar.a();
            y1.k kVarS = eVar.s();
            int iN = eVar.N();
            if (fA < 1.0f || iN != 3 || kVarS != null || eVar.r() == 1) {
                f7.q qVarH = cVar3.f1211p;
                if (qVarH == null) {
                    qVarH = y1.h0.h();
                    cVar3.f1211p = qVarH;
                }
                qVarH.i(fA);
                qVarH.j(iN);
                qVarH.l(kVarS);
                canvasA.saveLayer(f10, f11, f12, f13, (Paint) qVarH.f5447c);
            } else {
                canvasA.save();
            }
            canvasA.translate(f10, f11);
            canvasA.concat(eVar.J());
        }
        boolean z12 = !zIsHardwareAccelerated && cVar3.f1218w;
        if (z12) {
            oVarZ.h();
            y1.h0 h0VarD = cVar3.d();
            if (h0VarD instanceof y1.c0) {
                oVarZ.e(((y1.c0) h0VarD).f14880e);
            } else if (h0VarD instanceof y1.d0) {
                y1.h hVarA = cVar3.f1208m;
                if (hVarA != null) {
                    hVarA.f14895a.rewind();
                } else {
                    hVarA = y1.j.a();
                    cVar3.f1208m = hVarA;
                }
                ob.a.i(hVarA, ((y1.d0) h0VarD).f14882e);
                oVarZ.j(hVarA);
            } else {
                if (!(h0VarD instanceof y1.b0)) {
                    throw new cc.s();
                }
                oVarZ.j(((y1.b0) h0VarD).f14878e);
            }
        }
        if (cVar4 != null) {
            b1.q qVar = cVar4.f1213r;
            if (!qVar.f1181a) {
                y1.y.a("Only add dependencies during a tracking");
            }
            s.i0 i0Var = (s.i0) qVar.f1184d;
            if (i0Var != null) {
                i0Var.a(cVar3);
            } else if (((b2.c) qVar.f1182b) != null) {
                s.i0 i0Var2 = s.p0.f12478a;
                s.i0 i0Var3 = new s.i0();
                b2.c cVar5 = (b2.c) qVar.f1182b;
                i9.l.b(cVar5);
                i0Var3.a(cVar5);
                i0Var3.a(cVar3);
                qVar.f1184d = i0Var3;
                qVar.f1182b = null;
            } else {
                qVar.f1182b = cVar3;
            }
            s.i0 i0Var4 = (s.i0) qVar.f1185e;
            if (i0Var4 != null) {
                z10 = !i0Var4.l(cVar3);
            } else if (((b2.c) qVar.f1183c) != cVar3) {
                z10 = true;
            } else {
                qVar.f1183c = null;
                z10 = false;
            }
            if (z10) {
                cVar3.f1212q++;
            }
        }
        if (y1.c.a(oVarZ).isHardwareAccelerated() || eVar.K()) {
            eVar.v(oVarZ);
        } else {
            a2.c cVar6 = cVar3.f1210o;
            if (cVar6 == null) {
                cVar6 = new a2.c();
                cVar3.f1210o = cVar6;
            }
            a2.b bVar2 = cVar6.f16b;
            n3.c cVar7 = cVar3.f1198b;
            n3.o oVar2 = cVar3.f1199c;
            long jM0 = n3.n.M0(cVar3.f1216u);
            n3.c cVarC = bVar2.C();
            n3.o oVarH = bVar2.H();
            y1.o oVarZ2 = bVar2.z();
            long J = bVar2.J();
            b2.c cVar8 = (b2.c) bVar2.f13c;
            bVar2.Z(cVar7);
            bVar2.a0(oVar2);
            bVar2.Y(oVarZ);
            bVar2.b0(jM0);
            bVar2.f13c = cVar3;
            oVarZ.h();
            try {
                cVar3.c(cVar6);
                oVarZ.r();
                bVar2.Z(cVarC);
                bVar2.a0(oVarH);
                bVar2.Y(oVarZ2);
                bVar2.b0(J);
                bVar2.f13c = cVar8;
            } catch (Throwable th) {
                oVarZ.r();
                bVar2.Z(cVarC);
                bVar2.a0(oVarH);
                bVar2.Y(oVarZ2);
                bVar2.b0(J);
                bVar2.f13c = cVar8;
                throw th;
            }
        }
        if (z12) {
            oVarZ.r();
        }
        if (z11) {
            oVarZ.i();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasA.restore();
    }

    @Override // q2.p1
    public final boolean f(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        b2.c cVar = this.f11428a;
        if (cVar.f1218w) {
            return j0.q(cVar.d(), fIntBitsToFloat, fIntBitsToFloat2);
        }
        return true;
    }

    @Override // q2.p1
    public final long g(long j5, boolean z10) {
        float[] fArrM;
        if (z10) {
            fArrM = l();
            if (fArrM == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrM = m();
        }
        return this.f11445s ? j5 : y1.a0.b(j5, fArrM);
    }

    @Override // q2.p1
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo26getUnderlyingMatrixsQKQjiQ() {
        return m();
    }

    @Override // q2.p1
    public final void h(long j5) {
        if (n3.m.a(j5, this.f11433f)) {
            return;
        }
        u uVar = this.f11430c;
        if (uVar.f11453f) {
            uVar.Q(-4.0f);
        }
        this.f11433f = j5;
        if (this.f11437j || this.f11434g) {
            return;
        }
        uVar.invalidate();
        if (true != this.f11437j) {
            this.f11437j = true;
            uVar.A(this, true);
        }
    }

    @Override // q2.p1
    public final void i(float[] fArr) {
        float[] fArrL = l();
        if (fArrL != null) {
            y1.a0.e(fArr, fArrL);
        }
    }

    @Override // q2.p1
    public final void invalidate() {
        if (this.f11437j || this.f11434g) {
            return;
        }
        u uVar = this.f11430c;
        uVar.invalidate();
        if (true != this.f11437j) {
            this.f11437j = true;
            uVar.A(this, true);
        }
    }

    @Override // q2.p1
    public final void j(long j5) {
        u uVar = this.f11430c;
        if (uVar.f11453f) {
            uVar.Q(-4.0f);
        }
        b2.c cVar = this.f11428a;
        if (!n3.j.a(cVar.f1215t, j5)) {
            cVar.f1215t = j5;
            cVar.f1197a.t((int) (j5 >> 32), (int) (j5 & 4294967295L), cVar.f1216u);
        }
        if (Build.VERSION.SDK_INT < 26) {
            uVar.invalidate();
            return;
        }
        ViewParent parent = uVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(uVar, uVar);
        }
    }

    @Override // q2.p1
    public final void k() {
        if (this.f11437j) {
            if (this.f11441o != y1.p0.f14946a && !n3.m.a(this.f11428a.f1216u, this.f11433f)) {
                b2.c cVar = this.f11428a;
                float fA = y1.p0.a(this.f11441o) * ((int) (this.f11433f >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(y1.p0.b(this.f11441o) * ((int) (this.f11433f & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fA) << 32);
                if (!x1.b.b(cVar.f1217v, jFloatToRawIntBits)) {
                    cVar.f1217v = jFloatToRawIntBits;
                    cVar.f1197a.x(jFloatToRawIntBits);
                }
            }
            b2.c cVar2 = this.f11428a;
            n3.c cVar3 = this.k;
            n3.o oVar = this.f11438l;
            long j5 = this.f11433f;
            long j10 = cVar2.f1216u;
            b2.e eVar = cVar2.f1197a;
            if (!n3.m.a(j10, j5)) {
                cVar2.f1216u = j5;
                long j11 = cVar2.f1215t;
                eVar.t((int) (j11 >> 32), (int) (4294967295L & j11), j5);
                if (cVar2.f1205i == 9205357640488583168L) {
                    cVar2.f1203g = true;
                    cVar2.a();
                }
            }
            cVar2.f1198b = cVar3;
            cVar2.f1199c = oVar;
            cVar2.f1200d = this.f11447u;
            eVar.z(cVar3, oVar, cVar2, cVar2.f1201e);
            if (this.f11437j) {
                this.f11437j = false;
                this.f11430c.A(this, false);
            }
        }
    }

    public final float[] l() {
        float[] fArrA = this.f11436i;
        if (fArrA == null) {
            fArrA = y1.a0.a();
            this.f11436i = fArrA;
        }
        if (this.f11444r) {
            this.f11444r = false;
            float[] fArrM = m();
            if (this.f11445s) {
                return fArrM;
            }
            if (!j0.p(fArrM, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] m() {
        boolean z10 = this.f11443q;
        float[] fArr = this.f11435h;
        if (z10) {
            b2.c cVar = this.f11428a;
            long jX = cVar.f1217v;
            b2.e eVar = cVar.f1197a;
            if ((9223372034707292159L & jX) == 9205357640488583168L) {
                jX = n3.l.x(n3.n.M0(this.f11433f));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jX >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jX & 4294967295L));
            float fE = eVar.E();
            float fA = eVar.A();
            float fG = eVar.G();
            float fU = eVar.u();
            float fW = eVar.w();
            float fO = eVar.o();
            float fM = eVar.M();
            double d10 = ((double) fG) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d10);
            float fCos = (float) Math.cos(d10);
            float f10 = -fSin;
            float f11 = (fA * fCos) - (1.0f * fSin);
            float f12 = (1.0f * fCos) + (fA * fSin);
            double d11 = ((double) fU) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d11);
            float fCos2 = (float) Math.cos(d11);
            float f13 = -fSin2;
            float f14 = fSin * fSin2;
            float f15 = fSin * fCos2;
            float f16 = fCos * fSin2;
            float f17 = fCos * fCos2;
            float f18 = (f12 * fSin2) + (fE * fCos2);
            float f19 = (f12 * fCos2) + ((-fE) * fSin2);
            double d12 = ((double) fW) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d12);
            float fCos3 = (float) Math.cos(d12);
            float f20 = -fSin3;
            float f21 = (fCos3 * f14) + (f20 * fCos2);
            float f22 = (f14 * fSin3) + (fCos2 * fCos3);
            float f23 = fSin3 * fCos;
            float f24 = f22 * fO;
            float f25 = f23 * fO;
            float f26 = ((fSin3 * f15) + (fCos3 * f13)) * fO;
            float f27 = f21 * fM;
            float f28 = fCos * fCos3 * fM;
            float f29 = ((fCos3 * f15) + (f20 * f13)) * fM;
            float f30 = f16 * 1.0f;
            float f31 = f10 * 1.0f;
            float f32 = f17 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f24;
                fArr[1] = f25;
                fArr[2] = f26;
                fArr[3] = 0.0f;
                fArr[4] = f27;
                fArr[5] = f28;
                fArr[6] = f29;
                fArr[7] = 0.0f;
                fArr[8] = f30;
                fArr[9] = f31;
                fArr[10] = f32;
                fArr[11] = 0.0f;
                float f33 = -fIntBitsToFloat;
                fArr[12] = ((f24 * f33) - (fIntBitsToFloat2 * f27)) + f18 + fIntBitsToFloat;
                fArr[13] = ((f25 * f33) - (fIntBitsToFloat2 * f28)) + f11 + fIntBitsToFloat2;
                fArr[14] = ((f33 * f26) - (fIntBitsToFloat2 * f29)) + f19;
                fArr[15] = 1.0f;
            }
            this.f11443q = false;
            this.f11445s = y1.h0.p(fArr);
        }
        return fArr;
    }
}

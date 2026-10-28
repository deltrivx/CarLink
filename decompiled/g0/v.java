package g0;

import b3.b0;
import f1.b1;
import f1.k1;
import f1.w0;
import h0.f0;
import h0.i0;
import h0.z;
import q2.h0;
import z.n1;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v implements n1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final u0.k f5737w = o1.k.b(new g(1), new b0(19));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0.a f5738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f5740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0.r f5741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f5742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0.k f5743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f5744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z.j f5745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h0 f5747j;
    public final f0.s k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0.e f5748l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f5749m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h0.k f5750n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i0 f5751o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a2.d f5752p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f0 f5753q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b1 f5754r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b1 f5755s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k1 f5756t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final k1 f5757u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u0.k f5758v;

    public v(int i7, int i10) {
        f0.a aVar = new f0.a();
        aVar.f4748a = -1;
        aVar.f4752e = new h1.e(new h0.h0[16]);
        aVar.f4750c = -1;
        this.f5738a = aVar;
        this.f5741d = new f0.r(i7, i10, 1);
        this.f5742e = new k1(x.f5759a, w0.f5184c);
        this.f5743f = new b0.k();
        this.f5745h = new z.j(new c8.k(10, this));
        this.f5746i = true;
        this.k = new f0.s(this, 1);
        this.f5748l = new h0.e();
        this.f5749m = new androidx.compose.foundation.lazy.layout.b();
        this.f5750n = new h0.k(0);
        this.f5751o = new i0(new t(this, i7));
        this.f5752p = new a2.d(19, this);
        this.f5753q = new f0();
        this.f5754r = z.h();
        this.f5755s = z.h();
        Boolean bool = Boolean.FALSE;
        this.f5756t = f1.b.s(bool);
        this.f5757u = f1.b.s(bool);
        this.f5758v = new u0.k(11);
    }

    @Override // z.n1
    public final boolean a() {
        return this.f5745h.a();
    }

    @Override // z.n1
    public final boolean b() {
        return ((Boolean) this.f5757u.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r5.f5745h.c(r6, r7, r0) == r4) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // z.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(x.v0 r6, h9.n r7, a9.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof g0.u
            if (r0 == 0) goto L13
            r0 = r8
            g0.u r0 = (g0.u) r0
            int r1 = r0.f5736e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5736e = r1
            goto L18
        L13:
            g0.u r0 = new g0.u
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f5734c
            int r1 = r0.f5736e
            r2 = 2
            r3 = 1
            z8.a r4 = z8.a.f15774a
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            t8.a.e(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            a9.i r6 = r0.f5733b
            r7 = r6
            h9.n r7 = (h9.n) r7
            x.v0 r6 = r0.f5732a
            t8.a.e(r8)
            goto L52
        L3d:
            t8.a.e(r8)
            r0.f5732a = r6
            r8 = r7
            a9.i r8 = (a9.i) r8
            r0.f5733b = r8
            r0.f5736e = r3
            h0.e r8 = r5.f5748l
            java.lang.Object r8 = r8.i(r0)
            if (r8 != r4) goto L52
            goto L61
        L52:
            r8 = 0
            r0.f5732a = r8
            r0.f5733b = r8
            r0.f5736e = r2
            z.j r8 = r5.f5745h
            java.lang.Object r6 = r8.c(r6, r7, r0)
            if (r6 != r4) goto L62
        L61:
            return r4
        L62:
            t8.z r6 = t8.z.f12851a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.v.c(x.v0, h9.n, a9.c):java.lang.Object");
    }

    @Override // z.n1
    public final boolean d() {
        return ((Boolean) this.f5756t.getValue()).booleanValue();
    }

    @Override // z.n1
    public final float e(float f10) {
        return this.f5745h.e(f10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(n nVar, boolean z10, boolean z11) {
        o oVar;
        o oVar2;
        ?? r8 = nVar.f5686m;
        int i7 = nVar.f5689p;
        int i10 = nVar.f5676b;
        p pVar = nVar.f5675a;
        this.f5751o.f6327e = r8.size();
        if (!z10 && this.f5739b) {
            this.f5740c = nVar;
            return;
        }
        if (z10) {
            this.f5739b = true;
        }
        this.f5744g -= nVar.f5678d;
        this.f5742e.setValue(nVar);
        this.f5757u.setValue(Boolean.valueOf(((pVar != null ? pVar.f5710a : 0) == 0 && i10 == 0) ? false : true));
        this.f5756t.setValue(Boolean.valueOf(nVar.f5677c));
        f0.r rVar = this.f5741d;
        if (z11) {
            rVar.getClass();
            if (!(((float) i10) >= 0.0f)) {
                c0.b.c("scrollOffset should be non-negative");
            }
            rVar.f4840c.g(i10);
        } else {
            rVar.getClass();
            rVar.f4842e = (pVar == null || (oVar2 = (o) u8.l.x0(pVar.f5711b)) == null) ? null : oVar2.f5694b;
            if (rVar.f4841d || i7 > 0) {
                rVar.f4841d = true;
                if (!(((float) i10) >= 0.0f)) {
                    c0.b.c("scrollOffset should be non-negative (" + i10 + ')');
                }
                rVar.a((pVar == null || (oVar = (o) u8.l.x0(pVar.f5711b)) == null) ? 0 : oVar.f5693a, i10);
            }
            if (this.f5746i) {
                f0.a aVar = this.f5738a;
                h1.e eVar = (h1.e) aVar.f4752e;
                int i11 = aVar.f4748a;
                boolean z12 = aVar.f4749b;
                if (i11 != -1 && !r8.isEmpty() && i11 != f0.a.c(nVar, z12)) {
                    aVar.f4748a = -1;
                    Object[] objArr = eVar.f6421a;
                    int i12 = eVar.f6423c;
                    for (int i13 = 0; i13 < i12; i13++) {
                        ((h0.h0) objArr[i13]).cancel();
                    }
                    eVar.h();
                }
                int i14 = aVar.f4750c;
                if (i14 != -1 && aVar.f4751d != 0.0f && i14 != i7 && !r8.isEmpty()) {
                    int iC = f0.a.c(nVar, aVar.f4751d < 0.0f);
                    int iA = f0.a.a(nVar, aVar.f4751d < 0.0f);
                    if (iA >= 0 && iA < i7 && iC != aVar.f4748a && iC >= 0) {
                        aVar.f4748a = iC;
                        eVar.h();
                        eVar.d(eVar.f6423c, this.f5752p.z(iC));
                    }
                }
                aVar.f4750c = i7;
            }
        }
        if (z10) {
            this.f5758v.h1(nVar.f5680f, nVar.f5683i, nVar.f5682h);
        }
    }

    public final n g() {
        return (n) this.f5742e.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f10, n nVar) {
        if (this.f5746i) {
            f0.a aVar = this.f5738a;
            h1.e eVar = (h1.e) aVar.f4752e;
            if (!nVar.f5686m.isEmpty()) {
                int i7 = 0;
                boolean z10 = f10 < 0.0f;
                int iC = f0.a.c(nVar, z10);
                int iA = f0.a.a(nVar, z10);
                if (iA >= 0) {
                    x0 x0Var = nVar.f5690q;
                    ?? r8 = nVar.f5686m;
                    if (iA < nVar.f5689p) {
                        if (iC != aVar.f4748a && iC >= 0) {
                            if (aVar.f4749b != z10) {
                                Object[] objArr = eVar.f6421a;
                                int i10 = eVar.f6423c;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((h0.h0) objArr[i11]).cancel();
                                }
                            }
                            aVar.f4749b = z10;
                            aVar.f4748a = iC;
                            eVar.h();
                            eVar.d(eVar.f6423c, this.f5752p.z(iC));
                        }
                        if (z10) {
                            o oVar = (o) u8.p.s0(r8);
                            if (((a.a.M(oVar, x0Var) + ((int) (x0Var == x0.f15591a ? oVar.f5705n & 4294967295L : oVar.f5705n >> 32))) + nVar.f5692s) - nVar.f5688o < (-f10)) {
                                Object[] objArr2 = eVar.f6421a;
                                int i12 = eVar.f6423c;
                                while (i7 < i12) {
                                    ((h0.h0) objArr2[i7]).a();
                                    i7++;
                                }
                            }
                        } else if (nVar.f5687n - a.a.M((o) u8.p.k0(r8), x0Var) < f10) {
                            Object[] objArr3 = eVar.f6421a;
                            int i13 = eVar.f6423c;
                            while (i7 < i13) {
                                ((h0.h0) objArr3[i7]).a();
                                i7++;
                            }
                        }
                    }
                }
            }
            aVar.f4751d = f10;
        }
    }
}

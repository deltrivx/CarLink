package f0;

import a8.c1;
import b3.a0;
import b3.b0;
import cc.o1;
import f1.b1;
import f1.k1;
import f1.w0;
import h0.f0;
import h0.i0;
import h0.z;
import q2.h0;
import x.v0;
import z.n1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u implements n1 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final u0.k f4851x = o1.k.b(new a0(29), new b0(16));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f4852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f4854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f4856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f4857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0.k f4858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f4859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z.j f4860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f4861j;
    public h0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f4862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h0.e f4863m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f4864n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h0.k f4865o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i0 f4866p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a2.d f4867q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f0 f4868r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b1 f4869s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k1 f4870t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final k1 f4871u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b1 f4872v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u0.k f4873w;

    public u(int i7, int i10) {
        a aVar = new a();
        aVar.f4748a = -1;
        aVar.f4750c = -1;
        this.f4852a = aVar;
        this.f4856e = new r(i7, i10, 0);
        this.f4857f = new k1(w.f4874a, w0.f5184c);
        this.f4858g = new b0.k();
        this.f4860i = new z.j(new c8.k(4, this));
        this.f4861j = true;
        this.f4862l = new s(this, 0);
        this.f4863m = new h0.e();
        this.f4864n = new androidx.compose.foundation.lazy.layout.b();
        this.f4865o = new h0.k(0);
        this.f4866p = new i0(new d8.g(this, i7));
        this.f4867q = new a2.d(10, this);
        this.f4868r = new f0();
        this.f4869s = z.h();
        Boolean bool = Boolean.FALSE;
        this.f4870t = f1.b.s(bool);
        this.f4871u = f1.b.s(bool);
        this.f4872v = z.h();
        this.f4873w = new u0.k(11);
    }

    public static Object i(u uVar, int i7, a9.i iVar) {
        uVar.getClass();
        Object objC = uVar.c(v0.f14491a, new c1(uVar, i7, null, 15), iVar);
        return objC == z8.a.f15774a ? objC : t8.z.f12851a;
    }

    @Override // z.n1
    public final boolean a() {
        return this.f4860i.a();
    }

    @Override // z.n1
    public final boolean b() {
        return ((Boolean) this.f4871u.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r5.f4860i.c(r6, r7, r0) == r4) goto L21;
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
            boolean r0 = r8 instanceof f0.t
            if (r0 == 0) goto L13
            r0 = r8
            f0.t r0 = (f0.t) r0
            int r1 = r0.f4850e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4850e = r1
            goto L18
        L13:
            f0.t r0 = new f0.t
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f4848c
            int r1 = r0.f4850e
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
            a9.i r6 = r0.f4847b
            r7 = r6
            h9.n r7 = (h9.n) r7
            x.v0 r6 = r0.f4846a
            t8.a.e(r8)
            goto L52
        L3d:
            t8.a.e(r8)
            r0.f4846a = r6
            r8 = r7
            a9.i r8 = (a9.i) r8
            r0.f4847b = r8
            r0.f4850e = r3
            h0.e r8 = r5.f4863m
            java.lang.Object r8 = r8.i(r0)
            if (r8 != r4) goto L52
            goto L61
        L52:
            r8 = 0
            r0.f4846a = r8
            r0.f4847b = r8
            r0.f4850e = r2
            z.j r8 = r5.f4860i
            java.lang.Object r6 = r8.c(r6, r7, r0)
            if (r6 != r4) goto L62
        L61:
            return r4
        L62:
            t8.z r6 = t8.z.f12851a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.u.c(x.v0, h9.n, a9.c):java.lang.Object");
    }

    @Override // z.n1
    public final boolean d() {
        return ((Boolean) this.f4870t.getValue()).booleanValue();
    }

    @Override // z.n1
    public final float e(float f10) {
        return this.f4860i.e(f10);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(o oVar, boolean z10, boolean z11) {
        ?? r8 = oVar.k;
        int i7 = oVar.f4818n;
        int i10 = oVar.f4807b;
        p pVar = oVar.f4806a;
        this.f4866p.f6327e = r8.size();
        u0.k kVar = this.f4873w;
        r rVar = this.f4856e;
        if (!z10 && this.f4853b) {
            this.f4854c = oVar;
            p1.f fVarH = n4.e.h();
            h9.k kVarE = fVarH != null ? fVarH.e() : null;
            p1.f fVarK = n4.e.k(fVarH);
            try {
                if (((Number) ((v.k) kVar.f12991c).f13387b.getValue()).floatValue() != 0.0f && pVar != null && pVar.f4822a == rVar.f4839b.f() && i10 == rVar.f4840c.f()) {
                    o1 o1Var = (o1) kVar.f12990b;
                    if (o1Var != null) {
                        o1Var.a(null);
                    }
                    kVar.f12991c = new v.k(v.d.f13345j, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                n4.e.r(fVarH, fVarK, kVarE);
            }
        }
        if (z10) {
            this.f4853b = true;
        }
        this.f4871u.setValue(Boolean.valueOf(((pVar != null ? pVar.f4822a : 0) == 0 && i10 == 0) ? false : true));
        this.f4870t.setValue(Boolean.valueOf(oVar.f4808c));
        this.f4859h -= oVar.f4809d;
        this.f4857f.setValue(oVar);
        if (z11) {
            rVar.getClass();
            if (!(((float) i10) >= 0.0f)) {
                c0.b.c("scrollOffset should be non-negative");
            }
            rVar.f4840c.g(i10);
        } else {
            p pVar2 = (p) u8.p.m0(r8);
            p pVar3 = (p) u8.p.t0(r8);
            n3.n.P0("firstVisibleItem:index", pVar2 != null ? pVar2.f4822a : -1L);
            n3.n.P0("lastVisibleItem:index", pVar3 != null ? pVar3.f4822a : -1L);
            rVar.getClass();
            rVar.f4842e = pVar != null ? pVar.f4828g : null;
            if (rVar.f4841d || i7 > 0) {
                rVar.f4841d = true;
                if (!(((float) i10) >= 0.0f)) {
                    c0.b.c("scrollOffset should be non-negative");
                }
                rVar.a(pVar != null ? pVar.f4822a : 0, i10);
            }
            if (this.f4861j) {
                a aVar = this.f4852a;
                int i11 = aVar.f4748a;
                boolean z12 = aVar.f4749b;
                if (i11 != -1 && !r8.isEmpty() && i11 != a.b(oVar, z12)) {
                    aVar.f4748a = -1;
                    h0.h0 h0Var = (h0.h0) aVar.f4752e;
                    if (h0Var != null) {
                        h0Var.cancel();
                    }
                    aVar.f4752e = null;
                }
                int i12 = aVar.f4750c;
                if (i12 != -1 && aVar.f4751d != 0.0f && i12 != i7 && !r8.isEmpty()) {
                    int iB = a.b(oVar, aVar.f4751d < 0.0f);
                    if (iB >= 0 && iB < i7) {
                        aVar.f4748a = iB;
                        aVar.f4752e = a2.f.P(this.f4867q, iB);
                    }
                }
                aVar.f4750c = i7;
            }
        }
        if (z10) {
            kVar.h1(oVar.f4811f, oVar.f4814i, oVar.f4813h);
        }
    }

    public final o g() {
        return (o) this.f4857f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f10, o oVar) {
        h0.h0 h0Var;
        h0.h0 h0Var2;
        if (this.f4861j) {
            ?? r8 = oVar.k;
            ?? r10 = oVar.k;
            boolean zIsEmpty = r8.isEmpty();
            a aVar = this.f4852a;
            if (!zIsEmpty) {
                boolean z10 = f10 < 0.0f;
                int iB = a.b(oVar, z10);
                if (iB >= 0 && iB < oVar.f4818n) {
                    if (iB != aVar.f4748a) {
                        if (aVar.f4749b != z10) {
                            aVar.f4748a = -1;
                            h0.h0 h0Var3 = (h0.h0) aVar.f4752e;
                            if (h0Var3 != null) {
                                h0Var3.cancel();
                            }
                            aVar.f4752e = null;
                        }
                        aVar.f4749b = z10;
                        aVar.f4748a = iB;
                        aVar.f4752e = a2.f.P(this.f4867q, iB);
                    }
                    if (z10) {
                        p pVar = (p) u8.p.s0(r10);
                        if (((pVar.f4831j + pVar.k) + oVar.f4821q) - oVar.f4817m < (-f10) && (h0Var2 = (h0.h0) aVar.f4752e) != null) {
                            h0Var2.a();
                        }
                    } else if (oVar.f4816l - ((p) u8.p.k0(r10)).f4831j < f10 && (h0Var = (h0.h0) aVar.f4752e) != null) {
                        h0Var.a();
                    }
                }
            }
            aVar.f4751d = f10;
        }
    }
}

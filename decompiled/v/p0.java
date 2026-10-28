package v;

import f1.g1;
import f1.i1;
import f1.k1;
import f1.o2;
import f1.w2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f13423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f13424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f13425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f13426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f13427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g1 f13428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k1 f13430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p f13431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i1 f13432j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g0 f13433l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s0 f13434m;

    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.Map] */
    public p0(s0 s0Var, Object obj, p pVar, w0 w0Var) {
        this.f13434m = s0Var;
        this.f13423a = w0Var;
        k1 k1VarS = f1.b.s(obj);
        this.f13424b = k1VarS;
        Object objInvoke = null;
        k1 k1VarS2 = f1.b.s(d.j(7, null));
        this.f13425c = k1VarS2;
        this.f13426d = f1.b.s(new m0((v) k1VarS2.getValue(), w0Var, obj, k1VarS.getValue(), pVar));
        this.f13427e = f1.b.s(Boolean.TRUE);
        this.f13428f = new g1(-1.0f);
        this.f13430h = f1.b.s(obj);
        this.f13431i = pVar;
        this.f13432j = new i1(b().b());
        Float f10 = (Float) z0.f13482a.get(w0Var);
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            p pVar2 = (p) w0Var.f13471a.invoke(obj);
            int iB = pVar2.b();
            for (int i7 = 0; i7 < iB; i7++) {
                pVar2.e(fFloatValue, i7);
            }
            objInvoke = this.f13423a.f13472b.invoke(pVar2);
        }
        this.f13433l = d.j(3, objInvoke);
    }

    public final m0 b() {
        return (m0) this.f13426d.getValue();
    }

    public final void c(Object obj, boolean z10) {
        s0 s0Var = this.f13434m;
        k1 k1Var = s0Var.f13455f;
        k1 k1Var2 = this.f13424b;
        boolean zA = i9.l.a(null, k1Var2.getValue());
        i1 i1Var = this.f13432j;
        k1 k1Var3 = this.f13426d;
        v vVar = this.f13433l;
        if (zA) {
            k1Var3.setValue(new m0(vVar, this.f13423a, obj, obj, this.f13431i.c()));
            this.f13429g = true;
            i1Var.f(b().b());
            return;
        }
        k1 k1Var4 = this.f13425c;
        if (!z10 || this.k || (((v) k1Var4.getValue()) instanceof g0)) {
            vVar = (v) k1Var4.getValue();
        }
        k1Var3.setValue(new m0(s0Var.d() <= 0 ? vVar : new h0(vVar, s0Var.d()), this.f13423a, obj, k1Var2.getValue(), this.f13431i));
        i1Var.f(b().b());
        this.f13429g = false;
        k1Var.setValue(Boolean.TRUE);
        if (((Boolean) s0Var.f13458i.getValue()).booleanValue()) {
            p1.p pVar = s0Var.f13456g;
            int size = pVar.size();
            long jMax = 0;
            for (int i7 = 0; i7 < size; i7++) {
                p0 p0Var = (p0) pVar.get(i7);
                i1 i1Var2 = p0Var.f13432j;
                k1 k1Var5 = p0Var.f13430h;
                jMax = Math.max(jMax, ((o2) p1.l.u(i1Var2.f4984b, i1Var2)).f5076c);
                if (p0Var.f13428f.f() == -1.0f) {
                    p0Var.k = true;
                    if (i9.l.a(p0Var.b().f13405c, p0Var.b().f13406d)) {
                        k1Var5.setValue(p0Var.b().f13405c);
                    } else {
                        k1Var5.setValue(p0Var.b().f(0L));
                        p0Var.f13431i = p0Var.b().d(0L);
                    }
                }
            }
            k1Var.setValue(Boolean.FALSE);
        }
    }

    @Override // f1.w2
    public final Object getValue() {
        return this.f13430h.getValue();
    }

    public final String toString() {
        return "current value: " + this.f13430h.getValue() + ", target: " + this.f13424b.getValue() + ", spec: " + ((v) this.f13425c.getValue());
    }
}

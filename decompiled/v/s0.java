package v;

import f1.i1;
import f1.k1;
import f1.o2;
import f1.w1;
import f1.w2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0.k f13450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f13451b = f1.b.s(c());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f13452c = f1.b.s(new o0(c(), c()));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f13453d = new i1(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f13454e = new i1(Long.MIN_VALUE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f13455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p1.p f13456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p1.p f13457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f13458i;

    public s0(Enum r8) {
        this.f13450a = new u0.k(r8);
        Boolean bool = Boolean.FALSE;
        this.f13455f = f1.b.s(bool);
        this.f13456g = new p1.p();
        this.f13457h = new p1.p();
        this.f13458i = f1.b.s(bool);
        f1.b.o(new n0(this, 1));
    }

    public final void a(Enum r11, f1.s sVar, int i7) {
        sVar.Y(-1493585151);
        int i10 = (i7 & 6) == 0 ? ((i7 & 8) == 0 ? sVar.f(r11) : sVar.h(r11) ? 4 : 2) | i7 : i7;
        if ((i7 & 48) == 0) {
            i10 |= sVar.f(this) ? 32 : 16;
        }
        if (!sVar.N(i10 & 1, (i10 & 19) != 18)) {
            sVar.Q();
        } else if (((Boolean) this.f13458i.getValue()).booleanValue()) {
            sVar.W(467781377);
            sVar.p(false);
        } else {
            sVar.W(466120769);
            k1 k1Var = this.f13451b;
            if (!i9.l.a(k1Var.getValue(), r11)) {
                this.f13452c.setValue(new o0(k1Var.getValue(), r11));
                if (!i9.l.a(c(), k1Var.getValue())) {
                    ((k1) this.f13450a.f12991c).setValue(k1Var.getValue());
                }
                k1Var.setValue(r11);
                i1 i1Var = this.f13454e;
                if (!(((o2) p1.l.u(i1Var.f4984b, i1Var)).f5076c != Long.MIN_VALUE)) {
                    this.f13455f.setValue(Boolean.TRUE);
                }
                p1.p pVar = this.f13456g;
                int size = pVar.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((p0) pVar.get(i11)).f13428f.g(-2.0f);
                }
            }
            int i12 = i10 & 112;
            boolean z10 = i12 == 32;
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (z10 || objK == w0Var) {
                objK = f1.b.o(new n0(this, 0));
                sVar.h0(objK);
            }
            if (((Boolean) ((w2) objK).getValue()).booleanValue()) {
                sVar.W(466528884);
                Object objK2 = sVar.K();
                if (objK2 == w0Var) {
                    objK2 = f1.b.l(sVar);
                    sVar.h0(objK2);
                }
                cc.y yVar = (cc.y) objK2;
                boolean zH = sVar.h(yVar) | (i12 == 32);
                Object objK3 = sVar.K();
                if (zH || objK3 == w0Var) {
                    objK3 = new c8.p(16, yVar, this);
                    sVar.h0(objK3);
                }
                f1.b.d(yVar, this, (h9.k) objK3, sVar);
                sVar.p(false);
            } else {
                sVar.W(467771457);
                sVar.p(false);
            }
            sVar.p(false);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new f0.h(i7, 7, this, r11);
        }
    }

    public final long b() {
        p1.p pVar = this.f13456g;
        int size = pVar.size();
        long jMax = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i1 i1Var = ((p0) pVar.get(i7)).f13432j;
            jMax = Math.max(jMax, ((o2) p1.l.u(i1Var.f4984b, i1Var)).f5076c);
        }
        p1.p pVar2 = this.f13457h;
        int size2 = pVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            jMax = Math.max(jMax, ((s0) pVar2.get(i10)).b());
        }
        return jMax;
    }

    public final Object c() {
        return ((k1) this.f13450a.f12991c).getValue();
    }

    public final long d() {
        i1 i1Var = this.f13453d;
        return ((o2) p1.l.u(i1Var.f4984b, i1Var)).f5076c;
    }

    public final o0 e() {
        return (o0) this.f13452c.getValue();
    }

    public final void f(long j5, boolean z10) {
        i1 i1Var = this.f13454e;
        long j10 = ((o2) p1.l.u(i1Var.f4984b, i1Var)).f5076c;
        u0.k kVar = this.f13450a;
        if (j10 == Long.MIN_VALUE) {
            i1Var.f(j5);
            ((k1) kVar.f12990b).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((k1) kVar.f12990b).getValue()).booleanValue()) {
            ((k1) kVar.f12990b).setValue(Boolean.TRUE);
        }
        this.f13455f.setValue(Boolean.FALSE);
        p1.p pVar = this.f13456g;
        int size = pVar.size();
        boolean z11 = true;
        for (int i7 = 0; i7 < size; i7++) {
            p0 p0Var = (p0) pVar.get(i7);
            k1 k1Var = p0Var.f13427e;
            k1 k1Var2 = p0Var.f13427e;
            if (!((Boolean) k1Var.getValue()).booleanValue()) {
                long jB = z10 ? p0Var.b().b() : j5;
                p0Var.f13430h.setValue(p0Var.b().f(jB));
                p0Var.f13431i = p0Var.b().d(jB);
                m0 m0VarB = p0Var.b();
                m0VarB.getClass();
                if (ob.a.b(m0VarB, jB)) {
                    k1Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) k1Var2.getValue()).booleanValue()) {
                z11 = false;
            }
        }
        p1.p pVar2 = this.f13457h;
        int size2 = pVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            s0 s0Var = (s0) pVar2.get(i10);
            if (!i9.l.a(s0Var.f13451b.getValue(), s0Var.c())) {
                s0Var.f(j5, z10);
            }
            if (!i9.l.a(s0Var.f13451b.getValue(), s0Var.c())) {
                z11 = false;
            }
        }
        if (z11) {
            g();
        }
    }

    public final void g() {
        this.f13454e.f(Long.MIN_VALUE);
        u0.k kVar = this.f13450a;
        if (ob.a.A(kVar)) {
            ((k1) kVar.f12991c).setValue(this.f13451b.getValue());
        }
        this.f13453d.f(0L);
        ((k1) kVar.f12990b).setValue(Boolean.FALSE);
        p1.p pVar = this.f13457h;
        int size = pVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((s0) pVar.get(i7)).g();
        }
    }

    public final String toString() {
        p1.p pVar = this.f13456g;
        int size = pVar.size();
        String str = "Transition animation values: ";
        for (int i7 = 0; i7 < size; i7++) {
            str = str + ((p0) pVar.get(i7)) + ", ";
        }
        return str;
    }
}

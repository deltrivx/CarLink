package rc;

import o9.e0;
import pc.m0;
import pc.q0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e6.h f12358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qc.b f12359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f12360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s[] f12361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n4.e f12362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final oa.r f12363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f12365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f12366i;

    public s(e6.h hVar, qc.b bVar, v vVar, s[] sVarArr) {
        i9.l.e(hVar, "composer");
        i9.l.e(bVar, "json");
        this.f12358a = hVar;
        this.f12359b = bVar;
        this.f12360c = vVar;
        this.f12361d = sVarArr;
        this.f12362e = bVar.f11034b;
        this.f12363f = bVar.f11033a;
        int iOrdinal = vVar.ordinal();
        if (sVarArr != null) {
            s sVar = sVarArr[iOrdinal];
            if (sVar == null && sVar == this) {
                return;
            }
            sVarArr[iOrdinal] = this;
        }
    }

    public final s a(nc.e eVar) {
        s sVar;
        i9.l.e(eVar, "descriptor");
        qc.b bVar = this.f12359b;
        v vVarN = j.n(eVar, bVar);
        char c10 = vVarN.f12376a;
        e6.h hVar = this.f12358a;
        hVar.d(c10);
        hVar.f4442b = true;
        String str = this.f12365h;
        if (str != null) {
            String strH = this.f12366i;
            if (strH == null) {
                strH = eVar.h();
            }
            hVar.a();
            r(str);
            hVar.d(':');
            r(strH);
            this.f12365h = null;
            this.f12366i = null;
        }
        if (this.f12360c == vVarN) {
            return this;
        }
        s[] sVarArr = this.f12361d;
        return (sVarArr == null || (sVar = sVarArr[vVarN.ordinal()]) == null) ? new s(hVar, bVar, vVarN, sVarArr) : sVar;
    }

    public final void b(boolean z10) {
        if (this.f12364g) {
            r(String.valueOf(z10));
        } else {
            ((j.g) this.f12358a.f4443c).k(String.valueOf(z10));
        }
    }

    public final void c(nc.e eVar, int i7, boolean z10) {
        i9.l.e(eVar, "descriptor");
        h(eVar, i7);
        b(z10);
    }

    public final void d(byte b10) {
        if (this.f12364g) {
            r(String.valueOf((int) b10));
        } else {
            this.f12358a.c(b10);
        }
    }

    public final void e(char c10) {
        r(String.valueOf(c10));
    }

    public final void f(double d10) {
        boolean z10 = this.f12364g;
        e6.h hVar = this.f12358a;
        if (z10) {
            r(String.valueOf(d10));
        } else {
            ((j.g) hVar.f4443c).k(String.valueOf(d10));
        }
        this.f12363f.getClass();
        if (Math.abs(d10) > Double.MAX_VALUE) {
            throw j.b(Double.valueOf(d10), ((j.g) hVar.f4443c).toString());
        }
    }

    public final void g(nc.e eVar, int i7, double d10) {
        i9.l.e(eVar, "descriptor");
        h(eVar, i7);
        f(d10);
    }

    public final void h(nc.e eVar, int i7) {
        i9.l.e(eVar, "descriptor");
        int iOrdinal = this.f12360c.ordinal();
        e6.h hVar = this.f12358a;
        boolean z10 = true;
        if (iOrdinal == 1) {
            if (!hVar.f4442b) {
                hVar.d(',');
            }
            hVar.a();
            return;
        }
        if (iOrdinal == 2) {
            if (hVar.f4442b) {
                this.f12364g = true;
                hVar.a();
                return;
            }
            if (i7 % 2 == 0) {
                hVar.d(',');
                hVar.a();
            } else {
                hVar.d(':');
                hVar.j();
                z10 = false;
            }
            this.f12364g = z10;
            return;
        }
        if (iOrdinal == 3) {
            if (i7 == 0) {
                this.f12364g = true;
            }
            if (i7 == 1) {
                hVar.d(',');
                hVar.j();
                this.f12364g = false;
                return;
            }
            return;
        }
        if (!hVar.f4442b) {
            hVar.d(',');
        }
        hVar.a();
        qc.b bVar = this.f12359b;
        i9.l.e(bVar, "json");
        j.l(eVar, bVar);
        r(eVar.l(i7));
        hVar.d(':');
        hVar.j();
    }

    public final void i(float f10) {
        boolean z10 = this.f12364g;
        e6.h hVar = this.f12358a;
        if (z10) {
            r(String.valueOf(f10));
        } else {
            ((j.g) hVar.f4443c).k(String.valueOf(f10));
        }
        this.f12363f.getClass();
        if (Math.abs(f10) > Float.MAX_VALUE) {
            throw j.b(Float.valueOf(f10), ((j.g) hVar.f4443c).toString());
        }
    }

    public final s j(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
        boolean zA = t.a(eVar);
        v vVar = this.f12360c;
        qc.b bVar = this.f12359b;
        e6.h eVar2 = this.f12358a;
        if (zA) {
            if (!(eVar2 instanceof f)) {
                eVar2 = new f((j.g) eVar2.f4443c, this.f12364g);
            }
            return new s(eVar2, bVar, vVar, null);
        }
        if (eVar.g() && eVar.equals(qc.k.f11042a)) {
            if (!(eVar2 instanceof e)) {
                eVar2 = new e((j.g) eVar2.f4443c, this.f12364g);
            }
            return new s(eVar2, bVar, vVar, null);
        }
        if (this.f12365h != null) {
            this.f12366i = eVar.h();
        }
        return this;
    }

    public final s k(q0 q0Var, int i7) {
        i9.l.e(q0Var, "descriptor");
        h(q0Var, i7);
        return j(q0Var.n(i7));
    }

    public final void l(int i7) {
        if (this.f12364g) {
            r(String.valueOf(i7));
        } else {
            this.f12358a.e(i7);
        }
    }

    public final void m(int i7, int i10, nc.e eVar) {
        i9.l.e(eVar, "descriptor");
        h(eVar, i7);
        l(i10);
    }

    public final void n(long j5) {
        if (this.f12364g) {
            r(String.valueOf(j5));
        } else {
            this.f12358a.f(j5);
        }
    }

    public final void o(nc.e eVar, int i7, mc.a aVar, Object obj) {
        i9.l.e(eVar, "descriptor");
        i9.l.e(aVar, "serializer");
        h(eVar, i7);
        p(aVar, obj);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    public final void p(mc.a aVar, Object obj) {
        String strH;
        i9.l.e(aVar, "serializer");
        qc.b bVar = this.f12359b;
        oa.r rVar = bVar.f11033a;
        rVar.getClass();
        qc.a aVar2 = (qc.a) rVar.f9626f;
        boolean z10 = aVar instanceof mc.d;
        if (!z10) {
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    n4.h hVarF = aVar.d().f();
                    strH = (i9.l.a(hVarF, nc.i.f9090c) || i9.l.a(hVarF, nc.i.f9093f)) ? j.h(aVar.d(), bVar) : null;
                } else if (iOrdinal != 2) {
                    throw new cc.s();
                }
            }
        } else if (aVar2 != qc.a.f11029a) {
        }
        if (z10) {
            mc.d dVar = (mc.d) aVar;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + dVar.d() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            mc.a aVarV = e0.v(dVar, this, obj);
            if (strH != null) {
                if (z10 && m0.d(aVarV.d()).contains(strH)) {
                    String strH2 = ((mc.d) aVar).d().h();
                    throw new IllegalStateException(("Sealed class '" + aVarV.d().h() + "' cannot be serialized as base class '" + strH2 + "' because it has property name that conflicts with JSON class discriminator '" + strH + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
                }
                n4.h hVarF2 = aVarV.d().f();
                i9.l.e(hVarF2, "kind");
                if (hVarF2 instanceof nc.h) {
                    throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                }
                if (hVarF2 instanceof nc.d) {
                    throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                }
                if (hVarF2 instanceof nc.b) {
                    throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
                }
            }
            aVar = aVarV;
        }
        if (strH != null) {
            String strH3 = aVar.d().h();
            this.f12365h = strH;
            this.f12366i = strH3;
        }
        aVar.a(this, obj);
    }

    public final void q(short s2) {
        if (this.f12364g) {
            r(String.valueOf((int) s2));
        } else {
            this.f12358a.h(s2);
        }
    }

    public final void r(String str) {
        i9.l.e(str, "value");
        this.f12358a.i(str);
    }

    public final void s(nc.e eVar, int i7, String str) {
        i9.l.e(eVar, "descriptor");
        i9.l.e(str, "value");
        h(eVar, i7);
        r(str);
    }

    public final void t(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
        e6.h hVar = this.f12358a;
        hVar.getClass();
        hVar.f4442b = false;
        hVar.d(this.f12360c.f12377b);
    }

    public final boolean u(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
        this.f12363f.getClass();
        return false;
    }
}

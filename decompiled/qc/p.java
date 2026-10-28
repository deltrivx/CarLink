package qc;

import e4.b0;
import pc.g1;
import pc.s0;
import pc.t0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f11048a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0 f11049b;

    static {
        nc.c cVar = nc.c.k;
        if (zb.j.B0("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((k1.i) t0.f10508a.values()).iterator();
        while (((b0) it).hasNext()) {
            mc.a aVar = (mc.a) ((v8.c) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(aVar.d().h())) {
                throw new IllegalArgumentException(zb.k.g0("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + i9.y.f6689a.b(aVar.getClass()).l() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f11049b = new s0("kotlinx.serialization.json.JsonLiteral", cVar);
    }

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        Double dValueOf;
        o oVar = (o) obj;
        i9.l.e(oVar, "value");
        String str = oVar.f11047b;
        n3.u.h(sVar);
        if (oVar.f11046a) {
            sVar.r(str);
            return;
        }
        Long lQ0 = zb.q.q0(str);
        if (lQ0 != null) {
            sVar.n(lQ0.longValue());
            return;
        }
        t8.u uVarK = n3.u.K(str);
        if (uVarK != null) {
            sVar.j(g1.f10451b).n(uVarK.f12846a);
            return;
        }
        Boolean bool = null;
        try {
            dValueOf = zb.p.h0(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        } catch (NumberFormatException unused) {
        }
        if (dValueOf != null) {
            sVar.f(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            sVar.b(bool.booleanValue());
        } else {
            sVar.r(str);
        }
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        j jVarG = n3.u.k(bVar).g();
        if (jVarG instanceof o) {
            return (o) jVarG;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw rc.j.e(ob.a.p(i9.y.f6689a, jVarG.getClass(), sb2), jVarG.toString(), -1);
    }

    @Override // mc.a
    public final nc.e d() {
        return f11049b;
    }
}

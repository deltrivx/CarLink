package r9;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class t1 extends i9.z {
    public static e0 j(i9.d dVar) {
        o9.e eVarF = dVar.f();
        return eVarF instanceof e0 ? (e0) eVarF : d.f11671b;
    }

    @Override // i9.z
    public final o9.f a(i9.j jVar) {
        return new g0(j(jVar), jVar.f6674d, jVar.f6675e, null, jVar.f6672b);
    }

    @Override // i9.z
    public final o9.c b(Class cls) {
        return c.a(cls);
    }

    @Override // i9.z
    public final o9.e c(Class cls) {
        Object objPutIfAbsent;
        android.support.v4.media.session.r rVar = c.f11664a;
        i9.l.e(cls, "jClass");
        android.support.v4.media.session.r rVar2 = c.f11665b;
        rVar2.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) rVar2.f605c;
        Object objInvoke = concurrentHashMap.get(cls);
        if (objInvoke == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, (objInvoke = ((h9.k) rVar2.f604b).invoke(cls)))) != null) {
            objInvoke = objPutIfAbsent;
        }
        return (o9.e) objInvoke;
    }

    @Override // i9.z
    public final o9.i d(d1.j jVar) {
        return new i0(j(jVar), jVar.f6674d, jVar.f6675e, jVar.f6672b);
    }

    @Override // i9.z
    public final o9.k e(i9.o oVar) {
        return new k0(j(oVar), oVar.f6674d, oVar.f6675e, oVar.f6672b);
    }

    @Override // i9.z
    public final o9.r f(c1.q0 q0Var) {
        return new y0(j(q0Var), q0Var.f6674d, q0Var.f6675e, q0Var.f6672b);
    }

    @Override // i9.z
    public final o9.t g(i9.r rVar) {
        return new b1(j(rVar), rVar.f6674d, rVar.f6675e, rVar.f6672b);
    }

    @Override // i9.z
    public final String h(i9.i iVar) throws IOException {
        g0 g0VarB;
        Metadata metadata = (Metadata) iVar.getClass().getAnnotation(Metadata.class);
        g0 g0Var = null;
        if (metadata != null) {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                String[] strArrD2 = metadata.d2();
                xa.g gVar = va.g.f13718a;
                i9.l.e(strArrD2, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(va.a.a(strArrD1));
                xa.g gVar2 = va.g.f13718a;
                va.f fVarG = va.g.g(byteArrayInputStream, strArrD2);
                xa.g gVar3 = va.g.f13718a;
                ra.a aVar = ra.a0.f11802w;
                aVar.getClass();
                xa.e eVar = new xa.e(byteArrayInputStream);
                xa.a aVar2 = (xa.a) aVar.a(eVar, gVar3);
                try {
                    eVar.a(0);
                    xa.b.b(aVar2);
                    ra.a0 a0Var = (ra.a0) aVar2;
                    ta.e eVar2 = new ta.e(metadata.mv(), (metadata.xi() & 8) != 0);
                    Class<?> cls = iVar.getClass();
                    ra.y0 y0Var = a0Var.f11816p;
                    i9.l.d(y0Var, "getTypeTable(...)");
                    g0Var = new g0(d.f11671b, (aa.s0) x1.f(cls, a0Var, fVarG, new aa.f0(y0Var), eVar2, q9.a.f10988i));
                } catch (xa.q e7) {
                    e7.f14823a = aVar2;
                    throw e7;
                }
            }
        }
        if (g0Var == null || (g0VarB = x1.b(g0Var)) == null) {
            return super.h(iVar);
        }
        ya.g gVar4 = u1.f11769a;
        x9.t tVarQ = g0VarB.j();
        StringBuilder sb2 = new StringBuilder();
        u1.a(sb2, tVarQ);
        List listX = tVarQ.X();
        i9.l.d(listX, "getValueParameters(...)");
        u8.p.p0(listX, sb2, ", ", "(", ")", b.f11658i, 48);
        sb2.append(" -> ");
        nb.w wVarP = tVarQ.p();
        i9.l.b(wVarP);
        sb2.append(u1.d(wVarP));
        return sb2.toString();
    }

    @Override // i9.z
    public final String i(i9.n nVar) {
        return h(nVar);
    }
}

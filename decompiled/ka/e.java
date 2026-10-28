package ka;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f7414b;

    public /* synthetic */ e(f fVar, int i7) {
        this.f7413a = i7;
        this.f7414b = fVar;
    }

    @Override // h9.a
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        switch (this.f7413a) {
            case 0:
                return da.d.a(g5.a.L(g5.a.G(this.f7414b.f7417b.f3868a))).a();
            case 1:
                f fVar = this.f7414b;
                wa.c cVarA = fVar.a();
                da.e eVar = fVar.f7417b;
                da.a aVar = fVar.f7416a;
                if (cVarA == null) {
                    return pb.l.c(pb.k.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, eVar.toString());
                }
                ja.a aVar2 = (ja.a) aVar.f3847b;
                x9.y yVar = aVar2.f6977o;
                x9.e eVarB = w9.e.b(cVarA, yVar.k());
                if (eVarB == null) {
                    da.o oVar = new da.o(g5.a.L(g5.a.G(eVar.f3868a)));
                    a2.d dVar = aVar2.k;
                    dVar.getClass();
                    a2.d dVar2 = (a2.d) dVar.f20b;
                    if (dVar2 == null) {
                        i9.l.j("resolver");
                        throw null;
                    }
                    eVarB = dVar2.x(oVar);
                    if (eVarB == null) {
                        eVarB = x9.v.f(yVar, new wa.b(cVarA.b(), cVarA.f14240a.f()), aVar2.f6967d.c().f7028l);
                    }
                }
                return eVarB.n();
            default:
                f fVar2 = this.f7414b;
                ArrayList<na.a> arrayListB = fVar2.f7417b.b();
                ArrayList arrayList = new ArrayList();
                for (na.a aVar3 : arrayListB) {
                    wa.e eVar2 = ((da.f) aVar3).f3870a;
                    if (eVar2 == null) {
                        eVar2 = ga.y.f6127b;
                    }
                    bb.g gVarC = fVar2.c(aVar3);
                    t8.j jVar = gVarC != null ? new t8.j(eVar2, gVarC) : null;
                    if (jVar != null) {
                        arrayList.add(jVar);
                    }
                }
                return u8.b0.Z0(arrayList);
        }
    }
}

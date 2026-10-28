package ka;

import aa.y0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import nb.n0;
import nb.s0;
import x9.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ia.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ o9.u[] f7415h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final da.a f7416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final da.e f7417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mb.h f7418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mb.i f7419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ca.g f7420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mb.i f7421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7422g;

    static {
        i9.r rVar = new i9.r(f.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0);
        i9.z zVar = i9.y.f6689a;
        f7415h = new o9.u[]{zVar.g(rVar), ob.a.v(f.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, zVar), ob.a.v(f.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0, zVar)};
    }

    public f(da.a aVar, da.e eVar, boolean z10) {
        i9.l.e(aVar, "c");
        i9.l.e(eVar, "javaAnnotation");
        this.f7416a = aVar;
        this.f7417b = eVar;
        ja.a aVar2 = (ja.a) aVar.f3847b;
        mb.n nVar = aVar2.f6964a;
        e eVar2 = new e(this, 0);
        mb.k kVar = (mb.k) nVar;
        kVar.getClass();
        this.f7418c = new mb.h(kVar, eVar2);
        e eVar3 = new e(this, 1);
        mb.k kVar2 = (mb.k) nVar;
        kVar2.getClass();
        this.f7419d = new mb.i(kVar2, eVar3);
        this.f7420e = aVar2.f6973j.c(eVar);
        e eVar4 = new e(this, 2);
        mb.k kVar3 = (mb.k) nVar;
        kVar3.getClass();
        this.f7421f = new mb.i(kVar3, eVar4);
        this.f7422g = z10;
    }

    @Override // y9.b
    public final wa.c a() {
        o9.u uVar = f7415h[0];
        mb.h hVar = this.f7418c;
        i9.l.e(hVar, "<this>");
        i9.l.e(uVar, "p");
        return (wa.c) hVar.invoke();
    }

    @Override // y9.b
    public final Map b() {
        return (Map) k9.a.z(this.f7421f, f7415h[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bb.g c(na.a aVar) {
        na.d iVar;
        nb.w wVarH;
        if (aVar instanceof da.v) {
            return bb.h.b(null, ((da.v) aVar).f3888b);
        }
        if (aVar instanceof da.t) {
            Enum r8 = ((da.t) aVar).f3886b;
            Class<?> enclosingClass = r8.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            i9.l.b(enclosingClass);
            return new bb.i(da.d.a(enclosingClass), wa.e.e(r8.name()));
        }
        boolean z10 = aVar instanceof da.h;
        da.a aVar2 = this.f7416a;
        if (z10) {
            da.h hVar = (da.h) aVar;
            wa.e eVar = hVar.f3870a;
            if (eVar == null) {
                eVar = ga.y.f6127b;
            }
            i9.l.b(eVar);
            ArrayList arrayListA = hVar.a();
            if (!nb.c.j((nb.a0) k9.a.z(this.f7419d, f7415h[1]))) {
                x9.e eVarD = db.e.d(this);
                i9.l.b(eVarD);
                y0 y0VarH = g5.a.H(eVar, eVarD);
                if (y0VarH == null || (wVarH = y0VarH.getType()) == null) {
                    wVarH = ((ja.a) aVar2.f3847b).f6977o.k().h(pb.l.c(pb.k.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
                }
                ArrayList arrayList = new ArrayList(u8.q.a0(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    bb.g gVarC = c((na.a) it.next());
                    if (gVarC == null) {
                        gVarC = new bb.u(null);
                    }
                    arrayList.add(gVarC);
                }
                return new bb.x(arrayList, wVarH);
            }
        } else {
            if (aVar instanceof da.g) {
                return new bb.a((Object) new f(aVar2, new da.e(((da.g) aVar).f3871b), false));
            }
            if (aVar instanceof da.p) {
                Class cls = ((da.p) aVar).f3882b;
                if (cls.isPrimitive()) {
                    iVar = new da.z(cls);
                } else if ((cls instanceof GenericArrayType) || cls.isArray()) {
                    iVar = new da.i(cls);
                } else {
                    iVar = cls instanceof WildcardType ? new da.e0((WildcardType) cls) : new da.q(cls);
                }
                nb.w wVarD0 = ((a2.b) aVar2.f3850e).d0(iVar, o9.e0.R(s0.f9034b, false, null, 7));
                if (!nb.c.j(wVarD0)) {
                    nb.w wVarB = wVarD0;
                    int i7 = 0;
                    while (u9.i.z(wVarB)) {
                        wVarB = ((n0) u8.p.A0(wVarB.B0())).b();
                        i9.l.d(wVarB, "getType(...)");
                        i7++;
                    }
                    x9.h hVarL = wVarB.D0().l();
                    if (hVarL instanceof x9.e) {
                        wa.b bVarF = db.e.f(hVarL);
                        return bVarF == null ? new bb.s(new bb.p(wVarD0)) : new bb.s(bVarF, i7);
                    }
                    if (hVarL instanceof r0) {
                        wa.c cVarG = u9.n.f13166a.g();
                        return new bb.s(new wa.b(cVarG.b(), cVarG.f14240a.f()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // y9.b
    public final x9.n0 getSource() {
        return this.f7420e;
    }

    @Override // y9.b
    public final nb.w getType() {
        return (nb.a0) k9.a.z(this.f7419d, f7415h[1]);
    }

    public final String toString() {
        return ya.g.f15193c.v(this, null);
    }
}

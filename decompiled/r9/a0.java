package r9;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends e0 implements o9.c, p1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f11647d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f11648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11649c;

    public a0(Class cls) {
        i9.l.e(cls, "jClass");
        this.f11648b = cls;
        this.f11649c = t8.a.c(t8.i.f12827a, new s(this, 0));
    }

    public static aa.o s(wa.b bVar, ca.f fVar) {
        jb.i iVar = fVar.f2581a;
        aa.s sVar = new aa.s(iVar.f7019b, bVar.f14236a, 0);
        wa.e eVarF = bVar.f();
        List listI = n3.l.I(iVar.f7019b.k().k("Any").n());
        mb.k kVar = iVar.f7018a;
        aa.o oVar = new aa.o(sVar, eVarF, x9.x.f14747b, x9.f.f14701a, listI, kVar);
        oVar.B0(new y(kVar, oVar), u8.y.f13124a, null);
        return oVar;
    }

    @Override // i9.e
    public final Class a() {
        return this.f11648b;
    }

    @Override // r9.e0
    public final Collection e() {
        x9.e eVarU = u();
        if (eVarU.f() == x9.f.f14702b || eVarU.f() == x9.f.f14706f) {
            return u8.w.f13122a;
        }
        Collection collectionW = eVarU.w();
        i9.l.d(collectionW, "getConstructors(...)");
        return collectionW;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a0) && g5.a.M(this).equals(g5.a.M((o9.c) obj));
    }

    @Override // r9.e0
    public final Collection f(wa.e eVar) {
        gb.o oVarU = u().n().U();
        fa.b bVar = fa.b.f5503b;
        Collection collectionF = oVarU.f(eVar, bVar);
        gb.o oVarQ = u().Q();
        i9.l.d(oVarQ, "getStaticScope(...)");
        return u8.p.x0(oVarQ.f(eVar, bVar), collectionF);
    }

    @Override // r9.e0
    public final x9.k0 g(int i7) {
        Class<?> declaringClass;
        Class cls = this.f11648b;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((a0) g5.a.O(declaringClass)).g(i7);
        }
        x9.e eVarU = u();
        lb.h hVar = eVarU instanceof lb.h ? (lb.h) eVarU : null;
        if (hVar != null) {
            ra.k kVar = hVar.f8315e;
            xa.m mVar = ua.k.f13309j;
            i9.l.d(mVar, "classLocalVariable");
            ra.i0 i0Var = (ra.i0) n3.n.o0(kVar, mVar, i7);
            if (i0Var != null) {
                jb.k kVar2 = hVar.f8321l;
                return (x9.k0) x1.f(this.f11648b, i0Var, kVar2.f7044b, kVar2.f7046d, hVar.f8316f, z.f11797i);
            }
        }
        return null;
    }

    @Override // o9.c
    public final int hashCode() {
        return g5.a.M(this).hashCode();
    }

    @Override // o9.c
    public final boolean j() {
        return u().j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // o9.c
    public final String k() {
        r1 r1Var = ((w) this.f11649c.getValue()).f11782e;
        o9.u uVar = w.f11779l[3];
        return (String) r1Var.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // o9.c
    public final String l() {
        r1 r1Var = ((w) this.f11649c.getValue()).f11781d;
        o9.u uVar = w.f11779l[2];
        return (String) r1Var.invoke();
    }

    @Override // o9.c
    public final boolean m(Object obj) {
        List list = da.d.f3860a;
        Class cls = this.f11648b;
        i9.l.e(cls, "<this>");
        Integer num = (Integer) da.d.f3863d.get(cls);
        if (num != null) {
            return i9.b0.f(num.intValue(), obj);
        }
        Class cls2 = (Class) da.d.f3862c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // r9.e0
    public final Collection n(wa.e eVar) {
        gb.o oVarU = u().n().U();
        fa.b bVar = fa.b.f5503b;
        Collection collectionB = oVarU.b(eVar, bVar);
        gb.o oVarQ = u().Q();
        i9.l.d(oVarQ, "getStaticScope(...)");
        return u8.p.x0(oVarQ.b(eVar, bVar), collectionB);
    }

    public final wa.b t() {
        u9.k kVarD;
        wa.b bVar = v1.f11778a;
        Class cls = this.f11648b;
        i9.l.e(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            i9.l.d(componentType, "getComponentType(...)");
            kVarD = componentType.isPrimitive() ? eb.c.b(componentType.getSimpleName()).d() : null;
            if (kVarD != null) {
                return new wa.b(u9.o.k, kVarD.f13158b);
            }
            wa.c cVarG = u9.n.f13177g.g();
            return new wa.b(cVarG.b(), cVarG.f14240a.f());
        }
        if (cls.equals(Void.TYPE)) {
            return v1.f11778a;
        }
        kVarD = cls.isPrimitive() ? eb.c.b(cls.getSimpleName()).d() : null;
        if (kVarD != null) {
            return new wa.b(u9.o.k, kVarD.f13157a);
        }
        wa.b bVarA = da.d.a(cls);
        if (!bVarA.f14238c) {
            String str = w9.d.f14177a;
            wa.c cVarA = bVarA.a();
            i9.l.e(cVarA, "fqName");
            wa.b bVar2 = (wa.b) w9.d.f14184h.get(cVarA.f14240a);
            if (bVar2 != null) {
                return bVar2;
            }
        }
        return bVarA;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("class ");
        wa.b bVarT = t();
        wa.c cVar = bVarT.f14236a;
        String strI = cVar.f14240a.c() ? "" : a2.f.I(new StringBuilder(), cVar.f14240a.f14243a, '.');
        sb2.append(strI + zb.q.m0(bVarT.f14237b.f14240a.f14243a, '.', '$'));
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    public final x9.e u() {
        return ((w) this.f11649c.getValue()).a();
    }
}

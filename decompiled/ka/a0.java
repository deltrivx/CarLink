package ka;

import aa.y0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import nb.s0;
import nb.w0;
import x9.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 extends gb.p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ o9.u[] f7389m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final da.a f7390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f7391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mb.c f7392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mb.i f7393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mb.e f7394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f1.e f7395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mb.e f7396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mb.i f7397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mb.i f7398j;
    public final mb.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mb.e f7399l;

    static {
        i9.r rVar = new i9.r(a0.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0);
        i9.z zVar = i9.y.f6689a;
        f7389m = new o9.u[]{zVar.g(rVar), ob.a.v(a0.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0, zVar), ob.a.v(a0.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0, zVar)};
    }

    public a0(da.a aVar, o oVar) {
        i9.l.e(aVar, "c");
        this.f7390b = aVar;
        this.f7391c = oVar;
        mb.n nVar = ((ja.a) aVar.f3847b).f6964a;
        w wVar = new w(this, 0);
        mb.k kVar = (mb.k) nVar;
        kVar.getClass();
        this.f7392d = new mb.c(kVar, wVar);
        w wVar2 = new w(this, 1);
        mb.k kVar2 = (mb.k) nVar;
        kVar2.getClass();
        this.f7393e = new mb.i(kVar2, wVar2);
        this.f7394f = ((mb.k) nVar).b(new y(this, 0));
        this.f7395g = ((mb.k) nVar).c(new y(this, 1));
        this.f7396h = ((mb.k) nVar).b(new y(this, 2));
        w wVar3 = new w(this, 2);
        mb.k kVar3 = (mb.k) nVar;
        kVar3.getClass();
        this.f7397i = new mb.i(kVar3, wVar3);
        w wVar4 = new w(this, 3);
        mb.k kVar4 = (mb.k) nVar;
        kVar4.getClass();
        this.f7398j = new mb.i(kVar4, wVar4);
        w wVar5 = new w(this, 4);
        mb.k kVar5 = (mb.k) nVar;
        kVar5.getClass();
        this.k = new mb.i(kVar5, wVar5);
        this.f7399l = ((mb.k) nVar).b(new y(this, 3));
    }

    public static nb.w l(da.x xVar, da.a aVar) {
        i9.l.e(xVar, "method");
        Class<?> declaringClass = ((Method) xVar.b()).getDeclaringClass();
        i9.l.d(declaringClass, "getDeclaringClass(...)");
        return ((a2.b) aVar.f3850e).d0(xVar.f(), o9.e0.R(s0.f9034b, declaringClass.isAnnotation(), null, 6));
    }

    public static e6.h u(da.a aVar, aa.z zVar, List list) {
        t8.j jVar;
        wa.e eVar;
        wa.e eVarE;
        a2.b bVar = (a2.b) aVar.f3850e;
        ja.a aVar2 = (ja.a) aVar.f3847b;
        x9.y yVar = aVar2.f6977o;
        u8.n nVarN0 = u8.p.N0(list);
        ArrayList arrayList = new ArrayList(u8.q.a0(nVarN0, 10));
        Iterator it = nVarN0.iterator();
        boolean z10 = false;
        while (true) {
            u8.a0 a0Var = (u8.a0) it;
            if (!a0Var.f13099b.hasNext()) {
                return new e6.h(u8.p.J0(arrayList), 1, z10);
            }
            u8.z zVar2 = (u8.z) a0Var.next();
            int i7 = zVar2.f13125a;
            da.d0 d0Var = (da.d0) zVar2.f13126b;
            ja.c cVarB0 = g5.a.b0(aVar, d0Var);
            la.a aVarR = o9.e0.R(s0.f9034b, false, null, 7);
            boolean z11 = d0Var.f3867d;
            da.b0 b0Var = d0Var.f3864a;
            if (z11) {
                da.i iVar = b0Var instanceof da.i ? (da.i) b0Var : null;
                if (iVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + d0Var);
                }
                w0 w0VarC0 = bVar.c0(iVar, aVarR, true);
                jVar = new t8.j(w0VarC0, yVar.k().f(w0VarC0));
            } else {
                jVar = new t8.j(bVar.d0(b0Var, aVarR), null);
            }
            nb.w wVar = (nb.w) jVar.f12830a;
            nb.w wVar2 = (nb.w) jVar.f12831b;
            if (i9.l.a(zVar.getName().b(), "equals") && list.size() == 1 && yVar.k().p().equals(wVar)) {
                eVarE = wa.e.e("other");
            } else {
                String str = d0Var.f3866c;
                wa.e eVarD = str != null ? wa.e.d(str) : null;
                if (eVarD == null) {
                    z10 = true;
                }
                if (eVarD == null) {
                    eVarE = wa.e.e("p" + i7);
                } else {
                    eVar = eVarD;
                }
                arrayList.add(new y0(zVar, null, i7, cVarB0, eVar, wVar, false, false, false, wVar2, aVar2.f6973j.c(d0Var)));
            }
            eVar = eVarE;
            arrayList.add(new y0(zVar, null, i7, cVarB0, eVar, wVar, false, false, false, wVar2, aVar2.f6973j.c(d0Var)));
        }
    }

    @Override // gb.p, gb.o
    public Collection b(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        return !g().contains(eVar) ? u8.w.f13122a : (Collection) this.f7399l.invoke(eVar);
    }

    @Override // gb.p, gb.o
    public final Set c() {
        return (Set) k9.a.z(this.f7397i, f7389m[0]);
    }

    @Override // gb.p, gb.q
    public Collection d(gb.f fVar, h9.k kVar) {
        i9.l.e(fVar, "kindFilter");
        return (Collection) this.f7392d.invoke();
    }

    @Override // gb.p, gb.o
    public final Set e() {
        return (Set) k9.a.z(this.k, f7389m[2]);
    }

    @Override // gb.p, gb.o
    public Collection f(wa.e eVar, fa.b bVar) {
        i9.l.e(eVar, "name");
        i9.l.e(bVar, "location");
        return !c().contains(eVar) ? u8.w.f13122a : (Collection) this.f7396h.invoke(eVar);
    }

    @Override // gb.p, gb.o
    public final Set g() {
        return (Set) k9.a.z(this.f7398j, f7389m[1]);
    }

    public abstract Set h(gb.f fVar, h9.k kVar);

    public abstract Set i(gb.f fVar, gb.l lVar);

    public void j(ArrayList arrayList, wa.e eVar) {
        i9.l.e(eVar, "name");
    }

    public abstract c k();

    public abstract void m(LinkedHashSet linkedHashSet, wa.e eVar);

    public abstract void n(ArrayList arrayList, wa.e eVar);

    public abstract Set o(gb.f fVar);

    public abstract aa.a0 p();

    public abstract x9.k q();

    public boolean r(ia.e eVar) {
        return true;
    }

    public abstract z s(da.x xVar, ArrayList arrayList, nb.w wVar, List list);

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, t8.h] */
    public final ia.e t(da.x xVar) {
        x9.x xVar2;
        i9.l.e(xVar, "method");
        da.a aVar = this.f7390b;
        ia.e eVarR0 = ia.e.R0(q(), g5.a.b0(aVar, xVar), xVar.c(), ((ja.a) aVar.f3847b).f6973j.c(xVar), ((c) this.f7393e.invoke()).d(xVar.c()) != null && ((ArrayList) xVar.g()).isEmpty());
        i9.l.e(aVar, "<this>");
        da.a aVar2 = new da.a((ja.a) aVar.f3847b, new ja.e(aVar, eVarR0, xVar, 0), (t8.h) aVar.f3849d);
        ArrayList typeParameters = xVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(u8.q.a0(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            r0 r0VarA = ((ja.f) aVar2.f3848c).a((da.c0) it.next());
            i9.l.b(r0VarA);
            arrayList.add(r0VarA);
        }
        e6.h hVarU = u(aVar2, eVarR0, xVar.g());
        z zVarS = s(xVar, arrayList, l(xVar, aVar2), (List) hVarU.f4443c);
        List list = zVarS.f7494d;
        aa.a0 a0VarP = p();
        ArrayList arrayList2 = zVarS.f7493c;
        List list2 = zVarS.f7492b;
        nb.w wVar = zVarS.f7491a;
        boolean zIsAbstract = Modifier.isAbstract(((Method) xVar.b()).getModifiers());
        boolean zIsFinal = Modifier.isFinal(((Method) xVar.b()).getModifiers());
        x9.x.f14746a.getClass();
        if (zIsAbstract) {
            xVar2 = x9.x.f14750e;
        } else {
            xVar2 = !zIsFinal ? x9.x.f14749d : x9.x.f14747b;
        }
        eVarR0.Q0(null, a0VarP, u8.w.f13122a, arrayList2, list2, wVar, xVar2, k9.a.U(xVar.e()), u8.x.f13123a);
        eVarR0.S0(false, hVarU.f4442b);
        if (list.isEmpty()) {
            return eVarR0;
        }
        ((ja.a) aVar2.f3847b).f6968e.getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}

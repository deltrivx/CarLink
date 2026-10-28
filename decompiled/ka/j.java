package ka;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import nb.k0;
import nb.s0;
import x9.c1;
import x9.m0;
import x9.o0;
import x9.z0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends aa.n implements ia.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final da.a f7429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final da.o f7430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x9.e f7431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final da.a f7432j;
    public final t8.o k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x9.f f7433l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x9.x f7434m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n.a f7435n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f7436o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f7437p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f7438q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m0 f7439r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gb.i f7440s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d0 f7441t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ja.c f7442u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final mb.i f7443v;

    static {
        u8.l.M0(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(da.a aVar, x9.k kVar, da.o oVar, x9.e eVar) throws IllegalAccessException, InvocationTargetException {
        x9.f fVar;
        n.a aVar2;
        i9.l.e(aVar, "outerContext");
        i9.l.e(kVar, "containingDeclaration");
        i9.l.e(oVar, "jClass");
        ja.a aVar3 = (ja.a) aVar.f3847b;
        super(aVar3.f6964a, kVar, oVar.e(), aVar3.f6973j.c(oVar));
        this.f7429g = aVar;
        this.f7430h = oVar;
        this.f7431i = eVar;
        da.a aVarQ = a.a.q(aVar, this, oVar, 4);
        this.f7432j = aVarQ;
        ja.a aVar4 = (ja.a) aVarQ.f3847b;
        mb.n nVar = aVar4.f6964a;
        aVar4.f6970g.getClass();
        this.k = t8.a.d(new g(this, 0));
        Class cls = oVar.f3881a;
        if (cls.isAnnotation()) {
            fVar = x9.f.f14705e;
        } else if (cls.isInterface()) {
            fVar = x9.f.f14702b;
        } else {
            fVar = cls.isEnum() ? x9.f.f14703c : x9.f.f14701a;
        }
        this.f7433l = fVar;
        boolean zIsAnnotation = cls.isAnnotation();
        x9.x xVar = x9.x.f14747b;
        if (!zIsAnnotation && !cls.isEnum()) {
            boolean zH = oVar.h();
            boolean z10 = oVar.h() || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean zIsFinal = Modifier.isFinal(cls.getModifiers());
            x9.x.f14746a.getClass();
            if (zH) {
                xVar = x9.x.f14748c;
            } else if (z10) {
                xVar = x9.x.f14750e;
            } else if (!zIsFinal) {
                xVar = x9.x.f14749d;
            }
        }
        this.f7434m = xVar;
        int modifiers = cls.getModifiers();
        if (Modifier.isPublic(modifiers)) {
            aVar2 = c1.f14693d;
        } else if (Modifier.isPrivate(modifiers)) {
            aVar2 = z0.f14756d;
        } else if (Modifier.isProtected(modifiers)) {
            aVar2 = Modifier.isStatic(modifiers) ? ba.c.f1678d : ba.b.f1677d;
        } else {
            aVar2 = ba.a.f1676d;
        }
        this.f7435n = aVar2;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.f7436o = ((declaringClass != null ? new da.o(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.f7437p = new h(this);
        o oVar2 = new o(aVarQ, this, oVar, eVar != null, null);
        this.f7438q = oVar2;
        o0 o0Var = m0.f14711d;
        ((ob.m) aVar4.f6983u).getClass();
        aa.a aVar5 = new aa.a(16, this);
        o0Var.getClass();
        i9.l.e(nVar, "storageManager");
        this.f7439r = new m0(this, nVar, aVar5);
        this.f7440s = new gb.i(oVar2);
        this.f7441t = new d0(aVarQ, oVar, this);
        this.f7442u = g5.a.b0(aVarQ, oVar);
        g gVar = new g(this, 1);
        mb.k kVar2 = (mb.k) nVar;
        kVar2.getClass();
        this.f7443v = new mb.i(kVar2, gVar);
    }

    public final o B0() {
        return (o) super.t0();
    }

    @Override // x9.e
    public final Collection E() throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        yb.j jVarF0;
        if (this.f7434m != x9.x.f14748c) {
            return u8.w.f13122a;
        }
        Object obj = null;
        la.a aVarR = o9.e0.R(s0.f9034b, false, null, 7);
        Class cls = this.f7430h.f3881a;
        i9.l.e(cls, "clazz");
        da.a aVar = g5.a.f5918b;
        if (aVar == null) {
            try {
                aVar = new da.a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 0);
            } catch (NoSuchMethodException unused) {
                aVar = new da.a(obj, obj, obj, obj, 0);
            }
            g5.a.f5918b = aVar;
        }
        Method method = (Method) aVar.f3848c;
        if (method == null) {
            clsArr = null;
        } else {
            Object objInvoke = method.invoke(cls, null);
            i9.l.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (Class[]) objInvoke;
        }
        if (clsArr != null) {
            ArrayList arrayList = new ArrayList(clsArr.length);
            for (Class cls2 : clsArr) {
                arrayList.add(new da.q(cls2));
            }
            jVarF0 = u8.p.f0(arrayList);
        } else {
            jVarF0 = yb.f.f15266a;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = jVarF0.iterator();
        while (it.hasNext()) {
            x9.h hVarL = ((a2.b) this.f7432j.f3850e).d0((da.q) it.next(), aVarR).D0().l();
            x9.e eVar = hVarL instanceof x9.e ? (x9.e) hVarL : null;
            if (eVar != null) {
                arrayList2.add(eVar);
            }
        }
        return u8.p.E0(arrayList2, new i());
    }

    @Override // x9.w
    public final boolean G() {
        return false;
    }

    @Override // x9.i
    public final boolean H() {
        return this.f7436o;
    }

    @Override // x9.e
    public final aa.m P() {
        return null;
    }

    @Override // x9.e
    public final gb.o Q() {
        return this.f7441t;
    }

    @Override // x9.e, x9.w, x9.n
    public final ga.o d() {
        ga.o oVar = x9.o.f14717a;
        n.a aVar = this.f7435n;
        if (i9.l.a(aVar, oVar)) {
            Class<?> declaringClass = this.f7430h.f3881a.getDeclaringClass();
            if ((declaringClass != null ? new da.o(declaringClass) : null) == null) {
                ga.o oVar2 = ga.p.f6103a;
                i9.l.b(oVar2);
                return oVar2;
            }
        }
        return k9.a.U(aVar);
    }

    @Override // x9.e
    public final x9.f f() {
        return this.f7433l;
    }

    @Override // x9.e
    public final boolean g() {
        return false;
    }

    @Override // y9.a
    public final y9.h getAnnotations() {
        return this.f7442u;
    }

    @Override // x9.e, x9.w
    public final x9.x i() {
        return this.f7434m;
    }

    @Override // x9.e
    public final boolean j() {
        return false;
    }

    @Override // aa.c, x9.e
    public final gb.o n0() {
        return this.f7440s;
    }

    @Override // x9.e
    public final x9.s0 o0() {
        return null;
    }

    @Override // aa.e0
    public final gb.o p0(ob.g gVar) {
        m0 m0Var = this.f7439r;
        db.e.j(m0Var.f14713a);
        return (o) ((gb.o) k9.a.z(m0Var.f14715c, m0.f14712e[0]));
    }

    @Override // x9.e, x9.i
    public final List q() {
        return (List) this.f7443v.invoke();
    }

    @Override // x9.h
    public final k0 t() {
        return this.f7437p;
    }

    @Override // aa.c, x9.e
    public final gb.o t0() {
        return (o) super.t0();
    }

    public final String toString() {
        return "Lazy Java class " + db.e.h(this);
    }

    @Override // x9.e
    public final boolean u() {
        return false;
    }

    @Override // x9.w
    public final boolean u0() {
        return false;
    }

    @Override // x9.e
    public final Collection w() {
        return (List) this.f7438q.f7461q.invoke();
    }

    @Override // x9.e
    public final boolean z() {
        return false;
    }

    @Override // x9.e
    public final boolean z0() {
        return false;
    }
}

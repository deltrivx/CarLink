package r9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends r implements i9.i, o9.f, e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ o9.u[] f11681i = {i9.y.f6689a.g(new i9.r(g0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f11682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r1 f11685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f11686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f11687h;

    public g0(e0 e0Var, String str, String str2, x9.t tVar, Object obj) {
        this.f11682c = e0Var;
        this.f11683d = str2;
        this.f11684e = obj;
        this.f11685f = n4.h.R(tVar, new aa.j(14, this, str));
        f0 f0Var = new f0(this, 0);
        t8.i iVar = t8.i.f12827a;
        this.f11686g = t8.a.c(iVar, f0Var);
        this.f11687h = t8.a.c(iVar, new f0(this, 1));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(e0 e0Var, x9.t tVar) {
        i9.l.e(tVar, "descriptor");
        String strB = ((aa.q) tVar).getName().b();
        i9.l.d(strB, "asString(...)");
        this(e0Var, strB, v1.c(tVar).P(), tVar, i9.c.f6670a);
    }

    @Override // h9.p
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        return f(obj, obj2, obj3, obj4);
    }

    @Override // h9.q
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return f(obj, obj2, obj3, obj4, obj5);
    }

    public final boolean equals(Object obj) {
        g0 g0VarB = x1.b(obj);
        return g0VarB != null && i9.l.a(this.f11682c, g0VarB.f11682c) && getName().equals(g0VarB.getName()) && i9.l.a(this.f11683d, g0VarB.f11683d) && i9.l.a(this.f11684e, g0VarB.f11684e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // r9.r
    public final s9.g g() {
        return (s9.g) this.f11686g.getValue();
    }

    @Override // i9.i
    public final int getArity() {
        return n3.l.w(g());
    }

    @Override // o9.b
    public final String getName() {
        String strB = ((aa.q) j()).getName().b();
        i9.l.d(strB, "asString(...)");
        return strB;
    }

    @Override // r9.r
    public final e0 h() {
        return this.f11682c;
    }

    public final int hashCode() {
        return this.f11683d.hashCode() + ((getName().hashCode() + (this.f11682c.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // r9.r
    public final s9.g i() {
        return (s9.g) this.f11687h.getValue();
    }

    @Override // h9.a
    public final Object invoke() {
        return f(new Object[0]);
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        return f(obj);
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return f(obj, obj2);
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return f(obj, obj2, obj3);
    }

    @Override // r9.r
    public final boolean m() {
        return this.f11684e != i9.c.f6670a;
    }

    public final s9.w n(Constructor constructor, x9.t tVar, boolean z10) {
        Object obj = this.f11684e;
        Class<?> cls = null;
        if (!z10) {
            aa.m mVar = tVar instanceof aa.m ? (aa.m) tVar : null;
            if (mVar != null) {
                aa.m mVar2 = mVar;
                if (!x9.o.e(mVar2.d())) {
                    x9.e eVarY = mVar.y();
                    i9.l.d(eVarY, "getConstructedClass(...)");
                    if (!za.f.f(eVarY) && !za.d.q(mVar.y())) {
                        List listX = mVar2.X();
                        i9.l.d(listX, "getValueParameters(...)");
                        if (!listX.isEmpty()) {
                            Iterator it = listX.iterator();
                            while (it.hasNext()) {
                                nb.w type = ((aa.y0) it.next()).getType();
                                i9.l.d(type, "getType(...)");
                                if (g5.a.a0(type)) {
                                    if (m()) {
                                        return new s9.h(constructor, n3.n.W(obj, j()), 0);
                                    }
                                    Class declaringClass = constructor.getDeclaringClass();
                                    i9.l.d(declaringClass, "getDeclaringClass(...)");
                                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                    i9.l.d(genericParameterTypes, "getGenericParameterTypes(...)");
                                    return new s9.i(constructor, declaringClass, cls, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : u8.l.s0(genericParameterTypes, 0, genericParameterTypes.length - 1)), 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (m()) {
            return new s9.h(constructor, n3.n.W(obj, j()), 1);
        }
        Class declaringClass2 = constructor.getDeclaringClass();
        i9.l.d(declaringClass2, "getDeclaringClass(...)");
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        if (declaringClass4 != null && !Modifier.isStatic(declaringClass3.getModifiers())) {
            cls = declaringClass4;
        }
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        i9.l.d(genericParameterTypes2, "getGenericParameterTypes(...)");
        return new s9.i(constructor, declaringClass2, cls, genericParameterTypes2, 1);
    }

    @Override // o9.b
    public final boolean o() {
        return j().o();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    public final s9.q p(Method method, boolean z10) {
        if (!m()) {
            return new s9.v(method, false, 6, 2);
        }
        aa.a0 a0VarB0 = j().b0();
        Object objW = this.f11684e;
        if (a0VarB0 == null || !za.f.c(a0VarB0.getType())) {
            objW = n3.n.W(objW, j());
        } else {
            Class<?>[] parameterTypes = method.getParameterTypes();
            i9.l.d(parameterTypes, "getParameterTypes(...)");
            Class cls = (Class) u8.l.x0(parameterTypes);
            if (cls == null || !cls.isInterface()) {
                objW = n3.n.W(objW, j());
            }
        }
        return new s9.t(method, z10, objW);
    }

    @Override // r9.r
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final x9.t j() {
        o9.u uVar = f11681i[0];
        Object objInvoke = this.f11685f.invoke();
        i9.l.d(objInvoke, "getValue(...)");
        return (x9.t) objInvoke;
    }

    public final String toString() {
        ya.g gVar = u1.f11769a;
        return u1.b(j());
    }
}

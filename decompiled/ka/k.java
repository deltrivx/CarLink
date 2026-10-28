package ka;

import aa.y0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import nb.s0;
import x9.r0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7444a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final da.a f7445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f7446c;

    public k(da.a aVar, o oVar) {
        this.f7445b = aVar;
        this.f7446c = oVar;
    }

    public k(o oVar, da.a aVar) {
        this.f7446c = oVar;
        this.f7445b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, t8.h] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ka.o] */
    /* JADX WARN: Type inference failed for: r2v8, types: [ka.o] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10, types: [ia.b] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [aa.m, aa.z, ia.b] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // h9.a
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        o oVar;
        ?? r8;
        ?? arrayList;
        ?? r15;
        ?? r10;
        t8.j jVar;
        List listD;
        switch (this.f7444a) {
            case 0:
                o oVar2 = this.f7446c;
                da.o oVar3 = oVar2.f7459o;
                da.a aVar = oVar2.f7390b;
                x9.e eVar = oVar2.f7458n;
                Constructor<?>[] declaredConstructors = oVar3.f3881a.getDeclaredConstructors();
                i9.l.d(declaredConstructors, "getDeclaredConstructors(...)");
                boolean z10 = false;
                List<da.r> listU = yb.l.U(yb.l.S(new yb.h(u8.l.k0(declaredConstructors), false, da.j.f3876i), da.k.f3877i));
                ArrayList arrayList2 = new ArrayList(listU.size());
                for (da.r rVar : listU) {
                    ja.c cVarB0 = g5.a.b0(aVar, rVar);
                    ja.a aVar2 = (ja.a) aVar.f3847b;
                    ia.b bVarT0 = ia.b.T0(eVar, cVarB0, z10, aVar2.f6973j.c(rVar));
                    da.a aVar3 = new da.a(aVar2, new ja.e(aVar, bVarT0, rVar, eVar.q().size()), (t8.h) aVar.f3849d);
                    Constructor constructor = rVar.f3885a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    i9.l.b(genericParameterTypes);
                    if (genericParameterTypes.length == 0) {
                        listD = u8.w.f13122a;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) u8.l.s0(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            throw new IllegalStateException("Illegal generic signature: " + constructor);
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) u8.l.s0(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                        }
                        listD = rVar.d(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    e6.h hVarU = a0.u(aVar3, bVarT0, listD);
                    List listQ = eVar.q();
                    i9.l.d(listQ, "getDeclaredTypeParameters(...)");
                    ArrayList typeParameters = rVar.getTypeParameters();
                    ArrayList arrayList3 = new ArrayList(u8.q.a0(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        r0 r0VarA = ((ja.f) aVar3.f3848c).a((da.c0) it.next());
                        i9.l.b(r0VarA);
                        arrayList3.add(r0VarA);
                    }
                    bVarT0.R0((List) hVarU.f4443c, k9.a.U(rVar.e()), u8.p.x0(arrayList3, listQ));
                    bVarT0.K0(false);
                    bVarT0.L0(hVarU.f4442b);
                    bVarT0.M0(eVar.n());
                    ((ja.a) aVar3.f3847b).f6970g.getClass();
                    arrayList2.add(bVarT0);
                    z10 = false;
                }
                boolean zG = oVar3.g();
                Class cls = oVar3.f3881a;
                s0 s0Var = s0.f9034b;
                da.a aVar4 = this.f7445b;
                y9.f fVar = y9.g.f15129a;
                if (zG) {
                    ia.b bVarT1 = ia.b.T0(eVar, fVar, true, ((ja.a) aVar.f3847b).f6973j.c(oVar3));
                    ArrayList arrayListF = oVar3.f();
                    ArrayList arrayList4 = new ArrayList(arrayListF.size());
                    oVar = oVar2;
                    la.a aVarR = o9.e0.R(s0Var, false, null, 6);
                    int i7 = 0;
                    for (Iterator it2 = arrayListF.iterator(); it2.hasNext(); it2 = it2) {
                        da.a0 a0Var = (da.a0) it2.next();
                        arrayList4.add(new y0(bVarT1, null, i7, fVar, a0Var.c(), ((a2.b) aVar.f3850e).d0(a0Var.f(), aVarR), false, false, false, null, ((ja.a) aVar.f3847b).f6973j.c(a0Var)));
                        i7++;
                    }
                    bVarT1.L0(false);
                    ga.o oVarD = eVar.d();
                    i9.l.d(oVarD, "getVisibility(...)");
                    if (oVarD.equals(ga.p.f6104b)) {
                        oVarD = ga.p.f6105c;
                        i9.l.d(oVarD, "PROTECTED_AND_PACKAGE");
                    }
                    bVarT1.Q0(arrayList4, oVarD);
                    bVarT1.K0(false);
                    bVarT1.M0(eVar.n());
                    String strY = n3.n.Y(bVarT1, 2);
                    if (arrayList2.isEmpty()) {
                        arrayList2.add(bVarT1);
                        ((ja.a) aVar4.f3847b).f6970g.getClass();
                    } else {
                        Iterator it3 = arrayList2.iterator();
                        do {
                            if (!it3.hasNext()) {
                                arrayList2.add(bVarT1);
                                ((ja.a) aVar4.f3847b).f6970g.getClass();
                            }
                        } while (!i9.l.a(n3.n.Y((aa.m) it3.next(), 2), strY));
                    }
                } else {
                    oVar = oVar2;
                }
                ((eb.a) ((ja.a) aVar4.f3847b).f6986x).getClass();
                i9.l.e(eVar, "thisDescriptor");
                i9.l.e(aVar4, "c");
                oa.d dVar = ((ja.a) aVar4.f3847b).f6980r;
                boolean zIsEmpty = arrayList2.isEmpty();
                List listK = arrayList2;
                if (zIsEmpty) {
                    boolean zIsAnnotation = cls.isAnnotation();
                    cls.isInterface();
                    if (zIsAnnotation) {
                        ja.a aVar5 = (ja.a) aVar.f3847b;
                        a2.b bVar = (a2.b) aVar.f3850e;
                        ia.b bVarT2 = ia.b.T0(eVar, fVar, true, aVar5.f6973j.c(oVar3));
                        if (zIsAnnotation) {
                            List listD2 = oVar3.d();
                            arrayList = new ArrayList(listD2.size());
                            la.a aVarR2 = o9.e0.R(s0Var, true, null, 6);
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList<da.x> arrayList6 = new ArrayList();
                            for (Object obj : listD2) {
                                if (i9.l.a(((da.x) obj).c(), ga.y.f6127b)) {
                                    arrayList5.add(obj);
                                } else {
                                    arrayList6.add(obj);
                                }
                            }
                            arrayList5.size();
                            da.x xVar = (da.x) u8.p.m0(arrayList5);
                            if (xVar != null) {
                                da.b0 b0VarF = xVar.f();
                                if (b0VarF instanceof da.i) {
                                    da.i iVar = (da.i) b0VarF;
                                    jVar = new t8.j(bVar.c0(iVar, aVarR2, true), bVar.d0(iVar.f3874b, aVarR2));
                                } else {
                                    jVar = new t8.j(bVar.d0(b0VarF, aVarR2), null);
                                }
                                nb.w wVar = (nb.w) jVar.f12830a;
                                nb.w wVar2 = (nb.w) jVar.f12831b;
                                ia.b bVar2 = bVarT2;
                                ?? r11 = oVar;
                                r11.v(arrayList, bVar2, 0, xVar, wVar, wVar2);
                                r10 = r11;
                                r8 = bVar2;
                            } else {
                                r8 = bVarT2;
                                r10 = oVar;
                            }
                            int i10 = xVar != null ? 1 : 0;
                            int i11 = 0;
                            for (da.x xVar2 : arrayList6) {
                                r10.v(arrayList, r8, i11 + i10, xVar2, bVar.d0(xVar2.f(), aVarR2), null);
                                i11++;
                            }
                        } else {
                            r8 = bVarT2;
                            arrayList = Collections.EMPTY_LIST;
                        }
                        r8.L0(false);
                        ga.o oVarD2 = eVar.d();
                        i9.l.d(oVarD2, "getVisibility(...)");
                        if (oVarD2.equals(ga.p.f6104b)) {
                            oVarD2 = ga.p.f6105c;
                            i9.l.d(oVarD2, "PROTECTED_AND_PACKAGE");
                        }
                        r8.Q0(arrayList, oVarD2);
                        r8.K0(true);
                        r8.M0(eVar.n());
                        ((ja.a) aVar.f3847b).f6970g.getClass();
                        r15 = r8;
                    } else {
                        r15 = 0;
                    }
                    listK = n3.l.K(r15);
                }
                return u8.p.J0(dVar.e(aVar4, listK));
            default:
                da.a aVar6 = this.f7445b;
                eb.e eVar2 = ((ja.a) aVar6.f3847b).f6986x;
                x9.e eVar3 = this.f7446c.f7458n;
                ((eb.a) eVar2).getClass();
                i9.l.e(eVar3, "thisDescriptor");
                i9.l.e(aVar6, "c");
                return u8.p.M0(new ArrayList());
        }
    }
}

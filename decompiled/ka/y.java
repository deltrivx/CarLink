package ka;

import aa.p0;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import nb.s0;
import x9.k0;
import x9.u0;

/* JADX INFO: loaded from: classes.dex */
public final class y implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f7490b;

    public /* synthetic */ y(a0 a0Var, int i7) {
        this.f7489a = i7;
        this.f7490b = a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0181  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:89:0x0272  */
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
    @Override // h9.k
    public final Object invoke(Object obj) {
        na.d iVar;
        na.d zVar;
        int i7 = this.f7489a;
        a0 a0Var = this.f7490b;
        switch (i7) {
            case 0:
                wa.e eVar = (wa.e) obj;
                i9.l.e(eVar, "name");
                a0 a0Var2 = a0Var.f7391c;
                if (a0Var2 != null) {
                    return (Collection) a0Var2.f7394f.invoke(eVar);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((c) a0Var.f7393e.invoke()).b(eVar).iterator();
                while (it.hasNext()) {
                    ia.e eVarT = a0Var.t((da.x) it.next());
                    if (a0Var.r(eVarT)) {
                        ((ja.a) a0Var.f7390b.f3847b).f6970g.getClass();
                        arrayList.add(eVarT);
                    }
                }
                a0Var.j(arrayList, eVar);
                return arrayList;
            case 1:
                wa.e eVar2 = (wa.e) obj;
                i9.l.e(eVar2, "name");
                a0 a0Var3 = a0Var.f7391c;
                if (a0Var3 != null) {
                    return (k0) a0Var3.f7395g.invoke(eVar2);
                }
                da.u uVarC = ((c) a0Var.f7393e.invoke()).c(eVar2);
                if (uVarC != null) {
                    Field field = uVarC.f3887a;
                    if (!field.isEnumConstant()) {
                        i9.x xVar = new i9.x();
                        boolean z10 = !Modifier.isFinal(((Field) uVarC.b()).getModifiers());
                        da.a aVar = a0Var.f7390b;
                        ja.c cVarB0 = g5.a.b0(aVar, uVarC);
                        ja.a aVar2 = (ja.a) aVar.f3847b;
                        int i10 = 0;
                        ia.f fVarK0 = ia.f.K0(a0Var.q(), cVarB0, k9.a.U(uVarC.e()), z10, uVarC.c(), aVar2.f6973j.c(uVarC), Modifier.isFinal(((Field) uVarC.b()).getModifiers()) && Modifier.isStatic(((Field) uVarC.b()).getModifiers()));
                        xVar.f6688a = fVarK0;
                        fVarK0.G0(null, null, null, null);
                        a2.b bVar = (a2.b) aVar.f3850e;
                        Type genericType = field.getGenericType();
                        i9.l.d(genericType, "getGenericType(...)");
                        boolean z11 = genericType instanceof Class;
                        if (z11) {
                            Class cls = (Class) genericType;
                            if (cls.isPrimitive()) {
                                zVar = new da.z(cls);
                            } else {
                                if (!(genericType instanceof GenericArrayType) || (z11 && ((Class) genericType).isArray())) {
                                    iVar = new da.i(genericType);
                                } else {
                                    iVar = genericType instanceof WildcardType ? new da.e0((WildcardType) genericType) : new da.q(genericType);
                                }
                                zVar = iVar;
                            }
                        } else {
                            if (genericType instanceof GenericArrayType) {
                                iVar = new da.i(genericType);
                            } else {
                                iVar = new da.i(genericType);
                            }
                            zVar = iVar;
                        }
                        nb.w wVarD0 = bVar.d0(zVar, o9.e0.R(s0.f9034b, false, null, 7));
                        if ((u9.i.G(wVarD0) || u9.i.H(wVarD0)) && Modifier.isFinal(((Field) uVarC.b()).getModifiers())) {
                            Modifier.isStatic(((Field) uVarC.b()).getModifiers());
                        }
                        p0 p0Var = (p0) xVar.f6688a;
                        aa.a0 a0VarP = a0Var.p();
                        u8.w wVar = u8.w.f13122a;
                        p0Var.J0(wVarD0, wVar, a0VarP, null, wVar);
                        x9.k kVarQ = a0Var.q();
                        if ((kVarQ instanceof x9.e ? (x9.e) kVarQ : null) != null) {
                            eb.e eVar3 = aVar2.f6986x;
                            p0 p0Var2 = (p0) xVar.f6688a;
                            ((eb.a) eVar3).getClass();
                            i9.l.e(p0Var2, "propertyDescriptor");
                            i9.l.e(aVar, "c");
                            xVar.f6688a = p0Var2;
                        }
                        Object obj2 = xVar.f6688a;
                        u0 u0Var = (u0) obj2;
                        nb.w type = ((p0) obj2).getType();
                        if (u0Var == null) {
                            za.d.a(65);
                            throw null;
                        }
                        if (type == null) {
                            za.d.a(66);
                            throw null;
                        }
                        int i11 = za.d.f15791a;
                        if (!u0Var.d0() && !nb.c.j(type)) {
                            if (nb.u0.b(type)) {
                                ((p0) xVar.f6688a).H0(null, new x(a0Var, uVarC, xVar, i10));
                            } else {
                                u9.i iVarE = db.e.e(u0Var);
                                if (u9.i.G(type)) {
                                    ((p0) xVar.f6688a).H0(null, new x(a0Var, uVarC, xVar, i10));
                                } else {
                                    ob.m mVar = ob.e.f9637a;
                                    if (mVar.a(iVarE.v(), type) || mVar.a(iVarE.k("Number").n(), type) || mVar.a(iVarE.e(), type) || u9.s.a(type)) {
                                        ((p0) xVar.f6688a).H0(null, new x(a0Var, uVarC, xVar, i10));
                                    }
                                }
                            }
                        }
                        ha.h hVar = aVar2.f6970g;
                        k0 k0Var = (k0) xVar.f6688a;
                        hVar.getClass();
                        if (k0Var != null) {
                            return (k0) xVar.f6688a;
                        }
                        Object[] objArr = new Object[3];
                        switch (6) {
                            case 1:
                                objArr[0] = "member";
                                break;
                            case 2:
                            case 4:
                            case 6:
                            case 8:
                                objArr[0] = "descriptor";
                                break;
                            case 3:
                                objArr[0] = "element";
                                break;
                            case 5:
                                objArr[0] = "field";
                                break;
                            case 7:
                                objArr[0] = "javaClass";
                                break;
                            default:
                                objArr[0] = "fqName";
                                break;
                        }
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
                        switch (6) {
                            case 1:
                            case 2:
                                objArr[2] = "recordMethod";
                                break;
                            case 3:
                            case 4:
                                objArr[2] = "recordConstructor";
                                break;
                            case 5:
                            case 6:
                                objArr[2] = "recordField";
                                break;
                            case 7:
                            case 8:
                                objArr[2] = "recordClass";
                                break;
                            default:
                                objArr[2] = "getClassResolvedFromSource";
                                break;
                        }
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                    }
                }
                return null;
            case 2:
                wa.e eVar4 = (wa.e) obj;
                i9.l.e(eVar4, "name");
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) a0Var.f7394f.invoke(eVar4));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : linkedHashSet) {
                    String strY = n3.n.Y((aa.s0) obj3, 2);
                    Object arrayList2 = linkedHashMap.get(strY);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strY, arrayList2);
                    }
                    ((List) arrayList2).add(obj3);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        Collection collectionO = za.k.o(list, m.f7450c);
                        linkedHashSet.removeAll(list);
                        linkedHashSet.addAll(collectionO);
                    }
                }
                a0Var.m(linkedHashSet, eVar4);
                da.a aVar3 = a0Var.f7390b;
                return u8.p.J0(((ja.a) aVar3.f3847b).f6980r.e(aVar3, linkedHashSet));
            default:
                wa.e eVar5 = (wa.e) obj;
                i9.l.e(eVar5, "name");
                ArrayList arrayList3 = new ArrayList();
                wb.l.a(arrayList3, a0Var.f7395g.invoke(eVar5));
                a0Var.n(arrayList3, eVar5);
                x9.k kVarQ2 = a0Var.q();
                int i12 = za.d.f15791a;
                if (za.d.n(kVarQ2, x9.f.f14705e)) {
                    return u8.p.J0(arrayList3);
                }
                da.a aVar4 = a0Var.f7390b;
                return u8.p.J0(((ja.a) aVar4.f3847b).f6980r.e(aVar4, arrayList3));
        }
    }
}

package r9;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f11740b;

    public /* synthetic */ p(r rVar, int i7) {
        this.f11739a = i7;
        this.f11740b = rVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, t8.h] */
    @Override // h9.a
    public final Object invoke() {
        int i7;
        int i10;
        int size;
        Type[] lowerBounds;
        int i11 = this.f11739a;
        o9.m mVar = o9.m.f9564c;
        Type type = null;
        int i12 = 0;
        z = false;
        boolean z10 = false;
        int i13 = 1;
        r rVar = this.f11740b;
        switch (i11) {
            case 0:
                return x1.d(rVar.j());
            case 1:
                x9.c cVarJ = rVar.j();
                ArrayList arrayList = new ArrayList();
                if (rVar.m()) {
                    i7 = 0;
                } else {
                    aa.a0 a0VarG = x1.g(cVarJ);
                    if (a0VarG != null) {
                        arrayList.add(new v0(rVar, 0, o9.m.f9562a, new q(a0VarG, 0)));
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    aa.a0 a0VarE0 = cVarJ.e0();
                    if (a0VarE0 != null) {
                        arrayList.add(new v0(rVar, i7, o9.m.f9563b, new q(a0VarE0, 1)));
                        i7++;
                    }
                }
                int size2 = cVarJ.X().size();
                while (i12 < size2) {
                    arrayList.add(new v0(rVar, i7, mVar, new l8.w(i12, 1, cVarJ)));
                    i12++;
                    i7++;
                }
                if (rVar.l() && (cVarJ instanceof ia.a) && arrayList.size() > 1) {
                    u8.t.b0(arrayList, new f(i13));
                }
                arrayList.trimToSize();
                return arrayList;
            case 2:
                nb.w wVarP = rVar.j().p();
                i9.l.b(wVarP);
                return new n1(wVarP, new p(rVar, 6));
            case 3:
                List<x9.r0> typeParameters = rVar.j().getTypeParameters();
                i9.l.d(typeParameters, "getTypeParameters(...)");
                ArrayList arrayList2 = new ArrayList(u8.q.a0(typeParameters, 10));
                for (x9.r0 r0Var : typeParameters) {
                    i9.l.b(r0Var);
                    arrayList2.add(new o1(rVar, r0Var));
                }
                return arrayList2;
            case 4:
                List listK = rVar.k();
                int size3 = (rVar.o() ? 1 : 0) + listK.size();
                ?? r8 = rVar.f11753b;
                if (((Boolean) r8.getValue()).booleanValue()) {
                    Iterator it = listK.iterator();
                    i10 = 0;
                    while (it.hasNext()) {
                        v0 v0Var = (v0) ((o9.n) it.next());
                        if (v0Var.f11776c != mVar) {
                            size = 0;
                        } else {
                            if (!((Boolean) r8.getValue()).booleanValue()) {
                                throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
                            }
                            if (x1.h(v0Var.c())) {
                                ArrayList arrayListT0 = n3.n.t0(nb.c.b(v0Var.c().f11727a));
                                i9.l.b(arrayListT0);
                                size = arrayListT0.size();
                            } else {
                                size = 1;
                            }
                        }
                        i10 += size;
                    }
                } else if (listK.isEmpty()) {
                    i10 = 0;
                } else {
                    Iterator it2 = listK.iterator();
                    i10 = 0;
                    while (it2.hasNext()) {
                        if (((v0) ((o9.n) it2.next())).f11776c == mVar && (i10 = i10 + 1) < 0) {
                            throw new ArithmeticException("Count overflow has happened.");
                        }
                    }
                }
                int i14 = (i10 + 31) / 32;
                Object[] objArr = new Object[size3 + i14 + 1];
                Iterator it3 = listK.iterator();
                while (it3.hasNext()) {
                    v0 v0Var2 = (v0) ((o9.n) it3.next());
                    x9.i0 i0VarA = v0Var2.a();
                    int i15 = v0Var2.f11775b;
                    aa.y0 y0Var = i0VarA instanceof aa.y0 ? (aa.y0) i0VarA : null;
                    if (y0Var != null ? db.e.a(y0Var) : false) {
                        n1 n1VarC = v0Var2.c();
                        wa.c cVar = x1.f11793a;
                        nb.w wVar = n1VarC.f11727a;
                        if (wVar == null || !za.f.c(wVar)) {
                            n1 n1VarC2 = v0Var2.c();
                            r1 r1Var = n1VarC2.f11728b;
                            Type typeN = r1Var != null ? (Type) r1Var.invoke() : null;
                            if (typeN == null) {
                                typeN = r1Var != null ? (Type) r1Var.invoke() : null;
                                if (typeN == null) {
                                    typeN = o9.e0.n(n1VarC2, false);
                                }
                            }
                            objArr[i15] = x1.e(typeN);
                        }
                    }
                    x9.i0 i0VarA2 = v0Var2.a();
                    if ((i0VarA2 instanceof aa.y0) && ((aa.y0) i0VarA2).f475j != null) {
                        Class clsL = g5.a.L(n3.l.y(v0Var2.c()));
                        if (!clsL.isArray()) {
                            throw new cc.a0(2, "Cannot instantiate the default empty array of type " + clsL.getSimpleName() + ", because it is not an array type");
                        }
                        Object objNewInstance = Array.newInstance(clsL.getComponentType(), 0);
                        i9.l.d(objNewInstance, "run(...)");
                        objArr[i15] = objNewInstance;
                    }
                }
                for (int i16 = 0; i16 < i14; i16++) {
                    objArr[size3 + i16] = 0;
                }
                return objArr;
            case 5:
                List listK2 = rVar.k();
                if (!listK2.isEmpty()) {
                    Iterator it4 = listK2.iterator();
                    while (it4.hasNext()) {
                        if (x1.h(((v0) ((o9.n) it4.next())).c())) {
                            z10 = true;
                        }
                    }
                }
                return Boolean.valueOf(z10);
            default:
                if (rVar.o()) {
                    Object objT0 = u8.p.t0(rVar.g().q());
                    ParameterizedType parameterizedType = objT0 instanceof ParameterizedType ? (ParameterizedType) objT0 : null;
                    if (i9.l.a(parameterizedType != null ? parameterizedType.getRawType() : null, y8.c.class)) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        i9.l.d(actualTypeArguments, "getActualTypeArguments(...)");
                        Object objH0 = u8.l.H0(actualTypeArguments);
                        WildcardType wildcardType = objH0 instanceof WildcardType ? (WildcardType) objH0 : null;
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type = (Type) u8.l.w0(lowerBounds);
                        }
                    }
                }
                return type == null ? rVar.g().p() : type;
        }
    }
}

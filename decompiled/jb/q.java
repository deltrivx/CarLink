package jb;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import r9.n1;
import r9.r1;

/* JADX INFO: loaded from: classes.dex */
public final class q implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7066d;

    public /* synthetic */ q(t tVar, xa.a aVar, int i7, int i10) {
        this.f7063a = i10;
        this.f7064b = tVar;
        this.f7065c = aVar;
        this.f7066d = i7;
    }

    public q(n1 n1Var, int i7, t8.h hVar) {
        this.f7063a = 2;
        this.f7064b = n1Var;
        this.f7066d = i7;
        this.f7065c = hVar;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, t8.h] */
    @Override // h9.a
    public final Object invoke() {
        Type type;
        switch (this.f7063a) {
            case 0:
                t tVar = (t) this.f7064b;
                xa.a aVar = (xa.a) this.f7065c;
                k kVar = tVar.f7076a;
                w wVarA = tVar.a(kVar.f7045c);
                List listJ0 = wVarA != null ? u8.p.J0(kVar.f7043a.f7022e.n(wVarA, aVar, this.f7066d)) : null;
                return listJ0 == null ? u8.w.f13122a : listJ0;
            case 1:
                t tVar2 = (t) this.f7064b;
                xa.a aVar2 = (xa.a) this.f7065c;
                k kVar2 = tVar2.f7076a;
                w wVarA2 = tVar2.a(kVar2.f7045c);
                List listE = wVarA2 != null ? kVar2.f7043a.f7022e.e(wVarA2, aVar2, this.f7066d) : null;
                return listE == null ? u8.w.f13122a : listE;
            default:
                n1 n1Var = (n1) this.f7064b;
                r1 r1Var = n1Var.f11728b;
                Type type2 = r1Var != null ? (Type) r1Var.invoke() : null;
                if (type2 instanceof Class) {
                    Class cls = (Class) type2;
                    Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    i9.l.b(componentType);
                    return componentType;
                }
                boolean z10 = type2 instanceof GenericArrayType;
                int i7 = this.f7066d;
                if (z10) {
                    if (i7 == 0) {
                        Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                        i9.l.b(genericComponentType);
                        return genericComponentType;
                    }
                    throw new cc.a0(2, "Array type has been queried for a non-0th argument: " + n1Var);
                }
                if (!(type2 instanceof ParameterizedType)) {
                    throw new cc.a0(2, "Non-generic type has been queried for arguments: " + n1Var);
                }
                Type type3 = (Type) ((List) this.f7065c.getValue()).get(i7);
                if (!(type3 instanceof WildcardType)) {
                    return type3;
                }
                WildcardType wildcardType = (WildcardType) type3;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                i9.l.d(lowerBounds, "getLowerBounds(...)");
                Type type4 = (Type) u8.l.x0(lowerBounds);
                if (type4 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    i9.l.d(upperBounds, "getUpperBounds(...)");
                    type = (Type) u8.l.w0(upperBounds);
                } else {
                    type = type4;
                }
                i9.l.b(type);
                return type;
        }
    }
}

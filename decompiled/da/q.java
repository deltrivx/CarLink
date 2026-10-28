package da;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends b0 implements na.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f3883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f3884b;

    public q(Type type) {
        s oVar;
        i9.l.e(type, "reflectType");
        this.f3883a = type;
        if (type instanceof Class) {
            oVar = new o((Class) type);
        } else if (type instanceof TypeVariable) {
            oVar = new c0((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            i9.l.c(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            oVar = new o((Class) rawType);
        }
        this.f3884b = oVar;
    }

    @Override // da.b0, na.b
    public final e a(wa.c cVar) {
        i9.l.e(cVar, "fqName");
        return null;
    }

    @Override // da.b0
    public final Type b() {
        return this.f3883a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    public final ArrayList c() {
        b0 iVar;
        b0 zVar;
        List<Type> listC = d.c(this.f3883a);
        ArrayList arrayList = new ArrayList(u8.q.a0(listC, 10));
        for (Type type : listC) {
            i9.l.e(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    zVar = new z(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) {
                        iVar = new i(type);
                    } else {
                        iVar = type instanceof WildcardType ? new e0((WildcardType) type) : new q(type);
                    }
                    zVar = iVar;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    iVar = new i(type);
                } else {
                    iVar = new i(type);
                }
                zVar = iVar;
            }
            arrayList.add(zVar);
        }
        return arrayList;
    }

    public final boolean d() {
        Type type = this.f3883a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            i9.l.d(typeParameters, "getTypeParameters(...)");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // na.b
    public final Collection getAnnotations() {
        return u8.w.f13122a;
    }
}

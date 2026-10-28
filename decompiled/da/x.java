package da;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x extends w implements na.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f3889a;

    public x(Method method) {
        i9.l.e(method, "member");
        this.f3889a = method;
    }

    @Override // da.w
    public final Member b() {
        return this.f3889a;
    }

    public final b0 f() {
        Type genericReturnType = this.f3889a.getGenericReturnType();
        i9.l.d(genericReturnType, "getGenericReturnType(...)");
        boolean z10 = genericReturnType instanceof Class;
        if (z10) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new z(cls);
            }
        }
        if ((genericReturnType instanceof GenericArrayType) || (z10 && ((Class) genericReturnType).isArray())) {
            return new i(genericReturnType);
        }
        return genericReturnType instanceof WildcardType ? new e0((WildcardType) genericReturnType) : new q(genericReturnType);
    }

    public final List g() {
        Method method = this.f3889a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        i9.l.d(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        i9.l.d(parameterAnnotations, "getParameterAnnotations(...)");
        return d(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // na.e
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f3889a.getTypeParameters();
        i9.l.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new c0(typeVariable));
        }
        return arrayList;
    }
}

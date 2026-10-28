package da;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b0 implements na.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f3873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f3874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u8.w f3875c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Type type) {
        b0 zVar;
        b0 zVar2;
        this.f3873a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    i9.l.d(componentType, "getComponentType(...)");
                    zVar = componentType.isPrimitive() ? new z(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new i(componentType) : componentType instanceof WildcardType ? new e0((WildcardType) componentType) : new q(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        i9.l.d(genericComponentType, "getGenericComponentType(...)");
        boolean z10 = genericComponentType instanceof Class;
        if (z10) {
            Class cls2 = (Class) genericComponentType;
            zVar2 = cls2.isPrimitive() ? new z(cls2) : zVar2;
            this.f3874b = zVar2;
            this.f3875c = u8.w.f13122a;
        }
        zVar = ((genericComponentType instanceof GenericArrayType) || (z10 && ((Class) genericComponentType).isArray())) ? new i(genericComponentType) : genericComponentType instanceof WildcardType ? new e0((WildcardType) genericComponentType) : new q(genericComponentType);
        zVar2 = zVar;
        this.f3874b = zVar2;
        this.f3875c = u8.w.f13122a;
    }

    @Override // da.b0
    public final Type b() {
        return this.f3873a;
    }

    @Override // na.b
    public final Collection getAnnotations() {
        return this.f3875c;
    }
}

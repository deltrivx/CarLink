package da;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends b0 implements na.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WildcardType f3869a;

    public e0(WildcardType wildcardType) {
        this.f3869a = wildcardType;
    }

    @Override // da.b0
    public final Type b() {
        return this.f3869a;
    }

    public final b0 c() {
        WildcardType wildcardType = this.f3869a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            Object objH0 = u8.l.H0(lowerBounds);
            i9.l.d(objH0, "single(...)");
            Type type = (Type) objH0;
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new z(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) {
                return new i(type);
            }
            return type instanceof WildcardType ? new e0((WildcardType) type) : new q(type);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        Type type2 = (Type) u8.l.H0(upperBounds);
        if (i9.l.a(type2, Object.class)) {
            return null;
        }
        i9.l.b(type2);
        boolean z11 = type2 instanceof Class;
        if (z11) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new z(cls2);
            }
        }
        if ((type2 instanceof GenericArrayType) || (z11 && ((Class) type2).isArray())) {
            return new i(type2);
        }
        return type2 instanceof WildcardType ? new e0((WildcardType) type2) : new q(type2);
    }

    @Override // na.b
    public final Collection getAnnotations() {
        return u8.w.f13122a;
    }
}

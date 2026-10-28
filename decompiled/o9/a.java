package o9;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements GenericArrayType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f9546a;

    public a(Type type) {
        i9.l.e(type, "elementType");
        this.f9546a = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return i9.l.a(this.f9546a, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f9546a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return e0.j(this.f9546a) + "[]";
    }

    public final int hashCode() {
        return this.f9546a.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}

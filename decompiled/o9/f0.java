package o9;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements WildcardType, Type {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f9559c = new f0(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f9560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f9561b;

    public f0(Type type, Type type2) {
        this.f9560a = type;
        this.f9561b = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f9561b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f9561b;
        if (type != null) {
            return "? super " + e0.j(type);
        }
        Type type2 = this.f9560a;
        if (type2 == null || i9.l.a(type2, Object.class)) {
            return "?";
        }
        return "? extends " + e0.j(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f9560a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}

package o9;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements ParameterizedType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f9547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f9548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type[] f9549c;

    public a0(Class cls, Type type, ArrayList arrayList) {
        this.f9547a = cls;
        this.f9548b = type;
        this.f9549c = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return i9.l.a(this.f9547a, parameterizedType.getRawType()) && i9.l.a(this.f9548b, parameterizedType.getOwnerType()) && Arrays.equals(this.f9549c, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f9549c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f9548b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f9547a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb2 = new StringBuilder();
        Class cls = this.f9547a;
        Type type = this.f9548b;
        if (type != null) {
            sb2.append(e0.j(type));
            sb2.append("$");
            sb2.append(cls.getSimpleName());
        } else {
            sb2.append(e0.j(cls));
        }
        Type[] typeArr = this.f9549c;
        if (typeArr.length != 0) {
            u8.l.E0(typeArr, sb2, ", ", "<", ">", "...", z.f9574i);
        }
        return sb2.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f9547a.hashCode();
        Type type = this.f9548b;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f9549c);
    }

    public final String toString() {
        return getTypeName();
    }
}

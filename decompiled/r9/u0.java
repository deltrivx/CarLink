package r9;

import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type[] f11767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11768b;

    public u0(Type[] typeArr) {
        i9.l.e(typeArr, "types");
        this.f11767a = typeArr;
        this.f11768b = Arrays.hashCode(typeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u0) {
            return Arrays.equals(this.f11767a, ((u0) obj).f11767a);
        }
        return false;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return u8.l.F0(this.f11767a, ", ", "[", "]", null, 56);
    }

    public final int hashCode() {
        return this.f11768b;
    }

    public final String toString() {
        return getTypeName();
    }
}

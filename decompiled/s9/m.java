package s9;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends w {
    /* JADX WARN: Illegal instructions before constructor call */
    public m(Field field, boolean z10) {
        Type genericType = field.getGenericType();
        i9.l.d(genericType, "getGenericType(...)");
        super(field, genericType, z10 ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // s9.g
    public Object t(Object[] objArr) {
        i9.l.e(objArr, "args");
        a(objArr);
        return ((Field) this.f12692a).get(this.f12694c != null ? u8.l.w0(objArr) : null);
    }
}

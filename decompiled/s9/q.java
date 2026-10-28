package s9;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12685e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12686f;

    /* JADX WARN: Illegal instructions before constructor call */
    public q(Field field, boolean z10, boolean z11) {
        Class cls = Void.TYPE;
        i9.l.d(cls, "TYPE");
        super(field, cls, z11 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()});
        this.f12686f = z10;
    }

    public /* synthetic */ q(Method method, boolean z10, int i7) {
        this(method, (i7 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10, method.getGenericParameterTypes());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(Method method, boolean z10, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        i9.l.d(genericReturnType, "getGenericReturnType(...)");
        super(method, genericReturnType, z10 ? method.getDeclaringClass() : null, typeArr);
        this.f12686f = genericReturnType.equals(Void.TYPE);
    }

    @Override // s9.w
    public void a(Object[] objArr) {
        switch (this.f12685e) {
            case 0:
                i9.l.e(objArr, "args");
                n4.h.m(this, objArr);
                if (this.f12686f && u8.l.G0(objArr) == null) {
                    throw new IllegalArgumentException("null is not allowed as a value for this property.");
                }
                return;
            default:
                super.a(objArr);
                return;
        }
    }

    public Object c(Object obj, Object[] objArr) {
        i9.l.e(objArr, "args");
        return this.f12686f ? t8.z.f12851a : ((Method) this.f12692a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // s9.g
    public Object t(Object[] objArr) throws IllegalAccessException {
        i9.l.e(objArr, "args");
        a(objArr);
        ((Field) this.f12692a).set(this.f12694c != null ? u8.l.w0(objArr) : null, u8.l.G0(objArr));
        return t8.z.f12851a;
    }
}

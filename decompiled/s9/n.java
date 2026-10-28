package s9;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends q implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f12683g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Field field, boolean z10, Object obj) {
        super(field, z10, false);
        i9.l.e(field, "field");
        this.f12683g = obj;
    }

    @Override // s9.q, s9.g
    public final Object t(Object[] objArr) throws IllegalAccessException {
        i9.l.e(objArr, "args");
        a(objArr);
        ((Field) this.f12692a).set(this.f12683g, u8.l.w0(objArr));
        return t8.z.f12851a;
    }
}

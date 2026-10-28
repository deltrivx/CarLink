package s9;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends m implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f12681e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Field field, Object obj) {
        super(field, false);
        i9.l.e(field, "field");
        this.f12681e = obj;
    }

    @Override // s9.m, s9.g
    public final Object t(Object[] objArr) {
        i9.l.e(objArr, "args");
        n4.h.m(this, objArr);
        return ((Field) this.f12692a).get(this.f12681e);
    }
}

package s9;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v extends q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12691g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Method method) {
        super(method, false, 6);
        this.f12691g = 0;
        i9.l.e(method, "method");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Method method, boolean z10, int i7, int i10) {
        super(method, z10, i7);
        this.f12691g = i10;
    }

    @Override // s9.q, s9.g
    public final Object t(Object[] objArr) {
        switch (this.f12691g) {
            case 0:
                i9.l.e(objArr, "args");
                n4.h.m(this, objArr);
                return c(objArr[0], objArr.length <= 1 ? new Object[0] : u8.l.s0(objArr, 1, objArr.length));
            case 1:
                i9.l.e(objArr, "args");
                n4.h.m(this, objArr);
                b(u8.l.x0(objArr));
                return c(null, objArr.length <= 1 ? new Object[0] : u8.l.s0(objArr, 1, objArr.length));
            default:
                i9.l.e(objArr, "args");
                n4.h.m(this, objArr);
                return c(null, objArr);
        }
    }
}

package s9;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12682e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Field field, boolean z10, int i7) {
        super(field, z10);
        this.f12682e = i7;
    }

    @Override // s9.w
    public void a(Object[] objArr) {
        switch (this.f12682e) {
            case 1:
                i9.l.e(objArr, "args");
                n4.h.m(this, objArr);
                b(u8.l.x0(objArr));
                break;
            default:
                super.a(objArr);
                break;
        }
    }
}

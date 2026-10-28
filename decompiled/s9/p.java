package s9;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p extends q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12684g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Field field, boolean z10, boolean z11, int i7) {
        super(field, z10, z11);
        this.f12684g = i7;
    }

    @Override // s9.q, s9.w
    public void a(Object[] objArr) {
        switch (this.f12684g) {
            case 1:
                i9.l.e(objArr, "args");
                super.a(objArr);
                b(u8.l.x0(objArr));
                break;
            default:
                super.a(objArr);
                break;
        }
    }
}

package r3;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i9.n implements h9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f11546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f11547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f11548d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11549a;

    static {
        int i7 = 0;
        f11546b = new e(i7, 0);
        f11547c = new e(i7, 1);
        f11548d = new e(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i7, int i10) {
        super(i7);
        this.f11549a = i10;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f11549a) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}

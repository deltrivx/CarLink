package e2;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i9.n implements h9.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f4171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f4172c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4173a;

    static {
        int i7 = 0;
        f4171b = new h(i7, 0);
        f4172c = new h(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i7, int i10) {
        super(i7);
        this.f4173a = i10;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f4173a) {
            case 0:
                return new y1.i(new PathMeasure());
            default:
                return t8.z.f12851a;
        }
    }
}

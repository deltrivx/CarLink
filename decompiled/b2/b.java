package b2;

import t8.z;
import y1.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i9.n implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f1194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f1195c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1196a;

    static {
        int i7 = 1;
        f1194b = new b(i7, 0);
        f1195c = new b(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, int i10) {
        super(i7);
        this.f1196a = i10;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f1196a) {
            case 0:
                break;
            default:
                a2.f.w((a2.g) obj, q.f14957l, 0L, 0L, 126);
                break;
        }
        return z.f12851a;
    }
}

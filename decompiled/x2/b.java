package x2;

import h9.k;
import i9.n;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends n implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f14543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f14544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f14545d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14546a;

    static {
        int i7 = 1;
        f14543b = new b(i7, 0);
        f14544c = new b(i7, 1);
        f14545d = new b(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, int i10) {
        super(i7);
        this.f14546a = i10;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f14546a) {
            case 0:
                ((Number) obj).longValue();
                return z.f12851a;
            case 1:
                return Integer.valueOf(((h) obj).f14558b);
            default:
                n3.k kVar = ((h) obj).f14559c;
                return Integer.valueOf(kVar.f8744d - kVar.f8742b);
        }
    }
}

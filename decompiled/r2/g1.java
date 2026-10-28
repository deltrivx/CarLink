package r2;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends i9.n implements h9.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g1 f11235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g1 f11236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g1 f11237d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11238a;

    static {
        int i7 = 2;
        f11235b = new g1(i7, 0);
        f11236c = new g1(i7, 1);
        f11237d = new g1(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(int i7, int i10) {
        super(i7);
        this.f11238a = i10;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11238a) {
            case 0:
                f1.s sVar = (f1.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!sVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.Q();
                }
                break;
            case 1:
                ((l1) obj).K((Matrix) obj2);
                break;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                break;
        }
        return t8.z.f12851a;
    }
}

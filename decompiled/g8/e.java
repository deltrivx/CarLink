package g8;

import f1.s;
import h9.n;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f6014b;

    public /* synthetic */ e(f fVar, int i7, int i10) {
        this.f6013a = i10;
        this.f6014b = fVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f6013a;
        s sVar = (s) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                this.f6014b.c(f1.b.y(1), sVar);
                break;
            default:
                this.f6014b.i(f1.b.y(1), sVar);
                break;
        }
        return z.f12851a;
    }
}

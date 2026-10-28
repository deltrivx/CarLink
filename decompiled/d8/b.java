package d8;

import com.baidu.carlife.sdk.util.Logger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f3793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3794c;

    public /* synthetic */ b(f fVar, boolean z10, int i7) {
        this.f3792a = i7;
        this.f3793b = fVar;
        this.f3794c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3792a) {
            case 0:
                f fVar = this.f3793b;
                boolean z10 = this.f3794c;
                try {
                    a aVar = fVar.f3801c;
                    if (aVar != null) {
                        aVar.a(z10);
                    }
                } catch (Exception e7) {
                    Logger.INSTANCE.e("TaskerDesaySV", "回调业务逻辑异常", e7);
                    return;
                }
                break;
            default:
                f fVar2 = this.f3793b;
                boolean z11 = this.f3794c;
                a aVar2 = fVar2.f3801c;
                if (aVar2 != null) {
                    aVar2.a(z11);
                }
                break;
        }
    }
}

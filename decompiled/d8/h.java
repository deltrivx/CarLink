package d8;

import com.baidu.carlife.sdk.util.Logger;
import i9.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3807a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h9.k f3809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f3810d;

    public /* synthetic */ h(int i7, h9.k kVar, x xVar) {
        this.f3808b = i7;
        this.f3809c = kVar;
        this.f3810d = xVar;
    }

    public /* synthetic */ h(x xVar, int i7, h9.k kVar) {
        this.f3810d = xVar;
        this.f3808b = i7;
        this.f3809c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f3807a;
        x xVar = this.f3810d;
        h9.k kVar = this.f3809c;
        int i10 = this.f3808b;
        switch (i7) {
            case 0:
                ((j) xVar.f6688a).f3814c = true;
                Logger.INSTANCE.d("CarLife_Vehicle", a2.f.E(i10, "【按键事件】触发长按: "));
                kVar.invoke(2);
                break;
            default:
                Logger.INSTANCE.d("CarLife_Vehicle", a2.f.E(i10, "【按键事件】触发单击: "));
                kVar.invoke(0);
                ((j) xVar.f6688a).f3813b = 0;
                break;
        }
    }
}

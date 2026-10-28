package g7;

import android.os.Handler;
import e8.z0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5965c;

    public /* synthetic */ e(Object obj, int i7, boolean z10) {
        this.f5963a = i7;
        this.f5965c = obj;
        this.f5964b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5963a) {
            case 0:
                g gVar = (g) this.f5965c;
                gVar.f5971c.e(this.f5964b);
                break;
            case 1:
                r5.a aVar = (r5.a) this.f5965c;
                aVar.f11625a.e(this.f5964b);
                break;
            default:
                r5.f fVar = (r5.f) ((z0) this.f5965c).f4662b;
                fVar.f11635f = this.f5964b;
                if (fVar.f11632c) {
                    Handler handler = fVar.f11633d;
                    handler.removeCallbacksAndMessages(null);
                    if (fVar.f11635f) {
                        handler.postDelayed(fVar.f11634e, 300000L);
                    }
                }
                break;
        }
    }
}

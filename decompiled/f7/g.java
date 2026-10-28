package f7;

import android.content.Intent;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f5413b;

    public /* synthetic */ g(j jVar, int i7) {
        this.f5412a = i7;
        this.f5413b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f5412a;
        j jVar = this.f5413b;
        switch (i7) {
            case 0:
                Log.d("j", "Finishing due to inactivity");
                jVar.f5417a.finish();
                break;
            default:
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.putExtra("TIMEOUT", true);
                jVar.f5417a.setResult(0, intent);
                jVar.a();
                break;
        }
    }
}

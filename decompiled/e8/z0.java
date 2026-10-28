package e8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4662b;

    public /* synthetic */ z0(int i7, Object obj) {
        this.f4661a = i7;
        this.f4662b = obj;
    }

    public z0(b1 b1Var, f1.b1 b1Var2) {
        this.f4661a = 0;
        this.f4662b = b1Var2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f4661a) {
            case 0:
                f1.b1 b1Var = (f1.b1) this.f4662b;
                KeyEvent keyEvent = null;
                if (Build.VERSION.SDK_INT >= 33) {
                    if (intent != null) {
                        keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT", KeyEvent.class);
                    }
                } else if (intent != null) {
                    keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                }
                if (keyEvent != null) {
                    b1Var.setValue(String.valueOf(keyEvent.getKeyCode()));
                }
                break;
            case 1:
                ((e6.f) this.f4662b).l();
                break;
            default:
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    ((r5.f) this.f4662b).f11633d.post(new g7.e(this, 2, intent.getIntExtra("plugged", -1) <= 0));
                }
                break;
        }
    }
}

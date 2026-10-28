package u3;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import o9.e0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends Activity implements t, e4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f13057a = new v(this, true);

    @Override // e4.j
    public final boolean c(KeyEvent keyEvent) {
        i9.l.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        i9.l.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        i9.l.d(decorView, "window.decorView");
        if (e0.s(decorView, keyEvent)) {
            return true;
        }
        return e0.t(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        i9.l.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        i9.l.d(decorView, "window.decorView");
        if (e0.s(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i7 = f0.f1028b;
        d0.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        i9.l.e(bundle, "outState");
        this.f13057a.g(o.f1058c);
        super.onSaveInstanceState(bundle);
    }
}

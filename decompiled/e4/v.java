package e4;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v extends a2.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f4411c;

    @Override // a2.d
    public final void A() {
        View view = this.f4411c;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.A();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [e4.u] */
    @Override // a2.d
    public final void p() {
        View view = this.f4411c;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.p();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r8 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: e4.u
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i7) {
                atomicBoolean.set((i7 & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(r8);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(r8);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }
}

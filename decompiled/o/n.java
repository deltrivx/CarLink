package o;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e0 f9199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j.h f9200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f9201c;

    @Override // o.x
    public final boolean J(m mVar) {
        return false;
    }

    @Override // o.x
    public final void b(m mVar, boolean z10) {
        j.h hVar;
        if ((z10 || mVar == this.f9199a) && (hVar = this.f9200b) != null) {
            hVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        e0 e0Var = this.f9199a;
        i iVar = this.f9201c;
        if (iVar.f9168f == null) {
            iVar.f9168f = new h(iVar);
        }
        e0Var.q(iVar.f9168f.getItem(i7), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f9201c.b(this.f9199a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        e0 e0Var = this.f9199a;
        if (i7 == 82 || i7 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f9200b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f9200b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                e0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return e0Var.performShortcut(i7, keyEvent, 0);
    }
}

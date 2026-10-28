package n4;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyListener f8777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f8778b;

    public f(KeyListener keyListener) {
        e eVar = new e(0);
        this.f8777a = keyListener;
        this.f8778b = eVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i7) {
        this.f8777a.clearMetaKeyState(view, editable, i7);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f8777a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i7, KeyEvent keyEvent) {
        boolean zW;
        boolean z10;
        this.f8778b.getClass();
        if (i7 != 67) {
            zW = i7 != 112 ? false : a2.b.w(editable, keyEvent, true);
        } else {
            zW = a2.b.w(editable, keyEvent, false);
        }
        if (zW) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 || this.f8777a.onKeyDown(view, editable, i7, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f8777a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f8777a.onKeyUp(view, editable, i7, keyEvent);
    }
}

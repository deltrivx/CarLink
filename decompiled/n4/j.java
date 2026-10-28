package n4;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends l4.h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f8785a;

    public j(EditText editText) {
        this.f8785a = new WeakReference(editText);
    }

    @Override // l4.h
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.f8785a.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.a((EditText) this.f8785a.get(), 1);
    }
}

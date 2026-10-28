package g3;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class m extends l {
    @Override // g3.l
    public final void a(u0.q qVar) {
        qVar.closeConnection();
    }

    @Override // g3.l, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i10) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.deleteSurroundingTextInCodePoints(i7, i10);
        }
        return false;
    }

    @Override // g3.l, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }
}

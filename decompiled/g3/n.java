package g3;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class n extends m {
    @Override // g3.l, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.commitContent(inputContentInfo, i7, bundle);
        }
        return false;
    }
}

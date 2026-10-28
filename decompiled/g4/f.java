package g4;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f5914a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InputConnection inputConnection, e eVar) {
        super(inputConnection, false);
        this.f5914a = eVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        a2.d dVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            dVar = new a2.d(21, new h(inputContentInfo));
        }
        if (this.f5914a.b(dVar, i7, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i7, bundle);
    }
}

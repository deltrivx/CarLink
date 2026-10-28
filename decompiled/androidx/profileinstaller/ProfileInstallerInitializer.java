package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import d5.b;
import g3.b0;
import java.util.Collections;
import java.util.List;
import n4.e;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // d5.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // d5.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new e(28);
        }
        Choreographer.getInstance().postFrameCallback(new b0(this, context.getApplicationContext()));
        return new e(28);
    }
}

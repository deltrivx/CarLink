package n8;

import android.media.session.MediaSessionManager;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextSelection;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ TextClassification.Request.Builder d(CharSequence charSequence, int i7, int i10) {
        return new TextClassification.Request.Builder(charSequence, i7, i10);
    }

    public static /* synthetic */ TextClassificationContext.Builder g(String str, String str2) {
        return new TextClassificationContext.Builder(str, str2);
    }

    public static /* synthetic */ TextSelection.Request.Builder k(CharSequence charSequence, int i7, int i10) {
        return new TextSelection.Request.Builder(charSequence, i7, i10);
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void s(String str, int i7, int i10) {
        new MediaSessionManager.RemoteUserInfo(str, i7, i10);
    }

    public static /* synthetic */ void y() {
    }
}

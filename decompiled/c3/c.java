package c3;

import android.content.ClipData;
import android.view.ContentInfo;
import android.view.ScrollCaptureSession;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ ContentInfo.Builder e(ClipData clipData, int i7) {
        return new ContentInfo.Builder(clipData, i7);
    }

    public static /* bridge */ /* synthetic */ ContentInfo g(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession h(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ViewTranslationRequest.Builder m(AutofillId autofillId, long j5) {
        return new ViewTranslationRequest.Builder(autofillId, j5);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse o(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ void q() {
    }
}

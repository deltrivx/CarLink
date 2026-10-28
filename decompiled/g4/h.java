package g4;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputContentInfo f5916a;

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f5916a = new InputContentInfo(uri, clipDescription, uri2);
    }

    public h(Object obj) {
        this.f5916a = (InputContentInfo) obj;
    }

    @Override // g4.i
    public final ClipDescription a() {
        return this.f5916a.getDescription();
    }

    @Override // g4.i
    public final Uri h() {
        return this.f5916a.getContentUri();
    }

    @Override // g4.i
    public final void i() {
        this.f5916a.requestPermission();
    }

    @Override // g4.i
    public final Uri j() {
        return this.f5916a.getLinkUri();
    }

    @Override // g4.i
    public final Object o() {
        return this.f5916a;
    }
}

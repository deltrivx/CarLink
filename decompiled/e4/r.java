package e4;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProvider f4395a;

    public r(NestedScrollView nestedScrollView) {
        this.f4395a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // e4.s
    public final void onScrollLimit(int i7, int i10, int i11, boolean z10) {
        this.f4395a.onScrollLimit(i7, i10, i11, z10);
    }

    @Override // e4.s
    public final void onScrollProgress(int i7, int i10, int i11, int i12) {
        this.f4395a.onScrollProgress(i7, i10, i11, i12);
    }
}

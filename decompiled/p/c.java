package p;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f9680b;

    public /* synthetic */ c(ActionBarOverlayLayout actionBarOverlayLayout, int i7) {
        this.f9679a = i7;
        this.f9680b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9679a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f9680b;
                actionBarOverlayLayout.c();
                actionBarOverlayLayout.f685w = actionBarOverlayLayout.f667d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f686x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f9680b;
                actionBarOverlayLayout2.c();
                actionBarOverlayLayout2.f685w = actionBarOverlayLayout2.f667d.animate().translationY(-actionBarOverlayLayout2.f667d.getHeight()).setListener(actionBarOverlayLayout2.f686x);
                break;
        }
    }
}

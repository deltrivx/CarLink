package b2;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import r2.s2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1293a;

    public /* synthetic */ o(int i7) {
        this.f1293a = i7;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f1293a) {
            case 0:
                if ((view instanceof p) && (outline2 = ((p) view).f1298e) != null) {
                    outline.set(outline2);
                    break;
                }
                break;
            case 1:
                i9.l.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                Outline outlineB = ((s2) view).f11411e.b();
                i9.l.b(outlineB);
                outline.set(outlineB);
                break;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            default:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
        }
    }
}

package o;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends FrameLayout implements n.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f9229a;

    /* JADX WARN: Multi-variable type inference failed */
    public q(View view) {
        super(view.getContext());
        this.f9229a = (CollapsibleActionView) view;
        addView(view);
    }
}

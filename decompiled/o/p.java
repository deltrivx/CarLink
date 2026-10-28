package o;

import android.view.ActionProvider;
import l0.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0 f9227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionProvider f9228b;

    public p(t tVar, ActionProvider actionProvider) {
        this.f9228b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z10) {
        o0 o0Var = this.f9227a;
        if (o0Var != null) {
            m mVar = ((o) o0Var.f7772b).f9214n;
            mVar.f9183h = true;
            mVar.p(true);
        }
    }
}

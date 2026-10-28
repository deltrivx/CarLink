package oa;

import androidx.appcompat.widget.ActionBarContextView;
import e4.s0;
import nb.a0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9581c;

    public c(ActionBarContextView actionBarContextView) {
        this.f9581c = actionBarContextView;
        this.f9579a = false;
    }

    public c(a0 a0Var, int i7, boolean z10) {
        this.f9581c = a0Var;
        this.f9580b = i7;
        this.f9579a = z10;
    }

    @Override // e4.s0
    public void a() {
        this.f9579a = true;
    }

    @Override // e4.s0
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f9579a = false;
    }

    @Override // e4.s0
    public void c() {
        if (this.f9579a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f9581c;
        actionBarContextView.f650f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f9580b);
    }
}

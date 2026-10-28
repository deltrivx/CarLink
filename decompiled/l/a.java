package l;

import android.graphics.drawable.Animatable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Animatable f7538g;

    public /* synthetic */ a(Animatable animatable, int i7) {
        this.f7537f = i7;
        this.f7538g = animatable;
    }

    @Override // a.a
    public final void U() {
        switch (this.f7537f) {
            case 0:
                this.f7538g.start();
                break;
            default:
                ((f5.e) this.f7538g).start();
                break;
        }
    }

    @Override // a.a
    public final void V() {
        switch (this.f7537f) {
            case 0:
                this.f7538g.stop();
                break;
            default:
                ((f5.e) this.f7538g).stop();
                break;
        }
    }
}

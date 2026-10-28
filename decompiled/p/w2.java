package p;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f9952b;

    public /* synthetic */ w2(Toolbar toolbar, int i7) {
        this.f9951a = i7;
        this.f9952b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9951a) {
            case 0:
                z2 z2Var = this.f9952b.L;
                o.o oVar = z2Var == null ? null : z2Var.f9990b;
                if (oVar != null) {
                    oVar.collapseActionView();
                }
                break;
            default:
                this.f9952b.m();
                break;
        }
    }
}

package h0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f6317b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f6318c;

    public g0(i0 i0Var, int i7) {
        this.f6318c = i0Var;
        this.f6316a = i7;
    }

    public final void a(int i7) {
        i0 i0Var = this.f6318c;
        f1.t0 t0Var = i0Var.f6325c;
        if (t0Var == null) {
            return;
        }
        this.f6317b.add(new s0(t0Var, i7, i0Var.f6324b, null));
    }
}

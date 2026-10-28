package x;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h1 f14384b = new h1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h1 f14385c = new h1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14386a;

    public /* synthetic */ h1(int i7) {
        this.f14386a = i7;
    }

    @Override // x.f1
    public final e1 a(View view, n3.c cVar) {
        switch (this.f14386a) {
            case 0:
                return new g1(new Magnifier(view));
            default:
                return new i1(new Magnifier(view));
        }
    }

    @Override // x.f1
    public final boolean b() {
        switch (this.f14386a) {
            case 0:
                return false;
            default:
                return true;
        }
    }
}

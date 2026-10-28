package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c0 f1015i = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1017b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f1020e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1018c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1019d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f1021f = new v(this, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z f1022g = new z(0, this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2.d f1023h = new a2.d(2, this);

    public final void a() {
        int i7 = this.f1017b + 1;
        this.f1017b = i7;
        if (i7 == 1) {
            if (this.f1018c) {
                this.f1021f.d(n.ON_RESUME);
                this.f1018c = false;
            } else {
                Handler handler = this.f1020e;
                i9.l.b(handler);
                handler.removeCallbacks(this.f1022g);
            }
        }
    }

    @Override // androidx.lifecycle.t
    public final v g() {
        return this.f1021f;
    }
}

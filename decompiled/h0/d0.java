package h0;

import f1.k1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f6301b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d0 f6304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6305f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6302c = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k1 f6306g = f1.b.s(null);

    public d0(Object obj, f0 f0Var) {
        this.f6300a = obj;
        this.f6301b = f0Var;
    }

    public final d0 a() {
        if (this.f6305f) {
            c0.b.c("Pin should not be called on an already disposed item ");
        }
        if (this.f6303d == 0) {
            this.f6301b.f6314a.add(this);
            d0 d0Var = (d0) this.f6306g.getValue();
            if (d0Var != null) {
                d0Var.a();
            } else {
                d0Var = null;
            }
            this.f6304e = d0Var;
        }
        this.f6303d++;
        return this;
    }

    public final void b() {
        if (this.f6305f) {
            return;
        }
        if (this.f6303d <= 0) {
            c0.b.c("Release should only be called once");
        }
        int i7 = this.f6303d - 1;
        this.f6303d = i7;
        if (i7 == 0) {
            this.f6301b.f6314a.remove(this);
            d0 d0Var = this.f6304e;
            if (d0Var != null) {
                d0Var.b();
            }
            this.f6304e = null;
        }
    }
}

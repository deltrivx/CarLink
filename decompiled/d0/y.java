package d0;

import android.os.Build;
import android.view.View;
import e4.b1;
import e4.o1;
import e4.s1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y extends e4.t0 implements Runnable, e4.o, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f3669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s1 f3672f;

    public y(v0 v0Var) {
        super(!v0Var.f3658r ? 1 : 0);
        this.f3669c = v0Var;
    }

    @Override // e4.t0
    public final void a(b1 b1Var) {
        this.f3670d = false;
        this.f3671e = false;
        s1 s1Var = this.f3672f;
        if (b1Var.f4321a.b() > 0 && s1Var != null) {
            o1 o1Var = s1Var.f4398a;
            v0 v0Var = this.f3669c;
            v0Var.f3657q.f(c.e(o1Var.g(8)));
            v0Var.f3656p.f(c.e(o1Var.g(8)));
            v0.a(v0Var, s1Var);
        }
        this.f3672f = null;
    }

    @Override // e4.t0
    public final void b() {
        this.f3670d = true;
        this.f3671e = true;
    }

    @Override // e4.t0
    public final s1 c(s1 s1Var, List list) {
        v0 v0Var = this.f3669c;
        v0.a(v0Var, s1Var);
        return v0Var.f3658r ? s1.f4397b : s1Var;
    }

    @Override // e4.o
    public final s1 d(View view, s1 s1Var) {
        this.f3672f = s1Var;
        v0 v0Var = this.f3669c;
        s0 s0Var = v0Var.f3656p;
        o1 o1Var = s1Var.f4398a;
        s0Var.f(c.e(o1Var.g(8)));
        if (this.f3670d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f3671e) {
            v0Var.f3657q.f(c.e(o1Var.g(8)));
            v0.a(v0Var, s1Var);
        }
        return v0Var.f3658r ? s1.f4397b : s1Var;
    }

    @Override // e4.t0
    public final android.support.v4.media.session.r e(b1 b1Var, android.support.v4.media.session.r rVar) {
        this.f3670d = false;
        return rVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3670d) {
            this.f3670d = false;
            this.f3671e = false;
            s1 s1Var = this.f3672f;
            if (s1Var != null) {
                v0 v0Var = this.f3669c;
                v0Var.f3657q.f(c.e(s1Var.f4398a.g(8)));
                v0.a(v0Var, s1Var);
                this.f3672f = null;
            }
        }
    }
}

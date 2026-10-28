package n;

import android.view.View;
import android.view.animation.Interpolator;
import e4.r0;
import e4.s0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f8696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s0 f8697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8698e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8695b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f8699f = new i(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8694a = new ArrayList();

    public final void a() {
        if (this.f8698e) {
            Iterator it = this.f8694a.iterator();
            while (it.hasNext()) {
                ((r0) it.next()).b();
            }
            this.f8698e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f8698e) {
            return;
        }
        for (r0 r0Var : this.f8694a) {
            long j5 = this.f8695b;
            if (j5 >= 0) {
                r0Var.c(j5);
            }
            Interpolator interpolator = this.f8696c;
            if (interpolator != null && (view = (View) r0Var.f4396a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f8697d != null) {
                r0Var.d(this.f8699f);
            }
            View view2 = (View) r0Var.f4396a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f8698e = true;
    }
}

package p4;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends n4.h implements s0, androidx.lifecycle.t, a5.g, x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j.j f10203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j.j f10204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f10205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f10206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j.j f10207g;

    public k(j.j jVar) {
        super(3);
        this.f10207g = jVar;
        Handler handler = new Handler();
        this.f10206f = new u();
        this.f10203c = jVar;
        this.f10204d = jVar;
        this.f10205e = handler;
    }

    @Override // n4.h
    public final View U(int i7) {
        return this.f10207g.findViewById(i7);
    }

    @Override // n4.h
    public final boolean V() {
        Window window = this.f10207g.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p4.x
    public final void a() {
    }

    @Override // androidx.lifecycle.s0
    public final r0 b() {
        return this.f10207g.b();
    }

    @Override // a5.g
    public final android.support.v4.media.session.r d() {
        return this.f10207g.f1774d.f46b;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v g() {
        return this.f10207g.f10209t;
    }
}

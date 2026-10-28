package j;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends n.a implements o.k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f6808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o.m f6809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u0.k f6810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f6811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k0 f6812h;

    public j0(k0 k0Var, Context context, u0.k kVar) {
        this.f6812h = k0Var;
        this.f6808d = context;
        this.f6810f = kVar;
        o.m mVar = new o.m(context);
        mVar.f9186l = 1;
        this.f6809e = mVar;
        mVar.f9180e = this;
    }

    @Override // o.k
    public final void R(o.m mVar) {
        if (this.f6810f == null) {
            return;
        }
        i();
        p.k kVar = this.f6812h.k.f648d;
        if (kVar != null) {
            kVar.l();
        }
    }

    @Override // n.a
    public final void b() {
        k0 k0Var = this.f6812h;
        if (k0Var.f6820n != this) {
            return;
        }
        if (k0Var.f6827u) {
            k0Var.f6821o = this;
            k0Var.f6822p = this.f6810f;
        } else {
            this.f6810f.a1(this);
        }
        this.f6810f = null;
        k0Var.W(false);
        ActionBarContextView actionBarContextView = k0Var.k;
        if (actionBarContextView.k == null) {
            actionBarContextView.e();
        }
        k0Var.f6815h.setHideOnContentScrollEnabled(k0Var.f6832z);
        k0Var.f6820n = null;
    }

    @Override // n.a
    public final View c() {
        WeakReference weakReference = this.f6811g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // n.a
    public final o.m e() {
        return this.f6809e;
    }

    @Override // n.a
    public final MenuInflater f() {
        return new n.h(this.f6808d);
    }

    @Override // n.a
    public final CharSequence g() {
        return this.f6812h.k.getSubtitle();
    }

    @Override // n.a
    public final CharSequence h() {
        return this.f6812h.k.getTitle();
    }

    @Override // n.a
    public final void i() {
        if (this.f6812h.f6820n != this) {
            return;
        }
        o.m mVar = this.f6809e;
        mVar.w();
        try {
            this.f6810f.b1(this, mVar);
        } finally {
            mVar.v();
        }
    }

    @Override // n.a
    public final boolean j() {
        return this.f6812h.k.f662s;
    }

    @Override // n.a
    public final void l(View view) {
        this.f6812h.k.setCustomView(view);
        this.f6811g = new WeakReference(view);
    }

    @Override // n.a
    public final void m(int i7) {
        n(this.f6812h.f6813f.getResources().getString(i7));
    }

    @Override // n.a
    public final void n(CharSequence charSequence) {
        this.f6812h.k.setSubtitle(charSequence);
    }

    @Override // n.a
    public final void o(int i7) {
        p(this.f6812h.f6813f.getResources().getString(i7));
    }

    @Override // n.a
    public final void p(CharSequence charSequence) {
        this.f6812h.k.setTitle(charSequence);
    }

    @Override // o.k
    public final boolean q(o.m mVar, MenuItem menuItem) {
        u0.k kVar = this.f6810f;
        if (kVar != null) {
            return ((da.a) kVar.f12990b).D(this, menuItem);
        }
        return false;
    }

    @Override // n.a
    public final void r(boolean z10) {
        this.f8640b = z10;
        this.f6812h.k.setTitleOptional(z10);
    }
}

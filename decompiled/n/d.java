package n;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a implements o.k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f8648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContextView f8649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u0.k f8650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f8651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o.m f8653i;

    @Override // o.k
    public final void R(o.m mVar) {
        i();
        p.k kVar = this.f8649e.f648d;
        if (kVar != null) {
            kVar.l();
        }
    }

    @Override // n.a
    public final void b() {
        if (this.f8652h) {
            return;
        }
        this.f8652h = true;
        this.f8650f.a1(this);
    }

    @Override // n.a
    public final View c() {
        WeakReference weakReference = this.f8651g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // n.a
    public final o.m e() {
        return this.f8653i;
    }

    @Override // n.a
    public final MenuInflater f() {
        return new h(this.f8649e.getContext());
    }

    @Override // n.a
    public final CharSequence g() {
        return this.f8649e.getSubtitle();
    }

    @Override // n.a
    public final CharSequence h() {
        return this.f8649e.getTitle();
    }

    @Override // n.a
    public final void i() {
        this.f8650f.b1(this, this.f8653i);
    }

    @Override // n.a
    public final boolean j() {
        return this.f8649e.f662s;
    }

    @Override // n.a
    public final void l(View view) {
        this.f8649e.setCustomView(view);
        this.f8651g = view != null ? new WeakReference(view) : null;
    }

    @Override // n.a
    public final void m(int i7) {
        n(this.f8648d.getString(i7));
    }

    @Override // n.a
    public final void n(CharSequence charSequence) {
        this.f8649e.setSubtitle(charSequence);
    }

    @Override // n.a
    public final void o(int i7) {
        p(this.f8648d.getString(i7));
    }

    @Override // n.a
    public final void p(CharSequence charSequence) {
        this.f8649e.setTitle(charSequence);
    }

    @Override // o.k
    public final boolean q(o.m mVar, MenuItem menuItem) {
        return ((da.a) this.f8650f.f12990b).D(this, menuItem);
    }

    @Override // n.a
    public final void r(boolean z10) {
        this.f8640b = z10;
        this.f8649e.setTitleOptional(z10);
    }
}

package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends m implements SubMenu {
    public final o A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final m f9133z;

    public e0(Context context, m mVar, o oVar) {
        super(context);
        this.f9133z = mVar;
        this.A = oVar;
    }

    @Override // o.m
    public final boolean d(o oVar) {
        return this.f9133z.d(oVar);
    }

    @Override // o.m
    public final boolean e(m mVar, MenuItem menuItem) {
        return super.e(mVar, menuItem) || this.f9133z.e(mVar, menuItem);
    }

    @Override // o.m
    public final boolean f(o oVar) {
        return this.f9133z.f(oVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // o.m
    public final String j() {
        o oVar = this.A;
        int i7 = oVar != null ? oVar.f9202a : 0;
        if (i7 == 0) {
            return null;
        }
        return a2.f.E(i7, "android:menu:actionviewstates:");
    }

    @Override // o.m
    public final m k() {
        return this.f9133z.k();
    }

    @Override // o.m
    public final boolean m() {
        return this.f9133z.m();
    }

    @Override // o.m
    public final boolean n() {
        return this.f9133z.n();
    }

    @Override // o.m
    public final boolean o() {
        return this.f9133z.o();
    }

    @Override // o.m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f9133z.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i7) {
        u(0, null, i7, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i7) {
        u(i7, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i7) {
        this.A.setIcon(i7);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // o.m, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f9133z.setQwertyMode(z10);
    }
}

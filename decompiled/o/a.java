package o;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements z3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f9094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f9095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f9096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f9097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f9099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f9101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f9102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f9103j;
    public CharSequence k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f9104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f9105m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9106n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f9107o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9108p;

    @Override // z3.a
    public final p a() {
        return null;
    }

    @Override // z3.a
    public final z3.a b(p pVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f9101h;
        if (drawable != null) {
            if (this.f9106n || this.f9107o) {
                Drawable drawableF0 = n3.r.f0(drawable);
                this.f9101h = drawableF0;
                Drawable drawableMutate = drawableF0.mutate();
                this.f9101h = drawableMutate;
                if (this.f9106n) {
                    drawableMutate.setTintList(this.f9104l);
                }
                if (this.f9107o) {
                    this.f9101h.setTintMode(this.f9105m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // z3.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f9100g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f9099f;
    }

    @Override // z3.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f9103j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f9101h;
    }

    @Override // z3.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f9104l;
    }

    @Override // z3.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f9105m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f9096c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // z3.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f9098e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f9097d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f9094a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9095b;
        return charSequence != null ? charSequence : this.f9094a;
    }

    @Override // z3.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f9108p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f9108p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f9108p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f9108p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f9099f = Character.toLowerCase(c10);
        return this;
    }

    @Override // z3.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i7) {
        this.f9099f = Character.toLowerCase(c10);
        this.f9100g = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f9108p = (z10 ? 1 : 0) | (this.f9108p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f9108p = (z10 ? 2 : 0) | (this.f9108p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f9103j = charSequence;
        return this;
    }

    @Override // z3.a, android.view.MenuItem
    public final z3.a setContentDescription(CharSequence charSequence) {
        this.f9103j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f9108p = (z10 ? 16 : 0) | (this.f9108p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.f9101h = this.f9102i.getDrawable(i7);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f9101h = drawable;
        c();
        return this;
    }

    @Override // z3.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9104l = colorStateList;
        this.f9106n = true;
        c();
        return this;
    }

    @Override // z3.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9105m = mode;
        this.f9107o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f9096c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f9097d = c10;
        return this;
    }

    @Override // z3.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i7) {
        this.f9097d = c10;
        this.f9098e = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f9097d = c10;
        this.f9099f = Character.toLowerCase(c11);
        return this;
    }

    @Override // z3.a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i7, int i10) {
        this.f9097d = c10;
        this.f9098e = KeyEvent.normalizeMetaState(i7);
        this.f9099f = Character.toLowerCase(c11);
        this.f9100g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i7) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        this.f9094a = this.f9102i.getResources().getString(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f9094a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9095b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // z3.a, android.view.MenuItem
    public final z3.a setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        this.f9108p = (this.f9108p & 8) | (z10 ? 0 : 8);
        return this;
    }
}

package n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import o.b0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f8655b;

    public e(Context context, a aVar) {
        this.f8654a = context;
        this.f8655b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f8655b.b();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f8655b.c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new b0(this.f8654a, this.f8655b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f8655b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f8655b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f8655b.f8641c;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f8655b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f8655b.f8640b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f8655b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f8655b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f8655b.l(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i7) {
        this.f8655b.m(i7);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f8655b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f8655b.f8641c = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i7) {
        this.f8655b.o(i7);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f8655b.p(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f8655b.r(z10);
    }
}

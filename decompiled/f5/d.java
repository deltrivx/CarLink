package f5;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f5307a;

    public d(Drawable.ConstantState constantState) {
        this.f5307a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f5307a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f5307a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f5307a.newDrawable();
        eVar.f5313a = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f5310d);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f5307a.newDrawable(resources);
        eVar.f5313a = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f5310d);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f5307a.newDrawable(resources, theme);
        eVar.f5313a = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f5310d);
        return eVar;
    }
}

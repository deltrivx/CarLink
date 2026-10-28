package y3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable.ConstantState f15092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f15093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f15094d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i7 = this.f15091a;
        Drawable.ConstantState constantState = this.f15092b;
        return i7 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        c cVar = new c();
        cVar.f15088d = this;
        Drawable.ConstantState constantState = this.f15092b;
        if (constantState != null) {
            cVar.h(constantState.newDrawable(resources));
        }
        c.a();
        return cVar;
    }
}

package f5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f5353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f5354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f5355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f5357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f5358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f5359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5361j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f5362l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f5352a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new q(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new q(this);
    }
}

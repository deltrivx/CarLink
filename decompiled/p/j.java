package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.baidu.carlifevehicle.R;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f9792d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f9792d = kVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        n3.u.I(this, getContentDescription());
        setOnTouchListener(new o.b(this, this));
    }

    @Override // p.l
    public final boolean b() {
        return false;
    }

    @Override // p.l
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f9792d.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i7, int i10, int i11, int i12) {
        boolean frame = super.setFrame(i7, i10, i11, i12);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}

package b1;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r extends RippleDrawable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f1186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f1187f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y1.q f1189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f1190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1191d;

    public r(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f1188a = z10;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f1188a) {
            this.f1191d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f1191d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f1191d;
    }
}

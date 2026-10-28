package f5;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g7.l f5314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f5315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g7.l f5316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f5317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f5319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f5320j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint.Cap f5321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint.Join f5322m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f5323n;

    @Override // f5.l
    public final boolean a() {
        return this.f5316f.g() || this.f5314d.g();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // f5.l
    public final boolean b(int[] iArr) {
        boolean z10;
        g7.l lVar = this.f5316f;
        boolean z11 = true;
        if (lVar.g()) {
            ColorStateList colorStateList = (ColorStateList) lVar.f6000d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != lVar.f5998b) {
                lVar.f5998b = colorForState;
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        g7.l lVar2 = this.f5314d;
        if (lVar2.g()) {
            ColorStateList colorStateList2 = (ColorStateList) lVar2.f6000d;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != lVar2.f5998b) {
                lVar2.f5998b = colorForState2;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        return z10 | z11;
    }

    public float getFillAlpha() {
        return this.f5318h;
    }

    public int getFillColor() {
        return this.f5316f.f5998b;
    }

    public float getStrokeAlpha() {
        return this.f5317g;
    }

    public int getStrokeColor() {
        return this.f5314d.f5998b;
    }

    public float getStrokeWidth() {
        return this.f5315e;
    }

    public float getTrimPathEnd() {
        return this.f5320j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.f5319i;
    }

    public void setFillAlpha(float f10) {
        this.f5318h = f10;
    }

    public void setFillColor(int i7) {
        this.f5316f.f5998b = i7;
    }

    public void setStrokeAlpha(float f10) {
        this.f5317g = f10;
    }

    public void setStrokeColor(int i7) {
        this.f5314d.f5998b = i7;
    }

    public void setStrokeWidth(float f10) {
        this.f5315e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f5320j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f5319i = f10;
    }
}

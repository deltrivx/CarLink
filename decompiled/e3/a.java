package e3;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4280b;

    public /* synthetic */ a(float f10, int i7) {
        this.f4279a = i7;
        this.f4280b = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f4279a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f4280b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f4280b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f4279a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f4280b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f4280b);
                break;
        }
    }
}

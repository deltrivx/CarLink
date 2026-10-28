package e3;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4282b;

    public /* synthetic */ b(int i7, Object obj) {
        this.f4281a = i7;
        this.f4282b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f4281a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f4282b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f4282b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f4281a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f4282b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f4282b);
                break;
        }
    }
}

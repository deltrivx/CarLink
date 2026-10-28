package e3;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4286a;

    public g(float f10) {
        this.f4286a = f10;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i7, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        int i13 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i13 <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.f4286a);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / i13)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}

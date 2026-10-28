package a7;

import android.text.PrecomputedText;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ PrecomputedText.Params.Builder i(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ boolean x(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}

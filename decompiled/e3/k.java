package e3;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4307b;

    public k(boolean z10, boolean z11) {
        this.f4306a = z10;
        this.f4307b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f4306a);
        textPaint.setStrikeThruText(this.f4307b);
    }
}

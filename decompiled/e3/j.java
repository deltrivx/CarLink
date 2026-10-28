package e3;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4305d;

    public j(float f10, float f11, float f12, int i7) {
        this.f4302a = i7;
        this.f4303b = f10;
        this.f4304c = f11;
        this.f4305d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f4305d, this.f4303b, this.f4304c, this.f4302a);
    }
}

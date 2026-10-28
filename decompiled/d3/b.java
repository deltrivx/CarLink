package d3;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g5.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f3757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextPaint f3758d;

    public b(CharSequence charSequence, TextPaint textPaint) {
        this.f3757c = charSequence;
        this.f3758d = textPaint;
    }

    @Override // g5.a
    public final int U(int i7) {
        CharSequence charSequence = this.f3757c;
        return this.f3758d.getTextRunCursor(charSequence, 0, charSequence.length(), false, i7, 0);
    }

    @Override // g5.a
    public final int W(int i7) {
        CharSequence charSequence = this.f3757c;
        return this.f3758d.getTextRunCursor(charSequence, 0, charSequence.length(), false, i7, 2);
    }
}

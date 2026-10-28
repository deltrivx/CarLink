package e3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint.FontMetricsInt f4298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4301d;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f4298a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        l.j("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f4301d) {
            h3.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f4300c;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        this.f4301d = true;
        paint.getTextSize();
        this.f4298a = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            h3.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f4299b = (int) Math.ceil(0.0f);
        this.f4300c = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.f4301d) {
            h3.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f4299b;
    }
}

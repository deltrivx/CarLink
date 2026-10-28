package e3;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4293g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4294h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4295i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4296j = Integer.MIN_VALUE;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4297l;

    public h(float f10, int i7, boolean z10, boolean z11, float f11, boolean z12) {
        this.f4287a = f10;
        this.f4288b = i7;
        this.f4289c = z10;
        this.f4290d = z11;
        this.f4291e = f11;
        this.f4292f = z12;
        if ((0.0f > f11 || f11 > 1.0f) && f11 != -1.0f) {
            h3.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i7, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        int i13 = fontMetricsInt.descent;
        int i14 = fontMetricsInt.ascent;
        if (i13 - i14 <= 0) {
            return;
        }
        boolean z10 = i7 == 0;
        boolean z11 = i10 == this.f4288b;
        boolean z12 = this.f4290d;
        boolean z13 = this.f4289c;
        if (z10 && z11 && z13 && z12) {
            return;
        }
        if (this.f4293g == Integer.MIN_VALUE) {
            int i15 = i13 - i14;
            int iCeil = (int) Math.ceil(this.f4287a);
            int i16 = iCeil - i15;
            if (!this.f4292f || i16 > 0) {
                float fAbs = this.f4291e;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i16 <= 0 ? Math.ceil(i16 * fAbs) : Math.ceil((1.0f - fAbs) * i16));
                int i17 = fontMetricsInt.descent;
                int i18 = iCeil2 + i17;
                this.f4295i = i18;
                int i19 = i18 - iCeil;
                this.f4294h = i19;
                if (z13) {
                    i19 = fontMetricsInt.ascent;
                }
                this.f4293g = i19;
                if (z12) {
                    i18 = i17;
                }
                this.f4296j = i18;
                this.k = fontMetricsInt.ascent - i19;
                this.f4297l = i18 - i17;
            } else {
                int i20 = fontMetricsInt.ascent;
                this.f4294h = i20;
                int i21 = fontMetricsInt.descent;
                this.f4295i = i21;
                this.f4293g = i20;
                this.f4296j = i21;
                this.k = 0;
                this.f4297l = 0;
            }
        }
        fontMetricsInt.ascent = z10 ? this.f4293g : this.f4294h;
        fontMetricsInt.descent = z11 ? this.f4296j : this.f4295i;
    }
}

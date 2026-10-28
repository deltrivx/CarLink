package c3;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f2377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f2378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2380d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2381e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f2382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f2384h;

    public h(CharSequence charSequence, TextPaint textPaint, int i7) {
        this.f2377a = charSequence;
        this.f2378b = textPaint;
        this.f2379c = i7;
    }

    public final BoringLayout.Metrics a() {
        BoringLayout.Metrics metricsIsBoring;
        if (!this.f2383g) {
            TextDirectionHeuristic textDirectionHeuristicA = o.a(this.f2379c);
            int i7 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f2377a;
            TextPaint textPaint = this.f2378b;
            if (i7 >= 33) {
                metricsIsBoring = BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicA, true, null);
            } else {
                metricsIsBoring = !textDirectionHeuristicA.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            }
            this.f2382f = metricsIsBoring;
            this.f2383g = true;
        }
        return this.f2382f;
    }

    public final CharSequence b() {
        CharacterStyle[] characterStyleArr;
        CharSequence charSequence = this.f2384h;
        if (charSequence == null) {
            charSequence = this.f2377a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (k9.a.B(spanned, CharacterStyle.class) && (characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class)) != null && characterStyleArr.length != 0) {
                    i9.b bVarH = i9.l.h(characterStyleArr);
                    SpannableString spannableString = null;
                    while (bVarH.hasNext()) {
                        CharacterStyle characterStyle = (CharacterStyle) bVarH.next();
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence = spannableString;
                    }
                }
            }
            this.f2384h = charSequence;
        }
        return charSequence;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    public final float c() {
        if (!Float.isNaN(this.f2380d)) {
            return this.f2380d;
        }
        BoringLayout.Metrics metricsA = a();
        float fCeil = metricsA != null ? metricsA.width : -1;
        TextPaint textPaint = this.f2378b;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(b(), 0, b().length(), textPaint));
        }
        if (fCeil != 0.0f) {
            CharSequence charSequence = this.f2377a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (k9.a.B(spanned, e3.f.class) || k9.a.B(spanned, e3.e.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                    fCeil += 0.5f;
                }
            } else if (textPaint.getLetterSpacing() != 0.0f) {
                fCeil += 0.5f;
            }
        }
        this.f2380d = fCeil;
        return fCeil;
    }
}

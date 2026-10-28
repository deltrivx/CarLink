package c4;

import a7.f;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f2421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f2422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2424d;

    public a(PrecomputedText.Params params) {
        this.f2421a = params.getTextPaint();
        this.f2422b = params.getTextDirection();
        this.f2423c = params.getBreakStrategy();
        this.f2424d = params.getHyphenationFrequency();
    }

    public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i7, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            f.i(textPaint).setBreakStrategy(i7).setHyphenationFrequency(i10).setTextDirection(textDirectionHeuristic).build();
        }
        this.f2421a = textPaint;
        this.f2422b = textDirectionHeuristic;
        this.f2423c = i7;
        this.f2424d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 23 && (this.f2423c != aVar.f2423c || this.f2424d != aVar.f2424d)) {
            return false;
        }
        TextPaint textPaint = this.f2421a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = aVar.f2421a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags()) {
            return false;
        }
        if (i7 >= 24) {
            if (!textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                return false;
            }
        } else if (!textPaint.getTextLocale().equals(textPaint2.getTextLocale())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f2422b == aVar.f2422b;
    }

    public final int hashCode() {
        int i7 = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = this.f2422b;
        int i10 = this.f2424d;
        int i11 = this.f2423c;
        TextPaint textPaint = this.f2421a;
        return i7 >= 24 ? Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i11), Integer.valueOf(i10)) : Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i11), Integer.valueOf(i10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f2421a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i7 = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i7 >= 24) {
            sb2.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb2.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i7 >= 26) {
            sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb2.append(", textDir=" + this.f2422b);
        sb2.append(", breakStrategy=" + this.f2423c);
        sb2.append(", hyphenationFrequency=" + this.f2424d);
        sb2.append("}");
        return sb2.toString();
    }
}

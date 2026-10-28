package c3;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import b3.r;
import c.p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f2403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextUtils.TruncateAt f2404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d3.e f2407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Layout f2408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f2412j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f2413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint.FontMetricsInt f2414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2415n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e3.h[] f2416o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f2417p = new Rect();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r f2418q;

    /* JADX WARN: Code duplicated, block: B:100:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:111:0x020b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0222  */
    /* JADX WARN: Code duplicated, block: B:119:0x0229  */
    /* JADX WARN: Code duplicated, block: B:125:0x025a  */
    /* JADX WARN: Code duplicated, block: B:134:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:144:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0137 A[PHI: r12
      0x0137: PHI (r12v6 int) = (r12v5 int), (r12v8 int) binds: [B:63:0x0144, B:59:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x01b6  */
    /* JADX WARN: Instruction removed from duplicated block: B:104:0x01f1, please report this as an issue */
    public n(CharSequence charSequence, float f10, TextPaint textPaint, int i7, TextUtils.TruncateAt truncateAt, int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, h hVar) {
        int i17;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutB;
        int i18;
        long j5;
        Paint.FontMetricsInt fontMetricsInt;
        e3.h[] hVarArr;
        char c10;
        int i19;
        Layout layout;
        int iE;
        int iMax;
        int iMax2;
        int i20;
        long j10;
        int i21;
        CharSequence text;
        boolean zIsFallbackLineSpacingEnabled;
        this.f2403a = textPaint;
        this.f2404b = truncateAt;
        this.f2405c = z10;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicA = o.a(i10);
        Layout.Alignment alignment = l.f2400a;
        Layout.Alignment alignment2 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? Layout.Alignment.ALIGN_NORMAL : l.f2401b : l.f2400a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z11 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, e3.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = hVar.a();
            double d10 = f10;
            int iCeil = (int) Math.ceil(d10);
            if (metricsA == null || hVar.c() > f10 || z11) {
                this.f2413l = false;
                kb.d dVar = j.f2385a;
                i17 = i11;
                textDirectionHeuristic = textDirectionHeuristicA;
                layoutB = j.f2385a.b(new k(charSequence, charSequence.length(), textPaint, iCeil, textDirectionHeuristic, alignment2, i17, truncateAt, (int) Math.ceil(d10), i16, z10, i12, i13, i14, i15));
            } else {
                this.f2413l = true;
                if (iCeil < 0) {
                    h3.a.a("negative width");
                }
                if (iCeil < 0) {
                    h3.a.a("negative ellipsized width");
                }
                layoutB = Build.VERSION.SDK_INT >= 33 ? p.f(charSequence, textPaint, iCeil, alignment2, metricsA, z10, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsA, z10, truncateAt, iCeil);
                i17 = i11;
                textDirectionHeuristic = textDirectionHeuristicA;
            }
            this.f2408f = layoutB;
            Trace.endSection();
            int iMin = Math.min(layoutB.getLineCount(), i17);
            this.f2409g = iMin;
            int i22 = iMin - 1;
            this.f2406d = iMin >= i17 && (layoutB.getEllipsisCount(i22) > 0 || layoutB.getLineEnd(i22) != charSequence.length());
            long j11 = o.f2420b;
            if (!z10) {
                if (!this.f2413l) {
                    i18 = 33;
                    kb.d dVar2 = j.f2385a;
                    StaticLayout staticLayout = (StaticLayout) layoutB;
                    switch (j.f2385a.f7504a) {
                        case 10:
                            int i23 = Build.VERSION.SDK_INT;
                            zIsFallbackLineSpacingEnabled = i23 >= 33 ? staticLayout.isFallbackLineSpacingEnabled() : i23 >= 28;
                            break;
                        default:
                            zIsFallbackLineSpacingEnabled = false;
                            break;
                    }
                } else {
                    BoringLayout boringLayout = (BoringLayout) layoutB;
                    i18 = 33;
                    if (Build.VERSION.SDK_INT >= 33) {
                        zIsFallbackLineSpacingEnabled = boringLayout.isFallbackLineSpacingEnabled();
                    } else {
                        zIsFallbackLineSpacingEnabled = false;
                    }
                }
                if (!zIsFallbackLineSpacingEnabled) {
                    TextPaint paint = layoutB.getPaint();
                    CharSequence text2 = layoutB.getText();
                    Rect rectC = i2.c.C(layoutB.getLineStart(0), layoutB.getLineEnd(0), paint, text2);
                    int lineAscent = layoutB.getLineAscent(0);
                    int i24 = rectC.top;
                    int topPadding = i24 < lineAscent ? lineAscent - i24 : layoutB.getTopPadding();
                    rectC = iMin != 1 ? i2.c.C(layoutB.getLineStart(i22), layoutB.getLineEnd(i22), paint, text2) : rectC;
                    int lineDescent = layoutB.getLineDescent(i22);
                    int i25 = rectC.bottom;
                    int bottomPadding = i25 > lineDescent ? i25 - lineDescent : layoutB.getBottomPadding();
                    j5 = (topPadding == 0 && bottomPadding == 0) ? j5 : (((long) bottomPadding) & 4294967295L) | (((long) topPadding) << 32);
                }
                fontMetricsInt = null;
                if (layoutB.getText() instanceof Spanned) {
                    text = layoutB.getText();
                    i9.l.c(text, "null cannot be cast to non-null type android.text.Spanned");
                    if (!k9.a.B((Spanned) text, e3.h.class) || layoutB.getText().length() <= 0) {
                        CharSequence text3 = layoutB.getText();
                        i9.l.c(text3, "null cannot be cast to non-null type android.text.Spanned");
                        hVarArr = (e3.h[]) ((Spanned) text3).getSpans(0, layoutB.getText().length(), e3.h.class);
                    } else {
                        hVarArr = null;
                    }
                } else {
                    hVarArr = null;
                }
                this.f2416o = hVarArr;
                if (hVarArr != null) {
                    iMax = 0;
                    iMax2 = 0;
                    for (e3.h hVar2 : hVarArr) {
                        int i26 = hVar2.k;
                        iMax = i26 < 0 ? Math.max(iMax, Math.abs(i26)) : iMax;
                        i21 = hVar2.f4297l;
                        if (i21 < 0) {
                            iMax2 = Math.max(iMax, Math.abs(i21));
                        }
                    }
                    c10 = ' ';
                    if (iMax == 0 || iMax2 != 0) {
                        j10 = (((long) iMax) << 32) | (((long) iMax2) & 4294967295L);
                    } else {
                        j10 = o.f2420b;
                    }
                    j11 = j10;
                } else {
                    c10 = ' ';
                }
                this.f2410h = Math.max((int) (j5 >> c10), (int) (j11 >> c10));
                this.f2411i = Math.max((int) (j5 & 4294967295L), (int) (j11 & 4294967295L));
                TextPaint textPaint2 = this.f2403a;
                e3.h[] hVarArr2 = this.f2416o;
                i19 = this.f2409g - 1;
                layout = this.f2408f;
                if (layout.getLineStart(i19) != layout.getLineEnd(i19) && hVarArr2 != null && hVarArr2.length != 0) {
                    TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
                    SpannableString spannableString = new SpannableString("\u200b");
                    e3.h hVar3 = (e3.h) u8.l.w0(hVarArr2);
                    spannableString.setSpan(new e3.h(hVar3.f4287a, spannableString.length(), (i19 == 0 || !hVar3.f4290d) ? hVar3.f4290d : false, hVar3.f4290d, hVar3.f4291e, hVar3.f4292f), 0, spannableString.length(), i18);
                    kb.d dVar3 = j.f2385a;
                    StaticLayout staticLayoutB = j.f2385a.b(new k(spannableString, spannableString.length(), textPaint2, Integer.MAX_VALUE, textDirectionHeuristic2, f.f2373a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f2405c, 0, 0, 0, 0));
                    fontMetricsInt = new Paint.FontMetricsInt();
                    fontMetricsInt.ascent = staticLayoutB.getLineAscent(0);
                    fontMetricsInt.descent = staticLayoutB.getLineDescent(0);
                    fontMetricsInt.top = staticLayoutB.getLineTop(0);
                    fontMetricsInt.bottom = staticLayoutB.getLineBottom(0);
                }
                if (fontMetricsInt != null) {
                    iE = fontMetricsInt.bottom - ((int) (e(i22) - g(i22)));
                } else {
                    iE = 0;
                }
                this.f2415n = iE;
                this.f2414m = fontMetricsInt;
                Layout layout2 = this.f2408f;
                this.f2412j = k9.a.v(layout2, i22, layout2.getPaint());
                Layout layout3 = this.f2408f;
                this.k = k9.a.w(layout3, i22, layout3.getPaint());
            }
            i18 = 33;
            j5 = j11;
            fontMetricsInt = null;
            if (layoutB.getText() instanceof Spanned) {
                hVarArr = null;
            } else {
                text = layoutB.getText();
                i9.l.c(text, "null cannot be cast to non-null type android.text.Spanned");
                if (k9.a.B((Spanned) text, e3.h.class)) {
                }
                CharSequence text4 = layoutB.getText();
                i9.l.c(text4, "null cannot be cast to non-null type android.text.Spanned");
                hVarArr = (e3.h[]) ((Spanned) text4).getSpans(0, layoutB.getText().length(), e3.h.class);
            }
            this.f2416o = hVarArr;
            if (hVarArr != null) {
                iMax = 0;
                iMax2 = 0;
                while (i20 < r3) {
                    int i27 = hVar2.k;
                    if (i27 < 0) {
                    }
                    i21 = hVar2.f4297l;
                    if (i21 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i21));
                    }
                }
                c10 = ' ';
                if (iMax == 0) {
                    j10 = (((long) iMax) << 32) | (((long) iMax2) & 4294967295L);
                } else {
                    j10 = (((long) iMax) << 32) | (((long) iMax2) & 4294967295L);
                }
                j11 = j10;
            } else {
                c10 = ' ';
            }
            this.f2410h = Math.max((int) (j5 >> c10), (int) (j11 >> c10));
            this.f2411i = Math.max((int) (j5 & 4294967295L), (int) (j11 & 4294967295L));
            TextPaint textPaint3 = this.f2403a;
            e3.h[] hVarArr3 = this.f2416o;
            i19 = this.f2409g - 1;
            layout = this.f2408f;
            if (layout.getLineStart(i19) != layout.getLineEnd(i19)) {
            }
            if (fontMetricsInt != null) {
                iE = fontMetricsInt.bottom - ((int) (e(i22) - g(i22)));
            } else {
                iE = 0;
            }
            this.f2415n = iE;
            this.f2414m = fontMetricsInt;
            Layout layout4 = this.f2408f;
            this.f2412j = k9.a.v(layout4, i22, layout4.getPaint());
            Layout layout5 = this.f2408f;
            this.k = k9.a.w(layout5, i22, layout5.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z10 = this.f2406d;
        Layout layout = this.f2408f;
        return (z10 ? layout.getLineBottom(this.f2409g - 1) : layout.getHeight()) + this.f2410h + this.f2411i + this.f2415n;
    }

    public final float b(int i7) {
        if (i7 == this.f2409g - 1) {
            return this.f2412j + this.k;
        }
        return 0.0f;
    }

    public final r c() {
        r rVar = this.f2418q;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(this.f2408f);
        this.f2418q = rVar2;
        return rVar2;
    }

    public final float d(int i7) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f2410h + ((i7 != this.f2409g + (-1) || (fontMetricsInt = this.f2414m) == null) ? this.f2408f.getLineBaseline(i7) : g(i7) - fontMetricsInt.ascent);
    }

    public final float e(int i7) {
        Paint.FontMetricsInt fontMetricsInt;
        int i10 = this.f2409g;
        int i11 = i10 - 1;
        Layout layout = this.f2408f;
        if (i7 != i11 || (fontMetricsInt = this.f2414m) == null) {
            return this.f2410h + layout.getLineBottom(i7) + (i7 == i10 + (-1) ? this.f2411i : 0);
        }
        return layout.getLineBottom(i7 - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i7) {
        m mVar = o.f2419a;
        Layout layout = this.f2408f;
        return (layout.getEllipsisCount(i7) <= 0 || this.f2404b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i7) : layout.getText().length();
    }

    public final float g(int i7) {
        return this.f2408f.getLineTop(i7) + (i7 == 0 ? 0 : this.f2410h);
    }

    public final float h(int i7, boolean z10) {
        return b(this.f2408f.getLineForOffset(i7)) + c().k(i7, true, z10);
    }

    public final float i(int i7, boolean z10) {
        return b(this.f2408f.getLineForOffset(i7)) + c().k(i7, false, z10);
    }

    public final d3.e j() {
        d3.e eVar = this.f2407e;
        if (eVar != null) {
            return eVar;
        }
        Layout layout = this.f2408f;
        d3.e eVar2 = new d3.e(layout.getText(), layout.getText().length(), this.f2403a.getTextLocale());
        this.f2407e = eVar2;
        return eVar2;
    }
}

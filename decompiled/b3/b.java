package b3;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3.d f1307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c3.n f1310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f1311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f1312f;

    /* JADX WARN: Code duplicated, block: B:102:0x013b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0146  */
    /* JADX WARN: Code duplicated, block: B:116:0x0192  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:139:0x0205  */
    /* JADX WARN: Code duplicated, block: B:140:0x0207  */
    /* JADX WARN: Code duplicated, block: B:142:0x0223  */
    /* JADX WARN: Code duplicated, block: B:144:0x023d  */
    /* JADX WARN: Code duplicated, block: B:147:0x0247 A[LOOP:1: B:145:0x0241->B:147:0x0247, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:150:0x0274  */
    /* JADX WARN: Code duplicated, block: B:151:0x0278  */
    /* JADX WARN: Code duplicated, block: B:153:0x0290  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:156:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:166:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:168:0x02cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0113  */
    /* JADX WARN: Code duplicated, block: B:93:0x011c  */
    /* JADX WARN: Code duplicated, block: B:95:0x011f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0122  */
    /* JADX WARN: Code duplicated, block: B:98:0x0125  */
    /* JADX WARN: Code duplicated, block: B:99:0x0128  */
    /* JADX WARN: Instruction removed from duplicated block: B:151:0x0278, please report this as an issue */
    public b(j3.d dVar, int i7, int i10, long j5) {
        CharSequence charSequence;
        int i11;
        int i12;
        char c10;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        c3.n nVarA;
        int i13;
        b bVar;
        int i14;
        int i15;
        int i16;
        Layout layout;
        Spanned spanned;
        l3.b[] bVarArr;
        CharSequence charSequence2;
        Spanned spanned2;
        ArrayList arrayList;
        int i17;
        Object obj;
        int spanEnd;
        int lineForOffset;
        boolean z10;
        boolean z11;
        boolean z12;
        x1.c cVar;
        float fH;
        i9.b bVarH;
        int i18;
        this.f1307a = dVar;
        this.f1308b = i7;
        this.f1309c = j5;
        if (n3.a.i(j5) != 0 || n3.a.j(j5) != 0) {
            h3.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i7 < 1) {
            h3.a.a("maxLines should be greater than 0");
        }
        r0 r0Var = dVar.f6924b;
        CharSequence charSequence3 = dVar.f6930h;
        if (i10 != 2) {
            charSequence = charSequence3;
        } else if (!n3.q.a(r0Var.f1438a.f1363h, n3.r.D(0)) && !n3.q.a(r0Var.f1438a.f1363h, n3.q.f8754c) && (i18 = r0Var.f1439b.f1453a) != Integer.MIN_VALUE && i18 != 5 && i18 != 4 && charSequence3.length() != 0) {
            Spannable spannableString = charSequence3 instanceof Spannable ? (Spannable) charSequence3 : null;
            if (spannableString == null) {
                charSequence = charSequence3;
                charSequence = charSequence3;
                spannableString = new SpannableString(charSequence3);
            }
            charSequence = charSequence3;
            charSequence = charSequence3;
            Spannable spannable = spannableString;
            boolean zB = k9.a.B(spannable, e3.c.class);
            charSequence = spannable;
            if (!zB) {
                spannable.setSpan(new e3.c(), spannable.length() - 1, spannable.length() - 1, 33);
                charSequence = spannable;
            }
        }
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        CharSequence charSequence4 = charSequence;
        this.f1311e = charSequence4;
        v vVar = r0Var.f1439b;
        h0 h0Var = r0Var.f1438a;
        int i19 = vVar.f1453a;
        int i20 = 3;
        int i21 = i19 == 1 ? 3 : i19 == 2 ? 4 : i19 == 3 ? 2 : (i19 != 5 && i19 == 6) ? 1 : 0;
        boolean z13 = i19 == 4;
        char c11 = vVar.f1460h == 2 ? Build.VERSION.SDK_INT <= 32 ? (char) 2 : (char) 4 : (char) 0;
        int i22 = vVar.f1459g;
        int i23 = i22 & 255;
        if (i23 == 1) {
            i11 = 0;
        } else if (i23 == 2) {
            i11 = 1;
        } else if (i23 == 3) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        int i24 = (i22 >> 8) & 255;
        if (i24 == 1) {
            i20 = 0;
        } else if (i24 == 2) {
            i20 = 1;
        } else if (i24 == 3) {
            i20 = 2;
        } else if (i24 != 4) {
            i20 = 0;
        }
        int i25 = (i22 >> 16) & 255;
        if (i25 != 1) {
            i12 = 2;
            int i26 = i25 == 2 ? 1 : 0;
            if (i10 == i12) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else {
                if (i10 == 5) {
                    if (i10 == 4) {
                        truncateAt2 = TextUtils.TruncateAt.START;
                    } else {
                        c10 = ' ';
                        truncateAt = null;
                    }
                    nVarA = a(i21, z13, truncateAt, i7, c11, i11, i20, i26, charSequence4);
                    Layout layout2 = nVarA.f2408f;
                    i13 = i21;
                    if (Build.VERSION.SDK_INT < 35 || dVar.f6929g.getLetterSpacing() == 0.0f || (!(i10 == 4 || i10 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        bVar = this;
                        i14 = i7;
                        i15 = i13;
                        i16 = 2;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i16 = 2;
                        CharSequence[] charSequenceArr = {charSequence4.subSequence(0, ellipsisStart), "…", charSequence4.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence4.length())};
                        b bVar2 = this;
                        i14 = i7;
                        i15 = i13;
                        nVarA = bVar2.a(i15, z13, truncateAt, i14, c11, i11, i20, i26, TextUtils.concat(charSequenceArr));
                        bVar = bVar2;
                    }
                    int i27 = nVarA.f2409g;
                    if (i10 == i16 || nVarA.a() <= n3.a.g(j5) || i14 <= 1) {
                        bVar.f1310d = nVarA;
                    } else {
                        int iG = n3.a.g(j5);
                        int i28 = 0;
                        while (true) {
                            if (i28 >= i27) {
                                i28 = i27;
                                break;
                            } else if (nVarA.e(i28) > iG) {
                                break;
                            } else {
                                i28++;
                            }
                        }
                        if (i28 >= 0 && i28 != bVar.f1308b) {
                            nVarA = bVar.a(i15, z13, truncateAt, i28 < 1 ? 1 : i28, c11, i11, i20, i26, bVar.f1311e);
                        }
                        bVar.f1310d = nVarA;
                    }
                    bVar.f1307a.f6929g.c(h0Var.f1356a.e(), (((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << c10), h0Var.f1356a.a());
                    layout = bVar.f1310d.f2408f;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        i9.l.c(text, "null cannot be cast to non-null type android.text.Spanned");
                        spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), l3.b.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            i9.l.c(text2, "null cannot be cast to non-null type android.text.Spanned");
                            bVarArr = (l3.b[]) ((Spanned) text2).getSpans(0, layout.getText().length(), l3.b.class);
                        } else {
                            bVarArr = null;
                        }
                    } else {
                        bVarArr = null;
                    }
                    if (bVarArr != null) {
                        bVarH = i9.l.h(bVarArr);
                        while (bVarH.hasNext()) {
                            ((l3.b) bVarH.next()).f7994c.setValue(new x1.e((((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << c10)));
                        }
                    }
                    charSequence2 = bVar.f1311e;
                    if (charSequence2 instanceof Spanned) {
                        spanned2 = (Spanned) charSequence2;
                        Object[] spans = spanned2.getSpans(0, charSequence2.length(), e3.i.class);
                        arrayList = new ArrayList(spans.length);
                        for (Object obj2 : spans) {
                            e3.i iVar = (e3.i) obj2;
                            int spanStart = spanned2.getSpanStart(iVar);
                            spanEnd = spanned2.getSpanEnd(iVar);
                            lineForOffset = bVar.f1310d.f2408f.getLineForOffset(spanStart);
                            if (lineForOffset >= bVar.f1308b) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (bVar.f1310d.f2408f.getEllipsisCount(lineForOffset) > 0 || spanEnd <= bVar.f1310d.f2408f.getEllipsisStart(lineForOffset)) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (spanEnd > bVar.f1310d.f(lineForOffset)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z11 && !z12 && !z10) {
                                int iOrdinal = (bVar.f1310d.f2408f.isRtlCharAt(spanStart) ? m3.j.f8417b : m3.j.f8416a).ordinal();
                                if (iOrdinal == 0) {
                                    fH = bVar.f1310d.h(spanStart, false);
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new cc.s();
                                    }
                                    float fH2 = bVar.f1310d.h(spanStart, false);
                                    if (!iVar.f4301d) {
                                        h3.a.b("PlaceholderSpan is not laid out yet.");
                                    }
                                    fH = fH2 - iVar.f4299b;
                                }
                                if (!iVar.f4301d) {
                                    h3.a.b("PlaceholderSpan is not laid out yet.");
                                }
                                float f10 = iVar.f4299b + fH;
                                float fD = bVar.f1310d.d(lineForOffset) - iVar.b();
                                cVar = new x1.c(fH, fD, f10, iVar.b() + fD);
                            }
                            arrayList.add(cVar);
                        }
                        obj = arrayList;
                    } else {
                        obj = u8.w.f13122a;
                    }
                    bVar.f1312f = obj;
                }
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            }
            c10 = ' ';
            truncateAt = truncateAt2;
            nVarA = a(i21, z13, truncateAt, i7, c11, i11, i20, i26, charSequence4);
            Layout layout3 = nVarA.f2408f;
            i13 = i21;
            if (Build.VERSION.SDK_INT < 35) {
                bVar = this;
                i14 = i7;
                i15 = i13;
                i16 = 2;
            } else {
                bVar = this;
                i14 = i7;
                i15 = i13;
                i16 = 2;
            }
            int i29 = nVarA.f2409g;
            if (i10 == i16) {
                bVar.f1310d = nVarA;
            } else {
                bVar.f1310d = nVarA;
            }
            bVar.f1307a.f6929g.c(h0Var.f1356a.e(), (((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << c10), h0Var.f1356a.a());
            layout = bVar.f1310d.f2408f;
            if (layout.getText() instanceof Spanned) {
                bVarArr = null;
            } else {
                CharSequence text3 = layout.getText();
                i9.l.c(text3, "null cannot be cast to non-null type android.text.Spanned");
                spanned = (Spanned) text3;
                if (spanned.nextSpanTransition(-1, spanned.length(), l3.b.class) != spanned.length()) {
                    CharSequence text4 = layout.getText();
                    i9.l.c(text4, "null cannot be cast to non-null type android.text.Spanned");
                    bVarArr = (l3.b[]) ((Spanned) text4).getSpans(0, layout.getText().length(), l3.b.class);
                } else {
                    bVarArr = null;
                }
            }
            if (bVarArr != null) {
                bVarH = i9.l.h(bVarArr);
                while (bVarH.hasNext()) {
                    ((l3.b) bVarH.next()).f7994c.setValue(new x1.e((((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << c10)));
                }
            }
            charSequence2 = bVar.f1311e;
            if (charSequence2 instanceof Spanned) {
                obj = u8.w.f13122a;
            } else {
                spanned2 = (Spanned) charSequence2;
                Object[] spans2 = spanned2.getSpans(0, charSequence2.length(), e3.i.class);
                arrayList = new ArrayList(spans2.length);
                while (i17 < r4) {
                    e3.i iVar2 = (e3.i) obj2;
                    int spanStart2 = spanned2.getSpanStart(iVar2);
                    spanEnd = spanned2.getSpanEnd(iVar2);
                    lineForOffset = bVar.f1310d.f2408f.getLineForOffset(spanStart2);
                    if (lineForOffset >= bVar.f1308b) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (bVar.f1310d.f2408f.getEllipsisCount(lineForOffset) > 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (spanEnd > bVar.f1310d.f(lineForOffset)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    cVar = z11 ? null : null;
                    arrayList.add(cVar);
                }
                obj = arrayList;
            }
            bVar.f1312f = obj;
        }
        i12 = 2;
        if (i10 == i12) {
            truncateAt2 = TextUtils.TruncateAt.END;
        } else {
            if (i10 == 5) {
                if (i10 == 4) {
                    truncateAt2 = TextUtils.TruncateAt.START;
                } else {
                    c10 = ' ';
                    truncateAt = null;
                }
                nVarA = a(i21, z13, truncateAt, i7, c11, i11, i20, i26, charSequence4);
                Layout layout4 = nVarA.f2408f;
                i13 = i21;
                if (Build.VERSION.SDK_INT < 35) {
                    bVar = this;
                    i14 = i7;
                    i15 = i13;
                    i16 = 2;
                } else {
                    bVar = this;
                    i14 = i7;
                    i15 = i13;
                    i16 = 2;
                }
                int i210 = nVarA.f2409g;
                if (i10 == i16) {
                    bVar.f1310d = nVarA;
                } else {
                    bVar.f1310d = nVarA;
                }
                bVar.f1307a.f6929g.c(h0Var.f1356a.e(), (((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << c10), h0Var.f1356a.a());
                layout = bVar.f1310d.f2408f;
                if (layout.getText() instanceof Spanned) {
                    bVarArr = null;
                } else {
                    CharSequence text5 = layout.getText();
                    i9.l.c(text5, "null cannot be cast to non-null type android.text.Spanned");
                    spanned = (Spanned) text5;
                    if (spanned.nextSpanTransition(-1, spanned.length(), l3.b.class) != spanned.length()) {
                        CharSequence text6 = layout.getText();
                        i9.l.c(text6, "null cannot be cast to non-null type android.text.Spanned");
                        bVarArr = (l3.b[]) ((Spanned) text6).getSpans(0, layout.getText().length(), l3.b.class);
                    } else {
                        bVarArr = null;
                    }
                }
                if (bVarArr != null) {
                    bVarH = i9.l.h(bVarArr);
                    while (bVarH.hasNext()) {
                        ((l3.b) bVarH.next()).f7994c.setValue(new x1.e((((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << c10)));
                    }
                }
                charSequence2 = bVar.f1311e;
                if (charSequence2 instanceof Spanned) {
                    obj = u8.w.f13122a;
                } else {
                    spanned2 = (Spanned) charSequence2;
                    Object[] spans3 = spanned2.getSpans(0, charSequence2.length(), e3.i.class);
                    arrayList = new ArrayList(spans3.length);
                    while (i17 < r4) {
                        e3.i iVar3 = (e3.i) obj2;
                        int spanStart3 = spanned2.getSpanStart(iVar3);
                        spanEnd = spanned2.getSpanEnd(iVar3);
                        lineForOffset = bVar.f1310d.f2408f.getLineForOffset(spanStart3);
                        if (lineForOffset >= bVar.f1308b) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (bVar.f1310d.f2408f.getEllipsisCount(lineForOffset) > 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (spanEnd > bVar.f1310d.f(lineForOffset)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11) {
                        }
                        arrayList.add(cVar);
                    }
                    obj = arrayList;
                }
                bVar.f1312f = obj;
            }
            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
        }
        c10 = ' ';
        truncateAt = truncateAt2;
        nVarA = a(i21, z13, truncateAt, i7, c11, i11, i20, i26, charSequence4);
        Layout layout5 = nVarA.f2408f;
        i13 = i21;
        if (Build.VERSION.SDK_INT < 35) {
            bVar = this;
            i14 = i7;
            i15 = i13;
            i16 = 2;
        } else {
            bVar = this;
            i14 = i7;
            i15 = i13;
            i16 = 2;
        }
        int i211 = nVarA.f2409g;
        if (i10 == i16) {
            bVar.f1310d = nVarA;
        } else {
            bVar.f1310d = nVarA;
        }
        bVar.f1307a.f6929g.c(h0Var.f1356a.e(), (((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << c10), h0Var.f1356a.a());
        layout = bVar.f1310d.f2408f;
        if (layout.getText() instanceof Spanned) {
            bVarArr = null;
        } else {
            CharSequence text7 = layout.getText();
            i9.l.c(text7, "null cannot be cast to non-null type android.text.Spanned");
            spanned = (Spanned) text7;
            if (spanned.nextSpanTransition(-1, spanned.length(), l3.b.class) != spanned.length()) {
                CharSequence text8 = layout.getText();
                i9.l.c(text8, "null cannot be cast to non-null type android.text.Spanned");
                bVarArr = (l3.b[]) ((Spanned) text8).getSpans(0, layout.getText().length(), l3.b.class);
            } else {
                bVarArr = null;
            }
        }
        if (bVarArr != null) {
            bVarH = i9.l.h(bVarArr);
            while (bVarH.hasNext()) {
                ((l3.b) bVarH.next()).f7994c.setValue(new x1.e((((long) Float.floatToRawIntBits(bVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(bVar.d())) << c10)));
            }
        }
        charSequence2 = bVar.f1311e;
        if (charSequence2 instanceof Spanned) {
            obj = u8.w.f13122a;
        } else {
            spanned2 = (Spanned) charSequence2;
            Object[] spans4 = spanned2.getSpans(0, charSequence2.length(), e3.i.class);
            arrayList = new ArrayList(spans4.length);
            while (i17 < r4) {
                e3.i iVar4 = (e3.i) obj2;
                int spanStart4 = spanned2.getSpanStart(iVar4);
                spanEnd = spanned2.getSpanEnd(iVar4);
                lineForOffset = bVar.f1310d.f2408f.getLineForOffset(spanStart4);
                if (lineForOffset >= bVar.f1308b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (bVar.f1310d.f2408f.getEllipsisCount(lineForOffset) > 0) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (spanEnd > bVar.f1310d.f(lineForOffset)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11) {
                }
                arrayList.add(cVar);
            }
            obj = arrayList;
        }
        bVar.f1312f = obj;
    }

    public final c3.n a(int i7, int i10, TextUtils.TruncateAt truncateAt, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence) {
        x xVar;
        float fD = d();
        j3.d dVar = this.f1307a;
        j3.f fVar = dVar.f6929g;
        int i16 = dVar.f6933l;
        c3.h hVar = dVar.f6931i;
        r0 r0Var = dVar.f6924b;
        j3.a aVar = j3.b.f6920a;
        z zVar = r0Var.f1440c;
        return new c3.n(charSequence, fD, fVar, i7, truncateAt, i16, (zVar == null || (xVar = zVar.f1468b) == null) ? false : xVar.f1465a, i11, i13, i14, i15, i12, i10, hVar);
    }

    public final float b() {
        return this.f1310d.a();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
    /* JADX WARN: Type inference failed for: r13v26, types: [c3.b] */
    public final long c(x1.c cVar, int i7, l0 l0Var) {
        d3.d bVar;
        int i10;
        int[] rangeForRect;
        SegmentFinder segmentFinderL;
        RectF rectFA = y1.h0.A(cVar);
        boolean z10 = i7 != 0 && i7 == 1;
        final a aVar = new a(0, l0Var);
        c3.n nVar = this.f1310d;
        TextPaint textPaint = nVar.f2403a;
        Layout layout = nVar.f2408f;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            if (z10) {
                segmentFinderL = new d3.a(new u0.k(3, layout.getText(), nVar.j()));
            } else {
                c3.a.o();
                segmentFinderL = c3.a.l(c3.a.k(layout.getText(), textPaint));
            }
            rangeForRect = layout.getRangeForRect(rectFA, segmentFinderL, new Layout.TextInclusionStrategy() { // from class: c3.b
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) aVar.invoke(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            r rVarC = nVar.c();
            if (z10) {
                bVar = new u0.k(3, layout.getText(), nVar.j());
            } else {
                CharSequence text = layout.getText();
                bVar = i11 >= 29 ? new d3.b(text, textPaint) : new d3.c(text);
            }
            d3.d dVar = bVar;
            int lineForVertical = layout.getLineForVertical((int) rectFA.top);
            if (rectFA.top <= nVar.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < nVar.f2409g) {
                int i12 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFA.bottom);
                if (lineForVertical2 != 0 || rectFA.bottom >= nVar.g(0)) {
                    int iE = o9.e0.E(nVar, layout, rVarC, i12, rectFA, dVar, aVar, true);
                    while (true) {
                        i10 = i12;
                        if (iE != -1 || i10 >= lineForVertical2) {
                            break;
                        }
                        i12 = i10 + 1;
                        iE = o9.e0.E(nVar, layout, rVarC, i12, rectFA, dVar, aVar, true);
                    }
                    if (iE == -1) {
                        rangeForRect = null;
                    } else {
                        int i13 = lineForVertical2;
                        int iE2 = o9.e0.E(nVar, layout, rVarC, i13, rectFA, dVar, aVar, false);
                        while (iE2 == -1 && i10 < i13) {
                            i13--;
                            iE2 = o9.e0.E(nVar, layout, rVarC, i13, rectFA, dVar, aVar, false);
                        }
                        if (iE2 == -1) {
                            rangeForRect = null;
                        } else {
                            rangeForRect = new int[]{dVar.X(iE + 1), dVar.Y(iE2 - 1)};
                        }
                    }
                } else {
                    rangeForRect = null;
                }
            } else {
                rangeForRect = null;
            }
        }
        return rangeForRect == null ? q0.f1428b : g0.b(rangeForRect[0], rangeForRect[1]);
    }

    public final float d() {
        return n3.a.h(this.f1309c);
    }

    public final void e(y1.o oVar) {
        Canvas canvasA = y1.c.a(oVar);
        c3.n nVar = this.f1310d;
        if (nVar.f2406d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        int i7 = nVar.f2410h;
        if (canvasA.getClipBounds(nVar.f2417p)) {
            if (i7 != 0) {
                canvasA.translate(0.0f, i7);
            }
            c3.m mVar = c3.o.f2419a;
            mVar.f2402a = canvasA;
            nVar.f2408f.draw(mVar);
            if (i7 != 0) {
                canvasA.translate(0.0f, (-1) * i7);
            }
        }
        if (nVar.f2406d) {
            canvasA.restore();
        }
    }

    public final void f(y1.o oVar, long j5, y1.k0 k0Var, m3.l lVar, a2.h hVar) {
        j3.f fVar = this.f1307a.f6929g;
        int i7 = fVar.f6938c;
        fVar.d(j5);
        fVar.f(k0Var);
        fVar.g(lVar);
        fVar.e(hVar);
        fVar.b(3);
        e(oVar);
        fVar.b(i7);
    }

    public final void g(y1.o oVar, y1.m mVar, float f10, y1.k0 k0Var, m3.l lVar, a2.h hVar) {
        j3.f fVar = this.f1307a.f6929g;
        int i7 = fVar.f6938c;
        float fD = d();
        fVar.c(mVar, (((long) Float.floatToRawIntBits(b())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), f10);
        fVar.f(k0Var);
        fVar.g(lVar);
        fVar.e(hVar);
        fVar.b(3);
        e(oVar);
        fVar.b(i7);
    }
}

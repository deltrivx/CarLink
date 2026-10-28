package e3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import c3.m;
import c3.o;
import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i7, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z10, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i14)) != layout.getLineCount() - 1) {
            return;
        }
        m mVar = o.f2419a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fW = k9.a.w(layout, lineForOffset, paint) + k9.a.v(layout, lineForOffset, paint);
            if (fW == 0.0f) {
                return;
            }
            l.b(canvas);
            canvas.translate(fW, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return 0;
    }
}

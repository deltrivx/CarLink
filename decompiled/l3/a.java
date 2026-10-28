package l3;

import a2.h;
import a2.j;
import a2.k;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import cc.s;
import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f7991a;

    public a(h hVar) {
        this.f7991a = hVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            j jVar = j.f23a;
            h hVar = this.f7991a;
            if (l.a(hVar, jVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(hVar instanceof k)) {
                throw new s();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            k kVar = (k) hVar;
            textPaint.setStrokeWidth(kVar.f24a);
            textPaint.setStrokeMiter(kVar.f25b);
            int i7 = kVar.f27d;
            if (i7 == 0) {
                join = Paint.Join.MITER;
            } else if (i7 == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i7 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i10 = kVar.f26c;
            if (i10 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i10 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i10 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            textPaint.setPathEffect(null);
        }
    }
}

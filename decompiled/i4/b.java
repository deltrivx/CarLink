package i4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.ViewStructure;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import p.c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static int a(c1 c1Var) {
        return c1Var.getBreakStrategy();
    }

    public static Drawable b(CompoundButton compoundButton) {
        return compoundButton.getButtonDrawable();
    }

    public static int c(Context context, int i7) {
        return context.getColor(i7);
    }

    public static Bundle d(ViewStructure viewStructure) {
        return viewStructure.getExtras();
    }

    public static int e(c1 c1Var) {
        return c1Var.getHyphenationFrequency();
    }

    public static int f(Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static boolean g(TextPaint textPaint, String str) {
        return textPaint.hasGlyph(str);
    }

    public static void h(c1 c1Var, int i7) {
        c1Var.setBreakStrategy(i7);
    }

    public static void i(ViewStructure viewStructure, String str) {
        viewStructure.setClassName(str);
    }

    public static void j(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void k(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void l(ViewStructure viewStructure, String str) {
        viewStructure.setContentDescription(str);
    }

    public static void m(ViewStructure viewStructure, int i7, int i10, int i11, int i12) {
        viewStructure.setDimens(i7, i10, 0, 0, i11, i12);
    }

    public static void n(c1 c1Var, int i7) {
        c1Var.setHyphenationFrequency(i7);
    }

    public static void o(ViewStructure viewStructure, int i7, String str) {
        viewStructure.setId(i7, null, null, str);
    }

    public static boolean p(Drawable drawable, int i7) {
        return drawable.setLayoutDirection(i7);
    }

    public static void q(PopupWindow popupWindow, boolean z10) {
        popupWindow.setOverlapAnchor(z10);
    }

    public static void r(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }

    public static void s(ViewStructure viewStructure, float f10) {
        viewStructure.setTextStyle(f10, 0, 0, 0);
    }

    public static void t(PopupWindow popupWindow, int i7) {
        popupWindow.setWindowLayoutType(i7);
    }

    public static void u(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i7) {
        layerDrawable2.setLayerGravity(i7, layerDrawable.getLayerGravity(i7));
        layerDrawable2.setLayerWidth(i7, layerDrawable.getLayerWidth(i7));
        layerDrawable2.setLayerHeight(i7, layerDrawable.getLayerHeight(i7));
        layerDrawable2.setLayerInsetLeft(i7, layerDrawable.getLayerInsetLeft(i7));
        layerDrawable2.setLayerInsetRight(i7, layerDrawable.getLayerInsetRight(i7));
        layerDrawable2.setLayerInsetTop(i7, layerDrawable.getLayerInsetTop(i7));
        layerDrawable2.setLayerInsetBottom(i7, layerDrawable.getLayerInsetBottom(i7));
        layerDrawable2.setLayerInsetStart(i7, layerDrawable.getLayerInsetStart(i7));
        layerDrawable2.setLayerInsetEnd(i7, layerDrawable.getLayerInsetEnd(i7));
    }
}

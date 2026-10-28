package l3;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import f1.f0;
import f1.k1;
import j3.k;
import x1.e;
import y1.j0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f7992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f7994c = f1.b.s(new e(9205357640488583168L));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f7995d = f1.b.o(new a5.e(12, this));

    public b(j0 j0Var, float f10) {
        this.f7992a = j0Var;
        this.f7993b = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        k.b(textPaint, this.f7993b);
        textPaint.setShader((Shader) this.f7995d.getValue());
    }
}

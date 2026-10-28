package n4;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l implements TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransformationMethod f8789a;

    public l(TransformationMethod transformationMethod) {
        this.f8789a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f8789a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || l4.j.a().c() != 1) {
            return charSequence;
        }
        l4.j jVarA = l4.j.a();
        jVarA.getClass();
        return jVarA.g(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i7, Rect rect) {
        TransformationMethod transformationMethod = this.f8789a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i7, rect);
        }
    }
}

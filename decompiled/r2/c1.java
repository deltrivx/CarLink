package r2;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f11205a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f11206b = new int[2];

    @Override // r2.a1
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f11205a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f11206b;
        view.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        int i10 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i7, iArr[1] - i10);
        y1.h0.v(matrix, fArr);
    }
}

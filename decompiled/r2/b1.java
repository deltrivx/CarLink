package r2;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f11191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f11192b;

    public b1(int i7, int i10) {
        this.f11191a = new int[]{i7, i10};
        this.f11192b = new float[]{0.0f, 1.0f};
    }

    public b1(int i7, int i10, int i11) {
        this.f11191a = new int[]{i7, i10, i11};
        this.f11192b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b1(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f11191a = new int[size];
        this.f11192b = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            this.f11191a[i7] = ((Integer) arrayList.get(i7)).intValue();
            this.f11192b[i7] = ((Float) arrayList2.get(i7)).floatValue();
        }
    }

    public b1(float[] fArr) {
        this.f11192b = fArr;
        this.f11191a = new int[2];
    }

    @Override // r2.a1
    public void a(View view, float[] fArr) {
        y1.a0.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z10 = parent instanceof View;
        float[] fArr2 = this.f11192b;
        if (z10) {
            b((View) parent, fArr);
            float f10 = -view.getScrollX();
            float f11 = -view.getScrollY();
            y1.a0.d(fArr2);
            y1.a0.f(fArr2, f10, f11);
            j0.t(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            y1.a0.d(fArr2);
            y1.a0.f(fArr2, left, top);
            j0.t(fArr, fArr2);
        } else {
            int[] iArr = this.f11191a;
            view.getLocationInWindow(iArr);
            float f12 = -view.getScrollX();
            float f13 = -view.getScrollY();
            y1.a0.d(fArr2);
            y1.a0.f(fArr2, f12, f13);
            j0.t(fArr, fArr2);
            float f14 = iArr[0];
            float f15 = iArr[1];
            y1.a0.d(fArr2);
            y1.a0.f(fArr2, f14, f15);
            j0.t(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        y1.h0.v(matrix, fArr2);
        j0.t(fArr, fArr2);
    }
}

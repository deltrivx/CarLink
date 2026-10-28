package f5;

import android.animation.TypeEvaluator;
import n3.r;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x3.d[] f5311a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        x3.d[] dVarArr = (x3.d[]) obj;
        x3.d[] dVarArr2 = (x3.d[]) obj2;
        if (!r.g(dVarArr, dVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!r.g(this.f5311a, dVarArr)) {
            this.f5311a = r.v(dVarArr);
        }
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            x3.d dVar = this.f5311a[i7];
            x3.d dVar2 = dVarArr[i7];
            x3.d dVar3 = dVarArr2[i7];
            dVar.getClass();
            dVar.f14568a = dVar2.f14568a;
            int i10 = 0;
            while (true) {
                float[] fArr = dVar2.f14569b;
                if (i10 < fArr.length) {
                    dVar.f14569b[i10] = (dVar3.f14569b[i10] * f10) + ((1.0f - f10) * fArr[i10]);
                    i10++;
                }
            }
        }
        return this.f5311a;
    }
}

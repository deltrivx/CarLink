package g7;

import android.graphics.Rect;
import android.util.Log;
import f7.v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5996a;

    @Override // g7.n
    public final float a(v vVar, v vVar2) {
        switch (this.f5996a) {
            case 0:
                if (vVar.f5455a <= 0 || vVar.f5456b <= 0) {
                    return 0.0f;
                }
                v vVarA = vVar.a(vVar2);
                float f10 = vVarA.f5455a * 1.0f;
                float fPow = f10 / vVar.f5455a;
                if (fPow > 1.0f) {
                    fPow = (float) Math.pow(1.0f / fPow, 1.1d);
                }
                float f11 = ((vVarA.f5456b * 1.0f) / vVar2.f5456b) + (f10 / vVar2.f5455a);
                return ((1.0f / f11) / f11) * fPow;
            case 1:
                if (vVar.f5455a <= 0 || vVar.f5456b <= 0) {
                    return 0.0f;
                }
                v vVarB = vVar.b(vVar2);
                float f12 = vVarB.f5455a;
                float fPow2 = (f12 * 1.0f) / vVar.f5455a;
                if (fPow2 > 1.0f) {
                    fPow2 = (float) Math.pow(1.0f / fPow2, 1.1d);
                }
                float f13 = ((vVar2.f5456b * 1.0f) / vVarB.f5456b) * ((vVar2.f5455a * 1.0f) / f12);
                return (((1.0f / f13) / f13) / f13) * fPow2;
            default:
                int i7 = vVar.f5455a;
                int i10 = vVar.f5456b;
                if (i7 <= 0 || i10 <= 0) {
                    return 0.0f;
                }
                int i11 = vVar2.f5455a;
                int i12 = vVar2.f5456b;
                float f14 = (i7 * 1.0f) / i11;
                if (f14 < 1.0f) {
                    f14 = 1.0f / f14;
                }
                float f15 = i10;
                float f16 = i12;
                float f17 = (f15 * 1.0f) / f16;
                if (f17 < 1.0f) {
                    f17 = 1.0f / f17;
                }
                float f18 = (1.0f / f14) / f17;
                float f19 = ((i7 * 1.0f) / f15) / ((i11 * 1.0f) / f16);
                if (f19 < 1.0f) {
                    f19 = 1.0f / f19;
                }
                return (((1.0f / f19) / f19) / f19) * f18;
        }
    }

    @Override // g7.n
    public final Rect b(v vVar, v vVar2) {
        switch (this.f5996a) {
            case 0:
                v vVarA = vVar.a(vVar2);
                Log.i("k", "Preview: " + vVar + "; Scaled: " + vVarA + "; Want: " + vVar2);
                int i7 = vVarA.f5455a;
                int i10 = (i7 - vVar2.f5455a) / 2;
                int i11 = vVarA.f5456b;
                int i12 = (i11 - vVar2.f5456b) / 2;
                return new Rect(-i10, -i12, i7 - i10, i11 - i12);
            case 1:
                v vVarB = vVar.b(vVar2);
                Log.i("k", "Preview: " + vVar + "; Scaled: " + vVarB + "; Want: " + vVar2);
                int i13 = vVarB.f5455a;
                int i14 = (i13 - vVar2.f5455a) / 2;
                int i15 = vVarB.f5456b;
                int i16 = (i15 - vVar2.f5456b) / 2;
                return new Rect(-i14, -i16, i13 - i14, i15 - i16);
            default:
                return new Rect(0, 0, vVar2.f5455a, vVar2.f5456b);
        }
    }
}

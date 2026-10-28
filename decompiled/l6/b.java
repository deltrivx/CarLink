package l6;

import java.util.ArrayList;
import n5.p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t5.b f8060a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f8066g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f8068i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8061b = new ArrayList(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f8067h = new int[3];

    public b(t5.b bVar, int i7, int i10, int i11, int i12, float f10, p pVar) {
        this.f8060a = bVar;
        this.f8062c = i7;
        this.f8063d = i10;
        this.f8064e = i11;
        this.f8065f = i12;
        this.f8066g = f10;
        this.f8068i = pVar;
    }

    public final boolean a(int[] iArr) {
        float f10 = this.f8066g;
        float f11 = f10 / 2.0f;
        for (int i7 = 0; i7 < 3; i7++) {
            if (Math.abs(f10 - iArr[i7]) >= f11) {
                return false;
            }
        }
        return true;
    }

    public final a b(int i7, int i10, int[] iArr) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = i11 + i12 + i13;
        float f10 = (i10 - i13) - (i12 / 2.0f);
        int i15 = (int) f10;
        int i16 = i12 * 2;
        t5.b bVar = this.f8060a;
        int i17 = bVar.f12762b;
        int[] iArr2 = this.f8067h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i18 = i7;
        while (i18 >= 0 && bVar.b(i15, i18)) {
            int i19 = iArr2[1];
            if (i19 > i16) {
                break;
            }
            iArr2[1] = i19 + 1;
            i18--;
        }
        float f11 = Float.NaN;
        if (i18 >= 0 && iArr2[1] <= i16) {
            while (i18 >= 0 && !bVar.b(i15, i18)) {
                int i20 = iArr2[0];
                if (i20 > i16) {
                    break;
                }
                iArr2[0] = i20 + 1;
                i18--;
            }
            if (iArr2[0] <= i16) {
                int i21 = i7 + 1;
                while (i21 < i17 && bVar.b(i15, i21)) {
                    int i22 = iArr2[1];
                    if (i22 > i16) {
                        break;
                    }
                    iArr2[1] = i22 + 1;
                    i21++;
                }
                if (i21 != i17 && iArr2[1] <= i16) {
                    while (i21 < i17 && !bVar.b(i15, i21)) {
                        int i23 = iArr2[2];
                        if (i23 > i16) {
                            break;
                        }
                        iArr2[2] = i23 + 1;
                        i21++;
                    }
                    int i24 = iArr2[2];
                    if (i24 <= i16 && Math.abs(((iArr2[0] + iArr2[1]) + i24) - i14) * 5 < i14 * 2 && a(iArr2)) {
                        f11 = (i21 - iArr2[2]) - (iArr2[1] / 2.0f);
                    }
                }
            }
        }
        if (Float.isNaN(f11)) {
            return null;
        }
        float f12 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        ArrayList<a> arrayList = this.f8061b;
        for (a aVar : arrayList) {
            float f13 = aVar.f8059c;
            float f14 = aVar.f8854a;
            float f15 = aVar.f8855b;
            if (Math.abs(f11 - f15) <= f12 && Math.abs(f10 - f14) <= f12) {
                float fAbs = Math.abs(f12 - f13);
                if (fAbs <= 1.0f || fAbs <= f13) {
                    return new a((f14 + f10) / 2.0f, (f15 + f11) / 2.0f, (aVar.f8059c + f12) / 2.0f);
                }
            }
        }
        a aVar2 = new a(f10, f11, f12);
        arrayList.add(aVar2);
        p pVar = this.f8068i;
        if (pVar == null) {
            return null;
        }
        pVar.a(aVar2);
        return null;
    }
}

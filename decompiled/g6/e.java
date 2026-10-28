package g6;

import u0.k;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5948d;

    public e(c cVar, boolean z10) {
        super(cVar);
        this.f5948d = z10;
    }

    public final a k1() {
        a[] aVarArr = (a[]) this.f12991c;
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        for (a aVar : aVarArr) {
            if (aVar != null) {
                aVar.b();
                int i7 = aVar.f5933e % 30;
                int i10 = aVar.f5934f;
                if (!this.f5948d) {
                    i10 += 2;
                }
                int i11 = i10 % 3;
                if (i11 == 0) {
                    bVar2.b((i7 * 3) + 1);
                } else if (i11 == 1) {
                    bVar4.b(i7 / 3);
                    bVar3.b(i7 % 3);
                } else if (i11 == 2) {
                    bVar.b(i7 + 1);
                }
            }
        }
        if (bVar.a().length == 0 || bVar2.a().length == 0 || bVar3.a().length == 0 || bVar4.a().length == 0 || bVar.a()[0] <= 0 || bVar2.a()[0] + bVar3.a()[0] < 3 || bVar2.a()[0] + bVar3.a()[0] > 90) {
            return null;
        }
        a aVar2 = new a(bVar.a()[0], bVar2.a()[0], bVar3.a()[0], bVar4.a()[0], 0);
        l1(aVarArr, aVar2);
        return aVar2;
    }

    public final void l1(a[] aVarArr, a aVar) {
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            a aVar2 = aVarArr[i7];
            if (aVar2 != null) {
                int i10 = aVar2.f5933e % 30;
                int i11 = aVar2.f5934f;
                if (i11 > aVar.f5934f) {
                    aVarArr[i7] = null;
                } else {
                    if (!this.f5948d) {
                        i11 += 2;
                    }
                    int i12 = i11 % 3;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 == 2 && i10 + 1 != aVar.f5930b) {
                                aVarArr[i7] = null;
                            }
                        } else if (i10 / 3 != aVar.f5931c || i10 % 3 != aVar.f5933e) {
                            aVarArr[i7] = null;
                        }
                    } else if ((i10 * 3) + 1 != aVar.f5932d) {
                        aVarArr[i7] = null;
                    }
                }
            }
        }
    }

    @Override // u0.k
    public final String toString() {
        return "IsLeft: " + this.f5948d + '\n' + super.toString();
    }
}

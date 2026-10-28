package f5;

import n3.r;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x3.d[] f5334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5336c;

    public m() {
        this.f5334a = null;
        this.f5336c = 0;
    }

    public m(m mVar) {
        this.f5334a = null;
        this.f5336c = 0;
        this.f5335b = mVar.f5335b;
        this.f5334a = r.v(mVar.f5334a);
    }

    public x3.d[] getPathData() {
        return this.f5334a;
    }

    public String getPathName() {
        return this.f5335b;
    }

    public void setPathData(x3.d[] dVarArr) {
        if (!r.g(this.f5334a, dVarArr)) {
            this.f5334a = r.v(dVarArr);
            return;
        }
        x3.d[] dVarArr2 = this.f5334a;
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            dVarArr2[i7].f14568a = dVarArr[i7].f14568a;
            int i10 = 0;
            while (true) {
                float[] fArr = dVarArr[i7].f14569b;
                if (i10 < fArr.length) {
                    dVarArr2[i7].f14569b[i10] = fArr[i10];
                    i10++;
                }
            }
        }
    }
}

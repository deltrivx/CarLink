package z1;

import y1.h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f15645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f15646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f15647g;

    public f(q qVar, q qVar2) {
        float[] fArrG;
        super(qVar2, qVar, qVar2, null);
        this.f15645e = qVar;
        this.f15646f = qVar2;
        float[] fArr = a.f15611b.f15612a;
        s sVar = qVar.f15672d;
        float[] fArr2 = qVar.f15677i;
        s sVar2 = qVar2.f15672d;
        float[] fArr3 = qVar2.f15678j;
        if (j.d(sVar, sVar2)) {
            fArrG = j.g(fArr3, fArr2);
        } else {
            float[] fArrA = sVar.a();
            float[] fArrA2 = sVar2.a();
            s sVar3 = j.f15654b;
            fArrG = j.g(j.d(sVar2, sVar3) ? fArr3 : j.f(j.g(j.c(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.f15677i)), j.d(sVar, sVar3) ? fArr2 : j.g(j.c(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f15647g = fArrG;
    }

    @Override // z1.g
    public final long a(long j5) {
        float fH = y1.q.h(j5);
        float fG = y1.q.g(j5);
        float fE = y1.q.e(j5);
        float fD = y1.q.d(j5);
        m mVar = this.f15645e.f15683p;
        float fB = (float) mVar.b(fH);
        float fB2 = (float) mVar.b(fG);
        float fB3 = (float) mVar.b(fE);
        float[] fArr = this.f15647g;
        float f10 = (fArr[6] * fB3) + (fArr[3] * fB2) + (fArr[0] * fB);
        float f11 = (fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB);
        float f12 = (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
        q qVar = this.f15646f;
        float fB4 = (float) qVar.f15680m.b(f10);
        m mVar2 = qVar.f15680m;
        return h0.b(fB4, (float) mVar2.b(f11), (float) mVar2.b(f12), fD, qVar);
    }
}

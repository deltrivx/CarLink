package z1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f15648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f15649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f15650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f15651d;

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Illegal instructions before constructor call */
    public g(c cVar, c cVar2, int i7) {
        float[] fArr;
        long j5 = cVar.f15619b;
        long j10 = b.f15613a;
        c cVarA = b.a(j5, j10) ? j.a(cVar) : cVar;
        c cVarA2 = b.a(cVar2.f15619b, j10) ? j.a(cVar2) : cVar2;
        if (i7 == 3) {
            boolean zA = b.a(cVar.f15619b, j10);
            boolean zA2 = b.a(cVar2.f15619b, j10);
            if (!(zA && zA2) && (zA || zA2)) {
                s sVar = ((q) (zA ? cVar : cVar2)).f15672d;
                float[] fArrA = j.f15657e;
                float[] fArrA2 = zA ? sVar.a() : fArrA;
                fArrA = zA2 ? sVar.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(cVar2, cVarA, cVarA2, fArr);
    }

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f15648a = cVar;
        this.f15649b = cVar2;
        this.f15650c = cVar3;
        this.f15651d = fArr;
    }

    public long a(long j5) {
        float fH = y1.q.h(j5);
        float fG = y1.q.g(j5);
        float fE = y1.q.e(j5);
        float fD = y1.q.d(j5);
        c cVar = this.f15649b;
        long jD = cVar.d(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = cVar.e(fH, fG, fE);
        float[] fArr = this.f15651d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f10 = fIntBitsToFloat;
        float f11 = fIntBitsToFloat2;
        return this.f15650c.f(f10, f11, fE2, fD, this.f15648a);
    }
}

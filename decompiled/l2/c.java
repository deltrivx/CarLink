package l2;

import cc.s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f7981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a[] f7983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f7985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f7986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f7987h;

    public /* synthetic */ c() {
        this(false, b.f7977a);
    }

    public c(int i7) {
        this(true, b.f7978b);
    }

    public c(boolean z10, b bVar) {
        int i7;
        this.f7980a = z10;
        this.f7981b = bVar;
        if (z10 && bVar.equals(b.f7977a)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            i7 = 3;
        } else {
            if (iOrdinal != 1) {
                throw new s();
            }
            i7 = 2;
        }
        this.f7982c = i7;
        this.f7983d = new a[20];
        this.f7985f = new float[20];
        this.f7986g = new float[20];
        this.f7987h = new float[3];
    }

    public final void a(float f10, long j5) {
        int i7 = (this.f7984e + 1) % 20;
        this.f7984e = i7;
        a[] aVarArr = this.f7983d;
        a aVar = aVarArr[i7];
        if (aVar != null) {
            aVar.f7975a = j5;
            aVar.f7976b = f10;
        } else {
            a aVar2 = new a();
            aVar2.f7975a = j5;
            aVar2.f7976b = f10;
            aVarArr[i7] = aVar2;
        }
    }

    public final float b(float f10) {
        b bVar;
        float[] fArr;
        float[] fArr2;
        boolean z10;
        int i7;
        float f11;
        float fSignum;
        float f12 = f10;
        float f13 = 0.0f;
        if (f12 <= 0.0f) {
            n2.a.b("maximumVelocity should be a positive value. You specified=" + f12);
        }
        int i10 = this.f7984e;
        a[] aVarArr = this.f7983d;
        a aVar = aVarArr[i10];
        if (aVar == null) {
            f11 = 0.0f;
        } else {
            int i11 = 0;
            a aVar2 = aVar;
            do {
                a aVar3 = aVarArr[i10];
                boolean z11 = this.f7980a;
                bVar = this.f7981b;
                fArr = this.f7985f;
                fArr2 = this.f7986g;
                if (aVar3 == null) {
                    z10 = z11;
                    i7 = 1;
                    f11 = 0.0f;
                    break;
                }
                long j5 = aVar.f7975a;
                int i12 = i10;
                f11 = 0.0f;
                long j10 = aVar3.f7975a;
                float f14 = j5 - j10;
                z10 = z11;
                i7 = 1;
                float fAbs = Math.abs(j10 - aVar2.f7975a);
                aVar2 = (bVar == b.f7977a || z10) ? aVar3 : aVar;
                if (f14 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i11] = aVar3.f7976b;
                fArr2[i11] = -f14;
                i10 = (i12 == 0 ? 20 : i12) - 1;
                i11++;
            } while (i11 < 20);
            if (i11 >= this.f7982c) {
                int iOrdinal = bVar.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.f7987h;
                        g5.a.V(fArr2, fArr, i11, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = 0.0f;
                    }
                } else {
                    if (iOrdinal != i7) {
                        throw new s();
                    }
                    int i13 = i11 - i7;
                    float f15 = fArr2[i13];
                    int i14 = i13;
                    float fAbs2 = 0.0f;
                    while (i14 > 0) {
                        int i15 = i14 - 1;
                        float f16 = fArr2[i15];
                        if (f15 != f16) {
                            float f17 = (z10 ? -fArr[i15] : fArr[i14] - fArr[i15]) / (f15 - f16);
                            fAbs2 += Math.abs(f17) * (f17 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i14 == i13) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i14--;
                        f15 = f16;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f13 = fSignum * 1000;
            } else {
                f13 = 0.0f;
            }
        }
        if (f13 == f11 || Float.isNaN(f13)) {
            return 0.0f;
        }
        if (f13 <= f11) {
            f12 = -f12;
            if (f13 >= f12) {
                return f13;
            }
        } else if (f13 <= f12) {
            f12 = f13;
        }
        return f12;
    }
}

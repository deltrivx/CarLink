package q2;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements n3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10748b = 9223372034707292159L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10749c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f10750d;

    public m0(p0 p0Var) {
        this.f10750d = p0Var;
    }

    @Override // n3.c
    public final long F(float f10) {
        return a2.f.o(L(f10), this);
    }

    @Override // n3.c
    public final float J(int i7) {
        return i7 / a();
    }

    @Override // n3.c
    public final float L(float f10) {
        return f10 / a();
    }

    @Override // n3.c
    public final float O() {
        return this.f10750d.O();
    }

    @Override // n3.c
    public final float R(float f10) {
        return a() * f10;
    }

    @Override // n3.c
    public final float a() {
        return this.f10750d.a();
    }

    @Override // n3.c
    public final /* synthetic */ int a0(float f10) {
        return a2.f.j(f10, this);
    }

    public final void b(o2.o oVar, float f10) {
        p0 p0Var = this.f10750d;
        p.p pVar = p0Var.f10774m;
        if (pVar == null) {
            pVar = new p.p();
            p0Var.f10774m = pVar;
        }
        int iC0 = u8.l.C0(oVar, (o2.o[]) pVar.f9860b);
        if (iC0 >= 0) {
            float[] fArr = (float[]) pVar.f9861c;
            if (fArr[iC0] != f10) {
                fArr[iC0] = f10;
                ((byte[]) pVar.f9862d)[iC0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) pVar.f9862d;
                if (bArr[iC0] == 2) {
                    bArr[iC0] = 0;
                    return;
                }
                return;
            }
        }
        int i7 = pVar.f9859a;
        o2.o[] oVarArr = (o2.o[]) pVar.f9860b;
        if (i7 == oVarArr.length) {
            int i10 = i7 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(oVarArr, i10);
            i9.l.d(objArrCopyOf, "copyOf(...)");
            pVar.f9860b = (o2.o[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf((float[]) pVar.f9861c, i10);
            i9.l.d(fArrCopyOf, "copyOf(...)");
            pVar.f9861c = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf((byte[]) pVar.f9862d, i10);
            i9.l.d(bArrCopyOf, "copyOf(...)");
            pVar.f9862d = bArrCopyOf;
        }
        ((o2.o[]) pVar.f9860b)[i7] = oVar;
        ((byte[]) pVar.f9862d)[i7] = 3;
        ((float[]) pVar.f9861c)[i7] = f10;
        pVar.f9859a++;
    }

    @Override // n3.c
    public final /* synthetic */ long e0(long j5) {
        return a2.f.n(j5, this);
    }

    @Override // n3.c
    public final /* synthetic */ float h0(long j5) {
        return a2.f.m(j5, this);
    }

    @Override // n3.c
    public final /* synthetic */ long o(long j5) {
        return a2.f.l(j5, this);
    }

    @Override // n3.c
    public final /* synthetic */ float s(long j5) {
        return a2.f.k(j5, this);
    }
}

package l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3.o0 f7828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o2.w f7829b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o2.w f7830c;

    public s1(b3.o0 o0Var, o2.w wVar) {
        this.f7828a = o0Var;
        this.f7830c = wVar;
    }

    public final long a(long j5) {
        x1.c cVarH;
        o2.w wVar = this.f7829b;
        x1.c cVar = x1.c.f14522e;
        if (wVar != null) {
            if (wVar.isAttached()) {
                o2.w wVar2 = this.f7830c;
                cVarH = wVar2 != null ? wVar2.h(wVar, true) : null;
            } else {
                cVarH = cVar;
            }
            if (cVarH != null) {
                cVar = cVarH;
            }
        }
        int i7 = (int) (j5 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i7);
        float fIntBitsToFloat2 = cVar.f14523a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i7);
            fIntBitsToFloat2 = cVar.f14525c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i7);
            }
        }
        int i10 = (int) (j5 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i10);
        float fIntBitsToFloat5 = cVar.f14524b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i10);
            fIntBitsToFloat5 = cVar.f14526d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i10);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j5, boolean z10) {
        if (z10) {
            j5 = a(j5);
        }
        return this.f7828a.f1409b.g(d(j5));
    }

    public final boolean c(long j5) {
        long jD = d(a(j5));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        b3.o0 o0Var = this.f7828a;
        int iE = o0Var.f1409b.e(fIntBitsToFloat);
        int i7 = (int) (jD >> 32);
        return Float.intBitsToFloat(i7) >= o0Var.e(iE) && Float.intBitsToFloat(i7) <= o0Var.f(iE);
    }

    public final long d(long j5) {
        o2.w wVar;
        o2.w wVar2 = this.f7829b;
        if (wVar2 == null) {
            return j5;
        }
        if (!wVar2.isAttached()) {
            wVar2 = null;
        }
        if (wVar2 == null || (wVar = this.f7830c) == null) {
            return j5;
        }
        o2.w wVar3 = wVar.isAttached() ? wVar : null;
        return wVar3 == null ? j5 : wVar2.n(wVar3, j5);
    }

    public final long e(long j5) {
        o2.w wVar;
        o2.w wVar2 = this.f7829b;
        if (wVar2 == null) {
            return j5;
        }
        if (!wVar2.isAttached()) {
            wVar2 = null;
        }
        if (wVar2 == null || (wVar = this.f7830c) == null) {
            return j5;
        }
        o2.w wVar3 = wVar.isAttached() ? wVar : null;
        return wVar3 == null ? j5 : wVar3.n(wVar2, j5);
    }
}

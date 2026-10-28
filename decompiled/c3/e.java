package c3;

import c1.v2;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2372c;

    public e(int i7, v2 v2Var) {
        this.f2370a = i7;
        this.f2372c = v2Var;
    }

    public e(n nVar) {
        this.f2372c = nVar;
        this.f2370a = -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public float a(int i7, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        n nVar = (n) this.f2372c;
        int i10 = 1;
        if (z10) {
            int iP = g5.a.P(nVar.f2408f, i7, z10);
            int lineStart = nVar.f2408f.getLineStart(iP);
            int iF = nVar.f(iP);
            if (i7 == lineStart || i7 == iF) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        int i11 = i7 * 4;
        if (!z12) {
            i10 = z13 ? 2 : 3;
        } else if (z13) {
            i10 = 0;
        }
        int i12 = i11 + i10;
        if (this.f2370a == i12) {
            return this.f2371b;
        }
        float fH = z12 ? nVar.h(i7, z10) : nVar.i(i7, z10);
        if (z11) {
            this.f2370a = i12;
            this.f2371b = fH;
        }
        return fH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(float f10, a9.c cVar) {
        x2.e eVar;
        if (cVar instanceof x2.e) {
            eVar = (x2.e) cVar;
            int i7 = eVar.f14556c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                eVar.f14556c = i7 - Integer.MIN_VALUE;
            } else {
                eVar = new x2.e(this, cVar);
            }
        } else {
            eVar = new x2.e(this, cVar);
        }
        Object objInvoke = eVar.f14554a;
        int i10 = eVar.f14556c;
        if (i10 == 0) {
            t8.a.e(objInvoke);
            v2 v2Var = (v2) this.f2372c;
            Float f11 = new Float(f10);
            eVar.f14556c = 1;
            objInvoke = v2Var.invoke(f11, eVar);
            z8.a aVar = z8.a.f15774a;
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(objInvoke);
        }
        this.f2371b += ((Number) objInvoke).floatValue();
        return z.f12851a;
    }
}

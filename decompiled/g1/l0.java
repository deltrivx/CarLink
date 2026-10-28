package g1;

import a8.j1;
import f1.l2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends o9.e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5797h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5799j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5800l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j0[] f5796g = new j0[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f5798i = new int[16];
    public Object[] k = new Object[16];

    public final void W() {
        this.f5797h = 0;
        this.f5799j = 0;
        u8.l.t0(0, this.f5800l, null, this.k);
        this.f5800l = 0;
    }

    public final void X(f1.c cVar, l2 l2Var, n1.i iVar, k0 k0Var) {
        if (Z()) {
            com.google.protobuf.q qVar = new com.google.protobuf.q(this);
            l0 l0Var = (l0) qVar.f2837e;
            while (true) {
                j0 j0Var = l0Var.f5796g[qVar.f2834b];
                f1.a aVarD = j0Var.d(qVar);
                f1.c cVar2 = cVar;
                l2 l2Var2 = l2Var;
                n1.i iVar2 = iVar;
                k0 k0Var2 = k0Var;
                try {
                    j0Var.c(qVar, cVar2, l2Var2, iVar2, k0Var2);
                    int i7 = qVar.f2834b;
                    int i10 = l0Var.f5797h;
                    if (i7 < i10) {
                        j0 j0Var2 = l0Var.f5796g[i7];
                        qVar.f2835c += j0Var2.f5792b;
                        qVar.f2836d += j0Var2.f5793c;
                        int i11 = i7 + 1;
                        qVar.f2834b = i11;
                        if (i11 >= i10) {
                            break;
                        }
                        cVar = cVar2;
                        l2Var = l2Var2;
                        iVar = iVar2;
                        k0Var = k0Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (k0Var2 == null) {
                        throw th;
                    }
                    n3.r.b0(th, new j1(aVarD, l2Var2, k0Var2, 5));
                    throw th;
                }
            }
        }
        W();
    }

    public final boolean Y() {
        return this.f5797h == 0;
    }

    public final boolean Z() {
        return this.f5797h != 0;
    }

    public final void a0(j0 j0Var) {
        int i7 = this.f5797h;
        j0[] j0VarArr = this.f5796g;
        if (i7 == j0VarArr.length) {
            j0[] j0VarArr2 = new j0[(i7 > 1024 ? 1024 : i7) + i7];
            System.arraycopy(j0VarArr, 0, j0VarArr2, 0, i7);
            this.f5796g = j0VarArr2;
        }
        int i10 = this.f5799j;
        int i11 = j0Var.f5792b;
        int i12 = j0Var.f5793c;
        int i13 = i10 + i11;
        int[] iArr = this.f5798i;
        int length = iArr.length;
        if (i13 > length) {
            int i14 = (length > 1024 ? 1024 : length) + length;
            if (i14 >= i13) {
                i13 = i14;
            }
            int[] iArr2 = new int[i13];
            u8.l.m0(0, 0, length, iArr, iArr2);
            this.f5798i = iArr2;
        }
        int i15 = this.f5800l + i12;
        Object[] objArr = this.k;
        int length2 = objArr.length;
        if (i15 > length2) {
            int i16 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i16 >= i15) {
                i15 = i16;
            }
            Object[] objArr2 = new Object[i15];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.k = objArr2;
        }
        j0[] j0VarArr3 = this.f5796g;
        int i17 = this.f5797h;
        this.f5797h = i17 + 1;
        j0VarArr3[i17] = j0Var;
        this.f5799j += j0Var.f5792b;
        this.f5800l += i12;
    }
}

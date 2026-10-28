package p1;

import java.util.Arrays;
import java.util.HashMap;
import s.i0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f10011o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10012p;

    public c(long j5, j jVar, h9.k kVar, h9.k kVar2, b bVar) {
        super(j5, jVar, kVar, kVar2);
        this.f10011o = bVar;
        bVar.k();
    }

    @Override // p1.b, p1.f
    public final void c() {
        if (this.f10032c) {
            return;
        }
        super.c();
        if (this.f10012p) {
            return;
        }
        this.f10012p = true;
        this.f10011o.l();
    }

    @Override // p1.b
    public final q w() throws Throwable {
        c cVar;
        b bVar = this.f10011o;
        if (bVar.f10008m || bVar.f10032c) {
            return new g(this);
        }
        i0 i0Var = this.f10004h;
        long j5 = this.f10031b;
        HashMap mapC = i0Var != null ? l.c(bVar.g(), this, this.f10011o.d()) : null;
        synchronized (l.f10057c) {
            try {
                l.d(this);
                try {
                    if (i0Var == null || i0Var.f12447d == 0) {
                        cVar = this;
                        a();
                    } else {
                        cVar = this;
                        q qVarZ = cVar.z(this.f10011o.g(), i0Var, mapC, this.f10011o.d());
                        if (!qVarZ.equals(h.f10040c)) {
                            return qVarZ;
                        }
                        i0 i0VarX = cVar.f10011o.x();
                        if (i0VarX != null) {
                            i0VarX.k(i0Var);
                        } else {
                            cVar.f10011o.C(i0Var);
                            cVar.f10004h = null;
                        }
                    }
                    if (i9.l.g(cVar.f10011o.g(), j5) < 0) {
                        cVar.f10011o.v();
                    }
                    b bVar2 = cVar.f10011o;
                    bVar2.r(bVar2.d().d(j5).c(cVar.f10006j));
                    cVar.f10011o.A(j5);
                    b bVar3 = cVar.f10011o;
                    int i7 = cVar.f10033d;
                    cVar.f10033d = -1;
                    if (i7 >= 0) {
                        int[] iArr = bVar3.k;
                        i9.l.e(iArr, "<this>");
                        int length = iArr.length;
                        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                        iArrCopyOf[length] = i7;
                        bVar3.k = iArrCopyOf;
                    } else {
                        bVar3.getClass();
                    }
                    cVar.f10011o.B(cVar.f10006j);
                    b bVar4 = cVar.f10011o;
                    int[] iArr2 = cVar.k;
                    bVar4.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = bVar4.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            i9.l.b(iArrCopyOf2);
                            iArr2 = iArrCopyOf2;
                        }
                        bVar4.k = iArr2;
                    }
                    cVar.f10008m = true;
                    if (!cVar.f10012p) {
                        cVar.f10012p = true;
                        cVar.f10011o.l();
                    }
                    return h.f10040c;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}

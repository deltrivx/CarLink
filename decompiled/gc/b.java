package gc;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d[] f6212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z f6215d;

    public final d a() {
        d dVarB;
        z zVar;
        synchronized (this) {
            try {
                d[] dVarArrC = this.f6212a;
                if (dVarArrC == null) {
                    dVarArrC = c();
                    this.f6212a = dVarArrC;
                } else if (this.f6213b >= dVarArrC.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrC, dVarArrC.length * 2);
                    i9.l.d(objArrCopyOf, "copyOf(...)");
                    this.f6212a = (d[]) objArrCopyOf;
                    dVarArrC = (d[]) objArrCopyOf;
                }
                int i7 = this.f6214c;
                do {
                    dVarB = dVarArrC[i7];
                    if (dVarB == null) {
                        dVarB = b();
                        dVarArrC[i7] = dVarB;
                    }
                    i7++;
                    if (i7 >= dVarArrC.length) {
                        i7 = 0;
                    }
                } while (!dVarB.a(this));
                this.f6214c = i7;
                this.f6213b++;
                zVar = this.f6215d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zVar != null) {
            zVar.w(1);
        }
        return dVarB;
    }

    public abstract d b();

    public abstract d[] c();

    public final void d(d dVar) {
        z zVar;
        int i7;
        y8.c[] cVarArrB;
        synchronized (this) {
            try {
                int i10 = this.f6213b - 1;
                this.f6213b = i10;
                zVar = this.f6215d;
                if (i10 == 0) {
                    this.f6214c = 0;
                }
                i9.l.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                cVarArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (y8.c cVar : cVarArrB) {
            if (cVar != null) {
                cVar.resumeWith(t8.z.f12851a);
            }
        }
        if (zVar != null) {
            zVar.w(-1);
        }
    }

    public final z e() {
        z zVar;
        synchronized (this) {
            zVar = this.f6215d;
            if (zVar == null) {
                int i7 = this.f6213b;
                zVar = new z(1, Integer.MAX_VALUE, ec.a.f4686b);
                zVar.q(Integer.valueOf(i7));
                this.f6215d = zVar;
            }
        }
        return zVar;
    }
}

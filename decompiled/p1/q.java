package p1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f10069a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f10070b = new Object();

    public static final void a(int i7, int i10) {
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException("index (" + i7 + ") is out of bound of [0, " + i10 + ')');
        }
    }

    public static final boolean b(w wVar, int i7, j1.c cVar, boolean z10) {
        boolean z11;
        synchronized (f10069a) {
            try {
                int i10 = wVar.f10104d;
                if (i10 == i7) {
                    wVar.f10103c = cVar;
                    z11 = true;
                    if (z10) {
                        wVar.f10105e++;
                    }
                    wVar.f10104d = i10 + 1;
                } else {
                    z11 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z11;
    }

    public static final int c(long[] jArr, long j5) {
        int length = jArr.length - 1;
        int i7 = 0;
        while (i7 <= length) {
            int i10 = (i7 + length) >>> 1;
            long j10 = jArr[i10];
            if (j5 > j10) {
                i7 = i10 + 1;
            } else {
                if (j5 >= j10) {
                    return i10;
                }
                length = i10 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static final w e(p pVar) {
        w wVar = pVar.f10068a;
        i9.l.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (w) l.u(wVar, pVar);
    }

    public static final int f(p pVar) {
        w wVar = pVar.f10068a;
        i9.l.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((w) l.i(wVar)).f10105e;
    }

    public static final boolean g(p pVar, h9.k kVar) {
        int i7;
        j1.c cVar;
        Object objInvoke;
        f fVarK;
        boolean zB;
        do {
            synchronized (f10069a) {
                w wVar = pVar.f10068a;
                i9.l.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) l.i(wVar);
                i7 = wVar2.f10104d;
                cVar = wVar2.f10103c;
            }
            i9.l.b(cVar);
            j1.f fVarN = cVar.n();
            objInvoke = kVar.invoke(fVarN);
            j1.c cVarK = fVarN.k();
            if (i9.l.a(cVarK, cVar)) {
                break;
            }
            w wVar3 = pVar.f10068a;
            i9.l.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (l.f10057c) {
                fVarK = l.k();
                zB = b((w) l.x(wVar3, pVar, fVarK), i7, cVarK, true);
            }
            l.o(fVarK, pVar);
        } while (!zB);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final void h() {
        throw new UnsupportedOperationException();
    }

    public abstract void d();
}

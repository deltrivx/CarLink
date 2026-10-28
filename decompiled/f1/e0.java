package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends p1.b0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f4937h = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s.c0 f4940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f4941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4942g;

    public e0(long j5) {
        super(j5);
        s.c0 c0Var = s.l0.f12469a;
        i9.l.c(c0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f4940e = c0Var;
        this.f4941f = f4937h;
    }

    @Override // p1.b0
    public final void a(p1.b0 b0Var) {
        i9.l.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        e0 e0Var = (e0) b0Var;
        this.f4940e = e0Var.f4940e;
        this.f4941f = e0Var.f4941f;
        this.f4942g = e0Var.f4942g;
    }

    @Override // p1.b0
    public final p1.b0 b(long j5) {
        return new e0(j5);
    }

    public final boolean c(f0 f0Var, p1.f fVar) {
        boolean z10;
        boolean z11;
        Object obj = p1.l.f10057c;
        synchronized (obj) {
            z10 = true;
            z11 = (this.f4938c == fVar.g() && this.f4939d == fVar.h()) ? false : true;
        }
        if (this.f4941f == f4937h || (z11 && this.f4942g != d(f0Var, fVar))) {
            z10 = false;
        }
        if (!z10 || !z11) {
            return z10;
        }
        synchronized (obj) {
            this.f4938c = fVar.g();
            this.f4939d = fVar.h();
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d7 A[LOOP:4: B:48:0x00d5->B:49:0x00d7, LOOP_END] */
    public final int d(f0 f0Var, p1.f fVar) throws Throwable {
        s.c0 c0Var;
        int i7;
        int i10;
        Object[] objArr;
        int i11;
        int i12;
        long[] jArr;
        char c10;
        p1.b0 b0VarF;
        synchronized (p1.l.f10057c) {
            c0Var = this.f4940e;
        }
        char c11 = 7;
        if (c0Var.f12401e == 0) {
            return 7;
        }
        h1.e eVarM = b.m();
        Object[] objArr2 = eVarM.f6421a;
        int i13 = eVarM.f6423c;
        for (int i14 = 0; i14 < i13; i14++) {
            ((r) objArr2[i14]).b();
        }
        try {
            Object[] objArr3 = c0Var.f12398b;
            int[] iArr = c0Var.f12399c;
            long[] jArr2 = c0Var.f12397a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i15 = 0;
                i10 = 7;
                while (true) {
                    long j5 = jArr2[i15];
                    if ((((~j5) << c11) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j5 & 255) < 128) {
                                int i18 = (i15 << 3) + i17;
                                Object obj = objArr3[i18];
                                int i19 = iArr[i18];
                                c10 = '\b';
                                p1.z zVar = (p1.z) obj;
                                if (i19 == 1) {
                                    if (zVar instanceof f0) {
                                        try {
                                            f0 f0Var2 = (f0) zVar;
                                            b0VarF = f0Var2.f((e0) p1.l.j(f0Var2.f4954d, fVar), fVar, false, f0Var2.f4952b);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr4 = eVarM.f6421a;
                                            int i20 = eVarM.f6423c;
                                            for (int i21 = 0; i21 < i20; i21++) {
                                                ((r) objArr4[i21]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        b0VarF = p1.l.j(zVar.c(), fVar);
                                    }
                                    int iIdentityHashCode = ((i10 * 31) + System.identityHashCode(b0VarF)) * 31;
                                    long j10 = b0VarF.f10009a;
                                    i10 = iIdentityHashCode + ((int) (j10 ^ (j10 >>> 32)));
                                }
                            } else {
                                c10 = '\b';
                            }
                            j5 >>= c10;
                            i17++;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i16 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i15 != length) {
                        i15++;
                        jArr2 = jArr;
                        c11 = 7;
                    } else {
                        i7 = i10;
                    }
                }
                objArr = eVarM.f6421a;
                i11 = eVarM.f6423c;
                for (i12 = 0; i12 < i11; i12++) {
                    ((r) objArr[i12]).a();
                }
                return i10;
            }
            i7 = 7;
            i10 = i7;
            objArr = eVarM.f6421a;
            i11 = eVarM.f6423c;
            while (i12 < i11) {
                ((r) objArr[i12]).a();
            }
            return i10;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}

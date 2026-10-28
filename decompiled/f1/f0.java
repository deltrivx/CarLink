package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends p1.a0 implements w2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.a f4952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q2 f4953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e0 f4954d = new e0(p1.l.k().g());

    public f0(q2 q2Var, h9.a aVar) {
        this.f4952b = aVar;
        this.f4953c = q2Var;
    }

    @Override // p1.z
    public final p1.b0 c() {
        return this.f4954d;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009f A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x009f, LOOP_END, TryCatch #1 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x005c, B:20:0x0068, B:22:0x0072, B:24:0x008a, B:26:0x0090, B:30:0x009f, B:31:0x00a4), top: B:86:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a4 A[EDGE_INSN: B:92:0x00a4->B:31:0x00a4 BREAK  A[LOOP:1: B:16:0x0049->B:30:0x009f], SYNTHETIC] */
    public final e0 f(e0 e0Var, p1.f fVar, boolean z10, h9.a aVar) {
        e0 e0Var2;
        q2 q2Var;
        char c10;
        if (e0Var.c(this, fVar)) {
            if (z10) {
                h1.e eVarM = b.m();
                Object[] objArr = eVarM.f6421a;
                int i7 = eVarM.f6423c;
                for (int i10 = 0; i10 < i7; i10++) {
                    ((r) objArr[i10]).b();
                }
                try {
                    s.c0 c0Var = e0Var.f4940e;
                    a2.b bVar = r2.f5104a;
                    n1.d dVar = (n1.d) bVar.y();
                    if (dVar == null) {
                        dVar = new n1.d();
                        bVar.X(dVar);
                    }
                    int i11 = dVar.f8708a;
                    Object[] objArr2 = c0Var.f12398b;
                    int[] iArr = c0Var.f12399c;
                    long[] jArr = c0Var.f12397a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j5 = jArr[i12];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i12 != length) {
                                    break;
                                    break;
                                }
                                i12++;
                            } else {
                                int i13 = 8 - ((~(i12 - length)) >>> 31);
                                for (int i14 = 0; i14 < i13; i14++) {
                                    if ((j5 & 255) < 128) {
                                        int i15 = (i12 << 3) + i14;
                                        c10 = '\b';
                                        p1.z zVar = (p1.z) objArr2[i15];
                                        dVar.f8708a = i11 + iArr[i15];
                                        h9.k kVarE = fVar.e();
                                        if (kVarE != null) {
                                            kVarE.invoke(zVar);
                                        }
                                    } else {
                                        c10 = '\b';
                                    }
                                    j5 >>= c10;
                                }
                                if (i13 != 8) {
                                    break;
                                }
                                if (i12 != length) {
                                    break;
                                }
                                i12++;
                            }
                        }
                    }
                    dVar.f8708a = i11;
                } finally {
                    Object[] objArr3 = eVarM.f6421a;
                    int i16 = eVarM.f6423c;
                    for (int i17 = 0; i17 < i16; i17++) {
                        ((r) objArr3[i17]).a();
                    }
                }
            }
            return e0Var;
        }
        s.c0 c0Var2 = new s.c0();
        a2.b bVar2 = r2.f5104a;
        n1.d dVar2 = (n1.d) bVar2.y();
        if (dVar2 == null) {
            dVar2 = new n1.d();
            bVar2.X(dVar2);
        }
        int i18 = dVar2.f8708a;
        h1.e eVarM2 = b.m();
        Object[] objArr4 = eVarM2.f6421a;
        int i19 = eVarM2.f6423c;
        for (int i20 = 0; i20 < i19; i20++) {
            ((r) objArr4[i20]).b();
        }
        try {
            dVar2.f8708a = i18 + 1;
            Object objM = n4.e.m(aVar, new d0.m0(this, dVar2, c0Var2, i18, 1));
            dVar2.f8708a = i18;
            Object[] objArr5 = eVarM2.f6421a;
            int i21 = eVarM2.f6423c;
            for (int i22 = 0; i22 < i21; i22++) {
                ((r) objArr5[i22]).a();
            }
            Object obj = p1.l.f10057c;
            synchronized (obj) {
                try {
                    p1.f fVarK = p1.l.k();
                    Object obj2 = e0Var.f4941f;
                    if (obj2 == e0.f4937h || (q2Var = this.f4953c) == null || !q2Var.a(objM, obj2)) {
                        e0Var2 = (e0) p1.l.n(this.f4954d, this, fVarK);
                        e0Var2.f4940e = c0Var2;
                        e0Var2.f4942g = e0Var2.d(this, fVarK);
                        e0Var2.f4941f = objM;
                    } else {
                        e0Var.f4940e = c0Var2;
                        e0Var.f4942g = e0Var.d(this, fVarK);
                        e0Var2 = e0Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            n1.d dVar3 = (n1.d) r2.f5104a.y();
            if (dVar3 == null || dVar3.f8708a != 0) {
                return e0Var2;
            }
            p1.l.k().m();
            synchronized (obj) {
                p1.f fVarK2 = p1.l.k();
                e0Var2.f4938c = fVarK2.g();
                e0Var2.f4939d = fVarK2.h();
            }
            return e0Var2;
        } catch (Throwable th2) {
            Object[] objArr6 = eVarM2.f6421a;
            int i23 = eVarM2.f6423c;
            for (int i24 = 0; i24 < i23; i24++) {
                ((r) objArr6[i24]).a();
            }
            throw th2;
        }
    }

    public final e0 g() {
        p1.f fVarK = p1.l.k();
        return f((e0) p1.l.j(this.f4954d, fVarK), fVarK, false, this.f4952b);
    }

    @Override // f1.w2
    public final Object getValue() {
        h9.k kVarE = p1.l.k().e();
        if (kVarE != null) {
            kVarE.invoke(this);
        }
        p1.f fVarK = p1.l.k();
        return f((e0) p1.l.j(this.f4954d, fVarK), fVarK, true, this.f4952b).f4941f;
    }

    @Override // p1.z
    public final void k(p1.b0 b0Var) {
        i9.l.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f4954d = (e0) b0Var;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        e0 e0Var = (e0) p1.l.i(this.f4954d);
        sb2.append(e0Var.c(this, p1.l.k()) ? String.valueOf(e0Var.f4941f) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}

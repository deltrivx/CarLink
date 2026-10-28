package h0;

import f1.w1;
import f1.x2;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements o1.f, o1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1.g f6357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1.d f6358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s.i0 f6359c;

    public q0(o1.f fVar, Map map, o1.d dVar) {
        c8.k kVar = new c8.k(15, fVar);
        x2 x2Var = o1.h.f9281a;
        this.f6357a = new o1.g(map, kVar);
        this.f6358b = dVar;
        s.i0 i0Var = s.p0.f12478a;
        this.f6359c = new s.i0();
    }

    @Override // o1.f
    public final boolean a(Object obj) {
        return this.f6357a.a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004e A[LOOP:0: B:5:0x000d->B:17:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0051 A[EDGE_INSN: B:21:0x0051->B:18:0x0051 BREAK  A[LOOP:0: B:5:0x000d->B:17:0x004e], SYNTHETIC] */
    @Override // o1.f
    public final Map b() {
        s.i0 i0Var = this.f6359c;
        Object[] objArr = i0Var.f12445b;
        long[] jArr = i0Var.f12444a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j5 = jArr[i7];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i7 != length) {
                        break;
                        break;
                    }
                    i7++;
                } else {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j5) < 128) {
                            Object obj = objArr[(i7 << 3) + i11];
                            o1.d dVar = this.f6358b;
                            if (dVar.f9275b.k(obj) == null) {
                                dVar.f9274a.remove(obj);
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                    if (i7 != length) {
                        break;
                    }
                    i7++;
                }
            }
        }
        return this.f6357a.b();
    }

    @Override // o1.f
    public final Object c(String str) {
        return this.f6357a.c(str);
    }

    @Override // o1.b
    public final void d(Object obj, n1.c cVar, f1.s sVar, int i7) {
        int i10;
        sVar.Y(-858296452);
        if ((i7 & 6) == 0) {
            i10 = (sVar.h(obj) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.h(this) ? 256 : 128;
        }
        if (sVar.N(i10 & 1, (i10 & 147) != 146)) {
            this.f6358b.d(obj, cVar, sVar, i10 & 126);
            boolean zH = sVar.h(this) | sVar.h(obj);
            Object objK = sVar.K();
            if (zH || objK == f1.n.f5051a) {
                objK = new c8.p(11, this, obj);
                sVar.h0(objK);
            }
            f1.b.c(obj, (h9.k) objK, sVar);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new u(this, obj, cVar, i7, 1);
        }
    }

    @Override // o1.f
    public final o1.e e(String str, h9.a aVar) {
        return this.f6357a.e(str, aVar);
    }
}

package b2;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import f7.q;
import java.util.Locale;
import s.i0;
import s.p0;
import y1.b0;
import y1.c0;
import y1.d0;
import y1.e0;
import y1.h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f1197a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Outline f1202f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f1206j;
    public h0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e0 f1207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public y1.h f1208m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1209n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a2.c f1210o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q f1211p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1212q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1214s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f1215t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f1216u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f1217v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1218w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RectF f1219x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n3.c f1198b = a2.e.f21a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n3.o f1199c = n3.o.f8749a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i9.n f1200d = b.f1194b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f1201e = new a(0, this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1203g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f1204h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f1205i = 9205357640488583168L;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b1.q f1213r = new b1.q();

    static {
        int i7;
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        i9.l.d(lowerCase, "toLowerCase(...)");
        if (!lowerCase.equals("robolectric") && (i7 = Build.VERSION.SDK_INT) < 28 && i7 >= 22) {
            d.f1224e.a();
        }
    }

    public c(e eVar) {
        this.f1197a = eVar;
        eVar.F(false);
        this.f1215t = 0L;
        this.f1216u = 0L;
        this.f1217v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.f1203g) {
            boolean z10 = this.f1218w;
            Outline outline2 = null;
            e eVar = this.f1197a;
            if (z10 || eVar.L() > 0.0f) {
                e0 e0Var = this.f1207l;
                if (e0Var != null) {
                    RectF rectF = this.f1219x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f1219x = rectF;
                    }
                    boolean z11 = e0Var instanceof y1.h;
                    if (!z11) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((y1.h) e0Var).f14895a.computeBounds(rectF, false);
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 > 28 || ((y1.h) e0Var).f14895a.isConvex()) {
                        outline = this.f1202f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f1202f = outline;
                        }
                        if (i7 >= 30) {
                            if (!z11) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(((y1.h) e0Var).f14895a);
                        } else {
                            if (!z11) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(((y1.h) e0Var).f14895a);
                        }
                        this.f1209n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f1202f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f1209n = true;
                        outline = null;
                    }
                    this.f1207l = e0Var;
                    if (outline != null) {
                        outline.setAlpha(eVar.a());
                        outline2 = outline;
                    }
                    eVar.q(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.f1209n && this.f1218w) {
                        eVar.F(false);
                        eVar.d();
                    } else {
                        eVar.F(this.f1218w);
                    }
                } else {
                    eVar.F(this.f1218w);
                    Outline outline4 = this.f1202f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f1202f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jM0 = n3.n.M0(this.f1216u);
                    long j5 = this.f1204h;
                    long j10 = this.f1205i;
                    if (j10 != 9205357640488583168L) {
                        jM0 = j10;
                    }
                    int i10 = (int) (j5 >> 32);
                    int i11 = (int) (j5 & 4294967295L);
                    int i12 = (int) (jM0 >> 32);
                    int i13 = (int) (jM0 & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i12) + Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat(i13) + Float.intBitsToFloat(i11)), this.f1206j);
                    outline5.setAlpha(eVar.a());
                    eVar.q(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i13)))) | (((long) Math.round(Float.intBitsToFloat(i12))) << 32));
                }
            } else {
                eVar.F(false);
                eVar.q(null, 0L);
            }
        }
        this.f1203g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0060 A[LOOP:0: B:14:0x0029->B:24:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0063 A[EDGE_INSN: B:29:0x0063->B:25:0x0063 BREAK  A[LOOP:0: B:14:0x0029->B:24:0x0060], SYNTHETIC] */
    public final void b() {
        if (this.f1214s && this.f1212q == 0) {
            b1.q qVar = this.f1213r;
            c cVar = (c) qVar.f1182b;
            if (cVar != null) {
                cVar.e();
                qVar.f1182b = null;
            }
            i0 i0Var = (i0) qVar.f1184d;
            if (i0Var != null) {
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
                                    ((c) objArr[(i7 << 3) + i11]).e();
                                }
                                j5 >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            } else if (i7 != length) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                    }
                }
                i0Var.b();
            }
            this.f1197a.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008e A[LOOP:0: B:20:0x0057->B:30:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[EDGE_INSN: B:34:0x0091->B:31:0x0091 BREAK  A[LOOP:0: B:20:0x0057->B:30:0x008e], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v5, types: [h9.k, i9.n] */
    public final void c(a2.g gVar) {
        b1.q qVar = this.f1213r;
        qVar.f1183c = (c) qVar.f1182b;
        i0 i0Var = (i0) qVar.f1184d;
        if (i0Var != null && i0Var.h()) {
            i0 i0Var2 = (i0) qVar.f1185e;
            if (i0Var2 == null) {
                i0 i0Var3 = p0.f12478a;
                i0Var2 = new i0();
                qVar.f1185e = i0Var2;
            }
            i0Var2.k(i0Var);
            i0Var.b();
        }
        qVar.f1181a = true;
        this.f1200d.invoke(gVar);
        qVar.f1181a = false;
        c cVar = (c) qVar.f1183c;
        if (cVar != null) {
            cVar.e();
        }
        i0 i0Var4 = (i0) qVar.f1185e;
        if (i0Var4 == null || !i0Var4.h()) {
            return;
        }
        Object[] objArr = i0Var4.f12445b;
        long[] jArr = i0Var4.f12444a;
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
                            ((c) objArr[(i7 << 3) + i11]).e();
                        }
                        j5 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    } else if (i7 != length) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
        }
        i0Var4.b();
    }

    public final h0 d() {
        h0 c0Var;
        h0 h0Var = this.k;
        e0 e0Var = this.f1207l;
        if (h0Var != null) {
            return h0Var;
        }
        if (e0Var != null) {
            b0 b0Var = new b0(e0Var);
            this.k = b0Var;
            return b0Var;
        }
        long jM0 = n3.n.M0(this.f1216u);
        long j5 = this.f1204h;
        long j10 = this.f1205i;
        if (j10 != 9205357640488583168L) {
            jM0 = j10;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM0 >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM0 & 4294967295L)) + fIntBitsToFloat2;
        float f10 = this.f1206j;
        if (f10 > 0.0f) {
            c0Var = new d0(n4.h.f(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f10)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f10)))));
        } else {
            c0Var = new c0(new x1.c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = c0Var;
        return c0Var;
    }

    public final void e() {
        this.f1212q--;
        b();
    }

    public final void f(float f10, long j5, long j10) {
        if (x1.b.b(this.f1204h, j5) && x1.e.a(this.f1205i, j10) && this.f1206j == f10 && this.f1207l == null) {
            return;
        }
        this.k = null;
        this.f1207l = null;
        this.f1203g = true;
        this.f1209n = false;
        this.f1204h = j5;
        this.f1205i = j10;
        this.f1206j = f10;
        a();
    }
}

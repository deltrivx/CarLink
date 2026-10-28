package a2;

import android.graphics.Paint;
import android.graphics.Shader;
import cc.s;
import f7.q;
import i9.l;
import n3.o;
import y1.e0;
import y1.h0;
import y1.m;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f15a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f16b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f17c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f18d;

    public c() {
        a aVar = new a();
        aVar.f6a = e.f21a;
        aVar.f7b = o.f8749a;
        aVar.f8c = i.f22a;
        aVar.f9d = 0L;
        this.f15a = aVar;
        this.f16b = new b(this);
    }

    public static q b(c cVar, long j5, h hVar, int i7) {
        q qVarE = cVar.e(hVar);
        Paint paint = (Paint) qVarE.f5447c;
        if (!y1.q.c(h0.c(paint.getColor()), j5)) {
            qVarE.k(j5);
        }
        if (((Shader) qVarE.f5448d) != null) {
            qVarE.n(null);
        }
        if (!l.a((y1.k) qVarE.f5449e, null)) {
            qVarE.l(null);
        }
        if (qVarE.f5446b != i7) {
            qVarE.j(i7);
        }
        if (paint.isFilterBitmap()) {
            return qVarE;
        }
        qVarE.m(1);
        return qVarE;
    }

    @Override // n3.c
    public final long F(float f10) {
        return f.o(L(f10), this);
    }

    @Override // n3.c
    public final float J(int i7) {
        return i7 / a();
    }

    @Override // n3.c
    public final float L(float f10) {
        return f10 / a();
    }

    @Override // n3.c
    public final float O() {
        return this.f15a.f6a.O();
    }

    @Override // a2.g
    public final void P(float f10, long j5, long j10) {
        this.f15a.f8c.g(f10, j10, b(this, j5, j.f23a, 3));
    }

    @Override // n3.c
    public final float R(float f10) {
        return a() * f10;
    }

    @Override // a2.g
    public final void S(e0 e0Var, m mVar, float f10, h hVar, int i7) {
        this.f15a.f8c.m(e0Var, c(mVar, hVar, f10, null, i7, 1));
    }

    @Override // a2.g
    public final void V(e0 e0Var, long j5, h hVar) {
        this.f15a.f8c.m(e0Var, b(this, j5, hVar, 3));
    }

    @Override // a2.g
    public final b W() {
        return this.f16b;
    }

    @Override // a2.g
    public final void Z(long j5, long j10, long j11, int i7) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        this.f15a.f8c.d(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i11), b(this, j5, j.f23a, i7));
    }

    @Override // n3.c
    public final float a() {
        return this.f15a.f6a.a();
    }

    @Override // n3.c
    public final /* synthetic */ int a0(float f10) {
        return f.j(f10, this);
    }

    public final q c(m mVar, h hVar, float f10, y1.k kVar, int i7, int i10) {
        q qVarE = e(hVar);
        if (mVar != null) {
            mVar.a(f10, this.f16b.J(), qVarE);
        } else {
            Paint paint = (Paint) qVarE.f5447c;
            if (((Shader) qVarE.f5448d) != null) {
                qVarE.n(null);
            }
            long jC = h0.c(paint.getColor());
            long j5 = y1.q.f14948b;
            if (!y1.q.c(jC, j5)) {
                qVarE.k(j5);
            }
            if (paint.getAlpha() / 255.0f != f10) {
                qVarE.i(f10);
            }
        }
        if (!l.a((y1.k) qVarE.f5449e, kVar)) {
            qVarE.l(kVar);
        }
        if (qVarE.f5446b != i7) {
            qVarE.j(i7);
        }
        if (((Paint) qVarE.f5447c).isFilterBitmap() == i10) {
            return qVarE;
        }
        qVarE.m(i10);
        return qVarE;
    }

    @Override // a2.g
    public final long c0() {
        return n3.l.x(this.f16b.J());
    }

    public final void d(y1.f fVar, y1.k kVar) {
        this.f15a.f8c.f(fVar, 0L, c(null, j.f23a, 1.0f, kVar, 3, 1));
    }

    public final q e(h hVar) {
        if (l.a(hVar, j.f23a)) {
            q qVar = this.f17c;
            if (qVar != null) {
                return qVar;
            }
            q qVarH = h0.h();
            qVarH.r(0);
            this.f17c = qVarH;
            return qVarH;
        }
        if (!(hVar instanceof k)) {
            throw new s();
        }
        q qVarH2 = this.f18d;
        if (qVarH2 == null) {
            qVarH2 = h0.h();
            qVarH2.r(1);
            this.f18d = qVarH2;
        }
        Paint paint = (Paint) qVarH2.f5447c;
        float strokeWidth = paint.getStrokeWidth();
        k kVar = (k) hVar;
        float f10 = kVar.f24a;
        if (strokeWidth != f10) {
            qVarH2.q(f10);
        }
        int iE = qVarH2.e();
        int i7 = kVar.f26c;
        if (iE != i7) {
            qVarH2.o(i7);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f11 = kVar.f25b;
        if (strokeMiter != f11) {
            paint.setStrokeMiter(f11);
        }
        int iF = qVarH2.f();
        int i10 = kVar.f27d;
        if (iF == i10) {
            return qVarH2;
        }
        qVarH2.p(i10);
        return qVarH2;
    }

    @Override // n3.c
    public final /* synthetic */ long e0(long j5) {
        return f.n(j5, this);
    }

    @Override // a2.g
    public final long g() {
        return this.f16b.J();
    }

    @Override // a2.g
    public final o getLayoutDirection() {
        return this.f15a.f7b;
    }

    @Override // n3.c
    public final /* synthetic */ float h0(long j5) {
        return f.m(j5, this);
    }

    @Override // a2.g
    public final void i0(long j5, long j10, long j11, long j12, h hVar) {
        int i7 = (int) (j10 >> 32);
        int i10 = (int) (j10 & 4294967295L);
        this.f15a.f8c.c(Float.intBitsToFloat(i7), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), b(this, j5, hVar, 3));
    }

    @Override // n3.c
    public final /* synthetic */ long o(long j5) {
        return f.l(j5, this);
    }

    @Override // a2.g
    public final void q(y1.f fVar, long j5, long j10, long j11, float f10, y1.k kVar, int i7) {
        this.f15a.f8c.p(fVar, j5, j10, j11, c(null, j.f23a, f10, kVar, 3, i7));
    }

    @Override // n3.c
    public final /* synthetic */ float s(long j5) {
        return f.k(j5, this);
    }

    @Override // a2.g
    public final void y(long j5, long j10, long j11, float f10) {
        y1.o oVar = this.f15a.f8c;
        q qVarH = this.f18d;
        if (qVarH == null) {
            qVarH = h0.h();
            qVarH.r(1);
            this.f18d = qVarH;
        }
        Paint paint = (Paint) qVarH.f5447c;
        if (!y1.q.c(h0.c(paint.getColor()), j5)) {
            qVarH.k(j5);
        }
        if (((Shader) qVarH.f5448d) != null) {
            qVarH.n(null);
        }
        if (!l.a((y1.k) qVarH.f5449e, null)) {
            qVarH.l(null);
        }
        if (qVarH.f5446b != 3) {
            qVarH.j(3);
        }
        if (paint.getStrokeWidth() != f10) {
            qVarH.q(f10);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (qVarH.e() != 0) {
            qVarH.o(0);
        }
        if (qVarH.f() != 0) {
            qVarH.p(0);
        }
        if (!paint.isFilterBitmap()) {
            qVarH.m(1);
        }
        oVar.a(j10, j11, qVarH);
    }
}

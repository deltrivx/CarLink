package y1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f14875a = c.f14879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f14876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f14877c;

    @Override // y1.o
    public final void a(long j5, long j10, f7.q qVar) {
        this.f14875a.drawLine(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), (Paint) qVar.f5447c);
    }

    @Override // y1.o
    public final void b(float f10, float f11) {
        this.f14875a.scale(f10, f11);
    }

    @Override // y1.o
    public final void c(float f10, float f11, float f12, float f13, float f14, float f15, f7.q qVar) {
        this.f14875a.drawRoundRect(f10, f11, f12, f13, f14, f15, (Paint) qVar.f5447c);
    }

    @Override // y1.o
    public final void d(float f10, float f11, float f12, float f13, f7.q qVar) {
        this.f14875a.drawRect(f10, f11, f12, f13, (Paint) qVar.f5447c);
    }

    @Override // y1.o
    public final void e(x1.c cVar) {
        l(cVar.f14523a, cVar.f14524b, cVar.f14525c, cVar.f14526d, 1);
    }

    @Override // y1.o
    public final void f(f fVar, long j5, f7.q qVar) {
        this.f14875a.drawBitmap(h0.j(fVar), Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)), (Paint) qVar.f5447c);
    }

    @Override // y1.o
    public final void g(float f10, long j5, f7.q qVar) {
        this.f14875a.drawCircle(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)), f10, (Paint) qVar.f5447c);
    }

    @Override // y1.o
    public final void h() {
        this.f14875a.save();
    }

    @Override // y1.o
    public final void i() {
        h0.n(this.f14875a, false);
    }

    @Override // y1.o
    public final void j(e0 e0Var) {
        Canvas canvas = this.f14875a;
        if (!(e0Var instanceof h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((h) e0Var).f14895a, Region.Op.INTERSECT);
    }

    @Override // y1.o
    public final void k(float[] fArr) {
        if (h0.p(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        h0.u(matrix, fArr);
        this.f14875a.concat(matrix);
    }

    @Override // y1.o
    public final void l(float f10, float f11, float f12, float f13, int i7) {
        this.f14875a.clipRect(f10, f11, f12, f13, i7 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // y1.o
    public final void m(e0 e0Var, f7.q qVar) {
        Canvas canvas = this.f14875a;
        if (!(e0Var instanceof h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((h) e0Var).f14895a, (Paint) qVar.f5447c);
    }

    @Override // y1.o
    public final void n(float f10, float f11) {
        this.f14875a.translate(f10, f11);
    }

    @Override // y1.o
    public final void o() {
        this.f14875a.rotate(45.0f);
    }

    @Override // y1.o
    public final void p(f fVar, long j5, long j10, long j11, f7.q qVar) {
        if (this.f14876b == null) {
            this.f14876b = new Rect();
            this.f14877c = new Rect();
        }
        Canvas canvas = this.f14875a;
        Bitmap bitmapJ = h0.j(fVar);
        Rect rect = this.f14876b;
        i9.l.b(rect);
        int i7 = (int) (j5 >> 32);
        rect.left = i7;
        int i10 = (int) (j5 & 4294967295L);
        rect.top = i10;
        rect.right = i7 + ((int) (j10 >> 32));
        rect.bottom = i10 + ((int) (j10 & 4294967295L));
        Rect rect2 = this.f14877c;
        i9.l.b(rect2);
        int i11 = (int) 0;
        rect2.left = i11;
        int i12 = (int) 0;
        rect2.top = i12;
        rect2.right = i11 + ((int) (j11 >> 32));
        rect2.bottom = i12 + ((int) (j11 & 4294967295L));
        canvas.drawBitmap(bitmapJ, rect, rect2, (Paint) qVar.f5447c);
    }

    @Override // y1.o
    public final void q(x1.c cVar, f7.q qVar) {
        this.f14875a.saveLayer(cVar.f14523a, cVar.f14524b, cVar.f14525c, cVar.f14526d, (Paint) qVar.f5447c, 31);
    }

    @Override // y1.o
    public final void r() {
        this.f14875a.restore();
    }

    @Override // y1.o
    public final void s() {
        h0.n(this.f14875a, true);
    }
}

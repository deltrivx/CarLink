package f5;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Matrix f5337p = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f5338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f5339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f5340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f5341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f5342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PathMeasure f5343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f5344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f5346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f5347j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f5349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f5350n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s.f f5351o;

    public n() {
        this.f5340c = new Matrix();
        this.f5345h = 0.0f;
        this.f5346i = 0.0f;
        this.f5347j = 0.0f;
        this.k = 0.0f;
        this.f5348l = 255;
        this.f5349m = null;
        this.f5350n = null;
        this.f5351o = new s.f(0);
        this.f5344g = new k();
        this.f5338a = new Path();
        this.f5339b = new Path();
    }

    public n(n nVar) {
        this.f5340c = new Matrix();
        this.f5345h = 0.0f;
        this.f5346i = 0.0f;
        this.f5347j = 0.0f;
        this.k = 0.0f;
        this.f5348l = 255;
        this.f5349m = null;
        this.f5350n = null;
        s.f fVar = new s.f(0);
        this.f5351o = fVar;
        this.f5344g = new k(nVar.f5344g, fVar);
        this.f5338a = new Path(nVar.f5338a);
        this.f5339b = new Path(nVar.f5339b);
        this.f5345h = nVar.f5345h;
        this.f5346i = nVar.f5346i;
        this.f5347j = nVar.f5347j;
        this.k = nVar.k;
        this.f5348l = nVar.f5348l;
        this.f5349m = nVar.f5349m;
        String str = nVar.f5349m;
        if (str != null) {
            fVar.put(str, this);
        }
        this.f5350n = nVar.f5350n;
    }

    public final void a(k kVar, Matrix matrix, Canvas canvas, int i7, int i10) {
        int i11;
        float f10;
        int i12;
        float f11;
        Matrix matrix2 = kVar.f5324a;
        ArrayList arrayList = kVar.f5325b;
        matrix2.set(matrix);
        Matrix matrix3 = kVar.f5324a;
        matrix3.preConcat(kVar.f5333j);
        canvas.save();
        char c10 = 0;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            l lVar = (l) arrayList.get(i13);
            if (lVar instanceof k) {
                a((k) lVar, matrix3, canvas, i7, i10);
            } else {
                if (lVar instanceof m) {
                    m mVar = (m) lVar;
                    float f12 = i7 / this.f5347j;
                    float f13 = i10 / this.k;
                    float fMin = Math.min(f12, f13);
                    Matrix matrix4 = this.f5340c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f12, f13);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c10], fArr[1]);
                    i11 = i13;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f14 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f14) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f5338a;
                        path.reset();
                        x3.d[] dVarArr = mVar.f5334a;
                        if (dVarArr != null) {
                            x3.d.b(dVarArr, path);
                        }
                        Path path2 = this.f5339b;
                        path2.reset();
                        if (mVar instanceof i) {
                            path2.setFillType(mVar.f5336c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            j jVar = (j) mVar;
                            float f15 = jVar.f5319i;
                            if (f15 != 0.0f || jVar.f5320j != 1.0f) {
                                float f16 = jVar.k;
                                float f17 = (f15 + f16) % 1.0f;
                                float f18 = (jVar.f5320j + f16) % 1.0f;
                                if (this.f5343f == null) {
                                    this.f5343f = new PathMeasure();
                                }
                                this.f5343f.setPath(path, false);
                                float length = this.f5343f.getLength();
                                float f19 = f17 * length;
                                float f20 = f18 * length;
                                path.reset();
                                if (f19 > f20) {
                                    this.f5343f.getSegment(f19, length, path, true);
                                    f10 = 0.0f;
                                    this.f5343f.getSegment(0.0f, f20, path, true);
                                } else {
                                    f10 = 0.0f;
                                    this.f5343f.getSegment(f19, f20, path, true);
                                }
                                path.rLineTo(f10, f10);
                            }
                            path2.addPath(path, matrix4);
                            g7.l lVar2 = jVar.f5316f;
                            if (((Shader) lVar2.f5999c) == null && lVar2.f5998b == 0) {
                                i12 = 16777215;
                                f11 = 255.0f;
                            } else {
                                if (this.f5342e == null) {
                                    i12 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f5342e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i12 = 16777215;
                                }
                                Paint paint2 = this.f5342e;
                                Shader shader = (Shader) lVar2.f5999c;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(jVar.f5318h * 255.0f));
                                    f11 = 255.0f;
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i14 = lVar2.f5998b;
                                    float f21 = jVar.f5318h;
                                    PorterDuff.Mode mode = q.f5364j;
                                    f11 = 255.0f;
                                    paint2.setColor((i14 & i12) | (((int) (Color.alpha(i14) * f21)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(jVar.f5336c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            g7.l lVar3 = jVar.f5314d;
                            if (((Shader) lVar3.f5999c) != null || lVar3.f5998b != 0) {
                                if (this.f5341d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f5341d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f5341d;
                                Paint.Join join = jVar.f5322m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = jVar.f5321l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(jVar.f5323n);
                                Shader shader2 = (Shader) lVar3.f5999c;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(jVar.f5317g * f11));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i15 = lVar3.f5998b;
                                    float f22 = jVar.f5317g;
                                    PorterDuff.Mode mode2 = q.f5364j;
                                    paint4.setColor((i15 & i12) | (((int) (Color.alpha(i15) * f22)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(jVar.f5315e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i13 = i11 + 1;
                c10 = 0;
            }
            i11 = i13;
            i13 = i11 + 1;
            c10 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f5348l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i7) {
        this.f5348l = i7;
    }
}

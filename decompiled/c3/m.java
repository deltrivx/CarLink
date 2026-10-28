package c3;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Canvas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f2402a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.clipOutPath(path);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f10, float f11, float f12, float f13) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.clipOutRect(f10, f11, f12, f13);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i7, int i10, int i11, int i12) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.clipOutRect(i7, i10, i11, i12);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.clipOutRect(rect);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.clipOutRect(rectF);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f10, float f11, float f12, float f13) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.clipRect(f10, f11, f12, f13);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f10, float f11, float f12, float f13, Region.Op op) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.clipRect(f10, f11, f12, f13, op);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i7, int i10, int i11, int i12) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.clipRect(i7, i10, i11, i12);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.disableZ();
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i7, int i10, int i11, int i12) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawARGB(i7, i10, i11, i12);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawArc(f10, f11, f12, f13, f14, f15, z10, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f10, float f11, boolean z10, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawArc(rectF, f10, f11, z10, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f10, float f11, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f10, f11, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i7, int i10, float f10, float f11, int i11, int i12, boolean z10, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i7, i10, f10, f11, i11, i12, z10, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i7, int i10, int i11, int i12, int i13, int i14, boolean z10, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i7, i10, i11, i12, i13, i14, z10, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i7, int i10, float[] fArr, int i11, int[] iArr, int i12, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i7, i10, fArr, i11, iArr, i12, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawCircle(f10, f11, f12, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i7) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawColor(i7);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i7, BlendMode blendMode) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawColor(i7, blendMode);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i7, PorterDuff.Mode mode) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawColor(i7, mode);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j5) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawColor(j5);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j5, BlendMode blendMode) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawColor(j5, blendMode);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, f10, f11, rectF2, f12, f13, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i7, float[] fArr, int i10, int i11, Font font, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawGlyphs(iArr, i7, fArr, i10, i11, font, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawLine(f10, f11, f12, f13, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i7, int i10, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawLines(fArr, i7, i10, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawOval(f10, f11, f12, f13, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rect, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rectF, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f10, float f11, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawPoint(f10, f11, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i7, int i10, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i7, i10, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i7, int i10, float[] fArr, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i7, i10, fArr, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i7, int i10, int i11) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawRGB(i7, i10, i11);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawRect(f10, f11, f12, f13, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawRenderNode(renderNode);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f10, float f11, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f10, f11, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i7, int i10, float f10, float f11, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawText(charSequence, i7, i10, f10, f11, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f10, float f11, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawText(str, f10, f11, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i7, int i10, float f10, float f11, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawText(str, i7, i10, f10, f11, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i7, int i10, float f10, float f11, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawText(cArr, i7, i10, f10, f11, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f10, float f11, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f10, f11, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i7, int i10, Path path, float f10, float f11, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i7, i10, path, f10, f11, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i7, int i10, int i11, int i12, float f10, float f11, boolean z10, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawTextRun(measuredText, i7, i10, i11, i12, f10, f11, z10, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i7, int i10, int i11, int i12, float f10, float f11, boolean z10, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawTextRun(charSequence, i7, i10, i11, i12, f10, f11, z10, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i7, int i10, int i11, int i12, float f10, float f11, boolean z10, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawTextRun(cArr, i7, i10, i11, i12, f10, f11, z10, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i7, float[] fArr, int i10, float[] fArr2, int i11, int[] iArr, int i12, short[] sArr, int i13, int i14, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i7, fArr, i10, fArr2, i11, iArr, i12, sArr, i13, i14, paint);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.enableZ();
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f2402a;
        if (canvas == null) {
            i9.l.j("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f10, float f11, float f12, float f13) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.quickReject(f10, f11, f12, f13);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f10, float f11, float f12, float f13, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.quickReject(f10, f11, f12, f13, edgeType);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.quickReject(path);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.quickReject(rectF);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.restore();
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i7) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.restoreToCount(i7);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f10) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.rotate(f10);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.save();
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.saveLayer(f10, f11, f12, f13, paint);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint, int i7) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.saveLayer(f10, f11, f12, f13, paint, i7);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i7) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i7);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i7) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f10, f11, f12, f13, i7);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i7, int i10) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f10, f11, f12, f13, i7, i10);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i7) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i7);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i7, int i10) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i7, i10);
        }
        i9.l.j("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f10, float f11) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.scale(f10, f11);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i7) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.setDensity(i7);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f10, float f11) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.skew(f10, f11);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f10, float f11) {
        Canvas canvas = this.f2402a;
        if (canvas != null) {
            canvas.translate(f10, f11);
        } else {
            i9.l.j("nativeCanvas");
            throw null;
        }
    }
}

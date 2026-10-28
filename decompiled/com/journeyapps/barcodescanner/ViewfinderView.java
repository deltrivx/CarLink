package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.baidu.carlifevehicle.R;
import f7.e;
import f7.f;
import f7.v;
import java.util.ArrayList;
import n5.o;
import r5.g;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class ViewfinderView extends View {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f2900l = {0, 64, 128, 192, 255, 192, 128, 64};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f2901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f2907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f2908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f2909i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Rect f2910j;
    public v k;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2901a = new Paint(1);
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f11637b);
        this.f2902b = typedArrayObtainStyledAttributes.getColor(4, resources.getColor(R.color.zxing_viewfinder_mask));
        typedArrayObtainStyledAttributes.getColor(1, resources.getColor(R.color.zxing_result_view));
        this.f2903c = typedArrayObtainStyledAttributes.getColor(2, resources.getColor(R.color.zxing_viewfinder_laser));
        this.f2904d = typedArrayObtainStyledAttributes.getColor(0, resources.getColor(R.color.zxing_possible_result_points));
        this.f2905e = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f2906f = 0;
        this.f2907g = new ArrayList(20);
        this.f2908h = new ArrayList(20);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        v vVar;
        f fVar = this.f2909i;
        if (fVar != null) {
            Rect framingRect = fVar.getFramingRect();
            v previewSize = this.f2909i.getPreviewSize();
            if (framingRect != null && previewSize != null) {
                this.f2910j = framingRect;
                this.k = previewSize;
            }
        }
        Rect rect = this.f2910j;
        if (rect == null || (vVar = this.k) == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i7 = this.f2902b;
        Paint paint = this.f2901a;
        paint.setColor(i7);
        float f10 = width;
        canvas.drawRect(0.0f, 0.0f, f10, rect.top, paint);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, paint);
        canvas.drawRect(rect.right + 1, rect.top, f10, rect.bottom + 1, paint);
        canvas.drawRect(0.0f, rect.bottom + 1, f10, height, paint);
        if (this.f2905e) {
            paint.setColor(this.f2903c);
            paint.setAlpha(f2900l[this.f2906f]);
            this.f2906f = (this.f2906f + 1) % 8;
            int iHeight = (rect.height() / 2) + rect.top;
            canvas.drawRect(rect.left + 2, iHeight - 1, rect.right - 1, iHeight + 2, paint);
        }
        float width2 = getWidth() / vVar.f5455a;
        float height2 = getHeight() / vVar.f5456b;
        boolean zIsEmpty = this.f2908h.isEmpty();
        int i10 = this.f2904d;
        if (!zIsEmpty) {
            paint.setAlpha(80);
            paint.setColor(i10);
            for (o oVar : this.f2908h) {
                canvas.drawCircle((int) (oVar.f8854a * width2), (int) (oVar.f8855b * height2), 3.0f, paint);
            }
            this.f2908h.clear();
        }
        if (!this.f2907g.isEmpty()) {
            paint.setAlpha(160);
            paint.setColor(i10);
            for (o oVar2 : this.f2907g) {
                canvas.drawCircle((int) (oVar2.f8854a * width2), (int) (oVar2.f8855b * height2), 6.0f, paint);
            }
            ArrayList arrayList = this.f2907g;
            ArrayList arrayList2 = this.f2908h;
            this.f2907g = arrayList2;
            this.f2908h = arrayList;
            arrayList2.clear();
        }
        postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
    }

    public void setCameraPreview(f fVar) {
        this.f2909i = fVar;
        fVar.f5397j.add(new e(2, this));
    }

    public void setLaserVisibility(boolean z10) {
        this.f2905e = z10;
    }

    public void setMaskColor(int i7) {
        this.f2902b = i7;
    }
}

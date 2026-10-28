package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f9755l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f9756m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9757a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9758b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9759c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f9760d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f9761e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f9762f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9763g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f9764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f9765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f9766j;
    public final g1 k;

    public h1(TextView textView) {
        this.f9765i = textView;
        this.f9766j = textView.getContext();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            this.k = new f1();
        } else if (i7 >= 23) {
            this.k = new e1();
        } else {
            this.k = new g1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i7 : iArr) {
                if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                    arrayList.add(Integer.valueOf(i7));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f9756m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e7);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e7);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f9758b) {
                if (this.f9765i.getMeasuredHeight() <= 0 || this.f9765i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.k.b(this.f9765i) ? 1048576 : (this.f9765i.getMeasuredWidth() - this.f9765i.getTotalPaddingLeft()) - this.f9765i.getTotalPaddingRight();
                int height = (this.f9765i.getHeight() - this.f9765i.getCompoundPaddingBottom()) - this.f9765i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f9755l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f9765i.getTextSize()) {
                            g(fC, 0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f9758b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence charSequence;
        StaticLayout staticLayout;
        CharSequence transformation;
        int length = this.f9762f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i7 = length - 1;
        int i10 = 1;
        int i11 = 0;
        while (i10 <= i7) {
            int i12 = (i10 + i7) / 2;
            int i13 = this.f9762f[i12];
            TextView textView = this.f9765i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence2 = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f9764h;
            if (textPaint == null) {
                this.f9764h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f9764h.set(textView.getPaint());
            this.f9764h.setTextSize(i13);
            Layout.Alignment alignment = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            int iRound = Math.round(rectF.right);
            int i14 = Build.VERSION.SDK_INT;
            TextView textView2 = this.f9765i;
            if (i14 >= 23) {
                staticLayout = d1.a(charSequence2, alignment, iRound, maxLines, textView2, this.f9764h, this.k);
                charSequence = charSequence2;
            } else {
                charSequence = charSequence2;
                staticLayout = new StaticLayout(charSequence, this.f9764h, iRound, alignment, textView2.getLineSpacingMultiplier(), textView2.getLineSpacingExtra(), textView2.getIncludeFontPadding());
            }
            if ((maxLines == -1 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == charSequence.length())) && staticLayout.getHeight() <= rectF.bottom) {
                int i15 = i12 + 1;
                i11 = i10;
                i10 = i15;
            } else {
                i11 = i12 - 1;
                i7 = i11;
            }
        }
        return this.f9762f[i11];
    }

    public final boolean f() {
        return j() && this.f9757a != 0;
    }

    public final void g(float f10, int i7) {
        Context context = this.f9766j;
        float fApplyDimension = TypedValue.applyDimension(i7, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f9765i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f9758b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e7) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e7);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f9757a == 1) {
            if (!this.f9763g || this.f9762f.length == 0) {
                int iFloor = ((int) Math.floor((this.f9761e - this.f9760d) / this.f9759c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i7 = 0; i7 < iFloor; i7++) {
                    iArr[i7] = Math.round((i7 * this.f9759c) + this.f9760d);
                }
                this.f9762f = b(iArr);
            }
            this.f9758b = true;
        } else {
            this.f9758b = false;
        }
        return this.f9758b;
    }

    public final boolean i() {
        int[] iArr = this.f9762f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f9763g = z10;
        if (z10) {
            this.f9757a = 1;
            this.f9760d = iArr[0];
            this.f9761e = iArr[length - 1];
            this.f9759c = -1.0f;
        }
        return z10;
    }

    public final boolean j() {
        return !(this.f9765i instanceof w);
    }

    public final void k(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f9757a = 1;
        this.f9760d = f10;
        this.f9761e = f11;
        this.f9759c = f12;
        this.f9763g = false;
    }
}

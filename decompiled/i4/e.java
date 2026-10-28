package i4;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.tencent.bugly.proguard.c0;
import p.s1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f6626r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f6627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f6628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1 f6629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c0 f6630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f6631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f6632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f6635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f6636j;
    public final float[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6638m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6639n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6640o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6641p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s1 f6642q;

    public e(s1 s1Var) {
        a aVar = new a();
        aVar.f6621e = Long.MIN_VALUE;
        aVar.f6623g = -1L;
        aVar.f6622f = 0L;
        this.f6627a = aVar;
        this.f6628b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f6631e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f6632f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f6635i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f6636j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.k = fArr5;
        this.f6629c = s1Var;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f6633g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f6634h = f6626r;
        aVar.f6617a = 500;
        aVar.f6618b = 500;
        this.f6642q = s1Var;
    }

    public static float b(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    public final float a(float f10, float f11, float f12, int i7) {
        float fB;
        float interpolation;
        float fB2 = b(this.f6631e[i7] * f11, 0.0f, this.f6632f[i7]);
        float fC = c(f11 - f10, fB2) - c(f10, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f6628b;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f13 = this.f6635i[i7];
            float f14 = this.f6636j[i7];
            float f15 = this.k[i7];
            float f16 = f13 * f12;
            return fB > 0.0f ? b(fB * f16, f14, f15) : -b((-fB) * f16, f14, f15);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f17 = this.f6635i[i7];
        float f18 = this.f6636j[i7];
        float f19 = this.k[i7];
        float f110 = f17 * f12;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f10, float f11) {
        if (f11 != 0.0f) {
            int i7 = this.f6633g;
            if (i7 == 0 || i7 == 1) {
                if (f10 < f11) {
                    if (f10 >= 0.0f) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.f6640o && i7 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i7 == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i7 = 0;
        if (this.f6638m) {
            this.f6640o = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f6627a;
        int i10 = (int) (jCurrentAnimationTimeMillis - aVar.f6621e);
        int i11 = aVar.f6618b;
        if (i10 > i11) {
            i7 = i11;
        } else if (i10 >= 0) {
            i7 = i10;
        }
        aVar.f6625i = i7;
        aVar.f6624h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f6623g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        s1 s1Var;
        int count;
        a aVar = this.f6627a;
        float f10 = aVar.f6620d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f6619c);
        if (iAbs != 0 && (count = (s1Var = this.f6642q).getCount()) != 0) {
            int childCount = s1Var.getChildCount();
            int firstVisiblePosition = s1Var.getFirstVisiblePosition();
            int i7 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && s1Var.getChildAt(0).getTop() >= 0)) : !(i7 >= count && s1Var.getChildAt(childCount - 1).getBottom() <= s1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.f6641p
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r10.getActionMasked()
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 == r2) goto L1f
            r9 = 3
            if (r0 == r9) goto L17
            goto L7c
        L17:
            r8.d()
            return r1
        L1b:
            r8.f6639n = r3
            r8.f6637l = r1
        L1f:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            p.s1 r5 = r8.f6629c
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.a(r0, r4, r6, r1)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.a(r10, r9, r4, r3)
            i4.a r10 = r8.f6627a
            r10.f6619c = r0
            r10.f6620d = r9
            boolean r9 = r8.f6640o
            if (r9 != 0) goto L7c
            boolean r9 = r8.e()
            if (r9 == 0) goto L7c
            com.tencent.bugly.proguard.c0 r9 = r8.f6630d
            if (r9 != 0) goto L60
            com.tencent.bugly.proguard.c0 r9 = new com.tencent.bugly.proguard.c0
            r9.<init>(r2, r8)
            r8.f6630d = r9
        L60:
            r8.f6640o = r3
            r8.f6638m = r3
            boolean r9 = r8.f6637l
            if (r9 != 0) goto L75
            int r9 = r8.f6634h
            if (r9 <= 0) goto L75
            com.tencent.bugly.proguard.c0 r10 = r8.f6630d
            long r6 = (long) r9
            java.util.WeakHashMap r9 = e4.l0.f4369a
            r5.postOnAnimationDelayed(r10, r6)
            goto L7a
        L75:
            com.tencent.bugly.proguard.c0 r9 = r8.f6630d
            r9.run()
        L7a:
            r8.f6637l = r3
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.e.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

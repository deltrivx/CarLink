package f7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.widget.ImageView;
import e4.l0;
import java.util.Formatter;
import o9.e0;
import p.m1;
import p.u2;
import y1.h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q implements l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static q f5444f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5449e;

    public q() {
        this.f5445a = 3;
        this.f5446b = 0;
        this.f5449e = new Object();
    }

    public /* synthetic */ q(int i7) {
        this.f5445a = i7;
    }

    public q(Paint paint) {
        this.f5445a = 5;
        this.f5447c = paint;
        this.f5446b = 3;
    }

    public q(ImageView imageView) {
        this.f5445a = 4;
        this.f5446b = 0;
        this.f5447c = imageView;
    }

    public q(g6.a aVar, g6.c cVar) {
        this.f5445a = 2;
        this.f5447c = aVar;
        int i7 = aVar.f5930b;
        this.f5446b = i7;
        this.f5449e = cVar;
        this.f5448d = new u0.k[i7 + 2];
    }

    public void a(u0.k kVar) {
        if (kVar != null) {
            g6.e eVar = (g6.e) kVar;
            g6.a aVar = (g6.a) this.f5447c;
            g6.a[] aVarArr = (g6.a[]) eVar.f12991c;
            for (g6.a aVar2 : aVarArr) {
                if (aVar2 != null) {
                    aVar2.b();
                }
            }
            eVar.l1(aVarArr, aVar);
            g6.c cVar = (g6.c) eVar.f12990b;
            boolean z10 = eVar.f5948d;
            n5.o oVar = z10 ? cVar.f5937b : cVar.f5939d;
            n5.o oVar2 = z10 ? cVar.f5938c : cVar.f5940e;
            int iW0 = eVar.W0((int) oVar.f8855b);
            int iW1 = eVar.W0((int) oVar2.f8855b);
            int i7 = -1;
            int i10 = 0;
            int iMax = 1;
            while (iW0 < iW1) {
                g6.a aVar3 = aVarArr[iW0];
                if (aVar3 != null) {
                    int i11 = aVar3.f5934f;
                    int i12 = i11 - i7;
                    if (i12 == 0) {
                        i10++;
                    } else {
                        if (i12 == 1) {
                            iMax = Math.max(iMax, i10);
                            i7 = aVar3.f5934f;
                        } else if (i12 < 0 || i11 >= aVar.f5934f || i12 > iW0) {
                            aVarArr[iW0] = null;
                        } else {
                            if (iMax > 2) {
                                i12 *= iMax - 2;
                            }
                            boolean z11 = i12 >= iW0;
                            for (int i13 = 1; i13 <= i12 && !z11; i13++) {
                                z11 = aVarArr[iW0 - i13] != null;
                            }
                            if (z11) {
                                aVarArr[iW0] = null;
                            } else {
                                i7 = aVar3.f5934f;
                            }
                        }
                        i10 = 1;
                    }
                }
                iW0++;
            }
        }
    }

    public void b() {
        ImageView imageView = (ImageView) this.f5447c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            m1.a(drawable);
        }
        if (drawable != null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 <= 21 && i7 == 21) {
                if (((u2) this.f5449e) == null) {
                    this.f5449e = new u2();
                }
                u2 u2Var = (u2) this.f5449e;
                u2Var.f9931a = null;
                u2Var.f9934d = false;
                u2Var.f9932b = null;
                u2Var.f9933c = false;
                ColorStateList imageTintList = imageView.getImageTintList();
                if (imageTintList != null) {
                    u2Var.f9934d = true;
                    u2Var.f9931a = imageTintList;
                }
                PorterDuff.Mode imageTintMode = imageView.getImageTintMode();
                if (imageTintMode != null) {
                    u2Var.f9933c = true;
                    u2Var.f9932b = imageTintMode;
                }
                if (u2Var.f9934d || u2Var.f9933c) {
                    p.u.d(drawable, u2Var, imageView.getDrawableState());
                    return;
                }
            }
            u2 u2Var2 = (u2) this.f5448d;
            if (u2Var2 != null) {
                p.u.d(drawable, u2Var2, imageView.getDrawableState());
            }
        }
    }

    public void c() {
        synchronized (this.f5449e) {
            try {
                if (((Handler) this.f5447c) == null) {
                    if (this.f5446b <= 0) {
                        throw new IllegalStateException("CameraThread is not open");
                    }
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f5448d = handlerThread;
                    handlerThread.start();
                    this.f5447c = new Handler(((HandlerThread) this.f5448d).getLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Runnable runnable) {
        synchronized (this.f5449e) {
            c();
            ((Handler) this.f5447c).post(runnable);
        }
    }

    public int e() {
        Paint.Cap strokeCap = ((Paint) this.f5447c).getStrokeCap();
        int i7 = strokeCap == null ? -1 : y1.g.f14893a[strokeCap.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 != 2) {
            return i7 != 3 ? 0 : 2;
        }
        return 1;
    }

    public int f() {
        Paint.Join strokeJoin = ((Paint) this.f5447c).getStrokeJoin();
        int i7 = strokeJoin == null ? -1 : y1.g.f14894b[strokeJoin.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 != 2) {
            return i7 != 3 ? 0 : 1;
        }
        return 2;
    }

    public void g(AttributeSet attributeSet, int i7) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.f5447c;
        Context context = imageView.getContext();
        int[] iArr = i.a.f6549f;
        a2.b bVarP = a2.b.P(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) bVarP.f13c;
        l0.i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) bVarP.f13c, i7);
        try {
            Drawable drawable3 = imageView.getDrawable();
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = e0.z(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                m1.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList colorStateListA = bVarP.A(2);
                int i10 = Build.VERSION.SDK_INT;
                imageView.setImageTintList(colorStateListA);
                if (i10 == 21 && (drawable2 = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode modeB = m1.b(typedArray.getInt(3, -1), null);
                int i11 = Build.VERSION.SDK_INT;
                imageView.setImageTintMode(modeB);
                if (i11 == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } finally {
            bVarP.V();
        }
    }

    public void h() {
        synchronized (this.f5449e) {
            ((HandlerThread) this.f5448d).quit();
            this.f5448d = null;
            this.f5447c = null;
        }
    }

    public void i(float f10) {
        ((Paint) this.f5447c).setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public void j(int i7) {
        if (this.f5446b == i7) {
            return;
        }
        this.f5446b = i7;
        Paint paint = (Paint) this.f5447c;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(h0.x(i7));
        } else {
            paint.setXfermode(new PorterDuffXfermode(h0.G(i7)));
        }
    }

    public void k(long j5) {
        ((Paint) this.f5447c).setColor(h0.C(j5));
    }

    public void l(y1.k kVar) {
        this.f5449e = kVar;
        ((Paint) this.f5447c).setColorFilter(kVar != null ? kVar.f14921a : null);
    }

    public void m(int i7) {
        ((Paint) this.f5447c).setFilterBitmap(!(i7 == 0));
    }

    public void n(Shader shader) {
        this.f5448d = shader;
        ((Paint) this.f5447c).setShader(shader);
    }

    public void o(int i7) {
        Paint.Cap cap;
        Paint paint = (Paint) this.f5447c;
        if (i7 == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i7 == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i7 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public void p(int i7) {
        Paint.Join join;
        Paint paint = (Paint) this.f5447c;
        if (i7 == 0) {
            join = Paint.Join.MITER;
        } else if (i7 == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i7 == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public void q(float f10) {
        ((Paint) this.f5447c).setStrokeWidth(f10);
    }

    public void r(int i7) {
        ((Paint) this.f5447c).setStyle(i7 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public String toString() {
        switch (this.f5445a) {
            case 2:
                int i7 = this.f5446b;
                u0.k[] kVarArr = (u0.k[]) this.f5448d;
                u0.k kVar = kVarArr[0];
                if (kVar == null) {
                    kVar = kVarArr[i7 + 1];
                }
                Formatter formatter = new Formatter();
                for (int i10 = 0; i10 < ((g6.a[]) kVar.f12991c).length; i10++) {
                    try {
                        formatter.format("CW %3d:", Integer.valueOf(i10));
                        for (int i11 = 0; i11 < i7 + 2; i11++) {
                            u0.k kVar2 = kVarArr[i11];
                            if (kVar2 == null) {
                                formatter.format("    |   ", new Object[0]);
                            } else {
                                g6.a aVar = ((g6.a[]) kVar2.f12991c)[i10];
                                if (aVar == null) {
                                    formatter.format("    |   ", new Object[0]);
                                } else {
                                    formatter.format(" %3d|%3d", Integer.valueOf(aVar.f5934f), Integer.valueOf(aVar.f5933e));
                                }
                            }
                        }
                        formatter.format("%n", new Object[0]);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                formatter.close();
                                break;
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                }
                String string = formatter.toString();
                formatter.close();
                return string;
            default:
                return super.toString();
        }
    }
}

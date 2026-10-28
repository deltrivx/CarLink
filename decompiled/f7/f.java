package f7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.BarcodeView;
import java.util.ArrayList;
import o9.e0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends ViewGroup {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f5387z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g7.g f5388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WindowManager f5389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f5390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SurfaceView f5392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextureView f5393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f5395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f5397j;
    public g7.l k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g7.j f5398l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v f5399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public v f5400n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Rect f5401o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v f5402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Rect f5403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Rect f5404r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public v f5405s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public double f5406t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g7.n f5407u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f5409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a2.d f5410x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f5411y;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5391d = false;
        this.f5394g = false;
        this.f5396i = -1;
        this.f5397j = new ArrayList();
        this.f5398l = new g7.j();
        this.f5403q = null;
        this.f5404r = null;
        this.f5405s = null;
        this.f5406t = 0.1d;
        this.f5407u = null;
        this.f5408v = false;
        BarcodeView barcodeView = (BarcodeView) this;
        this.f5409w = new d(0, barcodeView);
        b bVar = new b(barcodeView, 1);
        this.f5410x = new a2.d(15, barcodeView);
        this.f5411y = new e(0, barcodeView);
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        b(attributeSet);
        this.f5389b = (WindowManager) context.getSystemService("window");
        this.f5390c = new Handler(bVar);
        this.f5395h = new q(1);
    }

    public static void a(BarcodeView barcodeView) {
        if (barcodeView.f5388a == null || barcodeView.getDisplayRotation() == barcodeView.f5396i) {
            return;
        }
        barcodeView.g();
        barcodeView.c();
    }

    private int getDisplayRotation() {
        return this.f5389b.getDefaultDisplay().getRotation();
    }

    public final void b(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r5.g.f11636a);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(1, -1.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f5405s = new v(dimension, dimension2);
        }
        this.f5391d = typedArrayObtainStyledAttributes.getBoolean(3, true);
        int integer = typedArrayObtainStyledAttributes.getInteger(2, -1);
        if (integer == 1) {
            this.f5407u = new g7.k(0);
        } else if (integer == 2) {
            this.f5407u = new g7.k(1);
        } else if (integer == 3) {
            this.f5407u = new g7.k(2);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void c() {
        e0.U();
        Log.d("f", "resume()");
        if (this.f5388a != null) {
            Log.w("f", "initCamera called twice");
        } else {
            Context context = getContext();
            g7.g gVar = new g7.g();
            gVar.f5974f = false;
            gVar.f5975g = true;
            gVar.f5977i = new g7.j();
            g7.f fVar = new g7.f(gVar, 0);
            gVar.f5978j = new g7.f(gVar, 1);
            gVar.k = new g7.f(gVar, 2);
            gVar.f5979l = new g7.f(gVar, 3);
            e0.U();
            if (q.f5444f == null) {
                q.f5444f = new q();
            }
            q qVar = q.f5444f;
            gVar.f5969a = qVar;
            g7.i iVar = new g7.i(context);
            gVar.f5971c = iVar;
            iVar.f5990g = gVar.f5977i;
            gVar.f5976h = new Handler();
            g7.j jVar = this.f5398l;
            if (!gVar.f5974f) {
                gVar.f5977i = jVar;
                iVar.f5990g = jVar;
            }
            this.f5388a = gVar;
            gVar.f5972d = this.f5390c;
            e0.U();
            gVar.f5974f = true;
            gVar.f5975g = false;
            synchronized (qVar.f5449e) {
                qVar.f5446b++;
                qVar.d(fVar);
            }
            this.f5396i = getDisplayRotation();
        }
        if (this.f5402p != null) {
            e();
        } else {
            SurfaceView surfaceView = this.f5392e;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f5409w);
            } else {
                TextureView textureView = this.f5393f;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        this.f5393f.getSurfaceTexture();
                        this.f5402p = new v(this.f5393f.getWidth(), this.f5393f.getHeight());
                        e();
                    } else {
                        this.f5393f.setSurfaceTextureListener(new c(this));
                    }
                }
            }
        }
        requestLayout();
        q qVar2 = this.f5395h;
        Context context2 = getContext();
        a2.d dVar = this.f5410x;
        u uVar = (u) qVar2.f5448d;
        if (uVar != null) {
            uVar.disable();
        }
        qVar2.f5448d = null;
        qVar2.f5447c = null;
        qVar2.f5449e = null;
        Context applicationContext = context2.getApplicationContext();
        qVar2.f5449e = dVar;
        qVar2.f5447c = (WindowManager) applicationContext.getSystemService("window");
        u uVar2 = new u(qVar2, applicationContext);
        qVar2.f5448d = uVar2;
        uVar2.enable();
        qVar2.f5446b = ((WindowManager) qVar2.f5447c).getDefaultDisplay().getRotation();
    }

    public final void d(android.support.v4.media.session.r rVar) {
        if (this.f5394g || this.f5388a == null) {
            return;
        }
        Log.i("f", "Starting preview");
        g7.g gVar = this.f5388a;
        gVar.f5970b = rVar;
        e0.U();
        if (!gVar.f5974f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
        gVar.f5969a.d(gVar.k);
        this.f5394g = true;
        ((BarcodeView) this).h();
        this.f5411y.g();
    }

    public final void e() {
        Rect rect;
        float f10;
        v vVar = this.f5402p;
        if (vVar == null || this.f5400n == null || (rect = this.f5401o) == null) {
            return;
        }
        if (this.f5392e != null && vVar.equals(new v(rect.width(), this.f5401o.height()))) {
            SurfaceHolder holder = this.f5392e.getHolder();
            android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(10, false);
            if (holder == null) {
                throw new IllegalArgumentException("surfaceHolder may not be null");
            }
            rVar.f604b = holder;
            d(rVar);
            return;
        }
        TextureView textureView = this.f5393f;
        if (textureView == null || textureView.getSurfaceTexture() == null) {
            return;
        }
        if (this.f5400n != null) {
            int width = this.f5393f.getWidth();
            int height = this.f5393f.getHeight();
            v vVar2 = this.f5400n;
            float f11 = height;
            float f12 = width / f11;
            float f13 = vVar2.f5455a / vVar2.f5456b;
            float f14 = 1.0f;
            if (f12 < f13) {
                f14 = f13 / f12;
                f10 = 1.0f;
            } else {
                f10 = f12 / f13;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(f14, f10);
            float f15 = width;
            matrix.postTranslate((f15 - (f14 * f15)) / 2.0f, (f11 - (f10 * f11)) / 2.0f);
            this.f5393f.setTransform(matrix);
        }
        SurfaceTexture surfaceTexture = this.f5393f.getSurfaceTexture();
        android.support.v4.media.session.r rVar2 = new android.support.v4.media.session.r(10, false);
        if (surfaceTexture == null) {
            throw new IllegalArgumentException("surfaceTexture may not be null");
        }
        rVar2.f605c = surfaceTexture;
        d(rVar2);
    }

    public g7.g getCameraInstance() {
        return this.f5388a;
    }

    public g7.j getCameraSettings() {
        return this.f5398l;
    }

    public Rect getFramingRect() {
        return this.f5403q;
    }

    public v getFramingRectSize() {
        return this.f5405s;
    }

    public double getMarginFraction() {
        return this.f5406t;
    }

    public Rect getPreviewFramingRect() {
        return this.f5404r;
    }

    public g7.n getPreviewScalingStrategy() {
        g7.n nVar = this.f5407u;
        if (nVar != null) {
            return nVar;
        }
        return this.f5393f != null ? new g7.k(0) : new g7.k(1);
    }

    public v getPreviewSize() {
        return this.f5400n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5391d) {
            TextureView textureView = new TextureView(getContext());
            this.f5393f = textureView;
            textureView.setSurfaceTextureListener(new c(this));
            addView(this.f5393f);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.f5392e = surfaceView;
        surfaceView.getHolder().addCallback(this.f5409w);
        addView(this.f5392e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        v vVar = new v(i11 - i7, i12 - i10);
        this.f5399m = vVar;
        g7.g gVar = this.f5388a;
        if (gVar != null && gVar.f5973e == null) {
            int displayRotation = getDisplayRotation();
            g7.l lVar = new g7.l(0);
            lVar.f6000d = new g7.k(1);
            lVar.f5998b = displayRotation;
            lVar.f5999c = vVar;
            this.k = lVar;
            lVar.f6000d = getPreviewScalingStrategy();
            g7.g gVar2 = this.f5388a;
            g7.l lVar2 = this.k;
            gVar2.f5973e = lVar2;
            gVar2.f5971c.f5991h = lVar2;
            e0.U();
            if (!gVar2.f5974f) {
                throw new IllegalStateException("CameraInstance is not open");
            }
            gVar2.f5969a.d(gVar2.f5978j);
            boolean z11 = this.f5408v;
            if (z11) {
                g7.g gVar3 = this.f5388a;
                gVar3.getClass();
                e0.U();
                if (gVar3.f5974f) {
                    gVar3.f5969a.d(new g7.e(gVar3, 0, z11));
                }
            }
        }
        SurfaceView surfaceView = this.f5392e;
        if (surfaceView == null) {
            TextureView textureView = this.f5393f;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
                return;
            }
            return;
        }
        Rect rect = this.f5401o;
        if (rect == null) {
            surfaceView.layout(0, 0, getWidth(), getHeight());
        } else {
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", parcelableOnSaveInstanceState);
        bundle.putBoolean("torch", this.f5408v);
        return bundle;
    }

    public void setCameraSettings(g7.j jVar) {
        this.f5398l = jVar;
    }

    public void setFramingRectSize(v vVar) {
        this.f5405s = vVar;
    }

    public void setMarginFraction(double d10) {
        if (d10 >= 0.5d) {
            throw new IllegalArgumentException("The margin fraction must be less than 0.5");
        }
        this.f5406t = d10;
    }

    public void setPreviewScalingStrategy(g7.n nVar) {
        this.f5407u = nVar;
    }

    public void setTorch(boolean z10) {
        this.f5408v = z10;
        g7.g gVar = this.f5388a;
        if (gVar != null) {
            e0.U();
            if (gVar.f5974f) {
                gVar.f5969a.d(new g7.e(gVar, 0, z10));
            }
        }
    }

    public void setUseTextureView(boolean z10) {
        this.f5391d = z10;
    }
}

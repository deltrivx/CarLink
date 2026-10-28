package f5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import n3.r;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f5364j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f5365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f5366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorFilter f5367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f5370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Matrix f5371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f5372i;

    public q() {
        this.f5369f = true;
        this.f5370g = new float[9];
        this.f5371h = new Matrix();
        this.f5372i = new Rect();
        o oVar = new o();
        oVar.f5354c = null;
        oVar.f5355d = f5364j;
        oVar.f5353b = new n();
        this.f5365b = oVar;
    }

    public q(o oVar) {
        this.f5369f = true;
        this.f5370g = new float[9];
        this.f5371h = new Matrix();
        this.f5372i = new Rect();
        this.f5365b = oVar;
        this.f5366c = a(oVar.f5354c, oVar.f5355d);
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f5313a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f5372i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f5367d;
        if (colorFilter == null) {
            colorFilter = this.f5366c;
        }
        Matrix matrix = this.f5371h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f5370g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && r.B(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        o oVar = this.f5365b;
        Bitmap bitmap = oVar.f5357f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != oVar.f5357f.getHeight()) {
            oVar.f5357f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            oVar.k = true;
        }
        if (this.f5369f) {
            o oVar2 = this.f5365b;
            if (oVar2.k || oVar2.f5358g != oVar2.f5354c || oVar2.f5359h != oVar2.f5355d || oVar2.f5361j != oVar2.f5356e || oVar2.f5360i != oVar2.f5353b.getRootAlpha()) {
                o oVar3 = this.f5365b;
                oVar3.f5357f.eraseColor(0);
                Canvas canvas2 = new Canvas(oVar3.f5357f);
                n nVar = oVar3.f5353b;
                nVar.a(nVar.f5344g, n.f5337p, canvas2, iMin, iMin2);
                o oVar4 = this.f5365b;
                oVar4.f5358g = oVar4.f5354c;
                oVar4.f5359h = oVar4.f5355d;
                oVar4.f5360i = oVar4.f5353b.getRootAlpha();
                oVar4.f5361j = oVar4.f5356e;
                oVar4.k = false;
            }
        } else {
            o oVar5 = this.f5365b;
            oVar5.f5357f.eraseColor(0);
            Canvas canvas3 = new Canvas(oVar5.f5357f);
            n nVar2 = oVar5.f5353b;
            nVar2.a(nVar2.f5344g, n.f5337p, canvas3, iMin, iMin2);
        }
        o oVar6 = this.f5365b;
        if (oVar6.f5353b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (oVar6.f5362l == null) {
                Paint paint2 = new Paint();
                oVar6.f5362l = paint2;
                paint2.setFilterBitmap(true);
            }
            oVar6.f5362l.setAlpha(oVar6.f5353b.getRootAlpha());
            oVar6.f5362l.setColorFilter(colorFilter);
            paint = oVar6.f5362l;
        }
        canvas.drawBitmap(oVar6.f5357f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f5313a;
        return drawable != null ? drawable.getAlpha() : this.f5365b.f5353b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f5313a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f5365b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f5313a;
        return drawable != null ? drawable.getColorFilter() : this.f5367d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f5313a != null && Build.VERSION.SDK_INT >= 24) {
            return new p(this.f5313a.getConstantState());
        }
        this.f5365b.f5352a = getChangingConfigurations();
        return this.f5365b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f5313a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f5365b.f5353b.f5346i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f5313a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f5365b.f5353b.f5345h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i7;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        o oVar = this.f5365b;
        oVar.f5353b = new n();
        TypedArray typedArrayG = w3.b.g(resources, theme, attributeSet, a.f5291a);
        o oVar2 = this.f5365b;
        n nVar = oVar2.f5353b;
        int i10 = !w3.b.d(xmlPullParser, "tintMode") ? -1 : typedArrayG.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i10 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i10 != 5) {
            if (i10 != 9) {
                switch (i10) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        oVar2.f5355d = mode;
        ColorStateList colorStateListA = w3.b.a(typedArrayG, xmlPullParser, theme);
        if (colorStateListA != null) {
            oVar2.f5354c = colorStateListA;
        }
        boolean z10 = oVar2.f5356e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = typedArrayG.getBoolean(5, z10);
        }
        oVar2.f5356e = z10;
        float f10 = nVar.f5347j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f10 = typedArrayG.getFloat(7, f10);
        }
        nVar.f5347j = f10;
        float f11 = nVar.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = typedArrayG.getFloat(8, f11);
        }
        nVar.k = f11;
        if (nVar.f5347j <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        nVar.f5345h = typedArrayG.getDimension(3, nVar.f5345h);
        int i11 = 2;
        float dimension = typedArrayG.getDimension(2, nVar.f5346i);
        nVar.f5346i = dimension;
        if (nVar.f5345h <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = nVar.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayG.getFloat(4, alpha);
        }
        nVar.setAlpha(alpha);
        String string = typedArrayG.getString(0);
        if (string != null) {
            nVar.f5349m = string;
            nVar.f5351o.put(string, nVar);
        }
        typedArrayG.recycle();
        oVar.f5352a = getChangingConfigurations();
        int i12 = 1;
        oVar.k = true;
        o oVar3 = this.f5365b;
        n nVar2 = oVar3.f5353b;
        ArrayDeque arrayDeque = new ArrayDeque();
        k kVar = nVar2.f5344g;
        s.f fVar = nVar2.f5351o;
        arrayDeque.push(kVar);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z11 = true;
        for (int i13 = 3; eventType != i12 && (xmlPullParser.getDepth() >= depth || eventType != i13); i13 = 3) {
            if (eventType == i11) {
                String name = xmlPullParser.getName();
                k kVar2 = (k) arrayDeque.peek();
                i7 = depth;
                if ("path".equals(name)) {
                    j jVar = new j();
                    jVar.f5315e = 0.0f;
                    jVar.f5317g = 1.0f;
                    jVar.f5318h = 1.0f;
                    jVar.f5319i = 0.0f;
                    jVar.f5320j = 1.0f;
                    jVar.k = 0.0f;
                    Paint.Cap cap2 = Paint.Cap.BUTT;
                    jVar.f5321l = cap2;
                    Paint.Join join2 = Paint.Join.MITER;
                    jVar.f5322m = join2;
                    jVar.f5323n = 4.0f;
                    TypedArray typedArrayG2 = w3.b.g(resources, theme, attributeSet, a.f5293c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayG2.getString(0);
                        if (string2 != null) {
                            jVar.f5335b = string2;
                        }
                        String string3 = typedArrayG2.getString(2);
                        if (string3 != null) {
                            jVar.f5334a = r.u(string3);
                        }
                        jVar.f5316f = w3.b.b(typedArrayG2, xmlPullParser, theme, "fillColor", 1);
                        float f12 = jVar.f5318h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f12 = typedArrayG2.getFloat(12, f12);
                        }
                        jVar.f5318h = f12;
                        int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayG2.getInt(8, -1) : -1;
                        Paint.Cap cap3 = jVar.f5321l;
                        if (i14 == 0) {
                            cap = cap2;
                        } else if (i14 != 1) {
                            cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                        } else {
                            cap = Paint.Cap.ROUND;
                        }
                        jVar.f5321l = cap;
                        int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayG2.getInt(9, -1) : -1;
                        Paint.Join join3 = jVar.f5322m;
                        if (i15 == 0) {
                            join = join2;
                        } else if (i15 != 1) {
                            join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                        } else {
                            join = Paint.Join.ROUND;
                        }
                        jVar.f5322m = join;
                        float f13 = jVar.f5323n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f13 = typedArrayG2.getFloat(10, f13);
                        }
                        jVar.f5323n = f13;
                        jVar.f5314d = w3.b.b(typedArrayG2, xmlPullParser, theme, "strokeColor", 3);
                        float f14 = jVar.f5317g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f14 = typedArrayG2.getFloat(11, f14);
                        }
                        jVar.f5317g = f14;
                        float f15 = jVar.f5315e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f15 = typedArrayG2.getFloat(4, f15);
                        }
                        jVar.f5315e = f15;
                        float f16 = jVar.f5320j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f16 = typedArrayG2.getFloat(6, f16);
                        }
                        jVar.f5320j = f16;
                        float f17 = jVar.k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f17 = typedArrayG2.getFloat(7, f17);
                        }
                        jVar.k = f17;
                        float f18 = jVar.f5319i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f18 = typedArrayG2.getFloat(5, f18);
                        }
                        jVar.f5319i = f18;
                        int i16 = jVar.f5336c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i16 = typedArrayG2.getInt(13, i16);
                        }
                        jVar.f5336c = i16;
                    }
                    typedArrayG2.recycle();
                    kVar2.f5325b.add(jVar);
                    if (jVar.getPathName() != null) {
                        fVar.put(jVar.getPathName(), jVar);
                    }
                    oVar3.f5352a = oVar3.f5352a;
                    z11 = false;
                } else if ("clip-path".equals(name)) {
                    i iVar = new i();
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        TypedArray typedArrayG3 = w3.b.g(resources, theme, attributeSet, a.f5294d);
                        String string4 = typedArrayG3.getString(0);
                        if (string4 != null) {
                            iVar.f5335b = string4;
                        }
                        String string5 = typedArrayG3.getString(1);
                        if (string5 != null) {
                            iVar.f5334a = r.u(string5);
                        }
                        iVar.f5336c = !w3.b.d(xmlPullParser, "fillType") ? 0 : typedArrayG3.getInt(2, 0);
                        typedArrayG3.recycle();
                    }
                    kVar2.f5325b.add(iVar);
                    if (iVar.getPathName() != null) {
                        fVar.put(iVar.getPathName(), iVar);
                    }
                    oVar3.f5352a = oVar3.f5352a;
                } else if ("group".equals(name)) {
                    k kVar3 = new k();
                    TypedArray typedArrayG4 = w3.b.g(resources, theme, attributeSet, a.f5292b);
                    float f19 = kVar3.f5326c;
                    if (w3.b.d(xmlPullParser, "rotation")) {
                        f19 = typedArrayG4.getFloat(5, f19);
                    }
                    kVar3.f5326c = f19;
                    kVar3.f5327d = typedArrayG4.getFloat(1, kVar3.f5327d);
                    kVar3.f5328e = typedArrayG4.getFloat(2, kVar3.f5328e);
                    float f20 = kVar3.f5329f;
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                        f20 = typedArrayG4.getFloat(3, f20);
                    }
                    kVar3.f5329f = f20;
                    float f21 = kVar3.f5330g;
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                        f21 = typedArrayG4.getFloat(4, f21);
                    }
                    kVar3.f5330g = f21;
                    float f22 = kVar3.f5331h;
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                        f22 = typedArrayG4.getFloat(6, f22);
                    }
                    kVar3.f5331h = f22;
                    float f23 = kVar3.f5332i;
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                        f23 = typedArrayG4.getFloat(7, f23);
                    }
                    kVar3.f5332i = f23;
                    String string6 = typedArrayG4.getString(0);
                    if (string6 != null) {
                        kVar3.k = string6;
                    }
                    kVar3.c();
                    typedArrayG4.recycle();
                    kVar2.f5325b.add(kVar3);
                    arrayDeque.push(kVar3);
                    if (kVar3.getGroupName() != null) {
                        fVar.put(kVar3.getGroupName(), kVar3);
                    }
                    oVar3.f5352a = oVar3.f5352a;
                }
            } else {
                i7 = depth;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            depth = i7;
            i12 = 1;
            i11 = 2;
        }
        if (z11) {
            throw new XmlPullParserException("no path defined");
        }
        this.f5366c = a(oVar.f5354c, oVar.f5355d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f5313a;
        return drawable != null ? drawable.isAutoMirrored() : this.f5365b.f5356e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        o oVar = this.f5365b;
        if (oVar == null) {
            return false;
        }
        n nVar = oVar.f5353b;
        if (nVar.f5350n == null) {
            nVar.f5350n = Boolean.valueOf(nVar.f5344g.a());
        }
        if (nVar.f5350n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f5365b.f5354c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f5368e && super.mutate() == this) {
            o oVar = this.f5365b;
            o oVar2 = new o();
            oVar2.f5354c = null;
            oVar2.f5355d = f5364j;
            if (oVar != null) {
                oVar2.f5352a = oVar.f5352a;
                n nVar = new n(oVar.f5353b);
                oVar2.f5353b = nVar;
                if (oVar.f5353b.f5342e != null) {
                    nVar.f5342e = new Paint(oVar.f5353b.f5342e);
                }
                if (oVar.f5353b.f5341d != null) {
                    oVar2.f5353b.f5341d = new Paint(oVar.f5353b.f5341d);
                }
                oVar2.f5354c = oVar.f5354c;
                oVar2.f5355d = oVar.f5355d;
                oVar2.f5356e = oVar.f5356e;
            }
            this.f5365b = oVar2;
            this.f5368e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o oVar = this.f5365b;
        ColorStateList colorStateList = oVar.f5354c;
        if (colorStateList == null || (mode = oVar.f5355d) == null) {
            z10 = false;
        } else {
            this.f5366c = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        n nVar = oVar.f5353b;
        if (nVar.f5350n == null) {
            nVar.f5350n = Boolean.valueOf(nVar.f5344g.a());
        }
        if (nVar.f5350n.booleanValue()) {
            boolean zB = oVar.f5353b.f5344g.b(iArr);
            oVar.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j5) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j5);
        } else {
            super.scheduleSelf(runnable, j5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else if (this.f5365b.f5353b.getRootAlpha() != i7) {
            this.f5365b.f5353b.setRootAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f5365b.f5356e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f5367d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            r.X(drawable, i7);
        } else {
            setTintList(ColorStateList.valueOf(i7));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        o oVar = this.f5365b;
        if (oVar.f5354c != colorStateList) {
            oVar.f5354c = colorStateList;
            this.f5366c = a(colorStateList, oVar.f5355d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        o oVar = this.f5365b;
        if (oVar.f5355d != mode) {
            oVar.f5355d = mode;
            this.f5366c = a(oVar.f5354c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f5313a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}

package f5;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import n3.r;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h implements Animatable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f5309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f5310d = new b(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5308b = new c();

    public e(Context context) {
        this.f5309c = context;
    }

    @Override // f5.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.f5308b;
        cVar.f5303a.draw(canvas);
        if (cVar.f5304b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f5313a;
        return drawable != null ? drawable.getAlpha() : this.f5308b.f5303a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f5308b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f5313a;
        return drawable != null ? drawable.getColorFilter() : this.f5308b.f5303a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f5313a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.f5313a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f5313a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f5308b.f5303a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f5313a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f5308b.f5303a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f5313a;
        return drawable != null ? drawable.getOpacity() : this.f5308b.f5303a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        c cVar;
        Animator animatorA;
        q qVar;
        int next;
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            cVar = this.f5308b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayG = w3.b.g(resources, theme, attributeSet, a.f5295e);
                    int resourceId = typedArrayG.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = q.f5364j;
                        if (Build.VERSION.SDK_INT >= 24) {
                            qVar = new q();
                            ThreadLocal threadLocal = w3.l.f14122a;
                            qVar.f5313a = resources.getDrawable(resourceId, theme);
                            new p(qVar.f5313a.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                                do {
                                    next = xml.next();
                                    if (next == 2) {
                                        break;
                                    }
                                } while (next != 1);
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                qVar = new q();
                                qVar.inflate(resources, xml, attributeSetAsAttributeSet, theme);
                            } catch (IOException e7) {
                                Log.e("VectorDrawableCompat", "parser error", e7);
                                qVar = null;
                            } catch (XmlPullParserException e10) {
                                Log.e("VectorDrawableCompat", "parser error", e10);
                                qVar = null;
                            }
                        }
                        qVar.f5369f = false;
                        qVar.setCallback(this.f5310d);
                        q qVar2 = cVar.f5303a;
                        if (qVar2 != null) {
                            qVar2.setCallback(null);
                        }
                        cVar.f5303a = qVar;
                    }
                    typedArrayG.recycle();
                } else {
                    XmlResourceParser xmlResourceParser = null;
                    if ("target".equals(name)) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a.f5296f);
                        String string = typedArrayObtainAttributes.getString(0);
                        int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                        if (resourceId2 != 0) {
                            Context context = this.f5309c;
                            if (context == null) {
                                typedArrayObtainAttributes.recycle();
                                throw new IllegalStateException("Context can't be null when inflating animators");
                            }
                            if (Build.VERSION.SDK_INT >= 24) {
                                animatorA = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                Resources resources2 = context.getResources();
                                Resources.Theme theme2 = context.getTheme();
                                try {
                                    try {
                                        XmlResourceParser animation = resources2.getAnimation(resourceId2);
                                        try {
                                            animatorA = a.a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                            animation.close();
                                        } catch (IOException e11) {
                                            e = e11;
                                            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                            notFoundException.initCause(e);
                                            throw notFoundException;
                                        } catch (XmlPullParserException e12) {
                                            e = e12;
                                            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                            notFoundException2.initCause(e);
                                            throw notFoundException2;
                                        } catch (Throwable th) {
                                            th = th;
                                            xmlResourceParser = animation;
                                            if (xmlResourceParser != null) {
                                                xmlResourceParser.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (IOException e13) {
                                    e = e13;
                                } catch (XmlPullParserException e14) {
                                    e = e14;
                                }
                            }
                            animatorA.setTarget(cVar.f5303a.f5365b.f5353b.f5351o.get(string));
                            if (cVar.f5305c == null) {
                                cVar.f5305c = new ArrayList();
                                cVar.f5306d = new s.f(0);
                            }
                            cVar.f5305c.add(animatorA);
                            cVar.f5306d.put(animatorA, string);
                        }
                        typedArrayObtainAttributes.recycle();
                    } else {
                        continue;
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
        if (cVar.f5304b == null) {
            cVar.f5304b = new AnimatorSet();
        }
        cVar.f5304b.playTogether(cVar.f5305c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f5313a;
        return drawable != null ? drawable.isAutoMirrored() : this.f5308b.f5303a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f5313a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f5308b.f5304b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f5313a;
        return drawable != null ? drawable.isStateful() : this.f5308b.f5303a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f5308b.f5303a.setBounds(rect);
        }
    }

    @Override // f5.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        Drawable drawable = this.f5313a;
        return drawable != null ? drawable.setLevel(i7) : this.f5308b.f5303a.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5313a;
        return drawable != null ? drawable.setState(iArr) : this.f5308b.f5303a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else {
            this.f5308b.f5303a.setAlpha(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f5308b.f5303a.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f5308b.f5303a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            r.X(drawable, i7);
        } else {
            this.f5308b.f5303a.setTint(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f5308b.f5303a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f5308b.f5303a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f5308b.f5303a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.f5308b;
        if (cVar.f5304b.isStarted()) {
            return;
        }
        cVar.f5304b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f5313a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f5308b.f5304b.end();
        }
    }
}

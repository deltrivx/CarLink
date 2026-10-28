package p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9835a;

    public /* synthetic */ m2(int i7) {
        this.f9835a = i7;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f9835a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) m2.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    m.a.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e7) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e7);
                    return null;
                }
            case 1:
                try {
                    return l.e.e(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e10) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    f5.e eVar = new f5.e(context);
                    eVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return eVar;
                } catch (Exception e11) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e11);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    f5.q qVar = new f5.q();
                    qVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return qVar;
                } catch (Exception e12) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e12);
                    return null;
                }
        }
    }
}

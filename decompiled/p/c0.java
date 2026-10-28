package p;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f9681d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9682a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f9683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f9684c;

    public /* synthetic */ c0() {
    }

    public c0(AbsSeekBar absSeekBar) {
        this.f9683b = absSeekBar;
    }

    public c0(EditText editText) {
        this.f9683b = editText;
        this.f9684c = new l0.o0(editText);
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((android.support.v4.media.session.r) ((l0.o0) this.f9684c).f7772b).getClass();
        if (keyListener instanceof n4.f) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new n4.f(keyListener);
    }

    public void b(AttributeSet attributeSet, int i7) {
        switch (this.f9682a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f9683b;
                a2.b bVarP = a2.b.P(absSeekBar.getContext(), attributeSet, f9681d, i7);
                Drawable drawableE = bVarP.E(0);
                if (drawableE != null) {
                    if (drawableE instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableE;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i10 = 0; i10 < numberOfFrames; i10++) {
                            Drawable drawableE2 = e(animationDrawable.getFrame(i10), true);
                            drawableE2.setLevel(10000);
                            animationDrawable2.addFrame(drawableE2, animationDrawable.getDuration(i10));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableE = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableE);
                }
                Drawable drawableE3 = bVarP.E(1);
                if (drawableE3 != null) {
                    absSeekBar.setProgressDrawable(e(drawableE3, false));
                }
                bVarP.V();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f9683b).getContext().obtainStyledAttributes(attributeSet, i.a.f6552i, i7, 0);
                try {
                    boolean z10 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z10 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    d(z10);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public n4.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        l0.o0 o0Var = (l0.o0) this.f9684c;
        if (inputConnection == null) {
            o0Var.getClass();
            inputConnection = null;
        } else {
            android.support.v4.media.session.r rVar = (android.support.v4.media.session.r) o0Var.f7772b;
            rVar.getClass();
            if (!(inputConnection instanceof n4.b)) {
                inputConnection = new n4.b((EditText) rVar.f604b, inputConnection, editorInfo);
            }
        }
        return (n4.b) inputConnection;
    }

    public void d(boolean z10) {
        n4.k kVar = (n4.k) ((android.support.v4.media.session.r) ((l0.o0) this.f9684c).f7772b).f605c;
        if (kVar.f8788c != z10) {
            if (kVar.f8787b != null) {
                l4.j jVarA = l4.j.a();
                n4.j jVar = kVar.f8787b;
                jVarA.getClass();
                k9.a.l(jVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = jVarA.f8004a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    jVarA.f8005b.remove(jVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            kVar.f8788c = z10;
            if (z10) {
                n4.k.a(kVar.f8786a, l4.j.a().c());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z10) {
        if (drawable instanceof y3.b) {
            y3.c cVar = (y3.c) ((y3.b) drawable);
            Drawable drawable2 = cVar.f15090f;
            if (drawable2 != null) {
                cVar.h(e(drawable2, z10));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i7 = 0; i7 < numberOfLayers; i7++) {
                    int id = layerDrawable.getId(i7);
                    drawableArr[i7] = e(layerDrawable.getDrawable(i7), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable2.setId(i10, layerDrawable.getId(i10));
                    if (Build.VERSION.SDK_INT >= 23) {
                        i4.b.u(layerDrawable, layerDrawable2, i10);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f9684c) == null) {
                    this.f9684c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}

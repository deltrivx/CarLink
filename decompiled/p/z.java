package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class z extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f9986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f7.q f9987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        t2.a(context);
        this.f9988c = false;
        s2.a(this, getContext());
        p pVar = new p(this);
        this.f9986a = pVar;
        pVar.d(attributeSet, i7);
        f7.q qVar = new f7.q(this);
        this.f9987b = qVar;
        qVar.g(attributeSet, i7);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f9986a;
        if (pVar != null) {
            pVar.a();
        }
        f7.q qVar = this.f9987b;
        if (qVar != null) {
            qVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f9986a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f9986a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        u2 u2Var;
        f7.q qVar = this.f9987b;
        if (qVar == null || (u2Var = (u2) qVar.f5448d) == null) {
            return null;
        }
        return u2Var.f9931a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        u2 u2Var;
        f7.q qVar = this.f9987b;
        if (qVar == null || (u2Var = (u2) qVar.f5448d) == null) {
            return null;
        }
        return u2Var.f9932b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f9987b.f5447c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f9986a;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        p pVar = this.f9986a;
        if (pVar != null) {
            pVar.f(i7);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        f7.q qVar = this.f9987b;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        f7.q qVar = this.f9987b;
        if (qVar != null && drawable != null && !this.f9988c) {
            qVar.f5446b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (qVar != null) {
            qVar.b();
            if (this.f9988c) {
                return;
            }
            ImageView imageView = (ImageView) qVar.f5447c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(qVar.f5446b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i7) {
        super.setImageLevel(i7);
        this.f9988c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        f7.q qVar = this.f9987b;
        if (qVar != null) {
            ImageView imageView = (ImageView) qVar.f5447c;
            if (i7 != 0) {
                Drawable drawableZ = o9.e0.z(imageView.getContext(), i7);
                if (drawableZ != null) {
                    m1.a(drawableZ);
                }
                imageView.setImageDrawable(drawableZ);
            } else {
                imageView.setImageDrawable(null);
            }
            qVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        f7.q qVar = this.f9987b;
        if (qVar != null) {
            qVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f9986a;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f9986a;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        f7.q qVar = this.f9987b;
        if (qVar != null) {
            if (((u2) qVar.f5448d) == null) {
                qVar.f5448d = new u2();
            }
            u2 u2Var = (u2) qVar.f5448d;
            u2Var.f9931a = colorStateList;
            u2Var.f9934d = true;
            qVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        f7.q qVar = this.f9987b;
        if (qVar != null) {
            if (((u2) qVar.f5448d) == null) {
                qVar.f5448d = new u2();
            }
            u2 u2Var = (u2) qVar.f5448d;
            u2Var.f9932b = mode;
            u2Var.f9933c = true;
            qVar.b();
        }
    }
}

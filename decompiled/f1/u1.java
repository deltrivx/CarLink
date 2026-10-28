package f1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f5164f;

    public /* synthetic */ u1(TextView textView) {
        this.f5163e = null;
        this.f5164f = null;
        this.f5159a = false;
        this.f5160b = false;
        this.f5162d = textView;
    }

    public u1(t1 t1Var, Object obj, boolean z10, q2 q2Var, boolean z11) {
        this.f5162d = t1Var;
        this.f5159a = z10;
        this.f5163e = q2Var;
        this.f5160b = z11;
        this.f5164f = obj;
        this.f5161c = true;
    }

    public void a() {
        Drawable drawableB;
        CompoundButton compoundButton = (CompoundButton) this.f5162d;
        if (Build.VERSION.SDK_INT >= 23) {
            drawableB = i4.b.b(compoundButton);
        } else {
            if (!k9.a.f7382b) {
                try {
                    Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    k9.a.f7381a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e7) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e7);
                }
                k9.a.f7382b = true;
            }
            Field field = k9.a.f7381a;
            if (field != null) {
                try {
                    drawableB = (Drawable) field.get(compoundButton);
                } catch (IllegalAccessException e10) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e10);
                    k9.a.f7381a = null;
                    drawableB = null;
                }
            } else {
                drawableB = null;
            }
        }
        if (drawableB != null) {
            if (this.f5159a || this.f5160b) {
                Drawable drawableMutate = n3.r.f0(drawableB).mutate();
                if (this.f5159a) {
                    drawableMutate.setTintList((ColorStateList) this.f5163e);
                }
                if (this.f5160b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f5164f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        p.s sVar = (p.s) this.f5162d;
        Drawable checkMarkDrawable = sVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f5159a || this.f5160b) {
                Drawable drawableMutate = n3.r.f0(checkMarkDrawable).mutate();
                if (this.f5159a) {
                    drawableMutate.setTintList((ColorStateList) this.f5163e);
                }
                if (this.f5160b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f5164f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(sVar.getDrawableState());
                }
                sVar.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public Object c() {
        if (this.f5159a) {
            return null;
        }
        Object obj = this.f5164f;
        if (obj != null) {
            return obj;
        }
        t.d("Unexpected form of a provided value");
        throw new cc.s();
    }

    public void d(AttributeSet attributeSet, int i7) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f5162d;
        Context context = compoundButton.getContext();
        int[] iArr = i.a.f6555m;
        a2.b bVarP = a2.b.P(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) bVarP.f13c;
        e4.l0.i(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) bVarP.f13c, i7);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(o9.e0.z(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(o9.e0.z(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(o9.e0.z(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(bVarP.A(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(p.m1.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            bVarP.V();
        }
    }
}

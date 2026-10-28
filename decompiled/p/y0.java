package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f9973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u2 f9974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u2 f9975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u2 f9976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u2 f9977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u2 f9978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u2 f9979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u2 f9980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h1 f9981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9982j = 0;
    public int k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f9983l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9984m;

    public y0(TextView textView) {
        this.f9973a = textView;
        this.f9981i = new h1(textView);
    }

    public static u2 c(Context context, u uVar, int i7) {
        ColorStateList colorStateListI;
        synchronized (uVar) {
            colorStateListI = uVar.f9928a.i(context, i7);
        }
        if (colorStateListI == null) {
            return null;
        }
        u2 u2Var = new u2();
        u2Var.f9934d = true;
        u2Var.f9931a = colorStateListI;
        return u2Var;
    }

    public final void a(Drawable drawable, u2 u2Var) {
        if (drawable == null || u2Var == null) {
            return;
        }
        u.d(drawable, u2Var, this.f9973a.getDrawableState());
    }

    public final void b() {
        u2 u2Var = this.f9974b;
        TextView textView = this.f9973a;
        if (u2Var != null || this.f9975c != null || this.f9976d != null || this.f9977e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f9974b);
            a(compoundDrawables[1], this.f9975c);
            a(compoundDrawables[2], this.f9976d);
            a(compoundDrawables[3], this.f9977e);
        }
        if (this.f9978f == null && this.f9979g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f9978f);
        a(compoundDrawablesRelative[2], this.f9979g);
    }

    public final ColorStateList d() {
        u2 u2Var = this.f9980h;
        if (u2Var != null) {
            return u2Var.f9931a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        u2 u2Var = this.f9980h;
        if (u2Var != null) {
            return u2Var.f9932b;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:279:0x0460  */
    /* JADX WARN: Code duplicated, block: B:281:0x0465  */
    /* JADX WARN: Code duplicated, block: B:284:0x046c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:285:0x046e  */
    /* JADX WARN: Code duplicated, block: B:287:0x0473  */
    /* JADX WARN: Code duplicated, block: B:289:0x0479  */
    /* JADX WARN: Code duplicated, block: B:291:0x047d  */
    /* JADX WARN: Code duplicated, block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0103  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a  */
    /* JADX WARN: Code duplicated, block: B:54:0x011c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AttributeSet attributeSet, int i7) {
        String string;
        boolean z10;
        boolean z11;
        ColorStateList colorStateListA;
        ColorStateList colorStateListA2;
        ColorStateList colorStateListA3;
        String string2;
        u uVar;
        int i10;
        int i11;
        float dimensionPixelSize;
        int i12;
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        int i13;
        TextView textView = this.f9973a;
        Context context = textView.getContext();
        u uVarA = u.a();
        int[] iArr = i.a.f6551h;
        a2.b bVarP = a2.b.P(context, attributeSet, iArr, i7);
        e4.l0.i(textView, textView.getContext(), iArr, attributeSet, (TypedArray) bVarP.f13c, i7);
        TypedArray typedArray = (TypedArray) bVarP.f13c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f9974b = c(context, uVarA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f9975c = c(context, uVarA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f9976d = c(context, uVarA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f9977e = c(context, uVarA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f9978f = c(context, uVarA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f9979g = c(context, uVarA, typedArray.getResourceId(6, 0));
        }
        bVarP.V();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = i.a.f6564v;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            a2.b bVar = new a2.b(context, typedArrayObtainStyledAttributes);
            if (z12 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z10 = false;
                z11 = false;
            } else {
                z11 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z10 = true;
            }
            m(context, bVar);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 < 23) {
                colorStateListA = typedArrayObtainStyledAttributes.hasValue(3) ? bVar.A(3) : null;
                colorStateListA2 = typedArrayObtainStyledAttributes.hasValue(4) ? bVar.A(4) : null;
                if (typedArrayObtainStyledAttributes.hasValue(5)) {
                    colorStateListA3 = bVar.A(5);
                    i13 = 15;
                } else {
                    i13 = 15;
                }
                if (typedArrayObtainStyledAttributes.hasValue(i13)) {
                    string2 = typedArrayObtainStyledAttributes.getString(i13);
                } else {
                    string2 = null;
                }
                if (i14 >= 26 || !typedArrayObtainStyledAttributes.hasValue(13)) {
                    string = null;
                } else {
                    string = typedArrayObtainStyledAttributes.getString(13);
                }
                bVar.V();
            } else {
                i13 = 15;
                colorStateListA = null;
                colorStateListA2 = null;
            }
            colorStateListA3 = null;
            if (typedArrayObtainStyledAttributes.hasValue(i13)) {
                string2 = typedArrayObtainStyledAttributes.getString(i13);
            } else {
                string2 = null;
            }
            if (i14 >= 26) {
                string = null;
            } else {
                string = null;
            }
            bVar.V();
        } else {
            string = null;
            z10 = false;
            z11 = false;
            colorStateListA = null;
            colorStateListA2 = null;
            colorStateListA3 = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i7, 0);
        a2.b bVar2 = new a2.b(context, typedArrayObtainStyledAttributes2);
        if (!z12 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z11 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z10 = true;
        }
        boolean z13 = z11;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 < 23) {
            if (typedArrayObtainStyledAttributes2.hasValue(3)) {
                colorStateListA = bVar2.A(3);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(4)) {
                colorStateListA2 = bVar2.A(4);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(5)) {
                colorStateListA3 = bVar2.A(5);
            }
        }
        ColorStateList colorStateList2 = colorStateListA;
        ColorStateList colorStateList3 = colorStateListA2;
        ColorStateList colorStateList4 = colorStateListA3;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        String str = string2;
        if (i15 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i15 < 28 || !typedArrayObtainStyledAttributes2.hasValue(0)) {
            uVar = uVarA;
        } else {
            uVar = uVarA;
            if (typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
                textView.setTextSize(0, 0.0f);
            }
        }
        m(context, bVar2);
        bVar2.V();
        if (colorStateList2 != null) {
            textView.setTextColor(colorStateList2);
        }
        if (colorStateList3 != null) {
            textView.setHintTextColor(colorStateList3);
        }
        if (colorStateList4 != null) {
            textView.setLinkTextColor(colorStateList4);
        }
        if (!z12 && z10) {
            textView.setAllCaps(z13);
        }
        Typeface typeface = this.f9983l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.f9982j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            w0.d(textView, string);
        }
        if (str == null) {
            i10 = 0;
        } else if (i15 >= 24) {
            v0.b(textView, v0.a(str));
            i10 = 0;
        } else {
            i10 = 0;
            textView.setTextLocale(u0.a(str.split(",")[0]));
        }
        h1 h1Var = this.f9981i;
        Context context2 = h1Var.f9766j;
        int[] iArr3 = i.a.f6552i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i7, i10);
        TextView textView2 = h1Var.f9765i;
        e4.l0.i(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i7);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            h1Var.f9757a = typedArrayObtainStyledAttributes3.getInt(5, i10);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i16 = 0; i16 < length; i16++) {
                    iArr4[i16] = typedArrayObtainTypedArray.getDimensionPixelSize(i16, -1);
                }
                h1Var.f9762f = h1.b(iArr4);
                h1Var.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!h1Var.j()) {
            h1Var.f9757a = 0;
        } else if (h1Var.f9757a == 1) {
            if (!h1Var.f9763g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                float f10 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                h1Var.k(dimension2, f10, dimension);
            }
            h1Var.h();
        }
        if (m3.f9838c && h1Var.f9757a != 0) {
            int[] iArr5 = h1Var.f9762f;
            if (iArr5.length > 0) {
                if (w0.a(textView) != -1.0f) {
                    w0.b(textView, Math.round(h1Var.f9760d), Math.round(h1Var.f9761e), Math.round(h1Var.f9759c), 0);
                } else {
                    w0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        u uVar2 = uVar;
        Drawable drawableB = resourceId4 != -1 ? uVar2.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? uVar2.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? uVar2.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? uVar2.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? uVar2.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? uVar2.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = o9.e0.x(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                i4.b.j(textView, colorStateList);
            } else if (textView instanceof i4.m) {
                ((i4.m) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeB = m1.b(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                i4.b.k(textView, modeB);
            } else if (textView instanceof i4.m) {
                ((i4.m) textView).setSupportCompoundDrawablesTintMode(modeB);
            }
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i11 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i17 = typedValuePeekValue.data;
                int i18 = i17 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i17);
                i12 = i18;
                i11 = -1;
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i11) {
                g5.a.j0(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i11) {
                g5.a.l0(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i12 == i11) {
                    g5.a.m0(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    c.a.l(textView, i12, dimensionPixelSize);
                } else {
                    g5.a.m0(textView, Math.round(TypedValue.applyDimension(i12, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        i11 = -1;
        dimensionPixelSize = -1.0f;
        i12 = -1;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i11) {
            g5.a.j0(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i11) {
            g5.a.l0(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i12 == i11) {
                g5.a.m0(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                c.a.l(textView, i12, dimensionPixelSize);
            } else {
                g5.a.m0(textView, Math.round(TypedValue.applyDimension(i12, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i7) {
        String string;
        ColorStateList colorStateListA;
        ColorStateList colorStateListA2;
        ColorStateList colorStateListA3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, i.a.f6564v);
        a2.b bVar = new a2.b(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f9973a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            if (typedArrayObtainStyledAttributes.hasValue(3) && (colorStateListA3 = bVar.A(3)) != null) {
                textView.setTextColor(colorStateListA3);
            }
            if (typedArrayObtainStyledAttributes.hasValue(5) && (colorStateListA2 = bVar.A(5)) != null) {
                textView.setLinkTextColor(colorStateListA2);
            }
            if (typedArrayObtainStyledAttributes.hasValue(4) && (colorStateListA = bVar.A(4)) != null) {
                textView.setHintTextColor(colorStateListA);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, bVar);
        if (i10 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            w0.d(textView, string);
        }
        bVar.V();
        Typeface typeface = this.f9983l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f9982j);
        }
    }

    public final void h(int i7, int i10, int i11, int i12) {
        h1 h1Var = this.f9981i;
        if (h1Var.j()) {
            DisplayMetrics displayMetrics = h1Var.f9766j.getResources().getDisplayMetrics();
            h1Var.k(TypedValue.applyDimension(i12, i7, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void i(int[] iArr, int i7) {
        h1 h1Var = this.f9981i;
        if (h1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i7 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = h1Var.f9766j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArrCopyOf[i10] = Math.round(TypedValue.applyDimension(i7, iArr[i10], displayMetrics));
                    }
                }
                h1Var.f9762f = h1.b(iArrCopyOf);
                if (!h1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                h1Var.f9763g = false;
            }
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void j(int i7) {
        h1 h1Var = this.f9981i;
        if (h1Var.j()) {
            if (i7 == 0) {
                h1Var.f9757a = 0;
                h1Var.f9760d = -1.0f;
                h1Var.f9761e = -1.0f;
                h1Var.f9759c = -1.0f;
                h1Var.f9762f = new int[0];
                h1Var.f9758b = false;
                return;
            }
            if (i7 != 1) {
                throw new IllegalArgumentException(a2.f.E(i7, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = h1Var.f9766j.getResources().getDisplayMetrics();
            h1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f9980h == null) {
            this.f9980h = new u2();
        }
        u2 u2Var = this.f9980h;
        u2Var.f9931a = colorStateList;
        u2Var.f9934d = colorStateList != null;
        this.f9974b = u2Var;
        this.f9975c = u2Var;
        this.f9976d = u2Var;
        this.f9977e = u2Var;
        this.f9978f = u2Var;
        this.f9979g = u2Var;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.f9980h == null) {
            this.f9980h = new u2();
        }
        u2 u2Var = this.f9980h;
        u2Var.f9932b = mode;
        u2Var.f9933c = mode != null;
        this.f9974b = u2Var;
        this.f9975c = u2Var;
        this.f9976d = u2Var;
        this.f9977e = u2Var;
        this.f9978f = u2Var;
        this.f9979g = u2Var;
    }

    public final void m(Context context, a2.b bVar) {
        String string;
        int i7 = this.f9982j;
        TypedArray typedArray = (TypedArray) bVar.f13c;
        this.f9982j = typedArray.getInt(2, i7);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.k = i11;
            if (i11 != -1) {
                this.f9982j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f9984m = false;
                int i12 = typedArray.getInt(1, 1);
                if (i12 == 1) {
                    this.f9983l = Typeface.SANS_SERIF;
                    return;
                } else if (i12 == 2) {
                    this.f9983l = Typeface.SERIF;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f9983l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f9983l = null;
        int i13 = typedArray.hasValue(12) ? 12 : 10;
        int i14 = this.k;
        int i15 = this.f9982j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceF = bVar.F(i13, this.f9982j, new d3.e(this, i14, i15, new WeakReference(this.f9973a)));
                if (typefaceF != null) {
                    if (i10 < 28 || this.k == -1) {
                        this.f9983l = typefaceF;
                    } else {
                        this.f9983l = x0.a(Typeface.create(typefaceF, 0), this.k, (this.f9982j & 2) != 0);
                    }
                }
                this.f9984m = this.f9983l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f9983l != null || (string = typedArray.getString(i13)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.f9983l = Typeface.create(string, this.f9982j);
        } else {
            this.f9983l = x0.a(Typeface.create(string, 0), this.k, (this.f9982j & 2) != 0);
        }
    }
}

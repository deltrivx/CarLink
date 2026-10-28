package p;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.baidu.carlifevehicle.R;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w extends EditText implements e4.p, i4.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f9945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f9946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f9947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i4.l f9948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f9949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v f9950f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        t2.a(context);
        s2.a(this, getContext());
        p pVar = new p(this);
        this.f9945a = pVar;
        pVar.d(attributeSet, R.attr.editTextStyle);
        y0 y0Var = new y0(this);
        this.f9946b = y0Var;
        y0Var.f(attributeSet, R.attr.editTextStyle);
        y0Var.b();
        c0 c0Var = new c0();
        c0Var.f9683b = this;
        this.f9947c = c0Var;
        this.f9948d = new i4.l();
        c0 c0Var2 = new c0(this);
        this.f9949e = c0Var2;
        c0Var2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerA = c0Var2.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    private v getSuperCaller() {
        if (this.f9950f == null) {
            this.f9950f = new v(this);
        }
        return this.f9950f;
    }

    @Override // e4.p
    public final e4.f a(e4.f fVar) {
        this.f9948d.getClass();
        return i4.l.a(this, fVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f9945a;
        if (pVar != null) {
            pVar.a();
        }
        y0 y0Var = this.f9946b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g5.a.q0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f9945a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f9945a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9946b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9946b.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f9947c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0Var.f9684c;
        return textClassifier == null ? s0.a((TextView) c0Var.f9683b) : textClassifier;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e A[PHI: r1
      0x005e: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:33:0x0071, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrE;
        String[] stringArray;
        InputConnection gVar;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f9946b.getClass();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30 && inputConnectionOnCreateInputConnection != null) {
            g4.d.a(editorInfo, getText());
        }
        n3.r.I(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i7 <= 30 && (strArrE = e4.l0.e(this)) != null) {
            if (i7 >= 25) {
                editorInfo.contentMimeTypes = strArrE;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrE);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrE);
            }
            g4.e eVar = new g4.e(this);
            if (i7 >= 25) {
                gVar = new g4.f(inputConnectionOnCreateInputConnection, eVar);
            } else {
                String[] strArr = g4.d.f5912a;
                if (i7 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                            strArr = stringArray;
                        }
                    }
                }
                if (strArr.length != 0) {
                    gVar = new g4.g(inputConnectionOnCreateInputConnection, eVar);
                }
            }
            inputConnectionOnCreateInputConnection = gVar;
        }
        return this.f9949e.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30 || i7 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i7 = Build.VERSION.SDK_INT;
        boolean zA = false;
        if (i7 < 31 && i7 >= 24 && dragEvent.getLocalState() == null && e4.l0.e(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = f0.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i7) {
        e4.d dVar;
        e4.c cVar;
        int i10;
        a2.d dVar2;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31 || e4.l0.e(this) == null || !(i7 == 16908322 || i7 == 16908337)) {
            return super.onTextContextMenuItem(i7);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i11 >= 31) {
                dVar2 = new a2.d(primaryClip, 1);
            } else {
                dVar = new e4.d(0);
                dVar.f4327b = primaryClip;
                dVar.f4328c = 1;
            }
            if (i7 == 16908322) {
                cVar = dVar;
                cVar = dVar2;
                i10 = 0;
            } else {
                cVar = dVar;
                cVar = dVar2;
                i10 = 1;
            }
            cVar.d(i10);
            e4.l0.h(this, cVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f9945a;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        p pVar = this.f9945a;
        if (pVar != null) {
            pVar.f(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f9946b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f9946b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g5.a.t0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f9949e.d(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f9949e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f9945a;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f9945a;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    @Override // i4.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y0 y0Var = this.f9946b;
        y0Var.k(colorStateList);
        y0Var.b();
    }

    @Override // i4.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y0 y0Var = this.f9946b;
        y0Var.l(mode);
        y0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        y0 y0Var = this.f9946b;
        if (y0Var != null) {
            y0Var.g(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f9947c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0Var.f9684c = textClassifier;
        }
    }
}

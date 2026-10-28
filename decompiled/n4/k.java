package n4;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f8786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f8787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8788c = true;

    public k(EditText editText) {
        this.f8786a = editText;
    }

    public static void a(EditText editText, int i7) {
        int length;
        if (i7 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            l4.j jVarA = l4.j.a();
            if (editableText == null) {
                length = 0;
            } else {
                jVarA.getClass();
                length = editableText.length();
            }
            jVarA.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        EditText editText = this.f8786a;
        if (!editText.isInEditMode() && this.f8788c && l4.j.d() && i10 <= i11 && (charSequence instanceof Spannable)) {
            int iC = l4.j.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    l4.j.a().g(i7, i11 + i7, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            l4.j jVarA = l4.j.a();
            if (this.f8787b == null) {
                this.f8787b = new j(editText);
            }
            jVarA.h(this.f8787b);
        }
    }
}

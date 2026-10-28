package n4;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f8770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kb.d f8771b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        kb.d dVar = new kb.d(29);
        super(inputConnection, false);
        this.f8770a = editText;
        this.f8771b = dVar;
        if (l4.j.d()) {
            l4.j.a().i(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i10) {
        Editable editableText = this.f8770a.getEditableText();
        this.f8771b.getClass();
        return kb.d.i(this, editableText, i7, i10, false) || super.deleteSurroundingText(i7, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i10) {
        Editable editableText = this.f8770a.getEditableText();
        this.f8771b.getClass();
        return kb.d.i(this, editableText, i7, i10, true) || super.deleteSurroundingTextInCodePoints(i7, i10);
    }
}

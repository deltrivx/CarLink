package g3;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class l implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2.a f5872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u0.q f5873b;

    public l(u0.q qVar, b2.a aVar) {
        this.f5872a = aVar;
        this.f5873b = qVar;
    }

    public void a(u0.q qVar) {
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i7) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.clearMetaKeyStates(i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            if (qVar != null) {
                a(qVar);
                this.f5873b = null;
            }
            this.f5872a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i7) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.commitText(charSequence, i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i10) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.deleteSurroundingText(i7, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i7, int i10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i7) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.getCursorCapsMode(i7);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.getExtractedText(extractedTextRequest, i7);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i7) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.getSelectedText(i7);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i7, int i10) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.getTextAfterCursor(i7, i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i7, int i10) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.getTextBeforeCursor(i7, i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i7) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.performContextMenuAction(i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i7) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.performEditorAction(i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i7) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.requestCursorUpdates(i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i7, int i10) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.setComposingRegion(i7, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i7) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.setComposingText(charSequence, i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i7, int i10) {
        u0.q qVar = this.f5873b;
        if (qVar != null) {
            return qVar.setSelection(i7, i10);
        }
        return false;
    }
}

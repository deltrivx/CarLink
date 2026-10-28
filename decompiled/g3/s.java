package g3;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import b3.q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.d f5875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f5878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f5881g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5882h = true;

    public s(w wVar, a2.d dVar, boolean z10) {
        this.f5875a = dVar;
        this.f5876b = z10;
        this.f5878d = wVar;
    }

    public final void a(g gVar) {
        this.f5877c++;
        try {
            this.f5881g.add(gVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i7 = this.f5877c - 1;
        this.f5877c = i7;
        if (i7 == 0) {
            ArrayList arrayList = this.f5881g;
            if (!arrayList.isEmpty()) {
                ((z) this.f5875a.f20b).f5903e.invoke(u8.p.K0(arrayList));
                arrayList.clear();
            }
        }
        return this.f5877c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z10 = this.f5882h;
        if (!z10) {
            return z10;
        }
        this.f5877c++;
        return true;
    }

    public final void c(int i7) {
        sendKeyEvent(new KeyEvent(0, i7));
        sendKeyEvent(new KeyEvent(1, i7));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i7) {
        boolean z10 = this.f5882h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f5881g.clear();
        this.f5877c = 0;
        this.f5882h = false;
        ArrayList arrayList = ((z) this.f5875a.f20b).f5907i;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (i9.l.a(((WeakReference) arrayList.get(i7)).get(), this)) {
                arrayList.remove(i7);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f5882h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        boolean z10 = this.f5882h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f5882h;
        return z10 ? this.f5876b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i7) {
        boolean z10 = this.f5882h;
        if (z10) {
            a(new a(i7, String.valueOf(charSequence)));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i10) {
        boolean z10 = this.f5882h;
        if (!z10) {
            return z10;
        }
        a(new e(i7, i10));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i10) {
        boolean z10 = this.f5882h;
        if (!z10) {
            return z10;
        }
        a(new f(i7, i10));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z10 = this.f5882h;
        if (!z10) {
            return z10;
        }
        a(new i());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i7) {
        w wVar = this.f5878d;
        return TextUtils.getCapsMode(wVar.f5889a.f1353b, q0.f(wVar.f5890b), i7);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        boolean z10 = (i7 & 1) != 0;
        this.f5880f = z10;
        if (z10) {
            this.f5879e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return i2.c.S(this.f5878d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i7) {
        if (q0.c(this.f5878d.f5890b)) {
            return null;
        }
        return a.a.F(this.f5878d).f1353b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i7, int i10) {
        return a.a.H(this.f5878d, i7).f1353b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i7, int i10) {
        return a.a.I(this.f5878d, i7).f1353b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i7) {
        boolean z10 = this.f5882h;
        if (z10) {
            z10 = false;
            switch (i7) {
                case R.id.selectAll:
                    a(new v(0, this.f5878d.f5889a.f1353b.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i7) {
        int i10;
        boolean z10 = this.f5882h;
        if (z10) {
            z10 = true;
            if (i7 != 0) {
                switch (i7) {
                    case 2:
                        i10 = 2;
                        break;
                    case 3:
                        i10 = 3;
                        break;
                    case 4:
                        i10 = 4;
                        break;
                    case 5:
                        i10 = 6;
                        break;
                    case 6:
                        i10 = 7;
                        break;
                    case 7:
                        i10 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i7);
                        i10 = 1;
                        break;
                }
            } else {
                i10 = 1;
            }
            ((z) this.f5875a.f20b).f5904f.invoke(new j(i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f5882h;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0063 A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:44:0x0059, B:46:0x0063, B:48:0x0069, B:51:0x006f), top: B:57:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0069 A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:44:0x0059, B:46:0x0063, B:48:0x0069, B:51:0x006f), top: B:57:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        c cVar;
        boolean z13 = this.f5882h;
        if (!z13) {
            return z13;
        }
        boolean z14 = false;
        boolean z15 = (i7 & 1) != 0;
        boolean z16 = (i7 & 2) != 0;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            z12 = (i7 & 16) != 0;
            z11 = (i7 & 8) != 0;
            boolean z17 = (i7 & 4) != 0;
            if (i10 >= 34 && (i7 & 32) != 0) {
                z14 = true;
            }
            if (z12 || z11 || z17 || z14) {
                z10 = z14;
                z14 = z17;
            } else {
                z10 = i10 >= 34 ? true : z14;
                z14 = true;
            }
            cVar = ((z) this.f5875a.f20b).f5909l;
            synchronized (cVar.f5835c) {
                try {
                    cVar.f5838f = z12;
                    cVar.f5839g = z11;
                    cVar.f5840h = z14;
                    cVar.f5841i = z10;
                    if (z15) {
                        cVar.f5837e = true;
                        if (cVar.f5842j != null) {
                            cVar.a();
                        }
                    }
                    cVar.f5836d = z16;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        z10 = false;
        z12 = true;
        z11 = true;
        cVar = ((z) this.f5875a.f20b).f5909l;
        synchronized (cVar.f5835c) {
            cVar.f5838f = z12;
            cVar.f5839g = z11;
            cVar.f5840h = z14;
            cVar.f5841i = z10;
            if (z15) {
                cVar.f5837e = true;
                if (cVar.f5842j != null) {
                    cVar.a();
                }
            }
            cVar.f5836d = z16;
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, t8.h] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f5882h;
        if (!z10) {
            return z10;
        }
        ((BaseInputConnection) ((z) this.f5875a.f20b).f5908j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i7, int i10) {
        boolean z10 = this.f5882h;
        if (z10) {
            a(new t(i7, i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i7) {
        boolean z10 = this.f5882h;
        if (z10) {
            a(new u(i7, String.valueOf(charSequence)));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i7, int i10) {
        boolean z10 = this.f5882h;
        if (!z10) {
            return z10;
        }
        a(new v(i7, i10));
        return true;
    }
}

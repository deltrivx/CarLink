package u0;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import b3.g0;
import b3.m0;
import b3.n0;
import b3.q0;
import g3.t;
import g3.v;
import g3.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l0.i0;
import l0.o0;
import l0.s1;
import l0.u0;
import n3.u;
import r2.r2;
import w0.t1;
import y1.h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f13026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f13028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t1 f13029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r2 f13030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w f13032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13034i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f13035j = new ArrayList();
    public boolean k = true;

    public q(w wVar, o0 o0Var, boolean z10, u0 u0Var, t1 t1Var, r2 r2Var) {
        this.f13026a = o0Var;
        this.f13027b = z10;
        this.f13028c = u0Var;
        this.f13029d = t1Var;
        this.f13030e = r2Var;
        this.f13032g = wVar;
    }

    public final void a(g3.g gVar) {
        this.f13031f++;
        try {
            this.f13035j.add(gVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i7 = this.f13031f - 1;
        this.f13031f = i7;
        if (i7 == 0) {
            ArrayList arrayList = this.f13035j;
            if (!arrayList.isEmpty()) {
                ((p) this.f13026a.f7772b).f13016c.invoke(u8.p.K0(arrayList));
                arrayList.clear();
            }
        }
        return this.f13031f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z10 = this.k;
        if (!z10) {
            return z10;
        }
        this.f13031f++;
        return true;
    }

    public final void c(int i7) {
        sendKeyEvent(new KeyEvent(0, i7));
        sendKeyEvent(new KeyEvent(1, i7));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i7) {
        boolean z10 = this.k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f13035j.clear();
        this.f13031f = 0;
        this.k = false;
        ArrayList arrayList = ((p) this.f13026a.f7772b).f13023j;
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
        boolean z10 = this.k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        boolean z10 = this.k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.k;
        return z10 ? this.f13027b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i7) {
        boolean z10 = this.k;
        if (z10) {
            a(new g3.a(i7, String.valueOf(charSequence)));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i10) {
        boolean z10 = this.k;
        if (!z10) {
            return z10;
        }
        a(new g3.e(i7, i10));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i10) {
        boolean z10 = this.k;
        if (!z10) {
            return z10;
        }
        a(new g3.f(i7, i10));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z10 = this.k;
        if (!z10) {
            return z10;
        }
        a(new g3.i());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i7) {
        w wVar = this.f13032g;
        return TextUtils.getCapsMode(wVar.f5889a.f1353b, q0.f(wVar.f5890b), i7);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        boolean z10 = (i7 & 1) != 0;
        this.f13034i = z10;
        if (z10) {
            this.f13033h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return u.g(this.f13032g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i7) {
        if (q0.c(this.f13032g.f5890b)) {
            return null;
        }
        return a.a.F(this.f13032g).f1353b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i7, int i10) {
        return a.a.H(this.f13032g, i7).f1353b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i7, int i10) {
        return a.a.I(this.f13032g, i7).f1353b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i7) {
        boolean z10 = this.k;
        if (z10) {
            z10 = false;
            switch (i7) {
                case R.id.selectAll:
                    a(new v(0, this.f13032g.f5889a.f1353b.length()));
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
        boolean z10 = this.k;
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
            ((p) this.f13026a.f7772b).f13017d.invoke(new g3.j(i10));
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        long jH;
        int i7;
        char c10;
        int i10;
        String string;
        int i11;
        int iF;
        s1 s1VarD;
        int iF2;
        s1 s1VarD2;
        n0 n0Var;
        if (Build.VERSION.SDK_INT >= 34) {
            int iU = 2;
            s0.d dVar = new s0.d(iU, this);
            u0 u0Var = this.f13028c;
            int i12 = 3;
            if (u0Var != null) {
                b3.h hVar = u0Var.f7857j;
                if (hVar != null) {
                    s1 s1VarD3 = u0Var.d();
                    if (hVar.equals((s1VarD3 == null || (n0Var = s1VarD3.f7828a.f1408a) == null) ? null : n0Var.f1393a)) {
                        boolean zT = c3.a.t(handwritingGesture);
                        t1 t1Var = this.f13029d;
                        if (zT) {
                            SelectGesture selectGestureK = h.k(handwritingGesture);
                            long jX0 = n3.n.x0(u0Var, h0.F(selectGestureK.getSelectionArea()), selectGestureK.getGranularity() == 1 ? 1 : 0);
                            if (q0.c(jX0)) {
                                iU = n3.l.u(h.h(selectGestureK), dVar);
                            } else {
                                dVar.invoke(new v((int) (jX0 >> 32), (int) (jX0 & 4294967295L)));
                                if (t1Var != null) {
                                    t1Var.h(true);
                                }
                                iU = 1;
                            }
                        } else if (h.t(handwritingGesture)) {
                            DeleteGesture deleteGestureF = h.f(handwritingGesture);
                            int i13 = deleteGestureF.getGranularity() != 1 ? 0 : 1;
                            long jX1 = n3.n.x0(u0Var, h0.F(deleteGestureF.getDeletionArea()), i13);
                            if (q0.c(jX1)) {
                                iU = n3.l.u(h.h(deleteGestureF), dVar);
                            } else {
                                n3.l.O(jX1, hVar, i13 == 1, dVar);
                                iU = 1;
                            }
                        } else if (h.u(handwritingGesture)) {
                            SelectRangeGesture selectRangeGestureL = h.l(handwritingGesture);
                            long jG = n3.n.G(u0Var, h0.F(selectRangeGestureL.getSelectionStartArea()), h0.F(selectRangeGestureL.getSelectionEndArea()), selectRangeGestureL.getGranularity() == 1 ? 1 : 0);
                            if (q0.c(jG)) {
                                iU = n3.l.u(h.h(selectRangeGestureL), dVar);
                            } else {
                                dVar.invoke(new v((int) (jG >> 32), (int) (jG & 4294967295L)));
                                if (t1Var != null) {
                                    t1Var.h(true);
                                }
                                iU = 1;
                            }
                        } else if (h.v(handwritingGesture)) {
                            DeleteRangeGesture deleteRangeGestureG = h.g(handwritingGesture);
                            int i14 = deleteRangeGestureG.getGranularity() != 1 ? 0 : 1;
                            long jG2 = n3.n.G(u0Var, h0.F(deleteRangeGestureG.getDeletionStartArea()), h0.F(deleteRangeGestureG.getDeletionEndArea()), i14);
                            if (q0.c(jG2)) {
                                iU = n3.l.u(h.h(deleteRangeGestureG), dVar);
                            } else {
                                n3.l.O(jG2, hVar, i14 == 1, dVar);
                                iU = 1;
                            }
                        } else {
                            boolean zS = h.s(handwritingGesture);
                            r2 r2Var = this.f13030e;
                            int i15 = -1;
                            if (zS) {
                                JoinOrSplitGesture joinOrSplitGestureI = h.i(handwritingGesture);
                                if (r2Var == null || (iF2 = n3.n.F(u0Var, n3.n.N(joinOrSplitGestureI.getJoinOrSplitPoint()), r2Var)) == -1 || ((s1VarD2 = u0Var.d()) != null && n3.n.I(s1VarD2.f7828a, iF2))) {
                                    iU = n3.l.u(h.h(joinOrSplitGestureI), dVar);
                                } else {
                                    int iCharCount = iF2;
                                    while (iCharCount > 0) {
                                        int iCodePointBefore = Character.codePointBefore(hVar, iCharCount);
                                        if (!n3.n.C0(iCodePointBefore)) {
                                            break;
                                        } else {
                                            iCharCount -= Character.charCount(iCodePointBefore);
                                        }
                                    }
                                    while (iF2 < hVar.f1353b.length()) {
                                        int iCodePointAt = Character.codePointAt(hVar, iF2);
                                        if (!n3.n.C0(iCodePointAt)) {
                                            break;
                                        } else {
                                            iF2 += Character.charCount(iCodePointAt);
                                        }
                                    }
                                    long jB = g0.b(iCharCount, iF2);
                                    if (q0.c(jB)) {
                                        int i16 = (int) (jB >> 32);
                                        dVar.invoke(new j(new g3.g[]{new v(i16, i16), new g3.a(1, " ")}));
                                    } else {
                                        n3.l.O(jB, hVar, false, dVar);
                                    }
                                    iU = 1;
                                }
                            } else if (c3.a.y(handwritingGesture)) {
                                InsertGesture insertGestureM = c3.a.m(handwritingGesture);
                                if (r2Var == null || (iF = n3.n.F(u0Var, n3.n.N(insertGestureM.getInsertionPoint()), r2Var)) == -1 || ((s1VarD = u0Var.d()) != null && n3.n.I(s1VarD.f7828a, iF))) {
                                    iU = n3.l.u(h.h(insertGestureM), dVar);
                                } else {
                                    dVar.invoke(new j(new g3.g[]{new v(iF, iF), new g3.a(1, insertGestureM.getTextToInsert())}));
                                    iU = 1;
                                }
                            } else if (h.o(handwritingGesture)) {
                                RemoveSpaceGesture removeSpaceGestureJ = h.j(handwritingGesture);
                                s1 s1VarD4 = u0Var.d();
                                b3.o0 o0Var = s1VarD4 != null ? s1VarD4.f7828a : null;
                                long jN = n3.n.N(removeSpaceGestureJ.getStartPoint());
                                long jN2 = n3.n.N(removeSpaceGestureJ.getEndPoint());
                                o2.w wVarC = u0Var.c();
                                if (o0Var != null) {
                                    b3.p pVar = o0Var.f1409b;
                                    if (wVarC == null) {
                                        jH = q0.f1428b;
                                    } else {
                                        long jC = wVarC.C(jN);
                                        long jC2 = wVarC.C(jN2);
                                        int iS0 = n3.n.s0(pVar, jC, r2Var);
                                        int iS1 = n3.n.s0(pVar, jC2, r2Var);
                                        if (iS0 != -1) {
                                            if (iS1 != -1) {
                                                iS0 = Math.min(iS0, iS1);
                                            }
                                            iS1 = iS0;
                                        } else if (iS1 == -1) {
                                            jH = q0.f1428b;
                                        }
                                        float fB = (pVar.b(iS1) + pVar.f(iS1)) / 2;
                                        int i17 = (int) (jC >> 32);
                                        int i18 = (int) (jC2 >> 32);
                                        jH = pVar.h(new x1.c(Math.min(Float.intBitsToFloat(i17), Float.intBitsToFloat(i18)), fB - 0.1f, Math.max(Float.intBitsToFloat(i17), Float.intBitsToFloat(i18)), fB + 0.1f), 0, m0.f1391a);
                                    }
                                } else {
                                    jH = q0.f1428b;
                                }
                                if (q0.c(jH)) {
                                    iU = n3.l.u(h.h(removeSpaceGestureJ), dVar);
                                } else {
                                    String str = hVar.subSequence(q0.f(jH), q0.e(jH)).f1353b;
                                    Pattern patternCompile = Pattern.compile("\\s+");
                                    i9.l.d(patternCompile, "compile(...)");
                                    i9.l.e(str, "input");
                                    Matcher matcher = patternCompile.matcher(str);
                                    i9.l.d(matcher, "matcher(...)");
                                    a2.b bVar = !matcher.find(0) ? null : new a2.b(matcher, str);
                                    if (bVar == null) {
                                        string = str.toString();
                                        i11 = -1;
                                        i7 = -1;
                                        c10 = ' ';
                                    } else {
                                        int length = str.length();
                                        StringBuilder sb2 = new StringBuilder(length);
                                        a2.b bVar2 = bVar;
                                        int i19 = 0;
                                        i7 = -1;
                                        c10 = ' ';
                                        while (true) {
                                            sb2.append((CharSequence) str, i19, bVar2.I().f8965a);
                                            if (i7 == i15) {
                                                i7 = bVar2.I().f8965a;
                                            }
                                            i10 = bVar2.I().f8966b + 1;
                                            sb2.append((CharSequence) "");
                                            i19 = bVar2.I().f8966b + 1;
                                            CharSequence charSequence = (CharSequence) bVar2.f13c;
                                            Matcher matcher2 = (Matcher) bVar2.f12b;
                                            int iEnd = matcher2.end() + (matcher2.end() == matcher2.start() ? 1 : 0);
                                            if (iEnd <= charSequence.length()) {
                                                Matcher matcher3 = matcher2.pattern().matcher(charSequence);
                                                i9.l.d(matcher3, "matcher(...)");
                                                bVar2 = !matcher3.find(iEnd) ? null : new a2.b(matcher3, charSequence);
                                            } else {
                                                bVar2 = null;
                                            }
                                            if (i19 >= length || bVar2 == null) {
                                                break;
                                            } else {
                                                i15 = -1;
                                            }
                                        }
                                        if (i19 < length) {
                                            sb2.append((CharSequence) str, i19, length);
                                        }
                                        string = sb2.toString();
                                        i9.l.d(string, "toString(...)");
                                        i11 = i10;
                                    }
                                    if (i7 == -1 || i11 == -1) {
                                        iU = n3.l.u(h.h(removeSpaceGestureJ), dVar);
                                    } else {
                                        int i20 = (int) (jH >> c10);
                                        int i21 = i20 + i7;
                                        int i22 = i20 + i11;
                                        String strSubstring = string.substring(i7, string.length() - (q0.d(jH) - i11));
                                        i9.l.d(strSubstring, "substring(...)");
                                        dVar.invoke(new j(new g3.g[]{new v(i21, i22), new g3.a(1, strSubstring)}));
                                        iU = 1;
                                    }
                                }
                            }
                        }
                    } else {
                        iU = 3;
                    }
                } else {
                    iU = 3;
                }
                i12 = iU;
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new n8.b(i12, 1, intConsumer));
            } else {
                intConsumer.accept(i12);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.k;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        u0 u0Var;
        b3.h hVar;
        n0 n0Var;
        if (Build.VERSION.SDK_INT >= 34 && (u0Var = this.f13028c) != null && (hVar = u0Var.f7857j) != null) {
            s1 s1VarD = u0Var.d();
            if (hVar.equals((s1VarD == null || (n0Var = s1VarD.f7828a.f1408a) == null) ? null : n0Var.f1393a)) {
                boolean zT = c3.a.t(previewableHandwritingGesture);
                i0 i0Var = i0.f7678a;
                t1 t1Var = this.f13029d;
                if (zT) {
                    SelectGesture selectGestureK = h.k(previewableHandwritingGesture);
                    if (t1Var != null) {
                        long jX0 = n3.n.x0(u0Var, h0.F(selectGestureK.getSelectionArea()), selectGestureK.getGranularity() != 1 ? 0 : 1);
                        u0 u0Var2 = t1Var.f13942d;
                        if (u0Var2 != null) {
                            u0Var2.f(jX0);
                        }
                        u0 u0Var3 = t1Var.f13942d;
                        if (u0Var3 != null) {
                            u0Var3.e(q0.f1428b);
                        }
                        if (!q0.c(jX0)) {
                            t1Var.s(false);
                            t1Var.p(i0Var);
                        }
                    }
                } else if (h.t(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureF = h.f(previewableHandwritingGesture);
                    if (t1Var != null) {
                        long jX1 = n3.n.x0(u0Var, h0.F(deleteGestureF.getDeletionArea()), deleteGestureF.getGranularity() != 1 ? 0 : 1);
                        u0 u0Var4 = t1Var.f13942d;
                        if (u0Var4 != null) {
                            u0Var4.e(jX1);
                        }
                        u0 u0Var5 = t1Var.f13942d;
                        if (u0Var5 != null) {
                            u0Var5.f(q0.f1428b);
                        }
                        if (!q0.c(jX1)) {
                            t1Var.s(false);
                            t1Var.p(i0Var);
                        }
                    }
                } else if (h.u(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureL = h.l(previewableHandwritingGesture);
                    if (t1Var != null) {
                        long jG = n3.n.G(u0Var, h0.F(selectRangeGestureL.getSelectionStartArea()), h0.F(selectRangeGestureL.getSelectionEndArea()), selectRangeGestureL.getGranularity() != 1 ? 0 : 1);
                        u0 u0Var6 = t1Var.f13942d;
                        if (u0Var6 != null) {
                            u0Var6.f(jG);
                        }
                        u0 u0Var7 = t1Var.f13942d;
                        if (u0Var7 != null) {
                            u0Var7.e(q0.f1428b);
                        }
                        if (!q0.c(jG)) {
                            t1Var.s(false);
                            t1Var.p(i0Var);
                        }
                    }
                } else if (h.v(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureG = h.g(previewableHandwritingGesture);
                    if (t1Var != null) {
                        long jG2 = n3.n.G(u0Var, h0.F(deleteRangeGestureG.getDeletionStartArea()), h0.F(deleteRangeGestureG.getDeletionEndArea()), deleteRangeGestureG.getGranularity() != 1 ? 0 : 1);
                        u0 u0Var8 = t1Var.f13942d;
                        if (u0Var8 != null) {
                            u0Var8.e(jG2);
                        }
                        u0 u0Var9 = t1Var.f13942d;
                        if (u0Var9 != null) {
                            u0Var9.f(q0.f1428b);
                        }
                        if (!q0.c(jG2)) {
                            t1Var.s(false);
                            t1Var.p(i0Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new i(0, t1Var));
                }
                return true;
            }
        }
        return false;
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
        m mVar;
        boolean z13 = this.k;
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
            mVar = ((p) this.f13026a.f7772b).f13025m;
            synchronized (mVar.f12998c) {
                try {
                    mVar.f13001f = z12;
                    mVar.f13002g = z11;
                    mVar.f13003h = z14;
                    mVar.f13004i = z10;
                    if (z15) {
                        mVar.f13000e = true;
                        if (mVar.f13005j != null) {
                            mVar.a();
                        }
                    }
                    mVar.f12999d = z16;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        z10 = false;
        z12 = true;
        z11 = true;
        mVar = ((p) this.f13026a.f7772b).f13025m;
        synchronized (mVar.f12998c) {
            mVar.f13001f = z12;
            mVar.f13002g = z11;
            mVar.f13003h = z14;
            mVar.f13004i = z10;
            if (z15) {
                mVar.f13000e = true;
                if (mVar.f13005j != null) {
                    mVar.a();
                }
            }
            mVar.f12999d = z16;
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, t8.h] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.k;
        if (!z10) {
            return z10;
        }
        ((BaseInputConnection) ((p) this.f13026a.f7772b).k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i7, int i10) {
        boolean z10 = this.k;
        if (z10) {
            a(new t(i7, i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i7) {
        boolean z10 = this.k;
        if (z10) {
            a(new g3.u(i7, String.valueOf(charSequence)));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i7, int i10) {
        boolean z10 = this.k;
        if (!z10) {
            return z10;
        }
        a(new v(i7, i10));
        return true;
    }
}

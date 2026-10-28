package r2;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f11216a = new e0();

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onClearTranslation(View view) {
        h9.a aVar;
        i9.l.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        t1.c contentCaptureManager$ui_release = ((u) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f12738f = t1.a.f12726a;
        s.k kVarK = contentCaptureManager$ui_release.k();
        Object[] objArr = kVarK.f12463c;
        long[] jArr = kVarK.f12461a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j5 = jArr[i7];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j5) < 128) {
                        s.h0 h0Var = ((y2.n) objArr[(i7 << 3) + i11]).f15024a.f15020d.f15011a;
                        Object objG = h0Var.g(y2.r.C);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = h0Var.g(y2.i.f14997m);
                            y2.a aVar2 = (y2.a) (objG2 != null ? objG2 : null);
                            if (aVar2 != null && (aVar = (h9.a) aVar2.f14970b) != null) {
                            }
                        }
                    }
                    j5 >>= 8;
                }
                if (i10 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onHideTranslation(View view) {
        h9.k kVar;
        i9.l.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        t1.c contentCaptureManager$ui_release = ((u) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f12738f = t1.a.f12726a;
        s.k kVarK = contentCaptureManager$ui_release.k();
        Object[] objArr = kVarK.f12463c;
        long[] jArr = kVarK.f12461a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j5 = jArr[i7];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j5) < 128) {
                        s.h0 h0Var = ((y2.n) objArr[(i7 << 3) + i11]).f15024a.f15020d.f15011a;
                        Object objG = h0Var.g(y2.r.C);
                        if (objG == null) {
                            objG = null;
                        }
                        if (i9.l.a(objG, Boolean.TRUE)) {
                            Object objG2 = h0Var.g(y2.i.f14996l);
                            y2.a aVar = (y2.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (kVar = (h9.k) aVar.f14970b) != null) {
                            }
                        }
                    }
                    j5 >>= 8;
                }
                if (i10 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onShowTranslation(View view) {
        h9.k kVar;
        i9.l.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        t1.c contentCaptureManager$ui_release = ((u) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f12738f = t1.a.f12727b;
        s.k kVarK = contentCaptureManager$ui_release.k();
        Object[] objArr = kVarK.f12463c;
        long[] jArr = kVarK.f12461a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j5 = jArr[i7];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j5) < 128) {
                        s.h0 h0Var = ((y2.n) objArr[(i7 << 3) + i11]).f15024a.f15020d.f15011a;
                        Object objG = h0Var.g(y2.r.C);
                        if (objG == null) {
                            objG = null;
                        }
                        if (i9.l.a(objG, Boolean.FALSE)) {
                            Object objG2 = h0Var.g(y2.i.f14996l);
                            y2.a aVar = (y2.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (kVar = (h9.k) aVar.f14970b) != null) {
                            }
                        }
                    }
                    j5 >>= 8;
                }
                if (i10 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}

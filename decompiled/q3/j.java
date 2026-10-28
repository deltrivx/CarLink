package q3;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import q2.h0;
import w1.s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n4.e f10920a = new n4.e(9);

    public static final boolean a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect b(w1.i iVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        s sVarG = w1.f.g(((w1.j) iVar).f14044c);
        x1.c cVarJ = sVarG != null ? w1.f.j(sVarG) : null;
        if (cVarJ == null) {
            return null;
        }
        int i7 = (int) cVarJ.f14523a;
        int i10 = iArr[0];
        int i11 = iArr2[0];
        int i12 = (int) cVarJ.f14524b;
        int i13 = iArr[1];
        int i14 = iArr2[1];
        return new Rect((i7 + i10) - i11, (i12 + i13) - i14, (((int) cVarJ.f14525c) + i10) - i11, (((int) cVarJ.f14526d) + i13) - i14);
    }

    public static final View c(r1.o oVar) {
        q qVar = q2.f.v(oVar.f11117a).f10679n;
        View interopView = qVar != null ? qVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final void d(q qVar, h0 h0Var) {
        long jE = h0Var.E.f10614c.E(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jE >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jE & 4294967295L)));
        qVar.layout(iRound, iRound2, qVar.getMeasuredWidth() + iRound, qVar.getMeasuredHeight() + iRound2);
    }
}

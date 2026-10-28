package r2;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends e4.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f11328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q2.h0 f11329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f11330f;

    public m(u uVar, q2.h0 h0Var, u uVar2) {
        this.f11328d = uVar;
        this.f11329e = h0Var;
        this.f11330f = uVar2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // e4.b
    public final void c(View view, f4.f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f5287a;
        this.f4315a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        u uVar = this.f11328d;
        b0 b0Var = uVar.f11478s;
        if (b0Var.q()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        q2.h0 h0Var = this.f11329e;
        q2.h0 h0VarV = h0Var.v();
        while (true) {
            if (h0VarV == null) {
                h0VarV = null;
                break;
            } else if (h0VarV.E.d(8)) {
                break;
            } else {
                h0VarV = h0VarV.v();
            }
        }
        Integer numValueOf = h0VarV != null ? Integer.valueOf(h0VarV.f10668b) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == uVar.getSemanticsOwner().a().f15023g) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        fVar.f5288b = iIntValue;
        u uVar2 = this.f11330f;
        accessibilityNodeInfo.setParent(uVar2, iIntValue);
        int i7 = h0Var.f10668b;
        int iD = b0Var.E.d(i7);
        if (iD != -1) {
            q3.i iVarU = j0.u(uVar.getAndroidViewsHandler$ui_release(), iD);
            if (iVarU != null) {
                if (Build.VERSION.SDK_INT >= 22) {
                    accessibilityNodeInfo.setTraversalBefore(iVarU);
                }
            } else if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalBefore(uVar2, iD);
            }
            u.f(uVar, i7, accessibilityNodeInfo, b0Var.G);
        }
        int iD2 = b0Var.F.d(i7);
        if (iD2 != -1) {
            q3.i iVarU2 = j0.u(uVar.getAndroidViewsHandler$ui_release(), iD2);
            if (iVarU2 != null) {
                if (Build.VERSION.SDK_INT >= 22) {
                    accessibilityNodeInfo.setTraversalAfter(iVarU2);
                }
            } else if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(uVar2, iD2);
            }
            u.f(uVar, i7, accessibilityNodeInfo, b0Var.H);
        }
    }
}

package q3;

import android.view.WindowInsets;
import e4.l0;
import e4.s1;
import java.util.HashMap;
import o2.w;
import q2.h0;
import q2.q1;
import r2.u;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f10877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f10878c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(q qVar, h0 h0Var, int i7) {
        super(1);
        this.f10876a = i7;
        this.f10877b = qVar;
        this.f10878c = h0Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsB;
        switch (this.f10876a) {
            case 0:
                q1 q1Var = (q1) obj;
                u uVar = q1Var instanceof u ? (u) q1Var : null;
                q qVar = this.f10877b;
                if (uVar != null) {
                    HashMap<i, h0> holderToLayoutNode = uVar.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                    h0 h0Var = this.f10878c;
                    holderToLayoutNode.put(qVar, h0Var);
                    uVar.getAndroidViewsHandler$ui_release().addView(qVar);
                    uVar.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(h0Var, qVar);
                    qVar.setImportantForAccessibility(1);
                    l0.j(qVar, new r2.m(uVar, h0Var, uVar));
                }
                if (qVar.getView().getParent() != qVar) {
                    qVar.addView(qVar.getView());
                }
                break;
            case 1:
                j.d(this.f10877b, this.f10878c);
                break;
            default:
                h0 h0Var2 = this.f10878c;
                q qVar2 = this.f10877b;
                j.d(qVar2, h0Var2);
                ((u) qVar2.f10898c).A = true;
                int[] iArr = qVar2.f10908n;
                int i7 = iArr[0];
                int i10 = iArr[1];
                qVar2.getView().getLocationOnScreen(iArr);
                long j5 = qVar2.f10909o;
                long jL = ((w) obj).l();
                qVar2.f10909o = jL;
                s1 s1Var = qVar2.f10910p;
                if (s1Var != null && ((i7 != iArr[0] || i10 != iArr[1] || !n3.m.a(j5, jL)) && (windowInsetsB = qVar2.m(s1Var).b()) != null)) {
                    qVar2.getView().dispatchApplyWindowInsets(windowInsetsB);
                }
                break;
        }
        return z.f12851a;
    }
}

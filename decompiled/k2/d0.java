package k2;

import android.view.MotionEvent;
import q2.q1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q3.q f7201b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(q3.q qVar, int i7) {
        super(1);
        this.f7200a = i7;
        this.f7201b = qVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f7200a) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                q3.q qVar = this.f7201b;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = qVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = qVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
            default:
                q1 q1Var = (q1) obj;
                r2.u uVar = q1Var instanceof r2.u ? (r2.u) q1Var : null;
                q3.q qVar2 = this.f7201b;
                if (uVar != null) {
                    uVar.getAndroidViewsHandler$ui_release().removeViewInLayout(qVar2);
                    i9.b0.b(uVar.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder()).remove(uVar.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(qVar2));
                    qVar2.setImportantForAccessibility(0);
                }
                qVar2.removeAllViewsInLayout();
                return t8.z.f12851a;
        }
    }
}

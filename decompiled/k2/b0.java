package k2;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f7189b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(c0 c0Var, int i7) {
        super(1);
        this.f7188a = i7;
        this.f7189b = c0Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f7188a) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                d0 d0Var = this.f7189b.f7193a;
                if (d0Var != null) {
                    d0Var.invoke(motionEvent);
                    return t8.z.f12851a;
                }
                i9.l.j("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                d0 d0Var2 = this.f7189b.f7193a;
                if (d0Var2 != null) {
                    d0Var2.invoke(motionEvent2);
                    return t8.z.f12851a;
                }
                i9.l.j("onTouchEvent");
                throw null;
        }
    }
}

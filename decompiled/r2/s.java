package r2;

import android.os.SystemClock;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s extends i9.n implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f11388b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(u uVar, int i7) {
        super(0);
        this.f11387a = i7;
        this.f11388b = uVar;
    }

    @Override // h9.a
    public final Object invoke() {
        int actionMasked;
        switch (this.f11387a) {
            case 0:
                u uVar = this.f11388b;
                MotionEvent motionEvent = uVar.z0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    uVar.A0 = SystemClock.uptimeMillis();
                    uVar.post(uVar.F0);
                }
                return t8.z.f12851a;
            default:
                return this.f11388b.get_viewTreeOwners();
        }
    }
}

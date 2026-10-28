package g2;

import android.view.View;
import r2.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f5820b;

    public /* synthetic */ b(View view, int i7) {
        this.f5819a = i7;
        this.f5820b = view;
    }

    @Override // g2.a
    public final void a(int i7) {
        switch (this.f5819a) {
            case 0:
                u uVar = (u) this.f5820b;
                if (i7 == 16) {
                    uVar.performHapticFeedback(16);
                } else if (i7 == 6) {
                    uVar.performHapticFeedback(6);
                } else if (i7 == 13) {
                    uVar.performHapticFeedback(13);
                } else if (i7 == 23) {
                    uVar.performHapticFeedback(23);
                } else if (i7 == 3) {
                    uVar.performHapticFeedback(3);
                } else if (i7 == 0) {
                    uVar.performHapticFeedback(0);
                } else if (i7 == 17) {
                    uVar.performHapticFeedback(17);
                } else if (i7 == 27) {
                    uVar.performHapticFeedback(27);
                } else if (i7 == 26) {
                    uVar.performHapticFeedback(26);
                } else if (i7 == 9) {
                    uVar.performHapticFeedback(9);
                } else if (i7 == 22) {
                    uVar.performHapticFeedback(22);
                } else if (i7 == 21) {
                    uVar.performHapticFeedback(21);
                } else if (i7 == 1) {
                    uVar.performHapticFeedback(1);
                }
                break;
            default:
                View view = this.f5820b;
                if (i7 == 16) {
                    view.performHapticFeedback(16);
                } else if (i7 == 6) {
                    view.performHapticFeedback(6);
                } else if (i7 == 13) {
                    view.performHapticFeedback(13);
                } else if (i7 == 23) {
                    view.performHapticFeedback(23);
                } else if (i7 == 3) {
                    view.performHapticFeedback(3);
                } else if (i7 == 0) {
                    view.performHapticFeedback(0);
                } else if (i7 == 17) {
                    view.performHapticFeedback(17);
                } else if (i7 == 27) {
                    view.performHapticFeedback(27);
                } else if (i7 == 26) {
                    view.performHapticFeedback(26);
                } else if (i7 == 9) {
                    view.performHapticFeedback(9);
                } else if (i7 == 22) {
                    view.performHapticFeedback(22);
                } else if (i7 == 21) {
                    view.performHapticFeedback(21);
                } else if (i7 == 1) {
                    view.performHapticFeedback(1);
                }
                break;
        }
    }
}

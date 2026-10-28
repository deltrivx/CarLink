package e4;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class r1 {
    public static int a(int i7) {
        int iStatusBars;
        int i10 = 0;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i7 & i11) != 0) {
                if (i11 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i11 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i11 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i11 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i11 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i11 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i11 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i11 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                } else if (i11 == 512) {
                    iStatusBars = WindowInsets.Type.systemOverlays();
                }
                i10 |= iStatusBars;
            }
        }
        return i10;
    }
}

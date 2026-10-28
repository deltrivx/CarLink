package i4;

import android.media.AudioTrack;
import android.view.ViewStructure;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ AudioTrack.Builder e() {
        return new AudioTrack.Builder();
    }

    public static /* bridge */ /* synthetic */ ViewStructure m(Object obj) {
        return (ViewStructure) obj;
    }

    public static /* bridge */ /* synthetic */ ThemedSpinnerAdapter n(SpinnerAdapter spinnerAdapter) {
        return (ThemedSpinnerAdapter) spinnerAdapter;
    }

    public static /* synthetic */ void q() {
    }

    public static /* bridge */ /* synthetic */ boolean y(SpinnerAdapter spinnerAdapter) {
        return spinnerAdapter instanceof ThemedSpinnerAdapter;
    }
}

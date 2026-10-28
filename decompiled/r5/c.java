package r5;

import android.media.MediaPlayer;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements MediaPlayer.OnErrorListener {
    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i7, int i10) {
        Log.w("h", "Failed to beep " + i7 + ", " + i10);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }
}

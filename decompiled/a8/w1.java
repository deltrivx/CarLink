package a8;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;
import android.net.NetworkSpecifier;
import java.io.Serializable;
import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class w1 {
    public static /* synthetic */ NotificationChannel d() {
        return new NotificationChannel("CARLIFE_RECEIVER_SERVICE", "投屏服务", 2);
    }

    public static /* synthetic */ AudioFocusRequest.Builder f(int i7) {
        return new AudioFocusRequest.Builder(i7);
    }

    public static /* bridge */ /* synthetic */ NetworkSpecifier k(Object obj) {
        return (NetworkSpecifier) obj;
    }

    public static /* bridge */ /* synthetic */ LocalDate p(Serializable serializable) {
        return (LocalDate) serializable;
    }

    public static /* synthetic */ void r() {
    }
}

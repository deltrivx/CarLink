package k7;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.z;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AudioFocusRequest f7338d;

    public b(int i7, int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.f7335a = i7;
        this.f7336b = i10;
        this.f7337c = onAudioFocusChangeListener;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f7337c.equals(((b) obj).f7337c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7337c.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.media.AudioManager$OnAudioFocusChangeListener, java.lang.Object] */
    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        ?? r8 = this.f7337c;
        if (i7 == -1) {
            r8.onAudioFocusChange(i7);
            new Handler(Looper.getMainLooper()).post(new z(13, this));
        } else {
            if (i7 != 1) {
                r8.onAudioFocusChange(i7);
                return;
            }
            AtomicReference atomicReference = c.f7342d;
            if (i9.l.a(atomicReference.get(), this)) {
                return;
            }
            atomicReference.set(this);
            r8.onAudioFocusChange(i7);
        }
    }
}

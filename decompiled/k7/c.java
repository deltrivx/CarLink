package k7;

import a8.w1;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import b3.i0;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.util.Logger;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import t8.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements m7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f7339a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f7340b = t8.a.d(new i0(15));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f7341c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f7342d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f7343e = new ConcurrentLinkedQueue();

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.media.AudioManager$OnAudioFocusChangeListener, java.lang.Object] */
    public static void a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        AudioFocusRequest audioFocusRequest;
        i9.l.e(onAudioFocusChangeListener, "listener");
        b bVar = (b) f7341c.remove(onAudioFocusChangeListener);
        ConcurrentLinkedQueue concurrentLinkedQueue = f7343e;
        if (bVar == null) {
            i9.l.e(concurrentLinkedQueue, "<this>");
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                if (((b) it.next()).f7337c.equals(onAudioFocusChangeListener)) {
                    it.remove();
                }
            }
            return;
        }
        AtomicReference atomicReference = f7342d;
        try {
            int i7 = Build.VERSION.SDK_INT;
            o oVar = f7340b;
            if (i7 < 26 || (audioFocusRequest = bVar.f7338d) == null) {
                ((AudioManager) oVar.getValue()).abandonAudioFocus(bVar);
                if (i9.l.a(atomicReference.get(), bVar)) {
                    atomicReference.set(null);
                }
            } else {
                ((AudioManager) oVar.getValue()).abandonAudioFocusRequest(audioFocusRequest);
                if (i9.l.a(atomicReference.get(), bVar)) {
                    atomicReference.set(null);
                }
            }
            b bVar2 = (b) concurrentLinkedQueue.poll();
            if (bVar2 != null) {
                ?? r8 = bVar2.f7337c;
                if (f7339a.c(bVar2) != 1) {
                    r8.onAudioFocusChange(-1);
                } else {
                    r8.onAudioFocusChange(1);
                }
            }
        } catch (Throwable th) {
            if (i9.l.a(atomicReference.get(), bVar)) {
                atomicReference.set(null);
            }
            throw th;
        }
    }

    public static int d(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i7, int i10, int i11) {
        boolean z10 = (i11 & 8) == 0;
        b bVar = (b) f7342d.get();
        if (bVar != null) {
            if (bVar.f7337c.equals(onAudioFocusChangeListener)) {
                return 1;
            }
            if (bVar.f7335a > i7) {
                if (!z10) {
                    Logger.INSTANCE.d(Constants.TAG, "【监听状态】请求焦点 FAILED");
                    return 0;
                }
                b bVar2 = new b(i7, i10, onAudioFocusChangeListener);
                ConcurrentLinkedQueue concurrentLinkedQueue = f7343e;
                if (!concurrentLinkedQueue.contains(bVar2)) {
                    concurrentLinkedQueue.add(bVar2);
                }
                Logger.INSTANCE.d(Constants.TAG, "【监听状态】请求焦点 DELAYED");
                return 2;
            }
        }
        return f7339a.c(new b(i7, i10, onAudioFocusChangeListener));
    }

    @Override // m7.a
    public final m7.j b() {
        return i2.c.B();
    }

    public final int c(b bVar) {
        int iRequestAudioFocus;
        int i7 = bVar.f7335a;
        int i10 = bVar.f7336b;
        int i11 = Build.VERSION.SDK_INT;
        o oVar = f7340b;
        if (i11 >= 26) {
            w1.r();
            AudioFocusRequest audioFocusRequestBuild = w1.f(i10).setAudioAttributes(new AudioAttributes.Builder().setUsage(i2.c.s(this, i7)).setContentType(2).build()).setOnAudioFocusChangeListener(bVar).build();
            bVar.f7338d = audioFocusRequestBuild;
            iRequestAudioFocus = ((AudioManager) oVar.getValue()).requestAudioFocus(audioFocusRequestBuild);
        } else {
            iRequestAudioFocus = ((AudioManager) oVar.getValue()).requestAudioFocus(bVar, i2.c.s(this, i7), i10);
        }
        if (iRequestAudioFocus == 1) {
            f7342d.set(bVar);
            f7341c.put(bVar.f7337c, bVar);
        }
        return iRequestAudioFocus;
    }
}

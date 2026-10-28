package k2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f7217a = new n(u8.w.f13122a, null);

    public static final m0 a(PointerInputEventHandler pointerInputEventHandler) {
        return new m0(null, null, pointerInputEventHandler);
    }

    public static final r1.p c(r1.p pVar, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return pVar.a(new SuspendPointerInputElement(obj, null, pointerInputEventHandler, 6));
    }
}

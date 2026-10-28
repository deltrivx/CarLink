package l9;

import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;
import n3.u;
import o9.e0;
import r2.q1;
import r2.s0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8280a;

    public /* synthetic */ b(int i7) {
        this.f8280a = i7;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f8280a) {
            case 0:
                return new Random();
            case 1:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                s0 s0Var = new s0(choreographer, e0.q(looperMyLooper));
                return u.G(s0Var, s0Var.f11399l);
            default:
                return new q1();
        }
    }
}

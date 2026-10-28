package b4;

import com.tencent.bugly.proguard.ak;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1509a;

    public /* synthetic */ o(int i7) {
        this.f1509a = i7;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f1509a) {
            case 0:
                return new n(runnable);
            default:
                Thread thread = new Thread(runnable);
                thread.setName("BuglyThread-" + ak.f3134a.getAndIncrement());
                return thread;
        }
    }
}

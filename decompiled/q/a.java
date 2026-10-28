package q;

import java.util.concurrent.Executors;
import n3.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile a f10526e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10527d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i7) {
        super(5);
        switch (i7) {
            case 1:
                super(5);
                this.f10527d = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f10527d = new a(1);
                break;
        }
    }

    public static a M() {
        if (f10526e != null) {
            return f10526e;
        }
        synchronized (a.class) {
            try {
                if (f10526e == null) {
                    f10526e = new a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f10526e;
    }
}

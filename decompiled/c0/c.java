package c0;

import java.util.concurrent.CancellationException;
import n1.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1799a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i7, String str) {
        super(str);
        this.f1799a = i7;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f1799a) {
            case 0:
                setStackTrace(d.f1800a);
                break;
            case 1:
                setStackTrace(h.f8713a);
                break;
            default:
                setStackTrace(n2.b.f8729a);
                break;
        }
        return this;
    }
}

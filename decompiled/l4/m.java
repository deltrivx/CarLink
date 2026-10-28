package l4;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends k9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k9.a f8018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f8019d;

    public m(k9.a aVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f8018c = aVar;
        this.f8019d = threadPoolExecutor;
    }

    @Override // k9.a
    public final void F(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f8019d;
        try {
            this.f8018c.F(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // k9.a
    public final void G(da.a aVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f8019d;
        try {
            this.f8018c.G(aVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}

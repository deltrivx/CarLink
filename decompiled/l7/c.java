package l7;

import com.baidu.carlife.sdk.CarLifeContext;
import i9.l;
import n7.g;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CarLifeContext f8079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f8080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f8081c;

    public c(CarLifeContext carLifeContext) {
        l.e(carLifeContext, "context");
        this.f8079a = carLifeContext;
        this.f8080b = new g(0, 3);
    }
}

package c;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f1763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i9.j f1764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1766e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(p4.u uVar) {
        this(false);
        this.f1765d = 1;
        this.f1766e = uVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(r3.a aVar) {
        this(true);
        this.f1765d = 0;
        this.f1766e = aVar;
    }

    public m0(boolean z10) {
        this.f1762a = z10;
        this.f1763b = new CopyOnWriteArrayList();
    }
}

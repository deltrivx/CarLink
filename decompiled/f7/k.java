package f7;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class k implements n5.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n5.h f5429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5430b = new ArrayList();

    public k(n5.h hVar) {
        this.f5429a = hVar;
    }

    @Override // n5.p
    public final void a(n5.o oVar) {
        this.f5430b.add(oVar);
    }

    public n5.b b(n5.j jVar) {
        return new n5.b(new t5.e(jVar));
    }
}

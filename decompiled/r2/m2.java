package r2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2.j f11334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.x f11335b;

    public m2(y2.m mVar, s.k kVar) {
        this.f11334a = mVar.f15020d;
        this.f11335b = new s.x(y2.m.j(4, mVar).size());
        List listJ = y2.m.j(4, mVar);
        int size = listJ.size();
        for (int i7 = 0; i7 < size; i7++) {
            y2.m mVar2 = (y2.m) listJ.get(i7);
            if (kVar.a(mVar2.f15023g)) {
                this.f11335b.a(mVar2.f15023g);
            }
        }
    }
}

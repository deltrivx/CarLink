package j1;

import h9.k;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f6869b;

    public /* synthetic */ b(int i7, Collection collection) {
        this.f6868a = i7;
        this.f6869b = collection;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        boolean zContains;
        switch (this.f6868a) {
            case 0:
                zContains = this.f6869b.contains(obj);
                break;
            case 1:
                zContains = this.f6869b.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(this.f6869b);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}

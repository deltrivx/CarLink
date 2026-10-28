package g7;

import f7.v;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f6001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f6002b;

    public m(n nVar, v vVar) {
        this.f6002b = nVar;
        this.f6001a = vVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        n nVar = this.f6002b;
        v vVar = this.f6001a;
        return Float.compare(nVar.a((v) obj2, vVar), nVar.a((v) obj, vVar));
    }
}

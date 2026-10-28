package r9;

import java.lang.reflect.Method;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11675a;

    public /* synthetic */ f(int i7) {
        this.f11675a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f11675a) {
            case 0:
                return n3.n.X(((Method) obj).getName(), ((Method) obj2).getName());
            case 1:
                return n3.n.X(((v0) ((o9.n) obj)).b(), ((v0) ((o9.n) obj2)).b());
            default:
                zb.i iVar = e0.f11673a;
                Integer numB = x9.o.b((ga.o) obj, (ga.o) obj2);
                if (numB != null) {
                    return numB.intValue();
                }
                return 0;
        }
    }
}

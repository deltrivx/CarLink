package v7;

import java.util.Comparator;
import n3.n;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13636a;

    public /* synthetic */ b(int i7) {
        this.f13636a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f13636a) {
            case 0:
                break;
        }
        return n.X(Integer.valueOf(((e) obj).f()), Integer.valueOf(((e) obj2).f()));
    }
}

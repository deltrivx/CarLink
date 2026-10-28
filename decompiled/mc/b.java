package mc;

import i9.l;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8631a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List list, String str, b bVar) {
        super(str, bVar);
        l.e(list, "missingFields");
        this.f8631a = list;
    }
}

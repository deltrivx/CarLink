package h0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List[] f6363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s0 f6367f;

    public r0(s0 s0Var, List list) {
        this.f6367f = s0Var;
        this.f6362a = list;
        this.f6363b = new List[list.size()];
        if (list.isEmpty()) {
            c0.b.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}

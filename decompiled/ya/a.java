package ya;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public enum a {
    NO_ARGUMENTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(2),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS_PARENTHESIZED(true, true);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15170b;

    /* synthetic */ a(int i7) {
        this((i7 & 1) == 0, false);
    }

    a(boolean z10, boolean z11) {
        this.f15169a = z10;
        this.f15170b = z11;
    }
}

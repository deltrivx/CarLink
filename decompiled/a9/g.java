package a9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends a {
    public g(y8.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != y8.i.f15108a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // y8.c
    public final y8.h getContext() {
        return y8.i.f15108a;
    }
}

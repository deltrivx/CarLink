package tb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends u8.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12889c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f12890d;

    public b(c cVar) {
        this.f12890d = cVar;
    }

    @Override // u8.b
    public final void a() {
        int i7;
        Object[] objArr;
        do {
            i7 = this.f12889c + 1;
            this.f12889c = i7;
            objArr = this.f12890d.f12891a;
            if (i7 >= objArr.length) {
                break;
            }
        } while (objArr[i7] == null);
        if (i7 >= objArr.length) {
            this.f13101a = 2;
            return;
        }
        Object obj = objArr[i7];
        i9.l.c(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
        this.f13102b = obj;
        this.f13101a = 1;
    }
}

package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5101b;

    public /* synthetic */ r(int i7, Object obj) {
        this.f5100a = i7;
        this.f5101b = obj;
    }

    public final void a() {
        switch (this.f5100a) {
            case 0:
                ((s) this.f5101b).A--;
                break;
            default:
                ((p1.t) this.f5101b).f10086j--;
                break;
        }
    }

    public final void b() {
        switch (this.f5100a) {
            case 0:
                ((s) this.f5101b).A++;
                break;
            default:
                ((p1.t) this.f5101b).f10086j++;
                break;
        }
    }
}

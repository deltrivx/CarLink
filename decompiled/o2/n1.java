package o2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f9385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f9386d;

    public n1(String str) {
        this.f9384b = str;
        this.f9385c = new p(str);
        this.f9386d = new p(str.concat(" maximum"));
    }

    public final String toString() {
        return this.f9384b;
    }
}

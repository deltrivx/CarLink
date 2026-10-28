package g6;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5934f;

    public a(int i7, int i10, int i11, int i12, int i13) {
        this.f5929a = i13;
        switch (i13) {
            case 1:
                this.f5934f = -1;
                this.f5930b = i7;
                this.f5931c = i10;
                this.f5932d = i11;
                this.f5933e = i12;
                break;
            default:
                this.f5930b = i7;
                this.f5931c = i12;
                this.f5932d = i10;
                this.f5933e = i11;
                this.f5934f = i10 + i11;
                break;
        }
    }

    public boolean a(int i7) {
        if (i7 != -1) {
            return this.f5932d == (i7 % 3) * 3;
        }
        return false;
    }

    public void b() {
        this.f5934f = (this.f5932d / 3) + ((this.f5933e / 30) * 3);
    }

    public String toString() {
        switch (this.f5929a) {
            case 1:
                return this.f5934f + "|" + this.f5933e;
            default:
                return super.toString();
        }
    }
}

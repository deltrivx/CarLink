package e4;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n implements g3.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4381c;

    public /* synthetic */ n(int i7) {
        this.f4379a = i7;
    }

    public /* synthetic */ n(int i7, int i10, int i11) {
        this.f4379a = i11;
        this.f4380b = i7;
        this.f4381c = i10;
    }

    @Override // g3.q
    public int a(int i7) {
        if (i7 >= 0 && i7 <= this.f4381c) {
            l0.q0.z(i7, this.f4380b, i7);
        }
        return i7;
    }

    @Override // g3.q
    public int b(int i7) {
        if (i7 >= 0 && i7 <= this.f4380b) {
            l0.q0.y(i7, this.f4381c, i7);
        }
        return i7;
    }

    public n5.o c() {
        return new n5.o(this.f4380b, this.f4381c);
    }

    public String toString() {
        switch (this.f4379a) {
            case 4:
                StringBuilder sb2 = new StringBuilder("<");
                sb2.append(this.f4380b);
                sb2.append(' ');
                return a2.f.H(sb2, this.f4381c, '>');
            default:
                return super.toString();
        }
    }
}

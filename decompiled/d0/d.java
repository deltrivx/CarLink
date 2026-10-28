package d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3550b;

    public d(int i7) {
        this.f3549a = i7;
        switch (i7) {
            case 1:
                this.f3550b = 0;
                break;
            case 2:
                this.f3550b = 0;
                break;
            case 3:
                this.f3550b = 0;
                break;
            default:
                this.f3550b = 0;
                break;
        }
    }

    @Override // d0.e, d0.g
    public final float a() {
        switch (this.f3549a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f3550b;
    }

    @Override // d0.g
    public final void b(int i7, o2.o0 o0Var, int[] iArr, int[] iArr2) {
        switch (this.f3549a) {
            case 0:
                h.a(i7, iArr, iArr2, false);
                break;
            case 1:
                h.d(i7, iArr, iArr2, false);
                break;
            case 2:
                h.e(i7, iArr, iArr2, false);
                break;
            default:
                h.f(i7, iArr, iArr2, false);
                break;
        }
    }

    @Override // d0.e
    public final void c(n3.c cVar, int i7, int[] iArr, n3.o oVar, int[] iArr2) {
        switch (this.f3549a) {
            case 0:
                if (oVar != n3.o.f8749a) {
                    h.a(i7, iArr, iArr2, true);
                } else {
                    h.a(i7, iArr, iArr2, false);
                }
                break;
            case 1:
                if (oVar != n3.o.f8749a) {
                    h.d(i7, iArr, iArr2, true);
                } else {
                    h.d(i7, iArr, iArr2, false);
                }
                break;
            case 2:
                if (oVar != n3.o.f8749a) {
                    h.e(i7, iArr, iArr2, true);
                } else {
                    h.e(i7, iArr, iArr2, false);
                }
                break;
            default:
                if (oVar != n3.o.f8749a) {
                    h.f(i7, iArr, iArr2, true);
                } else {
                    h.f(i7, iArr, iArr2, false);
                }
                break;
        }
    }

    public final String toString() {
        switch (this.f3549a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}

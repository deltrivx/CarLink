package r2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e6.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static d f11210c;

    @Override // e6.f
    public final int[] f(int i7) {
        int length = k().length();
        if (length <= 0 || i7 >= length) {
            return null;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        while (i7 < length && k().charAt(i7) == '\n' && (k().charAt(i7) == '\n' || (i7 != 0 && k().charAt(i7 - 1) != '\n'))) {
            i7++;
        }
        if (i7 >= length) {
            return null;
        }
        int i10 = i7 + 1;
        while (i10 < length && !p(i10)) {
            i10++;
        }
        return j(i7, i10);
    }

    @Override // e6.f
    public final int[] n(int i7) {
        int length = k().length();
        if (length <= 0 || i7 <= 0) {
            return null;
        }
        if (i7 > length) {
            i7 = length;
        }
        while (i7 > 0 && k().charAt(i7 - 1) == '\n' && !p(i7)) {
            i7--;
        }
        if (i7 <= 0) {
            return null;
        }
        int i10 = i7 - 1;
        while (i10 > 0 && (k().charAt(i10) == '\n' || (i10 != 0 && k().charAt(i10 - 1) != '\n'))) {
            i10--;
        }
        return j(i10, i7);
    }

    public final boolean p(int i7) {
        if (i7 <= 0 || k().charAt(i7 - 1) == '\n') {
            return false;
        }
        return i7 == k().length() || k().charAt(i7) == '\n';
    }
}

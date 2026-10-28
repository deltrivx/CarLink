package ac;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f528b;

    public g(int i7, long j5) {
        this.f527a = j5;
        this.f528b = i7;
    }

    @Override // ac.h
    public final d toInstant() {
        d dVar = d.f519c;
        d dVar2 = d.f519c;
        long j5 = dVar2.f521a;
        long j10 = this.f527a;
        if (j10 >= j5) {
            d dVar3 = d.f520d;
            if (j10 <= dVar3.f521a) {
                long j11 = this.f528b;
                long j12 = j11 / 1000000000;
                if ((j11 ^ 1000000000) < 0 && j12 * 1000000000 != j11) {
                    j12--;
                }
                long j13 = j10 + j12;
                if ((j10 ^ j13) < 0 && (j12 ^ j10) >= 0) {
                    return j10 > 0 ? dVar3 : dVar2;
                }
                if (j13 >= -31557014167219200L) {
                    if (j13 <= 31556889864403199L) {
                        long j14 = j11 % 1000000000;
                        return new d((int) (j14 + ((((j14 ^ 1000000000) & ((-j14) | j14)) >> 63) & 1000000000)), j13);
                    }
                }
            }
        }
        throw new e("The parsed date is outside the range representable by Instant (Unix epoch second " + j10 + ')');
    }
}

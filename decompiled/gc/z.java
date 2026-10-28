package gc;

import fc.f0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z extends fc.x implements f0 {
    @Override // fc.f0
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f5612h;
            i9.l.b(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((this.f5613i + ((long) ((int) ((o() + ((long) this.k)) - this.f5613i)))) - 1))]).intValue());
        }
        return numValueOf;
    }

    public final void w(int i7) {
        synchronized (this) {
            Object[] objArr = this.f5612h;
            i9.l.b(objArr);
            q(Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((this.f5613i + ((long) ((int) ((o() + ((long) this.k)) - this.f5613i)))) - 1))]).intValue() + i7));
        }
    }
}

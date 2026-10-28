package f1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends p1.a0 implements Parcelable, b1, w2, p1.n {
    public static final Parcelable.Creator<i1> CREATOR = new f1(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o2 f4984b;

    public i1(long j5) {
        p1.f fVarK = p1.l.k();
        o2 o2Var = new o2(fVarK.g(), j5);
        if (!(fVarK instanceof p1.a)) {
            o2Var.f10010b = new o2(1, j5);
        }
        this.f4984b = o2Var;
    }

    @Override // p1.n
    public final q2 a() {
        return w0.f5187f;
    }

    @Override // p1.z
    public final p1.b0 c() {
        return this.f4984b;
    }

    @Override // p1.a0, p1.z
    public final p1.b0 d(p1.b0 b0Var, p1.b0 b0Var2, p1.b0 b0Var3) {
        if (((o2) b0Var2).f5076c == ((o2) b0Var3).f5076c) {
            return b0Var2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void f(long j5) {
        p1.f fVarK;
        o2 o2Var = (o2) p1.l.i(this.f4984b);
        if (o2Var.f5076c != j5) {
            o2 o2Var2 = this.f4984b;
            synchronized (p1.l.f10057c) {
                fVarK = p1.l.k();
                ((o2) p1.l.p(o2Var2, this, fVarK, o2Var)).f5076c = j5;
            }
            p1.l.o(fVarK, this);
        }
    }

    @Override // f1.w2
    public final Object getValue() {
        return Long.valueOf(((o2) p1.l.u(this.f4984b, this)).f5076c);
    }

    @Override // p1.z
    public final void k(p1.b0 b0Var) {
        i9.l.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f4984b = (o2) b0Var;
    }

    @Override // f1.b1
    public final void setValue(Object obj) {
        f(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((o2) p1.l.i(this.f4984b)).f5076c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(((o2) p1.l.u(this.f4984b, this)).f5076c);
    }
}

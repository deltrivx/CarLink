package f1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends p1.a0 implements Parcelable, p1.n, b1, w2 {
    public static final Parcelable.Creator<h1> CREATOR = new f1(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n2 f4969b;

    public h1(int i7) {
        p1.f fVarK = p1.l.k();
        n2 n2Var = new n2(i7, fVarK.g());
        if (!(fVarK instanceof p1.a)) {
            n2Var.f10010b = new n2(i7, 1);
        }
        this.f4969b = n2Var;
    }

    @Override // p1.n
    public final q2 a() {
        return w0.f5187f;
    }

    @Override // p1.z
    public final p1.b0 c() {
        return this.f4969b;
    }

    @Override // p1.a0, p1.z
    public final p1.b0 d(p1.b0 b0Var, p1.b0 b0Var2, p1.b0 b0Var3) {
        if (((n2) b0Var2).f5063c == ((n2) b0Var3).f5063c) {
            return b0Var2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int f() {
        return ((n2) p1.l.u(this.f4969b, this)).f5063c;
    }

    public final void g(int i7) {
        p1.f fVarK;
        n2 n2Var = (n2) p1.l.i(this.f4969b);
        if (n2Var.f5063c != i7) {
            n2 n2Var2 = this.f4969b;
            synchronized (p1.l.f10057c) {
                fVarK = p1.l.k();
                ((n2) p1.l.p(n2Var2, this, fVarK, n2Var)).f5063c = i7;
            }
            p1.l.o(fVarK, this);
        }
    }

    @Override // f1.w2
    public final Object getValue() {
        return Integer.valueOf(f());
    }

    @Override // p1.z
    public final void k(p1.b0 b0Var) {
        i9.l.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f4969b = (n2) b0Var;
    }

    @Override // f1.b1
    public final void setValue(Object obj) {
        g(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((n2) p1.l.i(this.f4969b)).f5063c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(f());
    }
}

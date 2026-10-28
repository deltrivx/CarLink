package f1;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends p1.a0 implements Parcelable, p1.n, b1, w2 {
    public static final Parcelable.Creator<g1> CREATOR = new f1(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m2 f4961b;

    public g1(float f10) {
        p1.f fVarK = p1.l.k();
        m2 m2Var = new m2(f10, fVarK.g());
        if (!(fVarK instanceof p1.a)) {
            m2Var.f10010b = new m2(f10, 1);
        }
        this.f4961b = m2Var;
    }

    @Override // p1.n
    public final q2 a() {
        return w0.f5187f;
    }

    @Override // p1.z
    public final p1.b0 c() {
        return this.f4961b;
    }

    @Override // p1.a0, p1.z
    public final p1.b0 d(p1.b0 b0Var, p1.b0 b0Var2, p1.b0 b0Var3) {
        float f10 = ((m2) b0Var2).f5050c;
        float f11 = ((m2) b0Var3).f5050c;
        if (Build.VERSION.SDK_INT >= 23) {
            if (f10 != f11) {
                return null;
            }
        } else if (n1.h.d(f10) || n1.h.d(f11) || f10 != f11) {
            return null;
        }
        return b0Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float f() {
        return ((m2) p1.l.u(this.f4961b, this)).f5050c;
    }

    public final void g(float f10) {
        p1.f fVarK;
        m2 m2Var = (m2) p1.l.i(this.f4961b);
        float f11 = m2Var.f5050c;
        if (Build.VERSION.SDK_INT >= 23) {
            if (f11 == f10) {
                return;
            }
        } else if (!n1.h.d(f11) && !n1.h.d(f10) && f11 == f10) {
            return;
        }
        m2 m2Var2 = this.f4961b;
        synchronized (p1.l.f10057c) {
            fVarK = p1.l.k();
            ((m2) p1.l.p(m2Var2, this, fVarK, m2Var)).f5050c = f10;
        }
        p1.l.o(fVarK, this);
    }

    @Override // f1.w2
    public final Object getValue() {
        return Float.valueOf(f());
    }

    @Override // p1.z
    public final void k(p1.b0 b0Var) {
        i9.l.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f4961b = (m2) b0Var;
    }

    @Override // f1.b1
    public final void setValue(Object obj) {
        g(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((m2) p1.l.i(this.f4961b)).f5050c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(f());
    }
}

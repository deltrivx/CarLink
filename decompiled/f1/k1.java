package f1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends p1.a0 implements Parcelable, p1.n {
    public static final Parcelable.Creator<k1> CREATOR = new j1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q2 f5005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p2 f5006c;

    public k1(Object obj, q2 q2Var) {
        this.f5005b = q2Var;
        p1.f fVarK = p1.l.k();
        p2 p2Var = new p2(fVarK.g(), obj);
        if (!(fVarK instanceof p1.a)) {
            p2Var.f10010b = new p2(1, obj);
        }
        this.f5006c = p2Var;
    }

    @Override // p1.n
    public final q2 a() {
        return this.f5005b;
    }

    @Override // p1.z
    public final p1.b0 c() {
        return this.f5006c;
    }

    @Override // p1.a0, p1.z
    public final p1.b0 d(p1.b0 b0Var, p1.b0 b0Var2, p1.b0 b0Var3) {
        if (this.f5005b.a(((p2) b0Var2).f5087c, ((p2) b0Var3).f5087c)) {
            return b0Var2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // f1.w2
    public final Object getValue() {
        return ((p2) p1.l.u(this.f5006c, this)).f5087c;
    }

    @Override // p1.z
    public final void k(p1.b0 b0Var) {
        i9.l.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f5006c = (p2) b0Var;
    }

    @Override // f1.b1
    public final void setValue(Object obj) {
        p1.f fVarK;
        p2 p2Var = (p2) p1.l.i(this.f5006c);
        if (this.f5005b.a(p2Var.f5087c, obj)) {
            return;
        }
        p2 p2Var2 = this.f5006c;
        synchronized (p1.l.f10057c) {
            fVarK = p1.l.k();
            ((p2) p1.l.p(p2Var2, this, fVarK, p2Var)).f5087c = obj;
        }
        p1.l.o(fVarK, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((p2) p1.l.i(this.f5006c)).f5087c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i10;
        parcel.writeValue(getValue());
        w0 w0Var = w0.f5184c;
        q2 q2Var = this.f5005b;
        if (i9.l.a(q2Var, w0Var)) {
            i10 = 0;
        } else if (i9.l.a(q2Var, w0.f5187f)) {
            i10 = 1;
        } else {
            if (!i9.l.a(q2Var, w0.f5185d)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i10 = 2;
        }
        parcel.writeInt(i10);
    }
}

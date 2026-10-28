package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Binder implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1101c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f1102b;

    public c(d dVar) {
        this.f1102b = dVar;
        attachInterface(this, b.f1100a);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        String str = b.f1100a;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i7 != 1) {
            return super.onTransact(i7, parcel, parcel2, i10);
        }
        this.f1102b.a(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }
}

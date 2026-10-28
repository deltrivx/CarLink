package l5;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f8058b;

    public final int[] U(int i7) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.desay.libsvcarinfo.ICarInfo");
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(1);
            this.f8058b.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final void V(int i7, e eVar, int[] iArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.desay.libsvcarinfo.ICarInfo");
            parcelObtain.writeInt(i7);
            parcelObtain.writeStrongInterface(eVar);
            parcelObtain.writeIntArray(iArr);
            this.f8058b.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final void W(int i7, e eVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.desay.libsvcarinfo.ICarInfo");
            parcelObtain.writeInt(i7);
            parcelObtain.writeStrongInterface(eVar);
            this.f8058b.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8058b;
    }
}

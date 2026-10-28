package l5;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.baidu.carlife.sdk.util.Logger;
import d8.f;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends Binder implements e {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface("com.desay.libsvcarinfo.ICarInfoCallBack");
        }
        if (i7 == 1598968902) {
            parcel2.writeString("com.desay.libsvcarinfo.ICarInfoCallBack");
            return true;
        }
        if (i7 != 1) {
            return super.onTransact(i7, parcel, parcel2, i10);
        }
        int i11 = parcel.readInt();
        int i12 = parcel.readInt();
        int i13 = parcel.readInt();
        d8.c cVar = (d8.c) this;
        if (i11 == 254 && i12 == 1) {
            int i14 = 0;
            boolean z10 = i13 == 1;
            Logger.INSTANCE.d("TaskerDesaySV", "大灯状态变化: ".concat(z10 ? "开启" : "关闭"));
            f fVar = cVar.f3795b;
            fVar.f3799a.post(new d8.b(fVar, z10, i14));
        }
        parcel2.writeNoException();
        return true;
    }
}

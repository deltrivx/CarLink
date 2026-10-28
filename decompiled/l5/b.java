package l5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Binder implements c {
    public static c U(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.desay.libsvcarinfo.ICarInfo");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof c)) {
            return (c) iInterfaceQueryLocalInterface;
        }
        a aVar = new a();
        aVar.f8058b = iBinder;
        return aVar;
    }
}

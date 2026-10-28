package k8;

import android.app.Notification;
import android.app.RemoteAction;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import com.muyetuge.carlifevehicle.service.BaseService;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ Notification.Builder a(BaseService baseService) {
        return new Notification.Builder(baseService, "CARLIFE_RECEIVER_SERVICE");
    }

    public static /* bridge */ /* synthetic */ RemoteAction c(Object obj) {
        return (RemoteAction) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillManager g(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue h(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return AutofillManager.class;
    }

    public static /* synthetic */ void o() {
    }
}

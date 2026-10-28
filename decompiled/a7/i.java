package a7;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends z6.a {
    public static final Parcelable.Creator<i> CREATOR = new a(6);

    @Override // z6.a
    public final int h() {
        return 33;
    }

    @Override // z6.a
    public final List k() {
        return d7.a.b(x6.a.h());
    }

    @Override // z6.a
    public final String n() {
        return "android.permission.POST_NOTIFICATIONS";
    }

    @Override // z6.a
    public final List o(Context context, boolean z10) {
        return x6.a.h().o(context, z10);
    }

    @Override // z6.a
    public final boolean t(Activity activity) {
        return x6.a.h().s(activity);
    }

    @Override // z6.a
    public final boolean w(Context context, boolean z10) {
        return x6.a.h().v(context, z10);
    }
}

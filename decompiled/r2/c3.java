package r2;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec.h f11209a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(ec.h hVar, Handler handler) {
        super(handler);
        this.f11209a = hVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) {
        this.f11209a.x(t8.z.f12851a);
    }
}

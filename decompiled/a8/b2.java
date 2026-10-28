package a8;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConnectivityManager f88a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.k f89b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f90c;

    public b2(ConnectivityManager connectivityManager, h9.k kVar, String str) {
        this.f88a = connectivityManager;
        this.f89b = kVar;
        this.f90c = str;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        i9.l.e(network, "network");
        this.f88a.bindProcessToNetwork(network);
        this.f89b.invoke("连接成功: " + this.f90c);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        this.f89b.invoke("连接失败: " + this.f90c);
    }
}

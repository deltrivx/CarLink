package com.baidu.carlife.sdk.util;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2706b;

    public /* synthetic */ a(int i7, Object obj) {
        this.f2705a = i7;
        this.f2706b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f2705a) {
            case 0:
                return InvokeTimeoutMonitor.handler$lambda$0((InvokeTimeoutMonitor) this.f2706b, message);
            default:
                return Logger._init_$lambda$0((Logger) this.f2706b, message);
        }
    }
}

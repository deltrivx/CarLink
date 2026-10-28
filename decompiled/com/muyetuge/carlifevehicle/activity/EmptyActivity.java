package com.muyetuge.carlifevehicle.activity;

import android.content.Intent;
import android.os.Bundle;
import b3.i0;
import c.r;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.muyetuge.carlifevehicle.service.MainService;
import hc.c;
import i9.l;
import j.j;
import k8.d;
import kotlin.Metadata;
import t8.a;
import t8.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/muyetuge/carlifevehicle/activity/EmptyActivity;", "Lj/j;", "<init>", "()V", "app_baiduRelease"}, k = 1, mv = {2, 1, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class EmptyActivity extends j {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final o f2911y = a.d(new i0(13));

    @Override // p4.l, c.o, u3.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r.a(this);
        int i7 = MainService.f2921a;
        d.a();
        c cVar = n8.c.f8897a;
        n8.c.j(0, "CarLife已启动");
        finish();
    }

    @Override // c.o, android.app.Activity
    public final void onNewIntent(Intent intent) {
        l.e(intent, "intent");
        super.onNewIntent(intent);
    }
}

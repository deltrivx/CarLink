package com.muyetuge.carlifevehicle.service;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import b0.g;
import b3.i0;
import cc.b0;
import cc.k0;
import cc.q1;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.CarLife;
import dc.d;
import fc.h0;
import fc.y;
import hc.c;
import hc.m;
import java.util.List;
import jc.e;
import kotlin.Metadata;
import n3.l;
import n3.u;
import t8.a;
import t8.j;
import t8.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/muyetuge/carlifevehicle/service/AccessService;", "Landroid/accessibilityservice/AccessibilityService;", "<init>", "()V", "k8/a", "app_baiduRelease"}, k = 1, mv = {2, 1, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class AccessService extends AccessibilityService {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h0 f2915d = y.b(Boolean.FALSE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f2916e = a.d(new i0(17));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f2917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f2918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2919c;

    public AccessService() {
        q1 q1VarB = b0.b();
        this.f2917a = q1VarB;
        e eVar = k0.f2635a;
        d dVar = m.f6531a;
        dVar.getClass();
        this.f2918b = b0.a(u.G(dVar, q1VarB));
        this.f2919c = u8.b0.W0(new j("android", l.I("接受")), new j("com.android.systemui", l.I("确定")));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    @Override // android.accessibilityservice.AccessibilityService
    public final void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        AccessibilityNodeInfo source;
        AccessibilityNodeInfo rootInActiveWindow;
        if (accessibilityEvent == null || (source = accessibilityEvent.getSource()) == null) {
            return;
        }
        if (CarLife.receiver().isConnected()) {
            source.recycle();
            return;
        }
        if (accessibilityEvent.getEventType() != 32) {
            source.recycle();
            return;
        }
        CharSequence packageName = accessibilityEvent.getPackageName();
        y8.c cVar = null;
        List<String> list = (List) this.f2919c.get(packageName != null ? packageName.toString() : null);
        if (list != null && (rootInActiveWindow = getRootInActiveWindow()) != null) {
            for (String str : list) {
                List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText = rootInActiveWindow.findAccessibilityNodeInfosByText(str);
                if (listFindAccessibilityNodeInfosByText != null) {
                    for (AccessibilityNodeInfo accessibilityNodeInfo : listFindAccessibilityNodeInfosByText) {
                        b0.s(this.f2918b, null, new g(this, str, cVar, 9), 3);
                        accessibilityNodeInfo.recycle();
                    }
                }
            }
            rootInActiveWindow.recycle();
        }
        source.recycle();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Boolean bool = Boolean.TRUE;
        h0 h0Var = f2915d;
        h0Var.getClass();
        h0Var.j(null, bool);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        Boolean bool = Boolean.FALSE;
        h0 h0Var = f2915d;
        h0Var.getClass();
        h0Var.j(null, bool);
        this.f2917a.a(null);
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onInterrupt() {
        k8.a.a();
    }
}

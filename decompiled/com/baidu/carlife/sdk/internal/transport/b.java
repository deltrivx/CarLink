package com.baidu.carlife.sdk.internal.transport;

import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static boolean a(TransportListener transportListener, CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        l.e(carLifeContext, "context");
        l.e(carLifeMessage, "message");
        return false;
    }

    public static boolean b(TransportListener transportListener, CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        l.e(carLifeContext, "context");
        l.e(carLifeMessage, "message");
        return false;
    }
}

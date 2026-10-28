package com.baidu.carlife.sdk.internal.transport;

import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.ConnectionChangeListener;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/baidu/carlife/sdk/internal/transport/TransportListener;", "Lcom/baidu/carlife/sdk/ConnectionChangeListener;", "onReceiveMessage", "", "context", "Lcom/baidu/carlife/sdk/CarLifeContext;", "message", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "onSendMessage", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public interface TransportListener extends ConnectionChangeListener {

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class DefaultImpls {
        @Deprecated
        public static void onConnectionAttached(TransportListener transportListener, CarLifeContext carLifeContext) {
            l.e(carLifeContext, "context");
            com.baidu.carlife.sdk.a.a(transportListener, carLifeContext);
        }

        @Deprecated
        public static void onConnectionAuthenFailed(TransportListener transportListener, CarLifeContext carLifeContext) {
            l.e(carLifeContext, "context");
            com.baidu.carlife.sdk.a.b(transportListener, carLifeContext);
        }

        @Deprecated
        public static void onConnectionDetached(TransportListener transportListener, CarLifeContext carLifeContext) {
            l.e(carLifeContext, "context");
            com.baidu.carlife.sdk.a.c(transportListener, carLifeContext);
        }

        @Deprecated
        public static void onConnectionEstablished(TransportListener transportListener, CarLifeContext carLifeContext) {
            l.e(carLifeContext, "context");
            com.baidu.carlife.sdk.a.d(transportListener, carLifeContext);
        }

        @Deprecated
        public static void onConnectionPrompt(TransportListener transportListener, String str) {
            l.e(str, "prompt");
            com.baidu.carlife.sdk.a.e(transportListener, str);
        }

        @Deprecated
        public static void onConnectionReattached(TransportListener transportListener, CarLifeContext carLifeContext) {
            l.e(carLifeContext, "context");
            com.baidu.carlife.sdk.a.f(transportListener, carLifeContext);
        }

        @Deprecated
        public static void onConnectionVersionNotSupprt(TransportListener transportListener, CarLifeContext carLifeContext) {
            l.e(carLifeContext, "context");
            com.baidu.carlife.sdk.a.g(transportListener, carLifeContext);
        }

        @Deprecated
        public static void onConnectionWait(TransportListener transportListener) {
            com.baidu.carlife.sdk.a.h(transportListener);
        }

        @Deprecated
        public static boolean onReceiveMessage(TransportListener transportListener, CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
            l.e(carLifeContext, "context");
            l.e(carLifeMessage, "message");
            return b.a(transportListener, carLifeContext, carLifeMessage);
        }

        @Deprecated
        public static boolean onSendMessage(TransportListener transportListener, CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
            l.e(carLifeContext, "context");
            l.e(carLifeMessage, "message");
            return b.b(transportListener, carLifeContext, carLifeMessage);
        }
    }

    boolean onReceiveMessage(CarLifeContext context, CarLifeMessage message);

    boolean onSendMessage(CarLifeContext context, CarLifeMessage message);
}

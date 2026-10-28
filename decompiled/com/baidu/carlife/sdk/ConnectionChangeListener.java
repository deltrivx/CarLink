package com.baidu.carlife.sdk;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/baidu/carlife/sdk/ConnectionChangeListener;", "", "Lcom/baidu/carlife/sdk/CarLifeContext;", "context", "Lt8/z;", "onConnectionAttached", "(Lcom/baidu/carlife/sdk/CarLifeContext;)V", "onConnectionReattached", "onConnectionDetached", "onConnectionEstablished", "onConnectionVersionNotSupprt", "onConnectionAuthenFailed", "", "prompt", "onConnectionPrompt", "(Ljava/lang/String;)V", "onConnectionWait", "()V", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public interface ConnectionChangeListener {

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class DefaultImpls {
        @Deprecated
        public static void onConnectionAttached(ConnectionChangeListener connectionChangeListener, CarLifeContext carLifeContext) {
            l.e(carLifeContext, "context");
            a.a(connectionChangeListener, carLifeContext);
        }

        @Deprecated
        public static void onConnectionAuthenFailed(ConnectionChangeListener connectionChangeListener, CarLifeContext carLifeContext) {
            l.e(carLifeContext, "context");
            a.b(connectionChangeListener, carLifeContext);
        }

        @Deprecated
        public static void onConnectionDetached(ConnectionChangeListener connectionChangeListener, CarLifeContext carLifeContext) {
            l.e(carLifeContext, "context");
            a.c(connectionChangeListener, carLifeContext);
        }

        @Deprecated
        public static void onConnectionEstablished(ConnectionChangeListener connectionChangeListener, CarLifeContext carLifeContext) {
            l.e(carLifeContext, "context");
            a.d(connectionChangeListener, carLifeContext);
        }

        @Deprecated
        public static void onConnectionPrompt(ConnectionChangeListener connectionChangeListener, String str) {
            l.e(str, "prompt");
            a.e(connectionChangeListener, str);
        }

        @Deprecated
        public static void onConnectionReattached(ConnectionChangeListener connectionChangeListener, CarLifeContext carLifeContext) {
            l.e(carLifeContext, "context");
            a.f(connectionChangeListener, carLifeContext);
        }

        @Deprecated
        public static void onConnectionVersionNotSupprt(ConnectionChangeListener connectionChangeListener, CarLifeContext carLifeContext) {
            l.e(carLifeContext, "context");
            a.g(connectionChangeListener, carLifeContext);
        }

        @Deprecated
        public static void onConnectionWait(ConnectionChangeListener connectionChangeListener) {
            a.h(connectionChangeListener);
        }
    }

    void onConnectionAttached(CarLifeContext context);

    void onConnectionAuthenFailed(CarLifeContext context);

    void onConnectionDetached(CarLifeContext context);

    void onConnectionEstablished(CarLifeContext context);

    void onConnectionPrompt(String prompt);

    void onConnectionReattached(CarLifeContext context);

    void onConnectionVersionNotSupprt(CarLifeContext context);

    void onConnectionWait();
}

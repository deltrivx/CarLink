package com.baidu.carlife.sdk.receiver;

import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.a;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.b;
import i9.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0006¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/CarLifeReceiver;", "Lcom/baidu/carlife/sdk/CarLifeContext;", "", "keyCode", "Lt8/z;", "onKeyEvent", "(I)V", "", "channel", "uniqueId", "initStatisticsInfo", "(Ljava/lang/String;Ljava/lang/String;)V", "connect", "()V", "stopConnect", "disconnect", "ready", "type", "setConnectType", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public interface CarLifeReceiver extends CarLifeContext {

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class DefaultImpls {
        @Deprecated
        public static <T> T getConfig(CarLifeReceiver carLifeReceiver, String str) {
            l.e(str, "key");
            return (T) CarLifeContext.CC.a(carLifeReceiver, str);
        }

        @Deprecated
        public static void onConnectionAttached(CarLifeReceiver carLifeReceiver) {
            CarLifeContext.CC.b(carLifeReceiver);
        }

        @Deprecated
        public static void onConnectionAttached(CarLifeReceiver carLifeReceiver, CarLifeContext carLifeContext) {
            l.e(carLifeContext, "context");
            a.a(carLifeReceiver, carLifeContext);
        }

        @Deprecated
        public static void onConnectionAuthenFailed(CarLifeReceiver carLifeReceiver) {
            CarLifeContext.CC.c(carLifeReceiver);
        }

        @Deprecated
        public static void onConnectionAuthenFailed(CarLifeReceiver carLifeReceiver, CarLifeContext carLifeContext) {
            l.e(carLifeContext, "context");
            a.b(carLifeReceiver, carLifeContext);
        }

        @Deprecated
        public static void onConnectionDetached(CarLifeReceiver carLifeReceiver) {
            CarLifeContext.CC.d(carLifeReceiver);
        }

        @Deprecated
        public static void onConnectionDetached(CarLifeReceiver carLifeReceiver, CarLifeContext carLifeContext) {
            l.e(carLifeContext, "context");
            a.c(carLifeReceiver, carLifeContext);
        }

        @Deprecated
        public static void onConnectionEstablished(CarLifeReceiver carLifeReceiver) {
            CarLifeContext.CC.e(carLifeReceiver);
        }

        @Deprecated
        public static void onConnectionEstablished(CarLifeReceiver carLifeReceiver, CarLifeContext carLifeContext) {
            l.e(carLifeContext, "context");
            a.d(carLifeReceiver, carLifeContext);
        }

        @Deprecated
        public static void onConnectionPrompt(CarLifeReceiver carLifeReceiver, String str) {
            l.e(str, "prompt");
            a.e(carLifeReceiver, str);
        }

        @Deprecated
        public static void onConnectionReattached(CarLifeReceiver carLifeReceiver, CarLifeContext carLifeContext) {
            l.e(carLifeContext, "context");
            a.f(carLifeReceiver, carLifeContext);
        }

        @Deprecated
        public static void onConnectionVersionNotSupprt(CarLifeReceiver carLifeReceiver) {
            CarLifeContext.CC.f(carLifeReceiver);
        }

        @Deprecated
        public static void onConnectionVersionNotSupprt(CarLifeReceiver carLifeReceiver, CarLifeContext carLifeContext) {
            l.e(carLifeContext, "context");
            a.g(carLifeReceiver, carLifeContext);
        }

        @Deprecated
        public static void onConnectionWait(CarLifeReceiver carLifeReceiver) {
            a.h(carLifeReceiver);
        }

        @Deprecated
        public static boolean onReceiveMessage(CarLifeReceiver carLifeReceiver, CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
            l.e(carLifeContext, "context");
            l.e(carLifeMessage, "message");
            return b.a(carLifeReceiver, carLifeContext, carLifeMessage);
        }

        @Deprecated
        public static boolean onSendMessage(CarLifeReceiver carLifeReceiver, CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
            l.e(carLifeContext, "context");
            l.e(carLifeMessage, "message");
            return b.b(carLifeReceiver, carLifeContext, carLifeMessage);
        }

        @Deprecated
        public static void post(CarLifeReceiver carLifeReceiver, Runnable runnable) {
            l.e(runnable, "runnable");
            CarLifeContext.CC.g(carLifeReceiver, runnable);
        }

        @Deprecated
        public static void postDelayed(CarLifeReceiver carLifeReceiver, Runnable runnable, long j5) {
            l.e(runnable, "runnable");
            CarLifeContext.CC.h(carLifeReceiver, runnable, j5);
        }

        @Deprecated
        public static void postMessage(CarLifeReceiver carLifeReceiver, int i7, int i10) {
            CarLifeContext.CC.i(carLifeReceiver, i7, i10);
        }

        @Deprecated
        public static void sendMessage(CarLifeReceiver carLifeReceiver, int i7, int i10) {
            CarLifeContext.CC.j(carLifeReceiver, i7, i10);
        }
    }

    void connect();

    void disconnect();

    void initStatisticsInfo(String channel, String uniqueId);

    void onKeyEvent(int keyCode);

    void ready();

    void setConnectType(int type);

    void stopConnect();
}

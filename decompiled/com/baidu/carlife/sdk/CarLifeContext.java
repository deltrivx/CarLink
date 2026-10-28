package com.baidu.carlife.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import com.baidu.carlife.protobuf.CarlifeDeviceInfoProto;
import com.baidu.carlife.protobuf.CarlifeFeatureConfigProto;
import com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.TransportListener;
import com.baidu.carlife.sdk.internal.transport.b;
import i9.l;
import i9.n;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u0000 \u008f\u00012\u00020\u0001:\u0002\u008f\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\r\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0007H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\"\u0010!J\u001f\u0010 \u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010%J\u001f\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010%J\u001f\u0010(\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b*\u0010+J%\u0010-\u001a\u00028\u0000\"\u0004\b\u0000\u0010,2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H&¢\u0006\u0004\b-\u0010.J\u001f\u0010-\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010,2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010/J\u0017\u00100\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b2\u00101J\u001d\u00105\u001a\u00020\u00022\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000203H&¢\u0006\u0004\b5\u00106J\u0017\u00105\u001a\u00020\u00022\u0006\u00104\u001a\u000207H\u0016¢\u0006\u0004\b5\u00108J%\u0010;\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000203H&¢\u0006\u0004\b;\u0010<J\u001f\u0010;\u001a\u00020\u00022\u0006\u00104\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010=J\u000f\u0010?\u001a\u00020>H&¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH&¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020AH&¢\u0006\u0004\bD\u0010CJ\u0017\u0010E\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0001H&¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0001H&¢\u0006\u0004\bG\u0010FJ\u0017\u0010I\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020HH&¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020HH&¢\u0006\u0004\bK\u0010JJ\u0017\u0010N\u001a\u00020\u00022\u0006\u0010M\u001a\u00020LH&¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u000fH&¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u000fH&¢\u0006\u0004\bR\u0010QJ\u000f\u0010S\u001a\u00020\u0007H&¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0002H\u0016¢\u0006\u0004\bU\u0010\u0004J\u000f\u0010V\u001a\u00020\u0002H\u0016¢\u0006\u0004\bV\u0010\u0004J\u000f\u0010W\u001a\u00020\u0002H\u0016¢\u0006\u0004\bW\u0010\u0004J\u000f\u0010X\u001a\u00020\u0002H\u0016¢\u0006\u0004\bX\u0010\u0004J\u000f\u0010Y\u001a\u00020\u0002H\u0016¢\u0006\u0004\bY\u0010\u0004R\u0014\u0010]\u001a\u00020Z8&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010_R\u0014\u0010d\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010TR\u001c\u0010h\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\be\u0010T\"\u0004\bf\u0010gR\u001c\u0010k\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\bi\u0010T\"\u0004\bj\u0010gR\u001c\u0010l\u001a\u00020\u000f8&@&X¦\u000e¢\u0006\f\u001a\u0004\bl\u0010Q\"\u0004\bm\u0010nR\u0014\u0010r\u001a\u00020o8&X¦\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010t\u001a\u00020o8&X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010qR\u001e\u0010z\u001a\u0004\u0018\u00010u8&@&X¦\u000e¢\u0006\f\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u001f\u0010\u0080\u0001\u001a\u0004\u0018\u00010{8&@&X¦\u000e¢\u0006\f\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u0016\u0010\u0082\u0001\u001a\u00020\u00078&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010TR\u001f\u0010\u0085\u0001\u001a\u00020\u00078&@&X¦\u000e¢\u0006\u000e\u001a\u0005\b\u0083\u0001\u0010T\"\u0005\b\u0084\u0001\u0010gR\u001f\u0010\u0088\u0001\u001a\u00020\u000f8&@&X¦\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u0010Q\"\u0005\b\u0087\u0001\u0010nR\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001f\u0010\u008d\u0001\u001a\u00020\u000f8&@&X¦\u000e¢\u0006\u000e\u001a\u0005\b\u008d\u0001\u0010Q\"\u0005\b\u008e\u0001\u0010n¨\u0006\u0090\u0001À\u0006\u0003"}, d2 = {"Lcom/baidu/carlife/sdk/CarLifeContext;", "Lcom/baidu/carlife/sdk/internal/transport/TransportListener;", "Lt8/z;", "terminate", "()V", "", "", "", "features", "setFeatures", "(Ljava/util/Map;)V", "key", "feature", "setFeature", "(Ljava/lang/String;I)V", "", "isLocal", "(Ljava/lang/String;IZ)V", "defaultConfig", "getFeature", "(Ljava/lang/String;I)I", "", "Lcom/baidu/carlife/protobuf/CarlifeFeatureConfigProto$CarlifeFeatureConfig;", "listFeatures", "()Ljava/util/List;", "Lcom/baidu/carlife/sdk/FeatureConfigChangeListener;", "listener", "addFeatureConfigChangeListener", "(Lcom/baidu/carlife/sdk/FeatureConfigChangeListener;)V", "removeFeatureConfigChangeListener", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "postMessage", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "sendMessage", "channel", "serviceType", "(II)V", "", "config", "setConfig", "(Ljava/lang/String;Ljava/lang/Object;)V", "removeConfig", "(Ljava/lang/String;)V", "T", "getConfig", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/String;)Ljava/lang/Object;", "encrypt", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "decrypt", "Lkotlin/Function0;", "runnable", "post", "(Lh9/a;)V", "Ljava/lang/Runnable;", "(Ljava/lang/Runnable;)V", "", "delayed", "postDelayed", "(JLh9/a;)V", "(Ljava/lang/Runnable;J)V", "Landroid/os/Handler;", "main", "()Landroid/os/Handler;", "Ljava/util/concurrent/ExecutorService;", "io", "()Ljava/util/concurrent/ExecutorService;", "compute", "registerTransportListener", "(Lcom/baidu/carlife/sdk/internal/transport/TransportListener;)V", "unregisterTransportListener", "Lcom/baidu/carlife/sdk/ConnectionChangeListener;", "registerConnectionChangeListener", "(Lcom/baidu/carlife/sdk/ConnectionChangeListener;)V", "unregisterConnectionChangeListener", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "isConnected", "()Z", "isAttached", "getConnectType", "()I", "onConnectionAttached", "onConnectionDetached", "onConnectionEstablished", "onConnectionVersionNotSupprt", "onConnectionAuthenFailed", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "applicationContext", "getOsType", "()Ljava/lang/String;", "osType", "getVersionName", "versionName", "getVersionCode", "versionCode", "getProtocolVersion", "setProtocolVersion", "(I)V", "protocolVersion", "getCarlifeVersion", "setCarlifeVersion", "carlifeVersion", "isVersionSupport", "setVersionSupport", "(Z)V", "Ljava/io/File;", "getDataDir", "()Ljava/io/File;", "dataDir", "getCacheDir", "cacheDir", "Lcom/baidu/carlife/protobuf/CarlifeDeviceInfoProto$CarlifeDeviceInfo;", "getDeviceInfo", "()Lcom/baidu/carlife/protobuf/CarlifeDeviceInfoProto$CarlifeDeviceInfo;", "setDeviceInfo", "(Lcom/baidu/carlife/protobuf/CarlifeDeviceInfoProto$CarlifeDeviceInfo;)V", "deviceInfo", "Lcom/baidu/carlife/protobuf/CarlifeStatisticsInfoProto$CarlifeStatisticsInfo;", "getStatisticsInfo", "()Lcom/baidu/carlife/protobuf/CarlifeStatisticsInfoProto$CarlifeStatisticsInfo;", "setStatisticsInfo", "(Lcom/baidu/carlife/protobuf/CarlifeStatisticsInfoProto$CarlifeStatisticsInfo;)V", "statisticsInfo", "getConnectionState", "connectionState", "getConnectionType", "setConnectionType", "connectionType", "getAuthResult", "setAuthResult", "authResult", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences", "isEncryptionEnabled", "setEncryptionEnabled", "Companion", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public interface CarLifeContext extends TransportListener {
    public static final int CONNECTION_ATTACHED = 1;
    public static final int CONNECTION_DETACHED = 0;
    public static final int CONNECTION_ESTABLISHED = 3;
    public static final int CONNECTION_REATTACH = 2;
    public static final int CONNECTION_TYPE_AOA = 2;
    public static final int CONNECTION_TYPE_HOTSPOT = 5;
    public static final int CONNECTION_TYPE_WIFIDIRECT = 9;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.CarLifeContext$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    public abstract /* synthetic */ class CC {
        static {
            Companion companion = CarLifeContext.INSTANCE;
        }

        public static Object a(CarLifeContext carLifeContext, String str) {
            l.e(str, "key");
            return carLifeContext.getConfig(str, null);
        }

        public static void b(CarLifeContext carLifeContext) {
            carLifeContext.onConnectionAttached(carLifeContext);
        }

        public static void c(CarLifeContext carLifeContext) {
            carLifeContext.onConnectionAuthenFailed(carLifeContext);
        }

        public static void d(CarLifeContext carLifeContext) {
            carLifeContext.onConnectionDetached(carLifeContext);
        }

        public static void e(CarLifeContext carLifeContext) {
            carLifeContext.onConnectionEstablished(carLifeContext);
        }

        public static void f(CarLifeContext carLifeContext) {
            carLifeContext.onConnectionVersionNotSupprt(carLifeContext);
        }

        public static void g(CarLifeContext carLifeContext, Runnable runnable) {
            l.e(runnable, "runnable");
            carLifeContext.post(new AnonymousClass1(runnable));
        }

        public static void h(CarLifeContext carLifeContext, Runnable runnable, long j5) {
            l.e(runnable, "runnable");
            carLifeContext.postDelayed(j5, new C00001(runnable));
        }

        public static void i(CarLifeContext carLifeContext, int i7, int i10) {
            carLifeContext.postMessage(CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, i7, Integer.valueOf(i10), 0, 4, null));
        }

        public static void j(CarLifeContext carLifeContext, int i7, int i10) {
            carLifeContext.sendMessage(CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, i7, Integer.valueOf(i10), 0, 4, null));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/baidu/carlife/sdk/CarLifeContext$Companion;", "", "()V", "CONNECTION_ATTACHED", "", "CONNECTION_DETACHED", "CONNECTION_ESTABLISHED", "CONNECTION_REATTACH", "CONNECTION_TYPE_AOA", "CONNECTION_TYPE_HOTSPOT", "CONNECTION_TYPE_WIFIDIRECT", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int CONNECTION_ATTACHED = 1;
        public static final int CONNECTION_DETACHED = 0;
        public static final int CONNECTION_ESTABLISHED = 3;
        public static final int CONNECTION_REATTACH = 2;
        public static final int CONNECTION_TYPE_AOA = 2;
        public static final int CONNECTION_TYPE_HOTSPOT = 5;
        public static final int CONNECTION_TYPE_WIFIDIRECT = 9;

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class DefaultImpls {
        @Deprecated
        public static <T> T getConfig(CarLifeContext carLifeContext, String str) {
            l.e(str, "key");
            return (T) CC.a(carLifeContext, str);
        }

        @Deprecated
        public static void onConnectionAttached(CarLifeContext carLifeContext) {
            CC.b(carLifeContext);
        }

        @Deprecated
        public static void onConnectionAttached(CarLifeContext carLifeContext, CarLifeContext carLifeContext2) {
            l.e(carLifeContext2, "context");
            a.a(carLifeContext, carLifeContext2);
        }

        @Deprecated
        public static void onConnectionAuthenFailed(CarLifeContext carLifeContext) {
            CC.c(carLifeContext);
        }

        @Deprecated
        public static void onConnectionAuthenFailed(CarLifeContext carLifeContext, CarLifeContext carLifeContext2) {
            l.e(carLifeContext2, "context");
            a.b(carLifeContext, carLifeContext2);
        }

        @Deprecated
        public static void onConnectionDetached(CarLifeContext carLifeContext) {
            CC.d(carLifeContext);
        }

        @Deprecated
        public static void onConnectionDetached(CarLifeContext carLifeContext, CarLifeContext carLifeContext2) {
            l.e(carLifeContext2, "context");
            a.c(carLifeContext, carLifeContext2);
        }

        @Deprecated
        public static void onConnectionEstablished(CarLifeContext carLifeContext) {
            CC.e(carLifeContext);
        }

        @Deprecated
        public static void onConnectionEstablished(CarLifeContext carLifeContext, CarLifeContext carLifeContext2) {
            l.e(carLifeContext2, "context");
            a.d(carLifeContext, carLifeContext2);
        }

        @Deprecated
        public static void onConnectionPrompt(CarLifeContext carLifeContext, String str) {
            l.e(str, "prompt");
            a.e(carLifeContext, str);
        }

        @Deprecated
        public static void onConnectionReattached(CarLifeContext carLifeContext, CarLifeContext carLifeContext2) {
            l.e(carLifeContext2, "context");
            a.f(carLifeContext, carLifeContext2);
        }

        @Deprecated
        public static void onConnectionVersionNotSupprt(CarLifeContext carLifeContext) {
            CC.f(carLifeContext);
        }

        @Deprecated
        public static void onConnectionVersionNotSupprt(CarLifeContext carLifeContext, CarLifeContext carLifeContext2) {
            l.e(carLifeContext2, "context");
            a.g(carLifeContext, carLifeContext2);
        }

        @Deprecated
        public static void onConnectionWait(CarLifeContext carLifeContext) {
            a.h(carLifeContext);
        }

        @Deprecated
        public static boolean onReceiveMessage(CarLifeContext carLifeContext, CarLifeContext carLifeContext2, CarLifeMessage carLifeMessage) {
            l.e(carLifeContext2, "context");
            l.e(carLifeMessage, "message");
            return b.a(carLifeContext, carLifeContext2, carLifeMessage);
        }

        @Deprecated
        public static boolean onSendMessage(CarLifeContext carLifeContext, CarLifeContext carLifeContext2, CarLifeMessage carLifeMessage) {
            l.e(carLifeContext2, "context");
            l.e(carLifeMessage, "message");
            return b.b(carLifeContext, carLifeContext2, carLifeMessage);
        }

        @Deprecated
        public static void post(CarLifeContext carLifeContext, Runnable runnable) {
            l.e(runnable, "runnable");
            CC.g(carLifeContext, runnable);
        }

        @Deprecated
        public static void postDelayed(CarLifeContext carLifeContext, Runnable runnable, long j5) {
            l.e(runnable, "runnable");
            CC.h(carLifeContext, runnable, j5);
        }

        @Deprecated
        public static void postMessage(CarLifeContext carLifeContext, int i7, int i10) {
            CC.i(carLifeContext, i7, i10);
        }

        @Deprecated
        public static void sendMessage(CarLifeContext carLifeContext, int i7, int i10) {
            CC.j(carLifeContext, i7, i10);
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.CarLifeContext$post$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt8/z;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass1 extends n implements h9.a {
        final /* synthetic */ Runnable $runnable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Runnable runnable) {
            super(0);
            this.$runnable = runnable;
        }

        @Override // h9.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m1invoke();
            return z.f12851a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m1invoke() {
            this.$runnable.run();
        }
    }

    /* JADX INFO: renamed from: com.baidu.carlife.sdk.CarLifeContext$postDelayed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt8/z;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class C00001 extends n implements h9.a {
        final /* synthetic */ Runnable $runnable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00001(Runnable runnable) {
            super(0);
            this.$runnable = runnable;
        }

        @Override // h9.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m2invoke();
            return z.f12851a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m2invoke() {
            this.$runnable.run();
        }
    }

    void addFeatureConfigChangeListener(FeatureConfigChangeListener listener);

    ExecutorService compute();

    CarLifeMessage decrypt(CarLifeMessage message);

    CarLifeMessage encrypt(CarLifeMessage message);

    /* JADX INFO: renamed from: getApplicationContext */
    Context getContext();

    boolean getAuthResult();

    File getCacheDir();

    int getCarlifeVersion();

    <T> T getConfig(String key);

    <T> T getConfig(String key, T defaultConfig);

    int getConnectType();

    int getConnectionState();

    int getConnectionType();

    File getDataDir();

    CarlifeDeviceInfoProto.CarlifeDeviceInfo getDeviceInfo();

    int getFeature(String key, int defaultConfig);

    String getOsType();

    int getProtocolVersion();

    SharedPreferences getSharedPreferences();

    CarlifeStatisticsInfoProto.CarlifeStatisticsInfo getStatisticsInfo();

    int getVersionCode();

    String getVersionName();

    ExecutorService io();

    boolean isAttached();

    boolean isConnected();

    /* JADX INFO: renamed from: isEncryptionEnabled */
    boolean getIsEncryptionEnabled();

    /* JADX INFO: renamed from: isVersionSupport */
    boolean getIsVersionSupport();

    List<CarlifeFeatureConfigProto.CarlifeFeatureConfig> listFeatures();

    /* JADX INFO: renamed from: main */
    Handler getHandler();

    void onConnectionAttached();

    void onConnectionAuthenFailed();

    void onConnectionDetached();

    void onConnectionEstablished();

    void onConnectionVersionNotSupprt();

    void onNewIntent(Intent intent);

    void post(h9.a runnable);

    void post(Runnable runnable);

    void postDelayed(long delayed, h9.a runnable);

    void postDelayed(Runnable runnable, long delayed);

    void postMessage(int channel, int serviceType);

    void postMessage(CarLifeMessage message);

    void registerConnectionChangeListener(ConnectionChangeListener listener);

    void registerTransportListener(TransportListener listener);

    void removeConfig(String key);

    void removeFeatureConfigChangeListener(FeatureConfigChangeListener listener);

    void sendMessage(int channel, int serviceType);

    void sendMessage(CarLifeMessage message);

    void setAuthResult(boolean z10);

    void setCarlifeVersion(int i7);

    void setConfig(String key, Object config);

    void setConnectionType(int i7);

    void setDeviceInfo(CarlifeDeviceInfoProto.CarlifeDeviceInfo carlifeDeviceInfo);

    void setEncryptionEnabled(boolean z10);

    void setFeature(String key, int feature);

    void setFeature(String key, int feature, boolean isLocal);

    void setFeatures(Map<String, Integer> features);

    void setProtocolVersion(int i7);

    void setStatisticsInfo(CarlifeStatisticsInfoProto.CarlifeStatisticsInfo carlifeStatisticsInfo);

    void setVersionSupport(boolean z10);

    void terminate();

    void unregisterConnectionChangeListener(ConnectionChangeListener listener);

    void unregisterTransportListener(TransportListener listener);
}

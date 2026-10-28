package com.baidu.carlife.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import com.baidu.carlife.protobuf.CarlifeDeviceInfoProto;
import com.baidu.carlife.protobuf.CarlifeFeatureConfigProto;
import com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Configs;
import com.baidu.carlife.sdk.ConnectionChangeListener;
import com.baidu.carlife.sdk.FeatureConfigChangeListener;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.TransportListener;
import com.baidu.carlife.sdk.util.DeviceUtilsKt;
import com.baidu.carlife.sdk.util.Logger;
import i9.g;
import i9.l;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import t8.h;
import u8.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\b'\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\fJ!\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010$J\u001d\u0010'\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b)\u0010*J#\u0010,\u001a\u00028\u0000\"\u0004\b\u0000\u0010+2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00122\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u001d\u00104\u001a\u00020\u00122\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001202H\u0016¢\u0006\u0004\b4\u00105J%\u00108\u001a\u00020\u00122\u0006\u00107\u001a\u0002062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001202H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020=H\u0016¢\u0006\u0004\b@\u0010?J\u0017\u0010B\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020AH\u0016¢\u0006\u0004\bD\u0010CJ\u0017\u0010F\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020EH\u0016¢\u0006\u0004\bH\u0010GJ\u001f\u0010K\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bM\u0010LJ\u0015\u0010N\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\bN\u0010OJ\u0015\u0010P\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\bP\u0010OJ\u0015\u0010Q\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\bQ\u0010OJ\u0015\u0010R\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\bR\u0010OJ\u0015\u0010S\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\bS\u0010OJ\u0015\u0010U\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\u0005¢\u0006\u0004\bU\u0010*J\r\u0010V\u001a\u00020\u0012¢\u0006\u0004\bV\u0010WR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010XR\"\u0010Y\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\u000f\"\u0004\b\\\u0010]R\"\u0010^\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b^\u0010Z\u001a\u0004\b_\u0010\u000f\"\u0004\b`\u0010]R\"\u0010a\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010\f\"\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR \u0010i\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR$\u0010l\u001a\u00020\r2\u0006\u0010k\u001a\u00020\r8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bl\u0010Z\"\u0004\bm\u0010]R\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020A0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020E0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\"\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010jR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020!0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010sR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010y\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010xR\u0017\u0010{\u001a\u00020z8\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u0018\u0010\u007f\u001a\u00020z8\u0006¢\u0006\r\n\u0004\b\u007f\u0010|\u001a\u0005\b\u0080\u0001\u0010~R,\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R&\u0010\u0088\u0001\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010Z\u001a\u0005\b\u0089\u0001\u0010\u000f\"\u0005\b\u008a\u0001\u0010]R&\u0010\u008b\u0001\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010Z\u001a\u0005\b\u008c\u0001\u0010\u000f\"\u0005\b\u008d\u0001\u0010]R&\u0010\u008e\u0001\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010b\u001a\u0005\b\u008e\u0001\u0010\f\"\u0005\b\u008f\u0001\u0010eR,\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R&\u0010\u0097\u0001\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010b\u001a\u0005\b\u0097\u0001\u0010\f\"\u0005\b\u0098\u0001\u0010eR!\u0010\u009e\u0001\u001a\u00030\u0099\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0017\u0010¡\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0017\u0010¤\u0001\u001a\u00020\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R\u0017\u0010¦\u0001\u001a\u00020\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010£\u0001R\u0016\u0010¨\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b§\u0001\u0010\u000f¨\u0006©\u0001"}, d2 = {"Lcom/baidu/carlife/sdk/internal/CarLifeContextImpl;", "Lcom/baidu/carlife/sdk/CarLifeContext;", "Landroid/content/Context;", "context", "", "", "", "configs", "<init>", "(Landroid/content/Context;Ljava/util/Map;)V", "", "isConnected", "()Z", "", "getConnectType", "()I", "isAttached", "features", "Lt8/z;", "setFeatures", "(Ljava/util/Map;)V", "key", "feature", "isLocal", "setFeature", "(Ljava/lang/String;IZ)V", "defaultConfig", "getFeature", "(Ljava/lang/String;I)I", "", "Lcom/baidu/carlife/protobuf/CarlifeFeatureConfigProto$CarlifeFeatureConfig;", "listFeatures", "()Ljava/util/List;", "Lcom/baidu/carlife/sdk/FeatureConfigChangeListener;", "listener", "addFeatureConfigChangeListener", "(Lcom/baidu/carlife/sdk/FeatureConfigChangeListener;)V", "removeFeatureConfigChangeListener", "config", "setConfig", "(Ljava/lang/String;Ljava/lang/Object;)V", "removeConfig", "(Ljava/lang/String;)V", "T", "getConfig", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Lkotlin/Function0;", "runnable", "post", "(Lh9/a;)V", "", "delayed", "postDelayed", "(JLh9/a;)V", "Landroid/os/Handler;", "main", "()Landroid/os/Handler;", "Ljava/util/concurrent/ExecutorService;", "io", "()Ljava/util/concurrent/ExecutorService;", "compute", "Lcom/baidu/carlife/sdk/internal/transport/TransportListener;", "registerTransportListener", "(Lcom/baidu/carlife/sdk/internal/transport/TransportListener;)V", "unregisterTransportListener", "Lcom/baidu/carlife/sdk/ConnectionChangeListener;", "registerConnectionChangeListener", "(Lcom/baidu/carlife/sdk/ConnectionChangeListener;)V", "unregisterConnectionChangeListener", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "onReceiveMessage", "(Lcom/baidu/carlife/sdk/CarLifeContext;Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)Z", "onSendMessage", "onConnectionAttached", "(Lcom/baidu/carlife/sdk/CarLifeContext;)V", "onConnectionDetached", "onConnectionEstablished", "onConnectionVersionNotSupprt", "onConnectionAuthenFailed", "prompt", "onConnectionPrompt", "onConnectionWait", "()V", "Landroid/content/Context;", "connectionState", "I", "getConnectionState", "setConnectionState", "(I)V", "connectionType", "getConnectionType", "setConnectionType", "authResult", "Z", "getAuthResult", "setAuthResult", "(Z)V", "handler", "Landroid/os/Handler;", "", "configurationMap", "Ljava/util/Map;", "value", "monitorListeners", "setMonitorListeners", "Ljava/util/concurrent/LinkedBlockingQueue;", "transportListeners", "Ljava/util/concurrent/LinkedBlockingQueue;", "", "connectionChangeListeners", "Ljava/util/Set;", "featureMap", "featureConfigChangeListeners", "Ljava/util/concurrent/ThreadPoolExecutor;", "executorCompute", "Ljava/util/concurrent/ThreadPoolExecutor;", "executorIO", "Ljava/io/File;", "dataDir", "Ljava/io/File;", "getDataDir", "()Ljava/io/File;", "cacheDir", "getCacheDir", "Lcom/baidu/carlife/protobuf/CarlifeDeviceInfoProto$CarlifeDeviceInfo;", "deviceInfo", "Lcom/baidu/carlife/protobuf/CarlifeDeviceInfoProto$CarlifeDeviceInfo;", "getDeviceInfo", "()Lcom/baidu/carlife/protobuf/CarlifeDeviceInfoProto$CarlifeDeviceInfo;", "setDeviceInfo", "(Lcom/baidu/carlife/protobuf/CarlifeDeviceInfoProto$CarlifeDeviceInfo;)V", "protocolVersion", "getProtocolVersion", "setProtocolVersion", "carlifeVersion", "getCarlifeVersion", "setCarlifeVersion", "isVersionSupport", "setVersionSupport", "Lcom/baidu/carlife/protobuf/CarlifeStatisticsInfoProto$CarlifeStatisticsInfo;", "statisticsInfo", "Lcom/baidu/carlife/protobuf/CarlifeStatisticsInfoProto$CarlifeStatisticsInfo;", "getStatisticsInfo", "()Lcom/baidu/carlife/protobuf/CarlifeStatisticsInfoProto$CarlifeStatisticsInfo;", "setStatisticsInfo", "(Lcom/baidu/carlife/protobuf/CarlifeStatisticsInfoProto$CarlifeStatisticsInfo;)V", "isEncryptionEnabled", "setEncryptionEnabled", "Landroid/content/SharedPreferences;", "sharedPreferences$delegate", "Lt8/h;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences", "getApplicationContext", "()Landroid/content/Context;", "applicationContext", "getOsType", "()Ljava/lang/String;", "osType", "getVersionName", "versionName", "getVersionCode", "versionCode", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public abstract class CarLifeContextImpl implements CarLifeContext {
    private boolean authResult;
    private final File cacheDir;
    private int carlifeVersion;
    private final Map<String, Object> configurationMap;
    private final Set<ConnectionChangeListener> connectionChangeListeners;
    private volatile int connectionState;
    private int connectionType;
    private final Context context;
    private final File dataDir;
    private CarlifeDeviceInfoProto.CarlifeDeviceInfo deviceInfo;
    private final ThreadPoolExecutor executorCompute;
    private final ThreadPoolExecutor executorIO;
    private final Set<FeatureConfigChangeListener> featureConfigChangeListeners;
    private Map<String, Integer> featureMap;
    private final Handler handler;
    private boolean isEncryptionEnabled;
    private boolean isVersionSupport;
    private int monitorListeners;
    private int protocolVersion;

    /* JADX INFO: renamed from: sharedPreferences$delegate, reason: from kotlin metadata */
    private final h sharedPreferences;
    private CarlifeStatisticsInfoProto.CarlifeStatisticsInfo statisticsInfo;
    private final LinkedBlockingQueue<TransportListener> transportListeners;

    public CarLifeContextImpl(Context context, Map<String, ? extends Object> map) {
        l.e(context, "context");
        l.e(map, "configs");
        this.context = context;
        this.connectionType = 2;
        this.handler = new Handler(context.getMainLooper());
        this.configurationMap = new HashMap(map);
        this.transportListeners = new LinkedBlockingQueue<>();
        this.connectionChangeListeners = new LinkedHashSet();
        this.featureMap = new LinkedHashMap();
        this.featureConfigChangeListeners = new LinkedHashSet();
        int availableProcessors = DeviceUtilsKt.getAvailableProcessors();
        int availableProcessors2 = DeviceUtilsKt.getAvailableProcessors();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors2, 60L, timeUnit, new LinkedBlockingDeque(50));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.executorCompute = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(DeviceUtilsKt.getAvailableProcessors() * 2, DeviceUtilsKt.getAvailableProcessors() * 2, 60L, timeUnit, new LinkedBlockingDeque(50));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        this.executorIO = threadPoolExecutor2;
        if (!l.a(Environment.getExternalStorageState(), "mounted") || Build.VERSION.SDK_INT <= 21) {
            File filesDir = context.getFilesDir();
            l.d(filesDir, "context.filesDir");
            this.dataDir = filesDir;
            File cacheDir = context.getCacheDir();
            l.d(cacheDir, "context.cacheDir");
            this.cacheDir = cacheDir;
        } else {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                externalFilesDir = context.getFilesDir();
                l.d(externalFilesDir, "context.filesDir");
            }
            this.dataDir = externalFilesDir;
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir == null) {
                externalCacheDir = context.getCacheDir();
                l.d(externalCacheDir, "context.cacheDir");
            }
            this.cacheDir = externalCacheDir;
        }
        Logger logger = new Logger(new File(this.dataDir, "log"));
        logger.setLevel(((Number) getConfig(Configs.CONFIG_LOG_LEVEL, 5)).intValue());
        logger.setMaxFileSize(((Number) getConfig(Configs.CONFIG_MAX_LOG_FILE_SIZE, Long.valueOf(Logger.DEFAULT_MAX_FILE_SIZE))).longValue());
        logger.setMaxFileCount(((Number) getConfig(Configs.CONFIG_MAX_LOG_FILE_COUNT, 20)).intValue());
        Logger.INSTANCE.setDefault(logger);
        this.isVersionSupport = true;
        this.sharedPreferences = t8.a.d(new CarLifeContextImpl$sharedPreferences$2(this));
    }

    public /* synthetic */ CarLifeContextImpl(Context context, Map map, int i7, g gVar) {
        this(context, (i7 & 2) != 0 ? x.f13123a : map);
    }

    private final void setMonitorListeners(int i7) {
        this.monitorListeners = i7;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public synchronized void addFeatureConfigChangeListener(FeatureConfigChangeListener listener) {
        l.e(listener, "listener");
        this.featureConfigChangeListeners.add(listener);
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public ExecutorService compute() {
        return this.executorCompute;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    /* JADX INFO: renamed from: getApplicationContext, reason: from getter */
    public Context getContext() {
        return this.context;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public boolean getAuthResult() {
        return this.authResult;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public final File getCacheDir() {
        return this.cacheDir;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public int getCarlifeVersion() {
        return this.carlifeVersion;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public final /* synthetic */ Object getConfig(String str) {
        return CarLifeContext.CC.a(this, str);
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public final <T> T getConfig(String key, T defaultConfig) {
        l.e(key, "key");
        T t2 = (T) this.configurationMap.get(key);
        return t2 != null ? t2 : defaultConfig;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public int getConnectType() {
        return getConnectionType();
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public int getConnectionState() {
        return this.connectionState;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public int getConnectionType() {
        return this.connectionType;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public final File getDataDir() {
        return this.dataDir;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public CarlifeDeviceInfoProto.CarlifeDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public final int getFeature(String key, int defaultConfig) {
        l.e(key, "key");
        Integer num = this.featureMap.get(key);
        return num != null ? num.intValue() : defaultConfig;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public String getOsType() {
        return "Android";
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public int getProtocolVersion() {
        return this.protocolVersion;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public SharedPreferences getSharedPreferences() {
        Object value = this.sharedPreferences.getValue();
        l.d(value, "<get-sharedPreferences>(...)");
        return (SharedPreferences) value;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public CarlifeStatisticsInfoProto.CarlifeStatisticsInfo getStatisticsInfo() {
        return this.statisticsInfo;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public int getVersionCode() {
        return this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionCode;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public String getVersionName() {
        return String.valueOf(this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName);
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public ExecutorService io() {
        return this.executorIO;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public boolean isAttached() {
        return getConnectionState() != 0;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public boolean isConnected() {
        return getConnectionState() == 3;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    /* JADX INFO: renamed from: isEncryptionEnabled, reason: from getter */
    public boolean getIsEncryptionEnabled() {
        return this.isEncryptionEnabled;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    /* JADX INFO: renamed from: isVersionSupport, reason: from getter */
    public boolean getIsVersionSupport() {
        return this.isVersionSupport;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public List<CarlifeFeatureConfigProto.CarlifeFeatureConfig> listFeatures() {
        Map<String, Integer> map = this.featureMap;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            arrayList.add((CarlifeFeatureConfigProto.CarlifeFeatureConfig) CarlifeFeatureConfigProto.CarlifeFeatureConfig.newBuilder().setKey(entry.getKey()).setValue(entry.getValue().intValue()).m16build());
        }
        return arrayList;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    /* JADX INFO: renamed from: main, reason: from getter */
    public Handler getHandler() {
        return this.handler;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public final /* synthetic */ void onConnectionAttached() {
        CarLifeContext.CC.b(this);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final synchronized void onConnectionAttached(CarLifeContext context) {
        try {
            l.e(context, "context");
            if (getConnectionState() == 0) {
                setConnectionState(1);
                Iterator<T> it = this.connectionChangeListeners.iterator();
                while (it.hasNext()) {
                    ((ConnectionChangeListener) it.next()).onConnectionAttached(this);
                }
            } else if (getConnectionState() != 2) {
                setConnectionState(2);
                Iterator<T> it2 = this.connectionChangeListeners.iterator();
                while (it2.hasNext()) {
                    ((ConnectionChangeListener) it2.next()).onConnectionReattached(this);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public final /* synthetic */ void onConnectionAuthenFailed() {
        CarLifeContext.CC.c(this);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final synchronized void onConnectionAuthenFailed(CarLifeContext context) {
        l.e(context, "context");
        Iterator<T> it = this.connectionChangeListeners.iterator();
        while (it.hasNext()) {
            ((ConnectionChangeListener) it.next()).onConnectionAuthenFailed(this);
        }
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public /* synthetic */ void onConnectionDetached() {
        CarLifeContext.CC.d(this);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final synchronized void onConnectionDetached(CarLifeContext context) {
        l.e(context, "context");
        if (getConnectionState() != 0) {
            setConnectionState(0);
            Iterator<T> it = this.connectionChangeListeners.iterator();
            while (it.hasNext()) {
                ((ConnectionChangeListener) it.next()).onConnectionDetached(this);
            }
        }
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public final /* synthetic */ void onConnectionEstablished() {
        CarLifeContext.CC.e(this);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final synchronized void onConnectionEstablished(CarLifeContext context) {
        l.e(context, "context");
        if (getConnectionState() != 3) {
            setConnectionState(3);
            Iterator<T> it = this.connectionChangeListeners.iterator();
            while (it.hasNext()) {
                ((ConnectionChangeListener) it.next()).onConnectionEstablished(this);
            }
        }
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final synchronized void onConnectionPrompt(String prompt) {
        l.e(prompt, "prompt");
        Iterator<T> it = this.connectionChangeListeners.iterator();
        while (it.hasNext()) {
            ((ConnectionChangeListener) it.next()).onConnectionPrompt(prompt);
        }
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public /* synthetic */ void onConnectionReattached(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.f(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public final /* synthetic */ void onConnectionVersionNotSupprt() {
        CarLifeContext.CC.f(this);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final synchronized void onConnectionVersionNotSupprt(CarLifeContext context) {
        l.e(context, "context");
        Iterator<T> it = this.connectionChangeListeners.iterator();
        while (it.hasNext()) {
            ((ConnectionChangeListener) it.next()).onConnectionVersionNotSupprt(this);
        }
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final synchronized void onConnectionWait() {
        Iterator<T> it = this.connectionChangeListeners.iterator();
        while (it.hasNext()) {
            ((ConnectionChangeListener) it.next()).onConnectionWait();
        }
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public void onNewIntent(Intent intent) {
        l.e(intent, "intent");
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public synchronized boolean onReceiveMessage(CarLifeContext context, CarLifeMessage message) {
        l.e(context, "context");
        l.e(message, "message");
        Iterator<T> it = this.transportListeners.iterator();
        while (it.hasNext()) {
            if (((TransportListener) it.next()).onReceiveMessage(context, message)) {
                return true;
            }
        }
        return true;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public synchronized boolean onSendMessage(CarLifeContext context, CarLifeMessage message) {
        l.e(context, "context");
        l.e(message, "message");
        Iterator<T> it = this.transportListeners.iterator();
        while (it.hasNext()) {
            if (((TransportListener) it.next()).onSendMessage(context, message)) {
                return true;
            }
        }
        return true;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public void post(h9.a runnable) {
        l.e(runnable, "runnable");
        this.handler.post(new a(runnable, 0));
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public final /* synthetic */ void post(Runnable runnable) {
        CarLifeContext.CC.g(this, runnable);
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public void postDelayed(long delayed, h9.a runnable) {
        l.e(runnable, "runnable");
        this.handler.postDelayed(new a(runnable, 1), delayed);
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public final /* synthetic */ void postDelayed(Runnable runnable, long j5) {
        CarLifeContext.CC.h(this, runnable, j5);
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public final /* synthetic */ void postMessage(int i7, int i10) {
        CarLifeContext.CC.i(this, i7, i10);
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public void registerConnectionChangeListener(ConnectionChangeListener listener) {
        l.e(listener, "listener");
        if (this.connectionChangeListeners.contains(listener)) {
            return;
        }
        setMonitorListeners(this.monitorListeners + 1);
        if (getConnectionState() != 0) {
            int connectionState = getConnectionState();
            if (connectionState == 1) {
                listener.onConnectionAttached(this);
            } else if (connectionState == 3) {
                listener.onConnectionEstablished(this);
            }
        }
        this.connectionChangeListeners.add(listener);
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public void registerTransportListener(TransportListener listener) {
        l.e(listener, "listener");
        setMonitorListeners(this.monitorListeners + 1);
        this.transportListeners.add(listener);
        registerConnectionChangeListener(listener);
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public final void removeConfig(String key) {
        l.e(key, "key");
        this.configurationMap.remove(key);
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public synchronized void removeFeatureConfigChangeListener(FeatureConfigChangeListener listener) {
        l.e(listener, "listener");
        this.featureConfigChangeListeners.remove(listener);
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public final /* synthetic */ void sendMessage(int i7, int i10) {
        CarLifeContext.CC.j(this, i7, i10);
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public void setAuthResult(boolean z10) {
        this.authResult = z10;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public void setCarlifeVersion(int i7) {
        this.carlifeVersion = i7;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public final void setConfig(String key, Object config) {
        l.e(key, "key");
        l.e(config, "config");
        this.configurationMap.put(key, config);
    }

    public void setConnectionState(int i7) {
        this.connectionState = i7;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public void setConnectionType(int i7) {
        this.connectionType = i7;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public void setDeviceInfo(CarlifeDeviceInfoProto.CarlifeDeviceInfo carlifeDeviceInfo) {
        this.deviceInfo = carlifeDeviceInfo;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public void setEncryptionEnabled(boolean z10) {
        this.isEncryptionEnabled = z10;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public synchronized void setFeature(String key, int feature, boolean isLocal) {
        l.e(key, "key");
        this.featureMap.put(key, Integer.valueOf(feature));
        Iterator<T> it = this.featureConfigChangeListeners.iterator();
        while (it.hasNext()) {
            ((FeatureConfigChangeListener) it.next()).onFeatureConfigChanged();
        }
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public final synchronized void setFeatures(Map<String, Integer> features) {
        l.e(features, "features");
        this.featureMap = new HashMap(features);
        Iterator<T> it = this.featureConfigChangeListeners.iterator();
        while (it.hasNext()) {
            ((FeatureConfigChangeListener) it.next()).onFeatureConfigChanged();
        }
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public void setProtocolVersion(int i7) {
        this.protocolVersion = i7;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public void setStatisticsInfo(CarlifeStatisticsInfoProto.CarlifeStatisticsInfo carlifeStatisticsInfo) {
        this.statisticsInfo = carlifeStatisticsInfo;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public void setVersionSupport(boolean z10) {
        this.isVersionSupport = z10;
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public synchronized void unregisterConnectionChangeListener(ConnectionChangeListener listener) {
        l.e(listener, "listener");
        if (this.connectionChangeListeners.remove(listener)) {
            setMonitorListeners(this.monitorListeners - 1);
        }
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public synchronized void unregisterTransportListener(TransportListener listener) {
        l.e(listener, "listener");
        setMonitorListeners(this.monitorListeners - 1);
        this.transportListeners.remove(listener);
        unregisterConnectionChangeListener(listener);
    }
}

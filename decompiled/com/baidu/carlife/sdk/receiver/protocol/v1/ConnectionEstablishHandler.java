package com.baidu.carlife.sdk.receiver.protocol.v1;

import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.baidu.carlife.protobuf.CarlifeAuthenRequestProto;
import com.baidu.carlife.protobuf.CarlifeAuthenResponseProto;
import com.baidu.carlife.protobuf.CarlifeAuthenResultProto;
import com.baidu.carlife.protobuf.CarlifeDeviceInfoProto;
import com.baidu.carlife.protobuf.CarlifeProtocolVersionMatchStatusProto;
import com.baidu.carlife.protobuf.CarlifeProtocolVersionProto;
import com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Configs;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.TransportListener;
import com.baidu.carlife.sdk.internal.transport.b;
import com.baidu.carlife.sdk.receiver.protocol.v1.ConnectionEstablishHandler;
import com.baidu.carlife.sdk.util.DatesKt;
import com.baidu.carlife.sdk.util.Logger;
import com.baidu.carlife.sdk.util.TimerUtils;
import com.google.protobuf.l1;
import i9.l;
import java.util.Date;
import kotlin.Metadata;
import ob.a;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\f\u0010\u0005J\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0005J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#¨\u0006%"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/protocol/v1/ConnectionEstablishHandler;", "Lcom/baidu/carlife/sdk/internal/transport/TransportListener;", "Lcom/baidu/carlife/sdk/CarLifeContext;", "context", "<init>", "(Lcom/baidu/carlife/sdk/CarLifeContext;)V", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "Lt8/z;", "handleProtocolVersionMatch", "(Lcom/baidu/carlife/sdk/CarLifeContext;Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "handleMDInfo", "sendHuInfo", "sendAuthRequest", "handleAuthResponse", "handleAuthResult", "", "onReceiveMessage", "(Lcom/baidu/carlife/sdk/CarLifeContext;Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)Z", "onConnectionAttached", "onConnectionReattached", "onConnectionEstablished", "onConnectionDetached", "Lcom/baidu/carlife/sdk/CarLifeContext;", "", "currentProgress", "I", "", "connectTime", "Ljava/lang/String;", "", "lastReceiveMessageTime", "J", "Ljava/lang/Runnable;", "heartBeatTask", "Ljava/lang/Runnable;", "mAuthenticationTimeTask", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class ConnectionEstablishHandler implements TransportListener {
    private String connectTime;
    private final CarLifeContext context;
    private int currentProgress;
    private final Runnable heartBeatTask;
    private volatile long lastReceiveMessageTime;
    private final Runnable mAuthenticationTimeTask;

    public ConnectionEstablishHandler(CarLifeContext carLifeContext) {
        l.e(carLifeContext, "context");
        this.context = carLifeContext;
        this.connectTime = "";
        final int i7 = 0;
        this.heartBeatTask = new Runnable(this) { // from class: i5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectionEstablishHandler f6651b;

            {
                this.f6651b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        ConnectionEstablishHandler.heartBeatTask$lambda$0(this.f6651b);
                        break;
                    default:
                        ConnectionEstablishHandler.mAuthenticationTimeTask$lambda$1(this.f6651b);
                        break;
                }
            }
        };
        final int i10 = 1;
        this.mAuthenticationTimeTask = new Runnable(this) { // from class: i5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectionEstablishHandler f6651b;

            {
                this.f6651b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        ConnectionEstablishHandler.heartBeatTask$lambda$0(this.f6651b);
                        break;
                    default:
                        ConnectionEstablishHandler.mAuthenticationTimeTask$lambda$1(this.f6651b);
                        break;
                }
            }
        };
    }

    private final void handleAuthResponse(CarLifeContext context, CarLifeMessage message) {
        String str;
        Logger.Companion companion = Logger.INSTANCE;
        companion.d(Constants.TAG, "AuthenticationStep2 获取移动端校验码");
        TimerUtils.INSTANCE.stop(this.mAuthenticationTimeTask);
        CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, 1, Integer.valueOf(ServiceTypes.MSG_CMD_HU_AUTH_RESULT), 0, 4, null);
        l1 protoPayload = message.getProtoPayload();
        CarlifeAuthenResponseProto.CarlifeAuthenResponse carlifeAuthenResponse = protoPayload instanceof CarlifeAuthenResponseProto.CarlifeAuthenResponse ? (CarlifeAuthenResponseProto.CarlifeAuthenResponse) protoPayload : null;
        if (carlifeAuthenResponse == null || TextUtils.isEmpty(carlifeAuthenResponse.getEncryptValue())) {
            return;
        }
        companion.d(Constants.TAG, "AuthenticationStep2.1 authenticationInfo = " + carlifeAuthenResponse.getEncryptValue());
        CarlifeDeviceInfoProto.CarlifeDeviceInfo deviceInfo = context.getDeviceInfo();
        if (deviceInfo != null) {
            str = deviceInfo.getBrand() + deviceInfo.getModel() + deviceInfo.getSdk() + this.connectTime;
        } else {
            str = "";
        }
        companion.d(Constants.TAG, a.q("AuthenticationStep2.2 mdInfoAuthen = ", str));
        companion.d(Constants.TAG, "AuthenticationStep2.3 encryptionInfo = false");
    }

    private final void handleAuthResult(CarLifeContext context, CarLifeMessage message) {
        context.postMessage(1, ServiceTypes.MSG_CMD_MD_AUTH_RESULT_RESPONSE);
        l1 protoPayload = message.getProtoPayload();
        CarlifeAuthenResultProto.CarlifeAuthenResult carlifeAuthenResult = protoPayload instanceof CarlifeAuthenResultProto.CarlifeAuthenResult ? (CarlifeAuthenResultProto.CarlifeAuthenResult) protoPayload : null;
        if (carlifeAuthenResult == null || !carlifeAuthenResult.getAuthenResult()) {
            context.onConnectionAuthenFailed();
        } else {
            context.onConnectionEstablished();
        }
    }

    private final void handleMDInfo(CarLifeContext context, CarLifeMessage message) {
        l1 protoPayload = message.getProtoPayload();
        context.setDeviceInfo(protoPayload instanceof CarlifeDeviceInfoProto.CarlifeDeviceInfo ? (CarlifeDeviceInfoProto.CarlifeDeviceInfo) protoPayload : null);
        sendHuInfo(context);
        sendAuthRequest(context);
    }

    private final void handleProtocolVersionMatch(CarLifeContext context, CarLifeMessage message) {
        l1 protoPayload = message.getProtoPayload();
        CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus carlifeProtocolVersionMatchStatus = protoPayload instanceof CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus ? (CarlifeProtocolVersionMatchStatusProto.CarlifeProtocolVersionMatchStatus) protoPayload : null;
        CarlifeStatisticsInfoProto.CarlifeStatisticsInfo statisticsInfo = context.getStatisticsInfo();
        if (carlifeProtocolVersionMatchStatus != null) {
            context.setCarlifeVersion(carlifeProtocolVersionMatchStatus.getCarlifeProtocolVersion());
        }
        if (carlifeProtocolVersionMatchStatus == null || carlifeProtocolVersionMatchStatus.getMatchStatus() != 1 || statisticsInfo == null) {
            context.setVersionSupport(false);
            context.onConnectionVersionNotSupprt();
        } else {
            CarLifeMessage carLifeMessageObtain$default = CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, 1, Integer.valueOf(ServiceTypes.MSG_CMD_STATISTIC_INFO), 0, 4, null);
            carLifeMessageObtain$default.payload(statisticsInfo);
            context.postMessage(carLifeMessageObtain$default);
            TimerUtils.INSTANCE.schedule(this.heartBeatTask, 10L, 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void heartBeatTask$lambda$0(ConnectionEstablishHandler connectionEstablishHandler) {
        if (System.currentTimeMillis() - connectionEstablishHandler.lastReceiveMessageTime > ((Number) connectionEstablishHandler.context.getConfig(Configs.CONFIG_CONNECT_TIMEOUT, 10)).intValue() * 1000) {
            Logger.INSTANCE.e(Constants.TAG, "ConnectionEstablishHandler heartbeat timeout");
            connectionEstablishHandler.context.terminate();
            return;
        }
        Logger.INSTANCE.v(Constants.TAG, "ConnectionEstablishHandler message delay " + (System.currentTimeMillis() - connectionEstablishHandler.lastReceiveMessageTime));
        connectionEstablishHandler.context.postMessage(2, ServiceTypes.MSG_VIDEO_HEARTBEAT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mAuthenticationTimeTask$lambda$1(ConnectionEstablishHandler connectionEstablishHandler) {
        Logger.INSTANCE.w(Constants.TAG, "Carlife Connect authentication failed.");
        connectionEstablishHandler.context.terminate();
    }

    private final void sendAuthRequest(CarLifeContext context) {
        Logger.Companion companion = Logger.INSTANCE;
        companion.d(Constants.TAG, "AuthenticationStep1 获取MD信息，开启鉴权");
        CarLifeMessage carLifeMessageObtain$default = CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, 1, Integer.valueOf(ServiceTypes.MSG_CMD_HU_AUTH_REQUEST), 0, 4, null);
        this.connectTime = String.valueOf(DatesKt.getDateFormat(new Date(), System.currentTimeMillis(), DatesKt.TIME_FORMAT_FOR_HMS));
        String str = "2.0;" + this.connectTime;
        companion.d(Constants.TAG, a.q("AuthenticationStep1.1 randomValue = ", str));
        carLifeMessageObtain$default.payload(CarlifeAuthenRequestProto.CarlifeAuthenRequest.newBuilder().setRandomValue(str).m16build());
        context.postMessage(carLifeMessageObtain$default);
        TimerUtils.INSTANCE.schedule(this.mAuthenticationTimeTask, 30000L);
    }

    private final void sendHuInfo(CarLifeContext context) {
        CarLifeMessage carLifeMessageObtain$default = CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, 1, Integer.valueOf(ServiceTypes.MSG_CMD_HU_INFO), 0, 4, null);
        CarlifeDeviceInfoProto.CarlifeDeviceInfo.Builder brand = CarlifeDeviceInfoProto.CarlifeDeviceInfo.newBuilder().setOs(context.getOsType()).setBoard(Build.BOARD).setBootloader(Build.BOOTLOADER).setBrand(Build.BRAND);
        String[] strArr = Build.SUPPORTED_ABIS;
        l.d(strArr, "SUPPORTED_ABIS");
        String str = (String) u8.l.B0(strArr, 0);
        if (str == null) {
            str = "unknown";
        }
        CarlifeDeviceInfoProto.CarlifeDeviceInfo.Builder cpuAbi = brand.setCpuAbi(str);
        l.d(strArr, "SUPPORTED_ABIS");
        String str2 = (String) u8.l.B0(strArr, 1);
        if (str2 == null) {
            str2 = "none";
        }
        CarlifeDeviceInfoProto.CarlifeDeviceInfo.Builder incremental = cpuAbi.setCpuAbi2(str2).setDevice(Build.DEVICE).setDisplay(Build.DISPLAY).setFingerprint(Build.FINGERPRINT).setHardware(Build.HARDWARE).setHost(Build.HOST).setCid(Build.ID).setManufacturer(Build.MANUFACTURER).setModel(Build.MODEL).setProduct(Build.PRODUCT).setSerial(Settings.Secure.getString(context.getContext().getContentResolver(), "android_id")).setCodename(Build.VERSION.CODENAME).setIncremental(Build.VERSION.INCREMENTAL);
        int i7 = Build.VERSION.SDK_INT;
        carLifeMessageObtain$default.payload(incremental.setSdk(String.valueOf(i7)).setSdkInt(i7).setRelease(Build.VERSION.RELEASE).setCarlifeversion(context.getVersionName()).m16build());
        context.postMessage(carLifeMessageObtain$default);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public void onConnectionAttached(CarLifeContext context) {
        l.e(context, "context");
        context.setEncryptionEnabled(false);
        CarLifeMessage carLifeMessageObtain$default = CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, 1, Integer.valueOf(ServiceTypes.MSG_CMD_HU_PROTOCOL_VERSION), 0, 4, null);
        carLifeMessageObtain$default.payload(CarlifeProtocolVersionProto.CarlifeProtocolVersion.newBuilder().setMajorVersion(context.getProtocolVersion()).setMinorVersion(1).m16build());
        context.postMessage(carLifeMessageObtain$default);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionAuthenFailed(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.b(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public void onConnectionDetached(CarLifeContext context) {
        l.e(context, "context");
        this.currentProgress = 0;
        TimerUtils.INSTANCE.stop(this.heartBeatTask);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public void onConnectionEstablished(CarLifeContext context) {
        l.e(context, "context");
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionPrompt(String str) {
        com.baidu.carlife.sdk.a.e(this, str);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public void onConnectionReattached(CarLifeContext context) {
        l.e(context, "context");
        context.setEncryptionEnabled(false);
        this.currentProgress = 0;
        TimerUtils.INSTANCE.stop(this.heartBeatTask);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionVersionNotSupprt(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.g(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionWait() {
        com.baidu.carlife.sdk.a.h(this);
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public boolean onReceiveMessage(CarLifeContext context, CarLifeMessage message) {
        l.e(context, "context");
        l.e(message, "message");
        this.lastReceiveMessageTime = System.currentTimeMillis();
        switch (message.getServiceType()) {
            case ServiceTypes.MSG_CMD_PROTOCOL_VERSION_MATCH_STATUS /* 65538 */:
                handleProtocolVersionMatch(context, message);
                break;
            case ServiceTypes.MSG_CMD_MD_INFO /* 65540 */:
                handleMDInfo(context, message);
                break;
            case ServiceTypes.MSG_CMD_MD_AUTH_RESPONSE /* 65609 */:
                handleAuthResponse(context, message);
                break;
            case ServiceTypes.MSG_CMD_MD_AUTH_RESULT /* 65611 */:
                handleAuthResult(context, message);
                break;
        }
        return false;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final /* synthetic */ boolean onSendMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        return b.b(this, carLifeContext, carLifeMessage);
    }
}

package com.baidu.carlife.sdk.receiver;

import a2.f;
import android.content.Context;
import com.baidu.carlife.protobuf.CarlifeStatisticsInfoProto;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Configs;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.a;
import com.baidu.carlife.sdk.internal.CarLifeContextImpl;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ProtocolTracer;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.protocol.encrypt.EncryptionTool;
import com.baidu.carlife.sdk.internal.protocol.encrypt.RsaEncryptor;
import com.baidu.carlife.sdk.receiver.protocol.v1.ConnectionEstablishHandler;
import com.baidu.carlife.sdk.receiver.protocol.v1.FeaturesHandler;
import com.baidu.carlife.sdk.receiver.transport.GroupedProtocolTransport;
import com.baidu.carlife.sdk.util.Logger;
import i9.l;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u0019\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\u0012J\u000f\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010\u0012J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010\u0012J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010 J\u000f\u0010&\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010\u0012J\u000f\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010\u0012J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00102\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010-\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b/\u0010.J\u001f\u00100\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b0\u00101R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/CarLifeReceiverImpl;", "Lcom/baidu/carlife/sdk/internal/CarLifeContextImpl;", "Lcom/baidu/carlife/sdk/receiver/CarLifeReceiver;", "Landroid/content/Context;", "context", "", "channel", "uniqueId", "", "", "features", "", "", "configs", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Lt8/z;", "initEncryption", "()V", "onConnectionDetached", "Lcom/baidu/carlife/sdk/CarLifeContext;", "onConnectionReattached", "(Lcom/baidu/carlife/sdk/CarLifeContext;)V", "key", "feature", "setFeature", "(Ljava/lang/String;I)V", "", "isLocal", "(Ljava/lang/String;IZ)V", "keyCode", "onKeyEvent", "(I)V", "connect", "stopConnect", "disconnect", "type", "setConnectType", "ready", "terminate", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "postMessage", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "sendMessage", "encrypt", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "decrypt", "initStatisticsInfo", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/Map;", "Ljava/security/PublicKey;", "publicKey", "Ljava/security/PublicKey;", "Lcom/baidu/carlife/sdk/internal/protocol/encrypt/EncryptionTool;", "encryptionTool", "Lcom/baidu/carlife/sdk/internal/protocol/encrypt/EncryptionTool;", "Lcom/baidu/carlife/sdk/receiver/transport/GroupedProtocolTransport;", "transport", "Lcom/baidu/carlife/sdk/receiver/transport/GroupedProtocolTransport;", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class CarLifeReceiverImpl extends CarLifeContextImpl implements CarLifeReceiver {
    private EncryptionTool encryptionTool;
    private final Map<String, Integer> features;
    private PublicKey publicKey;
    private final GroupedProtocolTransport transport;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarLifeReceiverImpl(Context context, String str, String str2, Map<String, Integer> map, Map<String, ? extends Object> map2) {
        super(context, map2);
        l.e(context, "context");
        l.e(str, "channel");
        l.e(str2, "uniqueId");
        l.e(map, "features");
        l.e(map2, "configs");
        this.features = map;
        setProtocolVersion(((Number) getConfig(Configs.CONFIG_PROTOCOL_VERSION, 4)).intValue());
        setStatisticsInfo((CarlifeStatisticsInfoProto.CarlifeStatisticsInfo) CarlifeStatisticsInfoProto.CarlifeStatisticsInfo.newBuilder().setChannel(str).setCuid(str2).setVersionCode(getVersionCode()).setVersionName(getVersionName()).setConnectCount(0).setConnectSuccessCount(0).setConnectTime(0).m16build());
        if (((Boolean) getConfig(Configs.CONFIG_CONTENT_ENCRYPTION, Boolean.FALSE)).booleanValue()) {
            initEncryption();
        }
        setFeatures(map);
        this.transport = new GroupedProtocolTransport(this);
        registerTransportListener(new ProtocolTracer(true));
        registerTransportListener(new ConnectionEstablishHandler(this));
        registerTransportListener(new FeaturesHandler(this.encryptionTool, this.publicKey));
    }

    private final void initEncryption() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048, new SecureRandom());
            KeyPair keyPairGenKeyPair = keyPairGenerator.genKeyPair();
            this.publicKey = keyPairGenKeyPair.getPublic();
            RsaEncryptor.Companion companion = RsaEncryptor.INSTANCE;
            PrivateKey privateKey = keyPairGenKeyPair.getPrivate();
            l.d(privateKey, "it.private");
            this.encryptionTool = new EncryptionTool(RsaEncryptor.Companion.withPrivateKey$default(companion, privateKey, (String) null, 2, (Object) null));
            setFeature(Configs.FEATURE_CONFIG_CONTENT_ENCRYPTION, 1);
        } catch (Exception e7) {
            setFeature(Configs.FEATURE_CONFIG_CONTENT_ENCRYPTION, 0);
            Logger.INSTANCE.e(Constants.TAG, "CarLifeReceiverImpl initEncryption exception: ", e7);
        }
    }

    @Override // com.baidu.carlife.sdk.receiver.CarLifeReceiver
    public void connect() {
        this.transport.connect();
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public CarLifeMessage decrypt(CarLifeMessage message) {
        CarLifeMessage carLifeMessageDecrypt;
        l.e(message, "message");
        EncryptionTool encryptionTool = this.encryptionTool;
        return (encryptionTool == null || (carLifeMessageDecrypt = encryptionTool.decrypt(message)) == null) ? message : carLifeMessageDecrypt;
    }

    @Override // com.baidu.carlife.sdk.receiver.CarLifeReceiver
    public void disconnect() {
        terminate();
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public CarLifeMessage encrypt(CarLifeMessage message) {
        CarLifeMessage carLifeMessageEncrypt;
        l.e(message, "message");
        EncryptionTool encryptionTool = this.encryptionTool;
        return (encryptionTool == null || (carLifeMessageEncrypt = encryptionTool.encrypt(message)) == null) ? message : carLifeMessageEncrypt;
    }

    @Override // com.baidu.carlife.sdk.receiver.CarLifeReceiver
    public void initStatisticsInfo(String channel, String uniqueId) {
        l.e(channel, "channel");
        l.e(uniqueId, "uniqueId");
        setStatisticsInfo((CarlifeStatisticsInfoProto.CarlifeStatisticsInfo) CarlifeStatisticsInfoProto.CarlifeStatisticsInfo.newBuilder().setChannel(channel).setCuid(uniqueId).setVersionCode(getVersionCode()).setVersionName(getVersionName()).setConnectCount(0).setConnectSuccessCount(0).setConnectTime(0).m16build());
    }

    @Override // com.baidu.carlife.sdk.internal.CarLifeContextImpl, com.baidu.carlife.sdk.CarLifeContext
    public void onConnectionDetached() {
        CarLifeContext.CC.d(this);
        setFeatures(this.features);
    }

    @Override // com.baidu.carlife.sdk.internal.CarLifeContextImpl, com.baidu.carlife.sdk.ConnectionChangeListener
    public void onConnectionReattached(CarLifeContext context) {
        l.e(context, "context");
        a.f(this, context);
        setFeatures(this.features);
    }

    @Override // com.baidu.carlife.sdk.receiver.CarLifeReceiver
    public void onKeyEvent(int keyCode) {
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public void postMessage(CarLifeMessage message) {
        l.e(message, "message");
        this.transport.postMessage(message);
    }

    @Override // com.baidu.carlife.sdk.receiver.CarLifeReceiver
    public void ready() {
        this.transport.ready();
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public void sendMessage(CarLifeMessage message) {
        l.e(message, "message");
        this.transport.sendMessage(message);
    }

    @Override // com.baidu.carlife.sdk.receiver.CarLifeReceiver
    public void setConnectType(int type) {
        Logger.INSTANCE.d(Constants.TAG, f.E(type, "setConnectType, "));
        setFeature(Configs.FEATURE_CONFIG_CONNECT_TYPE, type);
        this.transport.configConnectType();
        this.transport.connect();
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public void setFeature(String key, int feature) {
        l.e(key, "key");
        setFeature(key, feature, true);
    }

    @Override // com.baidu.carlife.sdk.internal.CarLifeContextImpl, com.baidu.carlife.sdk.CarLifeContext
    public void setFeature(String key, int feature, boolean isLocal) {
        l.e(key, "key");
        super.setFeature(key, feature, isLocal);
        if (isLocal) {
            this.features.put(key, Integer.valueOf(feature));
        }
    }

    @Override // com.baidu.carlife.sdk.receiver.CarLifeReceiver
    public void stopConnect() {
        this.transport.stopConnect();
    }

    @Override // com.baidu.carlife.sdk.CarLifeContext
    public void terminate() {
        this.transport.terminate();
    }
}

package com.baidu.carlife.sdk.receiver.protocol.v1;

import android.util.Base64;
import com.baidu.carlife.protobuf.CarlifeFeatureConfigListProto;
import com.baidu.carlife.protobuf.CarlifeFeatureConfigProto;
import com.baidu.carlife.protobuf.CarlifeHuRsaPublicKeyResponseProto;
import com.baidu.carlife.protobuf.CarlifeMdAesKeyRequestProto;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Configs;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.a;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.PayloadConvertersKt;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.protocol.encrypt.EncryptionTool;
import com.baidu.carlife.sdk.internal.transport.TransportListener;
import com.baidu.carlife.sdk.internal.transport.b;
import com.baidu.carlife.sdk.util.Logger;
import com.google.protobuf.l1;
import i9.l;
import java.security.PublicKey;
import java.util.List;
import kotlin.Metadata;
import u8.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/protocol/v1/FeaturesHandler;", "Lcom/baidu/carlife/sdk/internal/transport/TransportListener;", "Lcom/baidu/carlife/sdk/internal/protocol/encrypt/EncryptionTool;", "encryptionTool", "Ljava/security/PublicKey;", "publicKey", "<init>", "(Lcom/baidu/carlife/sdk/internal/protocol/encrypt/EncryptionTool;Ljava/security/PublicKey;)V", "Lcom/baidu/carlife/sdk/CarLifeContext;", "context", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "Lt8/z;", "handleFeatureRequest", "(Lcom/baidu/carlife/sdk/CarLifeContext;Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "handleRequestPublicKey", "handleAESKeyRequest", "handleEncryptReady", "handleMDCarlifeDataSubscribeDone", "", "onReceiveMessage", "(Lcom/baidu/carlife/sdk/CarLifeContext;Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)Z", "Lcom/baidu/carlife/sdk/internal/protocol/encrypt/EncryptionTool;", "Ljava/security/PublicKey;", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class FeaturesHandler implements TransportListener {
    private final EncryptionTool encryptionTool;
    private final PublicKey publicKey;

    public FeaturesHandler(EncryptionTool encryptionTool, PublicKey publicKey) {
        this.encryptionTool = encryptionTool;
        this.publicKey = publicKey;
    }

    private final void handleAESKeyRequest(CarLifeContext context, CarLifeMessage message) {
        if (this.encryptionTool == null || this.publicKey == null) {
            Logger.INSTANCE.e(Constants.TAG, "can not handle aes key when CONTENT_ENCRYPTION not enabled");
            return;
        }
        l1 protoPayload = message.getProtoPayload();
        CarlifeMdAesKeyRequestProto.CarlifeMdAesKeyRequest carlifeMdAesKeyRequest = protoPayload instanceof CarlifeMdAesKeyRequestProto.CarlifeMdAesKeyRequest ? (CarlifeMdAesKeyRequestProto.CarlifeMdAesKeyRequest) protoPayload : null;
        if (carlifeMdAesKeyRequest != null) {
            try {
                EncryptionTool encryptionTool = this.encryptionTool;
                String aesKey = carlifeMdAesKeyRequest.getAesKey();
                l.d(aesKey, "it.aesKey");
                encryptionTool.setEncryptKey(aesKey);
                context.postMessage(CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, 1, Integer.valueOf(ServiceTypes.MSG_CMD_HU_AES_REC_RESPONSE), 0, 4, null));
            } catch (Exception e7) {
                Logger.INSTANCE.e(Constants.TAG, "handleAESKeyRequest exception: ", e7);
            }
        }
    }

    private final void handleEncryptReady(CarLifeContext context, CarLifeMessage message) {
        context.postMessage(1, ServiceTypes.MSG_CMD_MD_ENCRYPT_READY_DONE);
        if (this.encryptionTool == null || this.publicKey == null) {
            return;
        }
        context.setEncryptionEnabled(true);
    }

    private final void handleFeatureRequest(CarLifeContext context, CarLifeMessage message) {
        List<CarlifeFeatureConfigProto.CarlifeFeatureConfig> featureConfigList;
        l1 protoPayload = message.getProtoPayload();
        CarlifeFeatureConfigListProto.CarlifeFeatureConfigList carlifeFeatureConfigList = protoPayload instanceof CarlifeFeatureConfigListProto.CarlifeFeatureConfigList ? (CarlifeFeatureConfigListProto.CarlifeFeatureConfigList) protoPayload : null;
        if (carlifeFeatureConfigList == null || (featureConfigList = carlifeFeatureConfigList.getFeatureConfigList()) == null) {
            featureConfigList = w.f13122a;
        }
        for (CarlifeFeatureConfigProto.CarlifeFeatureConfig carlifeFeatureConfig : featureConfigList) {
            String key = carlifeFeatureConfig.getKey();
            l.d(key, "feature.key");
            context.setFeature(key, carlifeFeatureConfig.getValue(), false);
        }
        CarLifeMessage carLifeMessageObtain$default = CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, 1, Integer.valueOf(ServiceTypes.MSG_CMD_HU_FEATURE_CONFIG_RESPONSE), 0, 4, null);
        carLifeMessageObtain$default.payload(PayloadConvertersKt.builder(context.listFeatures()).setHuBtName((String) context.getConfig(Configs.CONFIG_HU_BT_NAME, "")).setHuBtMAC((String) context.getConfig(Configs.CONFIG_HU_BT_MAC, "")).m16build());
        context.postMessage(carLifeMessageObtain$default);
    }

    private final void handleMDCarlifeDataSubscribeDone(CarLifeContext context, CarLifeMessage message) {
        context.postMessage(1, ServiceTypes.MSG_CMD_HU_CARLIFE_DATA_SUBSCRIBE_DONE_RESPONSE);
    }

    private final void handleRequestPublicKey(CarLifeContext context, CarLifeMessage message) {
        PublicKey publicKey;
        if (this.encryptionTool == null || (publicKey = this.publicKey) == null) {
            Logger.INSTANCE.e(Constants.TAG, "can not request public key when CONTENT_ENCRYPTION not enabled");
            return;
        }
        String strEncodeToString = Base64.encodeToString(publicKey.getEncoded(), 2);
        CarLifeMessage carLifeMessageObtain$default = CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, 1, Integer.valueOf(ServiceTypes.MSG_CMD_HU_RSA_PUBLIC_KEY_RESPONSE), 0, 4, null);
        carLifeMessageObtain$default.payload(CarlifeHuRsaPublicKeyResponseProto.CarlifeHuRsaPublicKeyResponse.newBuilder().setRsaPublicKey(strEncodeToString).m16build());
        context.postMessage(carLifeMessageObtain$default);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionAttached(CarLifeContext carLifeContext) {
        a.a(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionAuthenFailed(CarLifeContext carLifeContext) {
        a.b(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionDetached(CarLifeContext carLifeContext) {
        a.c(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionEstablished(CarLifeContext carLifeContext) {
        a.d(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionPrompt(String str) {
        a.e(this, str);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionReattached(CarLifeContext carLifeContext) {
        a.f(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionVersionNotSupprt(CarLifeContext carLifeContext) {
        a.g(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionWait() {
        a.h(this);
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public boolean onReceiveMessage(CarLifeContext context, CarLifeMessage message) {
        l.e(context, "context");
        l.e(message, "message");
        switch (message.getServiceType()) {
            case ServiceTypes.MSG_CMD_CARLIFE_DATA_SUBSCRIBE_DONE /* 65604 */:
                handleMDCarlifeDataSubscribeDone(context, message);
                break;
            case ServiceTypes.MSG_CMD_MD_FEATURE_CONFIG_REQUEST /* 65617 */:
                handleFeatureRequest(context, message);
                break;
            case ServiceTypes.MSG_CMD_MD_RSA_PUBLIC_KEY_REQUEST /* 65642 */:
                handleRequestPublicKey(context, message);
                break;
            case ServiceTypes.MSG_CMD_MD_AES_KEY_SEND_REQUEST /* 65644 */:
                handleAESKeyRequest(context, message);
                break;
            case ServiceTypes.MSG_CMD_MD_ENCRYPT_READY /* 65646 */:
                handleEncryptReady(context, message);
                break;
        }
        return false;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final /* synthetic */ boolean onSendMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        return b.b(this, carLifeContext, carLifeMessage);
    }
}

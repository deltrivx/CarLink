package com.baidu.carlife.sdk.internal.protocol.encrypt;

import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.Logger;
import i9.g;
import i9.l;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010 \u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\n¨\u0006!"}, d2 = {"Lcom/baidu/carlife/sdk/internal/protocol/encrypt/EncryptionTool;", "", "Lcom/baidu/carlife/sdk/internal/protocol/encrypt/RsaEncryptor;", "rsaEncryptor", "<init>", "(Lcom/baidu/carlife/sdk/internal/protocol/encrypt/RsaEncryptor;)V", "", "publicKey", "Lt8/z;", "prepare", "(Ljava/lang/String;)V", "", "isSender", "reset", "(Z)V", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "encrypt", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "decrypt", "Lcom/baidu/carlife/sdk/internal/protocol/encrypt/RsaEncryptor;", "Lcom/baidu/carlife/sdk/internal/protocol/encrypt/AesEncryptor;", "aesEncryptor", "Lcom/baidu/carlife/sdk/internal/protocol/encrypt/AesEncryptor;", "", "", "decryptExcludes", "Ljava/util/Set;", "value", "getEncryptKey", "()Ljava/lang/String;", "setEncryptKey", "encryptKey", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class EncryptionTool {
    private AesEncryptor aesEncryptor;
    private final Set<Integer> decryptExcludes;
    private RsaEncryptor rsaEncryptor;

    /* JADX WARN: Multi-variable type inference failed */
    public EncryptionTool() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public EncryptionTool(RsaEncryptor rsaEncryptor) {
        this.rsaEncryptor = rsaEncryptor;
        this.decryptExcludes = new LinkedHashSet();
    }

    public /* synthetic */ EncryptionTool(RsaEncryptor rsaEncryptor, int i7, g gVar) {
        this((i7 & 1) != 0 ? null : rsaEncryptor);
    }

    public final CarLifeMessage decrypt(CarLifeMessage message) {
        l.e(message, "message");
        int serviceType = message.getServiceType();
        if (this.aesEncryptor == null) {
            Logger.INSTANCE.e(Constants.TAG, "EncryptionTool encryptor does not initialized properly");
            return message;
        }
        if (this.decryptExcludes.contains(Integer.valueOf(serviceType))) {
            return message;
        }
        CarLifeMessage carLifeMessageCopy = message.copy();
        carLifeMessageCopy.resizeBuffer(message.getSize());
        try {
            AesEncryptor aesEncryptor = this.aesEncryptor;
            l.b(aesEncryptor);
            carLifeMessageCopy.setPayloadSize(aesEncryptor.decrypt(message.getBody(), message.getCommandSize(), message.getPayloadSize(), carLifeMessageCopy.getBody(), carLifeMessageCopy.getCommandSize()));
            return carLifeMessageCopy;
        } catch (Exception e7) {
            Logger.INSTANCE.e(Constants.TAG, "EncryptionTool decrypt exception ", e7, "  ", Integer.valueOf(serviceType));
            this.decryptExcludes.add(Integer.valueOf(serviceType));
            carLifeMessageCopy.recycle();
            return message;
        }
    }

    public final CarLifeMessage encrypt(CarLifeMessage message) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        l.e(message, "message");
        if (this.aesEncryptor == null) {
            throw new RuntimeException("encryptor does not initialized properly");
        }
        CarLifeMessage carLifeMessageCopy = message.copy();
        int payloadSize = message.getPayloadSize();
        AesEncryptor aesEncryptor = this.aesEncryptor;
        l.b(aesEncryptor);
        int iOutputSize = aesEncryptor.outputSize(1, payloadSize);
        carLifeMessageCopy.setPayloadSize(iOutputSize);
        carLifeMessageCopy.resizeBuffer(carLifeMessageCopy.getCommandSize() + iOutputSize);
        AesEncryptor aesEncryptor2 = this.aesEncryptor;
        l.b(aesEncryptor2);
        aesEncryptor2.encrypt(message.getBody(), message.getCommandSize(), message.getPayloadSize(), carLifeMessageCopy.getBody(), carLifeMessageCopy.getCommandSize());
        return carLifeMessageCopy;
    }

    public final String getEncryptKey() {
        RsaEncryptor rsaEncryptor = this.rsaEncryptor;
        if (rsaEncryptor == null || this.aesEncryptor == null) {
            throw new RuntimeException("you must init before request encrypt key");
        }
        l.b(rsaEncryptor);
        AesEncryptor aesEncryptor = this.aesEncryptor;
        l.b(aesEncryptor);
        return rsaEncryptor.encryptToBase64(aesEncryptor.getKey());
    }

    public final void prepare(String publicKey) {
        l.e(publicKey, "publicKey");
        this.rsaEncryptor = RsaEncryptor.Companion.withPublicKey$default(RsaEncryptor.INSTANCE, publicKey, null, 2, null);
        this.aesEncryptor = AesEncryptor.INSTANCE.withRandomKey();
    }

    public final void reset(boolean isSender) {
        if (!isSender) {
            this.aesEncryptor = null;
        } else {
            this.rsaEncryptor = null;
            this.aesEncryptor = null;
        }
    }

    public final void setEncryptKey(String str) {
        l.e(str, "value");
        RsaEncryptor rsaEncryptor = this.rsaEncryptor;
        if (rsaEncryptor == null) {
            throw new RuntimeException("you must pass a non null RSAEncryptor in constructor");
        }
        AesEncryptor.Companion companion = AesEncryptor.INSTANCE;
        l.b(rsaEncryptor);
        this.aesEncryptor = companion.withKey(rsaEncryptor.decryptWithBase64(str));
        this.decryptExcludes.clear();
    }
}

package com.baidu.carlife.sdk.internal.protocol.encrypt;

import android.util.Base64;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.g;
import i9.l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import kotlin.Metadata;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/baidu/carlife/sdk/internal/protocol/encrypt/RsaEncryptor;", "", "key", "Ljava/security/Key;", "transformation", "", "(Ljava/security/Key;Ljava/lang/String;)V", "decrypt", "", "data", "decryptSpilt", "encryptMaxSize", "", "decryptWithBase64", "encrypt", "encryptSpilt", "encryptToBase64", "Companion", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class RsaEncryptor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Key key;
    private final String transformation;

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/baidu/carlife/sdk/internal/protocol/encrypt/RsaEncryptor$Companion;", "", "()V", "withPrivateKey", "Lcom/baidu/carlife/sdk/internal/protocol/encrypt/RsaEncryptor;", "privateKey", "Ljava/security/PrivateKey;", "transformation", "", "withPublicKey", "key", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ RsaEncryptor withPrivateKey$default(Companion companion, String str, String str2, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                str2 = "RSA/ECB/PKCS1Padding";
            }
            return companion.withPrivateKey(str, str2);
        }

        public static /* synthetic */ RsaEncryptor withPrivateKey$default(Companion companion, PrivateKey privateKey, String str, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                str = "RSA/ECB/PKCS1Padding";
            }
            return companion.withPrivateKey(privateKey, str);
        }

        public static /* synthetic */ RsaEncryptor withPublicKey$default(Companion companion, String str, String str2, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                str2 = "RSA/ECB/PKCS1Padding";
            }
            return companion.withPublicKey(str, str2);
        }

        public final RsaEncryptor withPrivateKey(String privateKey, String transformation) throws InvalidKeySpecException {
            l.e(privateKey, "privateKey");
            l.e(transformation, "transformation");
            PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(privateKey, 2)));
            l.d(privateKeyGeneratePrivate, "getInstance(\"RSA\")\n     …  )\n                    )");
            return withPrivateKey(privateKeyGeneratePrivate, transformation);
        }

        public final RsaEncryptor withPrivateKey(PrivateKey privateKey, String transformation) {
            l.e(privateKey, "privateKey");
            l.e(transformation, "transformation");
            return new RsaEncryptor(privateKey, transformation);
        }

        public final RsaEncryptor withPublicKey(String key, String transformation) throws InvalidKeySpecException {
            l.e(key, "key");
            l.e(transformation, "transformation");
            byte[] bArrDecode = Base64.decode(key, 2);
            l.d(bArrDecode, "decode(key, Base64.NO_WRAP)");
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
            l.d(publicKeyGeneratePublic, "publicKey");
            return new RsaEncryptor(publicKeyGeneratePublic, transformation);
        }
    }

    public RsaEncryptor(Key key, String str) {
        l.e(key, "key");
        l.e(str, "transformation");
        this.key = key;
        this.transformation = str;
    }

    public static /* synthetic */ byte[] decryptSpilt$default(RsaEncryptor rsaEncryptor, byte[] bArr, int i7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 128;
        }
        return rsaEncryptor.decryptSpilt(bArr, i7);
    }

    public static /* synthetic */ String encryptSpilt$default(RsaEncryptor rsaEncryptor, byte[] bArr, int i7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 117;
        }
        return rsaEncryptor.encryptSpilt(bArr, i7);
    }

    public final byte[] decrypt(byte[] data) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        l.e(data, "data");
        Cipher cipher = Cipher.getInstance(this.transformation);
        cipher.init(2, this.key);
        cipher.update(data);
        byte[] bArrDoFinal = cipher.doFinal();
        l.d(bArrDoFinal, "cipher.doFinal()");
        return bArrDoFinal;
    }

    public final byte[] decryptSpilt(byte[] data, int encryptMaxSize) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
        l.e(data, "data");
        Cipher cipher = Cipher.getInstance(this.transformation);
        cipher.init(2, this.key);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = data.length;
        int i7 = 0;
        while (i7 < length) {
            int iMin = Math.min(encryptMaxSize, length - i7);
            byteArrayOutputStream.write(cipher.doFinal(data, i7, iMin));
            i7 += iMin;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        l.d(byteArray, "outS.toByteArray()");
        return byteArray;
    }

    public final byte[] decryptWithBase64(String data) {
        l.e(data, "data");
        byte[] bArrDecode = Base64.decode(data, 2);
        l.d(bArrDecode, "decode(data, Base64.NO_WRAP)");
        return decrypt(bArrDecode);
    }

    public final byte[] encrypt(String data) {
        l.e(data, "data");
        Charset charsetForName = Charset.forName("UTF-8");
        l.d(charsetForName, "forName(...)");
        byte[] bytes = data.getBytes(charsetForName);
        l.d(bytes, "getBytes(...)");
        return encrypt(bytes);
    }

    public final byte[] encrypt(byte[] data) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        l.e(data, "data");
        Cipher cipher = Cipher.getInstance(this.transformation);
        cipher.init(1, this.key);
        cipher.update(data);
        byte[] bArrDoFinal = cipher.doFinal();
        l.d(bArrDoFinal, "cipher.doFinal()");
        return bArrDoFinal;
    }

    public final String encryptSpilt(String data) {
        l.e(data, "data");
        byte[] bytes = data.getBytes(a.f15804a);
        l.d(bytes, "getBytes(...)");
        return encryptSpilt$default(this, bytes, 0, 2, null);
    }

    public final String encryptSpilt(byte[] data, int encryptMaxSize) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
        l.e(data, "data");
        Cipher cipher = Cipher.getInstance(this.transformation);
        cipher.init(1, this.key);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = data.length;
        int i7 = 0;
        while (i7 < length) {
            int iMin = Math.min(encryptMaxSize, length - i7);
            byteArrayOutputStream.write(cipher.doFinal(data, i7, iMin));
            i7 += iMin;
        }
        byte[] bArrEncode = Base64.encode(byteArrayOutputStream.toByteArray(), 2);
        l.d(bArrEncode, "encode(outS.toByteArray(), Base64.NO_WRAP)");
        return new String(bArrEncode, a.f15804a);
    }

    public final String encryptToBase64(String data) {
        l.e(data, "data");
        String strEncodeToString = Base64.encodeToString(encrypt(data), 2);
        l.d(strEncodeToString, "encodeToString(encryptData, Base64.NO_WRAP)");
        return strEncodeToString;
    }

    public final String encryptToBase64(byte[] data) {
        l.e(data, "data");
        String strEncodeToString = Base64.encodeToString(encrypt(data), 2);
        l.d(strEncodeToString, "encodeToString(encryptData, Base64.NO_WRAP)");
        return strEncodeToString;
    }
}

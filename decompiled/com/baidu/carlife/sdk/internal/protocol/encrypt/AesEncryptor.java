package com.baidu.carlife.sdk.internal.protocol.encrypt;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.g;
import i9.l;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0013J)\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u000fJ9\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/baidu/carlife/sdk/internal/protocol/encrypt/AesEncryptor;", "", "", "key", "<init>", "([B)V", "", "mode", "inputLength", "outputSize", "(II)I", "data", "offset", "length", "encrypt", "([BII)[B", "output", "outputOffset", "Lt8/z;", "([BII[BI)V", "decrypt", "([BII[BI)I", "[B", "getKey", "()[B", "Ljavax/crypto/Cipher;", "encryptCipher", "Ljavax/crypto/Cipher;", "decryptCipher", "Companion", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class AesEncryptor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Cipher decryptCipher;
    private final Cipher encryptCipher;
    private final byte[] key;

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/baidu/carlife/sdk/internal/protocol/encrypt/AesEncryptor$Companion;", "", "()V", "withKey", "Lcom/baidu/carlife/sdk/internal/protocol/encrypt/AesEncryptor;", "key", "", "withRandomKey", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final AesEncryptor withKey(byte[] key) {
            l.e(key, "key");
            return new AesEncryptor(key);
        }

        public final AesEncryptor withRandomKey() {
            String string = UUID.randomUUID().toString();
            l.d(string, "randomUUID().toString()");
            String strSubstring = string.substring(0, 16);
            l.d(strSubstring, "substring(...)");
            Charset charsetForName = Charset.forName("UTF-8");
            l.d(charsetForName, "forName(...)");
            byte[] bytes = strSubstring.getBytes(charsetForName);
            l.d(bytes, "getBytes(...)");
            return new AesEncryptor(bytes);
        }
    }

    public AesEncryptor(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        l.e(bArr, "key");
        this.key = bArr;
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        l.d(cipher, "getInstance(\"AES\")");
        this.encryptCipher = cipher;
        cipher.init(1, secretKeySpec);
        Cipher cipher2 = Cipher.getInstance("AES");
        l.d(cipher2, "getInstance(\"AES\")");
        this.decryptCipher = cipher2;
        cipher2.init(2, secretKeySpec);
    }

    public static /* synthetic */ int decrypt$default(AesEncryptor aesEncryptor, byte[] bArr, int i7, int i10, byte[] bArr2, int i11, int i12, Object obj) {
        int i13 = (i12 & 2) != 0 ? 0 : i7;
        if ((i12 & 4) != 0) {
            i10 = bArr.length;
        }
        return aesEncryptor.decrypt(bArr, i13, i10, bArr2, i11);
    }

    public static /* synthetic */ byte[] decrypt$default(AesEncryptor aesEncryptor, byte[] bArr, int i7, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i7 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = bArr.length;
        }
        return aesEncryptor.decrypt(bArr, i7, i10);
    }

    public static /* synthetic */ void encrypt$default(AesEncryptor aesEncryptor, byte[] bArr, int i7, int i10, byte[] bArr2, int i11, int i12, Object obj) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int i13 = (i12 & 2) != 0 ? 0 : i7;
        if ((i12 & 4) != 0) {
            i10 = bArr.length;
        }
        aesEncryptor.encrypt(bArr, i13, i10, bArr2, i11);
    }

    public static /* synthetic */ byte[] encrypt$default(AesEncryptor aesEncryptor, byte[] bArr, int i7, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i7 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = bArr.length;
        }
        return aesEncryptor.encrypt(bArr, i7, i10);
    }

    public final int decrypt(byte[] data, int offset, int length, byte[] output, int outputOffset) {
        l.e(data, "data");
        l.e(output, "output");
        return this.decryptCipher.doFinal(data, offset, length, output, outputOffset);
    }

    public final byte[] decrypt(byte[] data, int offset, int length) throws BadPaddingException, IllegalBlockSizeException {
        l.e(data, "data");
        byte[] bArrDoFinal = this.decryptCipher.doFinal(data, offset, length);
        l.d(bArrDoFinal, "decryptCipher.doFinal(data, offset, length)");
        return bArrDoFinal;
    }

    public final void encrypt(byte[] data, int offset, int length, byte[] output, int outputOffset) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        l.e(data, "data");
        l.e(output, "output");
        this.encryptCipher.doFinal(data, offset, length, output, outputOffset);
    }

    public final byte[] encrypt(byte[] data, int offset, int length) throws BadPaddingException, IllegalBlockSizeException {
        l.e(data, "data");
        byte[] bArrDoFinal = this.encryptCipher.doFinal(data, offset, length);
        l.d(bArrDoFinal, "encryptCipher.doFinal(data, offset, length)");
        return bArrDoFinal;
    }

    public final byte[] getKey() {
        return this.key;
    }

    public final int outputSize(int mode, int inputLength) {
        return mode == 1 ? this.encryptCipher.getOutputSize(inputLength) : this.decryptCipher.getOutputSize(inputLength);
    }
}

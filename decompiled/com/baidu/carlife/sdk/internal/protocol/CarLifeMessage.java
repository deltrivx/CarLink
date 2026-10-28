package com.baidu.carlife.sdk.internal.protocol;

import com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoder;
import com.baidu.carlife.sdk.internal.protocol.decoder.PayloadDecoderFactory;
import com.baidu.carlife.sdk.util.BitConverterKt;
import com.google.protobuf.l1;
import com.google.protobuf.r;
import com.google.protobuf.u;
import i9.g;
import i9.l;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b)\b\u0007\u0018\u0000 V2\u00020\u0001:\u0001VB\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0016J\u0017\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0012\u0010\u0019J+\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\rJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\rJ\r\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010\rJ\u0011\u0010%\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0005R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105R\u0017\u00106\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R*\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00105\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010A\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u00109R(\u0010C\u001a\u0004\u0018\u00010\u00172\b\u0010@\u001a\u0004\u0018\u00010\u00178F@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010&R\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bF\u00109R\u0011\u0010\u0011\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bG\u0010)R\u0011\u0010I\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bH\u0010)R$\u0010L\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010)\"\u0004\bK\u0010\u0005R$\u0010O\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010)\"\u0004\bN\u0010\u0005R\u0011\u0010R\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bP\u0010QR$\u0010U\u001a\u00020.2\u0006\u0010:\u001a\u00020.8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u00102\"\u0004\bT\u00104¨\u0006W"}, d2 = {"Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "Ljava/io/Closeable;", "", "channel", "<init>", "(I)V", "", "fill", "", "header", "(Z)[B", "Lt8/z;", "acquire", "()V", "recycle", "Ljava/nio/ByteBuffer;", "data", "size", "payload", "(Ljava/nio/ByteBuffer;I)V", "offset", "length", "([BII)V", "Lcom/google/protobuf/l1;", "msg", "(Lcom/google/protobuf/l1;)V", "reset", "(II[B)V", "newSize", "resizeBuffer", "resetBuffer", "copy", "()Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "", "toString", "()Ljava/lang/String;", "close", "decode", "()Lcom/google/protobuf/l1;", "I", "getChannel", "()I", "setChannel", "Ljava/util/concurrent/atomic/AtomicInteger;", "refCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "", "tag", "J", "getTag", "()J", "setTag", "(J)V", "[B", "wrappedHeader", "Ljava/nio/ByteBuffer;", "getWrappedHeader", "()Ljava/nio/ByteBuffer;", "value", "body", "getBody", "()[B", "setBody", "([B)V", "<set-?>", "wrappedBody", "getWrappedBody", "protoPayload", "Lcom/google/protobuf/l1;", "getProtoPayload", "getPayload", "getSize", "getCommandSize", "commandSize", "getPayloadSize", "setPayloadSize", "payloadSize", "getServiceType", "setServiceType", "serviceType", "getSupportEncrypt", "()Z", "supportEncrypt", "getTimestamp", "setTimestamp", "timestamp", "Companion", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class CarLifeMessage implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final int HEADER_SIZE = 8;
    public static final int INITIAL_BUFFER_SIZE = 1024;
    public static final int LONG_COMMAND_SIZE = 12;
    private static final CarLifeMessage NULL;
    public static final int SHORT_COMMAND_SIZE = 8;
    private static final CarLifeMessagePool pool;
    private byte[] body;
    private int channel;
    private final byte[] header;
    private l1 protoPayload;
    private final AtomicInteger refCount;
    private long tag;
    private ByteBuffer wrappedBody;
    private final ByteBuffer wrappedHeader;

    /* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage$Companion;", "", "<init>", "()V", "", "channel", "serviceType", "length", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "obtain", "(ILjava/lang/Integer;I)Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "Lt8/z;", "recycle", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "NULL", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "getNULL", "()Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "HEADER_SIZE", "I", "INITIAL_BUFFER_SIZE", "LONG_COMMAND_SIZE", "SHORT_COMMAND_SIZE", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessagePool;", "pool", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessagePool;", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ CarLifeMessage obtain$default(Companion companion, int i7, Integer num, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i7 = 1;
            }
            if ((i11 & 2) != 0) {
                num = null;
            }
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            return companion.obtain(i7, num, i10);
        }

        public final CarLifeMessage getNULL() {
            return CarLifeMessage.NULL;
        }

        public final CarLifeMessage obtain(int channel, Integer serviceType, int length) {
            CarLifeMessage carLifeMessageObtain = CarLifeMessage.pool.obtain(channel, serviceType, length);
            carLifeMessageObtain.acquire();
            return carLifeMessageObtain;
        }

        public final void recycle(CarLifeMessage message) {
            l.e(message, "message");
            message.resetBuffer();
            CarLifeMessage.pool.recycle(message);
        }
    }

    static {
        g gVar = null;
        INSTANCE = new Companion(gVar);
        int i7 = 0;
        int i10 = 1;
        pool = new CarLifeMessagePool(i7, i10, gVar);
        NULL = new CarLifeMessage(i7, i10, gVar);
    }

    public CarLifeMessage() {
        this(0, 1, null);
    }

    public CarLifeMessage(int i7) {
        this.channel = i7;
        this.refCount = new AtomicInteger(0);
        byte[] bArr = new byte[8];
        this.header = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        l.d(byteBufferWrap, "wrap(header)");
        this.wrappedHeader = byteBufferWrap;
        byte[] bArr2 = new byte[1024];
        this.body = bArr2;
        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr2);
        l.d(byteBufferWrap2, "wrap(body)");
        this.wrappedBody = byteBufferWrap2;
    }

    public /* synthetic */ CarLifeMessage(int i7, int i10, g gVar) {
        this((i10 & 1) != 0 ? 0 : i7);
    }

    private final l1 decode() {
        PayloadDecoder<?> payloadDecoderDecoderOf;
        int payloadSize = getPayloadSize();
        if (payloadSize == 0 || (payloadDecoderDecoderOf = PayloadDecoderFactory.INSTANCE.decoderOf(getServiceType())) == null) {
            return null;
        }
        Object objDecode = payloadDecoderDecoderOf.decode(this.body, getCommandSize(), payloadSize);
        l.c(objDecode, "null cannot be cast to non-null type com.google.protobuf.MessageLite");
        return (l1) objDecode;
    }

    public static /* synthetic */ byte[] header$default(CarLifeMessage carLifeMessage, boolean z10, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z10 = true;
        }
        return carLifeMessage.header(z10);
    }

    public static final CarLifeMessage obtain(int i7, Integer num, int i10) {
        return INSTANCE.obtain(i7, num, i10);
    }

    public static /* synthetic */ void payload$default(CarLifeMessage carLifeMessage, byte[] bArr, int i7, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i7 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = bArr.length;
        }
        carLifeMessage.payload(bArr, i7, i10);
    }

    public static final void recycle(CarLifeMessage carLifeMessage) {
        INSTANCE.recycle(carLifeMessage);
    }

    public static /* synthetic */ void reset$default(CarLifeMessage carLifeMessage, int i7, int i10, byte[] bArr, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            bArr = null;
        }
        carLifeMessage.reset(i7, i10, bArr);
    }

    private final void setBody(byte[] bArr) {
        this.body = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        l.d(byteBufferWrap, "wrap(value)");
        this.wrappedBody = byteBufferWrap;
    }

    public final void acquire() {
        this.refCount.incrementAndGet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        recycle();
    }

    public final CarLifeMessage copy() {
        CarLifeMessage carLifeMessageObtain$default = Companion.obtain$default(INSTANCE, this.channel, Integer.valueOf(getServiceType()), 0, 4, null);
        carLifeMessageObtain$default.setTimestamp(getTimestamp());
        return carLifeMessageObtain$default;
    }

    public final byte[] getBody() {
        return this.body;
    }

    public final int getChannel() {
        return this.channel;
    }

    public final int getCommandSize() {
        int i7 = this.channel;
        return (i7 == 1 || i7 == 6) ? 8 : 12;
    }

    public final ByteBuffer getPayload() {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.body, getCommandSize(), getPayloadSize());
        l.d(byteBufferWrap, "wrap(body, commandSize, payloadSize)");
        return byteBufferWrap;
    }

    public final int getPayloadSize() {
        int i7 = this.channel;
        return (i7 == 1 || i7 == 6) ? BitConverterKt.toShort$default(this.body, 0, 1, null) : BitConverterKt.toInt$default(this.body, 0, 1, null);
    }

    public final l1 getProtoPayload() {
        if (this.protoPayload == null) {
            this.protoPayload = decode();
        }
        return this.protoPayload;
    }

    public final int getServiceType() {
        int i7 = this.channel;
        return (i7 == 1 || i7 == 6) ? BitConverterKt.toInt(this.body, 4) : BitConverterKt.toInt(this.body, 8);
    }

    public final int getSize() {
        return getPayloadSize() + getCommandSize();
    }

    public final boolean getSupportEncrypt() {
        return getServiceType() != 98305 && getPayloadSize() > 0;
    }

    public final long getTag() {
        return this.tag;
    }

    public final long getTimestamp() {
        int i7 = this.channel;
        if (i7 == 1 || i7 == 6) {
            return 0L;
        }
        return BitConverterKt.toInt(this.body, 4);
    }

    public final ByteBuffer getWrappedBody() {
        return this.wrappedBody;
    }

    public final ByteBuffer getWrappedHeader() {
        return this.wrappedHeader;
    }

    public final byte[] header(boolean fill) {
        if (fill) {
            BitConverterKt.fillByteArray$default(this.channel, this.header, 0, 0, 6, null);
            BitConverterKt.fillByteArray$default(getSize(), this.header, 4, 0, 4, null);
        }
        return this.header;
    }

    public final void payload(l1 msg) {
        this.protoPayload = msg;
        if (msg == null) {
            setPayloadSize(0);
            return;
        }
        setPayloadSize(msg.getSerializedSize());
        byte[] bArr = this.body;
        int commandSize = getCommandSize();
        int serializedSize = msg.getSerializedSize();
        Logger logger = u.k;
        msg.writeTo(new r(bArr, commandSize, serializedSize));
    }

    public final void payload(ByteBuffer data, int size) {
        l.e(data, "data");
        setPayloadSize(size);
        data.get(this.body, getCommandSize(), size);
    }

    public final void payload(byte[] data, int offset, int length) {
        l.e(data, "data");
        setPayloadSize(length);
        System.arraycopy(data, offset, this.body, getCommandSize(), length);
    }

    public final void recycle() {
        if (this.refCount.get() != 0) {
            if (this.refCount.decrementAndGet() == 0) {
                INSTANCE.recycle(this);
            }
        } else {
            throw new IllegalStateException("this message " + hashCode() + " already recycled");
        }
    }

    public final void reset() {
        reset$default(this, BitConverterKt.toInt$default(this.header, 0, 1, null), BitConverterKt.toInt(this.header, 4), null, 4, null);
    }

    public final void reset(int channel, int length, byte[] data) {
        this.channel = channel;
        this.protoPayload = null;
        setPayloadSize(0);
        resizeBuffer(length);
        if (data != null) {
            System.arraycopy(data, 0, this.body, 0, length);
        }
    }

    public final void resetBuffer() {
        setBody(new byte[1024]);
    }

    public final void resizeBuffer(int newSize) {
        byte[] bArr = this.body;
        if (bArr.length < newSize) {
            byte[] bArr2 = new byte[newSize];
            System.arraycopy(bArr, 0, bArr2, 0, getCommandSize());
            setBody(bArr2);
        }
    }

    public final void setChannel(int i7) {
        this.channel = i7;
    }

    public final void setPayloadSize(int i7) {
        int i10 = this.channel;
        if (i10 == 1 || i10 == 6) {
            BitConverterKt.fillByteArray$default(i7, this.body, 0, 2, 2, null);
        } else {
            BitConverterKt.fillByteArray$default(i7, this.body, 0, 0, 6, null);
        }
        resizeBuffer(getSize());
    }

    public final void setServiceType(int i7) {
        int i10 = this.channel;
        if (i10 == 1 || i10 == 6) {
            BitConverterKt.fillByteArray$default(i7, this.body, 4, 0, 4, null);
        } else {
            BitConverterKt.fillByteArray$default(i7, this.body, 8, 0, 4, null);
        }
    }

    public final void setTag(long j5) {
        this.tag = j5;
    }

    public final void setTimestamp(long j5) {
        int i7 = this.channel;
        if (i7 == 1 || i7 == 6) {
            return;
        }
        BitConverterKt.fillByteArray$default((int) j5, this.body, 4, 0, 4, null);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("channel: ");
        sb2.append(this.channel);
        sb2.append(" serviceType: 0x000");
        int serviceType = getServiceType();
        n3.l.q(16);
        String string = Integer.toString(serviceType, 16);
        l.d(string, "toString(...)");
        sb2.append(string);
        sb2.append(" header size: ");
        sb2.append(getCommandSize());
        sb2.append("  payload size: ");
        sb2.append(getPayloadSize());
        if (getProtoPayload() != null) {
            str = " payload: " + getProtoPayload();
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}

package com.google.protobuf;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements l1 {
    protected int memoizedHashCode;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        b.addAll((Iterable) iterable, (List) collection);
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        b.addAll((Iterable) iterable, (List) list);
    }

    public static void checkByteStringIsUtf8(l lVar) {
        if (!lVar.p()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public final String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract int getSerializedSize(x1 x1Var);

    public z1 newUninitializedMessageException() {
        return new z1();
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = u.k;
            r rVar = new r(bArr, 0, serializedSize);
            writeTo(rVar);
            if (rVar.x0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e7) {
            throw new RuntimeException(a("byte array"), e7);
        }
    }

    public l toByteString() {
        try {
            int serializedSize = getSerializedSize();
            k kVar = l.f2785b;
            byte[] bArr = new byte[serializedSize];
            Logger logger = u.k;
            r rVar = new r(bArr, 0, serializedSize);
            writeTo(rVar);
            if (rVar.x0() == 0) {
                return new k(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e7) {
            throw new RuntimeException(a("ByteString"), e7);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int iE0 = u.e0(serializedSize) + serializedSize;
        if (iE0 > 4096) {
            iE0 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
        }
        t tVar = new t(outputStream, iE0);
        tVar.u0(serializedSize);
        writeTo(tVar);
        if (tVar.f2857o > 0) {
            tVar.C0();
        }
    }

    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        Logger logger = u.k;
        if (serializedSize > 4096) {
            serializedSize = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
        }
        t tVar = new t(outputStream, serializedSize);
        writeTo(tVar);
        if (tVar.f2857o > 0) {
            tVar.C0();
        }
    }
}

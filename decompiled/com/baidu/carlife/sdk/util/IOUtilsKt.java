package com.baidu.carlife.sdk.util;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0006*\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljava/io/InputStream;", "", "buffer", "", "offset", "length", "Lt8/z;", "blockRead", "(Ljava/io/InputStream;[BII)V", "Ljava/io/File;", "gzip", "(Ljava/io/File;)V", "carlife-sdk_release"}, k = 2, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class IOUtilsKt {
    public static final void blockRead(InputStream inputStream, byte[] bArr, int i7, int i10) throws IOException {
        l.e(inputStream, "<this>");
        l.e(bArr, "buffer");
        int i11 = i10;
        while (i11 > 0) {
            int i12 = inputStream.read(bArr, (i7 + i10) - i11, i11);
            if (i12 >= 0) {
                i11 -= i12;
            }
            if (Thread.interrupted()) {
                throw new IOException("read has been interrupted");
            }
        }
    }

    public static final void gzip(File file) {
        l.e(file, "<this>");
        File file2 = new File(file.getParentFile(), file.getName() + ".gz");
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file2));
                try {
                    a.a.u(bufferedInputStream, gZIPOutputStream);
                    gZIPOutputStream.close();
                    bufferedInputStream.close();
                    file.delete();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        g5.a.m(gZIPOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    g5.a.m(bufferedInputStream, th3);
                    throw th4;
                }
            }
        } catch (Exception unused) {
            file2.delete();
        }
    }
}

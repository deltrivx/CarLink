package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static af f3089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f3090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, String> f3091c = null;

    public af(Context context) {
        this.f3090b = context;
    }

    private static HttpURLConnection a(String str, String str2) {
        HttpURLConnection httpURLConnection;
        try {
            URL url = new URL(str2);
            Proxy proxy = an.f3140a;
            if (proxy != null) {
                httpURLConnection = (HttpURLConnection) url.openConnection(proxy);
            } else if (str == null || !str.toLowerCase(Locale.US).contains("wap")) {
                httpURLConnection = (HttpURLConnection) url.openConnection();
            } else {
                httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("http.proxyHost"), Integer.parseInt(System.getProperty("http.proxyPort")))));
            }
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(false);
            return httpURLConnection;
        } catch (Throwable th) {
            if (al.a(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    private static HttpURLConnection a(String str, byte[] bArr, String str2, Map<String, String> map) {
        if (str == null) {
            al.e("destUrl is null.", new Object[0]);
            return null;
        }
        HttpURLConnection httpURLConnectionA = a(str2, str);
        if (httpURLConnectionA == null) {
            al.e("Failed to get HttpURLConnection object.", new Object[0]);
            return null;
        }
        try {
            httpURLConnectionA.setRequestProperty("wup_version", "3.0");
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnectionA.setRequestProperty(entry.getKey(), URLEncoder.encode(entry.getValue(), "utf-8"));
                }
            }
            httpURLConnectionA.setRequestProperty("A37", URLEncoder.encode(str2, "utf-8"));
            httpURLConnectionA.setRequestProperty("A38", URLEncoder.encode(str2, "utf-8"));
            OutputStream outputStream = httpURLConnectionA.getOutputStream();
            if (bArr == null) {
                outputStream.write(0);
                return httpURLConnectionA;
            }
            outputStream.write(bArr);
            return httpURLConnectionA;
        } catch (Throwable th) {
            if (!al.a(th)) {
                th.printStackTrace();
            }
            al.e("Failed to upload, please check your network.", new Object[0]);
            return null;
        }
    }

    private static Map<String, String> a(HttpURLConnection httpURLConnection) {
        HashMap map = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields == null || headerFields.size() == 0) {
            return null;
        }
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list.size() > 0) {
                map.put(str, list.get(0));
            }
        }
        return map;
    }

    private static byte[] b(HttpURLConnection httpURLConnection) {
        BufferedInputStream bufferedInputStream;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i7 = bufferedInputStream.read(bArr);
                    if (i7 <= 0) {
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            bufferedInputStream.close();
                            return byteArray;
                        } catch (Throwable th) {
                            th.printStackTrace();
                            return byteArray;
                        }
                    }
                    byteArrayOutputStream.write(bArr, 0, i7);
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    if (!al.a(th)) {
                        th.printStackTrace();
                    }
                    return null;
                } finally {
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedInputStream = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0194  */
    /* JADX WARN: Code duplicated, block: B:113:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c0 A[Catch: all -> 0x00e3, IOException -> 0x00e7, TryCatch #1 {IOException -> 0x00e7, blocks: (B:27:0x00af, B:29:0x00c0, B:33:0x00d1, B:32:0x00cf), top: B:115:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cf A[Catch: all -> 0x00e3, IOException -> 0x00e7, TryCatch #1 {IOException -> 0x00e7, blocks: (B:27:0x00af, B:29:0x00c0, B:33:0x00d1, B:32:0x00cf), top: B:115:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:67:0x0127  */
    /* JADX WARN: Code duplicated, block: B:74:0x0145  */
    /* JADX WARN: Code duplicated, block: B:81:0x0155 A[PHI: r0 r4 r10 r11 r12
      0x0155: PHI (r0v15 'th' java.lang.Throwable) = (r0v14 'th' java.lang.Throwable), (r0v32 'th' java.lang.Throwable) binds: [B:101:0x0182, B:80:0x0153] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r4v8 int) = (r4v7 int), (r4v13 int) binds: [B:101:0x0182, B:80:0x0153] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r10v5 java.lang.String) = (r10v4 java.lang.String), (r10v10 java.lang.String) binds: [B:101:0x0182, B:80:0x0153] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r11v5 int) = (r11v4 int), (r11v8 int) binds: [B:101:0x0182, B:80:0x0153] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r12v6 boolean) = (r12v5 boolean), (r12v15 boolean) binds: [B:101:0x0182, B:80:0x0153] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0176 A[Catch: all -> 0x00e3, TRY_LEAVE, TryCatch #2 {all -> 0x00e3, blocks: (B:25:0x00a7, B:27:0x00af, B:29:0x00c0, B:33:0x00d1, B:32:0x00cf, B:72:0x013c, B:75:0x0147, B:94:0x0170, B:96:0x0176, B:55:0x00fe, B:57:0x0106, B:68:0x0129, B:70:0x0130), top: B:117:0x00a7 }] */
    public final byte[] a(String str, byte[] bArr, aj ajVar, Map<String, String> map) {
        long j5;
        int i7;
        String strC;
        HttpURLConnection httpURLConnectionA;
        int responseCode;
        String headerField;
        long contentLength;
        byte[] bArrB;
        long length;
        byte[] bArr2 = null;
        if (str == null) {
            al.e("Failed for no URL.", new Object[0]);
            return null;
        }
        long length2 = bArr == null ? 0L : bArr.length;
        int i10 = 1;
        al.c("request: %s, send: %d (pid=%d | tid=%d)", str, Long.valueOf(length2), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        String str2 = str;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        while (i11 <= 0 && i12 <= 0) {
            if (z10) {
                z10 = false;
            } else {
                i11++;
                if (i11 > i10) {
                    bArr2 = bArr2;
                    al.c("try time: ".concat(String.valueOf(i11)), new Object[0]);
                    j5 = 0;
                    SystemClock.sleep(((long) new Random(System.currentTimeMillis()).nextInt(10000)) + 10000);
                }
                i7 = i11;
                strC = ab.c(this.f3090b);
                if (strC == null) {
                    al.d("Failed to request for network not avail", new Object[0]);
                } else {
                    ajVar.a(length2);
                    httpURLConnectionA = a(str2, bArr, strC, map);
                    if (httpURLConnectionA != null) {
                        try {
                            try {
                                responseCode = httpURLConnectionA.getResponseCode();
                                try {
                                    al.c("response code ".concat(String.valueOf(responseCode)), new Object[0]);
                                    if (responseCode == 200) {
                                        this.f3091c = a(httpURLConnectionA);
                                        bArrB = b(httpURLConnectionA);
                                        if (bArrB == null) {
                                            length = j5;
                                        } else {
                                            length = bArrB.length;
                                        }
                                        ajVar.b(length);
                                        return bArrB;
                                    }
                                    if (responseCode != 301 || responseCode == 302 || responseCode == 303 || responseCode == 307) {
                                        try {
                                            headerField = httpURLConnectionA.getHeaderField("Location");
                                            if (headerField == null) {
                                                try {
                                                    al.e("Failed to redirect: %d".concat(String.valueOf(responseCode)), new Object[0]);
                                                    try {
                                                        httpURLConnectionA.disconnect();
                                                    } catch (Throwable th) {
                                                        if (!al.a(th)) {
                                                            th.printStackTrace();
                                                        }
                                                    }
                                                    return bArr2;
                                                } catch (IOException e7) {
                                                    e = e7;
                                                    z10 = true;
                                                }
                                            } else {
                                                i12++;
                                                try {
                                                    try {
                                                        al.c("redirect code: %d ,to:%s", Integer.valueOf(responseCode), headerField);
                                                        str2 = headerField;
                                                        i7 = 0;
                                                        z10 = true;
                                                    } catch (IOException e10) {
                                                        e = e10;
                                                        str2 = headerField;
                                                        i7 = 0;
                                                        z10 = true;
                                                    }
                                                } catch (IOException e11) {
                                                    e = e11;
                                                }
                                            }
                                        } catch (IOException e12) {
                                            e = e12;
                                        }
                                    }
                                    try {
                                        contentLength = httpURLConnectionA.getContentLength();
                                        if (contentLength < j5) {
                                            contentLength = j5;
                                        }
                                        ajVar.b(contentLength);
                                        try {
                                            httpURLConnectionA.disconnect();
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (!al.a(th)) {
                                                th.printStackTrace();
                                            }
                                        }
                                    } catch (IOException e13) {
                                        e = e13;
                                        if (!al.a(e)) {
                                            e.printStackTrace();
                                        }
                                        try {
                                            httpURLConnectionA.disconnect();
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (!al.a(th)) {
                                                th.printStackTrace();
                                            }
                                        }
                                    }
                                } catch (IOException e14) {
                                    e = e14;
                                }
                            } finally {
                                try {
                                    httpURLConnectionA.disconnect();
                                } catch (Throwable th4) {
                                    if (!al.a(th4)) {
                                        th4.printStackTrace();
                                    }
                                }
                            }
                        } catch (IOException e15) {
                            e = e15;
                        }
                    } else {
                        al.c("Failed to execute post.", new Object[0]);
                        ajVar.b(j5);
                    }
                }
                i11 = i7;
                bArr2 = bArr2;
                i10 = 1;
            }
            j5 = 0;
            i7 = i11;
            strC = ab.c(this.f3090b);
            if (strC == null) {
                al.d("Failed to request for network not avail", new Object[0]);
            } else {
                ajVar.a(length2);
                httpURLConnectionA = a(str2, bArr, strC, map);
                if (httpURLConnectionA != null) {
                    responseCode = httpURLConnectionA.getResponseCode();
                    al.c("response code ".concat(String.valueOf(responseCode)), new Object[0]);
                    if (responseCode == 200) {
                        this.f3091c = a(httpURLConnectionA);
                        bArrB = b(httpURLConnectionA);
                        if (bArrB == null) {
                            length = j5;
                        } else {
                            length = bArrB.length;
                        }
                        ajVar.b(length);
                        return bArrB;
                    }
                    if (responseCode != 301) {
                        headerField = httpURLConnectionA.getHeaderField("Location");
                        if (headerField == null) {
                            al.e("Failed to redirect: %d".concat(String.valueOf(responseCode)), new Object[0]);
                            httpURLConnectionA.disconnect();
                            return bArr2;
                        }
                        i12++;
                        al.c("redirect code: %d ,to:%s", Integer.valueOf(responseCode), headerField);
                        str2 = headerField;
                        i7 = 0;
                        z10 = true;
                        contentLength = httpURLConnectionA.getContentLength();
                        if (contentLength < j5) {
                            contentLength = j5;
                        }
                        ajVar.b(contentLength);
                        httpURLConnectionA.disconnect();
                    } else {
                        headerField = httpURLConnectionA.getHeaderField("Location");
                        if (headerField == null) {
                            al.e("Failed to redirect: %d".concat(String.valueOf(responseCode)), new Object[0]);
                            httpURLConnectionA.disconnect();
                            return bArr2;
                        }
                        i12++;
                        al.c("redirect code: %d ,to:%s", Integer.valueOf(responseCode), headerField);
                        str2 = headerField;
                        i7 = 0;
                        z10 = true;
                        contentLength = httpURLConnectionA.getContentLength();
                        if (contentLength < j5) {
                            contentLength = j5;
                        }
                        ajVar.b(contentLength);
                        httpURLConnectionA.disconnect();
                    }
                    if (!al.a(e)) {
                        e.printStackTrace();
                    }
                    httpURLConnectionA.disconnect();
                } else {
                    al.c("Failed to execute post.", new Object[0]);
                    ajVar.b(j5);
                }
            }
            i11 = i7;
            bArr2 = bArr2;
            i10 = 1;
        }
        return bArr2;
    }
}

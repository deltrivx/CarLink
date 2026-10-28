package s8;

import android.support.v4.media.session.r;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.regex.Matcher;
import javax.net.ssl.SSLException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f12609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OutputStream f12610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BufferedInputStream f12611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f12614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap f12616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f12617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f12618j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f12619l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f12620m;

    public f(l lVar, r rVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.f12620m = lVar;
        this.f12609a = rVar;
        this.f12611c = new BufferedInputStream(inputStream, ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT);
        this.f12610b = outputStream;
        this.k = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.f12617i = new HashMap();
    }

    public static void c(Map map, String str) {
        String strTrim;
        String strB;
        if (str == null) {
            return;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(61);
            if (iIndexOf >= 0) {
                strTrim = l.b(strNextToken.substring(0, iIndexOf)).trim();
                strB = l.b(strNextToken.substring(iIndexOf + 1));
            } else {
                strTrim = l.b(strNextToken).trim();
                strB = "";
            }
            List arrayList = (List) map.get(strTrim);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(strTrim, arrayList);
            }
            arrayList.add(strB);
        }
    }

    public static int e(byte[] bArr, int i7) {
        int i10;
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i7) {
                return 0;
            }
            byte b10 = bArr[i11];
            if (b10 == 13 && bArr[i12] == 10 && (i10 = i11 + 3) < i7 && bArr[i11 + 2] == 13 && bArr[i10] == 10) {
                return i11 + 4;
            }
            if (b10 == 10 && bArr[i12] == 10) {
                return i11 + 2;
            }
            i11 = i12;
        }
    }

    public static int[] f(ByteBuffer byteBuffer, byte[] bArr) {
        int[] iArr = new int[0];
        if (byteBuffer.remaining() < bArr.length) {
            return iArr;
        }
        int length = bArr.length + ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
        byte[] bArr2 = new byte[length];
        int iRemaining = byteBuffer.remaining() < length ? byteBuffer.remaining() : length;
        byteBuffer.get(bArr2, 0, iRemaining);
        int length2 = iRemaining - bArr.length;
        int i7 = 0;
        do {
            for (int i10 = 0; i10 < length2; i10++) {
                for (int i11 = 0; i11 < bArr.length && bArr2[i10 + i11] == bArr[i11]; i11++) {
                    if (i11 == bArr.length - 1) {
                        int[] iArr2 = new int[iArr.length + 1];
                        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                        iArr2[iArr.length] = i7 + i10;
                        iArr = iArr2;
                    }
                }
            }
            i7 += length2;
            System.arraycopy(bArr2, length - bArr.length, bArr2, 0, bArr.length);
            length2 = length - bArr.length;
            if (byteBuffer.remaining() < length2) {
                length2 = byteBuffer.remaining();
            }
            byteBuffer.get(bArr2, bArr.length, length2);
        } while (length2 > 0);
        return iArr;
    }

    public final void a(BufferedReader bufferedReader, HashMap map, HashMap map2, HashMap map3) throws k {
        String strB;
        try {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(line);
            boolean zHasMoreTokens = stringTokenizer.hasMoreTokens();
            i iVar = i.f12623d;
            if (!zHasMoreTokens) {
                throw new k(iVar, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            }
            map.put("method", stringTokenizer.nextToken());
            if (!stringTokenizer.hasMoreTokens()) {
                throw new k(iVar, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
            }
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(63);
            if (iIndexOf >= 0) {
                c(map2, strNextToken.substring(iIndexOf + 1));
                strB = l.b(strNextToken.substring(0, iIndexOf));
            } else {
                strB = l.b(strNextToken);
            }
            if (stringTokenizer.hasMoreTokens()) {
                this.f12619l = stringTokenizer.nextToken();
            } else {
                this.f12619l = "HTTP/1.1";
                l.f12643g.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
            }
            String line2 = bufferedReader.readLine();
            while (line2 != null && !line2.trim().isEmpty()) {
                int iIndexOf2 = line2.indexOf(58);
                if (iIndexOf2 >= 0) {
                    map3.put(line2.substring(0, iIndexOf2).trim().toLowerCase(Locale.US), line2.substring(iIndexOf2 + 1).trim());
                }
                line2 = bufferedReader.readLine();
            }
            map.put("uri", strB);
        } catch (IOException e7) {
            throw new k("SERVER INTERNAL ERROR: IOException: " + e7.getMessage(), e7);
        }
    }

    public final void b(b bVar, ByteBuffer byteBuffer, HashMap map, HashMap map2) throws Throwable {
        b bVar2 = bVar;
        String str = bVar2.f12602d;
        i iVar = i.f12625f;
        try {
            int[] iArrF = f(byteBuffer, str.getBytes());
            int length = iArrF.length;
            i iVar2 = i.f12623d;
            try {
                if (length < 2) {
                    throw new k(iVar2, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
                }
                int i7 = 1024;
                byte[] bArr = new byte[1024];
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i11 < iArrF.length - 1) {
                    byteBuffer.position(iArrF[i11]);
                    int iRemaining = byteBuffer.remaining() < i7 ? byteBuffer.remaining() : 1024;
                    byteBuffer.get(bArr, i10, iRemaining);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, i10, iRemaining), Charset.forName(bVar2.a())), iRemaining);
                    String line = bufferedReader.readLine();
                    if (line == null || !line.contains(str)) {
                        throw new k(iVar2, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
                    }
                    String line2 = bufferedReader.readLine();
                    String strGroup = null;
                    String strTrim = null;
                    int i13 = i12;
                    int i14 = 2;
                    String str2 = null;
                    while (line2 != null && line2.trim().length() > 0) {
                        Matcher matcher = l.f12640d.matcher(line2);
                        if (matcher.matches()) {
                            Matcher matcher2 = l.f12642f.matcher(matcher.group(2));
                            while (matcher2.find()) {
                                int[] iArr = iArrF;
                                String strGroup2 = matcher2.group(1);
                                if ("name".equalsIgnoreCase(strGroup2)) {
                                    strGroup = matcher2.group(2);
                                } else if ("filename".equalsIgnoreCase(strGroup2)) {
                                    String strGroup3 = matcher2.group(2);
                                    if (strGroup3.isEmpty()) {
                                        str2 = strGroup3;
                                    } else if (i13 > 0) {
                                        str2 = strGroup3;
                                        i13++;
                                        strGroup = strGroup + String.valueOf(i13);
                                    } else {
                                        i13++;
                                        str2 = strGroup3;
                                    }
                                }
                                iArrF = iArr;
                            }
                        }
                        int[] iArr2 = iArrF;
                        Matcher matcher3 = l.f12641e.matcher(line2);
                        if (matcher3.matches()) {
                            strTrim = matcher3.group(2).trim();
                        }
                        line2 = bufferedReader.readLine();
                        i14++;
                        iArrF = iArr2;
                        str = str;
                    }
                    String str3 = str;
                    int[] iArr3 = iArrF;
                    int i15 = 0;
                    while (true) {
                        int i16 = i14 - 1;
                        if (i14 <= 0) {
                            break;
                        }
                        while (bArr[i15] != 10) {
                            i15++;
                        }
                        i15++;
                        i14 = i16;
                    }
                    if (i15 >= iRemaining - 4) {
                        throw new k(iVar, "Multipart header size exceeds MAX_HEADER_SIZE.");
                    }
                    int i17 = iArr3[i11] + i15;
                    i11++;
                    int i18 = iArr3[i11] - 4;
                    byteBuffer.position(i17);
                    List arrayList = (List) map.get(strGroup);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(strGroup, arrayList);
                    }
                    if (strTrim == null) {
                        byte[] bArr2 = new byte[i18 - i17];
                        byteBuffer.get(bArr2);
                        arrayList.add(new String(bArr2, bVar.a()));
                    } else {
                        String strH = h(byteBuffer, i17, i18 - i17);
                        if (map2.containsKey(strGroup)) {
                            int i19 = 2;
                            while (true) {
                                if (!map2.containsKey(strGroup + i19)) {
                                    break;
                                } else {
                                    i19++;
                                }
                            }
                            map2.put(strGroup + i19, strH);
                        } else {
                            map2.put(strGroup, strH);
                        }
                        arrayList.add(str2);
                    }
                    bVar2 = bVar;
                    iArrF = iArr3;
                    i12 = i13;
                    str = str3;
                    i7 = 1024;
                    i10 = 0;
                }
            } catch (k e7) {
                throw e7;
            } catch (Exception e10) {
                e = e10;
                throw new k(iVar, e.toString());
            }
        } catch (k e11) {
            throw e11;
        } catch (Exception e12) {
            e = e12;
        }
    }

    public final void d() {
        i iVar = i.f12625f;
        l lVar = this.f12620m;
        r rVar = this.f12609a;
        BufferedInputStream bufferedInputStream = this.f12611c;
        OutputStream outputStream = this.f12610b;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT];
                        boolean z10 = false;
                        this.f12612d = 0;
                        this.f12613e = 0;
                        bufferedInputStream.mark(ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT);
                        try {
                            int i7 = bufferedInputStream.read(bArr, 0, ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT);
                            if (i7 == -1) {
                                l.d(bufferedInputStream);
                                l.d(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (i7 > 0) {
                                int i10 = this.f12613e + i7;
                                this.f12613e = i10;
                                int iE = e(bArr, i10);
                                this.f12612d = iE;
                                if (iE > 0) {
                                    break;
                                }
                                int i11 = this.f12613e;
                                i7 = bufferedInputStream.read(bArr, i11, 8192 - i11);
                            }
                            if (this.f12612d < this.f12613e) {
                                bufferedInputStream.reset();
                                bufferedInputStream.skip(this.f12612d);
                            }
                            this.f12616h = new HashMap();
                            HashMap map = this.f12617i;
                            if (map == null) {
                                this.f12617i = new HashMap();
                            } else {
                                map.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f12613e)));
                            HashMap map2 = new HashMap();
                            a(bufferedReader, map2, this.f12616h, this.f12617i);
                            String str = this.k;
                            if (str != null) {
                                this.f12617i.put("remote-addr", str);
                                this.f12617i.put("http-client-ip", str);
                            }
                            int iH = ob.a.h((String) map2.get("method"));
                            this.f12615g = iH;
                            if (iH == 0) {
                                throw new k(i.f12623d, "BAD REQUEST: Syntax error. HTTP verb " + ((String) map2.get("method")) + " unhandled.");
                            }
                            this.f12614f = (String) map2.get("uri");
                            this.f12618j = new c(this.f12617i);
                            String str2 = (String) this.f12617i.get("connection");
                            boolean z11 = "HTTP/1.1".equals(this.f12619l) && (str2 == null || !str2.matches("(?i).*close.*"));
                            j jVarE = lVar.e(this);
                            String str3 = (String) this.f12617i.get("accept-encoding");
                            this.f12618j.c();
                            jVarE.l(this.f12615g);
                            if (l.g(jVarE) && str3 != null && str3.contains("gzip")) {
                                z10 = true;
                            }
                            jVarE.h(z10);
                            jVarE.j(z11);
                            jVarE.d(outputStream);
                            if (!z11 || jVarE.b()) {
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            l.d(jVarE);
                            rVar.r();
                        } catch (SSLException e7) {
                            throw e7;
                        } catch (IOException unused) {
                            l.d(bufferedInputStream);
                            l.d(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (k e10) {
                        l.c(e10.a(), "text/plain", e10.getMessage()).d(outputStream);
                        l.d(outputStream);
                        l.d(null);
                        rVar.r();
                    }
                } catch (SSLException e11) {
                    l.c(iVar, "text/plain", "SSL PROTOCOL FAILURE: " + e11.getMessage()).d(outputStream);
                    l.d(outputStream);
                    l.d(null);
                    rVar.r();
                } catch (IOException e12) {
                    l.c(iVar, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e12.getMessage()).d(outputStream);
                    l.d(outputStream);
                    l.d(null);
                    rVar.r();
                }
            } catch (SocketException e13) {
                throw e13;
            } catch (SocketTimeoutException e14) {
                throw e14;
            }
        } catch (Throwable th) {
            l.d(null);
            rVar.r();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(HashMap map) {
        long j5;
        DataOutput randomAccessFile;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteBuffer map2;
        RandomAccessFile randomAccessFile2 = 0;
        try {
            if (this.f12617i.containsKey("content-length")) {
                j5 = Long.parseLong((String) this.f12617i.get("content-length"));
            } else {
                int i7 = this.f12612d;
                int i10 = this.f12613e;
                j5 = i7 < i10 ? i10 - i7 : 0L;
            }
            if (j5 < 1024) {
                byteArrayOutputStream = new ByteArrayOutputStream();
                randomAccessFile = new DataOutputStream(byteArrayOutputStream);
            } else {
                try {
                    r rVar = this.f12609a;
                    e eVar = new e((File) rVar.f604b);
                    ((ArrayList) rVar.f605c).add(eVar);
                    randomAccessFile = new RandomAccessFile(eVar.f12607a.getAbsolutePath(), "rw");
                    byteArrayOutputStream = null;
                    randomAccessFile2 = randomAccessFile;
                } catch (Exception e7) {
                    throw new Error(e7);
                }
            }
            byte[] bArr = new byte[512];
            while (this.f12613e >= 0 && j5 > 0) {
                int i11 = this.f12611c.read(bArr, 0, (int) Math.min(j5, 512L));
                this.f12613e = i11;
                j5 -= (long) i11;
                if (i11 > 0) {
                    randomAccessFile.write(bArr, 0, i11);
                }
            }
            if (byteArrayOutputStream != null) {
                map2 = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
            } else {
                map2 = randomAccessFile2.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile2.length());
                randomAccessFile2.seek(0L);
            }
            if (e1.d.a(3, this.f12615g)) {
                b bVar = new b((String) this.f12617i.get("content-type"));
                String str = bVar.f12600b;
                if (!"multipart/form-data".equalsIgnoreCase(str)) {
                    byte[] bArr2 = new byte[map2.remaining()];
                    map2.get(bArr2);
                    String strTrim = new String(bArr2, bVar.a()).trim();
                    if ("application/x-www-form-urlencoded".equalsIgnoreCase(str)) {
                        c(this.f12616h, strTrim);
                    } else if (strTrim.length() != 0) {
                        map.put("postData", strTrim);
                    }
                } else {
                    if (bVar.f12602d == null) {
                        throw new k(i.f12623d, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                    }
                    b(bVar, map2, this.f12616h, map);
                }
            } else if (e1.d.a(2, this.f12615g)) {
                map.put("content", h(map2, 0, map2.limit()));
            }
            l.d(randomAccessFile2);
        } catch (Throwable th) {
            l.d(null);
            throw th;
        }
    }

    public final String h(ByteBuffer byteBuffer, int i7, int i10) throws Throwable {
        if (i10 <= 0) {
            return "";
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                r rVar = this.f12609a;
                e eVar = new e((File) rVar.f604b);
                ((ArrayList) rVar.f605c).add(eVar);
                File file = eVar.f12607a;
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file.getAbsolutePath());
                try {
                    FileChannel channel = fileOutputStream2.getChannel();
                    byteBufferDuplicate.position(i7).limit(i7 + i10);
                    channel.write(byteBufferDuplicate.slice());
                    String absolutePath = file.getAbsolutePath();
                    l.d(fileOutputStream2);
                    return absolutePath;
                } catch (Exception e7) {
                    e = e7;
                    throw new Error(e);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    l.d(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }
}

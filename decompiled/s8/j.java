package s8;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f12629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InputStream f12631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f12633e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f12634f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12638j;

    public j(i iVar, String str, InputStream inputStream, long j5) {
        this.f12629a = iVar;
        this.f12630b = str;
        this.f12631c = inputStream;
        this.f12632d = j5;
        this.f12636h = j5 < 0;
        this.f12638j = true;
    }

    public static void c(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public final String a(String str) {
        return (String) this.f12634f.get(str.toLowerCase());
    }

    public final boolean b() {
        return "close".equals(a("connection"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f12631c;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void d(OutputStream outputStream) {
        String str = this.f12630b;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        i iVar = this.f12629a;
        try {
            if (iVar == null) {
                throw new Error("sendResponse(): Status can't be null.");
            }
            PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, new b(str).a())), false);
            printWriter.append("HTTP/1.1 ").append("" + iVar.f12627a + " " + iVar.f12628b).append(" \r\n");
            if (str != null) {
                c(printWriter, "Content-Type", str);
            }
            if (a("date") == null) {
                c(printWriter, "Date", simpleDateFormat.format(new Date()));
            }
            for (Map.Entry entry : this.f12633e.entrySet()) {
                c(printWriter, (String) entry.getKey(), (String) entry.getValue());
            }
            if (a("connection") == null) {
                c(printWriter, "Connection", this.f12638j ? "keep-alive" : "close");
            }
            if (a("content-length") != null) {
                this.f12637i = false;
            }
            if (this.f12637i) {
                c(printWriter, "Content-Encoding", "gzip");
                this.f12636h = true;
            }
            InputStream inputStream = this.f12631c;
            long jG = inputStream != null ? this.f12632d : 0L;
            if (this.f12635g != 5 && this.f12636h) {
                c(printWriter, "Transfer-Encoding", "chunked");
            } else if (!this.f12637i) {
                jG = g(printWriter, jG);
            }
            printWriter.append("\r\n");
            printWriter.flush();
            if (this.f12635g != 5 && this.f12636h) {
                h hVar = new h(outputStream);
                if (this.f12637i) {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(hVar);
                    e(gZIPOutputStream, -1L);
                    gZIPOutputStream.finish();
                } else {
                    e(hVar, -1L);
                }
                hVar.a();
            } else if (this.f12637i) {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                e(gZIPOutputStream2, -1L);
                gZIPOutputStream2.finish();
            } else {
                e(outputStream, jG);
            }
            outputStream.flush();
            l.d(inputStream);
        } catch (IOException e7) {
            l.f12643g.log(Level.SEVERE, "Could not send response to the client", (Throwable) e7);
        }
    }

    public final void e(OutputStream outputStream, long j5) throws IOException {
        byte[] bArr = new byte[(int) 16384];
        boolean z10 = j5 == -1;
        while (true) {
            if (j5 <= 0 && !z10) {
                return;
            }
            int i7 = this.f12631c.read(bArr, 0, (int) (z10 ? 16384L : Math.min(j5, 16384L)));
            if (i7 <= 0) {
                return;
            }
            outputStream.write(bArr, 0, i7);
            if (!z10) {
                j5 -= (long) i7;
            }
        }
    }

    public final long g(PrintWriter printWriter, long j5) {
        String strA = a("content-length");
        if (strA != null) {
            try {
                j5 = Long.parseLong(strA);
            } catch (NumberFormatException unused) {
                l.f12643g.severe("content-length was no number ".concat(strA));
            }
        }
        printWriter.print("Content-Length: " + j5 + "\r\n");
        return j5;
    }

    public final void h(boolean z10) {
        this.f12637i = z10;
    }

    public final void j(boolean z10) {
        this.f12638j = z10;
    }

    public final void l(int i7) {
        this.f12635g = i7;
    }
}

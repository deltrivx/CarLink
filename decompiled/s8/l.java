package s8;

import com.tencent.bugly.proguard.p0;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f12640d = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f12641e = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f12642f = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f12643g = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile ServerSocket f12644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f12645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f12646c;

    public static String b(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e7) {
            f12643g.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e7);
            return null;
        }
    }

    public static j c(i iVar, String str, String str2) {
        byte[] bytes;
        b bVar = new b(str);
        if (str2 == null) {
            return new j(iVar, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(bVar.a()).newEncoder().canEncode(str2) && bVar.f12601c == null) {
                bVar = new b(str.concat("; charset=UTF-8"));
            }
            bytes = str2.getBytes(bVar.a());
        } catch (UnsupportedEncodingException e7) {
            f12643g.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e7);
            bytes = new byte[0];
        }
        return new j(iVar, bVar.f12599a, new ByteArrayInputStream(bytes), bytes.length);
    }

    public static final void d(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (!(obj instanceof ServerSocket)) {
                        throw new IllegalArgumentException("Unknown object to close");
                    }
                    ((ServerSocket) obj).close();
                }
            } catch (IOException e7) {
                f12643g.log(Level.SEVERE, "Could not close", (Throwable) e7);
            }
        }
    }

    public static boolean g(j jVar) {
        String str = jVar.f12630b;
        if (str != null) {
            return str.toLowerCase().contains("text/") || str.toLowerCase().contains("/json");
        }
        return false;
    }

    public abstract j e(f fVar);

    public final void f() throws IOException {
        this.f12644a = new ServerSocket();
        this.f12644a.setReuseAddress(true);
        p0 p0Var = new p0(this);
        Thread thread = new Thread(p0Var);
        this.f12645b = thread;
        thread.setDaemon(true);
        this.f12645b.setName("NanoHttpd Main Listener");
        this.f12645b.start();
        while (!p0Var.f3469b && ((IOException) p0Var.f3470c) == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        IOException iOException = (IOException) p0Var.f3470c;
        if (iOException != null) {
            throw iOException;
        }
    }
}

package s8;

import android.support.v4.media.session.r;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f12593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Socket f12594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f12595c;

    public a(l lVar, InputStream inputStream, Socket socket) {
        this.f12595c = lVar;
        this.f12593a = inputStream;
        this.f12594b = socket;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        InputStream inputStream = this.f12593a;
        l lVar = this.f12595c;
        Socket socket = this.f12594b;
        OutputStream outputStream = null;
        try {
            try {
                OutputStream outputStream2 = socket.getOutputStream();
                try {
                    f fVar = new f(lVar, new r(24), this.f12593a, outputStream2, socket.getInetAddress());
                    while (!socket.isClosed()) {
                        fVar.d();
                    }
                    l.d(outputStream2);
                } catch (Exception e7) {
                    e = e7;
                    outputStream = outputStream2;
                    if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                        l.f12643g.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
                    }
                    l.d(outputStream);
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    l.d(outputStream);
                    l.d(inputStream);
                    l.d(socket);
                    ((List) lVar.f12646c.f12606b).remove(this);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
        }
        l.d(inputStream);
        l.d(socket);
        ((List) lVar.f12646c.f12606b).remove(this);
    }
}

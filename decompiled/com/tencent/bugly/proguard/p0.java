package com.tencent.bugly.proguard;

import com.tencent.bugly.crashreport.biz.UserInfoBean;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3471d;

    public p0(r rVar, UserInfoBean userInfoBean, boolean z10) {
        this.f3468a = 0;
        this.f3471d = rVar;
        this.f3470c = userInfoBean;
        this.f3469b = z10;
    }

    public p0(s8.l lVar) {
        this.f3468a = 1;
        this.f3471d = lVar;
        this.f3469b = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3468a) {
            case 0:
                UserInfoBean userInfoBean = (UserInfoBean) this.f3470c;
                r rVar = (r) this.f3471d;
                if (rVar.f3478d) {
                    if (userInfoBean != null) {
                        try {
                            r.a(userInfoBean);
                            al.c("[UserInfo] Record user info.", new Object[0]);
                            rVar.a(userInfoBean, false);
                        } catch (Throwable th) {
                            if (al.a(th)) {
                                return;
                            }
                            th.printStackTrace();
                        }
                    }
                    if (this.f3469b) {
                        rVar.b();
                    }
                    break;
                }
                break;
            default:
                try {
                    ((s8.l) this.f3471d).f12644a.bind(new InetSocketAddress(18080));
                    this.f3469b = true;
                    do {
                        try {
                            Socket socketAccept = ((s8.l) this.f3471d).f12644a.accept();
                            socketAccept.setSoTimeout(5000);
                            InputStream inputStream = socketAccept.getInputStream();
                            s8.l lVar = (s8.l) this.f3471d;
                            lVar.f12646c.b(new s8.a(lVar, inputStream, socketAccept));
                        } catch (IOException e7) {
                            s8.l.f12643g.log(Level.FINE, "Communication with the client broken", (Throwable) e7);
                        }
                    } while (!((s8.l) this.f3471d).f12644a.isClosed());
                } catch (IOException e10) {
                    this.f3470c = e10;
                    return;
                }
                break;
        }
    }
}

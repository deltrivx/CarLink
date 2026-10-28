package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class ai {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ai f3105b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ah f3106a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f3108d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f3110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f3111g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<Integer, Long> f3109e = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private LinkedBlockingQueue<Runnable> f3112h = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinkedBlockingQueue<Runnable> f3113i = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f3114j = new Object();
    private long k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f3115l = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f3107c = w.a();

    private ai(Context context) {
        this.f3108d = context;
    }

    public static synchronized ai a() {
        return f3105b;
    }

    public static synchronized ai a(Context context) {
        try {
            if (f3105b == null) {
                f3105b = new ai(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3105b;
    }

    private void a(int i7, int i10, byte[] bArr, String str, String str2, ah ahVar, boolean z10) {
        try {
            a(new aj(this.f3108d, i7, i10, bArr, str, str2, ahVar, 0, 0, false), z10, false, 0L);
        } catch (Throwable th) {
            if (al.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    private void a(int i7, LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
        ak akVarA = ak.a();
        int i10 = 2;
        boolean z10 = false;
        if (i7 > 0) {
            al.c("[UploadManager] Execute urgent upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(i7), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        }
        for (int i11 = 0; i11 < i7; i11++) {
            Runnable runnablePoll = linkedBlockingQueue.poll();
            if (runnablePoll == null) {
                return;
            }
            synchronized (this.f3114j) {
                try {
                    if (this.f3115l < 2 || akVarA == null) {
                        al.a("[UploadManager] Create and start a new thread to execute a upload task: %s", "BUGLY_ASYNC_UPLOAD");
                        if (ap.a(new b4.a(i10, this, runnablePoll, z10), "BUGLY_ASYNC_UPLOAD") != null) {
                            synchronized (this.f3114j) {
                                this.f3115l++;
                            }
                        } else {
                            al.d("[UploadManager] Failed to start a thread to execute asynchronous upload task,will try again next time.", new Object[0]);
                            a(runnablePoll, true);
                        }
                    } else {
                        akVarA.a(runnablePoll);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void a(Runnable runnable, long j5) {
        if (runnable == null) {
            al.d("[UploadManager] Upload task should not be null", new Object[0]);
            return;
        }
        al.c("[UploadManager] Execute synchronized upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        Thread threadA = ap.a(runnable, "BUGLY_SYNC_UPLOAD");
        if (threadA == null) {
            al.e("[UploadManager] Failed to start a thread to execute synchronized upload task, add it to queue.", new Object[0]);
            a(runnable, true);
            return;
        }
        try {
            threadA.join(j5);
        } catch (Throwable th) {
            al.e("[UploadManager] Failed to join upload synchronized task with message: %s. Add it to queue.", th.getMessage());
            a(runnable, true);
            b();
        }
    }

    private void a(Runnable runnable, boolean z10, boolean z11, long j5) {
        al.c("[UploadManager] Add upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        if (z11) {
            a(runnable, j5);
        } else {
            a(runnable, z10);
            b();
        }
    }

    private static void a(LinkedBlockingQueue<Runnable> linkedBlockingQueue, LinkedBlockingQueue<Runnable> linkedBlockingQueue2, int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            Runnable runnablePeek = linkedBlockingQueue.peek();
            if (runnablePeek == null) {
                return;
            }
            try {
                linkedBlockingQueue2.put(runnablePeek);
                linkedBlockingQueue.poll();
            } catch (Throwable th) {
                al.e("[UploadManager] Failed to add upload task to temp urgent queue: %s", th.getMessage());
            }
        }
    }

    private boolean a(Runnable runnable, boolean z10) {
        if (runnable == null) {
            al.a("[UploadManager] Upload task should not be null", new Object[0]);
            return false;
        }
        try {
            al.c("[UploadManager] Add upload task to queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            synchronized (this.f3114j) {
                try {
                    if (z10) {
                        this.f3112h.put(runnable);
                    } else {
                        this.f3113i.put(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } catch (Throwable th2) {
            al.e("[UploadManager] Failed to add upload task to queue: %s", th2.getMessage());
            return false;
        }
    }

    public static /* synthetic */ int b(ai aiVar) {
        int i7 = aiVar.f3115l - 1;
        aiVar.f3115l = i7;
        return i7;
    }

    private void b() {
        ak akVarA = ak.a();
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        synchronized (this.f3114j) {
            try {
                al.c("[UploadManager] Try to poll all upload task need and put them into temp queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                int size = this.f3112h.size();
                int size2 = this.f3113i.size();
                if (size == 0 && size2 == 0) {
                    al.c("[UploadManager] There is no upload task in queue.", new Object[0]);
                    return;
                }
                if (akVarA == null || !akVarA.c()) {
                    size2 = 0;
                }
                a(this.f3112h, linkedBlockingQueue, size);
                a(this.f3113i, linkedBlockingQueue2, size2);
                a(size, linkedBlockingQueue);
                if (size2 > 0) {
                    al.c("[UploadManager] Execute upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(size2), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                }
                ak akVarA2 = ak.a();
                if (akVarA2 != null) {
                    akVarA2.a(new b4.b(size2, linkedBlockingQueue2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized long a(int i7) {
        try {
            if (i7 >= 0) {
                Long l10 = this.f3109e.get(Integer.valueOf(i7));
                if (l10 != null) {
                    return l10.longValue();
                }
            } else {
                al.e("[UploadManager] Unknown upload ID: %d", Integer.valueOf(i7));
            }
            return 0L;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final long a(boolean z10) {
        long jD;
        long jB = ap.b();
        int i7 = z10 ? 5 : 3;
        List<y> listA = this.f3107c.a(i7);
        if (listA == null || listA.size() <= 0) {
            jD = z10 ? this.f3111g : this.f3110f;
        } else {
            jD = 0;
            try {
                y yVar = listA.get(0);
                if (yVar.f3523e >= jB) {
                    jD = ap.d(yVar.f3525g);
                    if (i7 == 3) {
                        this.f3110f = jD;
                    } else {
                        this.f3111g = jD;
                    }
                    listA.remove(yVar);
                }
            } catch (Throwable th) {
                al.a(th);
            }
            if (listA.size() > 0) {
                this.f3107c.a(listA);
            }
        }
        al.c("[UploadManager] Local network consume: %d KB", Long.valueOf(jD / 1024));
        return jD;
    }

    public final synchronized void a(int i7, long j5) {
        try {
            if (i7 < 0) {
                al.e("[UploadManager] Unknown uploading ID: %d", Integer.valueOf(i7));
                return;
            }
            this.f3109e.put(Integer.valueOf(i7), Long.valueOf(j5));
            y yVar = new y();
            yVar.f3520b = i7;
            yVar.f3523e = j5;
            yVar.f3521c = "";
            yVar.f3522d = "";
            yVar.f3525g = new byte[0];
            this.f3107c.b(i7);
            this.f3107c.a(yVar);
            al.c("[UploadManager] Uploading(ID:%d) time: %s", Integer.valueOf(i7), ap.a(j5));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(int i7, bq bqVar, String str, String str2, ah ahVar, long j5, boolean z10) {
        try {
            a(new aj(this.f3108d, i7, bqVar.f3340g, ae.a((Object) bqVar), str, str2, ahVar, z10), true, true, j5);
        } catch (Throwable th) {
            if (al.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    public final void a(int i7, bq bqVar, String str, String str2, ah ahVar, boolean z10) {
        a(i7, bqVar.f3340g, ae.a((Object) bqVar), str, str2, ahVar, z10);
    }

    public final synchronized void a(long j5, boolean z10) {
        int i7 = z10 ? 5 : 3;
        try {
            y yVar = new y();
            yVar.f3520b = i7;
            yVar.f3523e = ap.b();
            yVar.f3521c = "";
            yVar.f3522d = "";
            yVar.f3525g = ap.c(j5);
            this.f3107c.b(i7);
            this.f3107c.a(yVar);
            if (z10) {
                this.f3111g = j5;
            } else {
                this.f3110f = j5;
            }
            al.c("[UploadManager] Network total consume: %d KB", Long.valueOf(j5 / 1024));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b(int i7) {
        if (p.f3465c) {
            al.c("Uploading frequency will not be checked if SDK is in debug mode.", new Object[0]);
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - a(i7);
        al.c("[UploadManager] Time interval is %d seconds since last uploading(ID: %d).", Long.valueOf(jCurrentTimeMillis / 1000), Integer.valueOf(i7));
        if (jCurrentTimeMillis >= 30000) {
            return true;
        }
        al.a("[UploadManager] Data only be uploaded once in %d seconds.", 30L);
        return false;
    }
}

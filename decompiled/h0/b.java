package h0;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements t0, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static long f6280h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f6281a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6283c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6287g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue f6282b = new PriorityQueue(11, new b4.c(3));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Choreographer f6284d = Choreographer.getInstance();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f6285e = new a();

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    public b(View view) {
        float refreshRate;
        this.f6281a = view;
        if (f6280h == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            f6280h = (long) (1000000000 / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.f6286f = true;
        }
    }

    @Override // h0.t0
    public final void a(s0 s0Var) {
        this.f6282b.add(new w0(1, s0Var));
        if (this.f6283c) {
            return;
        }
        this.f6283c = true;
        this.f6281a.post(this);
    }

    public final boolean b() {
        a aVar = this.f6285e;
        long jA = aVar.a();
        n3.n.P0("compose:lazy:prefetch:available_time_nanos", jA);
        boolean z10 = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.f6282b;
            Object objPeek = priorityQueue.peek();
            i9.l.b(objPeek);
            if (!((w0) objPeek).f6403b.c(aVar)) {
                priorityQueue.poll();
                z10 = false;
            }
            aVar.f6277a = false;
        }
        return z10;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        if (this.f6286f) {
            this.f6287g = j5;
            this.f6281a.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f6286f = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f6286f = false;
        this.f6281a.removeCallbacks(this);
        this.f6284d.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f6282b;
        if (!priorityQueue.isEmpty() && this.f6283c && this.f6286f) {
            View view = this.f6281a;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z10 = System.nanoTime() > (((long) 2) * f6280h) + nanos;
                a aVar = this.f6285e;
                aVar.f6277a = z10;
                aVar.f6278b = Math.max(this.f6287g, nanos) + f6280h;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (aVar.f6277a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.f6284d.postFrameCallback(this);
                } else {
                    this.f6283c = false;
                }
                n3.n.P0("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.f6283c = false;
    }
}
